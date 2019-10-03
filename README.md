# Dots indicator without viewpager

![](https://jitpack.io/v/mazenrashed/DotsIndicatorWithoutViewpager.svg)

Dots indicator to use it without viewpager, You can use it with swipe gestures, buttons, etc..

![](https://media.giphy.com/media/dUs6RgepqKTR0UrEkl/giphy.gif)
###  Add the JitPack repository to your build file
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
### Add dependency
```groovy
dependencies {
    implementation 'com.github.mazenrashed:DotsIndicatorWithoutViewpager:${LAST_VERSION}'
}
```
# Usage
## Layout
Simple usage
```xml
<com.mazenrashed.dotsindicator.DotsIndicator  
  android:id="@+id/dots_indicator"  
  android:layout_width="wrap_content"  
  android:layout_height="wrap_content"  
  app:dots_count="4"  
  />
```

More options
```xml

<com.mazenrashed.dotsindicator.DotsIndicator  
  android:id="@+id/dots_indicator"  
  android:layout_width="wrap_content"  
  android:layout_height="wrap_content"  
  app:dot_height="7dp"  
  app:dot_width="7dp"  
  app:dots_count="4"  
  app:first_dot_height="14dp"  
  app:first_dot_width="14dp"  
  app:first_selected_dot_resource="@drawable/ic_home_white_24dp"  
  app:first_unselected_dot_resource="@drawable/ic_home_gray_24dp"  
  app:selected_dot_resource="@drawable/circle_white"  
  app:unselected_dot_resource="@drawable/circle_gray"  
  app:margins_between_dots="17dp"  
  app:selected_dot_scale_factor="1.4"
  />
```

## Set selection
```kotlin
dotsIndicator.setDotSelection(position)
```
## Select listener
```kotlin
dotsIndicator.onSelectListener = {  
  Toast.makeText(this, "page $it selected", Toast.LENGTH_SHORT).show()  
}
```
## Set or change dots count
```kotlin
dotsIndicator.initDots(dotsCount)
```

## Contributing

We welcome contributions !
* ⇄ Pull requests and ★ Stars are always welcome.

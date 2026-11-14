-keepattributes LineNumberTable,SourceFile
-renamesourcefileattribute SourceFile
-dontobfuscate

-keepclasseswithmembers public class androidx.recyclerview.widget.RecyclerView { *; }
-keep class com.universalauthenticator.app.ui.fragments.preferences.*
-keep class com.universalauthenticator.app.importers.** { *; }
-keep class * extends com.google.protobuf.GeneratedMessageLite { *; }

-dontwarn javax.naming.**

# Questions

- How do you update the count in HelloActivity to display the current value?

I call the `getIntent()`  method in the HelloActivity `HelloActivity` to get the current intent and get the value of the extra with the appropriate key.
I then set the text of the count TextView after getting a handle on it. 

```java
        Intent intent = getIntent();
        int message = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        TextView textView = findViewById(R.id.message_display);
        textView.setText(String.valueOf(message));
```
- How do you add the current value of the count to the intent?

I create a new intent and put the count as an intent extra. 

```java
        Intent intent = new Intent(this, HelloActivity.class);

        intent.putExtra(EXTRA_MESSAGE, count);
        startActivity(intent);
```

- What files are added when you add a new activity called HelloActivity to your
application? What changes are made to existing files?

The files include `HelloActivity.java`, `activity_hello.xml` .
There are also chages made to the `AndroidManifest.xml`, mainly adding in a new `activity` tag which i modified to this;

```xml
        <activity android:name=".HelloActivity"
            android:label="@string/display_hello"
            android:parentActivityName=".MainActivity">
            <meta-data
                android:name="android.support.PARENT_ACTIVITY"
                android:value=".MainActivity" />
        </activity>
```
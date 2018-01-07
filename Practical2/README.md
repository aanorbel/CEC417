# Questions

## Part 1

- What is the name of the package in android that contains all of the standard UI elements?

`android.widget` package.

- What are view IDs? 

This is an id which android uses to uniquely identify views in a particular layout.

- Defining a view in XML is done with: `android:id="@+id/example"` give the functions of the following terms: @, +, id, example.

The @ sign signify that the XML parser should parse and expand the rest of the ID string an identify it as and ID resource, the + sign means that this is a new resource name that must be created if it doesn't already exist and added to our resources( in the R.java file), id means identification and example will be the id name.

## Part 2
- Where do you find the menu xml file in the application project?

`src/main/res/menu/main.xml` 

- What is the difference between TextView and EditText?

The main difference between EditText  and TextView is that EditText is use to editing text while TextView is use for displaying text.

- Give the relationship of association between Button, EditText, and TextView.
they are all android widgets , views. 

- What is the difference between ImageView and ImageButton?

There's no differences, except default style. ImageButton has a non-null background by default.
Also, ImageButton.onSetAlpha() method always returns false, scaleType is set to center and it's always inflated as focusable.

```java
java.lang.Object
↳ android.view.View
   ↳ android.widget.ImageView
       ↳ android.widget.ImageButton
```

# OnChangeTextListener
A small extension to simplify work with the TextChangedListener in Kotlin
### Usage
Unpack zip, copy <code>OnChangeTextListener.kt</code> file to your folder with your scripts. Then just make an instance of Add class, so the syntax will be following: 
<br><code>
  OnChangeTextListener.Add(yourTextInput, ::yourFunction)
</code>
<br>
So that's it, it's just simple as that, I also provided the example with usage and with the code in Example folder and compiled .apk in the build folder, so you can check it out, but I will insert here the code as well with comments:
<pre>
  <code>
    private var changed = 0 //declaration for our variable what will change upon every change

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input = findViewById<EditText>(R.id.inputSample)
        OnChangeTextListener.Add(input, ::onChangeFunction) //add listener to input with onChangeFunction, which is defined lower
    }

    private fun onChangeFunction(){
        changed++ //add 1 after any change
        findViewById<TextView>(R.id.outputSample).text = "Text were changed $changed times" //this will show up the in TextView the number of changes
    }
  </code>
 </pre>

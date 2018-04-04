
## Hiring
[Hiring] This is a product of Empass for hiring correct candidate for your company. Its easly implement in Android.

### Hiring

```java
import com.empass.hiring.initialize.Hiring;

// Your activity must be a subclass of AppCompatActivity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		try {
            Hiring.initializeHiring(this, "your token", "auth type", "Test", "support email");
        } catch (Exception e) {
            LogUtils.errorException(e);
        }
    }
}
```
More information: [empasssdk/hiringdemo](https://github.com/empasssdk/hiringdemo)



```
compile 'com.empass.hiring:hiring:<latest-version>'
```

## Building in Eclipse

![Go home you're drunk](http://img2.wikia.nocookie.net/__cb20130819142928/cardfight/images/thumb/5/55/Go-home-youre-drunk.jpg/500px-Go-home-youre-drunk.jpg)

## Acknowledgements


## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/empasssdk/hiringdemo).

Any contributions, large or small, major features, bug fixes, additional
language translations, unit/integration tests are welcomed and appreciated
but will be thoroughly reviewed and discussed.

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2018 Empass

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

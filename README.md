experiments with file layouts for some hypothetical java project, that uses the 
java module system.

## commands

clean
```sh
  rm -r output
```

compile debug
```sh
  mkdir output/debug/modules
  javac @build/compile @build/source @build/debug
```

compile release
```sh
  mkdir output/release/modules
  javac @build/compile @build/source @build/release
```

compile test
```sh
  mkdir output/debug/modules
  javac @build/compile @build/test @build/debug
```

package : compile release
```sh
  jpackage @build/package
```

run cli : compile debug
```sh
  java @build/run_cli
```

run desktop application : compile debug
```sh
  java @build/run_desktop_application
```

test util : compile test
```sh
  java @build/test_util
```

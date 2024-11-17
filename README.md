A minimal repro for re-frame [issue 809](https://github.com/day8/re-frame/issues/809) that will hang a process any of the following are run from the command line:

```shell
clj -M -m core
```

```shell
clj -X:test
```
 
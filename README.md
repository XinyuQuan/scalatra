# Scalatra框架学习 #

## Build & Run ##

```sh
$ sbt new scalatra/scalatra.g8
$ cd 新建的目录
$ sbt
> jetty:start
> browse
```

## JRebel ##
下载JRebel并激活之后，在sbt.cmd/sh的JAVA_OPT添加-agentpath:"JREBELHOME\\lib\\jrebel64.dll"

之后启动使用~jetty:start

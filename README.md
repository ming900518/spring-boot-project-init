# Spring Boot Project Initializer

主要是覺得每次都要跑到 https://start.spring.io 選老半天很麻煩，乾脆自己做一個

有加入幾個我自己常用的dependency，然後Project, Language, Spring Boot版本, GroupId, Packaging跟Java版本都預設填好了

## 如何使用

第一步當然是把project run起來，接著打開你的瀏覽器，在網址列中輸入

```
http://localhost:8080/starter.zip?type=gradle-project

```

後面輸入你的aritfactId

```
&artifactId=imalazyguy
```

接著再輸入你想裝的dependency

```
&dependencies=
```

目前有actuator,web,webflux,mybatis,mariadb,security,devtools這幾種可以選，之後如果我有用到其他的會再加進來

按下Enter，沒意外你就會得到一個壓縮檔，解壓縮後就是你的project了。

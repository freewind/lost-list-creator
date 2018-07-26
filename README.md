The Lost List Creator
=====================

Provide a simple list creator which has been missing for years.

Usage is quite easy:

```
Lists.emptyArrayList();

Lists.arrayList("hello", "world");

Lists.arrayList(new String[]{"hello", "world"});

Lists.arrayList(otherList/otherSet/otherCollection);

Lists.copy(otherList);

Lists.arrayListFilled(3, "*");
```

Also same api for `LinkedList`.

All the return Types are `java.util.ArrayList`.

That's all.

Use in maven
------------

```
<repositories>
    <repository>
      <id>jcenter</id>
      <url>https://jcenter.bintray.com/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>freewind.github</groupId>
        <artifactId>lost-list-creator</artifactId>
        <version>0.5.0</version>
    </dependency>
</dependencies>
```

or in gradle:

```
repositories {
    jcenter()
}

dependencies {
    compile 'freewind.github:lost-list-creator:0.5.0'
}
```

License
-------

Apache License 2.0

Why this lib?
-------------

I'm tired of finding a way to create a normal `java.util.ArrayList` with some items, in just one method call.

Yes, there are many ways to do it, e.g. :

### multi lines

```
List<String> list = new ArrayList<String>();
list.add("hello");
list.add("list");
```

### at least two methods calls

```
new ArrayList<String>(Arrays.asList("A", "B", "C"));
```

### import a big [Guava](https://github.com/google/guava) library just for it:

```
Lists.newArrayList("Mike", "John", "Lesly");
```

(You can find more examples [in this stackoverflow question](https://stackoverflow.com/questions/858572/how-to-make-a-new-list-in-java))

I just want a simpler way.



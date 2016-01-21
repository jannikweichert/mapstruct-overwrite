This project is to demonstrate that MapStruct overwrites Collections.
====================================================================

I expected, that I can bypass this behaviour simply by creating a setter-method. 
But the setter is ignored. 

Execute
--------
Run mvn test

Generated code which causes the behaviour:
------------------------------------------

```java
 if ( foo.getElements() != null ) {

    foo.getElements().clear();

    foo.getElements().addAll( fooDTO.getElements() );
}
```

Expected code:
------------------------------------------
```java
foo.setElements(fooDTO.getElements())
```
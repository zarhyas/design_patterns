# design_patterns

## Overview

- The beans layer (e.g. Employee) will interact directly with the database.
- The service layer contains business logic and interacts with the model.
- The view is responsible for interactions with the client, e.g. UI, REST API.

## DP1 - Singleton

When to use?
- Resources are expensive to create (DB connection objects)
- Classes which provide config settings for the app
- Classes that contain resources that are accessed in shared mode


Another way to use it (which doesn't require synchronization) is the following:

```java
public class Singleton  {    
  private Singleton() {}

  private static class SingletonHolder {    
  public static final Singleton instance = new Singleton();
  }

  public static Singleton getInstance() {    
  return SingletonHolder.instance;    
  }
 }
```


## DP2 - Factory

- Don't touch DAO

## DP3 - Prototype

- The new object is slightly different from the existing one
- if only the state is different, then we can create the instances with the appropriate state beforehand and
then clone them whenever we want.

## DP4 - Builder

- Creating an object is complex or the client expects different representations for the object that's constructed.


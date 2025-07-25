#throw keyword:
explicitely throw an exception from code
syntax:
throw new ExceptionsType("msg")

#thows keyword:its a method signature to declare that a method may throw a exceptions.
Syntax:
 public void readFile() throws IOExceptions{}

Classic Hierarchy for exception
Throwable
    Error
    Exceptions
    ChechedException:IOExceptions,sQLeXCEPTION
    UnchecckedException:ARITHMETICeXCEPTION,nULLpOINTER


    object: top of all classes but it is not specially for exception
    Exception :is a subclass of Throwable
    Throwable: is superclass of all exception
    runtime exception:subclass of exception

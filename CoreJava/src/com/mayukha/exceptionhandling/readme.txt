java.lang.Object
   └── java.lang.Throwable
         ├── Error (Serious problems, not meant to be handled)
         │     ├── OutOfMemoryError
         │     ├── StackOverflowError
         │     └── VirtualMachineError
         │
         └── Exception (Can be handled in code)
               ├── Checked Exceptions (compile-time)
               │     ├── IOException
               │     │     └── FileNotFoundException
               │     ├── SQLException
               │     ├── ClassNotFoundException
               │     ├── InterruptedException
               │     └── InstantiationException
               │
               └── Unchecked Exceptions (runtime)
                     ├── RuntimeException
                           ├── ArithmeticException
                           ├── NullPointerException
                           ├── ArrayIndexOutOfBoundsException
                           ├── NumberFormatException
                           ├── IllegalArgumentException
                           ├── ClassCastException
                           └── IllegalStateException

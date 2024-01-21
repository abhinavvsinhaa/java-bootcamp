# Datatypes

## Primitive data types

There are primarily four types of primitive data types in Java, which are:

- Integer: byte, short, int, long
- Float: float, double
- Character
- Boolean

### Sub types and their ranges

1. Integer
   - long: 8 bytes: [-2^63, 2^63 - 1]
   - int: 4 bytes: [-2^31, 2^31 - 1]
   - short: 2 bytes: [-2^15, 2^15  - 1]
   - byte: 1 byte: [-2^7, 2^7 - 1]

2. Float
    - float: 4 bytes 
    ```float num = 5.6f // (since default is double) ```
    - double: 8 bytes 
    ```default value for decimal values```

3. Char: 2 bytes (Unicode, instead of ASCII)
    ```char ch = 'k'```

4. Boolean: true/false (we can't use 1/0 like other languages)
   ```boolean isPaid = true```

Extras:
```
// binary values
int num = 0b101;

// hex values
int hex = 0x7E;

// for better understanding of number of zeroes
int num = 10_00_000;

// exponential 
double num = 12e10; // equivalent to 1.2E11
```

### Type conversion, casting and promotion

Manual conversion of one type to another is called <b>`type casting`</b>.
```
int a = 256;
byte b = (byte) a; // Will perform modulo operation, i.e a % BYTE_SIZE (256 = 128 - (-128))
```

Automatic conversion is called <b>`type conversion`</b>

When a certain data type cannot withold the result of any operation, it is promoted to the next bigger type.
```
    byte a = 10;
    byte b = 30;
    int result = a * b; // since byte range -128 to +127, so to store 300 we've to use int, which can store 300 
```
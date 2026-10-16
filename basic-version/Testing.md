# Testing Documentation

## Overview

This document contains the test cases used to verify the functionality of the basic Caesar Cipher implementation in Java.

| **Test Case** | Input | Shift | Expected Output |
|---|---|---|---|
| Basic encryption | Hello | 3 | Khoor |
| Alphabet wrap-around | XYZ | 3 | ABC |
| Spaces between words | Hello World | 3 | Khoor Zruog |
| Uppercase letters | ABC | 2 | CDE |
| Lowercase letters | abc | 2 | cde |
| Zero shift | Hello | 0 | Hello |
| Full alphabet shift | Hello | 26 | Hello |

## Testing Method

Each test case is executed manually by providing the input text and shift value to the program. The actual output is compared with the expected output.


## Results

Test results should be recorded after executing each test case.

🟢PASS: Actual output matches expected output.

🔴FAIL: Actual output differs from expected output.

## Limitations

•Testing is performed manually.

•Automated unit tests are not included in this version.

•Input validation and special-character handling depend on the current implementation.

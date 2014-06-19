
Write a function (interleave), that takes in an arbitrary number of arrays of integers, and returns a single array of integers. The resultant array should be the interleaving of the argument arrays.

A couple examples are:
interleave([1,2,3], [4,5], [6,7,8]) -> [1,4,6,2,5,7,3,8]
interleave([1], [2], [3], [4,5,6,7]) -> [1,2,3,4,5,6,7]

Note that you must work with arrays of integers and not lists, so the only thing you are allowed to do with the argument and result arrays are indexing (a[0]), setting a value (a[1] = 1), and getting the length.

You may implement this in any language you like, so long as the language supports native arrays (and you only perform indexing, setting, and length operations on those arrays).

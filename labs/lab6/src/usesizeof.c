#include <stdio.h>
#include <stdbool.h>

int main() {

    int intVar;
    short shortVar; 
    long longVar;
    long long longLongVar;

    float floatVar;
    double doubleVar;
    long double longDoubleVar;

    char charVar;
    _Bool boolVar;

    printf("Size of short: %d bytes\n",sizeof(shortVar));
    printf("Size of int: %d bytes\n",sizeof(intVar));
    printf("Size of long: %d bytes\n",sizeof(longVar));
    printf("Size of long long: %d bytes\n",sizeof(longLongVar));
    printf("\n");

    printf("Size of float: %d bytes\n",sizeof(floatVar));
    printf("Size of double: %d bytes\n",sizeof(doubleVar));
    printf("Size of long double: %d bytes\n",sizeof(longDoubleVar));
    printf("\n");

    printf("Size of _Bool: %d byte\n",sizeof(boolVar));
    printf("\n");

    printf("Size of char: %d byte\n",sizeof(charVar));
    printf("\n");
    
    return 0;

}

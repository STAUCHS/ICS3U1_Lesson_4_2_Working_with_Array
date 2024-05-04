# 4.2 Working With Arrays

* [Arrays as Reference Data Types](https://github.com/SACHSTech/ICS3U1_lesson_4_2_WorkingWithArrays/main/README.md#arrays-as-reference-data-types)
* [Processing Arrays with Loops](https://github.com/SACHSTech/ICS3U1_lesson_4_2_WorkingWithArrays/blob/main/README.md#processing-arrays-with-loops)
  * [Reading Values](https://github.com/SACHSTech/ICS3U1_lesson_4_2_WorkingWithArrays/blob/main/README.md#reading-in-values)
  * [The length field](https://github.com/SACHSTech/ICS3U1_lesson_4_2_WorkingWithArrays/blob/main/README.md#the-length-field)
  * [Outputting Values](https://github.com/SACHSTech/ICS3U1_lesson_4_2_WorkingWithArrays/blob/main/README.md#outputting-an-array-with-a-loop)
  * [Modifying Values](https://github.com/SACHSTech/ICS3U1_lesson_4_2_WorkingWithArrays/blob/main/README.md#modifying-values)
  * [Summing an Array](https://github.com/SACHSTech/ICS3U1_lesson_4_2_WorkingWithArrays/blob/main/README.md#summing-an-array)
  * [Searching an Array](https://github.com/SACHSTech/ICS3U1_lesson_4_2_WorkingWithArrays/blob/main/README.md#searching-an-array)



## Arrays as Reference Data Types
Arrays in Java are reference data types.  This means that, like objects, the array variable holds a reference to the data in the array, not the arrays' data itself.

Consider an array temperatures.  The variable temperatures is a reference to the data.

```
public class Example1 extends ConsoleProgram {

    public void run() {
      
      int[] temperatures1 = {5, -1, -3, 4, 2};
      int[] temperatures2 = {7, 6, 5, 8, 7};

      temperatures2 = temperatures1;
      System.out.println(temperatures1[1]);
      System.out.println(temperatures2[1]);
    }
}
```

![](4_2_fig1.png)

I can change my second list to refer to the first:
```
temperatures2 = temperatures1;
```
![](4_2_fig2.png)

The effect of this is temperature1 & 2 now refer to the same array.  The result of the program above is 
```
-1
-1
```

## Processing Arrays with Loops

### Example2.java
```
public class Example2 extends ConsoleProgram {

  public void run() {
    
    int[] marks = new int[5];
    int total;
    double average;
    
    // read in the values
    for (int index = 0; index < 5; index++){
      marks[index] = readInt("Enter a mark: ");
     }

    System.out.println("\nThere " + marks.length + " elements in the array.\n");

    // output the marks
    for(int index = 0; index < marks.length; index++){
      System.out.println("mark " + (index+1) + ": " + marks[index]);
    }

    // apply a 2 mark boost
    for (int index = 0; index < marks.length; index++){
      marks[index] = marks[index] + 2;
    }

    System.out.println("");
    System.out.println("*** Marks with 2+ boost ***");

    // output the marks with the boost
    for(int index = 0; index < marks.length; index++){
      System.out.println("mark " + (index+1) + ": " + marks[index]);
    }

    // compute the average using the total marks
    total= 0;
    for(int index = 0; index < marks.length; index++){
        total = total + marks[index];
    }
    
    average = (double)total/marks.length;
    System.out.println("\nThe average of the class is " + average);  

    // search the array for mark
    searchMark = readInt("Enter the mark to search: ");

    for (int i = 0; i < marks.length; i++){
      if(marks[i] == searchMark){  //check the mark in the current position
        System.out.println(searchMark + " found in position " + i);
        markfound = true;
        break;
      }
    }

    if (!markfound){
      System.out.println("Mark not found");
    } 

  }
}
```


### Reading in Values
We've seen that we can initialize array elements with an initializer.  We can also use user input to set element values:

```
    int[] marks = new int[5];
    
    for (int index = 0; index < 5; index++){
      marks[index] = readInt("Enter a mark: ");
     }
```

### The `length` field
The `length` field is a special property of an array that we call when we want to know the size (how many elements) of the array.
```
System.out.println("There " + marks.length + " elements in the array.");
```

### Outputting an Array with a Loop
Using the length field we can use a loop to iterate through the array and print each element:
```
    // output the marks
    for(int index = 0; index < marks.length; index++){
      System.out.println("mark " + (index+1) + ": " + marks[index]);
    }
```

### Modifying Values
We can use a loop to iterate an array and modify each element.  For example, we want to give each mark a 2 mark boost.
```
    // apply a 2 mark boost
    for (int index = 0; index < marks.length; index++){
        marks[index] = marks[index] + 2;
        //marks[index] += 2;
    }
```

### Summing an Array
We can compute a total of an array in order to compute the average.
```
    // compute the average using the total marks
    total= 0;
    for(int index = 0; index < marks.length; index++){
        total = total + marks[index];
    }
    
    average = (double)total/marks.length;
    System.out.println("\nThe average of the class is " + average);    
```

### Searching an Array
We can apply basic conditions in a our loop to search the array.  By using a loop to iterate through the array, we can check each element until we find it.  This type of search is called a **linear search**

```
    // search the array for mark
    searchMark = readInt("Enter the mark to search: ");

    for (int i = 0; i < marks.length; i++){
      if(marks[i] == searchMark){  //check the mark in the current position
        System.out.println(searchMark + " found in position " + i);
        markfound = true;
        break;
      }
    }

    if (!markfound){
      System.out.println("Mark not found");
    }
```


 	












# Student sorting/searching program assignment for ADT & Problem Solving subject
## A program that reads class_roaster67.csv file and let you sort student data or search for student's first name
This is the step-by-step guide to use this program.

1. **Download StudentDataProgram.java and class_roaster67.csv, which are attatched to this repository**
2. **(Optional) Move the 2 files earlier to your desired folder**
3. **Open Command Prompt or your choice of CLI program**
4. **Change directory to where you downloaded the files:** In your CLI program, from now on will be called as CMD, type in `cd ` and your folder destination where you store 2 files earlier. You can copy the folder directory in file explorer.
5. **After the CMD directory changed accordingly, compile StudentDataProgram.java using the following code:**
    ```bash
    javac StudentDataProgram.java
    ```
6. **Run the program:** Before actually running it, there are 2 argument formats<br>
    1. **Sorting format:** This format requires 2 arguments as follows
        ```bash
        java StudentDataProgram [sorting operation] class_roaster67.csv
        ```
        **Available operations are**
        - Sorting by SID: Sort Student data by Student ID. To call this operation, use `-n`<br>
        Example image: ![SortBySID](https://drive.google.com/uc?export=view&id=1ZGH30yh7iNzUMCdlR5IiYws2ZDvFVUxy)

        - Sorting by First name: Sort Student data by First name. To call this operation, use `-f`<br>
        Example image: ![SortByFirst](https://drive.google.com/uc?export=view&id=1N4D_EX5yTF4x9eiEOUmRWIs5ufiwIIE-)

        - Sorting by Last name: Sort Student data by Last name. To call this operation, use `-l`<br>
        Example image: ![SortByLast](https://drive.google.com/uc?export=view&id=1a9B6pHsHqVMWzML_ahWBGSMpZt2vyX5S)

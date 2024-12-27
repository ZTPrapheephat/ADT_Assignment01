# Student sorting/searching program assignment for ADT & Problem Solving subject
## A program that reads class_roaster67.csv file and let you sort student data or search for student's first name
This is the step-by-step guide to use this program.

1. **Download StudentDataProgram.java and class_roaster67.csv(optional if using your own identical(?) class_roaster67.csv file), which are attatched to this repository**
2. **(Optional) Move the 2 files earlier to your desired folder**
3. **Open Command Prompt or your choice of CLI program**
4. **Change directory to where you downloaded the files:** In your CLI program, from now on will be called as CMD, type in `cd ` and your folder destination where you store 2 files earlier. You can copy the folder directory in file explorer.
5. **After the CMD directory changed accordingly, compile StudentDataProgram.java using the following code:**
    ```bash
    javac StudentDataProgram.java
    ```
6. **Run the program:** Before actually running it, there are 2 argument formats<br>
    1. **Sorting format:** This format requires 2 arguments as follows
        
        > java StudentDataProgram [sorting operation] [class_roaster67.csv]
    
        (class_roaster67.csv is already a correct argument. No need to do anything about it.)
       
        **Available operations are**
        - Sorting by SID: Sort Student data by Student ID. To call this operation, use `-n`
            ```bash
            java StudentDataProgram -n class_roaster67.csv
            ```
            <p style="margin-bottom: 20px;">Example image: <br></p>
                <img src="https://drive.google.com/uc?export=view&id=1ZGH30yh7iNzUMCdlR5IiYws2ZDvFVUxy" width="700" />

        - Sorting by First name: Sort Student data by First name. To call this operation, use `-f`
            ```bash
            java StudentDataProgram -f class_roaster67.csv
            ```
            <p style="margin-bottom: 20px;">Example image: <br></p>
                <img src="https://drive.google.com/uc?export=view&id=1N4D_EX5yTF4x9eiEOUmRWIs5ufiwIIE-" width=700 />

        - Sorting by Last name: Sort Student data by Last name. To call this operation, use `-l`
            ```bash
            java StudentDataProgram -l class_roaster67.csv
            ```
            <p style="margin-bottom: 20px;">Example image: <br></p>
                <img src="https://drive.google.com/uc?export=view&id=1a9B6pHsHqVMWzML_ahWBGSMpZt2vyX5S" width=700 />

    <p style="margin-bottom: 20px;">If providing invalid argument, the program will return the error as follows<br></p>
            <img src="https://drive.google.com/uc?export=view&id=1hRzPFsq5OP8eKLbydTIqhI9Y_G9wxWqe" width=700 />
            
    Providing incorrect file name also returns error, but it's error of Java which I tried fixing but didn't work properly so I decided to not focus on this issue further.

    2. **Searching format:** This format requires 3 argument is follows
        
        > java StudentDataProgram [-s] [class_roaster67.csv] [first name]

        (-s and class_roaster67.csv are already the correct arguments. No need to do anything about them)

        The name you search is case-insensitive, means if the name matches, regardless of lowercases or uppercases, it should work properly.

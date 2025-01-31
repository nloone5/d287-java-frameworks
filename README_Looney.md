<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS


### Requirement C
Changed title to "Looney's Cars" at line 14
Changed h1 field to "Looney's Cars" at line 19
Changed h2 field to "Cars" at line 53

### Requirement D
Added file about_page.html where I used the mainscreen.html
as a slight template, taking out everything past the initial
h1 property, and replacing it with multiple h2 and p
components from lines 21 through 30, changing the title
and h1 on lines 14 and 19, respectively. Added AboutController
file, adding a Controller to the About Us page. Added a button to
About Us page at line 89 in mainscreen.html.
Added button to Home in about_us.html at line 31.

### Requirement E
Fulfilled requirement E by adding 5 products and 5 parts to BootStrapData.java.
5 parts were added from lines 58 through 123, and new products were added from lines 133 through 145.
An if statement surrounds the parts additions as well as the products to ensure they are only added
if the current amount in the repositories are 0. Also fixed minor errors with the links to Home and About Us.

### Requirement F
Fulfilled requirement F by adding a Buy Now button in mainscreen.html at line 85,
adding the buyProduct component in AddProductController.java on lines 180-193,
and adding failure.html as well as success.html to handle the product purchase
success and failure messages.

### Requirement G
Fulfilled requirement G by editing Part.java to add the ValidInventory validator to line 24,
add the minInv and maxInv @Min's at lines 34-37, and the getter and setters for them at lines 100 through 115.
I edited mainscreen.html to add Min Inv and Max Inv columns to the parts table at lines 38-39 and 48-49.
Then I edited BootStrapData.java to set the minInv and maxInv for each part at lines 65-66, 79-80,
93-94, 107-108, and 121-122. I updated InhousePartForm.html to include the Min Inventory and Max Inventory
fields at the bottom of the form, display any errors, as well as add labels to the left of each input for convenience
at lines 16, 18, 21, and from 26 to 39. I did the same to OutsourcedPartForm.html at lines 17, 19,
22 and from 27 to 40. I created InventoryValidator.java and in the isValid method, used an if-else if
statement to check if the updated inventory is less than the minimum or greater than the maximum and return false
if either are true from lines 30-39. I created the ValidInventory.java to connect with the InventoryValidator.java
to throw the "Inventory Error!" message when needed. Lastly I updated line 6 of application.properties
to LooneyDatabaseV_4.

### Requirement H
Fulfilled requirement H by editing EnufPartsValidator.java to include an if statement on
line 37 checking if the parts inventory would be less than the minimum inventory if it were
to be decreased. The validator then triggers an error message if the inventory would be too low,
otherwise it decreases the part inventories in tandem with the product addition(s).

### Requirement I
Fulfilled requirement I by editing PartTest.java to add testMinInv and testMaxInv on lines 159 to 182.
Each unit test tested both Inhouse Parts and Outsourced Parts to ensure both work as intended.

### Requirement J
Fulfilled requirement J by deleting DeletePartValidator.java as it has no usages throughout the application.
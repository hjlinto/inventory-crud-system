**Change Log for D287 Performance Assessment**

_(Prompt, file name, line number, change)_

C.

    mainscreen.html

        Line 14: Title updated to "Bow and Bridge"
        
        Line 19: Header 1 updated to "Bow and Bridge"

        Line 21: Header 2 changed to "Acccessories"

        Line 53: Header 2 changed to "Instruments"

D.

    about.html

        Lines 1 to 15: Adopted from the beginning of mainscreen.html to remain consistent with design choices.
    
        Line 14: Altered to change the title to reflect this is the About page for Bow and Bridge.
        
        Line 19: Changed Header 1 to specify this is the About page on Bow and Bridge's.

        Line 21: Inserted button linked to mainscreen.html labeled "Main"

        Line 22: Added to demaracate area for navigation buttons
        
        Line 23: Altered to create a subheading welcoming customers.
        
        Line 24 to 35: The about us description was broken up into a few paragraphs.

    mainscreen.html
        
        Line 21: Inserted button linked to about.html labeled "About"

        Line 22: Added to demaracate area for navigation buttons

    AboutCountroller.java

        Lines 6 - 7: Defined controller class.

        Lines 9 - 11: Mapped About URL to the about() method.

E.

    BootStrapData.java
        
        Lines 2 and 6: Added to grant access to the InHouse domain/repository.
        
        Line 28: Declared private final ProductRepository productRepository; to let Spring inject an instance of ProductRepository so I can use its methods.
        
        Line 30: Updated the constructor to include InHousePartRepository so this class can use the methods from each.

        Line 33 and 34: Assigned the injected instances to their respective classes to enable access to their repository methods.

        Line 40: Implemented an if statement to check if the partRepository AND productRepository are empty. If they are, the following block of code is run.

        Lines 41 - 63: Created 3 objects (parts relabeled as accessories on mainscreen.html) and listed their properties, which were then saved to the outsourcedPartRepository.

        Lines 65 - 77: Created 2 objects (parts relabeled as accessories on mainscreen.html) and listed their properties, which were then saved to the inhousePartRepository.

        Lines 85 - 94: Updated with 5 objects (products relabeled as instruments on mainscreen.html) and listed their properties, which were then saved to the productRepository.
F.
    
    mainscreen.html
        
        Line 87: Added Buy Now button to the right of Update/Delete buttons with a different color to distinguish it.

    ProductController.Java

        Lines 1 - 20: Created a new Controller for "Buy Now" button on mainscreen.html.

        Lines 23 - 35: Implemented feature to subtract 1 product from the inventory if that product is available. If this occurs, the user is sent to purchasesuccess.html, but if it fails they're sent to purchaseError.html.

    purchaseSuccess.html

        Lines 1 - 10: Designed a webpage that acts as confirmation to the user that their purchase was successful when they clicked the "Buy Now" button on mainscreen.html.
        
        Line 8: Included a return to mainscreen button.

    purchaseError.html

        Lines 1 - 10: Designed a webpage that notifies the user that their purchase was unsuccessful and the product is out of stock when they clicked the "Buy Now" button on mainscreen.html.
        
        Line 8: Included a return to mainscreen button.
G.

H.

I.

J.


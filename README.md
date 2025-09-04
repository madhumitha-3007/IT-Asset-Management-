# IT Asset Management (Assignment Q24 - Roll No: 24)

Console-based IT Asset Management app developed in **Java** using OOP concepts.  

---

## Features
- Register employees and IT assets (Laptop, Phone, Monitor)  
- Assign, return, and retire assets  
- Track lifecycle: `IN_STOCK → ASSIGNED → RETURNED → RETIRED`  
- Generate audit reports  

---

## OOP Concepts
- **Encapsulation** – private fields, getters & setters  
- **Inheritance** – Laptop, Phone, Monitor extend Asset  
- **Polymorphism** – handled via List<Asset>  
- **Overloading** – assignAsset() by employeeId or Employee  
- **Overriding** – display() and depreciation()  

---

## How to Run
1. Clone this repo or download ZIP  
2. Import into Eclipse  
3. Run `AssetAppMain.java`  
4. View results in console  

---

## Sample Output

Employee registered: Alice
Employee registered: Bob
Asset registered: L001
Asset registered: P001
Asset registered: M001
Asset L001 assigned to Alice
Asset P001 assigned to Bob
Asset L001 returned.
Asset M001 retired.
---- Audit Report ----
Asset ID: L001, Type: Laptop, Model: Dell XPS, Status: RETURNED
Specs: 16GB RAM, Processor: Intel i7
Asset ID: P001, Type: Phone, Model: iPhone 14, Status: ASSIGNED, Assigned To: Bob
Specs: iOS, Storage: 128GB
Asset ID: M001, Type: Monitor, Model: Samsung, Status: RETIRED
Specs: 27 inch display




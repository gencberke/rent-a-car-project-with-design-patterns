### School Projects

## Rent a Car System (Advanced)
- Note: This project made for educational purposes.

An advanced project demonstrating **software architecture + design patterns** in a real-world scenario.  
Implemented with **Layered Architecture** and developed using **Scrum methodology**.

### Functional Features
- Vehicle search, filtering, reservation, direct rental
- Online payment (credit card, PayPal)
- Role-based operations (admin, manager, staff)
- Transaction logging

### Applied Design Patterns
- Factory, Bridge, Proxy, Decorator, Iterator  
- Strategy, Visitor, Observer

## 📂 Project Structure
```bash
├──rent-a-car-project/
  │
  ├── src/
  │   ├── Main.java
  │   │
  │   ├── model/
  │   │   ├── Arac.java
  │   │   ├── Musteri.java
  │   │   ├── Kullanici.java
  │   │   └── Abonelik.java
  │   │
  │   ├── service/
  │   │   ├── RezervasyonOnaylamaStrategy.java
  │   │   ├── Odeme.java
  │   │   ├── OdemeFactory.java
  │   │   ├── AracServisiProxy.java
  │   │   └── SistemGozlemcisi.java
  │   │
  │   ├── business/
  │   │   ├── CarExtensionsDecorator.java
  │   │   ├── MaintenanceBillCalculator.java
  │   │ 
  │   └── data/
  │       └── AracKoleksiyonu.java
  │
  ├── rentacar_project.iml
  └── README.md

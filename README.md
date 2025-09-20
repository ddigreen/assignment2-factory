# Assignment 2 — Factory Method & Abstract Factory (Java)

Implements:
- **Factory Method** for logistics (`Logistics` creators, `Transport` products).
- **Abstract Factory** for GUI families (`GUIFactory` creates `Button` & `Checkbox` for Win/Mac/Linux).

## Clean Code highlights
- Meaningful names, no setters on products.
- Single Responsibility: factories create; products deliver/render.
- Open-Closed: add transport or GUI family without touching client.
- Dependency inversion: client depends on abstractions (`Transport`, `GUIFactory`).

## UML
- `uml/factory-method.puml`
- `uml/abstract-factory.puml`


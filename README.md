### February 1, 2023 - Binary Search Tree (BST)

Properties of the Abstract Data Type (ADT) BST

- Each node may have at most 2 children
- Properties of childe nodes:
  - Left child value is less than the parent value
  - Right child value is greater than, or equal to, the parent value

Behaviors

- Insert data
- Find data
- ~~Delete data~~
- Traversals
  - [pre]order
  - [in]order
  - [post]order

#### How can we implement BSTs?

- Node based tree
- ~~Array based tree~~

#### Implementation plan for node based tree

- Node class
  - Properties (fields): value, left child, right child
  - Operations (methods):
    - constructor: initializes data value
    - insert
    - find
    - traversals
- Tree class
  - Properties (fields): root, size, height
  - Operations (methods):
    - constructor
    - insert
    - find
    - traversals
- Test???
  - main
  - unit tests

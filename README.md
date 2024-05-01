# Data Structure Implementations

This README provides an overview of the various data structure implementations included in this project. Each implementation follows specific logic principles and is designed for different use cases.

## Stack Implementations

In this project, I have implemented the stack data structure using both an array and a linked list. The stack follows the Last In First Out (LIFO) logic, which means the most recently added element is the first one to be removed. Below are the specific implementations:

- **Vector Stack:** Utilizes a dynamic array to manage elements. This implementation allows for efficient addition and removal of elements from the end of the array.
- **Linked List Stack:** Uses a singly linked list where elements are added and removed from the head of the list, ensuring efficient operations without the need for resizing.

## Queue Implementations

The queue data structure has been implemented using arrays and linked lists. Queues operate on the First In First Out (FIFO) principle, where the first element added is the first one to be removed. The implementations are as follows:

- **Array Queue:** Implements a queue using a static-sized array, with elements enqueued and dequeued from predefined start and end points.
- **Circular Array Queue:** Enhances the array queue by allowing the end of the array to wrap around to the beginning, maximizing space utilization.
- **Linked List Queue:** Utilizes a singly linked list where elements are added at the tail and removed from the head, maintaining a consistent operation time.

## List Implementations

The current implementations include additional list logic in both array and linked list formats. This allows for the addition and removal of elements at any position within the data structure. This flexibility is beneficial for various applications where access to any element is required without the constraints of strict LIFO or FIFO operations.

### Linked List Implementation Details

For the linked list implementation, I have chosen a design that features a head pointer which points to a dummy node. This dummy node simplifies certain operations by providing a non-null area to reference at the beginning of the list. The cursor, on the other hand, is used to point to the current element during traversal, but it does so by pointing to the node immediately preceding the current element. This arrangement makes operations such as insertion and extraction more straightforward because the cursor always refers to the node from which the next operation will proceed, allowing easy access to the subsequent nodes without additional traversal or adjustment.
![Linked List Explanation](/image/img.png)

# Project Documentation

This document includes basic UML diagrams from which I started my implementations. Therefore, they may not be entirely accurate as the final implementations have evolved. 

## STACK UML
This is the initial UML diagram for the stack implementation.

![STACK UML Diagram](/image/StackUML.svg)



## QUEUE UML
This is the initial UML diagram for the queue implementation.

![QUEUE UML Diagram](/image/QueueUML.svg)



## LIST UML
This is the initial UML diagram for the list implementation.

![LIST UML Diagram](/image/ListUML.svg)



## Dependencies

This project requires the following libraries:

- ObjectCloner.jar




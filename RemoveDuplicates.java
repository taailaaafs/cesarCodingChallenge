/* Created by Taila on 15/06/2020
-----------------------------------------------------------------------------------------------------
Remove duplicates on email thread:

When different email clients are used on a same thread, the discussion get messy
because old messages are included again and get duplicated. Given a email thread
(represented by a singly unsorted linked list of messages), write a function that
remove duplicated messages from it.
------------------------------------------------------------------------------------------------------
 */

package src;


public class RemoveDuplicates {
	
		static Node position;
		private Node dup; 

		static class Node { 

			int data; 
			Node next; 

			Node(int d) { 
				data = d; 
				next = null; 
			} 
		} 

		// Function to remove duplicates
		
		void remove_duplicates() { 
			Node ptr1 = null, ptr2 = null;
			dup = null; 
			ptr1 = position; 

			while (ptr1 != null && ptr1.next != null) { 
				ptr2 = ptr1; 

				// Compare the picked element with the other elements
				while (ptr2.next != null) { 

					// Delete when is duplicated
					if (ptr1.data == ptr2.next.data) { 

					
						dup = ptr2.next; 
						ptr2.next = ptr2.next.next; 
						System.gc(); 
					} 
					else{ 
						ptr2 = ptr2.next; 
					} 
				} 
				ptr1 = ptr1.next; 
			} 
		} 

		void printList(Node node) { 
			while (node != null) { 
				System.out.print(node.data + " "); 
				node = node.next; 
			} 
		} 

		public static void main(String[] args) { 
			RemoveDuplicates list = new RemoveDuplicates(); 
			RemoveDuplicates.position = new Node(28); 
			RemoveDuplicates.position.next = new Node(30); 
			RemoveDuplicates.position.next.next = new Node(14); 
			RemoveDuplicates.position.next.next.next = new Node(28); 
			RemoveDuplicates.position.next.next.next.next = new Node(56); 
			RemoveDuplicates.position.next.next.next.next.next = new Node(11); 
			RemoveDuplicates.position.next.next.next.next.next.next = new Node(56);
			RemoveDuplicates.position.next.next.next.next = new Node(30); 
			RemoveDuplicates.position.next.next.next.next.next = new Node(11); 
			RemoveDuplicates.position.next.next.next.next.next.next = new Node(14); 

			System.out.println("Lista inicial: "); 
			list.printList(position); 

			list.remove_duplicates();  
			System.out.println("\nLista com valores duplicados removidos: "); 
			list.printList(position); 
		} 
	} 
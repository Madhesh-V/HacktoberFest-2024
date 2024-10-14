#include <iostream>
using namespace std;

// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        if (head == nullptr || head->next == nullptr) {
            return head;
        }
        ListNode* slow = head;
        ListNode* fast = head;
        // Move fast pointer two steps and slow pointer one step at a time
        while (fast != nullptr && fast->next != nullptr) {
            slow = slow->next;
            fast = fast->next->next;
        }
        return slow;
    }
};

// Helper function to create a linked list from an array
ListNode* createLinkedList(int arr[], int size) {
    if (size == 0) return nullptr;
    ListNode* head = new ListNode(arr[0]);
    ListNode* current = head;
    for (int i = 1; i < size; i++) {
        current->next = new ListNode(arr[i]);
        current = current->next;
    }
    return head;
}

// Helper function to print the linked list from a given node
void printLinkedList(ListNode* node) {
    while (node != nullptr) {
        cout << node->val << " ";
        node = node->next;
    }
    cout << endl;
}

int main() {
    // Sample input
    int arr[] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    // Create the linked list
    ListNode* head = createLinkedList(arr, size);

    // Create an instance of the Solution class
    Solution solution;

    // Find the middle node
    ListNode* middle = solution.middleNode(head);

    // Print the value of the middle node
    cout << "Middle node value: " << middle->val << endl;

    return 0;
}

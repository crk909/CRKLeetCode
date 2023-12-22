package org.example

class ListNode(var `val`: Int, var next: ListNode? = null) {
}
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?, i: Int = 0): ListNode? {
        if(l1 != null && l2 != null) return ListNode((l1.`val` + l2.`val` + i)%10, addTwoNumbers(l1.next, l2.next, (l1.`val` + l2.`val` + i)/10))
        if(l1 == null && l2 == null) {
            if (i > 0) return ListNode(i)
            return null
        }
        else if(l2 == null) {
            if (i == 0) return l1
            else return ListNode((l1!!.`val`+i)%10, addTwoNumbers(l1.next, l2, (l1.`val`+i)/10))
        }
        if (i == 0) return l2
        else return ListNode((l2.`val`+i)%10,addTwoNumbers(l1, l2.next, (l2.`val`+i)/10))
    }
}


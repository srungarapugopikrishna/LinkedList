class Node :
	def __init__(self,data):
		self.data = data
		self.next = None
class LinkedList :
	def __init__(self):
		self.head = None

	def insert(self,data):
		if(self.head == None):
			self.head = Node(data)
		else:
			self.temp = self.head
			while self.temp.next != None:
				self.temp = self.temp.next

			self.temp.next = Node(data)
			self.temp = self.temp.next
			self.temp.data = data
			self.temp.next = None
	def display(self):
		if(self.head != None):
			self.temp = self.head
			while self.temp != None:
				print self.temp.data
				self.temp = self.temp.next
		else:
			print "Q is empty"

	def deleteFirst(self,data):
		if(self.head != None):
			self.temp = self.head.next
			dataDeleted = self.head.data
			self.head = self.temp
		else:
			print 'Nothing to delete. Q is empty'

	def deleteLast(self,data):
		if(self.head != None):
			self.temp = self.head
			self.tempPre = None
			while self.temp.next != None:
				self.tempPre = self.temp
				self.temp = self.temp.next
			dataDeleted = self.temp.data
			if self.tempPre!=None:
				self.tempPre.next = None
			else:
				self.head = None
	def deQueElementAtPosition(self,position):
		if(self.head != None):
			if(position == 1):
				deleteFirst()
			else:
				currentPosition = 2
				self.tempPre = None
				self.tempNext = None
				self.temp = self.head.next
				self.tempPre = self.head
				while self.temp.next != None:
					dataDeleted = self.temp.data
					if currentPosition == position:
						self.tempNext = self.temp.next
						self.tempPre.next = self.tempNext
						#self.temp = None
					self.tempPre = self.temp
					self.temp = self.temp.next
					currentPosition = currentPosition + 1
		else:
			print 'No elements in the Queue'

flag = "true"
l = LinkedList()
while(flag == "true"):
	print 'Select your choice:\n \
1.EnQue\n 2.Display\n 3.DeQue First Element\n 4.DeQue Last Element\n \
5.DeQue Element At Position\n 6.EnQue at the First\n 7.EnQue Element At Position\n \
8.ReverseLinkedList\n 9.Find Middle Element\n 10.DisplayFromEnd(Recursive)\n \
11.Find Length of list(Even or Odd)\n 12.Reverse the list in pairs\n 13.Exit'

	n = int(raw_input('Enter your choice:'))
	if(n == 1):
		num = int(raw_input('Enter the number to EnQue:'))
		l.insert(num)
	elif(n == 2):
		l.display()
	elif(n == 3):
		l.deleteFirst(num)
	elif(n == 4):
		l.deleteLast(num)
	elif( n == 5):
		pos = int(raw_input('Enter the position to DeQue:'))
		l.deQueElementAtPosition(pos)
	elif(n == 13):
		flag == "false"
		exit(0)



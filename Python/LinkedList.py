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

	def delete(self,data):
		if(self.head != None):
			self.temp = self.head
			while self.temp.next != None:
				
				self.temp = self.temp.next
		else:
			print 'Nothing to delete. Q is empty'


l = LinkedList()
l.insert('a')
l.insert('d')
l.insert('c')
l.insert('e')
l.display()


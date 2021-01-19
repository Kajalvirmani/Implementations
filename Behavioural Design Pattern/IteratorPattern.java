// Step 1
// Create interfaces.

// Iterator.java

 interface Iterator {
   public boolean hasNext();
   public Object next();
}
// Container.java

 interface Container {
   public Iterator getIterator();
}
//Step 2
// Create concrete class implementing the Container interface. This class has inner class NameIterator implementing the Iterator interface.

// NameRepository.java

 class NameRepository implements Container {
   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }		
   }
}
// Step 3
// Use the NameRepository to get iterator and print names.

// IteratorPatternDemo.java

public class IteratorPattern {
	
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      } 	
   }
}

    
    class ObjectWithPureFunction{

         int sum(int a, int b) {
            return a + b;
        }
    }
    
     class ObjectWithNonPureFunction{
        private int value = 0;
    
         int add(int nextValue) {
            this.value += nextValue;
            return this.value;
        }
    }
    
    class HigherOrderFunctionClass {

        public <T> IFactory<T> createFactory(IProducer<T> producer, IConfigurator<T> configurator) {
            return () -> {
               T instance = producer.produce();
               configurator.configure(instance);
               return instance;
            };
        }
    }
    

    interface IFactory<T> {
        T create();
     }
     
    interface IProducer<T> {
        T produce();
     }
     
   interface IConfigurator<T> {
        void configure(T t);
     }

     public class Main{
         public static void main(String [] args){
            ObjectWithPureFunction a=new ObjectWithPureFunction();
             System.out.println(a.sum(1,2));

             ObjectWithNonPureFunction b = new ObjectWithNonPureFunction();
             System.out.println(b.add(2));
         }
     }
     





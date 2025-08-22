package es.wipop.poc;

public class Client {

   private final String action;

   public Client() {
      this.action = "Something";
   }

   public String doSomething() {
      return this.action;
   }

}

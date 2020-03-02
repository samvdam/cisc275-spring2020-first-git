public class Dog extends Animal{
    public Dog(String n, Integer l){
	this.name=n;
	this.numLegs=l;	
    }

    public String toString(){
	return this.name + ", " + this.numLegs;
    }
}

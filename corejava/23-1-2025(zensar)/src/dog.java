class dog extends Animal{
	public dog (String name) {
		super (name);
	}
	//overriding 
	@Override
	public void makeSound() {
		System.out.println(name+"says woof woof");
	}
}
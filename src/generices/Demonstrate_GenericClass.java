package generices;

class  Demonstrate_GenericClass<T> {
	T obj;

	 Demonstrate_GenericClass(T obj) {
		this.obj = obj;
	}

	public T get() {
		return this.obj;
	}



	public static void main(String[] args)

	{

		 Demonstrate_GenericClass<Integer> i = new  Demonstrate_GenericClass<Integer>(02);
		System.out.println(i.get());
		 Demonstrate_GenericClass<String> s = new  Demonstrate_GenericClass<String>("harshad");
		System.out.println(s.get());
	}


}
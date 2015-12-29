package com.sqa.ao.testNGTests;

class Base
{

	protected int i;

	Base()
	{
		add(1);
	}

	void add(int v)
	{
		i += v;
	}
}

class Extension extends Base
{

	Extension()
	{
		add(1);
	}

	@Override
	void add(int v)
	{
		i += v * 2;
	}
}



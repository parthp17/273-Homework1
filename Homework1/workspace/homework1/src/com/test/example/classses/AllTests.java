package com.test.example.classses;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
{ ArrayMarksTest.class, CSVServiceImplTest.class, EmployeeCollectionTest.class, GenericsTest.class,
		MultithreadedDateTimeServerTest.class, QueueTheatreTest.class, ReverseStringStackTest.class })

public class AllTests
{

}

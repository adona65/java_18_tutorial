package tutorial_000.languageNewFeatures;

public class _005_MiscellaneousChanges {
	/*
	 * Java 18 delivered various changes concerning Java. Here are some.
	 */
	
	/*
	 * Vector API (Third Incubator)
	 * 
	 * The Vector API deals with the SIMD (Single Instruction, Multiple Data) type of operation, meaning various sets of instructions executed in 
	 * parallel. It leverages specialized CPU hardware that supports vector instructions and allows the execution of such instructions as pipelines.
	 * 
	 * As a result, the new API will enable developers to implement more efficient code, leveraging the potential of the underlying hardware.
	 * 
	 * Everyday use cases for this operation are scientific algebra linear applications, image processing, character processing, and any heavy 
	 * arithmetic application or any application that needs to apply an operation for multiple independent operands.
	 * 
	 * It is still in incubator stage in java 18, which provide some performance enhancement compare to Vector API incubating in java 17.
	 */
	
	/*
	 * Foreign Function & Memory API (Second Incubator)
	 * 
	 * The Foreign Function & Memory API was created in Java 17 by combining the "Foreign Memory Access API" and the "Foreign Linker API", both of which 
	 * previously went through several incubator phases.
	 *
	 * The new API is intended to replace JNI (Java Native Interface). JNI allows C code to be called from Java. The issue with JNI is it's highly complicated 
	 * to implement, error-prone, and slow. The goal of the new API is to reduce implementation effort by 90% and accelerate API performance by a factor 
	 * of 4 to 5.
	 *
	 */
}

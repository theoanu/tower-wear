/** 
*/
package com.MAVLink.Messages.enums;

public class MOTOR_TEST_THROTTLE_TYPE {
	public static final int MOTOR_TEST_THROTTLE_PERCENT = 0; /* throttle as a percentage from 0 ~ 100 | */
	public static final int MOTOR_TEST_THROTTLE_PWM = 1; /* throttle as an absolute PWM value (normally in range of 1000~2000) | */
	public static final int MOTOR_TEST_THROTTLE_PILOT = 2; /* throttle pass-through from pilot's transmitter | */
	public static final int MOTOR_TEST_THROTTLE_TYPE_ENUM_END = 3; /*  | */
}

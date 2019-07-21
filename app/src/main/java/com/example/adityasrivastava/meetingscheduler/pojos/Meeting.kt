package com.example.adityasrivastava.meetingscheduler.pojos

data class Meeting(
	val start_time: String? = null,
	val end_time: String? = null,
	val description: String? = null,
	val participants: List<String?>? = null
)

package com.example.dtoutils.kafka;

public class KafkaConstants {

    public static final String HEADER_PROCESS_ID = "device.process.id";

    public static final String GROUP_ID = ".group_";

    public static final String DEVICE_FIND_QUERY_TOPIC = "device.find.query";
    public static final String DEVICE_FIND_QUERY_GROUP_ID_PREFIX = DEVICE_FIND_QUERY_TOPIC + GROUP_ID;

    public static final String DEVICE_FIND_REPLY_TOPIC = "device.find.reply";
    public static final String DEVICE_FIND_REPLY_GROUP_ID_PREFIX = DEVICE_FIND_QUERY_TOPIC + GROUP_ID;

}

package com.example.dtoutils.kafka.serialization;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import org.apache.kafka.common.serialization.Deserializer;

public abstract class DtoDeserializer<V extends Message> extends  HeaderDeSerialization implements Deserializer<V> {

    private final Parser<V> parser;

    protected DtoDeserializer(Parser<V> parser) {
        this.parser = parser;
    }

    public V deserialize(String topic, byte[] data) {
        if(data != null && data.length != 0) {
            try {
                parser.parseFrom(data);
            }catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
        return null;
    }



}

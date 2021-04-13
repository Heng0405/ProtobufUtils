package com.example.dtoutils.kafka.serialization;

import com.google.protobuf.Message;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Optional;

public abstract class DtoSerializer<DTO extends Message> implements Serializer<DTO> {

    public byte[] serialize(String topic, DTO data) {
        return Optional.ofNullable(data)
                .map(Message::toByteArray)
                .orElse(null);
    }

}

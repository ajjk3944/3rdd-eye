package com.google.protobuf;

import com.google.protobuf.AbstractC4016a;
import com.google.protobuf.U;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: AbstractParser.java */
/* renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4018b<MessageType extends U> implements e0<MessageType> {
    private static final C4034q EMPTY_REGISTRY = C4034q.getEmptyRegistry();

    private MessageType checkMessageInitialized(MessageType messagetype) throws C {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    private t0 newUninitializedMessageException(MessageType messagetype) {
        return messagetype instanceof AbstractC4016a ? ((AbstractC4016a) messagetype).newUninitializedMessageException() : new t0(messagetype);
    }

    @Override // com.google.protobuf.e0
    public abstract /* synthetic */ Object parsePartialFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws C;

    @Override // com.google.protobuf.e0
    public MessageType parseDelimitedFrom(InputStream inputStream, C4034q c4034q) throws C {
        return (MessageType) checkMessageInitialized(parsePartialDelimitedFrom(inputStream, c4034q));
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialDelimitedFrom(InputStream inputStream, C4034q c4034q) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) parsePartialFrom((InputStream) new AbstractC4016a.AbstractC0355a.C0356a(inputStream, AbstractC4027j.readRawVarint32(i, inputStream)), c4034q);
        } catch (IOException e4) {
            throw new C(e4);
        }
    }

    @Override // com.google.protobuf.e0
    public MessageType parseDelimitedFrom(InputStream inputStream) throws C {
        return (MessageType) parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialDelimitedFrom(InputStream inputStream) throws C {
        return (MessageType) parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialFrom(AbstractC4027j abstractC4027j) throws C {
        return (MessageType) parsePartialFrom(abstractC4027j, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialFrom(AbstractC4026i abstractC4026i, C4034q c4034q) throws C {
        AbstractC4027j abstractC4027jNewCodedInput = abstractC4026i.newCodedInput();
        MessageType messagetype = (MessageType) parsePartialFrom(abstractC4027jNewCodedInput, c4034q);
        try {
            abstractC4027jNewCodedInput.checkLastTagWas(0);
            return messagetype;
        } catch (C e4) {
            throw e4.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws C {
        return (MessageType) checkMessageInitialized((U) parsePartialFrom(abstractC4027j, c4034q));
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(AbstractC4027j abstractC4027j) throws C {
        return (MessageType) parseFrom(abstractC4027j, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(AbstractC4026i abstractC4026i, C4034q c4034q) throws C {
        return (MessageType) checkMessageInitialized(parsePartialFrom(abstractC4026i, c4034q));
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialFrom(AbstractC4026i abstractC4026i) throws C {
        return (MessageType) parsePartialFrom(abstractC4026i, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(AbstractC4026i abstractC4026i) throws C {
        return (MessageType) parseFrom(abstractC4026i, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialFrom(byte[] bArr, int i, int i10, C4034q c4034q) throws C {
        AbstractC4027j abstractC4027jNewInstance = AbstractC4027j.newInstance(bArr, i, i10);
        MessageType messagetype = (MessageType) parsePartialFrom(abstractC4027jNewInstance, c4034q);
        try {
            abstractC4027jNewInstance.checkLastTagWas(0);
            return messagetype;
        } catch (C e4) {
            throw e4.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(ByteBuffer byteBuffer, C4034q c4034q) throws C {
        AbstractC4027j abstractC4027jNewInstance = AbstractC4027j.newInstance(byteBuffer);
        U u8 = (U) parsePartialFrom(abstractC4027jNewInstance, c4034q);
        try {
            abstractC4027jNewInstance.checkLastTagWas(0);
            return (MessageType) checkMessageInitialized(u8);
        } catch (C e4) {
            throw e4.setUnfinishedMessage(u8);
        }
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialFrom(byte[] bArr, int i, int i10) throws C {
        return (MessageType) parsePartialFrom(bArr, i, i10, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialFrom(byte[] bArr, C4034q c4034q) throws C {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, c4034q);
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(ByteBuffer byteBuffer) throws C {
        return (MessageType) parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialFrom(byte[] bArr) throws C {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(byte[] bArr, int i, int i10, C4034q c4034q) throws C {
        return (MessageType) checkMessageInitialized(parsePartialFrom(bArr, i, i10, c4034q));
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialFrom(InputStream inputStream, C4034q c4034q) throws C {
        AbstractC4027j abstractC4027jNewInstance = AbstractC4027j.newInstance(inputStream);
        MessageType messagetype = (MessageType) parsePartialFrom(abstractC4027jNewInstance, c4034q);
        try {
            abstractC4027jNewInstance.checkLastTagWas(0);
            return messagetype;
        } catch (C e4) {
            throw e4.setUnfinishedMessage(messagetype);
        }
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(byte[] bArr, int i, int i10) throws C {
        return (MessageType) parseFrom(bArr, i, i10, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(byte[] bArr, C4034q c4034q) throws C {
        return (MessageType) parseFrom(bArr, 0, bArr.length, c4034q);
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(byte[] bArr) throws C {
        return (MessageType) parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(InputStream inputStream, C4034q c4034q) throws C {
        return (MessageType) checkMessageInitialized(parsePartialFrom(inputStream, c4034q));
    }

    @Override // com.google.protobuf.e0
    public MessageType parsePartialFrom(InputStream inputStream) throws C {
        return (MessageType) parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.e0
    public MessageType parseFrom(InputStream inputStream) throws C {
        return (MessageType) parseFrom(inputStream, EMPTY_REGISTRY);
    }
}

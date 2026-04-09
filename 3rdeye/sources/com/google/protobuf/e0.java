package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Parser.java */
/* loaded from: classes2.dex */
public interface e0<MessageType> {
    MessageType parseDelimitedFrom(InputStream inputStream) throws C;

    MessageType parseDelimitedFrom(InputStream inputStream, C4034q c4034q) throws C;

    MessageType parseFrom(AbstractC4026i abstractC4026i) throws C;

    MessageType parseFrom(AbstractC4026i abstractC4026i, C4034q c4034q) throws C;

    MessageType parseFrom(AbstractC4027j abstractC4027j) throws C;

    MessageType parseFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws C;

    MessageType parseFrom(InputStream inputStream) throws C;

    MessageType parseFrom(InputStream inputStream, C4034q c4034q) throws C;

    MessageType parseFrom(ByteBuffer byteBuffer) throws C;

    MessageType parseFrom(ByteBuffer byteBuffer, C4034q c4034q) throws C;

    MessageType parseFrom(byte[] bArr) throws C;

    MessageType parseFrom(byte[] bArr, int i, int i10) throws C;

    MessageType parseFrom(byte[] bArr, int i, int i10, C4034q c4034q) throws C;

    MessageType parseFrom(byte[] bArr, C4034q c4034q) throws C;

    MessageType parsePartialDelimitedFrom(InputStream inputStream) throws C;

    MessageType parsePartialDelimitedFrom(InputStream inputStream, C4034q c4034q) throws C;

    MessageType parsePartialFrom(AbstractC4026i abstractC4026i) throws C;

    MessageType parsePartialFrom(AbstractC4026i abstractC4026i, C4034q c4034q) throws C;

    MessageType parsePartialFrom(AbstractC4027j abstractC4027j) throws C;

    MessageType parsePartialFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws C;

    MessageType parsePartialFrom(InputStream inputStream) throws C;

    MessageType parsePartialFrom(InputStream inputStream, C4034q c4034q) throws C;

    MessageType parsePartialFrom(byte[] bArr) throws C;

    MessageType parsePartialFrom(byte[] bArr, int i, int i10) throws C;

    MessageType parsePartialFrom(byte[] bArr, int i, int i10, C4034q c4034q) throws C;

    MessageType parsePartialFrom(byte[] bArr, C4034q c4034q) throws C;
}

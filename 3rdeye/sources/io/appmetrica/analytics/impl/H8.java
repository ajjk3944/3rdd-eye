package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class H8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile H8[] f39567e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f39568a;

    /* renamed from: b, reason: collision with root package name */
    public C5044w8 f39569b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f39570c;

    /* renamed from: d, reason: collision with root package name */
    public C8 f39571d;

    public H8() {
        a();
    }

    public static H8[] b() {
        if (f39567e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39567e == null) {
                        f39567e = new H8[0];
                    }
                } finally {
                }
            }
        }
        return f39567e;
    }

    public final H8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f39568a = bArr;
        this.f39569b = null;
        this.f39570c = bArr;
        this.f39571d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f39568a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f39568a);
        }
        C5044w8 c5044w8 = this.f39569b;
        if (c5044w8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5044w8);
        }
        if (!Arrays.equals(this.f39570c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f39570c);
        }
        C8 c82 = this.f39571d;
        return c82 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c82) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f39568a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f39568a);
        }
        C5044w8 c5044w8 = this.f39569b;
        if (c5044w8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5044w8);
        }
        if (!Arrays.equals(this.f39570c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f39570c);
        }
        C8 c82 = this.f39571d;
        if (c82 != null) {
            codedOutputByteBufferNano.writeMessage(4, c82);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f39568a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f39569b == null) {
                    this.f39569b = new C5044w8();
                }
                codedInputByteBufferNano.readMessage(this.f39569b);
            } else if (tag == 26) {
                this.f39570c = codedInputByteBufferNano.readBytes();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f39571d == null) {
                    this.f39571d = new C8();
                }
                codedInputByteBufferNano.readMessage(this.f39571d);
            }
        }
        return this;
    }

    public static H8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new H8().mergeFrom(codedInputByteBufferNano);
    }

    public static H8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (H8) MessageNano.mergeFrom(new H8(), bArr);
    }
}

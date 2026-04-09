package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class J8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile J8[] f39685c;

    /* renamed from: a, reason: collision with root package name */
    public E8 f39686a;

    /* renamed from: b, reason: collision with root package name */
    public G8 f39687b;

    public J8() {
        a();
    }

    public static J8[] b() {
        if (f39685c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39685c == null) {
                        f39685c = new J8[0];
                    }
                } finally {
                }
            }
        }
        return f39685c;
    }

    public final J8 a() {
        this.f39686a = null;
        this.f39687b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        E8 e82 = this.f39686a;
        if (e82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, e82);
        }
        G8 g82 = this.f39687b;
        return g82 != null ? CodedOutputByteBufferNano.computeMessageSize(2, g82) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        E8 e82 = this.f39686a;
        if (e82 != null) {
            codedOutputByteBufferNano.writeMessage(1, e82);
        }
        G8 g82 = this.f39687b;
        if (g82 != null) {
            codedOutputByteBufferNano.writeMessage(2, g82);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f39686a == null) {
                    this.f39686a = new E8();
                }
                codedInputByteBufferNano.readMessage(this.f39686a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f39687b == null) {
                    this.f39687b = new G8();
                }
                codedInputByteBufferNano.readMessage(this.f39687b);
            }
        }
        return this;
    }

    public static J8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new J8().mergeFrom(codedInputByteBufferNano);
    }

    public static J8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (J8) MessageNano.mergeFrom(new J8(), bArr);
    }
}

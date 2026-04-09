package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class I8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile I8[] f39618c;

    /* renamed from: a, reason: collision with root package name */
    public E8 f39619a;

    /* renamed from: b, reason: collision with root package name */
    public H8 f39620b;

    public I8() {
        a();
    }

    public static I8[] b() {
        if (f39618c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39618c == null) {
                        f39618c = new I8[0];
                    }
                } finally {
                }
            }
        }
        return f39618c;
    }

    public final I8 a() {
        this.f39619a = null;
        this.f39620b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        E8 e82 = this.f39619a;
        if (e82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, e82);
        }
        H8 h82 = this.f39620b;
        return h82 != null ? CodedOutputByteBufferNano.computeMessageSize(2, h82) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        E8 e82 = this.f39619a;
        if (e82 != null) {
            codedOutputByteBufferNano.writeMessage(1, e82);
        }
        H8 h82 = this.f39620b;
        if (h82 != null) {
            codedOutputByteBufferNano.writeMessage(2, h82);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f39619a == null) {
                    this.f39619a = new E8();
                }
                codedInputByteBufferNano.readMessage(this.f39619a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f39620b == null) {
                    this.f39620b = new H8();
                }
                codedInputByteBufferNano.readMessage(this.f39620b);
            }
        }
        return this;
    }

    public static I8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new I8().mergeFrom(codedInputByteBufferNano);
    }

    public static I8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (I8) MessageNano.mergeFrom(new I8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class A8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile A8[] f39088b;

    /* renamed from: a, reason: collision with root package name */
    public C5094y8 f39089a;

    public A8() {
        a();
    }

    public static A8[] b() {
        if (f39088b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39088b == null) {
                        f39088b = new A8[0];
                    }
                } finally {
                }
            }
        }
        return f39088b;
    }

    public final A8 a() {
        this.f39089a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5094y8 c5094y8 = this.f39089a;
        return c5094y8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c5094y8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5094y8 c5094y8 = this.f39089a;
        if (c5094y8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5094y8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f39089a == null) {
                    this.f39089a = new C5094y8();
                }
                codedInputByteBufferNano.readMessage(this.f39089a);
            }
        }
        return this;
    }

    public static A8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A8().mergeFrom(codedInputByteBufferNano);
    }

    public static A8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A8) MessageNano.mergeFrom(new A8(), bArr);
    }
}

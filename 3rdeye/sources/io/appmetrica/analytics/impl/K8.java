package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class K8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile K8[] f39715b;

    /* renamed from: a, reason: collision with root package name */
    public H8 f39716a;

    public K8() {
        a();
    }

    public static K8[] b() {
        if (f39715b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39715b == null) {
                        f39715b = new K8[0];
                    }
                } finally {
                }
            }
        }
        return f39715b;
    }

    public final K8 a() {
        this.f39716a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        H8 h82 = this.f39716a;
        return h82 != null ? CodedOutputByteBufferNano.computeMessageSize(1, h82) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        H8 h82 = this.f39716a;
        if (h82 != null) {
            codedOutputByteBufferNano.writeMessage(1, h82);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f39716a == null) {
                    this.f39716a = new H8();
                }
                codedInputByteBufferNano.readMessage(this.f39716a);
            }
        }
        return this;
    }

    public static K8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new K8().mergeFrom(codedInputByteBufferNano);
    }

    public static K8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (K8) MessageNano.mergeFrom(new K8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4994u8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4994u8[] f41716b;

    /* renamed from: a, reason: collision with root package name */
    public C5019v8 f41717a;

    public C4994u8() {
        a();
    }

    public static C4994u8[] b() {
        if (f41716b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41716b == null) {
                        f41716b = new C4994u8[0];
                    }
                } finally {
                }
            }
        }
        return f41716b;
    }

    public final C4994u8 a() {
        this.f41717a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5019v8 c5019v8 = this.f41717a;
        return c5019v8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c5019v8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5019v8 c5019v8 = this.f41717a;
        if (c5019v8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5019v8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4994u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f41717a == null) {
                    this.f41717a = new C5019v8();
                }
                codedInputByteBufferNano.readMessage(this.f41717a);
            }
        }
        return this;
    }

    public static C4994u8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4994u8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4994u8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4994u8) MessageNano.mergeFrom(new C4994u8(), bArr);
    }
}

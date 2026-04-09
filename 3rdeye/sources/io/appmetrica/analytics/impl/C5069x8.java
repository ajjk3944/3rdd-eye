package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.x8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5069x8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C5069x8[] f42053c;

    /* renamed from: a, reason: collision with root package name */
    public long f42054a;

    /* renamed from: b, reason: collision with root package name */
    public int f42055b;

    public C5069x8() {
        a();
    }

    public static C5069x8[] b() {
        if (f42053c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42053c == null) {
                        f42053c = new C5069x8[0];
                    }
                } finally {
                }
            }
        }
        return f42053c;
    }

    public final C5069x8 a() {
        this.f42054a = 0L;
        this.f42055b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j4 = this.f42054a;
        if (j4 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        int i = this.f42055b;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f42054a;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        int i = this.f42055b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5069x8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f42054a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f42055b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static C5069x8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5069x8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5069x8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5069x8) MessageNano.mergeFrom(new C5069x8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class A9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile A9[] f39090e;

    /* renamed from: a, reason: collision with root package name */
    public long f39091a;

    /* renamed from: b, reason: collision with root package name */
    public int f39092b;

    /* renamed from: c, reason: collision with root package name */
    public long f39093c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39094d;

    public A9() {
        a();
    }

    public static A9[] b() {
        if (f39090e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39090e == null) {
                        f39090e = new A9[0];
                    }
                } finally {
                }
            }
        }
        return f39090e;
    }

    public final A9 a() {
        this.f39091a = 0L;
        this.f39092b = 0;
        this.f39093c = 0L;
        this.f39094d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f39092b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f39091a) + super.computeSerializedSize();
        long j4 = this.f39093c;
        if (j4 != 0) {
            iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j4);
        }
        boolean z10 = this.f39094d;
        return z10 ? CodedOutputByteBufferNano.computeBoolSize(4, z10) + iComputeSInt32Size : iComputeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f39091a);
        codedOutputByteBufferNano.writeSInt32(2, this.f39092b);
        long j4 = this.f39093c;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j4);
        }
        boolean z10 = this.f39094d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f39091a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 16) {
                this.f39092b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f39093c = codedInputByteBufferNano.readInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f39094d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static A9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A9().mergeFrom(codedInputByteBufferNano);
    }

    public static A9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A9) MessageNano.mergeFrom(new A9(), bArr);
    }
}

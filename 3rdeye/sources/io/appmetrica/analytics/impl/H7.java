package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class H7 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile H7[] f39563d;

    /* renamed from: a, reason: collision with root package name */
    public long f39564a;

    /* renamed from: b, reason: collision with root package name */
    public long f39565b;

    /* renamed from: c, reason: collision with root package name */
    public int f39566c;

    public H7() {
        a();
    }

    public static H7[] b() {
        if (f39563d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39563d == null) {
                        f39563d = new H7[0];
                    }
                } finally {
                }
            }
        }
        return f39563d;
    }

    public final H7 a() {
        this.f39564a = -1L;
        this.f39565b = -1L;
        this.f39566c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j4 = this.f39564a;
        if (j4 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        long j10 = this.f39565b;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j10);
        }
        int i = this.f39566c;
        return i != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f39564a;
        if (j4 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        long j10 = this.f39565b;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j10);
        }
        int i = this.f39566c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f39564a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f39565b = codedInputByteBufferNano.readInt64();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f39566c = int32;
                }
            }
        }
        return this;
    }

    public static H7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new H7().mergeFrom(codedInputByteBufferNano);
    }

    public static H7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (H7) MessageNano.mergeFrom(new H7(), bArr);
    }
}

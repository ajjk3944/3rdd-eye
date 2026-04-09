package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class Q3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Q3[] f40003c;

    /* renamed from: a, reason: collision with root package name */
    public S3 f40004a;

    /* renamed from: b, reason: collision with root package name */
    public int f40005b;

    public Q3() {
        a();
    }

    public static Q3[] b() {
        if (f40003c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40003c == null) {
                        f40003c = new Q3[0];
                    }
                } finally {
                }
            }
        }
        return f40003c;
    }

    public final Q3 a() {
        this.f40004a = null;
        this.f40005b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        S3 s32 = this.f40004a;
        if (s32 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, s32);
        }
        int i = this.f40005b;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        S3 s32 = this.f40004a;
        if (s32 != null) {
            codedOutputByteBufferNano.writeMessage(1, s32);
        }
        int i = this.f40005b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f40004a == null) {
                    this.f40004a = new S3();
                }
                codedInputByteBufferNano.readMessage(this.f40004a);
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f40005b = int32;
                }
            }
        }
        return this;
    }

    public static Q3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q3().mergeFrom(codedInputByteBufferNano);
    }

    public static Q3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q3) MessageNano.mergeFrom(new Q3(), bArr);
    }
}

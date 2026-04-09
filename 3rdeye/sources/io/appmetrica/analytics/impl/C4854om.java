package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4854om extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4854om[] f41394b;

    /* renamed from: a, reason: collision with root package name */
    public long f41395a;

    public C4854om() {
        a();
    }

    public static C4854om[] b() {
        if (f41394b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41394b == null) {
                        f41394b = new C4854om[0];
                    }
                } finally {
                }
            }
        }
        return f41394b;
    }

    public final C4854om a() {
        this.f41395a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j4 = this.f41395a;
        return j4 != 864000000 ? CodedOutputByteBufferNano.computeInt64Size(1, j4) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f41395a;
        if (j4 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4854om mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41395a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C4854om a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4854om) MessageNano.mergeFrom(new C4854om(), bArr);
    }

    public static C4854om b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4854om().mergeFrom(codedInputByteBufferNano);
    }
}

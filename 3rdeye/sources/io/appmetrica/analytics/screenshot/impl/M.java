package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class M extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile M[] f42511c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f42512a;

    /* renamed from: b, reason: collision with root package name */
    public long f42513b;

    public M() {
        a();
    }

    public static M[] b() {
        if (f42511c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42511c == null) {
                        f42511c = new M[0];
                    }
                } finally {
                }
            }
        }
        return f42511c;
    }

    public final M a() {
        this.f42512a = true;
        this.f42513b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z10 = this.f42512a;
        if (!z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z10);
        }
        long j4 = this.f42513b;
        return j4 != 1 ? CodedOutputByteBufferNano.computeInt64Size(2, j4) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z10 = this.f42512a;
        if (!z10) {
            codedOutputByteBufferNano.writeBool(1, z10);
        }
        long j4 = this.f42513b;
        if (j4 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f42512a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f42513b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static M b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new M().mergeFrom(codedInputByteBufferNano);
    }

    public static M a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (M) MessageNano.mergeFrom(new M(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4802mm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4802mm[] f41271b;

    /* renamed from: a, reason: collision with root package name */
    public long f41272a;

    public C4802mm() {
        a();
    }

    public static C4802mm[] b() {
        if (f41271b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41271b == null) {
                        f41271b = new C4802mm[0];
                    }
                } finally {
                }
            }
        }
        return f41271b;
    }

    public final C4802mm a() {
        this.f41272a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j4 = this.f41272a;
        return j4 != 10000 ? CodedOutputByteBufferNano.computeInt64Size(1, j4) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f41272a;
        if (j4 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4802mm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f41272a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C4802mm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4802mm) MessageNano.mergeFrom(new C4802mm(), bArr);
    }

    public static C4802mm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4802mm().mergeFrom(codedInputByteBufferNano);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4776lm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4776lm[] f41214c;

    /* renamed from: a, reason: collision with root package name */
    public int f41215a;

    /* renamed from: b, reason: collision with root package name */
    public int f41216b;

    public C4776lm() {
        a();
    }

    public static C4776lm[] b() {
        if (f41214c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41214c == null) {
                        f41214c = new C4776lm[0];
                    }
                } finally {
                }
            }
        }
        return f41214c;
    }

    public final C4776lm a() {
        this.f41215a = 86400;
        this.f41216b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f41215a;
        if (i != 86400) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        int i10 = this.f41216b;
        return i10 != 86400 ? CodedOutputByteBufferNano.computeInt32Size(2, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f41215a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        int i10 = this.f41216b;
        if (i10 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4776lm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f41215a = codedInputByteBufferNano.readInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41216b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static C4776lm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4776lm().mergeFrom(codedInputByteBufferNano);
    }

    public static C4776lm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4776lm) MessageNano.mergeFrom(new C4776lm(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4931rm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4931rm[] f41590c;

    /* renamed from: a, reason: collision with root package name */
    public long f41591a;

    /* renamed from: b, reason: collision with root package name */
    public long f41592b;

    public C4931rm() {
        a();
    }

    public static C4931rm[] b() {
        if (f41590c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41590c == null) {
                        f41590c = new C4931rm[0];
                    }
                } finally {
                }
            }
        }
        return f41590c;
    }

    public final C4931rm a() {
        this.f41591a = 86400L;
        this.f41592b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f41592b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f41591a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f41591a);
        codedOutputByteBufferNano.writeInt64(2, this.f41592b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4931rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f41591a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41592b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C4931rm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4931rm().mergeFrom(codedInputByteBufferNano);
    }

    public static C4931rm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4931rm) MessageNano.mergeFrom(new C4931rm(), bArr);
    }
}

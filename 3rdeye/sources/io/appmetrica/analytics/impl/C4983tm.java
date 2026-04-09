package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4983tm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4983tm[] f41699b;

    /* renamed from: a, reason: collision with root package name */
    public long f41700a;

    public C4983tm() {
        a();
    }

    public static C4983tm[] b() {
        if (f41699b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41699b == null) {
                        f41699b = new C4983tm[0];
                    }
                } finally {
                }
            }
        }
        return f41699b;
    }

    public final C4983tm a() {
        this.f41700a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f41700a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f41700a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4983tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f41700a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C4983tm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4983tm) MessageNano.mergeFrom(new C4983tm(), bArr);
    }

    public static C4983tm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4983tm().mergeFrom(codedInputByteBufferNano);
    }
}

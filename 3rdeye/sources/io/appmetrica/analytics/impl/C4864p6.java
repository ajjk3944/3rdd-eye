package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4864p6 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4864p6[] f41413b;

    /* renamed from: a, reason: collision with root package name */
    public String f41414a;

    public C4864p6() {
        a();
    }

    public static C4864p6[] b() {
        if (f41413b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41413b == null) {
                        f41413b = new C4864p6[0];
                    }
                } finally {
                }
            }
        }
        return f41413b;
    }

    public final C4864p6 a() {
        this.f41414a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f41414a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f41414a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4864p6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41414a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C4864p6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4864p6) MessageNano.mergeFrom(new C4864p6(), bArr);
    }

    public static C4864p6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4864p6().mergeFrom(codedInputByteBufferNano);
    }
}

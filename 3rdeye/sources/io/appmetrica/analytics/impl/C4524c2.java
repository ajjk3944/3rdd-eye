package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4524c2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4524c2[] f40605c;

    /* renamed from: a, reason: collision with root package name */
    public String f40606a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40607b;

    public C4524c2() {
        a();
    }

    public static C4524c2[] b() {
        if (f40605c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40605c == null) {
                        f40605c = new C4524c2[0];
                    }
                } finally {
                }
            }
        }
        return f40605c;
    }

    public final C4524c2 a() {
        this.f40606a = "";
        this.f40607b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f40607b) + CodedOutputByteBufferNano.computeStringSize(1, this.f40606a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f40606a);
        codedOutputByteBufferNano.writeBool(2, this.f40607b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4524c2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f40606a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f40607b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C4524c2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4524c2().mergeFrom(codedInputByteBufferNano);
    }

    public static C4524c2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4524c2) MessageNano.mergeFrom(new C4524c2(), bArr);
    }
}

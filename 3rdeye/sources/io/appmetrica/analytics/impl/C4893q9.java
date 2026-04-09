package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4893q9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4893q9[] f41469c;

    /* renamed from: a, reason: collision with root package name */
    public String f41470a;

    /* renamed from: b, reason: collision with root package name */
    public String f41471b;

    public C4893q9() {
        a();
    }

    public static C4893q9[] b() {
        if (f41469c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41469c == null) {
                        f41469c = new C4893q9[0];
                    }
                } finally {
                }
            }
        }
        return f41469c;
    }

    public final C4893q9 a() {
        this.f41470a = "";
        this.f41471b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f41471b) + CodedOutputByteBufferNano.computeStringSize(1, this.f41470a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f41470a);
        codedOutputByteBufferNano.writeString(2, this.f41471b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4893q9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41470a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41471b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C4893q9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4893q9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4893q9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4893q9) MessageNano.mergeFrom(new C4893q9(), bArr);
    }
}

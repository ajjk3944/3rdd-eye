package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4944s9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4944s9[] f41629c;

    /* renamed from: a, reason: collision with root package name */
    public String f41630a;

    /* renamed from: b, reason: collision with root package name */
    public long f41631b;

    public C4944s9() {
        a();
    }

    public static C4944s9[] b() {
        if (f41629c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41629c == null) {
                        f41629c = new C4944s9[0];
                    }
                } finally {
                }
            }
        }
        return f41629c;
    }

    public final C4944s9 a() {
        this.f41630a = "";
        this.f41631b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f41631b) + CodedOutputByteBufferNano.computeStringSize(1, this.f41630a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f41630a);
        codedOutputByteBufferNano.writeUInt64(2, this.f41631b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4944s9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41630a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41631b = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static C4944s9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4944s9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4944s9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4944s9) MessageNano.mergeFrom(new C4944s9(), bArr);
    }
}

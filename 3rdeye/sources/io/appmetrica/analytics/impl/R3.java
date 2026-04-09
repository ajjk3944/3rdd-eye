package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class R3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile R3[] f40034c;

    /* renamed from: a, reason: collision with root package name */
    public String f40035a;

    /* renamed from: b, reason: collision with root package name */
    public String f40036b;

    public R3() {
        a();
    }

    public static R3[] b() {
        if (f40034c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40034c == null) {
                        f40034c = new R3[0];
                    }
                } finally {
                }
            }
        }
        return f40034c;
    }

    public final R3 a() {
        this.f40035a = "";
        this.f40036b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f40035a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f40035a);
        }
        return !this.f40036b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f40036b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f40035a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f40035a);
        }
        if (!this.f40036b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f40036b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f40035a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f40036b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static R3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new R3().mergeFrom(codedInputByteBufferNano);
    }

    public static R3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (R3) MessageNano.mergeFrom(new R3(), bArr);
    }
}

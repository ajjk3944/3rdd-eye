package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Ri extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Ri[] f40067c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f40068a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f40069b;

    public Ri() {
        a();
    }

    public static Ri[] b() {
        if (f40067c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40067c == null) {
                        f40067c = new Ri[0];
                    }
                } finally {
                }
            }
        }
        return f40067c;
    }

    public final Ri a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f40068a = bArr;
        this.f40069b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f40068a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f40068a);
        }
        return !Arrays.equals(this.f40069b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f40069b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f40068a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f40068a);
        }
        if (!Arrays.equals(this.f40069b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f40069b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ri mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f40068a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f40069b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Ri b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ri().mergeFrom(codedInputByteBufferNano);
    }

    public static Ri a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ri) MessageNano.mergeFrom(new Ri(), bArr);
    }
}

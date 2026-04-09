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
public final class Jk extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Jk[] f39695c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f39696a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f39697b;

    public Jk() {
        a();
    }

    public static Jk[] b() {
        if (f39695c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39695c == null) {
                        f39695c = new Jk[0];
                    }
                } finally {
                }
            }
        }
        return f39695c;
    }

    public final Jk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f39696a = bArr;
        this.f39697b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f39696a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f39696a);
        }
        return !Arrays.equals(this.f39697b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f39697b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f39696a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f39696a);
        }
        if (!Arrays.equals(this.f39697b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f39697b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Jk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f39696a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f39697b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Jk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Jk().mergeFrom(codedInputByteBufferNano);
    }

    public static Jk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Jk) MessageNano.mergeFrom(new Jk(), bArr);
    }
}

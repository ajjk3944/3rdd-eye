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
public final class B8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile B8[] f39156c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f39157a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f39158b;

    public B8() {
        a();
    }

    public static B8[] b() {
        if (f39156c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39156c == null) {
                        f39156c = new B8[0];
                    }
                } finally {
                }
            }
        }
        return f39156c;
    }

    public final B8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f39157a = bArr;
        this.f39158b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f39157a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f39157a);
        }
        return !Arrays.equals(this.f39158b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f39158b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f39157a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f39157a);
        }
        if (!Arrays.equals(this.f39158b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f39158b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f39157a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f39158b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static B8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B8().mergeFrom(codedInputByteBufferNano);
    }

    public static B8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (B8) MessageNano.mergeFrom(new B8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4995u9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4995u9[] f41718c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f41719a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f41720b;

    public C4995u9() {
        a();
    }

    public static C4995u9[] b() {
        if (f41718c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41718c == null) {
                        f41718c = new C4995u9[0];
                    }
                } finally {
                }
            }
        }
        return f41718c;
    }

    public final C4995u9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f41719a = bArr;
        this.f41720b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f41719a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f41719a);
        }
        return !Arrays.equals(this.f41720b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f41720b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f41719a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f41719a);
        }
        if (!Arrays.equals(this.f41720b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f41720b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4995u9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41719a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41720b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C4995u9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4995u9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4995u9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4995u9) MessageNano.mergeFrom(new C4995u9(), bArr);
    }
}

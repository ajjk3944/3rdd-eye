package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4786m6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4786m6[] f41240c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f41241a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f41242b;

    public C4786m6() {
        a();
    }

    public static C4786m6[] b() {
        if (f41240c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41240c == null) {
                        f41240c = new C4786m6[0];
                    }
                } finally {
                }
            }
        }
        return f41240c;
    }

    public final C4786m6 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f41241a = bArr;
        this.f41242b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f41241a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f41241a);
        }
        return !Arrays.equals(this.f41242b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f41242b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f41241a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f41241a);
        }
        if (!Arrays.equals(this.f41242b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f41242b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4786m6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f41241a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41242b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C4786m6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4786m6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4786m6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4786m6) MessageNano.mergeFrom(new C4786m6(), bArr);
    }
}

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
public final class Vi extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f40291f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f40292g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f40293h = 2;
    public static volatile Vi[] i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f40294a;

    /* renamed from: b, reason: collision with root package name */
    public long f40295b;

    /* renamed from: c, reason: collision with root package name */
    public int f40296c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f40297d;

    /* renamed from: e, reason: collision with root package name */
    public long f40298e;

    public Vi() {
        a();
    }

    public static Vi[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new Vi[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final Vi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f40294a = bArr;
        this.f40295b = 0L;
        this.f40296c = 0;
        this.f40297d = bArr;
        this.f40298e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f40294a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f40294a);
        }
        long j4 = this.f40295b;
        if (j4 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j4);
        }
        int i10 = this.f40296c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f40297d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f40297d);
        }
        long j10 = this.f40298e;
        return j10 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f40294a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f40294a);
        }
        long j4 = this.f40295b;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j4);
        }
        int i10 = this.f40296c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f40297d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f40297d);
        }
        long j10 = this.f40298e;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Vi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Vi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Vi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f40294a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f40295b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f40296c = int32;
                }
            } else if (tag == 34) {
                this.f40297d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f40298e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static Vi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Vi) MessageNano.mergeFrom(new Vi(), bArr);
    }
}

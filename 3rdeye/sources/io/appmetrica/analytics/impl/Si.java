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
public final class Si extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile Si[] f40120e;

    /* renamed from: a, reason: collision with root package name */
    public long f40121a;

    /* renamed from: b, reason: collision with root package name */
    public Ti f40122b;

    /* renamed from: c, reason: collision with root package name */
    public int f40123c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f40124d;

    public Si() {
        a();
    }

    public static Si[] b() {
        if (f40120e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40120e == null) {
                        f40120e = new Si[0];
                    }
                } finally {
                }
            }
        }
        return f40120e;
    }

    public final Si a() {
        this.f40121a = 0L;
        this.f40122b = null;
        this.f40123c = 0;
        this.f40124d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j4 = this.f40121a;
        if (j4 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j4);
        }
        Ti ti = this.f40122b;
        if (ti != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ti);
        }
        int i = this.f40123c;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i);
        }
        return !Arrays.equals(this.f40124d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f40124d) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j4 = this.f40121a;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j4);
        }
        Ti ti = this.f40122b;
        if (ti != null) {
            codedOutputByteBufferNano.writeMessage(2, ti);
        }
        int i = this.f40123c;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i);
        }
        if (!Arrays.equals(this.f40124d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f40124d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Si mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f40121a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f40122b == null) {
                    this.f40122b = new Ti();
                }
                codedInputByteBufferNano.readMessage(this.f40122b);
            } else if (tag == 24) {
                this.f40123c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f40124d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Si b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Si().mergeFrom(codedInputByteBufferNano);
    }

    public static Si a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Si) MessageNano.mergeFrom(new Si(), bArr);
    }
}

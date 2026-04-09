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
public final class G8 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile G8[] f39496d;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f39497a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f39498b;

    /* renamed from: c, reason: collision with root package name */
    public H8 f39499c;

    public G8() {
        a();
    }

    public static G8[] b() {
        if (f39496d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39496d == null) {
                        f39496d = new G8[0];
                    }
                } finally {
                }
            }
        }
        return f39496d;
    }

    public final G8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f39497a = bArr;
        this.f39498b = bArr;
        this.f39499c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f39497a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f39497a);
        }
        if (!Arrays.equals(this.f39498b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f39498b);
        }
        H8 h82 = this.f39499c;
        return h82 != null ? CodedOutputByteBufferNano.computeMessageSize(3, h82) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f39497a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f39497a);
        }
        if (!Arrays.equals(this.f39498b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f39498b);
        }
        H8 h82 = this.f39499c;
        if (h82 != null) {
            codedOutputByteBufferNano.writeMessage(3, h82);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f39497a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f39498b = codedInputByteBufferNano.readBytes();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f39499c == null) {
                    this.f39499c = new H8();
                }
                codedInputByteBufferNano.readMessage(this.f39499c);
            }
        }
        return this;
    }

    public static G8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new G8().mergeFrom(codedInputByteBufferNano);
    }

    public static G8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (G8) MessageNano.mergeFrom(new G8(), bArr);
    }
}

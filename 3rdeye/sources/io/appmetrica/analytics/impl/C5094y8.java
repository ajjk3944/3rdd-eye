package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.y8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5094y8 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C5094y8[] f42111f;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f42112a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f42113b;

    /* renamed from: c, reason: collision with root package name */
    public C8 f42114c;

    /* renamed from: d, reason: collision with root package name */
    public C5119z8[] f42115d;

    /* renamed from: e, reason: collision with root package name */
    public int f42116e;

    public C5094y8() {
        a();
    }

    public static C5094y8[] b() {
        if (f42111f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42111f == null) {
                        f42111f = new C5094y8[0];
                    }
                } finally {
                }
            }
        }
        return f42111f;
    }

    public final C5094y8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f42112a = bArr;
        this.f42113b = bArr;
        this.f42114c = null;
        this.f42115d = C5119z8.b();
        this.f42116e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f42112a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f42112a);
        }
        if (!Arrays.equals(this.f42113b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f42113b);
        }
        C8 c82 = this.f42114c;
        if (c82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c82);
        }
        C5119z8[] c5119z8Arr = this.f42115d;
        if (c5119z8Arr != null && c5119z8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5119z8[] c5119z8Arr2 = this.f42115d;
                if (i >= c5119z8Arr2.length) {
                    break;
                }
                C5119z8 c5119z8 = c5119z8Arr2[i];
                if (c5119z8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c5119z8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        int i10 = this.f42116e;
        return i10 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f42112a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f42112a);
        }
        if (!Arrays.equals(this.f42113b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f42113b);
        }
        C8 c82 = this.f42114c;
        if (c82 != null) {
            codedOutputByteBufferNano.writeMessage(3, c82);
        }
        C5119z8[] c5119z8Arr = this.f42115d;
        if (c5119z8Arr != null && c5119z8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5119z8[] c5119z8Arr2 = this.f42115d;
                if (i >= c5119z8Arr2.length) {
                    break;
                }
                C5119z8 c5119z8 = c5119z8Arr2[i];
                if (c5119z8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c5119z8);
                }
                i++;
            }
        }
        int i10 = this.f42116e;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5094y8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5094y8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5094y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f42112a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f42113b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f42114c == null) {
                    this.f42114c = new C8();
                }
                codedInputByteBufferNano.readMessage(this.f42114c);
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C5119z8[] c5119z8Arr = this.f42115d;
                int length = c5119z8Arr == null ? 0 : c5119z8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5119z8[] c5119z8Arr2 = new C5119z8[i];
                if (length != 0) {
                    System.arraycopy(c5119z8Arr, 0, c5119z8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5119z8 c5119z8 = new C5119z8();
                    c5119z8Arr2[length] = c5119z8;
                    codedInputByteBufferNano.readMessage(c5119z8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5119z8 c5119z82 = new C5119z8();
                c5119z8Arr2[length] = c5119z82;
                codedInputByteBufferNano.readMessage(c5119z82);
                this.f42115d = c5119z8Arr2;
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f42116e = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C5094y8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5094y8) MessageNano.mergeFrom(new C5094y8(), bArr);
    }
}

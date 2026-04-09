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
public final class E8 extends MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile E8[] f39351h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f39352a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f39353b;

    /* renamed from: c, reason: collision with root package name */
    public C5044w8 f39354c;

    /* renamed from: d, reason: collision with root package name */
    public C8 f39355d;

    /* renamed from: e, reason: collision with root package name */
    public D8 f39356e;

    /* renamed from: f, reason: collision with root package name */
    public D8 f39357f;

    /* renamed from: g, reason: collision with root package name */
    public F8[] f39358g;

    public E8() {
        a();
    }

    public static E8[] b() {
        if (f39351h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39351h == null) {
                        f39351h = new E8[0];
                    }
                } finally {
                }
            }
        }
        return f39351h;
    }

    public final E8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f39352a = bArr;
        this.f39353b = bArr;
        this.f39354c = null;
        this.f39355d = null;
        this.f39356e = null;
        this.f39357f = null;
        this.f39358g = F8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f39352a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f39352a);
        }
        if (!Arrays.equals(this.f39353b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f39353b);
        }
        C5044w8 c5044w8 = this.f39354c;
        if (c5044w8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5044w8);
        }
        C8 c82 = this.f39355d;
        if (c82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c82);
        }
        D8 d82 = this.f39356e;
        if (d82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, d82);
        }
        D8 d83 = this.f39357f;
        if (d83 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, d83);
        }
        F8[] f8Arr = this.f39358g;
        if (f8Arr != null && f8Arr.length > 0) {
            int i = 0;
            while (true) {
                F8[] f8Arr2 = this.f39358g;
                if (i >= f8Arr2.length) {
                    break;
                }
                F8 f82 = f8Arr2[i];
                if (f82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, f82) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f39352a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f39352a);
        }
        if (!Arrays.equals(this.f39353b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f39353b);
        }
        C5044w8 c5044w8 = this.f39354c;
        if (c5044w8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5044w8);
        }
        C8 c82 = this.f39355d;
        if (c82 != null) {
            codedOutputByteBufferNano.writeMessage(4, c82);
        }
        D8 d82 = this.f39356e;
        if (d82 != null) {
            codedOutputByteBufferNano.writeMessage(5, d82);
        }
        D8 d83 = this.f39357f;
        if (d83 != null) {
            codedOutputByteBufferNano.writeMessage(6, d83);
        }
        F8[] f8Arr = this.f39358g;
        if (f8Arr != null && f8Arr.length > 0) {
            int i = 0;
            while (true) {
                F8[] f8Arr2 = this.f39358g;
                if (i >= f8Arr2.length) {
                    break;
                }
                F8 f82 = f8Arr2[i];
                if (f82 != null) {
                    codedOutputByteBufferNano.writeMessage(7, f82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static E8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new E8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f39352a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f39353b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f39354c == null) {
                    this.f39354c = new C5044w8();
                }
                codedInputByteBufferNano.readMessage(this.f39354c);
            } else if (tag == 34) {
                if (this.f39355d == null) {
                    this.f39355d = new C8();
                }
                codedInputByteBufferNano.readMessage(this.f39355d);
            } else if (tag == 42) {
                if (this.f39356e == null) {
                    this.f39356e = new D8();
                }
                codedInputByteBufferNano.readMessage(this.f39356e);
            } else if (tag == 50) {
                if (this.f39357f == null) {
                    this.f39357f = new D8();
                }
                codedInputByteBufferNano.readMessage(this.f39357f);
            } else if (tag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                F8[] f8Arr = this.f39358g;
                int length = f8Arr == null ? 0 : f8Arr.length;
                int i = repeatedFieldArrayLength + length;
                F8[] f8Arr2 = new F8[i];
                if (length != 0) {
                    System.arraycopy(f8Arr, 0, f8Arr2, 0, length);
                }
                while (length < i - 1) {
                    F8 f82 = new F8();
                    f8Arr2[length] = f82;
                    codedInputByteBufferNano.readMessage(f82);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                F8 f83 = new F8();
                f8Arr2[length] = f83;
                codedInputByteBufferNano.readMessage(f83);
                this.f39358g = f8Arr2;
            }
        }
        return this;
    }

    public static E8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (E8) MessageNano.mergeFrom(new E8(), bArr);
    }
}

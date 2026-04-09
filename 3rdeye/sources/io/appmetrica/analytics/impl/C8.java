package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class C8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C8[] f39230c;

    /* renamed from: a, reason: collision with root package name */
    public B8[] f39231a;

    /* renamed from: b, reason: collision with root package name */
    public int f39232b;

    public C8() {
        a();
    }

    public static C8[] b() {
        if (f39230c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39230c == null) {
                        f39230c = new C8[0];
                    }
                } finally {
                }
            }
        }
        return f39230c;
    }

    public final C8 a() {
        this.f39231a = B8.b();
        this.f39232b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        B8[] b8Arr = this.f39231a;
        if (b8Arr != null && b8Arr.length > 0) {
            int i = 0;
            while (true) {
                B8[] b8Arr2 = this.f39231a;
                if (i >= b8Arr2.length) {
                    break;
                }
                B8 b82 = b8Arr2[i];
                if (b82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, b82) + iComputeSerializedSize;
                }
                i++;
            }
        }
        int i10 = this.f39232b;
        return i10 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        B8[] b8Arr = this.f39231a;
        if (b8Arr != null && b8Arr.length > 0) {
            int i = 0;
            while (true) {
                B8[] b8Arr2 = this.f39231a;
                if (i >= b8Arr2.length) {
                    break;
                }
                B8 b82 = b8Arr2[i];
                if (b82 != null) {
                    codedOutputByteBufferNano.writeMessage(1, b82);
                }
                i++;
            }
        }
        int i10 = this.f39232b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                B8[] b8Arr = this.f39231a;
                int length = b8Arr == null ? 0 : b8Arr.length;
                int i = repeatedFieldArrayLength + length;
                B8[] b8Arr2 = new B8[i];
                if (length != 0) {
                    System.arraycopy(b8Arr, 0, b8Arr2, 0, length);
                }
                while (length < i - 1) {
                    B8 b82 = new B8();
                    b8Arr2[length] = b82;
                    codedInputByteBufferNano.readMessage(b82);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                B8 b83 = new B8();
                b8Arr2[length] = b83;
                codedInputByteBufferNano.readMessage(b83);
                this.f39231a = b8Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f39232b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8().mergeFrom(codedInputByteBufferNano);
    }

    public static C8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8) MessageNano.mergeFrom(new C8(), bArr);
    }
}

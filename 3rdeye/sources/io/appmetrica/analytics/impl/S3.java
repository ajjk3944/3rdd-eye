package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class S3 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile S3[] f40085b;

    /* renamed from: a, reason: collision with root package name */
    public R3[] f40086a;

    public S3() {
        a();
    }

    public static S3[] b() {
        if (f40085b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40085b == null) {
                        f40085b = new S3[0];
                    }
                } finally {
                }
            }
        }
        return f40085b;
    }

    public final S3 a() {
        this.f40086a = R3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        R3[] r3Arr = this.f40086a;
        if (r3Arr != null && r3Arr.length > 0) {
            int i = 0;
            while (true) {
                R3[] r3Arr2 = this.f40086a;
                if (i >= r3Arr2.length) {
                    break;
                }
                R3 r32 = r3Arr2[i];
                if (r32 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, r32) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        R3[] r3Arr = this.f40086a;
        if (r3Arr != null && r3Arr.length > 0) {
            int i = 0;
            while (true) {
                R3[] r3Arr2 = this.f40086a;
                if (i >= r3Arr2.length) {
                    break;
                }
                R3 r32 = r3Arr2[i];
                if (r32 != null) {
                    codedOutputByteBufferNano.writeMessage(1, r32);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                R3[] r3Arr = this.f40086a;
                int length = r3Arr == null ? 0 : r3Arr.length;
                int i = repeatedFieldArrayLength + length;
                R3[] r3Arr2 = new R3[i];
                if (length != 0) {
                    System.arraycopy(r3Arr, 0, r3Arr2, 0, length);
                }
                while (length < i - 1) {
                    R3 r32 = new R3();
                    r3Arr2[length] = r32;
                    codedInputByteBufferNano.readMessage(r32);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                R3 r33 = new R3();
                r3Arr2[length] = r33;
                codedInputByteBufferNano.readMessage(r33);
                this.f40086a = r3Arr2;
            }
        }
        return this;
    }

    public static S3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S3().mergeFrom(codedInputByteBufferNano);
    }

    public static S3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S3) MessageNano.mergeFrom(new S3(), bArr);
    }
}

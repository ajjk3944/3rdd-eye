package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class D8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile D8[] f39290c;

    /* renamed from: a, reason: collision with root package name */
    public C4969t8 f39291a;

    /* renamed from: b, reason: collision with root package name */
    public C4969t8[] f39292b;

    public D8() {
        a();
    }

    public static D8[] b() {
        if (f39290c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f39290c == null) {
                        f39290c = new D8[0];
                    }
                } finally {
                }
            }
        }
        return f39290c;
    }

    public final D8 a() {
        this.f39291a = null;
        this.f39292b = C4969t8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4969t8 c4969t8 = this.f39291a;
        if (c4969t8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4969t8);
        }
        C4969t8[] c4969t8Arr = this.f39292b;
        if (c4969t8Arr != null && c4969t8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4969t8[] c4969t8Arr2 = this.f39292b;
                if (i >= c4969t8Arr2.length) {
                    break;
                }
                C4969t8 c4969t82 = c4969t8Arr2[i];
                if (c4969t82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c4969t82) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4969t8 c4969t8 = this.f39291a;
        if (c4969t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4969t8);
        }
        C4969t8[] c4969t8Arr = this.f39292b;
        if (c4969t8Arr != null && c4969t8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4969t8[] c4969t8Arr2 = this.f39292b;
                if (i >= c4969t8Arr2.length) {
                    break;
                }
                C4969t8 c4969t82 = c4969t8Arr2[i];
                if (c4969t82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4969t82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f39291a == null) {
                    this.f39291a = new C4969t8();
                }
                codedInputByteBufferNano.readMessage(this.f39291a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4969t8[] c4969t8Arr = this.f39292b;
                int length = c4969t8Arr == null ? 0 : c4969t8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4969t8[] c4969t8Arr2 = new C4969t8[i];
                if (length != 0) {
                    System.arraycopy(c4969t8Arr, 0, c4969t8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4969t8 c4969t8 = new C4969t8();
                    c4969t8Arr2[length] = c4969t8;
                    codedInputByteBufferNano.readMessage(c4969t8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4969t8 c4969t82 = new C4969t8();
                c4969t8Arr2[length] = c4969t82;
                codedInputByteBufferNano.readMessage(c4969t82);
                this.f39292b = c4969t8Arr2;
            }
        }
        return this;
    }

    public static D8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new D8().mergeFrom(codedInputByteBufferNano);
    }

    public static D8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (D8) MessageNano.mergeFrom(new D8(), bArr);
    }
}

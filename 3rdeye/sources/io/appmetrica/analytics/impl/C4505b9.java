package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4505b9 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4505b9[] f40581b;

    /* renamed from: a, reason: collision with root package name */
    public C4479a9[] f40582a;

    public C4505b9() {
        a();
    }

    public static C4505b9[] b() {
        if (f40581b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40581b == null) {
                        f40581b = new C4505b9[0];
                    }
                } finally {
                }
            }
        }
        return f40581b;
    }

    public final C4505b9 a() {
        this.f40582a = C4479a9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4479a9[] c4479a9Arr = this.f40582a;
        if (c4479a9Arr != null && c4479a9Arr.length > 0) {
            int i = 0;
            while (true) {
                C4479a9[] c4479a9Arr2 = this.f40582a;
                if (i >= c4479a9Arr2.length) {
                    break;
                }
                C4479a9 c4479a9 = c4479a9Arr2[i];
                if (c4479a9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4479a9) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4479a9[] c4479a9Arr = this.f40582a;
        if (c4479a9Arr != null && c4479a9Arr.length > 0) {
            int i = 0;
            while (true) {
                C4479a9[] c4479a9Arr2 = this.f40582a;
                if (i >= c4479a9Arr2.length) {
                    break;
                }
                C4479a9 c4479a9 = c4479a9Arr2[i];
                if (c4479a9 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4479a9);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4505b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C4479a9[] c4479a9Arr = this.f40582a;
                int length = c4479a9Arr == null ? 0 : c4479a9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4479a9[] c4479a9Arr2 = new C4479a9[i];
                if (length != 0) {
                    System.arraycopy(c4479a9Arr, 0, c4479a9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4479a9 c4479a9 = new C4479a9();
                    c4479a9Arr2[length] = c4479a9;
                    codedInputByteBufferNano.readMessage(c4479a9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4479a9 c4479a92 = new C4479a9();
                c4479a9Arr2[length] = c4479a92;
                codedInputByteBufferNano.readMessage(c4479a92);
                this.f40582a = c4479a9Arr2;
            }
        }
        return this;
    }

    public static C4505b9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4505b9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4505b9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4505b9) MessageNano.mergeFrom(new C4505b9(), bArr);
    }
}

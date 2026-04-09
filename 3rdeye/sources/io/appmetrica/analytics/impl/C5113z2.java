package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5113z2 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f42155c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42156d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42157e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static volatile C5113z2[] f42158f;

    /* renamed from: a, reason: collision with root package name */
    public C5088y2[] f42159a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f42160b;

    public C5113z2() {
        a();
    }

    public static C5113z2[] b() {
        if (f42158f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f42158f == null) {
                        f42158f = new C5113z2[0];
                    }
                } finally {
                }
            }
        }
        return f42158f;
    }

    public final C5113z2 a() {
        this.f42159a = C5088y2.b();
        this.f42160b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5088y2[] c5088y2Arr = this.f42159a;
        if (c5088y2Arr != null && c5088y2Arr.length > 0) {
            int i = 0;
            while (true) {
                C5088y2[] c5088y2Arr2 = this.f42159a;
                if (i >= c5088y2Arr2.length) {
                    break;
                }
                C5088y2 c5088y2 = c5088y2Arr2[i];
                if (c5088y2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5088y2) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f42160b) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5088y2[] c5088y2Arr = this.f42159a;
        if (c5088y2Arr != null && c5088y2Arr.length > 0) {
            int i = 0;
            while (true) {
                C5088y2[] c5088y2Arr2 = this.f42159a;
                if (i >= c5088y2Arr2.length) {
                    break;
                }
                C5088y2 c5088y2 = c5088y2Arr2[i];
                if (c5088y2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5088y2);
                }
                i++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f42160b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5113z2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5088y2[] c5088y2Arr = this.f42159a;
                int length = c5088y2Arr == null ? 0 : c5088y2Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5088y2[] c5088y2Arr2 = new C5088y2[i];
                if (length != 0) {
                    System.arraycopy(c5088y2Arr, 0, c5088y2Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5088y2 c5088y2 = new C5088y2();
                    c5088y2Arr2[length] = c5088y2;
                    codedInputByteBufferNano.readMessage(c5088y2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5088y2 c5088y22 = new C5088y2();
                c5088y2Arr2[length] = c5088y22;
                codedInputByteBufferNano.readMessage(c5088y22);
                this.f42159a = c5088y2Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f42160b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C5113z2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5113z2().mergeFrom(codedInputByteBufferNano);
    }

    public static C5113z2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5113z2) MessageNano.mergeFrom(new C5113z2(), bArr);
    }
}

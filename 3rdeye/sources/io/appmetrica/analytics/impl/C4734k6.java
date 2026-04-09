package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4734k6 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C4734k6[] f41131d;

    /* renamed from: a, reason: collision with root package name */
    public C4967t6 f41132a;

    /* renamed from: b, reason: collision with root package name */
    public C4967t6[] f41133b;

    /* renamed from: c, reason: collision with root package name */
    public String f41134c;

    public C4734k6() {
        a();
    }

    public static C4734k6[] b() {
        if (f41131d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41131d == null) {
                        f41131d = new C4734k6[0];
                    }
                } finally {
                }
            }
        }
        return f41131d;
    }

    public final C4734k6 a() {
        this.f41132a = null;
        this.f41133b = C4967t6.b();
        this.f41134c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4967t6 c4967t6 = this.f41132a;
        if (c4967t6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4967t6);
        }
        C4967t6[] c4967t6Arr = this.f41133b;
        if (c4967t6Arr != null && c4967t6Arr.length > 0) {
            int i = 0;
            while (true) {
                C4967t6[] c4967t6Arr2 = this.f41133b;
                if (i >= c4967t6Arr2.length) {
                    break;
                }
                C4967t6 c4967t62 = c4967t6Arr2[i];
                if (c4967t62 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c4967t62) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return !this.f41134c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.f41134c) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4967t6 c4967t6 = this.f41132a;
        if (c4967t6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4967t6);
        }
        C4967t6[] c4967t6Arr = this.f41133b;
        if (c4967t6Arr != null && c4967t6Arr.length > 0) {
            int i = 0;
            while (true) {
                C4967t6[] c4967t6Arr2 = this.f41133b;
                if (i >= c4967t6Arr2.length) {
                    break;
                }
                C4967t6 c4967t62 = c4967t6Arr2[i];
                if (c4967t62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4967t62);
                }
                i++;
            }
        }
        if (!this.f41134c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f41134c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4734k6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f41132a == null) {
                    this.f41132a = new C4967t6();
                }
                codedInputByteBufferNano.readMessage(this.f41132a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4967t6[] c4967t6Arr = this.f41133b;
                int length = c4967t6Arr == null ? 0 : c4967t6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4967t6[] c4967t6Arr2 = new C4967t6[i];
                if (length != 0) {
                    System.arraycopy(c4967t6Arr, 0, c4967t6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4967t6 c4967t6 = new C4967t6();
                    c4967t6Arr2[length] = c4967t6;
                    codedInputByteBufferNano.readMessage(c4967t6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4967t6 c4967t62 = new C4967t6();
                c4967t6Arr2[length] = c4967t62;
                codedInputByteBufferNano.readMessage(c4967t62);
                this.f41133b = c4967t6Arr2;
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f41134c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C4734k6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4734k6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4734k6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4734k6) MessageNano.mergeFrom(new C4734k6(), bArr);
    }
}

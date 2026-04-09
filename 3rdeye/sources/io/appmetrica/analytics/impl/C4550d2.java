package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4550d2 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C4550d2[] f40678d;

    /* renamed from: a, reason: collision with root package name */
    public C4524c2[] f40679a;

    /* renamed from: b, reason: collision with root package name */
    public C4498b2 f40680b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f40681c;

    public C4550d2() {
        a();
    }

    public static C4550d2[] b() {
        if (f40678d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f40678d == null) {
                        f40678d = new C4550d2[0];
                    }
                } finally {
                }
            }
        }
        return f40678d;
    }

    public final C4550d2 a() {
        this.f40679a = C4524c2.b();
        this.f40680b = null;
        this.f40681c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4524c2[] c4524c2Arr = this.f40679a;
        int i = 0;
        if (c4524c2Arr != null && c4524c2Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4524c2[] c4524c2Arr2 = this.f40679a;
                if (i10 >= c4524c2Arr2.length) {
                    break;
                }
                C4524c2 c4524c2 = c4524c2Arr2[i10];
                if (c4524c2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4524c2) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        C4498b2 c4498b2 = this.f40680b;
        if (c4498b2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4498b2);
        }
        String[] strArr = this.f40681c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.f40681c;
            if (i >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i11;
            }
            String str = strArr2[i];
            if (str != null) {
                i11++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4524c2[] c4524c2Arr = this.f40679a;
        int i = 0;
        if (c4524c2Arr != null && c4524c2Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C4524c2[] c4524c2Arr2 = this.f40679a;
                if (i10 >= c4524c2Arr2.length) {
                    break;
                }
                C4524c2 c4524c2 = c4524c2Arr2[i10];
                if (c4524c2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4524c2);
                }
                i10++;
            }
        }
        C4498b2 c4498b2 = this.f40680b;
        if (c4498b2 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4498b2);
        }
        String[] strArr = this.f40681c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f40681c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4550d2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4524c2[] c4524c2Arr = this.f40679a;
                int length = c4524c2Arr == null ? 0 : c4524c2Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4524c2[] c4524c2Arr2 = new C4524c2[i];
                if (length != 0) {
                    System.arraycopy(c4524c2Arr, 0, c4524c2Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4524c2 c4524c2 = new C4524c2();
                    c4524c2Arr2[length] = c4524c2;
                    codedInputByteBufferNano.readMessage(c4524c2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4524c2 c4524c22 = new C4524c2();
                c4524c2Arr2[length] = c4524c22;
                codedInputByteBufferNano.readMessage(c4524c22);
                this.f40679a = c4524c2Arr2;
            } else if (tag == 18) {
                if (this.f40680b == null) {
                    this.f40680b = new C4498b2();
                }
                codedInputByteBufferNano.readMessage(this.f40680b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f40681c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i10 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i10];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i10 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f40681c = strArr2;
            }
        }
        return this;
    }

    public static C4550d2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4550d2().mergeFrom(codedInputByteBufferNano);
    }

    public static C4550d2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4550d2) MessageNano.mergeFrom(new C4550d2(), bArr);
    }
}

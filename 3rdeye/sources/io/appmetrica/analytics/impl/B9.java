package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class B9 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f39159f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f39160g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f39161h = 1;
    public static volatile B9[] i;

    /* renamed from: a, reason: collision with root package name */
    public C5095y9[] f39162a;

    /* renamed from: b, reason: collision with root package name */
    public C4970t9 f39163b;

    /* renamed from: c, reason: collision with root package name */
    public C4893q9[] f39164c;

    /* renamed from: d, reason: collision with root package name */
    public C5120z9[] f39165d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f39166e;

    public B9() {
        a();
    }

    public static B9[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new B9[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final B9 a() {
        this.f39162a = C5095y9.b();
        this.f39163b = null;
        this.f39164c = C4893q9.b();
        this.f39165d = C5120z9.b();
        this.f39166e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5095y9[] c5095y9Arr = this.f39162a;
        int i10 = 0;
        if (c5095y9Arr != null && c5095y9Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C5095y9[] c5095y9Arr2 = this.f39162a;
                if (i11 >= c5095y9Arr2.length) {
                    break;
                }
                C5095y9 c5095y9 = c5095y9Arr2[i11];
                if (c5095y9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c5095y9) + iComputeSerializedSize;
                }
                i11++;
            }
        }
        C4970t9 c4970t9 = this.f39163b;
        if (c4970t9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4970t9);
        }
        C4893q9[] c4893q9Arr = this.f39164c;
        if (c4893q9Arr != null && c4893q9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4893q9[] c4893q9Arr2 = this.f39164c;
                if (i12 >= c4893q9Arr2.length) {
                    break;
                }
                C4893q9 c4893q9 = c4893q9Arr2[i12];
                if (c4893q9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c4893q9) + iComputeSerializedSize;
                }
                i12++;
            }
        }
        C5120z9[] c5120z9Arr = this.f39165d;
        if (c5120z9Arr != null && c5120z9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C5120z9[] c5120z9Arr2 = this.f39165d;
                if (i13 >= c5120z9Arr2.length) {
                    break;
                }
                C5120z9 c5120z9 = c5120z9Arr2[i13];
                if (c5120z9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c5120z9) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        String[] strArr = this.f39166e;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.f39166e;
            if (i10 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i14;
            }
            String str = strArr2[i10];
            if (str != null) {
                i14++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5095y9[] c5095y9Arr = this.f39162a;
        int i10 = 0;
        if (c5095y9Arr != null && c5095y9Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C5095y9[] c5095y9Arr2 = this.f39162a;
                if (i11 >= c5095y9Arr2.length) {
                    break;
                }
                C5095y9 c5095y9 = c5095y9Arr2[i11];
                if (c5095y9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5095y9);
                }
                i11++;
            }
        }
        C4970t9 c4970t9 = this.f39163b;
        if (c4970t9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4970t9);
        }
        C4893q9[] c4893q9Arr = this.f39164c;
        if (c4893q9Arr != null && c4893q9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4893q9[] c4893q9Arr2 = this.f39164c;
                if (i12 >= c4893q9Arr2.length) {
                    break;
                }
                C4893q9 c4893q9 = c4893q9Arr2[i12];
                if (c4893q9 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c4893q9);
                }
                i12++;
            }
        }
        C5120z9[] c5120z9Arr = this.f39165d;
        if (c5120z9Arr != null && c5120z9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C5120z9[] c5120z9Arr2 = this.f39165d;
                if (i13 >= c5120z9Arr2.length) {
                    break;
                }
                C5120z9 c5120z9 = c5120z9Arr2[i13];
                if (c5120z9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c5120z9);
                }
                i13++;
            }
        }
        String[] strArr = this.f39166e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f39166e;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static B9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5095y9[] c5095y9Arr = this.f39162a;
                int length = c5095y9Arr == null ? 0 : c5095y9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C5095y9[] c5095y9Arr2 = new C5095y9[i10];
                if (length != 0) {
                    System.arraycopy(c5095y9Arr, 0, c5095y9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C5095y9 c5095y9 = new C5095y9();
                    c5095y9Arr2[length] = c5095y9;
                    codedInputByteBufferNano.readMessage(c5095y9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5095y9 c5095y92 = new C5095y9();
                c5095y9Arr2[length] = c5095y92;
                codedInputByteBufferNano.readMessage(c5095y92);
                this.f39162a = c5095y9Arr2;
            } else if (tag == 34) {
                if (this.f39163b == null) {
                    this.f39163b = new C4970t9();
                }
                codedInputByteBufferNano.readMessage(this.f39163b);
            } else if (tag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C4893q9[] c4893q9Arr = this.f39164c;
                int length2 = c4893q9Arr == null ? 0 : c4893q9Arr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                C4893q9[] c4893q9Arr2 = new C4893q9[i11];
                if (length2 != 0) {
                    System.arraycopy(c4893q9Arr, 0, c4893q9Arr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    C4893q9 c4893q9 = new C4893q9();
                    c4893q9Arr2[length2] = c4893q9;
                    codedInputByteBufferNano.readMessage(c4893q9);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C4893q9 c4893q92 = new C4893q9();
                c4893q9Arr2[length2] = c4893q92;
                codedInputByteBufferNano.readMessage(c4893q92);
                this.f39164c = c4893q9Arr2;
            } else if (tag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C5120z9[] c5120z9Arr = this.f39165d;
                int length3 = c5120z9Arr == null ? 0 : c5120z9Arr.length;
                int i12 = repeatedFieldArrayLength3 + length3;
                C5120z9[] c5120z9Arr2 = new C5120z9[i12];
                if (length3 != 0) {
                    System.arraycopy(c5120z9Arr, 0, c5120z9Arr2, 0, length3);
                }
                while (length3 < i12 - 1) {
                    C5120z9 c5120z9 = new C5120z9();
                    c5120z9Arr2[length3] = c5120z9;
                    codedInputByteBufferNano.readMessage(c5120z9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C5120z9 c5120z92 = new C5120z9();
                c5120z9Arr2[length3] = c5120z92;
                codedInputByteBufferNano.readMessage(c5120z92);
                this.f39165d = c5120z9Arr2;
            } else if (tag != 90) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f39166e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i13 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i13];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i13 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f39166e = strArr2;
            }
        }
        return this;
    }

    public static B9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (B9) MessageNano.mergeFrom(new B9(), bArr);
    }
}

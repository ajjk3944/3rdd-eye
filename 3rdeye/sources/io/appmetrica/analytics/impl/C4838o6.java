package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4838o6 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static final int f41346k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f41347l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile C4838o6[] f41348m;

    /* renamed from: n, reason: collision with root package name */
    public static byte[] f41349n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f41350o;

    /* renamed from: a, reason: collision with root package name */
    public C4992u6 f41351a;

    /* renamed from: b, reason: collision with root package name */
    public C4734k6 f41352b;

    /* renamed from: c, reason: collision with root package name */
    public String f41353c;

    /* renamed from: d, reason: collision with root package name */
    public int f41354d;

    /* renamed from: e, reason: collision with root package name */
    public C4941s6[] f41355e;

    /* renamed from: f, reason: collision with root package name */
    public int f41356f;

    /* renamed from: g, reason: collision with root package name */
    public C4812n6 f41357g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f41358h;
    public byte[] i;

    /* renamed from: j, reason: collision with root package name */
    public C4786m6[] f41359j;

    public C4838o6() {
        if (!f41350o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f41350o) {
                        f41349n = InternalNano.bytesDefaultValue("JVM");
                        f41350o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C4838o6[] b() {
        if (f41348m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41348m == null) {
                        f41348m = new C4838o6[0];
                    }
                } finally {
                }
            }
        }
        return f41348m;
    }

    public final C4838o6 a() {
        this.f41351a = null;
        this.f41352b = null;
        this.f41353c = "";
        this.f41354d = -1;
        this.f41355e = C4941s6.b();
        this.f41356f = 0;
        this.f41357g = null;
        this.f41358h = (byte[]) f41349n.clone();
        this.i = WireFormatNano.EMPTY_BYTES;
        this.f41359j = C4786m6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4992u6 c4992u6 = this.f41351a;
        if (c4992u6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4992u6);
        }
        C4734k6 c4734k6 = this.f41352b;
        if (c4734k6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4734k6);
        }
        if (!this.f41353c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f41353c);
        }
        int i = this.f41354d;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C4941s6[] c4941s6Arr = this.f41355e;
        int i10 = 0;
        if (c4941s6Arr != null && c4941s6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4941s6[] c4941s6Arr2 = this.f41355e;
                if (i11 >= c4941s6Arr2.length) {
                    break;
                }
                C4941s6 c4941s6 = c4941s6Arr2[i11];
                if (c4941s6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c4941s6) + iComputeSerializedSize;
                }
                i11++;
            }
        }
        int i12 = this.f41356f;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i12);
        }
        C4812n6 c4812n6 = this.f41357g;
        if (c4812n6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c4812n6);
        }
        if (!Arrays.equals(this.f41358h, f41349n)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f41358h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        C4786m6[] c4786m6Arr = this.f41359j;
        if (c4786m6Arr != null && c4786m6Arr.length > 0) {
            while (true) {
                C4786m6[] c4786m6Arr2 = this.f41359j;
                if (i10 >= c4786m6Arr2.length) {
                    break;
                }
                C4786m6 c4786m6 = c4786m6Arr2[i10];
                if (c4786m6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c4786m6) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4992u6 c4992u6 = this.f41351a;
        if (c4992u6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4992u6);
        }
        C4734k6 c4734k6 = this.f41352b;
        if (c4734k6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4734k6);
        }
        if (!this.f41353c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f41353c);
        }
        int i = this.f41354d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C4941s6[] c4941s6Arr = this.f41355e;
        int i10 = 0;
        if (c4941s6Arr != null && c4941s6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4941s6[] c4941s6Arr2 = this.f41355e;
                if (i11 >= c4941s6Arr2.length) {
                    break;
                }
                C4941s6 c4941s6 = c4941s6Arr2[i11];
                if (c4941s6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c4941s6);
                }
                i11++;
            }
        }
        int i12 = this.f41356f;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i12);
        }
        C4812n6 c4812n6 = this.f41357g;
        if (c4812n6 != null) {
            codedOutputByteBufferNano.writeMessage(7, c4812n6);
        }
        if (!Arrays.equals(this.f41358h, f41349n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f41358h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        C4786m6[] c4786m6Arr = this.f41359j;
        if (c4786m6Arr != null && c4786m6Arr.length > 0) {
            while (true) {
                C4786m6[] c4786m6Arr2 = this.f41359j;
                if (i10 >= c4786m6Arr2.length) {
                    break;
                }
                C4786m6 c4786m6 = c4786m6Arr2[i10];
                if (c4786m6 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c4786m6);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4838o6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4838o6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4838o6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    if (this.f41351a == null) {
                        this.f41351a = new C4992u6();
                    }
                    codedInputByteBufferNano.readMessage(this.f41351a);
                    break;
                case 18:
                    if (this.f41352b == null) {
                        this.f41352b = new C4734k6();
                    }
                    codedInputByteBufferNano.readMessage(this.f41352b);
                    break;
                case 26:
                    this.f41353c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f41354d = int32;
                        break;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C4941s6[] c4941s6Arr = this.f41355e;
                    int length = c4941s6Arr == null ? 0 : c4941s6Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C4941s6[] c4941s6Arr2 = new C4941s6[i];
                    if (length != 0) {
                        System.arraycopy(c4941s6Arr, 0, c4941s6Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C4941s6 c4941s6 = new C4941s6();
                        c4941s6Arr2[length] = c4941s6;
                        codedInputByteBufferNano.readMessage(c4941s6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4941s6 c4941s62 = new C4941s6();
                    c4941s6Arr2[length] = c4941s62;
                    codedInputByteBufferNano.readMessage(c4941s62);
                    this.f41355e = c4941s6Arr2;
                    break;
                case 48:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f41356f = int322;
                        break;
                    }
                    break;
                case 58:
                    if (this.f41357g == null) {
                        this.f41357g = new C4812n6();
                    }
                    codedInputByteBufferNano.readMessage(this.f41357g);
                    break;
                case 66:
                    this.f41358h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C4786m6[] c4786m6Arr = this.f41359j;
                    int length2 = c4786m6Arr == null ? 0 : c4786m6Arr.length;
                    int i10 = repeatedFieldArrayLength2 + length2;
                    C4786m6[] c4786m6Arr2 = new C4786m6[i10];
                    if (length2 != 0) {
                        System.arraycopy(c4786m6Arr, 0, c4786m6Arr2, 0, length2);
                    }
                    while (length2 < i10 - 1) {
                        C4786m6 c4786m6 = new C4786m6();
                        c4786m6Arr2[length2] = c4786m6;
                        codedInputByteBufferNano.readMessage(c4786m6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C4786m6 c4786m62 = new C4786m6();
                    c4786m6Arr2[length2] = c4786m62;
                    codedInputByteBufferNano.readMessage(c4786m62);
                    this.f41359j = c4786m6Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static C4838o6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4838o6) MessageNano.mergeFrom(new C4838o6(), bArr);
    }
}

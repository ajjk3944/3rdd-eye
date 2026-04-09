package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.q6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4890q6 extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f41451l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f41452m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static volatile C4890q6[] f41453n;

    /* renamed from: o, reason: collision with root package name */
    public static byte[] f41454o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f41455p;

    /* renamed from: a, reason: collision with root package name */
    public C4992u6 f41456a;

    /* renamed from: b, reason: collision with root package name */
    public C4734k6 f41457b;

    /* renamed from: c, reason: collision with root package name */
    public String f41458c;

    /* renamed from: d, reason: collision with root package name */
    public int f41459d;

    /* renamed from: e, reason: collision with root package name */
    public C4941s6[] f41460e;

    /* renamed from: f, reason: collision with root package name */
    public String f41461f;

    /* renamed from: g, reason: collision with root package name */
    public int f41462g;

    /* renamed from: h, reason: collision with root package name */
    public C4864p6 f41463h;
    public byte[] i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f41464j;

    /* renamed from: k, reason: collision with root package name */
    public C4786m6[] f41465k;

    public C4890q6() {
        if (!f41455p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f41455p) {
                        f41454o = InternalNano.bytesDefaultValue("JVM");
                        f41455p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C4890q6[] b() {
        if (f41453n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41453n == null) {
                        f41453n = new C4890q6[0];
                    }
                } finally {
                }
            }
        }
        return f41453n;
    }

    public final C4890q6 a() {
        this.f41456a = null;
        this.f41457b = null;
        this.f41458c = "";
        this.f41459d = -1;
        this.f41460e = C4941s6.b();
        this.f41461f = "";
        this.f41462g = 0;
        this.f41463h = null;
        this.i = (byte[]) f41454o.clone();
        this.f41464j = WireFormatNano.EMPTY_BYTES;
        this.f41465k = C4786m6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4992u6 c4992u6 = this.f41456a;
        if (c4992u6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4992u6);
        }
        C4734k6 c4734k6 = this.f41457b;
        if (c4734k6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4734k6);
        }
        if (!this.f41458c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f41458c);
        }
        int i = this.f41459d;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C4941s6[] c4941s6Arr = this.f41460e;
        int i10 = 0;
        if (c4941s6Arr != null && c4941s6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4941s6[] c4941s6Arr2 = this.f41460e;
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
        if (!this.f41461f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f41461f);
        }
        int i12 = this.f41462g;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i12);
        }
        C4864p6 c4864p6 = this.f41463h;
        if (c4864p6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c4864p6);
        }
        if (!Arrays.equals(this.i, f41454o)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        if (!Arrays.equals(this.f41464j, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f41464j);
        }
        C4786m6[] c4786m6Arr = this.f41465k;
        if (c4786m6Arr != null && c4786m6Arr.length > 0) {
            while (true) {
                C4786m6[] c4786m6Arr2 = this.f41465k;
                if (i10 >= c4786m6Arr2.length) {
                    break;
                }
                C4786m6 c4786m6 = c4786m6Arr2[i10];
                if (c4786m6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c4786m6) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4992u6 c4992u6 = this.f41456a;
        if (c4992u6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4992u6);
        }
        C4734k6 c4734k6 = this.f41457b;
        if (c4734k6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4734k6);
        }
        if (!this.f41458c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f41458c);
        }
        int i = this.f41459d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C4941s6[] c4941s6Arr = this.f41460e;
        int i10 = 0;
        if (c4941s6Arr != null && c4941s6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C4941s6[] c4941s6Arr2 = this.f41460e;
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
        if (!this.f41461f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f41461f);
        }
        int i12 = this.f41462g;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i12);
        }
        C4864p6 c4864p6 = this.f41463h;
        if (c4864p6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c4864p6);
        }
        if (!Arrays.equals(this.i, f41454o)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if (!Arrays.equals(this.f41464j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f41464j);
        }
        C4786m6[] c4786m6Arr = this.f41465k;
        if (c4786m6Arr != null && c4786m6Arr.length > 0) {
            while (true) {
                C4786m6[] c4786m6Arr2 = this.f41465k;
                if (i10 >= c4786m6Arr2.length) {
                    break;
                }
                C4786m6 c4786m6 = c4786m6Arr2[i10];
                if (c4786m6 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c4786m6);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4890q6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4890q6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4890q6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    if (this.f41456a == null) {
                        this.f41456a = new C4992u6();
                    }
                    codedInputByteBufferNano.readMessage(this.f41456a);
                    break;
                case 18:
                    if (this.f41457b == null) {
                        this.f41457b = new C4734k6();
                    }
                    codedInputByteBufferNano.readMessage(this.f41457b);
                    break;
                case 26:
                    this.f41458c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f41459d = int32;
                        break;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C4941s6[] c4941s6Arr = this.f41460e;
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
                    this.f41460e = c4941s6Arr2;
                    break;
                case 50:
                    this.f41461f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f41462g = int322;
                        break;
                    }
                case 66:
                    if (this.f41463h == null) {
                        this.f41463h = new C4864p6();
                    }
                    codedInputByteBufferNano.readMessage(this.f41463h);
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f41464j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C4786m6[] c4786m6Arr = this.f41465k;
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
                    this.f41465k = c4786m6Arr2;
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

    public static C4890q6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4890q6) MessageNano.mergeFrom(new C4890q6(), bArr);
    }
}

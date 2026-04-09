package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.t9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4970t9 extends MessageNano {

    /* renamed from: n, reason: collision with root package name */
    public static volatile C4970t9[] f41676n;

    /* renamed from: a, reason: collision with root package name */
    public String f41677a;

    /* renamed from: b, reason: collision with root package name */
    public String f41678b;

    /* renamed from: c, reason: collision with root package name */
    public String f41679c;

    /* renamed from: d, reason: collision with root package name */
    public int f41680d;

    /* renamed from: e, reason: collision with root package name */
    public String f41681e;

    /* renamed from: f, reason: collision with root package name */
    public String f41682f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41683g;

    /* renamed from: h, reason: collision with root package name */
    public int f41684h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f41685j;

    /* renamed from: k, reason: collision with root package name */
    public int f41686k;

    /* renamed from: l, reason: collision with root package name */
    public C4944s9[] f41687l;

    /* renamed from: m, reason: collision with root package name */
    public String f41688m;

    public C4970t9() {
        a();
    }

    public static C4970t9[] b() {
        if (f41676n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41676n == null) {
                        f41676n = new C4970t9[0];
                    }
                } finally {
                }
            }
        }
        return f41676n;
    }

    public final C4970t9 a() {
        this.f41677a = "";
        this.f41678b = "";
        this.f41679c = "";
        this.f41680d = 0;
        this.f41681e = "";
        this.f41682f = "";
        this.f41683g = false;
        this.f41684h = 0;
        this.i = "";
        this.f41685j = "";
        this.f41686k = 0;
        this.f41687l = C4944s9.b();
        this.f41688m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f41677a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f41677a);
        }
        if (!this.f41678b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f41678b);
        }
        if (!this.f41679c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f41679c);
        }
        int i = this.f41680d;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        if (!this.f41681e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f41681e);
        }
        if (!this.f41682f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f41682f);
        }
        boolean z10 = this.f41683g;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z10);
        }
        int i10 = this.f41684h;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i10);
        }
        if (!this.i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.i);
        }
        if (!this.f41685j.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f41685j);
        }
        int i11 = this.f41686k;
        if (i11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i11);
        }
        C4944s9[] c4944s9Arr = this.f41687l;
        if (c4944s9Arr != null && c4944s9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4944s9[] c4944s9Arr2 = this.f41687l;
                if (i12 >= c4944s9Arr2.length) {
                    break;
                }
                C4944s9 c4944s9 = c4944s9Arr2[i12];
                if (c4944s9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c4944s9) + iComputeSerializedSize;
                }
                i12++;
            }
        }
        return !this.f41688m.equals("") ? CodedOutputByteBufferNano.computeStringSize(24, this.f41688m) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f41677a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f41677a);
        }
        if (!this.f41678b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f41678b);
        }
        if (!this.f41679c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f41679c);
        }
        int i = this.f41680d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        if (!this.f41681e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f41681e);
        }
        if (!this.f41682f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f41682f);
        }
        boolean z10 = this.f41683g;
        if (z10) {
            codedOutputByteBufferNano.writeBool(17, z10);
        }
        int i10 = this.f41684h;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i10);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.i);
        }
        if (!this.f41685j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f41685j);
        }
        int i11 = this.f41686k;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i11);
        }
        C4944s9[] c4944s9Arr = this.f41687l;
        if (c4944s9Arr != null && c4944s9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C4944s9[] c4944s9Arr2 = this.f41687l;
                if (i12 >= c4944s9Arr2.length) {
                    break;
                }
                C4944s9 c4944s9 = c4944s9Arr2[i12];
                if (c4944s9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c4944s9);
                }
                i12++;
            }
        }
        if (!this.f41688m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f41688m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4970t9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4970t9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4970t9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f41677a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f41678b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f41679c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f41680d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f41681e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f41682f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f41683g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f41684h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f41685j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f41686k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C4944s9[] c4944s9Arr = this.f41687l;
                    int length = c4944s9Arr == null ? 0 : c4944s9Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C4944s9[] c4944s9Arr2 = new C4944s9[i];
                    if (length != 0) {
                        System.arraycopy(c4944s9Arr, 0, c4944s9Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C4944s9 c4944s9 = new C4944s9();
                        c4944s9Arr2[length] = c4944s9;
                        codedInputByteBufferNano.readMessage(c4944s9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4944s9 c4944s92 = new C4944s9();
                    c4944s9Arr2[length] = c4944s92;
                    codedInputByteBufferNano.readMessage(c4944s92);
                    this.f41687l = c4944s9Arr2;
                    break;
                case 194:
                    this.f41688m = codedInputByteBufferNano.readString();
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

    public static C4970t9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4970t9) MessageNano.mergeFrom(new C4970t9(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5045w9 extends MessageNano {

    /* renamed from: A, reason: collision with root package name */
    public static final int f41917A = 17;

    /* renamed from: B, reason: collision with root package name */
    public static final int f41918B = 18;

    /* renamed from: C, reason: collision with root package name */
    public static final int f41919C = 19;

    /* renamed from: D, reason: collision with root package name */
    public static final int f41920D = 20;

    /* renamed from: E, reason: collision with root package name */
    public static final int f41921E = 21;

    /* renamed from: F, reason: collision with root package name */
    public static final int f41922F = 25;

    /* renamed from: G, reason: collision with root package name */
    public static final int f41923G = 26;

    /* renamed from: H, reason: collision with root package name */
    public static final int f41924H = 27;

    /* renamed from: I, reason: collision with root package name */
    public static final int f41925I = 29;

    /* renamed from: J, reason: collision with root package name */
    public static final int f41926J = 35;

    /* renamed from: K, reason: collision with root package name */
    public static final int f41927K = 38;

    /* renamed from: L, reason: collision with root package name */
    public static final int f41928L = 40;

    /* renamed from: M, reason: collision with root package name */
    public static final int f41929M = 42;

    /* renamed from: N, reason: collision with root package name */
    public static final int f41930N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final int f41931O = 1;

    /* renamed from: P, reason: collision with root package name */
    public static final int f41932P = 2;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f41933Q = 0;

    /* renamed from: R, reason: collision with root package name */
    public static final int f41934R = 1;

    /* renamed from: S, reason: collision with root package name */
    public static final int f41935S = 2;

    /* renamed from: T, reason: collision with root package name */
    public static volatile C5045w9[] f41936T = null;

    /* renamed from: t, reason: collision with root package name */
    public static final int f41937t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f41938u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f41939v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f41940w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f41941x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final int f41942y = 13;

    /* renamed from: z, reason: collision with root package name */
    public static final int f41943z = 16;

    /* renamed from: a, reason: collision with root package name */
    public long f41944a;

    /* renamed from: b, reason: collision with root package name */
    public long f41945b;

    /* renamed from: c, reason: collision with root package name */
    public int f41946c;

    /* renamed from: d, reason: collision with root package name */
    public String f41947d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f41948e;

    /* renamed from: f, reason: collision with root package name */
    public C4918r9 f41949f;

    /* renamed from: g, reason: collision with root package name */
    public C5020v9 f41950g;

    /* renamed from: h, reason: collision with root package name */
    public String f41951h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f41952j;

    /* renamed from: k, reason: collision with root package name */
    public int f41953k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f41954l;

    /* renamed from: m, reason: collision with root package name */
    public int f41955m;

    /* renamed from: n, reason: collision with root package name */
    public long f41956n;

    /* renamed from: o, reason: collision with root package name */
    public long f41957o;

    /* renamed from: p, reason: collision with root package name */
    public int f41958p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f41959q;

    /* renamed from: r, reason: collision with root package name */
    public long f41960r;

    /* renamed from: s, reason: collision with root package name */
    public C4995u9[] f41961s;

    public C5045w9() {
        a();
    }

    public static C5045w9[] b() {
        if (f41936T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41936T == null) {
                        f41936T = new C5045w9[0];
                    }
                } finally {
                }
            }
        }
        return f41936T;
    }

    public final C5045w9 a() {
        this.f41944a = 0L;
        this.f41945b = 0L;
        this.f41946c = 0;
        this.f41947d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f41948e = bArr;
        this.f41949f = null;
        this.f41950g = null;
        this.f41951h = "";
        this.i = 0;
        this.f41952j = 0;
        this.f41953k = -1;
        this.f41954l = bArr;
        this.f41955m = -1;
        this.f41956n = 0L;
        this.f41957o = 0L;
        this.f41958p = 0;
        this.f41959q = false;
        this.f41960r = 1L;
        this.f41961s = C4995u9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f41946c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f41945b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f41944a) + super.computeSerializedSize();
        if (!this.f41947d.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f41947d);
        }
        byte[] bArr = this.f41948e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f41948e);
        }
        C4918r9 c4918r9 = this.f41949f;
        if (c4918r9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c4918r9);
        }
        C5020v9 c5020v9 = this.f41950g;
        if (c5020v9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c5020v9);
        }
        if (!this.f41951h.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f41951h);
        }
        int i = this.i;
        if (i != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i);
        }
        int i10 = this.f41952j;
        if (i10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i10);
        }
        int i11 = this.f41953k;
        if (i11 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i11);
        }
        if (!Arrays.equals(this.f41954l, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f41954l);
        }
        int i12 = this.f41955m;
        if (i12 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i12);
        }
        long j4 = this.f41956n;
        if (j4 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j4);
        }
        long j10 = this.f41957o;
        if (j10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j10);
        }
        int i13 = this.f41958p;
        if (i13 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i13);
        }
        boolean z10 = this.f41959q;
        if (z10) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z10);
        }
        long j11 = this.f41960r;
        if (j11 != 1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j11);
        }
        C4995u9[] c4995u9Arr = this.f41961s;
        if (c4995u9Arr != null && c4995u9Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C4995u9[] c4995u9Arr2 = this.f41961s;
                if (i14 >= c4995u9Arr2.length) {
                    break;
                }
                C4995u9 c4995u9 = c4995u9Arr2[i14];
                if (c4995u9 != null) {
                    iComputeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c4995u9) + iComputeUInt32Size;
                }
                i14++;
            }
        }
        return iComputeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f41944a);
        codedOutputByteBufferNano.writeUInt64(2, this.f41945b);
        codedOutputByteBufferNano.writeUInt32(3, this.f41946c);
        if (!this.f41947d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f41947d);
        }
        byte[] bArr = this.f41948e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f41948e);
        }
        C4918r9 c4918r9 = this.f41949f;
        if (c4918r9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4918r9);
        }
        C5020v9 c5020v9 = this.f41950g;
        if (c5020v9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c5020v9);
        }
        if (!this.f41951h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f41951h);
        }
        int i = this.i;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i);
        }
        int i10 = this.f41952j;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i10);
        }
        int i11 = this.f41953k;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i11);
        }
        if (!Arrays.equals(this.f41954l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f41954l);
        }
        int i12 = this.f41955m;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i12);
        }
        long j4 = this.f41956n;
        if (j4 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j4);
        }
        long j10 = this.f41957o;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j10);
        }
        int i13 = this.f41958p;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i13);
        }
        boolean z10 = this.f41959q;
        if (z10) {
            codedOutputByteBufferNano.writeBool(23, z10);
        }
        long j11 = this.f41960r;
        if (j11 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j11);
        }
        C4995u9[] c4995u9Arr = this.f41961s;
        if (c4995u9Arr != null && c4995u9Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C4995u9[] c4995u9Arr2 = this.f41961s;
                if (i14 >= c4995u9Arr2.length) {
                    break;
                }
                C4995u9 c4995u9 = c4995u9Arr2[i14];
                if (c4995u9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c4995u9);
                }
                i14++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5045w9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5045w9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5045w9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f41944a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f41945b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f41946c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f41947d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f41948e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f41949f == null) {
                        this.f41949f = new C4918r9();
                    }
                    codedInputByteBufferNano.readMessage(this.f41949f);
                    break;
                case 58:
                    if (this.f41950g == null) {
                        this.f41950g = new C5020v9();
                    }
                    codedInputByteBufferNano.readMessage(this.f41950g);
                    break;
                case 66:
                    this.f41951h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != 0 && int32 != 1 && int32 != 2) {
                        break;
                    } else {
                        this.f41952j = int32;
                        break;
                    }
                    break;
                case 104:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != -1 && int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f41953k = int322;
                        break;
                    }
                    break;
                case 114:
                    this.f41954l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int int323 = codedInputByteBufferNano.readInt32();
                    if (int323 != -1 && int323 != 0 && int323 != 1) {
                        break;
                    } else {
                        this.f41955m = int323;
                        break;
                    }
                case 128:
                    this.f41956n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f41957o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int int324 = codedInputByteBufferNano.readInt32();
                    if (int324 != 0 && int324 != 1 && int324 != 2) {
                        break;
                    } else {
                        this.f41958p = int324;
                        break;
                    }
                    break;
                case 184:
                    this.f41959q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f41960r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C4995u9[] c4995u9Arr = this.f41961s;
                    int length = c4995u9Arr == null ? 0 : c4995u9Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C4995u9[] c4995u9Arr2 = new C4995u9[i];
                    if (length != 0) {
                        System.arraycopy(c4995u9Arr, 0, c4995u9Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C4995u9 c4995u9 = new C4995u9();
                        c4995u9Arr2[length] = c4995u9;
                        codedInputByteBufferNano.readMessage(c4995u9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4995u9 c4995u92 = new C4995u9();
                    c4995u9Arr2[length] = c4995u92;
                    codedInputByteBufferNano.readMessage(c4995u92);
                    this.f41961s = c4995u9Arr2;
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

    public static C5045w9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5045w9) MessageNano.mergeFrom(new C5045w9(), bArr);
    }
}

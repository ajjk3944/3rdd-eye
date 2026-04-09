package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5008um extends MessageNano {

    /* renamed from: E, reason: collision with root package name */
    public static final int f41788E = -1;

    /* renamed from: F, reason: collision with root package name */
    public static final int f41789F = 0;

    /* renamed from: G, reason: collision with root package name */
    public static final int f41790G = 1;

    /* renamed from: H, reason: collision with root package name */
    public static volatile C5008um[] f41791H;

    /* renamed from: A, reason: collision with root package name */
    public C4750km f41792A;

    /* renamed from: B, reason: collision with root package name */
    public C4957sm f41793B;

    /* renamed from: C, reason: collision with root package name */
    public C4906qm[] f41794C;

    /* renamed from: D, reason: collision with root package name */
    public C4854om f41795D;

    /* renamed from: a, reason: collision with root package name */
    public String f41796a;

    /* renamed from: b, reason: collision with root package name */
    public long f41797b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f41798c;

    /* renamed from: d, reason: collision with root package name */
    public String f41799d;

    /* renamed from: e, reason: collision with root package name */
    public String f41800e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f41801f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f41802g;

    /* renamed from: h, reason: collision with root package name */
    public C4828nm[] f41803h;
    public C4880pm i;

    /* renamed from: j, reason: collision with root package name */
    public String f41804j;

    /* renamed from: k, reason: collision with root package name */
    public String f41805k;

    /* renamed from: l, reason: collision with root package name */
    public String f41806l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f41807m;

    /* renamed from: n, reason: collision with root package name */
    public String f41808n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f41809o;

    /* renamed from: p, reason: collision with root package name */
    public C4983tm f41810p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f41811q;

    /* renamed from: r, reason: collision with root package name */
    public String f41812r;

    /* renamed from: s, reason: collision with root package name */
    public long f41813s;

    /* renamed from: t, reason: collision with root package name */
    public long f41814t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41815u;

    /* renamed from: v, reason: collision with root package name */
    public C4931rm f41816v;

    /* renamed from: w, reason: collision with root package name */
    public int f41817w;

    /* renamed from: x, reason: collision with root package name */
    public int f41818x;

    /* renamed from: y, reason: collision with root package name */
    public C4802mm f41819y;

    /* renamed from: z, reason: collision with root package name */
    public C4776lm f41820z;

    public C5008um() {
        a();
    }

    public static C5008um[] b() {
        if (f41791H == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f41791H == null) {
                        f41791H = new C5008um[0];
                    }
                } finally {
                }
            }
        }
        return f41791H;
    }

    public final C5008um a() {
        this.f41796a = "";
        this.f41797b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f41798c = strArr;
        this.f41799d = "";
        this.f41800e = "";
        this.f41801f = strArr;
        this.f41802g = strArr;
        this.f41803h = C4828nm.b();
        this.i = null;
        this.f41804j = "";
        this.f41805k = "";
        this.f41806l = "";
        this.f41807m = false;
        this.f41808n = "";
        this.f41809o = strArr;
        this.f41810p = null;
        this.f41811q = false;
        this.f41812r = "";
        this.f41813s = 0L;
        this.f41814t = 0L;
        this.f41815u = false;
        this.f41816v = null;
        this.f41817w = 600;
        this.f41818x = 1;
        this.f41819y = null;
        this.f41820z = null;
        this.f41792A = null;
        this.f41793B = null;
        this.f41794C = C4906qm.b();
        this.f41795D = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f41796a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f41796a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f41797b) + iComputeSerializedSize;
        String[] strArr = this.f41798c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            int iComputeStringSizeNoTag = 0;
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f41798c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    i11++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i10++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag + i11;
        }
        if (!this.f41799d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f41799d);
        }
        if (!this.f41800e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f41800e);
        }
        String[] strArr3 = this.f41801f;
        if (strArr3 != null && strArr3.length > 0) {
            int i12 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i13 = 0;
            while (true) {
                String[] strArr4 = this.f41801f;
                if (i12 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i12];
                if (str2 != null) {
                    i13++;
                    iComputeStringSizeNoTag2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i12++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag2 + i13;
        }
        String[] strArr5 = this.f41802g;
        if (strArr5 != null && strArr5.length > 0) {
            int i14 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i15 = 0;
            while (true) {
                String[] strArr6 = this.f41802g;
                if (i14 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i14];
                if (str3 != null) {
                    i15++;
                    iComputeStringSizeNoTag3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i14++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag3 + i15;
        }
        C4828nm[] c4828nmArr = this.f41803h;
        if (c4828nmArr != null && c4828nmArr.length > 0) {
            int i16 = 0;
            while (true) {
                C4828nm[] c4828nmArr2 = this.f41803h;
                if (i16 >= c4828nmArr2.length) {
                    break;
                }
                C4828nm c4828nm = c4828nmArr2[i16];
                if (c4828nm != null) {
                    iComputeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c4828nm) + iComputeInt64Size;
                }
                i16++;
            }
        }
        C4880pm c4880pm = this.i;
        if (c4880pm != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c4880pm);
        }
        if (!this.f41804j.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f41804j);
        }
        if (!this.f41805k.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f41805k);
        }
        if (!this.f41806l.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f41806l);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f41807m) + iComputeInt64Size;
        if (!this.f41808n.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f41808n);
        }
        String[] strArr7 = this.f41809o;
        if (strArr7 != null && strArr7.length > 0) {
            int i17 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i18 = 0;
            while (true) {
                String[] strArr8 = this.f41809o;
                if (i17 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i17];
                if (str4 != null) {
                    i18++;
                    iComputeStringSizeNoTag4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i17++;
            }
            iComputeBoolSize = iComputeBoolSize + iComputeStringSizeNoTag4 + i18;
        }
        C4983tm c4983tm = this.f41810p;
        if (c4983tm != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c4983tm);
        }
        boolean z10 = this.f41811q;
        if (z10) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z10);
        }
        if (!this.f41812r.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f41812r);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f41814t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f41813s) + iComputeBoolSize;
        boolean z11 = this.f41815u;
        if (z11) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z11);
        }
        C4931rm c4931rm = this.f41816v;
        if (c4931rm != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c4931rm);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f41818x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f41817w) + iComputeInt64Size2;
        C4802mm c4802mm = this.f41819y;
        if (c4802mm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c4802mm);
        }
        C4776lm c4776lm = this.f41820z;
        if (c4776lm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(28, c4776lm);
        }
        C4750km c4750km = this.f41792A;
        if (c4750km != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c4750km);
        }
        C4957sm c4957sm = this.f41793B;
        if (c4957sm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c4957sm);
        }
        C4906qm[] c4906qmArr = this.f41794C;
        if (c4906qmArr != null && c4906qmArr.length > 0) {
            while (true) {
                C4906qm[] c4906qmArr2 = this.f41794C;
                if (i >= c4906qmArr2.length) {
                    break;
                }
                C4906qm c4906qm = c4906qmArr2[i];
                if (c4906qm != null) {
                    iComputeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c4906qm) + iComputeInt32Size;
                }
                i++;
            }
        }
        C4854om c4854om = this.f41795D;
        return c4854om != null ? CodedOutputByteBufferNano.computeMessageSize(32, c4854om) + iComputeInt32Size : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f41796a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f41796a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f41797b);
        String[] strArr = this.f41798c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f41798c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i10++;
            }
        }
        if (!this.f41799d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f41799d);
        }
        if (!this.f41800e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f41800e);
        }
        String[] strArr3 = this.f41801f;
        if (strArr3 != null && strArr3.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr4 = this.f41801f;
                if (i11 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i11];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i11++;
            }
        }
        String[] strArr5 = this.f41802g;
        if (strArr5 != null && strArr5.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr6 = this.f41802g;
                if (i12 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i12];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i12++;
            }
        }
        C4828nm[] c4828nmArr = this.f41803h;
        if (c4828nmArr != null && c4828nmArr.length > 0) {
            int i13 = 0;
            while (true) {
                C4828nm[] c4828nmArr2 = this.f41803h;
                if (i13 >= c4828nmArr2.length) {
                    break;
                }
                C4828nm c4828nm = c4828nmArr2[i13];
                if (c4828nm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c4828nm);
                }
                i13++;
            }
        }
        C4880pm c4880pm = this.i;
        if (c4880pm != null) {
            codedOutputByteBufferNano.writeMessage(9, c4880pm);
        }
        if (!this.f41804j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f41804j);
        }
        if (!this.f41805k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f41805k);
        }
        if (!this.f41806l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f41806l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f41807m);
        if (!this.f41808n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f41808n);
        }
        String[] strArr7 = this.f41809o;
        if (strArr7 != null && strArr7.length > 0) {
            int i14 = 0;
            while (true) {
                String[] strArr8 = this.f41809o;
                if (i14 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i14];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i14++;
            }
        }
        C4983tm c4983tm = this.f41810p;
        if (c4983tm != null) {
            codedOutputByteBufferNano.writeMessage(16, c4983tm);
        }
        boolean z10 = this.f41811q;
        if (z10) {
            codedOutputByteBufferNano.writeBool(17, z10);
        }
        if (!this.f41812r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f41812r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f41813s);
        codedOutputByteBufferNano.writeInt64(22, this.f41814t);
        boolean z11 = this.f41815u;
        if (z11) {
            codedOutputByteBufferNano.writeBool(23, z11);
        }
        C4931rm c4931rm = this.f41816v;
        if (c4931rm != null) {
            codedOutputByteBufferNano.writeMessage(24, c4931rm);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f41817w);
        codedOutputByteBufferNano.writeInt32(26, this.f41818x);
        C4802mm c4802mm = this.f41819y;
        if (c4802mm != null) {
            codedOutputByteBufferNano.writeMessage(27, c4802mm);
        }
        C4776lm c4776lm = this.f41820z;
        if (c4776lm != null) {
            codedOutputByteBufferNano.writeMessage(28, c4776lm);
        }
        C4750km c4750km = this.f41792A;
        if (c4750km != null) {
            codedOutputByteBufferNano.writeMessage(29, c4750km);
        }
        C4957sm c4957sm = this.f41793B;
        if (c4957sm != null) {
            codedOutputByteBufferNano.writeMessage(30, c4957sm);
        }
        C4906qm[] c4906qmArr = this.f41794C;
        if (c4906qmArr != null && c4906qmArr.length > 0) {
            while (true) {
                C4906qm[] c4906qmArr2 = this.f41794C;
                if (i >= c4906qmArr2.length) {
                    break;
                }
                C4906qm c4906qm = c4906qmArr2[i];
                if (c4906qm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c4906qm);
                }
                i++;
            }
        }
        C4854om c4854om = this.f41795D;
        if (c4854om != null) {
            codedOutputByteBufferNano.writeMessage(32, c4854om);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5008um b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5008um().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5008um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f41796a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f41797b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f41798c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f41798c = strArr2;
                    break;
                case 34:
                    this.f41799d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f41800e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f41801f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i10 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i10];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i10 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f41801f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f41802g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i11 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i11];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i11 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f41802g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C4828nm[] c4828nmArr = this.f41803h;
                    int length4 = c4828nmArr == null ? 0 : c4828nmArr.length;
                    int i12 = repeatedFieldArrayLength4 + length4;
                    C4828nm[] c4828nmArr2 = new C4828nm[i12];
                    if (length4 != 0) {
                        System.arraycopy(c4828nmArr, 0, c4828nmArr2, 0, length4);
                    }
                    while (length4 < i12 - 1) {
                        C4828nm c4828nm = new C4828nm();
                        c4828nmArr2[length4] = c4828nm;
                        codedInputByteBufferNano.readMessage(c4828nm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C4828nm c4828nm2 = new C4828nm();
                    c4828nmArr2[length4] = c4828nm2;
                    codedInputByteBufferNano.readMessage(c4828nm2);
                    this.f41803h = c4828nmArr2;
                    break;
                case 74:
                    if (this.i == null) {
                        this.i = new C4880pm();
                    }
                    codedInputByteBufferNano.readMessage(this.i);
                    break;
                case 82:
                    this.f41804j = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.f41805k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f41806l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f41807m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f41808n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f41809o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i13 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i13];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i13 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f41809o = strArr8;
                    break;
                case 130:
                    if (this.f41810p == null) {
                        this.f41810p = new C4983tm();
                    }
                    codedInputByteBufferNano.readMessage(this.f41810p);
                    break;
                case 136:
                    this.f41811q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f41812r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f41813s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f41814t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f41815u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f41816v == null) {
                        this.f41816v = new C4931rm();
                    }
                    codedInputByteBufferNano.readMessage(this.f41816v);
                    break;
                case 200:
                    this.f41817w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f41818x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f41819y == null) {
                        this.f41819y = new C4802mm();
                    }
                    codedInputByteBufferNano.readMessage(this.f41819y);
                    break;
                case 226:
                    if (this.f41820z == null) {
                        this.f41820z = new C4776lm();
                    }
                    codedInputByteBufferNano.readMessage(this.f41820z);
                    break;
                case 234:
                    if (this.f41792A == null) {
                        this.f41792A = new C4750km();
                    }
                    codedInputByteBufferNano.readMessage(this.f41792A);
                    break;
                case 242:
                    if (this.f41793B == null) {
                        this.f41793B = new C4957sm();
                    }
                    codedInputByteBufferNano.readMessage(this.f41793B);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C4906qm[] c4906qmArr = this.f41794C;
                    int length6 = c4906qmArr == null ? 0 : c4906qmArr.length;
                    int i14 = repeatedFieldArrayLength6 + length6;
                    C4906qm[] c4906qmArr2 = new C4906qm[i14];
                    if (length6 != 0) {
                        System.arraycopy(c4906qmArr, 0, c4906qmArr2, 0, length6);
                    }
                    while (length6 < i14 - 1) {
                        C4906qm c4906qm = new C4906qm();
                        c4906qmArr2[length6] = c4906qm;
                        codedInputByteBufferNano.readMessage(c4906qm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C4906qm c4906qm2 = new C4906qm();
                    c4906qmArr2[length6] = c4906qm2;
                    codedInputByteBufferNano.readMessage(c4906qm2);
                    this.f41794C = c4906qmArr2;
                    break;
                case 258:
                    if (this.f41795D == null) {
                        this.f41795D = new C4854om();
                    }
                    codedInputByteBufferNano.readMessage(this.f41795D);
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

    public static C5008um a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5008um) MessageNano.mergeFrom(new C5008um(), bArr);
    }
}

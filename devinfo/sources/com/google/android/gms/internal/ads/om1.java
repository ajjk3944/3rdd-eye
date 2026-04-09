package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class om1 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final StringReader f14742a;

    /* renamed from: h, reason: collision with root package name */
    public long f14748h;

    /* renamed from: i, reason: collision with root package name */
    public int f14749i;
    public int[] j;

    /* renamed from: l, reason: collision with root package name */
    public String[] f14751l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f14752m;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f14743b = new char[Segment.SHARE_MINIMUM];

    /* renamed from: c, reason: collision with root package name */
    public int f14744c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f14745d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f14746e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f14747f = 0;
    public int g = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f14750k = 1;

    public om1(StringReader stringReader) {
        int[] iArr = new int[32];
        this.j = iArr;
        iArr[0] = 6;
        this.f14751l = new String[32];
        this.f14752m = new int[32];
        this.f14742a = stringReader;
    }

    public final boolean A(int i4) throws IOException {
        int i10;
        int i11 = this.f14747f;
        int i12 = this.f14744c;
        this.f14747f = i11 - i12;
        int i13 = this.f14745d;
        char[] cArr = this.f14743b;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f14745d = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f14745d = 0;
        }
        this.f14744c = 0;
        do {
            int i15 = this.f14745d;
            int i16 = this.f14742a.read(cArr, i15, 1024 - i15);
            if (i16 == -1) {
                return false;
            }
            i10 = this.f14745d + i16;
            this.f14745d = i10;
            if (this.f14746e == 0 && this.f14747f == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f14744c++;
                this.f14747f = 1;
                i4++;
            }
        } while (i10 < i4);
        return true;
    }

    public final int E(boolean z3) throws IOException {
        int i4 = this.f14744c;
        int i10 = this.f14745d;
        while (true) {
            if (i4 == i10) {
                this.f14744c = i4;
                if (!A(1)) {
                    if (z3) {
                        throw new EOFException("End of input".concat(g()));
                    }
                    return -1;
                }
                i4 = this.f14744c;
                i10 = this.f14745d;
            }
            int i11 = i4 + 1;
            char c9 = this.f14743b[i4];
            if (c9 == '\n') {
                this.f14746e++;
                this.f14747f = i11;
            } else if (c9 != ' ' && c9 != '\r' && c9 != '\t') {
                if (c9 != '/') {
                    if (c9 != '#') {
                        this.f14744c = i11;
                        return c9;
                    }
                    this.f14744c = i11;
                    F();
                    throw null;
                }
                this.f14744c = i11;
                if (i11 == i10) {
                    this.f14744c = i4;
                    boolean zA = A(2);
                    this.f14744c++;
                    if (!zA) {
                        return 47;
                    }
                }
                F();
                throw null;
            }
            i4 = i11;
        }
    }

    public final void F() throws androidx.datastore.preferences.protobuf.l {
        G("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void G(String str) throws androidx.datastore.preferences.protobuf.l {
        String strG = g();
        throw new androidx.datastore.preferences.protobuf.l(r5.c.m(new StringBuilder(str.length() + strG.length() + 79), str, strG, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException L(String str) throws IOException {
        int iM = m();
        String strE = mq0.e(m());
        String strG = g();
        int iF = r5.c.f(str.length() + 18, strG.length(), strE);
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iM == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb2 = new StringBuilder(strConcat.length() + iF + 5);
        je.u.B(sb2, "Expected ", str, " but was ", strE);
        return new IllegalStateException(r5.c.m(sb2, strG, "\nSee ", strConcat));
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0164, code lost:
    
        r24 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b8, code lost:
    
        if (p(r13) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01bc, code lost:
    
        if (r9 != 2) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01be, code lost:
    
        if (r10 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c4, code lost:
    
        if (r24 != Long.MIN_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c6, code lost:
    
        if (r19 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c8, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ca, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01cc, code lost:
    
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01d0, code lost:
    
        if (r24 != 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01d2, code lost:
    
        if (r6 != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d7, code lost:
    
        if (r6 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d9, code lost:
    
        r7 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01dc, code lost:
    
        r7 = -r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01dd, code lost:
    
        r26.f14748h = r7;
        r26.f14744c += r4;
        r7 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e6, code lost:
    
        r26.g = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01e9, code lost:
    
        if (r9 == 2) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01ec, code lost:
    
        if (r9 == 4) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01ef, code lost:
    
        if (r9 != 7) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01f1, code lost:
    
        r26.f14749i = r4;
        r7 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0234 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.om1.c():int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.g = 0;
        this.j[0] = 8;
        this.f14750k = 1;
        this.f14742a.close();
    }

    public final String e() throws IOException {
        String str;
        int iC = this.g;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 10) {
            str = w();
        } else if (iC == 8) {
            str = v('\'');
        } else if (iC == 9) {
            str = v('\"');
        } else if (iC == 11) {
            str = null;
        } else if (iC == 15) {
            str = Long.toString(this.f14748h);
        } else {
            if (iC != 16) {
                throw L("a string");
            }
            str = new String(this.f14743b, this.f14744c, this.f14749i);
            this.f14744c += this.f14749i;
        }
        this.g = 0;
        int[] iArr = this.f14752m;
        int i4 = this.f14750k - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    public final String g() {
        int i4 = this.f14746e + 1;
        int i10 = this.f14744c - this.f14747f;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < this.f14750k; i11++) {
            int i12 = this.j[i11];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f14752m[i11];
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f14751l[i11];
                    if (str != null) {
                        sb2.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(d.h.q(i12, "Unknown scope value: ", new StringBuilder(String.valueOf(i12).length() + 21)));
            }
        }
        int i14 = i10 + 1;
        String string = sb2.toString();
        int length = String.valueOf(i4).length();
        int length2 = String.valueOf(i14).length();
        StringBuilder sb3 = new StringBuilder(string.length() + length2 + length + 17 + 6);
        r5.c.q(i4, i14, " at line ", " column ", sb3);
        return d.h.w(sb3, " path ", string);
    }

    public final int m() throws IOException {
        int iC = this.g;
        if (iC == 0) {
            iC = c();
        }
        switch (iC) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final boolean p(char c9) throws androidx.datastore.preferences.protobuf.l {
        if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
            return false;
        }
        if (c9 != '#') {
            if (c9 == ',') {
                return false;
            }
            if (c9 != '/' && c9 != '=') {
                if (c9 == '{' || c9 == '}' || c9 == ':') {
                    return false;
                }
                if (c9 != ';') {
                    switch (c9) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        F();
        throw null;
    }

    public final String toString() {
        return om1.class.getSimpleName().concat(g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0112, code lost:
    
        r4 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0114, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0116, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0122, code lost:
    
        r1.append(r7, r3, r4);
        r11.f14744c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String v(char r12) throws androidx.datastore.preferences.protobuf.l {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.om1.v(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        r0 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String w() throws androidx.datastore.preferences.protobuf.l {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            int r4 = r7.f14744c
            int r4 = r4 + r2
            int r5 = r7.f14745d
            char[] r6 = r7.f14743b
            if (r4 >= r5) goto L4d
            char r4 = r6[r4]
            r5 = 9
            if (r4 == r5) goto L5a
            r5 = 10
            if (r4 == r5) goto L5a
            r5 = 12
            if (r4 == r5) goto L5a
            r5 = 13
            if (r4 == r5) goto L5a
            r5 = 32
            if (r4 == r5) goto L5a
            r5 = 35
            if (r4 == r5) goto L49
            r5 = 44
            if (r4 == r5) goto L5a
            r5 = 47
            if (r4 == r5) goto L49
            r5 = 61
            if (r4 == r5) goto L49
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L5a
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L5a
            r5 = 58
            if (r4 == r5) goto L5a
            r5 = 59
            if (r4 == r5) goto L49
            switch(r4) {
                case 91: goto L5a;
                case 92: goto L49;
                case 93: goto L5a;
                default: goto L46;
            }
        L46:
            int r2 = r2 + 1
            goto L4
        L49:
            r7.F()
            throw r1
        L4d:
            r4 = 1024(0x400, float:1.435E-42)
            if (r2 >= r4) goto L5c
            int r4 = r2 + 1
            boolean r4 = r7.A(r4)
            if (r4 == 0) goto L5a
            goto L4
        L5a:
            r0 = r2
            goto L7a
        L5c:
            if (r3 != 0) goto L69
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 16
            int r4 = java.lang.Math.max(r2, r4)
            r3.<init>(r4)
        L69:
            int r4 = r7.f14744c
            r3.append(r6, r4, r2)
            int r4 = r7.f14744c
            int r4 = r4 + r2
            r7.f14744c = r4
            r2 = 1
            boolean r2 = r7.A(r2)
            if (r2 != 0) goto L93
        L7a:
            if (r3 != 0) goto L84
            java.lang.String r1 = new java.lang.String
            int r2 = r7.f14744c
            r1.<init>(r6, r2, r0)
            goto L8d
        L84:
            int r1 = r7.f14744c
            r3.append(r6, r1, r0)
            java.lang.String r1 = r3.toString()
        L8d:
            int r2 = r7.f14744c
            int r2 = r2 + r0
            r7.f14744c = r2
            return r1
        L93:
            r2 = r0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.om1.w():java.lang.String");
    }

    public final void y(int i4) throws androidx.datastore.preferences.protobuf.l {
        int i10 = this.f14750k;
        if (i10 - 1 >= 1280) {
            String strG = g();
            throw new androidx.datastore.preferences.protobuf.l(d.h.w(new StringBuilder(strG.length() + 26), "Nesting limit 1280 reached", strG));
        }
        int[] iArr = this.j;
        if (i10 == iArr.length) {
            int i11 = i10 + i10;
            this.j = Arrays.copyOf(iArr, i11);
            this.f14752m = Arrays.copyOf(this.f14752m, i11);
            this.f14751l = (String[]) Arrays.copyOf(this.f14751l, i11);
        }
        int[] iArr2 = this.j;
        int i12 = this.f14750k;
        this.f14750k = i12 + 1;
        iArr2[i12] = i4;
    }
}

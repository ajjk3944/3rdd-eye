package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class CK implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final StringReader f7570a;

    /* renamed from: h, reason: collision with root package name */
    public long f7577h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f7578j;

    /* renamed from: l, reason: collision with root package name */
    public String[] f7580l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f7581m;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f7571b = new char[1024];

    /* renamed from: c, reason: collision with root package name */
    public int f7572c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f7573d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f7574e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f7575f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f7576g = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f7579k = 1;

    public CK(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f7578j = iArr;
        iArr[0] = 6;
        this.f7580l = new String[32];
        this.f7581m = new int[32];
        this.f7570a = stringReader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0164, code lost:
    
        r24 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b8, code lost:
    
        if (h(r13) == false) goto L141;
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
    
        r26.f7577h = r7;
        r26.f7572c += r4;
        r7 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e6, code lost:
    
        r26.f7576g = r7;
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
    
        r26.i = r4;
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
    public final int a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CK.a():int");
    }

    public final String b() throws IOException {
        String str;
        int iA = this.f7576g;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 10) {
            str = m();
        } else if (iA == 8) {
            str = k('\'');
        } else if (iA == 9) {
            str = k('\"');
        } else if (iA == 11) {
            str = null;
        } else if (iA == 15) {
            str = Long.toString(this.f7577h);
        } else {
            if (iA != 16) {
                throw s("a string");
            }
            str = new String(this.f7571b, this.f7572c, this.i);
            this.f7572c += this.i;
        }
        this.f7576g = 0;
        int[] iArr = this.f7581m;
        int i = this.f7579k - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7576g = 0;
        this.f7578j[0] = 8;
        this.f7579k = 1;
        this.f7570a.close();
    }

    public final String d() {
        int i = this.f7574e + 1;
        int i3 = this.f7572c - this.f7575f;
        StringBuilder sb = new StringBuilder("$");
        for (int i6 = 0; i6 < this.f7579k; i6++) {
            int i7 = this.f7578j[i6];
            switch (i7) {
                case 1:
                case 2:
                    int i8 = this.f7581m[i6];
                    sb.append('[');
                    sb.append(i8);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f7580l[i6];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(A.f.i(i7, "Unknown scope value: ", new StringBuilder(String.valueOf(i7).length() + 21)));
            }
        }
        int i9 = i3 + 1;
        String string = sb.toString();
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i9).length();
        StringBuilder sb2 = new StringBuilder(string.length() + length2 + length + 17 + 6);
        AbstractC2763b.h(sb2, " at line ", i, " column ", i9);
        return A.f.p(sb2, " path ", string);
    }

    public final int e() throws IOException {
        int iA = this.f7576g;
        if (iA == 0) {
            iA = a();
        }
        switch (iA) {
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

    public final boolean h(char c6) throws EK {
        if (c6 == '\t' || c6 == '\n' || c6 == '\f' || c6 == '\r' || c6 == ' ') {
            return false;
        }
        if (c6 != '#') {
            if (c6 == ',') {
                return false;
            }
            if (c6 != '/' && c6 != '=') {
                if (c6 == '{' || c6 == '}' || c6 == ':') {
                    return false;
                }
                if (c6 != ';') {
                    switch (c6) {
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
        q();
        throw null;
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
        r11.f7572c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k(char r12) throws com.google.android.gms.internal.ads.EK {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CK.k(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        q();
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
    public final java.lang.String m() throws com.google.android.gms.internal.ads.EK {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            int r4 = r7.f7572c
            int r4 = r4 + r2
            int r5 = r7.f7573d
            char[] r6 = r7.f7571b
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
            r7.q()
            throw r1
        L4d:
            r4 = 1024(0x400, float:1.435E-42)
            if (r2 >= r4) goto L5c
            int r4 = r2 + 1
            boolean r4 = r7.o(r4)
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
            int r4 = r7.f7572c
            r3.append(r6, r4, r2)
            int r4 = r7.f7572c
            int r4 = r4 + r2
            r7.f7572c = r4
            r2 = 1
            boolean r2 = r7.o(r2)
            if (r2 != 0) goto L93
        L7a:
            if (r3 != 0) goto L84
            java.lang.String r1 = new java.lang.String
            int r2 = r7.f7572c
            r1.<init>(r6, r2, r0)
            goto L8d
        L84:
            int r1 = r7.f7572c
            r3.append(r6, r1, r0)
            java.lang.String r1 = r3.toString()
        L8d:
            int r2 = r7.f7572c
            int r2 = r2 + r0
            r7.f7572c = r2
            return r1
        L93:
            r2 = r0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CK.m():java.lang.String");
    }

    public final void n(int i) throws EK {
        int i3 = this.f7579k;
        if (i3 - 1 >= 1280) {
            String strD = d();
            throw new EK(A.f.p(new StringBuilder(strD.length() + 26), "Nesting limit 1280 reached", strD));
        }
        int[] iArr = this.f7578j;
        if (i3 == iArr.length) {
            int i6 = i3 + i3;
            this.f7578j = Arrays.copyOf(iArr, i6);
            this.f7581m = Arrays.copyOf(this.f7581m, i6);
            this.f7580l = (String[]) Arrays.copyOf(this.f7580l, i6);
        }
        int[] iArr2 = this.f7578j;
        int i7 = this.f7579k;
        this.f7579k = i7 + 1;
        iArr2[i7] = i;
    }

    public final boolean o(int i) throws IOException {
        int i3;
        int i6 = this.f7575f;
        int i7 = this.f7572c;
        this.f7575f = i6 - i7;
        int i8 = this.f7573d;
        char[] cArr = this.f7571b;
        if (i8 != i7) {
            int i9 = i8 - i7;
            this.f7573d = i9;
            System.arraycopy(cArr, i7, cArr, 0, i9);
        } else {
            this.f7573d = 0;
        }
        this.f7572c = 0;
        do {
            int i10 = this.f7573d;
            int i11 = this.f7570a.read(cArr, i10, 1024 - i10);
            if (i11 == -1) {
                return false;
            }
            i3 = this.f7573d + i11;
            this.f7573d = i3;
            if (this.f7574e == 0 && this.f7575f == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f7572c++;
                this.f7575f = 1;
                i++;
            }
        } while (i3 < i);
        return true;
    }

    public final int p(boolean z6) throws IOException {
        int i = this.f7572c;
        int i3 = this.f7573d;
        while (true) {
            if (i == i3) {
                this.f7572c = i;
                if (!o(1)) {
                    if (z6) {
                        throw new EOFException("End of input".concat(d()));
                    }
                    return -1;
                }
                i = this.f7572c;
                i3 = this.f7573d;
            }
            int i6 = i + 1;
            char c6 = this.f7571b[i];
            if (c6 == '\n') {
                this.f7574e++;
                this.f7575f = i6;
            } else if (c6 != ' ' && c6 != '\r' && c6 != '\t') {
                if (c6 != '/') {
                    if (c6 != '#') {
                        this.f7572c = i6;
                        return c6;
                    }
                    this.f7572c = i6;
                    q();
                    throw null;
                }
                this.f7572c = i6;
                if (i6 == i3) {
                    this.f7572c = i;
                    boolean zO = o(2);
                    this.f7572c++;
                    if (!zO) {
                        return 47;
                    }
                }
                q();
                throw null;
            }
            i = i6;
        }
    }

    public final void q() throws EK {
        r("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void r(String str) throws EK {
        String strD = d();
        throw new EK(AbstractC1135f5.n(new StringBuilder(str.length() + strD.length() + 79), str, strD, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException s(String str) throws IOException {
        int iE = e();
        String strE = AbstractC0582Jp.e(e());
        String strD = d();
        int iB = AbstractC2763b.b(str.length() + 18, strD.length(), strE);
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iE == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(strConcat.length() + iB + 5);
        A.f.w(sb, "Expected ", str, " but was ", strE);
        return new IllegalStateException(AbstractC1135f5.n(sb, strD, "\nSee ", strConcat));
    }

    public final String toString() {
        return CK.class.getSimpleName().concat(d());
    }
}

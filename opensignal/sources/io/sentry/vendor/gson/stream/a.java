package io.sentry.vendor.gson.stream;

import androidx.datastore.preferences.protobuf.m;
import g4.j;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Closeable {
    public long E;
    public int F;
    public String G;
    public int[] H;
    public String[] J;
    public int[] K;

    /* renamed from: a, reason: collision with root package name */
    public final Reader f12838a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12839d = false;

    /* renamed from: g, reason: collision with root package name */
    public final char[] f12840g = new char[1024];

    /* renamed from: r, reason: collision with root package name */
    public int f12841r = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f12842x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f12843y = 0;
    public int B = 0;
    public int D = 0;
    public int I = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.H = iArr;
        iArr[0] = 6;
        this.J = new String[32];
        this.K = new int[32];
        this.f12838a = reader;
    }

    public final boolean G() throws IOException {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public final boolean L(char c4) throws m {
        if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
            return false;
        }
        if (c4 != '#') {
            if (c4 == ',') {
                return false;
            }
            if (c4 != '/' && c4 != '=') {
                if (c4 == '{' || c4 == '}' || c4 == ':') {
                    return false;
                }
                if (c4 != ';') {
                    switch (c4) {
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
        h();
        return false;
    }

    public final String R() {
        int i10 = this.f12843y + 1;
        int i11 = (this.f12841r - this.B) + 1;
        StringBuilder sb2 = new StringBuilder(" at line ");
        sb2.append(i10);
        sb2.append(" column ");
        sb2.append(i11);
        sb2.append(" path ");
        StringBuilder sb3 = new StringBuilder("$");
        int i12 = this.I;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = this.H[i13];
            if (i14 == 1 || i14 == 2) {
                sb3.append('[');
                sb3.append(this.K[i13]);
                sb3.append(']');
            } else if (i14 == 3 || i14 == 4 || i14 == 5) {
                sb3.append('.');
                String str = this.J[i13];
                if (str != null) {
                    sb3.append(str);
                }
            }
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public final boolean V() throws IOException {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 5) {
            this.D = 0;
            int[] iArr = this.K;
            int i11 = this.I - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + s0() + R());
        }
        this.D = 0;
        int[] iArr2 = this.K;
        int i12 = this.I - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return false;
    }

    public final double Y() throws IOException, NumberFormatException {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 15) {
            this.D = 0;
            int[] iArr = this.K;
            int i11 = this.I - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.E;
        }
        if (i10 == 16) {
            this.G = new String(this.f12840g, this.f12841r, this.F);
            this.f12841r += this.F;
        } else if (i10 == 8 || i10 == 9) {
            this.G = p0(i10 == 8 ? '\'' : '\"');
        } else if (i10 == 10) {
            this.G = r0();
        } else if (i10 != 11) {
            throw new IllegalStateException("Expected a double but was " + s0() + R());
        }
        this.D = 11;
        double d6 = Double.parseDouble(this.G);
        if (!this.f12839d && (Double.isNaN(d6) || Double.isInfinite(d6))) {
            throw new m("JSON forbids NaN and infinities: " + d6 + R());
        }
        this.G = null;
        this.D = 0;
        int[] iArr2 = this.K;
        int i12 = this.I - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return d6;
    }

    public final int Z() throws IOException, NumberFormatException {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 15) {
            long j = this.E;
            int i11 = (int) j;
            if (j != i11) {
                throw new NumberFormatException("Expected an int but was " + this.E + R());
            }
            this.D = 0;
            int[] iArr = this.K;
            int i12 = this.I - 1;
            iArr[i12] = iArr[i12] + 1;
            return i11;
        }
        if (i10 == 16) {
            this.G = new String(this.f12840g, this.f12841r, this.F);
            this.f12841r += this.F;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected an int but was " + s0() + R());
            }
            if (i10 == 10) {
                this.G = r0();
            } else {
                this.G = p0(i10 == 8 ? '\'' : '\"');
            }
            try {
                int i13 = Integer.parseInt(this.G);
                this.D = 0;
                int[] iArr2 = this.K;
                int i14 = this.I - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        }
        this.D = 11;
        double d6 = Double.parseDouble(this.G);
        int i15 = (int) d6;
        if (i15 != d6) {
            throw new NumberFormatException("Expected an int but was " + this.G + R());
        }
        this.G = null;
        this.D = 0;
        int[] iArr3 = this.K;
        int i16 = this.I - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return i15;
    }

    public final void b() {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 3) {
            t0(1);
            this.K[this.I - 1] = 0;
            this.D = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + s0() + R());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.D = 0;
        this.H[0] = 8;
        this.I = 1;
        this.f12838a.close();
    }

    public final void f() {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 1) {
            t0(3);
            this.D = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + s0() + R());
        }
    }

    public final long f0() throws IOException, NumberFormatException {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 15) {
            this.D = 0;
            int[] iArr = this.K;
            int i11 = this.I - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.E;
        }
        if (i10 == 16) {
            this.G = new String(this.f12840g, this.f12841r, this.F);
            this.f12841r += this.F;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected a long but was " + s0() + R());
            }
            if (i10 == 10) {
                this.G = r0();
            } else {
                this.G = p0(i10 == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.G);
                this.D = 0;
                int[] iArr2 = this.K;
                int i12 = this.I - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.D = 11;
        double d6 = Double.parseDouble(this.G);
        long j7 = (long) d6;
        if (j7 != d6) {
            throw new NumberFormatException("Expected a long but was " + this.G + R());
        }
        this.G = null;
        this.D = 0;
        int[] iArr3 = this.K;
        int i13 = this.I - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j7;
    }

    public final void h() throws m {
        if (this.f12839d) {
            return;
        }
        x0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0215, code lost:
    
        if (L(r1) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.i():int");
    }

    public final String i0() throws IOException {
        String strP0;
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 14) {
            strP0 = r0();
        } else if (i10 == 12) {
            strP0 = p0('\'');
        } else {
            if (i10 != 13) {
                throw new IllegalStateException("Expected a name but was " + s0() + R());
            }
            strP0 = p0('\"');
        }
        this.D = 0;
        this.J[this.I - 1] = strP0;
        return strP0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n0(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.n0(boolean):int");
    }

    public final void o0() {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 != 7) {
            throw new IllegalStateException("Expected null but was " + s0() + R());
        }
        this.D = 0;
        int[] iArr = this.K;
        int i11 = this.I - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f12841r = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.f12841r = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String p0(char r11) throws androidx.datastore.preferences.protobuf.m {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f12841r
            int r3 = r10.f12842x
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r10.f12840g
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r7[r2]
            if (r2 != r11) goto L29
            r10.f12841r = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L21:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f12841r = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L3f:
            r1.append(r7, r3, r2)
            char r2 = r10.u0()
            r1.append(r2)
            int r2 = r10.f12841r
            int r3 = r10.f12842x
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f12843y
            int r2 = r2 + r6
            r10.f12843y = r2
            r10.B = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r10.f12841r = r2
            boolean r2 = r10.y(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.x0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.p0(char):java.lang.String");
    }

    public final void q() {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + s0() + R());
        }
        int i11 = this.I;
        this.I = i11 - 1;
        int[] iArr = this.K;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.D = 0;
    }

    public final String q0() {
        String str;
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 10) {
            str = r0();
        } else if (i10 == 8) {
            str = p0('\'');
        } else if (i10 == 9) {
            str = p0('\"');
        } else if (i10 == 11) {
            str = this.G;
            this.G = null;
        } else if (i10 == 15) {
            str = Long.toString(this.E);
        } else {
            if (i10 != 16) {
                throw new IllegalStateException("Expected a string but was " + s0() + R());
            }
            str = new String(this.f12840g, this.f12841r, this.F);
            this.f12841r += this.F;
        }
        this.D = 0;
        int[] iArr = this.K;
        int i11 = this.I - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        h();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String r0() throws androidx.datastore.preferences.protobuf.m {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f12841r
            int r4 = r3 + r2
            int r5 = r7.f12842x
            char[] r6 = r7.f12840g
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.h()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.y(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f12841r
            r0.append(r6, r3, r2)
            int r3 = r7.f12841r
            int r3 = r3 + r2
            r7.f12841r = r3
            r2 = 1
            boolean r2 = r7.y(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f12841r
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f12841r
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f12841r
            int r2 = r2 + r1
            r7.f12841r = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.r0():java.lang.String");
    }

    public final b s0() throws IOException {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case j.STRING_FIELD_NUMBER /* 5 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return b.BOOLEAN;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return b.NULL;
            case j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void t0(int i10) {
        int i11 = this.I;
        int[] iArr = this.H;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.H = Arrays.copyOf(iArr, i12);
            this.K = Arrays.copyOf(this.K, i12);
            this.J = (String[]) Arrays.copyOf(this.J, i12);
        }
        int[] iArr2 = this.H;
        int i13 = this.I;
        this.I = i13 + 1;
        iArr2[i13] = i10;
    }

    public final String toString() {
        return a.class.getSimpleName() + R();
    }

    public final char u0() throws m {
        int i10;
        if (this.f12841r == this.f12842x && !y(1)) {
            x0("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f12841r;
        int i12 = i11 + 1;
        this.f12841r = i12;
        char[] cArr = this.f12840g;
        char c4 = cArr[i11];
        if (c4 == '\n') {
            this.f12843y++;
            this.B = i12;
            return c4;
        }
        if (c4 == '\"' || c4 == '\'' || c4 == '/' || c4 == '\\') {
            return c4;
        }
        if (c4 == 'b') {
            return '\b';
        }
        if (c4 == 'f') {
            return '\f';
        }
        if (c4 == 'n') {
            return '\n';
        }
        if (c4 == 'r') {
            return '\r';
        }
        if (c4 == 't') {
            return '\t';
        }
        if (c4 != 'u') {
            x0("Invalid escape sequence");
            throw null;
        }
        if (i11 + 5 > this.f12842x && !y(4)) {
            x0("Unterminated escape sequence");
            throw null;
        }
        int i13 = this.f12841r;
        int i14 = i13 + 4;
        char c10 = 0;
        while (i13 < i14) {
            char c11 = cArr[i13];
            char c12 = (char) (c10 << 4);
            if (c11 >= '0' && c11 <= '9') {
                i10 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i10 = c11 - 'W';
            } else {
                if (c11 < 'A' || c11 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f12841r, 4)));
                }
                i10 = c11 - '7';
            }
            c10 = (char) (i10 + c12);
            i13++;
        }
        this.f12841r += 4;
        return c10;
    }

    public final void v0(char c4) throws m {
        do {
            int i10 = this.f12841r;
            int i11 = this.f12842x;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c10 = this.f12840g[i10];
                if (c10 == c4) {
                    this.f12841r = i12;
                    return;
                }
                if (c10 == '\\') {
                    this.f12841r = i12;
                    u0();
                    i10 = this.f12841r;
                    i11 = this.f12842x;
                } else {
                    if (c10 == '\n') {
                        this.f12843y++;
                        this.B = i12;
                    }
                    i10 = i12;
                }
            }
            this.f12841r = i10;
        } while (y(1));
        x0("Unterminated string");
        throw null;
    }

    public final void w() {
        int i10 = this.D;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + s0() + R());
        }
        int i11 = this.I;
        int i12 = i11 - 1;
        this.I = i12;
        this.J[i12] = null;
        int[] iArr = this.K;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.D = 0;
    }

    public final void w0() {
        char c4;
        do {
            if (this.f12841r >= this.f12842x && !y(1)) {
                return;
            }
            int i10 = this.f12841r;
            int i11 = i10 + 1;
            this.f12841r = i11;
            c4 = this.f12840g[i10];
            if (c4 == '\n') {
                this.f12843y++;
                this.B = i11;
                return;
            }
        } while (c4 != '\r');
    }

    public final void x0(String str) throws m {
        StringBuilder sbT = c7.a.t(str);
        sbT.append(R());
        throw new m(sbT.toString());
    }

    public final boolean y(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.B;
        int i14 = this.f12841r;
        this.B = i13 - i14;
        int i15 = this.f12842x;
        char[] cArr = this.f12840g;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f12842x = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f12842x = 0;
        }
        this.f12841r = 0;
        do {
            int i17 = this.f12842x;
            int i18 = this.f12838a.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f12842x + i18;
            this.f12842x = i11;
            if (this.f12843y == 0 && (i12 = this.B) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f12841r++;
                this.B = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }
}

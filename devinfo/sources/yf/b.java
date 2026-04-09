package yf;

import com.applovin.shadow.okio.Segment;
import d.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f37588a;

    /* renamed from: h, reason: collision with root package name */
    public long f37594h;

    /* renamed from: i, reason: collision with root package name */
    public int f37595i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f37596k;

    /* renamed from: m, reason: collision with root package name */
    public String[] f37598m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f37599n;

    /* renamed from: o, reason: collision with root package name */
    public int f37600o = 2;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f37589b = new char[Segment.SHARE_MINIMUM];

    /* renamed from: c, reason: collision with root package name */
    public int f37590c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f37591d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f37592e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f37593f = 0;
    public int g = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f37597l = 1;

    static {
        a.f37587a = new a();
    }

    public b(Reader reader) {
        int[] iArr = new int[32];
        this.f37596k = iArr;
        iArr[0] = 6;
        this.f37598m = new String[32];
        this.f37599n = new int[32];
        this.f37588a = reader;
    }

    public final boolean A() throws IOException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        return (iM == 2 || iM == 4 || iM == 17) ? false : true;
    }

    public final boolean E(char c9) throws d {
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
        g();
        return false;
    }

    public final String F() {
        StringBuilder sbN = r5.c.n(this.f37592e + 1, " at line ", " column ", (this.f37590c - this.f37593f) + 1, " path ");
        sbN.append(y(false));
        return sbN.toString();
    }

    public final boolean G() throws IOException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM == 5) {
            this.g = 0;
            int[] iArr = this.f37599n;
            int i4 = this.f37597l - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        }
        if (iM != 6) {
            throw h0("a boolean");
        }
        this.g = 0;
        int[] iArr2 = this.f37599n;
        int i10 = this.f37597l - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return false;
    }

    public final double L() throws IOException, NumberFormatException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM == 15) {
            this.g = 0;
            int[] iArr = this.f37599n;
            int i4 = this.f37597l - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f37594h;
        }
        if (iM == 16) {
            this.j = new String(this.f37589b, this.f37590c, this.f37595i);
            this.f37590c += this.f37595i;
        } else if (iM == 8 || iM == 9) {
            this.j = W(iM == 8 ? '\'' : '\"');
        } else if (iM == 10) {
            this.j = Y();
        } else if (iM != 11) {
            throw h0("a double");
        }
        this.g = 11;
        double d10 = Double.parseDouble(this.j);
        if (this.f37600o != 1 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            g0("JSON forbids NaN and infinities: " + d10);
            throw null;
        }
        this.j = null;
        this.g = 0;
        int[] iArr2 = this.f37599n;
        int i10 = this.f37597l - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return d10;
    }

    public final int N() throws IOException, NumberFormatException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM == 15) {
            long j = this.f37594h;
            int i4 = (int) j;
            if (j != i4) {
                throw new NumberFormatException("Expected an int but was " + this.f37594h + F());
            }
            this.g = 0;
            int[] iArr = this.f37599n;
            int i10 = this.f37597l - 1;
            iArr[i10] = iArr[i10] + 1;
            return i4;
        }
        if (iM == 16) {
            this.j = new String(this.f37589b, this.f37590c, this.f37595i);
            this.f37590c += this.f37595i;
        } else {
            if (iM != 8 && iM != 9 && iM != 10) {
                throw h0("an int");
            }
            if (iM == 10) {
                this.j = Y();
            } else {
                this.j = W(iM == 8 ? '\'' : '\"');
            }
            try {
                int i11 = Integer.parseInt(this.j);
                this.g = 0;
                int[] iArr2 = this.f37599n;
                int i12 = this.f37597l - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        }
        this.g = 11;
        double d10 = Double.parseDouble(this.j);
        int i13 = (int) d10;
        if (i13 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.j + F());
        }
        this.j = null;
        this.g = 0;
        int[] iArr3 = this.f37599n;
        int i14 = this.f37597l - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return i13;
    }

    public final long O() throws IOException, NumberFormatException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM == 15) {
            this.g = 0;
            int[] iArr = this.f37599n;
            int i4 = this.f37597l - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f37594h;
        }
        if (iM == 16) {
            this.j = new String(this.f37589b, this.f37590c, this.f37595i);
            this.f37590c += this.f37595i;
        } else {
            if (iM != 8 && iM != 9 && iM != 10) {
                throw h0("a long");
            }
            if (iM == 10) {
                this.j = Y();
            } else {
                this.j = W(iM == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.j);
                this.g = 0;
                int[] iArr2 = this.f37599n;
                int i10 = this.f37597l - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.g = 11;
        double d10 = Double.parseDouble(this.j);
        long j8 = (long) d10;
        if (j8 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.j + F());
        }
        this.j = null;
        this.g = 0;
        int[] iArr3 = this.f37599n;
        int i11 = this.f37597l - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j8;
    }

    public final String T() throws IOException {
        String strW;
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM == 14) {
            strW = Y();
        } else if (iM == 12) {
            strW = W('\'');
        } else {
            if (iM != 13) {
                throw h0("a name");
            }
            strW = W('\"');
        }
        this.g = 0;
        this.f37598m[this.f37597l - 1] = strW;
        return strW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int U(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.b.U(boolean):int");
    }

    public final void V() throws IOException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM != 7) {
            throw h0("null");
        }
        this.g = 0;
        int[] iArr = this.f37599n;
        int i4 = this.f37597l - 1;
        iArr[i4] = iArr[i4] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.f37590c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f37590c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String W(char r12) throws yf.d {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f37590c
            int r3 = r11.f37591d
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f37589b
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.f37600o
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.g0(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.f37590c = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L31:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.f37590c = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.b0()
            r1.append(r2)
            int r2 = r11.f37590c
            int r3 = r11.f37591d
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.f37592e
            int r2 = r2 + r6
            r11.f37592e = r2
            r11.f37593f = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f37590c = r2
            boolean r2 = r11.w(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.g0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.b.W(char):java.lang.String");
    }

    public final String X() throws IOException {
        String str;
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM == 10) {
            str = Y();
        } else if (iM == 8) {
            str = W('\'');
        } else if (iM == 9) {
            str = W('\"');
        } else if (iM == 11) {
            str = this.j;
            this.j = null;
        } else if (iM == 15) {
            str = Long.toString(this.f37594h);
        } else {
            if (iM != 16) {
                throw h0("a string");
            }
            str = new String(this.f37589b, this.f37590c, this.f37595i);
            this.f37590c += this.f37595i;
        }
        this.g = 0;
        int[] iArr = this.f37599n;
        int i4 = this.f37597l - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        g();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String Y() throws yf.d {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f37590c
            int r4 = r3 + r2
            int r5 = r7.f37591d
            char[] r6 = r7.f37589b
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
            r7.g()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.w(r3)
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
            int r3 = r7.f37590c
            r0.append(r6, r3, r2)
            int r3 = r7.f37590c
            int r3 = r3 + r2
            r7.f37590c = r3
            r2 = 1
            boolean r2 = r7.w(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f37590c
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f37590c
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f37590c
            int r2 = r2 + r1
            r7.f37590c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.b.Y():java.lang.String");
    }

    public final int Z() throws IOException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        switch (iM) {
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
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void a0(int i4) throws d {
        int i10 = this.f37597l;
        if (i10 - 1 >= 255) {
            throw new d("Nesting limit 255 reached" + F());
        }
        int[] iArr = this.f37596k;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.f37596k = Arrays.copyOf(iArr, i11);
            this.f37599n = Arrays.copyOf(this.f37599n, i11);
            this.f37598m = (String[]) Arrays.copyOf(this.f37598m, i11);
        }
        int[] iArr2 = this.f37596k;
        int i12 = this.f37597l;
        this.f37597l = i12 + 1;
        iArr2[i12] = i4;
    }

    public final char b0() throws d {
        int i4;
        if (this.f37590c == this.f37591d && !w(1)) {
            g0("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f37590c;
        int i11 = i10 + 1;
        this.f37590c = i11;
        char[] cArr = this.f37589b;
        char c9 = cArr[i10];
        if (c9 != '\n') {
            if (c9 != '\"') {
                if (c9 != '\'') {
                    if (c9 != '/' && c9 != '\\') {
                        if (c9 == 'b') {
                            return '\b';
                        }
                        if (c9 == 'f') {
                            return '\f';
                        }
                        if (c9 == 'n') {
                            return '\n';
                        }
                        if (c9 == 'r') {
                            return '\r';
                        }
                        if (c9 == 't') {
                            return '\t';
                        }
                        if (c9 != 'u') {
                            g0("Invalid escape sequence");
                            throw null;
                        }
                        if (i10 + 5 > this.f37591d && !w(4)) {
                            g0("Unterminated escape sequence");
                            throw null;
                        }
                        int i12 = this.f37590c;
                        int i13 = i12 + 4;
                        int i14 = 0;
                        while (i12 < i13) {
                            char c10 = cArr[i12];
                            int i15 = i14 << 4;
                            if (c10 >= '0' && c10 <= '9') {
                                i4 = c10 - '0';
                            } else if (c10 >= 'a' && c10 <= 'f') {
                                i4 = c10 - 'W';
                            } else {
                                if (c10 < 'A' || c10 > 'F') {
                                    g0("Malformed Unicode escape \\u".concat(new String(cArr, this.f37590c, 4)));
                                    throw null;
                                }
                                i4 = c10 - '7';
                            }
                            i14 = i4 + i15;
                            i12++;
                        }
                        this.f37590c += 4;
                        return (char) i14;
                    }
                }
            }
            return c9;
        }
        if (this.f37600o == 3) {
            g0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f37592e++;
        this.f37593f = i11;
        if (this.f37600o == 3) {
            g0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c9;
    }

    public final void c() throws IOException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM != 3) {
            throw h0("BEGIN_ARRAY");
        }
        a0(1);
        this.f37599n[this.f37597l - 1] = 0;
        this.g = 0;
    }

    public final void c0(char c9) throws d {
        do {
            int i4 = this.f37590c;
            int i10 = this.f37591d;
            while (i4 < i10) {
                int i11 = i4 + 1;
                char c10 = this.f37589b[i4];
                if (c10 == c9) {
                    this.f37590c = i11;
                    return;
                }
                if (c10 == '\\') {
                    this.f37590c = i11;
                    b0();
                    i4 = this.f37590c;
                    i10 = this.f37591d;
                } else {
                    if (c10 == '\n') {
                        this.f37592e++;
                        this.f37593f = i11;
                    }
                    i4 = i11;
                }
            }
            this.f37590c = i4;
        } while (w(1));
        g0("Unterminated string");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.g = 0;
        this.f37596k[0] = 8;
        this.f37597l = 1;
        this.f37588a.close();
    }

    public final void d0() {
        char c9;
        do {
            if (this.f37590c >= this.f37591d && !w(1)) {
                return;
            }
            int i4 = this.f37590c;
            int i10 = i4 + 1;
            this.f37590c = i10;
            c9 = this.f37589b[i4];
            if (c9 == '\n') {
                this.f37592e++;
                this.f37593f = i10;
                return;
            }
        } while (c9 != '\r');
    }

    public final void e() throws IOException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM != 1) {
            throw h0("BEGIN_OBJECT");
        }
        a0(3);
        this.g = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0() throws yf.d {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f37590c
            int r2 = r1 + r0
            int r3 = r4.f37591d
            if (r2 >= r3) goto L51
            char[] r2 = r4.f37589b
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.g()
        L4b:
            int r1 = r4.f37590c
            int r1 = r1 + r0
            r4.f37590c = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f37590c = r1
            r0 = 1
            boolean r0 = r4.w(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.b.e0():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f0() throws IOException {
        int i4 = 0;
        do {
            int iM = this.g;
            if (iM == 0) {
                iM = m();
            }
            switch (iM) {
                case 1:
                    a0(3);
                    i4++;
                    this.g = 0;
                    break;
                case 2:
                    if (i4 == 0) {
                        this.f37598m[this.f37597l - 1] = null;
                    }
                    this.f37597l--;
                    i4--;
                    this.g = 0;
                    break;
                case 3:
                    a0(1);
                    i4++;
                    this.g = 0;
                    break;
                case 4:
                    this.f37597l--;
                    i4--;
                    this.g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.g = 0;
                    break;
                case 8:
                    c0('\'');
                    this.g = 0;
                    break;
                case 9:
                    c0('\"');
                    this.g = 0;
                    break;
                case 10:
                    e0();
                    this.g = 0;
                    break;
                case 12:
                    c0('\'');
                    if (i4 == 0) {
                        this.f37598m[this.f37597l - 1] = "<skipped>";
                    }
                    this.g = 0;
                    break;
                case 13:
                    c0('\"');
                    if (i4 == 0) {
                        this.f37598m[this.f37597l - 1] = "<skipped>";
                    }
                    this.g = 0;
                    break;
                case 14:
                    e0();
                    if (i4 == 0) {
                        this.f37598m[this.f37597l - 1] = "<skipped>";
                    }
                    this.g = 0;
                    break;
                case 16:
                    this.f37590c += this.f37595i;
                    this.g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i4 > 0);
        int[] iArr = this.f37599n;
        int i10 = this.f37597l - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final void g() throws d {
        if (this.f37600o == 1) {
            return;
        }
        g0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void g0(String str) throws d {
        StringBuilder sbZ = h.z(str);
        sbZ.append(F());
        sbZ.append("\nSee ");
        sbZ.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new d(sbZ.toString());
    }

    public final IllegalStateException h0(String str) {
        String str2 = Z() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbA = h.A("Expected ", str, " but was ");
        sbA.append(r5.c.v(Z()));
        sbA.append(F());
        sbA.append("\nSee ");
        sbA.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbA.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0218, code lost:
    
        if (E(r12) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.b.m():int");
    }

    public final void p() throws IOException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM != 4) {
            throw h0("END_ARRAY");
        }
        int i4 = this.f37597l;
        this.f37597l = i4 - 1;
        int[] iArr = this.f37599n;
        int i10 = i4 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.g = 0;
    }

    public final String toString() {
        return b.class.getSimpleName() + F();
    }

    public final void v() throws IOException {
        int iM = this.g;
        if (iM == 0) {
            iM = m();
        }
        if (iM != 2) {
            throw h0("END_OBJECT");
        }
        int i4 = this.f37597l;
        int i10 = i4 - 1;
        this.f37597l = i10;
        this.f37598m[i10] = null;
        int[] iArr = this.f37599n;
        int i11 = i4 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.g = 0;
    }

    public final boolean w(int i4) throws IOException {
        int i10;
        int i11;
        int i12 = this.f37593f;
        int i13 = this.f37590c;
        this.f37593f = i12 - i13;
        int i14 = this.f37591d;
        char[] cArr = this.f37589b;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f37591d = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f37591d = 0;
        }
        this.f37590c = 0;
        do {
            int i16 = this.f37591d;
            int i17 = this.f37588a.read(cArr, i16, cArr.length - i16);
            if (i17 == -1) {
                return false;
            }
            i10 = this.f37591d + i17;
            this.f37591d = i10;
            if (this.f37592e == 0 && (i11 = this.f37593f) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f37590c++;
                this.f37593f = i11 + 1;
                i4++;
            }
        } while (i10 < i4);
        return true;
    }

    public final String y(boolean z3) {
        StringBuilder sb2 = new StringBuilder("$");
        int i4 = 0;
        while (true) {
            int i10 = this.f37597l;
            if (i4 >= i10) {
                return sb2.toString();
            }
            int i11 = this.f37596k[i4];
            switch (i11) {
                case 1:
                case 2:
                    int i12 = this.f37599n[i4];
                    if (z3 && i12 > 0 && i4 == i10 - 1) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f37598m[i4];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(u.r(i11, "Unknown scope value: "));
            }
            i4++;
        }
    }
}

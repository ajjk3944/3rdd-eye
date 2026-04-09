package o4;

import b4.C0344i;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import x.AbstractC2984e;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2762a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final StringReader f22702a;

    /* renamed from: h, reason: collision with root package name */
    public long f22709h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public String f22710j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f22711k;

    /* renamed from: m, reason: collision with root package name */
    public String[] f22713m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f22714n;

    /* renamed from: C, reason: collision with root package name */
    public int f22701C = 2;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f22703b = new char[1024];

    /* renamed from: c, reason: collision with root package name */
    public int f22704c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f22705d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f22706e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f22707f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f22708g = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f22712l = 1;

    static {
        C0344i.f5754c = new C0344i(28);
    }

    public C2762a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f22711k = iArr;
        iArr[0] = 6;
        this.f22713m = new String[32];
        this.f22714n = new int[32];
        this.f22702a = stringReader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A() throws o4.C2765d {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f22704c
            int r4 = r3 + r2
            int r5 = r7.f22705d
            char[] r6 = r7.f22703b
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
            r7.d()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m(r3)
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
            int r3 = r7.f22704c
            r0.append(r6, r3, r2)
            int r3 = r7.f22704c
            int r3 = r3 + r2
            r7.f22704c = r3
            r2 = 1
            boolean r2 = r7.m(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f22704c
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f22704c
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f22704c
            int r2 = r2 + r1
            r7.f22704c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C2762a.A():java.lang.String");
    }

    public final int B() throws IOException {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        switch (iE) {
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

    public final void C(int i) throws C2765d {
        int i3 = this.f22712l;
        if (i3 - 1 >= 255) {
            throw new C2765d("Nesting limit 255 reached" + q());
        }
        int[] iArr = this.f22711k;
        if (i3 == iArr.length) {
            int i6 = i3 * 2;
            this.f22711k = Arrays.copyOf(iArr, i6);
            this.f22714n = Arrays.copyOf(this.f22714n, i6);
            this.f22713m = (String[]) Arrays.copyOf(this.f22713m, i6);
        }
        int[] iArr2 = this.f22711k;
        int i7 = this.f22712l;
        this.f22712l = i7 + 1;
        iArr2[i7] = i;
    }

    public final char D() throws C2765d {
        int i;
        if (this.f22704c == this.f22705d && !m(1)) {
            I("Unterminated escape sequence");
            throw null;
        }
        int i3 = this.f22704c;
        int i6 = i3 + 1;
        this.f22704c = i6;
        char[] cArr = this.f22703b;
        char c6 = cArr[i3];
        if (c6 != '\n') {
            if (c6 != '\"') {
                if (c6 != '\'') {
                    if (c6 != '/' && c6 != '\\') {
                        if (c6 == 'b') {
                            return '\b';
                        }
                        if (c6 == 'f') {
                            return '\f';
                        }
                        if (c6 == 'n') {
                            return '\n';
                        }
                        if (c6 == 'r') {
                            return '\r';
                        }
                        if (c6 == 't') {
                            return '\t';
                        }
                        if (c6 != 'u') {
                            I("Invalid escape sequence");
                            throw null;
                        }
                        if (i3 + 5 > this.f22705d && !m(4)) {
                            I("Unterminated escape sequence");
                            throw null;
                        }
                        int i7 = this.f22704c;
                        int i8 = i7 + 4;
                        int i9 = 0;
                        while (i7 < i8) {
                            char c7 = cArr[i7];
                            int i10 = i9 << 4;
                            if (c7 >= '0' && c7 <= '9') {
                                i = c7 - '0';
                            } else if (c7 >= 'a' && c7 <= 'f') {
                                i = c7 - 'W';
                            } else {
                                if (c7 < 'A' || c7 > 'F') {
                                    I("Malformed Unicode escape \\u".concat(new String(cArr, this.f22704c, 4)));
                                    throw null;
                                }
                                i = c7 - '7';
                            }
                            i9 = i + i10;
                            i7++;
                        }
                        this.f22704c += 4;
                        return (char) i9;
                    }
                }
            }
            return c6;
        }
        if (this.f22701C == 3) {
            I("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f22706e++;
        this.f22707f = i6;
        if (this.f22701C == 3) {
            I("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c6;
    }

    public final void E(char c6) throws C2765d {
        do {
            int i = this.f22704c;
            int i3 = this.f22705d;
            while (i < i3) {
                int i6 = i + 1;
                char c7 = this.f22703b[i];
                if (c7 == c6) {
                    this.f22704c = i6;
                    return;
                }
                if (c7 == '\\') {
                    this.f22704c = i6;
                    D();
                    i = this.f22704c;
                    i3 = this.f22705d;
                } else {
                    if (c7 == '\n') {
                        this.f22706e++;
                        this.f22707f = i6;
                    }
                    i = i6;
                }
            }
            this.f22704c = i;
        } while (m(1));
        I("Unterminated string");
        throw null;
    }

    public final void F() {
        char c6;
        do {
            if (this.f22704c >= this.f22705d && !m(1)) {
                return;
            }
            int i = this.f22704c;
            int i3 = i + 1;
            this.f22704c = i3;
            c6 = this.f22703b[i];
            if (c6 == '\n') {
                this.f22706e++;
                this.f22707f = i3;
                return;
            }
        } while (c6 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G() throws o4.C2765d {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f22704c
            int r2 = r1 + r0
            int r3 = r4.f22705d
            if (r2 >= r3) goto L51
            char[] r2 = r4.f22703b
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
            r4.d()
        L4b:
            int r1 = r4.f22704c
            int r1 = r1 + r0
            r4.f22704c = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f22704c = r1
            r0 = 1
            boolean r0 = r4.m(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C2762a.G():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void H() throws IOException {
        int i = 0;
        do {
            int iE = this.f22708g;
            if (iE == 0) {
                iE = e();
            }
            switch (iE) {
                case 1:
                    C(3);
                    i++;
                    this.f22708g = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f22713m[this.f22712l - 1] = null;
                    }
                    this.f22712l--;
                    i--;
                    this.f22708g = 0;
                    break;
                case 3:
                    C(1);
                    i++;
                    this.f22708g = 0;
                    break;
                case 4:
                    this.f22712l--;
                    i--;
                    this.f22708g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f22708g = 0;
                    break;
                case 8:
                    E('\'');
                    this.f22708g = 0;
                    break;
                case 9:
                    E('\"');
                    this.f22708g = 0;
                    break;
                case 10:
                    G();
                    this.f22708g = 0;
                    break;
                case 12:
                    E('\'');
                    if (i == 0) {
                        this.f22713m[this.f22712l - 1] = "<skipped>";
                    }
                    this.f22708g = 0;
                    break;
                case 13:
                    E('\"');
                    if (i == 0) {
                        this.f22713m[this.f22712l - 1] = "<skipped>";
                    }
                    this.f22708g = 0;
                    break;
                case 14:
                    G();
                    if (i == 0) {
                        this.f22713m[this.f22712l - 1] = "<skipped>";
                    }
                    this.f22708g = 0;
                    break;
                case 16:
                    this.f22704c += this.i;
                    this.f22708g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f22714n;
        int i3 = this.f22712l - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final void I(String str) throws C2765d {
        StringBuilder sbA = AbstractC2984e.a(str);
        sbA.append(q());
        sbA.append("\nSee ");
        sbA.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new C2765d(sbA.toString());
    }

    public final IllegalStateException J(String str) {
        String str2 = B() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbQ = AbstractC1135f5.q("Expected ", str, " but was ");
        sbQ.append(AbstractC2763b.j(B()));
        sbQ.append(q());
        sbQ.append("\nSee ");
        sbQ.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbQ.toString());
    }

    public final void a() throws IOException {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 3) {
            throw J("BEGIN_ARRAY");
        }
        C(1);
        this.f22714n[this.f22712l - 1] = 0;
        this.f22708g = 0;
    }

    public final void b() throws IOException {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 1) {
            throw J("BEGIN_OBJECT");
        }
        C(3);
        this.f22708g = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f22708g = 0;
        this.f22711k[0] = 8;
        this.f22712l = 1;
        this.f22702a.close();
    }

    public final void d() throws C2765d {
        if (this.f22701C == 1) {
            return;
        }
        I("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0218, code lost:
    
        if (p(r12) != false) goto L125;
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
    public final int e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C2762a.e():int");
    }

    public final void h() throws IOException {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 4) {
            throw J("END_ARRAY");
        }
        int i = this.f22712l;
        this.f22712l = i - 1;
        int[] iArr = this.f22714n;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f22708g = 0;
    }

    public final void k() throws IOException {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 2) {
            throw J("END_OBJECT");
        }
        int i = this.f22712l;
        int i3 = i - 1;
        this.f22712l = i3;
        this.f22713m[i3] = null;
        int[] iArr = this.f22714n;
        int i6 = i - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f22708g = 0;
    }

    public final boolean m(int i) throws IOException {
        int i3;
        int i6;
        int i7 = this.f22707f;
        int i8 = this.f22704c;
        this.f22707f = i7 - i8;
        int i9 = this.f22705d;
        char[] cArr = this.f22703b;
        if (i9 != i8) {
            int i10 = i9 - i8;
            this.f22705d = i10;
            System.arraycopy(cArr, i8, cArr, 0, i10);
        } else {
            this.f22705d = 0;
        }
        this.f22704c = 0;
        do {
            int i11 = this.f22705d;
            int i12 = this.f22702a.read(cArr, i11, cArr.length - i11);
            if (i12 == -1) {
                return false;
            }
            i3 = this.f22705d + i12;
            this.f22705d = i3;
            if (this.f22706e == 0 && (i6 = this.f22707f) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f22704c++;
                this.f22707f = i6 + 1;
                i++;
            }
        } while (i3 < i);
        return true;
    }

    public final String n(boolean z6) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i3 = this.f22712l;
            if (i >= i3) {
                return sb.toString();
            }
            int i6 = this.f22711k[i];
            switch (i6) {
                case 1:
                case 2:
                    int i7 = this.f22714n[i];
                    if (z6 && i7 > 0 && i == i3 - 1) {
                        i7--;
                    }
                    sb.append('[');
                    sb.append(i7);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f22713m[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(AbstractC1135f5.l(i6, "Unknown scope value: "));
            }
            i++;
        }
    }

    public final boolean o() throws IOException {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        return (iE == 2 || iE == 4 || iE == 17) ? false : true;
    }

    public final boolean p(char c6) throws C2765d {
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
        d();
        return false;
    }

    public final String q() {
        return " at line " + (this.f22706e + 1) + " column " + ((this.f22704c - this.f22707f) + 1) + " path " + n(false);
    }

    public final boolean r() throws IOException {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 5) {
            this.f22708g = 0;
            int[] iArr = this.f22714n;
            int i = this.f22712l - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iE != 6) {
            throw J("a boolean");
        }
        this.f22708g = 0;
        int[] iArr2 = this.f22714n;
        int i3 = this.f22712l - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final double s() throws IOException, NumberFormatException {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.f22708g = 0;
            int[] iArr = this.f22714n;
            int i = this.f22712l - 1;
            iArr[i] = iArr[i] + 1;
            return this.f22709h;
        }
        if (iE == 16) {
            this.f22710j = new String(this.f22703b, this.f22704c, this.i);
            this.f22704c += this.i;
        } else if (iE == 8 || iE == 9) {
            this.f22710j = y(iE == 8 ? '\'' : '\"');
        } else if (iE == 10) {
            this.f22710j = A();
        } else if (iE != 11) {
            throw J("a double");
        }
        this.f22708g = 11;
        double d6 = Double.parseDouble(this.f22710j);
        if (this.f22701C != 1 && (Double.isNaN(d6) || Double.isInfinite(d6))) {
            I("JSON forbids NaN and infinities: " + d6);
            throw null;
        }
        this.f22710j = null;
        this.f22708g = 0;
        int[] iArr2 = this.f22714n;
        int i3 = this.f22712l - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d6;
    }

    public final int t() throws IOException, NumberFormatException {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            long j6 = this.f22709h;
            int i = (int) j6;
            if (j6 != i) {
                throw new NumberFormatException("Expected an int but was " + this.f22709h + q());
            }
            this.f22708g = 0;
            int[] iArr = this.f22714n;
            int i3 = this.f22712l - 1;
            iArr[i3] = iArr[i3] + 1;
            return i;
        }
        if (iE == 16) {
            this.f22710j = new String(this.f22703b, this.f22704c, this.i);
            this.f22704c += this.i;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                throw J("an int");
            }
            if (iE == 10) {
                this.f22710j = A();
            } else {
                this.f22710j = y(iE == 8 ? '\'' : '\"');
            }
            try {
                int i6 = Integer.parseInt(this.f22710j);
                this.f22708g = 0;
                int[] iArr2 = this.f22714n;
                int i7 = this.f22712l - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return i6;
            } catch (NumberFormatException unused) {
            }
        }
        this.f22708g = 11;
        double d6 = Double.parseDouble(this.f22710j);
        int i8 = (int) d6;
        if (i8 != d6) {
            throw new NumberFormatException("Expected an int but was " + this.f22710j + q());
        }
        this.f22710j = null;
        this.f22708g = 0;
        int[] iArr3 = this.f22714n;
        int i9 = this.f22712l - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return i8;
    }

    public final String toString() {
        return C2762a.class.getSimpleName() + q();
    }

    public final long u() throws IOException, NumberFormatException {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.f22708g = 0;
            int[] iArr = this.f22714n;
            int i = this.f22712l - 1;
            iArr[i] = iArr[i] + 1;
            return this.f22709h;
        }
        if (iE == 16) {
            this.f22710j = new String(this.f22703b, this.f22704c, this.i);
            this.f22704c += this.i;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                throw J("a long");
            }
            if (iE == 10) {
                this.f22710j = A();
            } else {
                this.f22710j = y(iE == 8 ? '\'' : '\"');
            }
            try {
                long j6 = Long.parseLong(this.f22710j);
                this.f22708g = 0;
                int[] iArr2 = this.f22714n;
                int i3 = this.f22712l - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j6;
            } catch (NumberFormatException unused) {
            }
        }
        this.f22708g = 11;
        double d6 = Double.parseDouble(this.f22710j);
        long j7 = (long) d6;
        if (j7 != d6) {
            throw new NumberFormatException("Expected a long but was " + this.f22710j + q());
        }
        this.f22710j = null;
        this.f22708g = 0;
        int[] iArr3 = this.f22714n;
        int i6 = this.f22712l - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return j7;
    }

    public final String v() throws IOException {
        String strY;
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 14) {
            strY = A();
        } else if (iE == 12) {
            strY = y('\'');
        } else {
            if (iE != 13) {
                throw J("a name");
            }
            strY = y('\"');
        }
        this.f22708g = 0;
        this.f22713m[this.f22712l - 1] = strY;
        return strY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int w(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C2762a.w(boolean):int");
    }

    public final void x() {
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 7) {
            throw J("null");
        }
        this.f22708g = 0;
        int[] iArr = this.f22714n;
        int i = this.f22712l - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.f22704c = r8;
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
        r11.f22704c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String y(char r12) throws o4.C2765d {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f22704c
            int r3 = r11.f22705d
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f22703b
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.f22701C
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.I(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.f22704c = r8
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
            r11.f22704c = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.D()
            r1.append(r2)
            int r2 = r11.f22704c
            int r3 = r11.f22705d
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.f22706e
            int r2 = r2 + r6
            r11.f22706e = r2
            r11.f22707f = r8
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
            r11.f22704c = r2
            boolean r2 = r11.m(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.I(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C2762a.y(char):java.lang.String");
    }

    public final String z() throws IOException {
        String str;
        int iE = this.f22708g;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 10) {
            str = A();
        } else if (iE == 8) {
            str = y('\'');
        } else if (iE == 9) {
            str = y('\"');
        } else if (iE == 11) {
            str = this.f22710j;
            this.f22710j = null;
        } else if (iE == 15) {
            str = Long.toString(this.f22709h);
        } else {
            if (iE != 16) {
                throw J("a string");
            }
            str = new String(this.f22703b, this.f22704c, this.i);
            this.f22704c += this.i;
        }
        this.f22708g = 0;
        int[] iArr = this.f22714n;
        int i = this.f22712l - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }
}

package E5;

import N7.G8;
import androidx.work.s;
import com.google.gson.internal.m;
import com.google.gson.k;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonReader.java */
/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: q, reason: collision with root package name */
    public static final char[] f1422q = ")]}'\n".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public final Reader f1423b;

    /* renamed from: j, reason: collision with root package name */
    public long f1430j;

    /* renamed from: k, reason: collision with root package name */
    public int f1431k;

    /* renamed from: l, reason: collision with root package name */
    public String f1432l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f1433m;

    /* renamed from: o, reason: collision with root package name */
    public String[] f1435o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f1436p;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1424c = false;

    /* renamed from: d, reason: collision with root package name */
    public final char[] f1425d = new char[1024];

    /* renamed from: e, reason: collision with root package name */
    public int f1426e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1427f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f1428g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f1429h = 0;
    public int i = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f1434n = 1;

    /* compiled from: JsonReader.java */
    /* renamed from: E5.a$a, reason: collision with other inner class name */
    public static class C0016a extends m {
        public final void c(a aVar) throws IOException {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                com.google.gson.internal.bind.a aVar2 = (com.google.gson.internal.bind.a) aVar;
                aVar2.S0(b.NAME);
                Map.Entry entry = (Map.Entry) ((Iterator) aVar2.U0()).next();
                aVar2.W0(entry.getValue());
                aVar2.W0(new k((String) entry.getKey()));
                return;
            }
            int iE = aVar.i;
            if (iE == 0) {
                iE = aVar.e();
            }
            if (iE == 13) {
                aVar.i = 9;
                return;
            }
            if (iE == 12) {
                aVar.i = 8;
            } else {
                if (iE == 14) {
                    aVar.i = 10;
                    return;
                }
                throw new IllegalStateException("Expected a name but was " + aVar.C0() + aVar.F());
            }
        }
    }

    static {
        m.f23512a = new C0016a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f1433m = iArr;
        iArr[0] = 6;
        this.f1435o = new String[32];
        this.f1436p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f1423b = reader;
    }

    public String A() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f1434n;
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = this.f1433m[i10];
            if (i11 == 1 || i11 == 2) {
                sb.append('[');
                sb.append(this.f1436p[i10]);
                sb.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb.append('.');
                String str = this.f1435o[i10];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean B() throws IOException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        return (iE == 2 || iE == 4) ? false : true;
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
    public final java.lang.String B0() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f1426e
            int r4 = r3 + r2
            int r5 = r7.f1427f
            char[] r6 = r7.f1425d
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
            boolean r3 = r7.n(r3)
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
            int r3 = r7.f1426e
            r0.append(r6, r3, r2)
            int r3 = r7.f1426e
            int r3 = r3 + r2
            r7.f1426e = r3
            r2 = 1
            boolean r2 = r7.n(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f1426e
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f1426e
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f1426e
            int r2 = r2 + r1
            r7.f1426e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.a.B0():java.lang.String");
    }

    public b C0() throws IOException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        switch (iE) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
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

    public final boolean D(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
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

    public final void D0(int i) {
        int i10 = this.f1434n;
        int[] iArr = this.f1433m;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            String[] strArr = new String[i11];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f1436p, 0, iArr3, 0, this.f1434n);
            System.arraycopy(this.f1435o, 0, strArr, 0, this.f1434n);
            this.f1433m = iArr2;
            this.f1436p = iArr3;
            this.f1435o = strArr;
        }
        int[] iArr4 = this.f1433m;
        int i12 = this.f1434n;
        this.f1434n = i12 + 1;
        iArr4[i12] = i;
    }

    final String F() {
        StringBuilder sbI = s.i(" at line ", this.f1428g + 1, " column ", (this.f1426e - this.f1429h) + 1, " path ");
        sbI.append(A());
        return sbI.toString();
    }

    public final char N0() throws IOException {
        int i;
        if (this.f1426e == this.f1427f && !n(1)) {
            R0("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f1426e;
        int i11 = i10 + 1;
        this.f1426e = i11;
        char[] cArr = this.f1425d;
        char c10 = cArr[i10];
        if (c10 == '\n') {
            this.f1428g++;
            this.f1429h = i11;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            R0("Invalid escape sequence");
            throw null;
        }
        if (i10 + 5 > this.f1427f && !n(4)) {
            R0("Unterminated escape sequence");
            throw null;
        }
        int i12 = this.f1426e;
        int i13 = i12 + 4;
        char c11 = 0;
        while (i12 < i13) {
            char c12 = cArr[i12];
            char c13 = (char) (c11 << 4);
            if (c12 >= '0' && c12 <= '9') {
                i = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i = c12 - 'W';
            } else {
                if (c12 < 'A' || c12 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f1426e, 4)));
                }
                i = c12 - '7';
            }
            c11 = (char) (i + c13);
            i12++;
        }
        this.f1426e += 4;
        return c11;
    }

    public final void O0(char c10) throws IOException {
        do {
            int i = this.f1426e;
            int i10 = this.f1427f;
            while (i < i10) {
                int i11 = i + 1;
                char c11 = this.f1425d[i];
                if (c11 == c10) {
                    this.f1426e = i11;
                    return;
                }
                if (c11 == '\\') {
                    this.f1426e = i11;
                    N0();
                    i = this.f1426e;
                    i10 = this.f1427f;
                } else {
                    if (c11 == '\n') {
                        this.f1428g++;
                        this.f1429h = i11;
                    }
                    i = i11;
                }
            }
            this.f1426e = i;
        } while (n(1));
        R0("Unterminated string");
        throw null;
    }

    public final void P0() throws IOException {
        char c10;
        do {
            if (this.f1426e >= this.f1427f && !n(1)) {
                return;
            }
            int i = this.f1426e;
            int i10 = i + 1;
            this.f1426e = i10;
            c10 = this.f1425d[i];
            if (c10 == '\n') {
                this.f1428g++;
                this.f1429h = i10;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a1, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Q0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.a.Q0():void");
    }

    public final void R0(String str) throws IOException {
        StringBuilder sbU = G8.u(str);
        sbU.append(F());
        throw new d(sbU.toString());
    }

    public boolean W() throws IOException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 5) {
            this.i = 0;
            int[] iArr = this.f1436p;
            int i = this.f1434n - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iE != 6) {
            throw new IllegalStateException("Expected a boolean but was " + C0() + F());
        }
        this.i = 0;
        int[] iArr2 = this.f1436p;
        int i10 = this.f1434n - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return false;
    }

    public void a() throws IOException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 3) {
            D0(1);
            this.f1436p[this.f1434n - 1] = 0;
            this.i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + C0() + F());
        }
    }

    public void c() throws IOException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 1) {
            D0(3);
            this.i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + C0() + F());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i = 0;
        this.f1433m[0] = 8;
        this.f1434n = 1;
        this.f1423b.close();
    }

    public final void d() throws IOException {
        if (this.f1424c) {
            return;
        }
        R0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b4, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x020a, code lost:
    
        if (D(r15) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x020c, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0269 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.a.e():int");
    }

    public void k() throws IOException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + C0() + F());
        }
        int i = this.f1434n;
        this.f1434n = i - 1;
        int[] iArr = this.f1436p;
        int i10 = i - 2;
        iArr[i10] = iArr[i10] + 1;
        this.i = 0;
    }

    public double k0() throws IOException, NumberFormatException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.i = 0;
            int[] iArr = this.f1436p;
            int i = this.f1434n - 1;
            iArr[i] = iArr[i] + 1;
            return this.f1430j;
        }
        if (iE == 16) {
            this.f1432l = new String(this.f1425d, this.f1426e, this.f1431k);
            this.f1426e += this.f1431k;
        } else if (iE == 8 || iE == 9) {
            this.f1432l = w0(iE == 8 ? '\'' : '\"');
        } else if (iE == 10) {
            this.f1432l = B0();
        } else if (iE != 11) {
            throw new IllegalStateException("Expected a double but was " + C0() + F());
        }
        this.i = 11;
        double d10 = Double.parseDouble(this.f1432l);
        if (!this.f1424c && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new d("JSON forbids NaN and infinities: " + d10 + F());
        }
        this.f1432l = null;
        this.i = 0;
        int[] iArr2 = this.f1436p;
        int i10 = this.f1434n - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return d10;
    }

    public void l() throws IOException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + C0() + F());
        }
        int i = this.f1434n;
        int i10 = i - 1;
        this.f1434n = i10;
        this.f1435o[i10] = null;
        int[] iArr = this.f1436p;
        int i11 = i - 2;
        iArr[i11] = iArr[i11] + 1;
        this.i = 0;
    }

    public int m0() throws IOException, NumberFormatException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            long j4 = this.f1430j;
            int i = (int) j4;
            if (j4 != i) {
                throw new NumberFormatException("Expected an int but was " + this.f1430j + F());
            }
            this.i = 0;
            int[] iArr = this.f1436p;
            int i10 = this.f1434n - 1;
            iArr[i10] = iArr[i10] + 1;
            return i;
        }
        if (iE == 16) {
            this.f1432l = new String(this.f1425d, this.f1426e, this.f1431k);
            this.f1426e += this.f1431k;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                throw new IllegalStateException("Expected an int but was " + C0() + F());
            }
            if (iE == 10) {
                this.f1432l = B0();
            } else {
                this.f1432l = w0(iE == 8 ? '\'' : '\"');
            }
            try {
                int i11 = Integer.parseInt(this.f1432l);
                this.i = 0;
                int[] iArr2 = this.f1436p;
                int i12 = this.f1434n - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double d10 = Double.parseDouble(this.f1432l);
        int i13 = (int) d10;
        if (i13 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f1432l + F());
        }
        this.f1432l = null;
        this.i = 0;
        int[] iArr3 = this.f1436p;
        int i14 = this.f1434n - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return i13;
    }

    public final boolean n(int i) throws IOException {
        int i10;
        int i11;
        int i12 = this.f1429h;
        int i13 = this.f1426e;
        this.f1429h = i12 - i13;
        int i14 = this.f1427f;
        char[] cArr = this.f1425d;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f1427f = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f1427f = 0;
        }
        this.f1426e = 0;
        do {
            int i16 = this.f1427f;
            int i17 = this.f1423b.read(cArr, i16, cArr.length - i16);
            if (i17 == -1) {
                return false;
            }
            i10 = this.f1427f + i17;
            this.f1427f = i10;
            if (this.f1428g == 0 && (i11 = this.f1429h) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f1426e++;
                this.f1429h = i11 + 1;
                i++;
            }
        } while (i10 < i);
        return true;
    }

    public long p0() throws IOException, NumberFormatException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 15) {
            this.i = 0;
            int[] iArr = this.f1436p;
            int i = this.f1434n - 1;
            iArr[i] = iArr[i] + 1;
            return this.f1430j;
        }
        if (iE == 16) {
            this.f1432l = new String(this.f1425d, this.f1426e, this.f1431k);
            this.f1426e += this.f1431k;
        } else {
            if (iE != 8 && iE != 9 && iE != 10) {
                throw new IllegalStateException("Expected a long but was " + C0() + F());
            }
            if (iE == 10) {
                this.f1432l = B0();
            } else {
                this.f1432l = w0(iE == 8 ? '\'' : '\"');
            }
            try {
                long j4 = Long.parseLong(this.f1432l);
                this.i = 0;
                int[] iArr2 = this.f1436p;
                int i10 = this.f1434n - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return j4;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double d10 = Double.parseDouble(this.f1432l);
        long j10 = (long) d10;
        if (j10 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f1432l + F());
        }
        this.f1432l = null;
        this.i = 0;
        int[] iArr3 = this.f1436p;
        int i11 = this.f1434n - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j10;
    }

    public String q0() throws IOException {
        String strW0;
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 14) {
            strW0 = B0();
        } else if (iE == 12) {
            strW0 = w0('\'');
        } else {
            if (iE != 13) {
                throw new IllegalStateException("Expected a name but was " + C0() + F());
            }
            strW0 = w0('\"');
        }
        this.i = 0;
        this.f1435o[this.f1434n - 1] = strW0;
        return strW0;
    }

    public String toString() {
        return getClass().getSimpleName() + F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u0(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.a.u0(boolean):int");
    }

    public void v0() throws IOException {
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE != 7) {
            throw new IllegalStateException("Expected null but was " + C0() + F());
        }
        this.i = 0;
        int[] iArr = this.f1436p;
        int i = this.f1434n - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f1426e = r8;
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
    
        r1.append(r5, r3, r2 - r3);
        r10.f1426e = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String w0(char r11) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f1426e
            int r3 = r10.f1427f
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r10.f1425d
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L29
            r10.f1426e = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r3, r8)
            return r11
        L21:
            r1.append(r5, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f1426e = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L3f:
            r1.append(r5, r3, r2)
            char r2 = r10.N0()
            r1.append(r2)
            int r2 = r10.f1426e
            int r3 = r10.f1427f
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f1428g
            int r2 = r2 + r6
            r10.f1428g = r2
            r10.f1429h = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r10.f1426e = r2
            boolean r2 = r10.n(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.R0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.a.w0(char):java.lang.String");
    }

    public String y0() throws IOException {
        String str;
        int iE = this.i;
        if (iE == 0) {
            iE = e();
        }
        if (iE == 10) {
            str = B0();
        } else if (iE == 8) {
            str = w0('\'');
        } else if (iE == 9) {
            str = w0('\"');
        } else if (iE == 11) {
            str = this.f1432l;
            this.f1432l = null;
        } else if (iE == 15) {
            str = Long.toString(this.f1430j);
        } else {
            if (iE != 16) {
                throw new IllegalStateException("Expected a string but was " + C0() + F());
            }
            str = new String(this.f1425d, this.f1426e, this.f1431k);
            this.f1426e += this.f1431k;
        }
        this.i = 0;
        int[] iArr = this.f1436p;
        int i = this.f1434n - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }
}

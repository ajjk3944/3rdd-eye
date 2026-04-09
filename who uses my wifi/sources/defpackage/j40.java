package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j40 extends i40 {
    public static final jc q = jc.a("'\\");
    public static final jc r = jc.a("\"\\");
    public static final jc s = jc.a("{}[]:, \n\t\r\f/\\;#=");
    public final sn0 k;
    public final ac l;
    public int m;
    public long n;
    public int o;
    public String p;

    static {
        jc.a("\n\r");
        jc.a("*/");
    }

    public j40(sn0 sn0Var) {
        this.g = new int[32];
        this.h = new String[32];
        this.i = new int[32];
        this.m = 0;
        this.k = sn0Var;
        this.l = sn0Var.f;
        p(6);
    }

    public final String A(jc jcVar) throws h40 {
        StringBuilder sb = null;
        while (true) {
            long jA = this.k.a(jcVar);
            if (jA == -1) {
                t("Unterminated string");
                throw null;
            }
            ac acVar = this.l;
            if (acVar.a(jA) != 92) {
                if (sb == null) {
                    String strG = acVar.g(jA, j41.a);
                    acVar.c();
                    return strG;
                }
                sb.append(acVar.g(jA, j41.a));
                acVar.c();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(acVar.g(jA, j41.a));
            acVar.c();
            sb.append(C());
        }
    }

    public final String B() {
        long jA = this.k.a(s);
        ac acVar = this.l;
        acVar.getClass();
        if (jA != -1) {
            return acVar.g(jA, j41.a);
        }
        try {
            return acVar.g(acVar.g, j41.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final char C() throws h40, EOFException {
        int i;
        sn0 sn0Var = this.k;
        if (!sn0Var.d(1L)) {
            t("Unterminated escape sequence");
            throw null;
        }
        ac acVar = this.l;
        byte bC = acVar.c();
        if (bC == 10 || bC == 34 || bC == 39 || bC == 47 || bC == 92) {
            return (char) bC;
        }
        if (bC == 98) {
            return '\b';
        }
        if (bC == 102) {
            return '\f';
        }
        if (bC == 110) {
            return '\n';
        }
        if (bC == 114) {
            return '\r';
        }
        if (bC == 116) {
            return '\t';
        }
        if (bC != 117) {
            t("Invalid escape sequence: \\" + ((char) bC));
            throw null;
        }
        if (!sn0Var.d(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + h());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bA = acVar.a(i2);
            char c2 = (char) (c << 4);
            if (bA >= 48 && bA <= 57) {
                i = bA - 48;
            } else if (bA >= 97 && bA <= 102) {
                i = bA - 87;
            } else {
                if (bA < 65 || bA > 70) {
                    t("\\u".concat(acVar.g(4L, j41.a)));
                    throw null;
                }
                i = bA - 55;
            }
            c = (char) (i + c2);
        }
        acVar.h(4L);
        return c;
    }

    public final void D(jc jcVar) throws h40, EOFException {
        while (true) {
            long jA = this.k.a(jcVar);
            if (jA == -1) {
                t("Unterminated string");
                throw null;
            }
            ac acVar = this.l;
            if (acVar.a(jA) != 92) {
                acVar.h(jA + 1);
                return;
            } else {
                acVar.h(jA + 1);
                C();
            }
        }
    }

    @Override // defpackage.i40
    public final void a() {
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 3) {
            p(1);
            this.i[this.f - 1] = 0;
            this.m = 0;
        } else {
            throw new rg("Expected BEGIN_ARRAY but was " + ex0.t(o()) + " at path " + h());
        }
    }

    @Override // defpackage.i40
    public final void c() {
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 1) {
            p(3);
            this.m = 0;
        } else {
            throw new rg("Expected BEGIN_OBJECT but was " + ex0.t(o()) + " at path " + h());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m = 0;
        this.g[0] = 8;
        this.f = 1;
        ac acVar = this.l;
        acVar.getClass();
        try {
            acVar.h(acVar.g);
            this.k.close();
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.i40
    public final void f() {
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        if (iV != 4) {
            throw new rg("Expected END_ARRAY but was " + ex0.t(o()) + " at path " + h());
        }
        int i = this.f;
        this.f = i - 1;
        int[] iArr = this.i;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.m = 0;
    }

    @Override // defpackage.i40
    public final void g() {
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        if (iV != 2) {
            throw new rg("Expected END_OBJECT but was " + ex0.t(o()) + " at path " + h());
        }
        int i = this.f;
        int i2 = i - 1;
        this.f = i2;
        this.h[i2] = null;
        int[] iArr = this.i;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.m = 0;
    }

    @Override // defpackage.i40
    public final boolean i() throws h40, EOFException {
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        return (iV == 2 || iV == 4 || iV == 18) ? false : true;
    }

    @Override // defpackage.i40
    public final boolean k() throws h40, EOFException {
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 5) {
            this.m = 0;
            int[] iArr = this.i;
            int i = this.f - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iV == 6) {
            this.m = 0;
            int[] iArr2 = this.i;
            int i2 = this.f - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new rg("Expected a boolean but was " + ex0.t(o()) + " at path " + h());
    }

    @Override // defpackage.i40
    public final double l() {
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 16) {
            this.m = 0;
            int[] iArr = this.i;
            int i = this.f - 1;
            iArr[i] = iArr[i] + 1;
            return this.n;
        }
        if (iV == 17) {
            long j = this.o;
            ac acVar = this.l;
            acVar.getClass();
            this.p = acVar.g(j, j41.a);
        } else if (iV == 9) {
            this.p = A(r);
        } else if (iV == 8) {
            this.p = A(q);
        } else if (iV == 10) {
            this.p = B();
        } else if (iV != 11) {
            throw new rg("Expected a double but was " + ex0.t(o()) + " at path " + h());
        }
        this.m = 11;
        try {
            double d = Double.parseDouble(this.p);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new h40("JSON forbids NaN and infinities: " + d + " at path " + h());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.i;
            int i2 = this.f - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new rg("Expected a double but was " + this.p + " at path " + h());
        }
    }

    @Override // defpackage.i40
    public final int m() {
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 16) {
            long j = this.n;
            int i = (int) j;
            if (j == i) {
                this.m = 0;
                int[] iArr = this.i;
                int i2 = this.f - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new rg("Expected an int but was " + this.n + " at path " + h());
        }
        if (iV == 17) {
            long j2 = this.o;
            ac acVar = this.l;
            acVar.getClass();
            this.p = acVar.g(j2, j41.a);
        } else if (iV == 9 || iV == 8) {
            String strA = iV == 9 ? A(r) : A(q);
            this.p = strA;
            try {
                int i3 = Integer.parseInt(strA);
                this.m = 0;
                int[] iArr2 = this.i;
                int i4 = this.f - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iV != 11) {
            throw new rg("Expected an int but was " + ex0.t(o()) + " at path " + h());
        }
        this.m = 11;
        try {
            double d = Double.parseDouble(this.p);
            int i5 = (int) d;
            if (i5 != d) {
                throw new rg("Expected an int but was " + this.p + " at path " + h());
            }
            this.p = null;
            this.m = 0;
            int[] iArr3 = this.i;
            int i6 = this.f - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new rg("Expected an int but was " + this.p + " at path " + h());
        }
    }

    @Override // defpackage.i40
    public final String n() {
        String strG;
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 10) {
            strG = B();
        } else if (iV == 9) {
            strG = A(r);
        } else if (iV == 8) {
            strG = A(q);
        } else if (iV == 11) {
            strG = this.p;
            this.p = null;
        } else if (iV == 16) {
            strG = Long.toString(this.n);
        } else {
            if (iV != 17) {
                throw new rg("Expected a string but was " + ex0.t(o()) + " at path " + h());
            }
            long j = this.o;
            ac acVar = this.l;
            acVar.getClass();
            strG = acVar.g(j, j41.a);
        }
        this.m = 0;
        int[] iArr = this.i;
        int i = this.f - 1;
        iArr[i] = iArr[i] + 1;
        return strG;
    }

    @Override // defpackage.i40
    public final int o() throws h40, EOFException {
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        switch (iV) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2 A[PHI: r3 r8 r10 r15
  0x00b2: PHI (r3v14 int) = (r3v13 int), (r3v16 int) binds: [B:50:0x00a1, B:52:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r8v2 byte[]) = (r8v1 byte[]), (r8v3 byte[]) binds: [B:50:0x00a1, B:52:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:50:0x00a1, B:52:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r15v2 xt0) = (r15v1 xt0), (r15v3 xt0) binds: [B:50:0x00a1, B:52:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.i40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q(defpackage.l92 r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j40.q(l92):int");
    }

    @Override // defpackage.i40
    public final void r() {
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 14) {
            long jA = this.k.a(s);
            ac acVar = this.l;
            if (jA == -1) {
                jA = acVar.g;
            }
            acVar.h(jA);
        } else if (iV == 13) {
            D(r);
        } else if (iV == 12) {
            D(q);
        } else if (iV != 15) {
            throw new rg("Expected a name but was " + ex0.t(o()) + " at path " + h());
        }
        this.m = 0;
        this.h[this.f - 1] = "null";
    }

    @Override // defpackage.i40
    public final void s() {
        int i = 0;
        do {
            int iV = this.m;
            if (iV == 0) {
                iV = v();
            }
            if (iV == 3) {
                p(1);
            } else if (iV == 1) {
                p(3);
            } else {
                if (iV == 4) {
                    i--;
                    if (i < 0) {
                        throw new rg("Expected a value but was " + ex0.t(o()) + " at path " + h());
                    }
                    this.f--;
                } else if (iV == 2) {
                    i--;
                    if (i < 0) {
                        throw new rg("Expected a value but was " + ex0.t(o()) + " at path " + h());
                    }
                    this.f--;
                } else {
                    ac acVar = this.l;
                    if (iV == 14 || iV == 10) {
                        long jA = this.k.a(s);
                        if (jA == -1) {
                            jA = acVar.g;
                        }
                        acVar.h(jA);
                    } else if (iV == 9 || iV == 13) {
                        D(r);
                    } else if (iV == 8 || iV == 12) {
                        D(q);
                    } else if (iV == 17) {
                        acVar.h(this.o);
                    } else if (iV == 18) {
                        throw new rg("Expected a value but was " + ex0.t(o()) + " at path " + h());
                    }
                }
                this.m = 0;
            }
            i++;
            this.m = 0;
        } while (i != 0);
        int[] iArr = this.i;
        int i2 = this.f - 1;
        iArr[i2] = iArr[i2] + 1;
        this.h[i2] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.k + ")";
    }

    public final void u() throws h40 {
        t("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (x(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ad, code lost:
    
        r22.n = r8;
        r7.h(r2);
        r9 = 16;
        r22.m = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c0, code lost:
    
        r22.o = r2;
        r9 = 17;
        r22.m = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v() throws defpackage.h40, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j40.v():int");
    }

    public final int w(String str, l92 l92Var) {
        int length = ((String[]) l92Var.f).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) l92Var.f)[i])) {
                this.m = 0;
                this.h[this.f - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean x(int i) throws h40 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        u();
        throw null;
    }

    public final String y() throws h40, EOFException {
        String strA;
        int iV = this.m;
        if (iV == 0) {
            iV = v();
        }
        if (iV == 14) {
            strA = B();
        } else if (iV == 13) {
            strA = A(r);
        } else if (iV == 12) {
            strA = A(q);
        } else {
            if (iV != 15) {
                throw new rg("Expected a name but was " + ex0.t(o()) + " at path " + h());
            }
            strA = this.p;
        }
        this.m = 0;
        this.h[this.f - 1] = strA;
        return strA;
    }

    public final int z(boolean z) throws h40, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            sn0 sn0Var = this.k;
            if (!sn0Var.d(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            ac acVar = this.l;
            byte bA = acVar.a(j);
            if (bA != 10 && bA != 32 && bA != 13 && bA != 9) {
                acVar.h(j);
                if (bA == 47) {
                    if (sn0Var.d(2L)) {
                        u();
                        throw null;
                    }
                } else if (bA == 35) {
                    u();
                    throw null;
                }
                return bA;
            }
            i = i2;
        }
    }
}

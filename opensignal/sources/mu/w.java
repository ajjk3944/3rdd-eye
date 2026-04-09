package mu;

import bc.f0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w extends io.sentry.config.a implements lu.j {

    /* renamed from: a, reason: collision with root package name */
    public final lu.c f17039a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f17040b;

    /* renamed from: c, reason: collision with root package name */
    public final bj.c f17041c;

    /* renamed from: d, reason: collision with root package name */
    public final cg.e f17042d;

    /* renamed from: e, reason: collision with root package name */
    public int f17043e;

    /* renamed from: f, reason: collision with root package name */
    public u f17044f;

    /* renamed from: g, reason: collision with root package name */
    public final lu.i f17045g;

    /* renamed from: h, reason: collision with root package name */
    public final j f17046h;

    public w(lu.c cVar, b0 b0Var, bj.c cVar2, iu.e eVar, u uVar) {
        br.l.e(b0Var, "mode");
        br.l.e(eVar, "descriptor");
        this.f17039a = cVar;
        this.f17040b = b0Var;
        this.f17041c = cVar2;
        this.f17042d = cVar.f15935b;
        this.f17043e = -1;
        this.f17044f = uVar;
        lu.i iVar = cVar.f15934a;
        this.f17045g = iVar;
        this.f17046h = iVar.f15945c ? null : new j(eVar);
    }

    @Override // io.sentry.config.a, ju.c
    public final short A() {
        bj.c cVar = this.f17041c;
        long jO = cVar.o();
        short s8 = (short) jO;
        if (jO == s8) {
            return s8;
        }
        bj.c.u(cVar, "Failed to parse short for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override // io.sentry.config.a, ju.c
    public final float B() throws NumberFormatException {
        bj.c cVar = this.f17041c;
        String strQ = cVar.q();
        try {
            float f10 = Float.parseFloat(strQ);
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                return f10;
            }
            l.p(cVar, Float.valueOf(f10));
            throw null;
        } catch (IllegalArgumentException unused) {
            bj.c.u(cVar, h0.b.g('\'', "Failed to parse type 'float' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // io.sentry.config.a, ju.c
    public final double C() throws NumberFormatException {
        bj.c cVar = this.f17041c;
        String strQ = cVar.q();
        try {
            double d6 = Double.parseDouble(strQ);
            if (!Double.isInfinite(d6) && !Double.isNaN(d6)) {
                return d6;
            }
            l.p(cVar, Double.valueOf(d6));
            throw null;
        } catch (IllegalArgumentException unused) {
            bj.c.u(cVar, h0.b.g('\'', "Failed to parse type 'double' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // io.sentry.config.a, ju.c
    public final int D(iu.e eVar) {
        br.l.e(eVar, "enumDescriptor");
        bj.c cVar = this.f17041c;
        return l.j(eVar, this.f17039a, cVar.p(), " at path ".concat(((f0) cVar.f2795g).g()));
    }

    @Override // ju.a
    public final cg.e a() {
        return this.f17042d;
    }

    @Override // io.sentry.config.a, ju.c
    public final ju.a b(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        lu.c cVar = this.f17039a;
        b0 b0VarO = l.o(eVar, cVar);
        bj.c cVar2 = this.f17041c;
        f0 f0Var = (f0) cVar2.f2795g;
        int i10 = f0Var.f2602d + 1;
        f0Var.f2602d = i10;
        Object[] objArr = (Object[]) f0Var.f2603g;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
            br.l.d(objArrCopyOf, "copyOf(...)");
            f0Var.f2603g = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) f0Var.f2604r, i11);
            br.l.d(iArrCopyOf, "copyOf(...)");
            f0Var.f2604r = iArrCopyOf;
        }
        ((Object[]) f0Var.f2603g)[i10] = eVar;
        cVar2.n(b0VarO.begin);
        if (cVar2.E() != 4) {
            int i12 = v.f17038a[b0VarO.ordinal()];
            return (i12 == 1 || i12 == 2 || i12 == 3) ? new w(cVar, b0VarO, cVar2, eVar, this.f17044f) : (this.f17040b == b0VarO && cVar.f15934a.f15945c) ? this : new w(cVar, b0VarO, cVar2, eVar, this.f17044f);
        }
        bj.c.u(cVar2, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // io.sentry.config.a, ju.a
    public final void c(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        if (this.f17039a.f15934a.f15944b && eVar.k() == 0) {
            while (t(eVar) != -1) {
            }
        }
        bj.c cVar = this.f17041c;
        if (cVar.I()) {
            l.k(cVar, "");
            throw null;
        }
        cVar.n(this.f17040b.end);
        f0 f0Var = (f0) cVar.f2795g;
        int i10 = f0Var.f2602d;
        int[] iArr = (int[]) f0Var.f2604r;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            f0Var.f2602d = i10 - 1;
        }
        int i11 = f0Var.f2602d;
        if (i11 != -1) {
            f0Var.f2602d = i11 - 1;
        }
    }

    @Override // io.sentry.config.a, ju.c
    public final boolean d() {
        boolean z10;
        boolean z11;
        bj.c cVar = this.f17041c;
        int iH = cVar.H();
        String str = (String) cVar.f2798y;
        if (iH == str.length()) {
            bj.c.u(cVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iH) == '\"') {
            iH++;
            z10 = true;
        } else {
            z10 = false;
        }
        int iG = cVar.G(iH);
        if (iG >= str.length() || iG == -1) {
            bj.c.u(cVar, "EOF", 0, null, 6);
            throw null;
        }
        int i10 = iG + 1;
        int iCharAt = str.charAt(iG) | ' ';
        if (iCharAt == 102) {
            cVar.j(i10, "alse");
            z11 = false;
        } else {
            if (iCharAt != 116) {
                bj.c.u(cVar, "Expected valid boolean literal prefix, but had '" + cVar.q() + '\'', 0, null, 6);
                throw null;
            }
            cVar.j(i10, "rue");
            z11 = true;
        }
        if (!z10) {
            return z11;
        }
        if (cVar.f2794d == str.length()) {
            bj.c.u(cVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(cVar.f2794d) == '\"') {
            cVar.f2794d++;
            return z11;
        }
        bj.c.u(cVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // io.sentry.config.a, ju.c
    public final char e() {
        bj.c cVar = this.f17041c;
        String strQ = cVar.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        bj.c.u(cVar, h0.b.g('\'', "Expected single char, but got '", strQ), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    @Override // io.sentry.config.a, ju.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(gu.a r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.w.f(gu.a):java.lang.Object");
    }

    @Override // lu.j
    public final lu.l j() {
        return new ag.b(this.f17039a.f15934a, this.f17041c).k();
    }

    @Override // io.sentry.config.a, ju.c
    public final int k() {
        bj.c cVar = this.f17041c;
        long jO = cVar.o();
        int i10 = (int) jO;
        if (jO == i10) {
            return i10;
        }
        bj.c.u(cVar, "Failed to parse int for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override // io.sentry.config.a, ju.a
    public final Object m(iu.e eVar, int i10, gu.a aVar, Object obj) {
        f0 f0Var = (f0) this.f17041c.f2795g;
        br.l.e(eVar, "descriptor");
        br.l.e(aVar, "deserializer");
        boolean z10 = this.f17040b == b0.MAP && (i10 & 1) == 0;
        if (z10) {
            int[] iArr = (int[]) f0Var.f2604r;
            int i11 = f0Var.f2602d;
            if (iArr[i11] == -2) {
                ((Object[]) f0Var.f2603g)[i11] = m.f17019a;
            }
        }
        Object objM = super.m(eVar, i10, aVar, obj);
        if (z10) {
            int[] iArr2 = (int[]) f0Var.f2604r;
            int i12 = f0Var.f2602d;
            if (iArr2[i12] != -2) {
                int i13 = i12 + 1;
                f0Var.f2602d = i13;
                Object[] objArr = (Object[]) f0Var.f2603g;
                if (i13 == objArr.length) {
                    int i14 = i13 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i14);
                    br.l.d(objArrCopyOf, "copyOf(...)");
                    f0Var.f2603g = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) f0Var.f2604r, i14);
                    br.l.d(iArrCopyOf, "copyOf(...)");
                    f0Var.f2604r = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) f0Var.f2603g;
            int i15 = f0Var.f2602d;
            objArr2[i15] = objM;
            ((int[]) f0Var.f2604r)[i15] = -2;
        }
        return objM;
    }

    @Override // io.sentry.config.a, ju.c
    public final String n() {
        return this.f17041c.p();
    }

    @Override // io.sentry.config.a, ju.c
    public final ju.c p(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        return z.a(eVar) ? new g(this.f17041c, this.f17039a) : this;
    }

    @Override // io.sentry.config.a, ju.c
    public final long r() {
        return this.f17041c.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        r2.t(h0.b.g('\'', "Encountered an unknown key '", r5), tt.l.G0(r4.subSequence(0, r2.f2794d).toString(), 6, r5), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ju.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t(iu.e r21) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.w.t(iu.e):int");
    }

    @Override // io.sentry.config.a, ju.c
    public final boolean u() {
        j jVar = this.f17046h;
        if (!(jVar != null ? jVar.f17017b : false)) {
            bj.c cVar = this.f17041c;
            int iG = cVar.G(cVar.H());
            String str = (String) cVar.f2798y;
            int length = str.length() - iG;
            boolean z10 = false;
            if (length >= 4 && iG != -1) {
                int i10 = 0;
                while (true) {
                    if (i10 < 4) {
                        if ("null".charAt(i10) != str.charAt(iG + i10)) {
                            break;
                        }
                        i10++;
                    } else if (length <= 4 || l.g(str.charAt(iG + 4)) != 0) {
                        z10 = true;
                        cVar.f2794d = iG + 4;
                    }
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.config.a, ju.c
    public final byte z() {
        bj.c cVar = this.f17041c;
        long jO = cVar.o();
        byte b2 = (byte) jO;
        if (jO == b2) {
            return b2;
        }
        bj.c.u(cVar, "Failed to parse byte for input '" + jO + '\'', 0, null, 6);
        throw null;
    }
}

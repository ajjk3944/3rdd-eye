package ec;

import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.u7;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22547a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22548b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f22549c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f22550d;

    /* renamed from: e, reason: collision with root package name */
    public Long f22551e;

    /* renamed from: f, reason: collision with root package name */
    public Long f22552f;
    public final /* synthetic */ int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f22553h;

    /* renamed from: i, reason: collision with root package name */
    public final g5 f22554i;

    public b(c cVar, String str, int i4, g5 g5Var, int i10) {
        this.g = i10;
        this.f22553h = cVar;
        this.f22547a = str;
        this.f22548b = i4;
        this.f22554i = g5Var;
    }

    public static Boolean c(Boolean bool, boolean z3) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, com.google.android.gms.internal.measurement.w1 w1Var, s0 s0Var) {
        List listU;
        pb.y.h(w1Var);
        if (str != null && w1Var.p() && w1Var.x() != 1 && (w1Var.x() != 7 ? w1Var.q() : w1Var.v() != 0)) {
            int iX = w1Var.x();
            boolean zT = w1Var.t();
            String strR = (zT || iX == 2 || iX == 7) ? w1Var.r() : w1Var.r().toUpperCase(Locale.ENGLISH);
            if (w1Var.v() == 0) {
                listU = null;
            } else {
                listU = w1Var.u();
                if (!zT) {
                    ArrayList arrayList = new ArrayList(listU.size());
                    Iterator it = listU.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listU = DesugarCollections.unmodifiableList(arrayList);
                }
            }
            String str2 = iX == 2 ? strR : null;
            if (iX != 7 ? strR != null : listU != null && !listU.isEmpty()) {
                if (!zT && iX != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iX - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zT ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (s0Var != null) {
                                    s0Var.j.e(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strR));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strR));
                    case 4:
                        return Boolean.valueOf(str.contains(strR));
                    case 5:
                        return Boolean.valueOf(str.equals(strR));
                    case 6:
                        if (listU != null) {
                            return Boolean.valueOf(listU.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.t1 r9, double r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.b.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.t1, double):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:3: B:89:0x0246->B:238:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.Long r22, java.lang.Long r23, com.google.android.gms.internal.measurement.b3 r24, long r25, ec.r r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.b.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.b3, long, ec.r, boolean):boolean");
    }

    public boolean b(Long l10, Long l11, com.google.android.gms.internal.measurement.s3 s3Var, boolean z3) {
        boolean z10;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        u7.a();
        o1 o1Var = (o1) this.f22553h.f218b;
        g gVar = o1Var.f22952d;
        o0 o0Var = o1Var.j;
        s0 s0Var = o1Var.f22954f;
        boolean zL = gVar.L(this.f22547a, d0.E0);
        com.google.android.gms.internal.measurement.v1 v1Var = (com.google.android.gms.internal.measurement.v1) this.f22554i;
        boolean zT = v1Var.t();
        boolean zU = v1Var.u();
        boolean zW = v1Var.w();
        boolean z11 = zT || zU || zW;
        if (z3 && !z11) {
            o1.m(s0Var);
            s0Var.f23060o.f(Integer.valueOf(this.f22548b), v1Var.p() ? Integer.valueOf(v1Var.q()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        com.google.android.gms.internal.measurement.q1 q1VarS = v1Var.s();
        boolean zU2 = q1VarS.u();
        if (!s3Var.u()) {
            z10 = zW;
            if (!s3Var.y()) {
                if (!s3Var.s()) {
                    o1.m(s0Var);
                    s0Var.j.e(o0Var.c(s3Var.r()), "User property has no value, property");
                } else if (q1VarS.p()) {
                    String strT = s3Var.t();
                    com.google.android.gms.internal.measurement.w1 w1VarQ = q1VarS.q();
                    o1.m(s0Var);
                    boolC = c(d(strT, w1VarQ, s0Var), zU2);
                } else if (!q1VarS.r()) {
                    o1.m(s0Var);
                    s0Var.j.e(o0Var.c(s3Var.r()), "No string or number filter defined. property");
                } else if (w0.h0(s3Var.t())) {
                    String strT2 = s3Var.t();
                    com.google.android.gms.internal.measurement.t1 t1VarS = q1VarS.s();
                    if (w0.h0(strT2)) {
                        try {
                            boolE = e(new BigDecimal(strT2), t1VarS, 0.0d);
                        } catch (NumberFormatException unused) {
                        }
                        boolC = c(boolE, zU2);
                    } else {
                        boolE = null;
                        boolC = c(boolE, zU2);
                    }
                } else {
                    o1.m(s0Var);
                    s0Var.j.f(o0Var.c(s3Var.r()), s3Var.t(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolC = null;
            } else if (q1VarS.r()) {
                double dZ = s3Var.z();
                try {
                    boolE2 = e(new BigDecimal(dZ), q1VarS.s(), Math.ulp(dZ));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zU2);
            } else {
                o1.m(s0Var);
                s0Var.j.e(o0Var.c(s3Var.r()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (q1VarS.r()) {
            z10 = zW;
            try {
                boolE3 = e(new BigDecimal(s3Var.v()), q1VarS.s(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zU2);
        } else {
            o1.m(s0Var);
            s0Var.j.e(o0Var.c(s3Var.r()), "No number filter for long property. property");
            z10 = zW;
            boolC = null;
        }
        o1.m(s0Var);
        s0Var.f23060o.e(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.f22549c = Boolean.TRUE;
        if (!z10 || boolC.booleanValue()) {
            if (!z3 || v1Var.t()) {
                this.f22550d = boolC;
            }
            if (boolC.booleanValue() && z11 && s3Var.p()) {
                long jQ = s3Var.q();
                if (l10 != null) {
                    jQ = l10.longValue();
                }
                if (zL && v1Var.t() && !v1Var.u() && l11 != null) {
                    jQ = l11.longValue();
                }
                if (v1Var.u()) {
                    this.f22552f = Long.valueOf(jQ);
                } else {
                    this.f22551e = Long.valueOf(jQ);
                }
            }
        }
        return true;
    }
}

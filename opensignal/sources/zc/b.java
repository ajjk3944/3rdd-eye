package zc;

import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.v7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f26862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26863b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f26864c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f26865d;

    /* renamed from: e, reason: collision with root package name */
    public Long f26866e;

    /* renamed from: f, reason: collision with root package name */
    public Long f26867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f26869h;

    /* renamed from: i, reason: collision with root package name */
    public final h5 f26870i;

    public b(c cVar, String str, int i10, h5 h5Var, int i11) {
        this.f26868g = i11;
        this.f26869h = cVar;
        this.f26862a = str;
        this.f26863b = i10;
        this.f26870i = h5Var;
    }

    public static Boolean c(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, com.google.android.gms.internal.measurement.u1 u1Var, j0 j0Var) {
        List listU;
        cc.s.h(u1Var);
        if (str != null && u1Var.p() && u1Var.x() != 1 && (u1Var.x() != 7 ? u1Var.q() : u1Var.v() != 0)) {
            int iX = u1Var.x();
            boolean zT = u1Var.t();
            String strR = (zT || iX == 2 || iX == 7) ? u1Var.r() : u1Var.r().toUpperCase(Locale.ENGLISH);
            if (u1Var.v() == 0) {
                listU = null;
            } else {
                listU = u1Var.u();
                if (!zT) {
                    ArrayList arrayList = new ArrayList(listU.size());
                    Iterator it = listU.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listU = Collections.unmodifiableList(arrayList);
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
                                if (j0Var != null) {
                                    j0Var.F.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
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
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        return Boolean.valueOf(str.equals(strR));
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
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
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.r1 r9, double r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.b.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.r1, double):java.lang.Boolean");
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
    public boolean a(java.lang.Long r22, java.lang.Long r23, com.google.android.gms.internal.measurement.z2 r24, long r25, zc.p r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.b.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.z2, long, zc.p, boolean):boolean");
    }

    public boolean b(Long l10, Long l11, com.google.android.gms.internal.measurement.r3 r3Var, boolean z10) {
        boolean z11;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        v7.a();
        c1 c1Var = (c1) this.f26869h.f1504d;
        f fVar = c1Var.f26887r;
        f0 f0Var = c1Var.F;
        j0 j0Var = c1Var.f26889y;
        boolean zC1 = fVar.C1(this.f26862a, u.D0);
        com.google.android.gms.internal.measurement.t1 t1Var = (com.google.android.gms.internal.measurement.t1) this.f26870i;
        boolean zT = t1Var.t();
        boolean zU = t1Var.u();
        boolean zW = t1Var.w();
        boolean z12 = zT || zU || zW;
        if (z10 && !z12) {
            c1.g(j0Var);
            j0Var.K.d(Integer.valueOf(this.f26863b), t1Var.p() ? Integer.valueOf(t1Var.q()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        com.google.android.gms.internal.measurement.o1 o1VarS = t1Var.s();
        boolean zU2 = o1VarS.u();
        if (!r3Var.u()) {
            z11 = zW;
            if (!r3Var.y()) {
                if (!r3Var.s()) {
                    c1.g(j0Var);
                    j0Var.F.c(f0Var.c(r3Var.r()), "User property has no value, property");
                } else if (o1VarS.p()) {
                    String strT = r3Var.t();
                    com.google.android.gms.internal.measurement.u1 u1VarQ = o1VarS.q();
                    c1.g(j0Var);
                    boolC = c(d(strT, u1VarQ, j0Var), zU2);
                } else if (!o1VarS.r()) {
                    c1.g(j0Var);
                    j0Var.F.c(f0Var.c(r3Var.r()), "No string or number filter defined. property");
                } else if (m0.Y1(r3Var.t())) {
                    String strT2 = r3Var.t();
                    com.google.android.gms.internal.measurement.r1 r1VarS = o1VarS.s();
                    if (m0.Y1(strT2)) {
                        try {
                            boolE = e(new BigDecimal(strT2), r1VarS, 0.0d);
                        } catch (NumberFormatException unused) {
                        }
                        boolC = c(boolE, zU2);
                    } else {
                        boolE = null;
                        boolC = c(boolE, zU2);
                    }
                } else {
                    c1.g(j0Var);
                    j0Var.F.d(f0Var.c(r3Var.r()), r3Var.t(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolC = null;
            } else if (o1VarS.r()) {
                double dZ = r3Var.z();
                try {
                    boolE2 = e(new BigDecimal(dZ), o1VarS.s(), Math.ulp(dZ));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zU2);
            } else {
                c1.g(j0Var);
                j0Var.F.c(f0Var.c(r3Var.r()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (o1VarS.r()) {
            z11 = zW;
            try {
                boolE3 = e(new BigDecimal(r3Var.v()), o1VarS.s(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zU2);
        } else {
            c1.g(j0Var);
            j0Var.F.c(f0Var.c(r3Var.r()), "No number filter for long property. property");
            z11 = zW;
            boolC = null;
        }
        c1.g(j0Var);
        j0Var.K.c(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.f26864c = Boolean.TRUE;
        if (!z11 || boolC.booleanValue()) {
            if (!z10 || t1Var.t()) {
                this.f26865d = boolC;
            }
            if (boolC.booleanValue() && z12 && r3Var.p()) {
                long jQ = r3Var.q();
                if (l10 != null) {
                    jQ = l10.longValue();
                }
                if (zC1 && t1Var.t() && !t1Var.u() && l11 != null) {
                    jQ = l11.longValue();
                }
                if (t1Var.u()) {
                    this.f26867f = Long.valueOf(jQ);
                } else {
                    this.f26866e = Long.valueOf(jQ);
                }
            }
        }
        return true;
    }
}

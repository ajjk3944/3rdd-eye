package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.S1;
import com.google.android.gms.internal.measurement.U1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4825d {

    /* renamed from: a, reason: collision with root package name */
    String f36366a;

    /* renamed from: b, reason: collision with root package name */
    int f36367b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f36368c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f36369d;

    /* renamed from: e, reason: collision with root package name */
    Long f36370e;

    /* renamed from: f, reason: collision with root package name */
    Long f36371f;

    AbstractC4825d(String str, int i10) {
        this.f36366a = str;
        this.f36367b = i10;
    }

    static Boolean b(double d10, com.google.android.gms.internal.measurement.S1 s12) {
        try {
            return h(new BigDecimal(d10), s12, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j10, com.google.android.gms.internal.measurement.S1 s12) {
        try {
            return h(new BigDecimal(j10), s12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    static Boolean e(String str, com.google.android.gms.internal.measurement.S1 s12) {
        if (!s7.c0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), s12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, U1.b bVar, boolean z10, String str2, List list, String str3, L2 l22) {
        if (str == null) {
            return null;
        }
        if (bVar == U1.b.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && bVar != U1.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (F7.f35872a[bVar.ordinal()]) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (l22 != null) {
                            l22.H().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static Boolean g(String str, com.google.android.gms.internal.measurement.U1 u12, L2 l22) {
        List list;
        AbstractC7901p.l(u12);
        if (str == null || !u12.N() || u12.F() == U1.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        U1.b bVarF = u12.F();
        U1.b bVar = U1.b.IN_LIST;
        if (bVarF == bVar) {
            if (u12.j() == 0) {
                return null;
            }
        } else if (!u12.M()) {
            return null;
        }
        U1.b bVarF2 = u12.F();
        boolean zK = u12.K();
        String strI = (zK || bVarF2 == U1.b.REGEXP || bVarF2 == bVar) ? u12.I() : u12.I().toUpperCase(Locale.ENGLISH);
        if (u12.j() == 0) {
            list = null;
        } else {
            List listJ = u12.J();
            if (!zK) {
                ArrayList arrayList = new ArrayList(listJ.size());
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listJ = Collections.unmodifiableList(arrayList);
            }
            list = listJ;
        }
        return f(str, bVarF2, zK, strI, list, bVarF2 == U1.b.REGEXP ? strI : null, l22);
    }

    private static Boolean h(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.S1 s12, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC7901p.l(s12);
        if (s12.M() && s12.F() != S1.b.UNKNOWN_COMPARISON_TYPE) {
            S1.b bVarF = s12.F();
            S1.b bVar = S1.b.BETWEEN;
            if (bVarF == bVar) {
                if (!s12.Q() || !s12.P()) {
                    return null;
                }
            } else if (!s12.N()) {
                return null;
            }
            S1.b bVarF2 = s12.F();
            if (s12.F() == bVar) {
                if (s7.c0(s12.K()) && s7.c0(s12.J())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(s12.K());
                        bigDecimal4 = new BigDecimal(s12.J());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!s7.c0(s12.I())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(s12.I());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (bVarF2 == bVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i10 = F7.f35873b[bVarF2.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (bigDecimal2 != null) {
                        if (d10 == 0.0d) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
            } else if (bigDecimal2 != null) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}

package ma;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Period.java */
/* loaded from: classes3.dex */
public final class l extends I9.g implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final l f44129e = new l(0, 0, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f44130f = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    /* renamed from: b, reason: collision with root package name */
    public final int f44131b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44132c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44133d;

    public l(int i, int i10, int i11) {
        this.f44131b = i;
        this.f44132c = i10;
        this.f44133d = i11;
    }

    public static l j0(String str) {
        com.google.gson.internal.c.v(str, "text");
        Matcher matcher = f44130f.matcher(str);
        if (matcher.matches()) {
            int i = "-".equals(matcher.group(1)) ? -1 : 1;
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(3);
            String strGroup3 = matcher.group(4);
            String strGroup4 = matcher.group(5);
            if (strGroup != null || strGroup2 != null || strGroup3 != null || strGroup4 != null) {
                try {
                    int iK0 = k0(i, str, strGroup);
                    int iK02 = k0(i, str, strGroup2);
                    int iA = com.google.gson.internal.c.A(k0(i, str, strGroup4), com.google.gson.internal.c.C(k0(i, str, strGroup3), 7));
                    return ((iK0 | iK02) | iA) == 0 ? f44129e : new l(iK0, iK02, iA);
                } catch (NumberFormatException e4) {
                    throw ((oa.e) new oa.e("Text cannot be parsed to a Period").initCause(e4));
                }
            }
        }
        throw new oa.e("Text cannot be parsed to a Period");
    }

    public static int k0(int i, String str, String str2) {
        if (str2 == null) {
            return 0;
        }
        try {
            return com.google.gson.internal.c.C(Integer.parseInt(str2), i);
        } catch (ArithmeticException e4) {
            oa.e eVar = new oa.e("Text cannot be parsed to a Period");
            str.getClass();
            throw ((oa.e) eVar.initCause(e4));
        }
    }

    private Object readResolve() {
        return ((this.f44131b | this.f44132c) | this.f44133d) == 0 ? f44129e : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f44131b == lVar.f44131b && this.f44132c == lVar.f44132c && this.f44133d == lVar.f44133d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f44133d, 16) + Integer.rotateLeft(this.f44132c, 8) + this.f44131b;
    }

    public final qa.d i0(qa.d dVar) {
        int i = this.f44132c;
        int i10 = this.f44131b;
        if (i10 != 0) {
            if (i != 0) {
                dVar = ((d) dVar).q((i10 * 12) + i, qa.b.MONTHS);
            } else {
                dVar = ((d) dVar).q(i10, qa.b.YEARS);
            }
        } else if (i != 0) {
            dVar = ((d) dVar).q(i, qa.b.MONTHS);
        }
        int i11 = this.f44133d;
        if (i11 == 0) {
            return dVar;
        }
        return ((d) dVar).q(i11, qa.b.DAYS);
    }

    public final String toString() {
        if (this == f44129e) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.f44131b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i10 = this.f44132c;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        int i11 = this.f44133d;
        if (i11 != 0) {
            sb.append(i11);
            sb.append('D');
        }
        return sb.toString();
    }
}

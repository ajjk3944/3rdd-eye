package k7;

import br.l;
import java.util.Locale;
import w.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14168a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14169b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14170c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14171d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14172e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14173f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14174g;

    public a(int i10, int i11, String str, String str2, String str3, boolean z10) {
        this.f14168a = str;
        this.f14169b = str2;
        this.f14170c = z10;
        this.f14171d = i10;
        this.f14172e = str3;
        this.f14173f = i11;
        Locale locale = Locale.US;
        l.d(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        l.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f14174g = tt.l.q0(upperCase, "INT", false) ? 3 : (tt.l.q0(upperCase, "CHAR", false) || tt.l.q0(upperCase, "CLOB", false) || tt.l.q0(upperCase, "TEXT", false)) ? 2 : tt.l.q0(upperCase, "BLOB", false) ? 5 : (tt.l.q0(upperCase, "REAL", false) || tt.l.q0(upperCase, "FLOA", false) || tt.l.q0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f14171d != aVar.f14171d) {
                return false;
            }
            int i10 = aVar.f14173f;
            String str = aVar.f14172e;
            if (!this.f14168a.equals(aVar.f14168a) || this.f14170c != aVar.f14170c) {
                return false;
            }
            String str2 = this.f14172e;
            int i11 = this.f14173f;
            if (i11 == 1 && i10 == 2 && str2 != null && !dr.a.k(str2, str)) {
                return false;
            }
            if (i11 == 2 && i10 == 1 && str != null && !dr.a.k(str, str2)) {
                return false;
            }
            if (i11 != 0 && i11 == i10) {
                if (str2 != null) {
                    if (!dr.a.k(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f14174g != aVar.f14174g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f14168a.hashCode() * 31) + this.f14174g) * 31) + (this.f14170c ? 1231 : 1237)) * 31) + this.f14171d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.f14168a);
        sb2.append("', type='");
        sb2.append(this.f14169b);
        sb2.append("', affinity='");
        sb2.append(this.f14174g);
        sb2.append("', notNull=");
        sb2.append(this.f14170c);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f14171d);
        sb2.append(", defaultValue='");
        String str = this.f14172e;
        if (str == null) {
            str = "undefined";
        }
        return g.j(sb2, str, "'}");
    }
}

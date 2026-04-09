package E0;

import A.f;
import java.util.Locale;
import q5.i;
import y5.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1332a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1333b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1335d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1336e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1337f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1338g;

    public a(String str, boolean z6, int i, String str2, int i3, String str3) {
        this.f1332a = str;
        this.f1333b = str2;
        this.f1334c = z6;
        this.f1335d = i;
        this.f1336e = str3;
        this.f1337f = i3;
        Locale locale = Locale.US;
        i.d(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f1338g = l.V(upperCase, "INT", false) ? 3 : (l.V(upperCase, "CHAR", false) || l.V(upperCase, "CLOB", false) || l.V(upperCase, "TEXT", false)) ? 2 : l.V(upperCase, "BLOB", false) ? 5 : (l.V(upperCase, "REAL", false) || l.V(upperCase, "FLOA", false) || l.V(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f1335d != aVar.f1335d) {
                return false;
            }
            String str = aVar.f1332a;
            int i = aVar.f1337f;
            String str2 = aVar.f1336e;
            if (!this.f1332a.equals(str) || this.f1334c != aVar.f1334c) {
                return false;
            }
            String str3 = this.f1336e;
            int i3 = this.f1337f;
            if (i3 == 1 && i == 2 && str3 != null && !R3.b.h(str3, str2)) {
                return false;
            }
            if (i3 == 2 && i == 1 && str2 != null && !R3.b.h(str2, str3)) {
                return false;
            }
            if (i3 != 0 && i3 == i) {
                if (str3 != null) {
                    if (!R3.b.h(str3, str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            }
            if (this.f1338g != aVar.f1338g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f1332a.hashCode() * 31) + this.f1338g) * 31) + (this.f1334c ? 1231 : 1237)) * 31) + this.f1335d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f1332a);
        sb.append("', type='");
        sb.append(this.f1333b);
        sb.append("', affinity='");
        sb.append(this.f1338g);
        sb.append("', notNull=");
        sb.append(this.f1334c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f1335d);
        sb.append(", defaultValue='");
        String str = this.f1336e;
        if (str == null) {
            str = "undefined";
        }
        return f.p(sb, str, "'}");
    }
}

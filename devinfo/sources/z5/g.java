package z5;

import java.util.Locale;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f37937a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37938b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37939c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37940d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37941e;

    /* renamed from: f, reason: collision with root package name */
    public final int f37942f;
    public final int g;

    public g(String str, boolean z3, int i4, String str2, int i10, String str3) {
        k.e(str, "name");
        k.e(str2, "type");
        this.f37937a = str;
        this.f37938b = str2;
        this.f37939c = z3;
        this.f37940d = i4;
        this.f37941e = str3;
        this.f37942f = i10;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        k.d(upperCase, "toUpperCase(...)");
        this.g = vk.i.y0(upperCase, "INT", false) ? 3 : (vk.i.y0(upperCase, "CHAR", false) || vk.i.y0(upperCase, "CLOB", false) || vk.i.y0(upperCase, "TEXT", false)) ? 2 : vk.i.y0(upperCase, "BLOB", false) ? 5 : (vk.i.y0(upperCase, "REAL", false) || vk.i.y0(upperCase, "FLOA", false) || vk.i.y0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                boolean z3 = this.f37940d > 0;
                g gVar = (g) obj;
                int i4 = gVar.f37942f;
                if (z3 == (gVar.f37940d > 0) && k.a(this.f37937a, gVar.f37937a) && this.f37939c == gVar.f37939c) {
                    String str = gVar.f37941e;
                    int i10 = this.f37942f;
                    String str2 = this.f37941e;
                    if ((i10 != 1 || i4 != 2 || str2 == null || pd.b.f(str2, str)) && ((i10 != 2 || i4 != 1 || str == null || pd.b.f(str, str2)) && ((i10 == 0 || i10 != i4 || (str2 == null ? str == null : pd.b.f(str2, str))) && this.g == gVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f37937a.hashCode() * 31) + this.g) * 31) + (this.f37939c ? 1231 : 1237)) * 31) + this.f37940d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f37937a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f37938b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f37939c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f37940d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f37941e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return vk.j.k0(vk.j.m0(sb2.toString()));
    }
}

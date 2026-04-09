package bc;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2571a;

    /* renamed from: b, reason: collision with root package name */
    public final bm.e f2572b;

    /* renamed from: c, reason: collision with root package name */
    public final ac.b f2573c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2574d;

    public a(bm.e eVar, ac.b bVar, String str) {
        this.f2572b = eVar;
        this.f2573c = bVar;
        this.f2574d = str;
        this.f2571a = Arrays.hashCode(new Object[]{eVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return cc.s.k(this.f2572b, aVar.f2572b) && cc.s.k(this.f2573c, aVar.f2573c) && cc.s.k(this.f2574d, aVar.f2574d);
    }

    public final int hashCode() {
        return this.f2571a;
    }
}

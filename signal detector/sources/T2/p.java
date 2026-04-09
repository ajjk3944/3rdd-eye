package t2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f23642a;

    /* renamed from: b, reason: collision with root package name */
    public final double f23643b;

    /* renamed from: c, reason: collision with root package name */
    public final double f23644c;

    /* renamed from: d, reason: collision with root package name */
    public final double f23645d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23646e;

    public p(String str, double d6, double d7, double d8, int i) {
        this.f23642a = str;
        this.f23644c = d6;
        this.f23643b = d7;
        this.f23645d = d8;
        this.f23646e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return M2.u.g(this.f23642a, pVar.f23642a) && this.f23643b == pVar.f23643b && this.f23644c == pVar.f23644c && this.f23646e == pVar.f23646e && Double.compare(this.f23645d, pVar.f23645d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23642a, Double.valueOf(this.f23643b), Double.valueOf(this.f23644c), Double.valueOf(this.f23645d), Integer.valueOf(this.f23646e)});
    }

    public final String toString() {
        V2.h hVar = new V2.h(this);
        hVar.g(this.f23642a, "name");
        hVar.g(Double.valueOf(this.f23644c), "minBound");
        hVar.g(Double.valueOf(this.f23643b), "maxBound");
        hVar.g(Double.valueOf(this.f23645d), "percent");
        hVar.g(Integer.valueOf(this.f23646e), "count");
        return hVar.toString();
    }
}

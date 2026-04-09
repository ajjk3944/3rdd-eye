package o0;

import je.u;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f30345a;

    /* renamed from: b, reason: collision with root package name */
    public String f30346b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30347c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f30348d = null;

    public g(String str, String str2) {
        this.f30345a = str;
        this.f30346b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.a(this.f30345a, gVar.f30345a) && k.a(this.f30346b, gVar.f30346b) && this.f30347c == gVar.f30347c && k.a(this.f30348d, gVar.f30348d);
    }

    public final int hashCode() {
        int iM = (u.m(this.f30345a.hashCode() * 31, 31, this.f30346b) + (this.f30347c ? 1231 : 1237)) * 31;
        d dVar = this.f30348d;
        return iM + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
        sb2.append(this.f30348d);
        sb2.append(", isShowingSubstitution=");
        return d.h.x(sb2, this.f30347c, ')');
    }
}

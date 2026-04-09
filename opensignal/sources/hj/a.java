package hj;

import br.l;
import dt.w;
import kk.b;
import oh.t;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final t f10790a;

    /* renamed from: b, reason: collision with root package name */
    public final b f10791b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10792c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10793d;

    /* renamed from: e, reason: collision with root package name */
    public final w f10794e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10795f;

    /* renamed from: g, reason: collision with root package name */
    public final w f10796g;

    public a(t tVar, b bVar, String str, String str2, w wVar, long j, sh.a aVar) {
        this.f10790a = tVar;
        this.f10791b = bVar;
        this.f10792c = str;
        this.f10793d = str2;
        this.f10794e = wVar;
        this.f10795f = j;
        this.f10796g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f10790a, aVar.f10790a) && this.f10791b == aVar.f10791b && l.a(this.f10792c, aVar.f10792c) && l.a(this.f10793d, aVar.f10793d) && l.a(this.f10794e, aVar.f10794e) && this.f10795f == aVar.f10795f && l.a(this.f10796g, aVar.f10796g);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f10792c, (this.f10791b.hashCode() + (this.f10790a.hashCode() * 31)) * 31, 31);
        String str = this.f10793d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        w wVar = this.f10794e;
        int iB = h0.b.b((iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31, 31, this.f10795f);
        w wVar2 = this.f10796g;
        return iB + (wVar2 != null ? wVar2.hashCode() : 0);
    }

    public final String toString() {
        return "VideoTestComponents(videoTest=" + this.f10790a + ", platform=" + this.f10791b + ", resource=" + this.f10792c + ", urlFormat=" + this.f10793d + ", resourceGetter=" + this.f10794e + ", testLength=" + this.f10795f + ", remoteResourceGetter=" + this.f10796g + ')';
    }
}

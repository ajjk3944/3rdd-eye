package bj;

import br.l;
import fj.g;
import yi.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final g f2782a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2783b;

    /* renamed from: c, reason: collision with root package name */
    public final df.c f2784c;

    /* renamed from: d, reason: collision with root package name */
    public final al.b f2785d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2786e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2787f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2788g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2789h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2790i;
    public long j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f2791l;

    /* renamed from: m, reason: collision with root package name */
    public long f2792m;

    public b(g gVar, e eVar, df.c cVar, al.b bVar, String str, boolean z10, int i10, boolean z11) {
        l.e(str, "taskName");
        this.f2782a = gVar;
        this.f2783b = eVar;
        this.f2784c = cVar;
        this.f2785d = bVar;
        this.f2786e = str;
        this.f2787f = z10;
        this.f2788g = i10;
        this.f2789h = z11;
        this.f2790i = gVar.l();
        this.j = -1L;
        this.k = -1L;
        this.f2791l = -1L;
        this.f2792m = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type com.opensignal.sdk.data.stats.TaskNetworkStatsCollector");
        b bVar = (b) obj;
        return l.a(this.f2783b, bVar.f2783b) && l.a(this.f2784c, bVar.f2784c) && l.a(this.f2786e, bVar.f2786e) && this.f2787f == bVar.f2787f && this.f2788g == bVar.f2788g && this.f2790i == bVar.f2790i && this.j == bVar.j && this.f2792m == bVar.f2792m && this.f2789h == bVar.f2789h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2789h) + h0.b.b(h0.b.b((((w.g.b(c7.a.g(this.f2786e, (this.f2784c.hashCode() + (this.f2783b.hashCode() * 31)) * 31, 31), this.f2787f, 31) + this.f2788g) * 31) + this.f2790i) * 31, 31, this.j), 31, this.f2792m);
    }
}

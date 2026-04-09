package yi;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class d {
    public Long A;

    /* renamed from: a, reason: collision with root package name */
    public final e f26371a;

    /* renamed from: b, reason: collision with root package name */
    public Long f26372b;

    /* renamed from: c, reason: collision with root package name */
    public Long f26373c;

    /* renamed from: d, reason: collision with root package name */
    public Long f26374d;

    /* renamed from: e, reason: collision with root package name */
    public Long f26375e;

    /* renamed from: f, reason: collision with root package name */
    public Long f26376f;

    /* renamed from: g, reason: collision with root package name */
    public Long f26377g;

    /* renamed from: h, reason: collision with root package name */
    public Long f26378h;

    /* renamed from: i, reason: collision with root package name */
    public Long f26379i;
    public Long j;
    public Long k;

    /* renamed from: l, reason: collision with root package name */
    public Long f26380l;

    /* renamed from: m, reason: collision with root package name */
    public Long f26381m;

    /* renamed from: n, reason: collision with root package name */
    public Long f26382n;

    /* renamed from: o, reason: collision with root package name */
    public Long f26383o;

    /* renamed from: p, reason: collision with root package name */
    public Long f26384p;

    /* renamed from: q, reason: collision with root package name */
    public Long f26385q;

    /* renamed from: r, reason: collision with root package name */
    public Long f26386r;

    /* renamed from: s, reason: collision with root package name */
    public Long f26387s;

    /* renamed from: t, reason: collision with root package name */
    public Long f26388t;

    /* renamed from: u, reason: collision with root package name */
    public Long f26389u;

    /* renamed from: v, reason: collision with root package name */
    public Long f26390v;

    /* renamed from: w, reason: collision with root package name */
    public Long f26391w;

    /* renamed from: x, reason: collision with root package name */
    public Long f26392x;

    /* renamed from: y, reason: collision with root package name */
    public Long f26393y;

    /* renamed from: z, reason: collision with root package name */
    public Long f26394z;

    public d(e eVar, df.c cVar) {
        this.f26371a = eVar;
    }

    public static Long a(Long l10, Long l11) {
        if (l10 == null || l11 == null) {
            return null;
        }
        return Long.valueOf(l10.longValue() - l11.longValue());
    }

    public final void b() {
        b bVar = b.WIFI;
        a aVar = a.TX;
        c cVar = c.BYTES;
        e eVar = this.f26371a;
        this.f26376f = eVar.b(bVar, aVar, cVar);
        a aVar2 = a.RX;
        this.f26377g = eVar.b(bVar, aVar2, cVar);
        b bVar2 = b.CELL;
        this.f26378h = eVar.b(bVar2, aVar, cVar);
        this.f26379i = eVar.b(bVar2, aVar2, cVar);
        this.k = Long.valueOf(SystemClock.elapsedRealtime());
        c cVar2 = c.DROPPED;
        this.f26380l = eVar.b(bVar, aVar, cVar2);
        c cVar3 = c.PACKETS;
        this.f26381m = eVar.b(bVar, aVar, cVar3);
        this.f26382n = eVar.b(bVar2, aVar, cVar2);
        this.f26383o = eVar.b(bVar2, aVar, cVar3);
        this.f26384p = eVar.b(bVar, aVar2, cVar2);
        this.f26385q = eVar.b(bVar, aVar2, cVar3);
        this.f26386r = eVar.b(bVar2, aVar2, cVar2);
        this.f26387s = eVar.b(bVar2, aVar2, cVar3);
    }

    public final void c() {
        b bVar = b.WIFI;
        a aVar = a.TX;
        c cVar = c.BYTES;
        e eVar = this.f26371a;
        this.f26372b = eVar.b(bVar, aVar, cVar);
        a aVar2 = a.RX;
        this.f26373c = eVar.b(bVar, aVar2, cVar);
        b bVar2 = b.CELL;
        this.f26374d = eVar.b(bVar2, aVar, cVar);
        this.f26375e = eVar.b(bVar2, aVar2, cVar);
        this.j = Long.valueOf(SystemClock.elapsedRealtime());
        c cVar2 = c.DROPPED;
        this.f26388t = eVar.b(bVar, aVar, cVar2);
        c cVar3 = c.PACKETS;
        this.f26389u = eVar.b(bVar, aVar, cVar3);
        this.f26390v = eVar.b(bVar2, aVar, cVar2);
        this.f26391w = eVar.b(bVar2, aVar, cVar3);
        this.f26392x = eVar.b(bVar, aVar2, cVar2);
        this.f26393y = eVar.b(bVar, aVar2, cVar3);
        this.f26394z = eVar.b(bVar2, aVar2, cVar2);
        this.A = eVar.b(bVar2, aVar2, cVar3);
    }
}

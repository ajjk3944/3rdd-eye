package j5;

import java.util.List;

/* loaded from: classes.dex */
public final class d extends ab.b {

    /* renamed from: x, reason: collision with root package name */
    public final List f13263x;

    /* renamed from: y, reason: collision with root package name */
    public final long f13264y;

    public d(long j, List list) {
        super(1, 0L, list.size() - 1);
        this.f13264y = j;
        this.f13263x = list;
    }

    @Override // ab.n, p5.m
    public final long a() {
        c();
        return this.f13264y + ((k5.h) this.f13263x.get((int) this.f287r)).f14061x;
    }

    @Override // ab.n, p5.m
    public final long b() {
        c();
        k5.h hVar = (k5.h) this.f13263x.get((int) this.f287r);
        return this.f13264y + hVar.f14061x + hVar.f14059g;
    }
}

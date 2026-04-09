package ka;

import ca.t;
import ca.u;
import ca.v;

/* loaded from: classes.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f14227a;

    public a(b bVar) {
        this.f14227a = bVar;
    }

    @Override // ca.u
    public final boolean b() {
        return true;
    }

    @Override // ca.u
    public final t d(long j) {
        b bVar = this.f14227a;
        long j7 = bVar.f14229d;
        long j10 = bVar.f14230g;
        v vVar = new v(j, qb.v.j(((((j10 - j7) * ((((h) bVar.I).f14253f * j) / 1000000)) / bVar.f14232x) + j7) - 30000, j7, j10 - 1));
        return new t(vVar, vVar);
    }

    @Override // ca.u
    public final long e() {
        return (this.f14227a.f14232x * 1000000) / ((h) r0.I).f14253f;
    }
}

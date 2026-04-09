package m6;

import a5.d0;
import ka.h;
import u5.w;
import u5.x;
import u5.y;

/* loaded from: classes.dex */
public final class a implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ka.b f16305a;

    public a(ka.b bVar) {
        this.f16305a = bVar;
    }

    @Override // u5.x
    public final boolean b() {
        return true;
    }

    @Override // u5.x
    public final w d(long j) {
        ka.b bVar = this.f16305a;
        long j7 = bVar.f14229d;
        long j10 = bVar.f14230g;
        y yVar = new y(j, d0.i(((((j10 - j7) * ((((h) bVar.I).f14253f * j) / 1000000)) / bVar.f14232x) + j7) - 30000, j7, j10 - 1));
        return new w(yVar, yVar);
    }

    @Override // u5.x
    public final long e() {
        return (this.f16305a.f14232x * 1000000) / ((h) r0.I).f14253f;
    }
}

package at;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends ts.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f2290c;

    public g(ArrayList arrayList, h hVar) {
        this.f2289b = arrayList;
        this.f2290c = hVar;
    }

    @Override // ts.o
    public final void b(rr.d dVar) {
        br.l.e(dVar, "fakeOverride");
        ts.n.r(dVar, null);
        this.f2289b.add(dVar);
    }

    @Override // ts.o
    public final void d(rr.d dVar, rr.d dVar2) {
        br.l.e(dVar2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f2290c.f2292b + ": " + dVar + " vs " + dVar2).toString());
    }
}

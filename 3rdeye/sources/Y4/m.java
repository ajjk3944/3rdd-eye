package y4;

import u4.t;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class m extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f48116c;

    public m(t tVar) {
        this.f48116c = tVar;
    }

    @Override // y4.h
    public final void a() {
        n nVar = (n) this.f48116c.f46584b;
        nVar.f48119b.a("unlinkToDeath", new Object[0]);
        nVar.f48129m.asBinder().unlinkToDeath(nVar.f48126j, 0);
        nVar.f48129m = null;
        nVar.f48124g = false;
    }
}

package y4;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f48113c;

    public j(n nVar) {
        this.f48113c = nVar;
    }

    @Override // y4.h
    public final void a() {
        n nVar = this.f48113c;
        if (nVar.f48129m != null) {
            nVar.f48119b.a("Unbind from service.", new Object[0]);
            nVar.f48118a.unbindService(nVar.f48128l);
            nVar.f48124g = false;
            nVar.f48129m = null;
            nVar.f48128l = null;
        }
        nVar.b();
    }
}

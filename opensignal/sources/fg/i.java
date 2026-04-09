package fg;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final dd.h f8858a;

    public i(dd.h hVar) {
        this.f8858a = hVar;
    }

    @Override // fg.k
    public final boolean a(gg.b bVar) {
        gg.d dVar = bVar.f9571b;
        if (dVar != gg.d.UNREGISTERED && dVar != gg.d.REGISTERED && dVar != gg.d.REGISTER_ERROR) {
            return false;
        }
        this.f8858a.c(bVar.f9570a);
        return true;
    }

    @Override // fg.k
    public final boolean b(Exception exc) {
        return false;
    }
}

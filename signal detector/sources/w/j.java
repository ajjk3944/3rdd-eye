package w;

/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f23928h;

    public j(k kVar) {
        this.f23928h = kVar;
    }

    @Override // w.g
    public final String g() {
        h hVar = (h) this.f23928h.f23929a.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f23924a + "]";
    }
}

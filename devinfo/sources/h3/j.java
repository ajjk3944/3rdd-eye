package h3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f24837h;

    public j(k kVar) {
        this.f24837h = kVar;
    }

    @Override // h3.g
    public final String i() {
        h hVar = (h) this.f24837h.f24838a.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f24833a + "]";
    }
}

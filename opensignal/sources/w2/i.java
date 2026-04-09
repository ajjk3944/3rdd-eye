package w2;

/* loaded from: classes.dex */
public final class i extends g {
    public final /* synthetic */ j D;

    public i(j jVar) {
        this.D = jVar;
    }

    @Override // w2.g
    public final String h() {
        h hVar = (h) this.D.f24188a.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f24184a + "]";
    }
}

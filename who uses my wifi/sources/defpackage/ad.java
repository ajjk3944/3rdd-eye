package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ad extends k0 {
    public final /* synthetic */ bd m;

    public ad(bd bdVar) {
        this.m = bdVar;
    }

    @Override // defpackage.k0
    public final String g() {
        yc ycVar = (yc) this.m.f.get();
        if (ycVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + ycVar.a + "]";
    }
}

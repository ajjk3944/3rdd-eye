package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t32 implements iq3, vg2 {
    public final /* synthetic */ ag2 f;

    public /* synthetic */ t32(ag2 ag2Var) {
        this.f = ag2Var;
    }

    @Override // defpackage.vg2
    /* renamed from: a */
    public /* synthetic */ void mo7a() {
        this.f.P();
    }

    @Override // defpackage.iq3
    public /* bridge */ /* synthetic */ void p(Object obj) {
        String str = (String) obj;
        ag2 ag2Var = this.f;
        new w72(ag2Var.getContext(), ag2Var.u().f, str, ag2Var.F() != null ? ag2Var.F().x0 : null).r1();
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        hg4.C.h.d("DefaultGmsgHandlers.attributionReportingManager", th);
    }
}

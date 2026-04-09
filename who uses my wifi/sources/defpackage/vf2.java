package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class vf2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ wf2 g;

    public /* synthetic */ vf2(wf2 wf2Var, int i) {
        this.f = i;
        this.g = wf2Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                wf2 wf2Var = this.g;
                ee2 ee2Var = wf2Var.j;
                if (ee2Var != null) {
                    if (!wf2Var.k) {
                        ee2Var.k();
                        wf2Var.k = true;
                    }
                    wf2Var.j.f();
                    break;
                }
                break;
            case 1:
                ee2 ee2Var2 = this.g.j;
                if (ee2Var2 != null) {
                    ee2Var2.g();
                    break;
                }
                break;
            default:
                ee2 ee2Var3 = this.g.j;
                if (ee2Var3 != null) {
                    ee2Var3.e();
                    break;
                }
                break;
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class or2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ pr2 g;
    public final /* synthetic */ hv1 h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ or2(pr2 pr2Var, rs2 rs2Var, int i) {
        this.f = i;
        switch (i) {
            case 1:
                this.g = pr2Var;
                this.h = (hv1) rs2Var;
                break;
            default:
                this.g = pr2Var;
                this.h = (hv1) rs2Var;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hv1, rs2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hv1, rs2] */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                this.g.g(this.h);
                break;
            default:
                this.g.h(this.h);
                break;
        }
    }
}

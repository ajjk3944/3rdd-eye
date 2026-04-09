package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xd2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ae2 i;

    public /* synthetic */ xd2(ae2 ae2Var, int i, int i2, int i3) {
        this.f = i3;
        this.g = i;
        this.h = i2;
        this.i = ae2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ee2 ee2Var = ((yd2) this.i).v;
                if (ee2Var != null) {
                    ee2Var.j(this.g, this.h);
                    break;
                }
                break;
            default:
                ee2 ee2Var2 = ((se2) this.i).l;
                if (ee2Var2 != null) {
                    ee2Var2.j(this.g, this.h);
                    break;
                }
                break;
        }
    }
}

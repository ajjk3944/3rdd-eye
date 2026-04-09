package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fo2 implements Runnable {
    public final /* synthetic */ int f;
    public final WeakReference g;

    public /* synthetic */ fo2(go2 go2Var, int i) {
        this.f = i;
        switch (i) {
            case 1:
                this.g = new WeakReference(go2Var);
                break;
            default:
                this.g = new WeakReference(go2Var);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                go2 go2Var = (go2) this.g.get();
                if (go2Var != null) {
                    go2Var.P1(sd2.t);
                    break;
                }
                break;
            default:
                go2 go2Var2 = (go2) this.g.get();
                if (go2Var2 != null) {
                    go2Var2.P1(qd2.s);
                    break;
                }
                break;
        }
    }
}

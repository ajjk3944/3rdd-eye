package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class it1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ jt1 g;

    public /* synthetic */ it1(jt1 jt1Var, int i) {
        this.f = i;
        this.g = jt1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                jt1 jt1Var = this.g;
                jt1Var.getClass();
                try {
                    if (jt1Var.f == null && jt1Var.g) {
                        k3 k3Var = new k3(jt1Var.a, 30000L, false);
                        k3Var.d(true);
                        jt1Var.f = k3Var;
                        break;
                    }
                } catch (IOException | nz unused) {
                    jt1Var.f = null;
                    return;
                }
                break;
            default:
                mz1.a(this.g.a);
                break;
        }
    }
}

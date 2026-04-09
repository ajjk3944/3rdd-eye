package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kx0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ lx0 g;
    public final /* synthetic */ tn h;

    public /* synthetic */ kx0(tn tnVar, lx0 lx0Var, int i) {
        this.f = i;
        this.h = tnVar;
        this.g = lx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ArrayList arrayList = this.h.b;
                lx0 lx0Var = this.g;
                if (arrayList.contains(lx0Var)) {
                    ex0.a(lx0Var.c.J, lx0Var.a);
                    break;
                }
                break;
            default:
                tn tnVar = this.h;
                ArrayList arrayList2 = tnVar.b;
                lx0 lx0Var2 = this.g;
                arrayList2.remove(lx0Var2);
                tnVar.c.remove(lx0Var2);
                break;
        }
    }
}

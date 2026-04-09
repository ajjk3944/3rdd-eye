package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class mh3 implements Callable {
    public final /* synthetic */ nh3 a;
    public final /* synthetic */ int b;

    public /* synthetic */ mh3(nh3 nh3Var, int i) {
        this.a = nh3Var;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.b - 1;
        nh3 nh3Var = this.a;
        if (i == 1) {
            return (kh3) nh3Var.a.d();
        }
        if (i == 2) {
            return (kh3) nh3Var.b.d();
        }
        if (i == 3) {
            return (kh3) nh3Var.c.d();
        }
        nh3Var.getClass();
        throw new IllegalArgumentException();
    }
}

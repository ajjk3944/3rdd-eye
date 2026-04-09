package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sx2 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ vy2 c;

    public sx2(vy2 vy2Var, wj4 wj4Var, Executor executor) {
        this.c = vy2Var;
        this.a = new WeakReference(wj4Var);
        this.b = executor;
    }
}

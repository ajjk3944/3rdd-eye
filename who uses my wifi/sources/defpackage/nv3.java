package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nv3 {
    public static final nv3 b = new nv3();
    public static final mv3 c = new mv3();
    public final AtomicReference a = new AtomicReference();

    public final mv3 a() {
        mv3 mv3Var = (mv3) this.a.get();
        return mv3Var == null ? c : mv3Var;
    }
}

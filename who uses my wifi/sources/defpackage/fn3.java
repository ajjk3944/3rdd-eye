package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class fn3 extends gm3 implements Serializable {
    public final transient xn3 i;
    public final transient int j;
    public transient en3 k;

    public fn3(xn3 xn3Var, int i) {
        this.i = xn3Var;
        this.j = i;
        Object[] objArr = yn3.n;
    }

    @Override // defpackage.em3
    public final /* synthetic */ Collection a() {
        return new bn3(this);
    }

    @Override // defpackage.em3
    public final Map b() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.em3
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // defpackage.em3
    public /* synthetic */ Map d() {
        return this.i;
    }
}

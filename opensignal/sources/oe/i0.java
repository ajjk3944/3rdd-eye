package oe;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public class i0 extends r implements Serializable {

    /* renamed from: r, reason: collision with root package name */
    public final transient z0 f19338r;

    public i0(z0 z0Var, int i10) {
        this.f19338r = z0Var;
    }

    @Override // oe.q
    public final Map a() {
        return this.f19338r;
    }

    @Override // oe.q
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }
}

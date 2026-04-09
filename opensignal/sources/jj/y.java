package jj;

import com.google.android.gms.internal.measurement.e5;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends androidx.lifecycle.o {
    public hk.k B;

    /* renamed from: g, reason: collision with root package name */
    public final al.b f13758g;

    /* renamed from: r, reason: collision with root package name */
    public final m0 f13759r;

    /* renamed from: x, reason: collision with root package name */
    public final List f13760x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f13761y;

    public y(al.b bVar) {
        super(10, false);
        this.f13758g = bVar;
        this.f13759r = m0.NETWORK_BLOCKED_TRIGGER;
        this.f13760x = e5.I(o0.NETWORK_BLOCKED, o0.NETWORK_UNBLOCKED);
    }

    @Override // androidx.lifecycle.o
    public final hk.k g1() {
        return this.B;
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        return this.f13759r;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        return this.f13760x;
    }

    @Override // androidx.lifecycle.o
    public final void r1(hk.k kVar) {
        bk.c cVar = (bk.c) this.f13758g.f813e;
        this.B = kVar;
        if (kVar == null) {
            cVar.k(this);
        } else {
            cVar.f(this);
        }
    }
}

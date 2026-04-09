package jj;

import com.google.android.gms.internal.measurement.e5;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends androidx.lifecycle.o implements ek.a {
    public hk.k B;

    /* renamed from: g, reason: collision with root package name */
    public final xi.j f13747g;

    /* renamed from: r, reason: collision with root package name */
    public final bk.f f13748r;

    /* renamed from: x, reason: collision with root package name */
    public final m0 f13749x;

    /* renamed from: y, reason: collision with root package name */
    public final List f13750y;

    public q(xi.j jVar, al.b bVar, bk.f fVar) {
        super(10, false);
        this.f13747g = jVar;
        this.f13748r = fVar;
        this.f13749x = m0.CONNECTION_CHANGED_TRIGGER;
        this.f13750y = e5.H(o0.CONNECTION_CHANGED);
        fVar.f2808f = this;
    }

    @Override // ek.a
    public final void M0(ak.s sVar) {
        ch.n.b("ConnectionChangedTriggerDataSource", "onConnectionChanged() called with: connection = " + sVar);
        this.f13748r.d(bk.d.CONNECTIVITY_CHANGE_UPDATED);
    }

    @Override // androidx.lifecycle.o
    public final hk.k g1() {
        return this.B;
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        return this.f13749x;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        return this.f13750y;
    }

    @Override // androidx.lifecycle.o
    public final void r1(hk.k kVar) {
        xi.j jVar = this.f13747g;
        this.B = kVar;
        if (kVar != null) {
            jVar.a(this);
            return;
        }
        synchronized (jVar.P) {
            jVar.P.remove(this);
        }
    }
}

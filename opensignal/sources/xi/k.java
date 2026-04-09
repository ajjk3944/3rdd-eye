package xi;

import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import jj.m0;
import jj.o0;

/* loaded from: classes.dex */
public final class k extends n implements ek.e {
    public hk.k B;

    /* renamed from: r, reason: collision with root package name */
    public final js.e f25344r;

    /* renamed from: x, reason: collision with root package name */
    public final m0 f25345x;

    /* renamed from: y, reason: collision with root package name */
    public final List f25346y;

    public k(u uVar, js.e eVar) {
        super(uVar);
        this.f25344r = eVar;
        this.f25345x = m0.LOCATION_EXPIRED_TRIGGER;
        this.f25346y = e5.H(o0.LOCATION_EXPIRED);
    }

    @Override // androidx.lifecycle.o
    public final hk.k g1() {
        return this.B;
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        return this.f25345x;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        return this.f25346y;
    }

    @Override // ek.e
    public final void q0() {
        ch.n.b("LocationExpiredDataSource", "Location has expired");
        a1();
    }

    @Override // androidx.lifecycle.o
    public final void r1(hk.k kVar) {
        boolean zContains;
        boolean zContains2;
        this.B = kVar;
        if (kVar != null) {
            synchronized (this.f25354g) {
                u uVar = this.f25354g;
                synchronized (uVar.I) {
                    zContains = uVar.I.contains(this);
                }
                if (!zContains) {
                    u uVar2 = this.f25354g;
                    synchronized (uVar2.I) {
                        uVar2.I.add(this);
                    }
                }
            }
            return;
        }
        synchronized (this.f25354g) {
            u uVar3 = this.f25354g;
            synchronized (uVar3.I) {
                zContains2 = uVar3.I.contains(this);
            }
            if (zContains2) {
                u uVar4 = this.f25354g;
                synchronized (uVar4.I) {
                    uVar4.I.remove(this);
                }
                uVar4.g();
            }
        }
    }

    @Override // xi.n
    public final boolean t1(hk.h hVar) {
        br.l.e(hVar, "task");
        ak.u uVar = hVar.C;
        js.e eVar = this.f25344r;
        eVar.getClass();
        br.l.e(uVar, "deviceLocation");
        return uVar.d((df.c) eVar.f13798g, ((ak.g) ((q3.a) eVar.f13799r).f20680g).f529f.f450b);
    }
}

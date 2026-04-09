package xi;

import android.location.Location;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import jj.m0;
import jj.o0;

/* loaded from: classes.dex */
public final class l extends n implements ek.f {
    public hk.k B;

    /* renamed from: r, reason: collision with root package name */
    public final js.e f25347r;

    /* renamed from: x, reason: collision with root package name */
    public final m0 f25348x;

    /* renamed from: y, reason: collision with root package name */
    public final List f25349y;

    public l(u uVar, js.e eVar) {
        super(uVar);
        this.f25347r = eVar;
        this.f25348x = m0.LOCATION_HAS_IMPROVED_TRIGGER;
        this.f25349y = e5.H(o0.LOCATION_HAS_IMPROVED);
    }

    @Override // androidx.lifecycle.o
    public final hk.k g1() {
        return this.B;
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        return this.f25348x;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        return this.f25349y;
    }

    @Override // androidx.lifecycle.o
    public final void r1(hk.k kVar) {
        boolean zContains;
        boolean zContains2;
        u uVar = this.f25354g;
        this.B = kVar;
        if (kVar == null) {
            synchronized (uVar.H) {
                zContains2 = uVar.H.contains(this);
            }
            if (zContains2) {
                uVar.d(this);
                return;
            }
            return;
        }
        synchronized (uVar.H) {
            zContains = uVar.H.contains(this);
        }
        if (zContains) {
            return;
        }
        synchronized (uVar.H) {
            uVar.H.add(this);
        }
    }

    @Override // xi.n
    public final boolean t1(hk.h hVar) {
        br.l.e(hVar, "task");
        ak.u uVar = this.f25354g.G;
        ak.u uVar2 = hVar.C;
        js.e eVar = this.f25347r;
        eVar.getClass();
        br.l.e(uVar, "deviceLocation");
        br.l.e(uVar2, "lastLocation");
        float[] fArr = new float[1];
        Location.distanceBetween(uVar2.f721a, uVar2.f722b, uVar.f721a, uVar.f722b, fArr);
        float f10 = fArr[0];
        q3.a aVar = (q3.a) eVar.f13799r;
        long j = ((ak.g) aVar.f20680g).f529f.f450b.f414b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hVar.c());
        sb2.append(" distanceChanged - ");
        sb2.append(f10);
        sb2.append("m, distance required: ");
        ch.n.b("LocationValidator", w.g.h(sb2, j, 'm'));
        return f10 >= ((float) j) && uVar.d((df.c) eVar.f13798g, ((ak.g) aVar.f20680g).f529f.f450b);
    }

    @Override // ek.f
    public final void v0(ak.u uVar) {
        br.l.e(uVar, "deviceLocation");
        ch.n.b("LocationHasImprovedDataSource", "Notify data source updated");
        a1();
    }
}

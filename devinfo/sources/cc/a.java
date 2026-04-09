package cc;

import android.os.Bundle;
import android.os.SystemClock;
import b7.h;
import ec.b3;
import ec.g2;
import ec.i4;
import ec.l1;
import ec.l4;
import ec.o1;
import ec.q2;
import ec.s0;
import ec.w;
import ec.y2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import pb.y;
import x.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f2838a;

    /* renamed from: b, reason: collision with root package name */
    public final q2 f2839b;

    public a(o1 o1Var) {
        y.h(o1Var);
        this.f2838a = o1Var;
        q2 q2Var = o1Var.f22959m;
        o1.l(q2Var);
        this.f2839b = q2Var;
    }

    @Override // ec.r2
    public final String A1() {
        return (String) this.f2839b.f23012h.get();
    }

    @Override // ec.r2
    public final long B1() {
        l4 l4Var = this.f2838a.f22956i;
        o1.k(l4Var);
        return l4Var.y0();
    }

    @Override // ec.r2
    public final String C1() {
        b3 b3Var = ((o1) this.f2839b.f218b).f22958l;
        o1.l(b3Var);
        y2 y2Var = b3Var.f22587d;
        if (y2Var != null) {
            return y2Var.f23205b;
        }
        return null;
    }

    @Override // ec.r2
    public final void D(Bundle bundle) {
        q2 q2Var = this.f2839b;
        ((o1) q2Var.f218b).f22957k.getClass();
        q2Var.O(bundle, System.currentTimeMillis());
    }

    @Override // ec.r2
    public final String D1() {
        return this.f2839b.Q();
    }

    @Override // ec.r2
    public final void L(String str) {
        o1 o1Var = this.f2838a;
        w wVar = o1Var.f22960n;
        o1.j(wVar);
        o1Var.f22957k.getClass();
        wVar.D(SystemClock.elapsedRealtime(), str);
    }

    @Override // ec.r2
    public final void M(String str, String str2, Bundle bundle) {
        q2 q2Var = this.f2839b;
        ((o1) q2Var.f218b).f22957k.getClass();
        q2Var.G(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // ec.r2
    public final void N(String str, String str2, Bundle bundle) {
        q2 q2Var = this.f2838a.f22959m;
        o1.l(q2Var);
        q2Var.P(str, str2, bundle);
    }

    @Override // ec.r2
    public final void O(String str) {
        o1 o1Var = this.f2838a;
        w wVar = o1Var.f22960n;
        o1.j(wVar);
        o1Var.f22957k.getClass();
        wVar.C(SystemClock.elapsedRealtime(), str);
    }

    @Override // ec.r2
    public final int P(String str) {
        q2 q2Var = this.f2839b;
        q2Var.getClass();
        y.e(str);
        ((o1) q2Var.f218b).getClass();
        return 25;
    }

    @Override // ec.r2
    public final List Q(String str, String str2) {
        q2 q2Var = this.f2839b;
        o1 o1Var = (o1) q2Var.f218b;
        l1 l1Var = o1Var.g;
        s0 s0Var = o1Var.f22954f;
        o1.m(l1Var);
        if (l1Var.H()) {
            o1.m(s0Var);
            s0Var.g.d("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (h.e()) {
            o1.m(s0Var);
            s0Var.g.d("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        l1 l1Var2 = o1Var.g;
        o1.m(l1Var2);
        l1Var2.L(atomicReference, 5000L, "get conditional user properties", new ab.c(q2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return l4.r0(list);
        }
        o1.m(s0Var);
        s0Var.g.e(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // ec.r2
    public final Map R(String str, String str2, boolean z3) {
        q2 q2Var = this.f2839b;
        o1 o1Var = (o1) q2Var.f218b;
        l1 l1Var = o1Var.g;
        s0 s0Var = o1Var.f22954f;
        o1.m(l1Var);
        if (l1Var.H()) {
            o1.m(s0Var);
            s0Var.g.d("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (h.e()) {
            o1.m(s0Var);
            s0Var.g.d("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        l1 l1Var2 = o1Var.g;
        o1.m(l1Var2);
        l1Var2.L(atomicReference, 5000L, "get user properties", new g2(q2Var, atomicReference, str, str2, z3));
        List<i4> list = (List) atomicReference.get();
        if (list == null) {
            o1.m(s0Var);
            s0Var.g.e(Boolean.valueOf(z3), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (i4 i4Var : list) {
            Object objA = i4Var.a();
            if (objA != null) {
                eVar.put(i4Var.f22800b, objA);
            }
        }
        return eVar;
    }

    @Override // ec.r2
    public final String z1() {
        b3 b3Var = ((o1) this.f2839b.f218b).f22958l;
        o1.l(b3Var);
        y2 y2Var = b3Var.f22587d;
        if (y2Var != null) {
            return y2Var.f23204a;
        }
        return null;
    }
}

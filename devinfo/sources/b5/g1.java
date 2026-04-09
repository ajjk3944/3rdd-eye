package b5;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1799a;

    /* renamed from: b, reason: collision with root package name */
    public int f1800b;

    /* renamed from: c, reason: collision with root package name */
    public final z f1801c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1802d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1803e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1804f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1805h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1806i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1807k;

    /* renamed from: l, reason: collision with root package name */
    public final b1 f1808l;

    public g1(int i4, int i10, b1 b1Var) {
        je.u.y(i4, "finalState");
        je.u.y(i10, "lifecycleImpact");
        z zVar = b1Var.f1747c;
        nk.k.d(zVar, "fragmentStateManager.fragment");
        je.u.y(i4, "finalState");
        je.u.y(i10, "lifecycleImpact");
        nk.k.e(zVar, "fragment");
        this.f1799a = i4;
        this.f1800b = i10;
        this.f1801c = zVar;
        this.f1802d = new ArrayList();
        this.f1806i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.f1807k = arrayList;
        this.f1808l = b1Var;
    }

    public final void a(ViewGroup viewGroup) {
        nk.k.e(viewGroup, "container");
        this.f1805h = false;
        if (this.f1803e) {
            return;
        }
        this.f1803e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (f1 f1Var : zj.n.r0(this.f1807k)) {
            f1Var.getClass();
            if (!f1Var.f1796b) {
                f1Var.a(viewGroup);
            }
            f1Var.f1796b = true;
        }
    }

    public final void b() {
        this.f1805h = false;
        if (!this.f1804f) {
            if (u0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1804f = true;
            ArrayList arrayList = this.f1802d;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((Runnable) obj).run();
            }
        }
        this.f1801c.f1940n = false;
        this.f1808l.k();
    }

    public final void c(f1 f1Var) {
        nk.k.e(f1Var, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(f1Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i4, int i10) {
        je.u.y(i4, "finalState");
        je.u.y(i10, "lifecycleImpact");
        int iC = i3.e.c(i10);
        z zVar = this.f1801c;
        if (iC == 0) {
            if (this.f1799a != 1) {
                if (u0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + zVar + " mFinalState = " + a0.g.E(this.f1799a) + " -> " + a0.g.E(i4) + '.');
                }
                this.f1799a = i4;
                return;
            }
            return;
        }
        if (iC == 1) {
            if (this.f1799a == 1) {
                if (u0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + zVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + a0.g.D(this.f1800b) + " to ADDING.");
                }
                this.f1799a = 2;
                this.f1800b = 2;
                this.f1806i = true;
                return;
            }
            return;
        }
        if (iC != 2) {
            return;
        }
        if (u0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + zVar + " mFinalState = " + a0.g.E(this.f1799a) + " -> REMOVED. mLifecycleImpact  = " + a0.g.D(this.f1800b) + " to REMOVING.");
        }
        this.f1799a = 1;
        this.f1800b = 3;
        this.f1806i = true;
    }

    public final String toString() {
        StringBuilder sbA = d.h.A("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbA.append(a0.g.E(this.f1799a));
        sbA.append(" lifecycleImpact = ");
        sbA.append(a0.g.D(this.f1800b));
        sbA.append(" fragment = ");
        sbA.append(this.f1801c);
        sbA.append('}');
        return sbA.toString();
    }
}

package o4;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public w0 f18850a;

    /* renamed from: b, reason: collision with root package name */
    public t0 f18851b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.fragment.app.b f18852c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18853d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18854e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18855f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18856g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18857h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18858i;
    public final ArrayList j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.fragment.app.e f18859l;

    public s0(w0 w0Var, t0 t0Var, androidx.fragment.app.e eVar) {
        br.l.e(w0Var, "finalState");
        br.l.e(t0Var, "lifecycleImpact");
        androidx.fragment.app.b bVar = eVar.f1462c;
        br.l.d(bVar, "fragmentStateManager.fragment");
        br.l.e(w0Var, "finalState");
        br.l.e(t0Var, "lifecycleImpact");
        br.l.e(bVar, "fragment");
        this.f18850a = w0Var;
        this.f18851b = t0Var;
        this.f18852c = bVar;
        this.f18853d = new ArrayList();
        this.f18858i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.f18859l = eVar;
    }

    public final void a(ViewGroup viewGroup) {
        br.l.e(viewGroup, "container");
        this.f18857h = false;
        if (this.f18854e) {
            return;
        }
        this.f18854e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (r0 r0Var : mq.o.Q0(this.k)) {
            r0Var.getClass();
            if (!r0Var.f18848b) {
                r0Var.a(viewGroup);
            }
            r0Var.f18848b = true;
        }
    }

    public final void b() {
        this.f18857h = false;
        if (!this.f18855f) {
            if (androidx.fragment.app.d.K(2)) {
                toString();
            }
            this.f18855f = true;
            Iterator it = this.f18853d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f18852c.J = false;
        this.f18859l.k();
    }

    public final void c(r0 r0Var) {
        br.l.e(r0Var, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(r0Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(w0 w0Var, t0 t0Var) {
        br.l.e(w0Var, "finalState");
        br.l.e(t0Var, "lifecycleImpact");
        int i10 = x0.f18881a[t0Var.ordinal()];
        androidx.fragment.app.b bVar = this.f18852c;
        if (i10 == 1) {
            if (this.f18850a == w0.REMOVED) {
                if (androidx.fragment.app.d.K(2)) {
                    Objects.toString(bVar);
                    Objects.toString(this.f18851b);
                }
                this.f18850a = w0.VISIBLE;
                this.f18851b = t0.ADDING;
                this.f18858i = true;
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (androidx.fragment.app.d.K(2)) {
                Objects.toString(bVar);
                Objects.toString(this.f18850a);
                Objects.toString(this.f18851b);
            }
            this.f18850a = w0.REMOVED;
            this.f18851b = t0.REMOVING;
            this.f18858i = true;
            return;
        }
        if (i10 == 3 && this.f18850a != w0.REMOVED) {
            if (androidx.fragment.app.d.K(2)) {
                Objects.toString(bVar);
                Objects.toString(this.f18850a);
                w0Var.toString();
            }
            this.f18850a = w0Var;
        }
    }

    public final String toString() {
        StringBuilder sbU = c7.a.u("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbU.append(this.f18850a);
        sbU.append(" lifecycleImpact = ");
        sbU.append(this.f18851b);
        sbU.append(" fragment = ");
        sbU.append(this.f18852c);
        sbU.append('}');
        return sbU.toString();
    }
}

package v1;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import java.util.WeakHashMap;
import n0.b2;
import n0.x1;
import u3.h1;
import u3.i0;
import u3.t0;
import u3.u0;

/* loaded from: classes.dex */
public final class l extends androidx.datastore.preferences.protobuf.j implements Runnable, u3.n, View.OnAttachStateChangeListener {
    public final x1 B;
    public final u.z D;
    public final SnapshotStateList E;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23798g;

    /* renamed from: r, reason: collision with root package name */
    public int f23799r;

    /* renamed from: x, reason: collision with root package name */
    public h1 f23800x;

    /* renamed from: y, reason: collision with root package name */
    public final u.a0 f23801y;

    public l() {
        super(1);
        u.a0 a0Var = new u.a0(9);
        d0.f23772a.getClass();
        a0Var.l(c0.f23761b, new f0("caption bar"));
        a0Var.l(c0.f23762c, new f0("display cutout"));
        a0Var.l(c0.f23763d, new f0("ime"));
        a0Var.l(c0.f23764e, new f0("mandatory system gestures"));
        a0Var.l(c0.f23765f, new f0("navigation bars"));
        a0Var.l(c0.f23766g, new f0("status bars"));
        a0Var.l(c0.f23767h, new f0("system gestures"));
        a0Var.l(c0.f23768i, new f0("tappable element"));
        a0Var.l(c0.j, new f0("waterfall"));
        this.f23801y = a0Var;
        this.B = androidx.compose.runtime.c.c();
        this.D = new u.z(4);
        this.E = new SnapshotStateList();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(u3.h1 r34) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.l.D(u3.h1):void");
    }

    @Override // u3.n
    public final h1 c0(View view, h1 h1Var) {
        if (this.f23798g) {
            this.f23800x = h1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return h1Var;
            }
        } else if (this.f23799r == 0) {
            D(h1Var);
        }
        return h1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(u0 u0Var) {
        boolean z10 = false;
        this.f23798g = false;
        int iC = u0Var.f23222a.c();
        this.f23799r &= ~iC;
        this.f23800x = null;
        d0 d0Var = (d0) androidx.compose.ui.layout.a.f1150c.b(iC);
        if (d0Var != null) {
            Object objG = this.f23801y.g(d0Var);
            br.l.b(objG);
            f0 f0Var = (f0) objG;
            f0Var.f23779c.m(0.0f);
            f0Var.f23781e.m(1.0f);
            f0Var.f23780d.o(0L);
            f0Var.f23779c.m(0.0f);
            ((b2) f0Var.f23778b).setValue(Boolean.FALSE);
            f0Var.j = -1L;
            f0Var.k = -1L;
            x1 x1Var = this.B;
            x1Var.n(x1Var.l() + 1);
            synchronized (x0.l.f24717c) {
                u.b0 b0Var = x0.l.j.f24687h;
                if (b0Var != null) {
                    if (b0Var.h()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                x0.l.a();
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void e() {
        this.f23798g = true;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final h1 f(h1 h1Var, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            u0 u0Var = (u0) list.get(i10);
            d0 d0Var = (d0) androidx.compose.ui.layout.a.f1150c.b(u0Var.f23222a.c());
            if (d0Var != null) {
                Object objG = this.f23801y.g(d0Var);
                br.l.b(objG);
                f0 f0Var = (f0) objG;
                if (((Boolean) ((b2) f0Var.f23778b).getValue()).booleanValue()) {
                    t0 t0Var = u0Var.f23222a;
                    f0Var.f23779c.m(t0Var.b());
                    f0Var.f23781e.m(0.0f);
                    f0Var.f23780d.o(t0Var.a());
                }
            }
        }
        D(h1Var);
        return h1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final om.f g(u0 u0Var, om.f fVar) {
        h1 h1Var = this.f23800x;
        boolean z10 = false;
        this.f23798g = false;
        this.f23800x = null;
        if (u0Var.f23222a.a() > 0 && h1Var != null) {
            int iC = u0Var.f23222a.c();
            this.f23799r |= iC;
            d0 d0Var = (d0) androidx.compose.ui.layout.a.f1150c.b(iC);
            if (d0Var != null) {
                Object objG = this.f23801y.g(d0Var);
                br.l.b(objG);
                f0 f0Var = (f0) objG;
                k3.d dVarF = h1Var.f23176a.f(iC);
                long j = (dVarF.f14014a << 48) | (dVarF.f14015b << 32) | (dVarF.f14016c << 16) | dVarF.f14017d;
                long j7 = f0Var.f23784h;
                if (!io.sentry.config.a.N(j, j7)) {
                    f0Var.j = j7;
                    f0Var.k = j;
                    ((b2) f0Var.f23778b).setValue(Boolean.TRUE);
                    t0 t0Var = u0Var.f23222a;
                    f0Var.f23779c.m(t0Var.b());
                    f0Var.f23781e.m(0.0f);
                    f0Var.f23780d.o(t0Var.a());
                    x1 x1Var = this.B;
                    x1Var.n(x1Var.l() + 1);
                    synchronized (x0.l.f24717c) {
                        u.b0 b0Var = x0.l.j.f24687h;
                        if (b0Var != null) {
                            if (b0Var.h()) {
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        x0.l.a();
                        return fVar;
                    }
                }
            }
        }
        return fVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = i0.f23177a;
        u3.z.j(view, this);
        i0.p(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = i0.f23177a;
        u3.z.j(view, null);
        i0.p(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23798g) {
            this.f23799r = 0;
            this.f23798g = false;
            h1 h1Var = this.f23800x;
            if (h1Var != null) {
                D(h1Var);
                this.f23800x = null;
            }
        }
    }
}

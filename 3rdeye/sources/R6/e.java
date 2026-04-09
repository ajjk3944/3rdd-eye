package R6;

import N7.H9;
import N7.Z;
import O6.C;
import O6.t;
import O6.v;
import R6.d;
import R6.g;
import android.util.DisplayMetrics;
import android.view.View;
import b9.j;
import j6.y;
import kotlin.jvm.internal.l;

/* compiled from: DivViewWithItemsController.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f11744a;

    /* compiled from: DivViewWithItemsController.kt */
    public static final class a {
        public static e a(String id, y yVar, A7.d dVar, R6.a direction) {
            d bVar;
            l.f(id, "id");
            l.f(direction, "direction");
            View viewFindViewWithTag = yVar.getView().findViewWithTag(id);
            if (viewFindViewWithTag != null) {
                if (viewFindViewWithTag instanceof v) {
                    v vVar = (v) viewFindViewWithTag;
                    Z.c div = vVar.getDiv();
                    l.c(div);
                    int i = c.f11732a[div.f7815c.f8940C.a(dVar).ordinal()];
                    if (i == 1) {
                        bVar = new d.a(vVar, direction);
                    } else {
                        if (i != 2) {
                            throw new j();
                        }
                        bVar = new d.c(vVar, direction);
                    }
                } else {
                    bVar = viewFindViewWithTag instanceof t ? new d.b((t) viewFindViewWithTag) : viewFindViewWithTag instanceof C ? new d.C0159d((C) viewFindViewWithTag) : null;
                }
                if (bVar != null) {
                    return new e(bVar);
                }
            }
            return null;
        }
    }

    public e(d dVar) {
        this.f11744a = dVar;
    }

    public final void a(String str, int i, boolean z10) {
        int iC;
        g gVarB = b(str);
        if (i > 0) {
            iC = gVarB.a(i);
        } else if (i >= 0) {
            return;
        } else {
            iC = gVarB.c(-i);
        }
        d(iC, z10);
    }

    public final g b(String str) {
        d dVar = this.f11744a;
        int iA = dVar.a();
        int iB = dVar.b();
        int iE = dVar.e();
        int iD = dVar.d();
        DisplayMetrics metrics = dVar.c();
        l.f(metrics, "metrics");
        return str == null ? true : str.equals("clamp") ? new g.a(iA, iB, iE, iD, metrics) : l.b(str, "ring") ? new g.b(iA, iB, iE, iD, metrics) : new g.a(iA, iB, iE, iD, metrics);
    }

    public final void c(String str, int i, boolean z10) {
        if (i == 0) {
            return;
        }
        this.f11744a.f(b(str).b(i), H9.PX, z10);
    }

    public final void d(int i, boolean z10) {
        d dVar = this.f11744a;
        if (z10) {
            dVar.h(i);
        } else {
            dVar.i(i);
        }
    }
}

package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lx0 {
    public int a;
    public int b;
    public final iw c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final ex h;

    public lx0(int i, int i2, ex exVar, md mdVar) {
        iw iwVar = exVar.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = i;
        this.b = i2;
        this.c = iwVar;
        mdVar.a(new zs1(6, this));
        this.h = exVar;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.e.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(this.e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            md mdVar = (md) obj;
            synchronized (mdVar) {
                try {
                    if (!mdVar.a) {
                        mdVar.a = true;
                        mdVar.c = true;
                        ld ldVar = mdVar.b;
                        if (ldVar != null) {
                            try {
                                ldVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (mdVar) {
                                    mdVar.c = false;
                                    mdVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (mdVar) {
                            mdVar.c = false;
                            mdVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (xw.F(2)) {
                toString();
            }
            this.g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int iS = ex0.s(i2);
        iw iwVar = this.c;
        if (iS == 0) {
            if (this.a != 1) {
                if (xw.F(2)) {
                    Objects.toString(iwVar);
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iS != 1) {
            if (iS != 2) {
                return;
            }
            if (xw.F(2)) {
                Objects.toString(iwVar);
            }
            this.a = 1;
            this.b = 3;
            return;
        }
        if (this.a == 1) {
            if (xw.F(2)) {
                Objects.toString(iwVar);
            }
            this.a = 2;
            this.b = 2;
        }
    }

    public final void d() {
        int i = this.b;
        ex exVar = this.h;
        if (i != 2) {
            if (i == 3) {
                iw iwVar = exVar.c;
                View viewH = iwVar.H();
                if (xw.F(2)) {
                    Objects.toString(viewH.findFocus());
                    viewH.toString();
                    iwVar.toString();
                }
                viewH.clearFocus();
                return;
            }
            return;
        }
        iw iwVar2 = exVar.c;
        View viewFindFocus = iwVar2.J.findFocus();
        if (viewFindFocus != null) {
            iwVar2.f().k = viewFindFocus;
            if (xw.F(2)) {
                viewFindFocus.toString();
                iwVar2.toString();
            }
        }
        View viewH2 = this.c.H();
        if (viewH2.getParent() == null) {
            exVar.b();
            viewH2.setAlpha(0.0f);
        }
        if (viewH2.getAlpha() == 0.0f && viewH2.getVisibility() == 0) {
            viewH2.setVisibility(4);
        }
        hw hwVar = iwVar2.M;
        viewH2.setAlpha(hwVar == null ? 1.0f : hwVar.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Operation {");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} {mFinalState = ");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        sb.append("} {mLifecycleImpact = ");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE");
        sb.append("} {mFragment = ");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}

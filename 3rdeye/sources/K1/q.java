package K1;

import H6.C0672i;
import N7.X9;
import O6.A;
import android.util.SparseArray;
import androidx.work.impl.WorkDatabase_Impl;
import b2.C1822c;
import b2.C1832m;
import b2.C1838s;
import b2.C1840u;
import b2.InterfaceC1839t;
import m0.C5308a;
import m0.C5313f;
import s6.i;
import z6.C5865d;

/* compiled from: TransitionValuesMaps.java */
/* loaded from: classes.dex */
public final class q implements i.a, InterfaceC1839t {

    /* renamed from: b, reason: collision with root package name */
    public final Object f3034b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3035c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3036d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3037e;

    public q() {
        this.f3034b = new C5308a();
        this.f3036d = new SparseArray();
        this.f3037e = new C5313f();
        this.f3035c = new C5308a();
    }

    @Override // b2.InterfaceC1839t
    public void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3034b;
        workDatabase_Impl.b();
        C1832m c1832m = (C1832m) this.f3036d;
        F1.f fVarC = c1832m.c();
        if (str == null) {
            fVarC.f(1);
        } else {
            fVarC.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarC.G();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
            c1832m.h(fVarC);
        }
    }

    @Override // s6.i.a
    public void b(Object obj) {
        String str = (String) obj;
        if (str != null) {
            A a10 = (A) this.f3034b;
            if (a10.getStateId() == null || str.equals(a10.getStateId())) {
                return;
            }
            X9 x92 = (X9) this.f3036d;
            kotlin.jvm.internal.l.f(x92, "<this>");
            String str2 = x92.f7730l;
            if (str2 == null && (str2 = x92.f7735q) == null) {
                str2 = "";
            }
            ((C0672i) this.f3037e).f2146a.f(((C5865d) this.f3035c).a(str2, str), true);
        }
    }

    @Override // s6.i.a
    public void c(i.b bVar) {
        ((A) this.f3034b).setVariableUpdater(bVar);
    }

    @Override // b2.InterfaceC1839t
    public void d() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3034b;
        workDatabase_Impl.b();
        C1840u c1840u = (C1840u) this.f3037e;
        F1.f fVarC = c1840u.c();
        workDatabase_Impl.c();
        try {
            fVarC.G();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
            c1840u.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1839t
    public void e(C1838s c1838s) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3034b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C1822c) this.f3035c).j(c1838s);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
        }
    }

    public q(WorkDatabase_Impl workDatabase_Impl) {
        this.f3034b = workDatabase_Impl;
        this.f3035c = new C1822c(workDatabase_Impl, 1);
        this.f3036d = new C1832m(workDatabase_Impl, 1);
        this.f3037e = new C1840u(workDatabase_Impl, 0);
    }

    public q(A a10, C5865d c5865d, X9 x92, C0672i c0672i) {
        this.f3034b = a10;
        this.f3035c = c5865d;
        this.f3036d = x92;
        this.f3037e = c0672i;
    }
}

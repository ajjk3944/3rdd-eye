package xc;

import android.os.Bundle;
import android.os.SystemClock;
import cc.s;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o.e;
import zc.a1;
import zc.c1;
import zc.d;
import zc.d2;
import zc.j0;
import zc.l2;
import zc.o2;
import zc.r;
import zc.s3;
import zc.u1;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f25237a;

    /* renamed from: b, reason: collision with root package name */
    public final d2 f25238b;

    public a(c1 c1Var) {
        s.h(c1Var);
        this.f25237a = c1Var;
        d2 d2Var = c1Var.I;
        c1.f(d2Var);
        this.f25238b = d2Var;
    }

    @Override // zc.e2
    public final String a() {
        o2 o2Var = ((c1) this.f25238b.f1504d).H;
        c1.f(o2Var);
        l2 l2Var = o2Var.f27055r;
        if (l2Var != null) {
            return l2Var.f26993a;
        }
        return null;
    }

    @Override // zc.e2
    public final String b() {
        o2 o2Var = ((c1) this.f25238b.f1504d).H;
        c1.f(o2Var);
        l2 l2Var = o2Var.f27055r;
        if (l2Var != null) {
            return l2Var.f26994b;
        }
        return null;
    }

    @Override // zc.e2
    public final void c(Bundle bundle) {
        d2 d2Var = this.f25238b;
        ((c1) d2Var.f1504d).G.getClass();
        d2Var.F1(bundle, System.currentTimeMillis());
    }

    @Override // zc.e2
    public final void d(String str) {
        c1 c1Var = this.f25237a;
        r rVar = c1Var.J;
        c1.d(rVar);
        c1Var.G.getClass();
        rVar.u1(SystemClock.elapsedRealtime(), str);
    }

    @Override // zc.e2
    public final void e(String str, String str2, Bundle bundle) {
        d2 d2Var = this.f25238b;
        ((c1) d2Var.f1504d).G.getClass();
        d2Var.x1(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // zc.e2
    public final void f(String str) {
        c1 c1Var = this.f25237a;
        r rVar = c1Var.J;
        c1.d(rVar);
        c1Var.G.getClass();
        rVar.t1(SystemClock.elapsedRealtime(), str);
    }

    @Override // zc.e2
    public final long g() {
        s3 s3Var = this.f25237a.E;
        c1.e(s3Var);
        return s3Var.o2();
    }

    @Override // zc.e2
    public final void h(String str, String str2, Bundle bundle) {
        d2 d2Var = this.f25237a.I;
        c1.f(d2Var);
        d2Var.G1(str, str2, bundle);
    }

    @Override // zc.e2
    public final List i(String str, String str2) {
        d2 d2Var = this.f25238b;
        c1 c1Var = (c1) d2Var.f1504d;
        a1 a1Var = c1Var.B;
        j0 j0Var = c1Var.f26889y;
        c1.g(a1Var);
        if (a1Var.y1()) {
            c1.g(j0Var);
            j0Var.B.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (d.d()) {
            c1.g(j0Var);
            j0Var.B.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        a1 a1Var2 = c1Var.B;
        c1.g(a1Var2);
        a1Var2.C1(atomicReference, 5000L, "get conditional user properties", new e(d2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return s3.h2(list);
        }
        c1.g(j0Var);
        j0Var.B.c(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // zc.e2
    public final int j(String str) {
        d2 d2Var = this.f25238b;
        d2Var.getClass();
        s.e(str);
        ((c1) d2Var.f1504d).getClass();
        return 25;
    }

    @Override // zc.e2
    public final String k() {
        return (String) this.f25238b.D.get();
    }

    @Override // zc.e2
    public final String l() {
        return this.f25238b.H1();
    }

    @Override // zc.e2
    public final Map m(String str, String str2, boolean z10) {
        d2 d2Var = this.f25238b;
        c1 c1Var = (c1) d2Var.f1504d;
        a1 a1Var = c1Var.B;
        j0 j0Var = c1Var.f26889y;
        c1.g(a1Var);
        if (a1Var.y1()) {
            c1.g(j0Var);
            j0Var.B.b("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (d.d()) {
            c1.g(j0Var);
            j0Var.B.b("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        a1 a1Var2 = c1Var.B;
        c1.g(a1Var2);
        a1Var2.C1(atomicReference, 5000L, "get user properties", new u1(d2Var, atomicReference, str, str2, z10));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            c1.g(j0Var);
            j0Var.B.c(Boolean.valueOf(z10), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        u.e eVar = new u.e(list.size());
        for (zzpl zzplVar : list) {
            Object objD = zzplVar.d();
            if (objD != null) {
                eVar.put(zzplVar.f5421d, objD);
            }
        }
        return eVar;
    }
}

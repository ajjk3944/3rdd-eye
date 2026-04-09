package al;

import ak.e1;
import android.os.Trace;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o;
import br.l;
import c8.x;
import ch.n;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.goldstar.widget.NetworkInfoView;
import h9.p;
import h9.r2;
import hk.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jj.m0;
import n0.p1;
import n0.q1;
import p.l2;
import sm.m;
import u.b0;
import u.h0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Object f845a;

    /* renamed from: b, reason: collision with root package name */
    public Object f846b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f847c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f848d;

    /* renamed from: e, reason: collision with root package name */
    public Object f849e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f850f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f851g;

    /* renamed from: h, reason: collision with root package name */
    public Object f852h;

    /* renamed from: i, reason: collision with root package name */
    public Object f853i;
    public Object j;
    public Object k;

    public g(m mVar, r2 r2Var, om.f fVar, df.c cVar, ek.c cVar2, l2 l2Var, bm.d dVar, l2 l2Var2, b9.c cVar3, bm.d dVar2, a2.g gVar, b bVar) {
        l.e(dVar2, "crossTaskDelayExecutionChecker");
        l.e(gVar, "dataUsageLimitsChecker");
        this.f845a = r2Var;
        this.f846b = fVar;
        this.f847c = cVar2;
        this.f848d = l2Var;
        this.f849e = dVar;
        this.f850f = l2Var2;
        this.f851g = cVar3;
        this.f852h = dVar2;
        this.f853i = gVar;
        this.j = bVar;
        this.k = new Object();
    }

    public static boolean b(h hVar) {
        l.e(hVar, "task");
        gk.c cVar = hVar.f10809f;
        return cVar.f9617c < 30000 && cVar.f9618d < 30000;
    }

    public static hk.e h(h hVar) {
        n.b("ExecutionChecker", hVar.c() + " Execute soon: " + b(hVar));
        if (hVar.f10809f.f9620f > -1 && hVar.f10819r) {
            return hk.e.DO_NOTHING;
        }
        n.b("ExecutionChecker", c7.a.o(hVar, new StringBuilder(), " not scheduled. Schedule for later."));
        return hk.e.SCHEDULE;
    }

    public static boolean m(h hVar, boolean z10, m0 m0Var) {
        l.e(hVar, "task");
        l.e(m0Var, "triggerType");
        if (hVar.f10809f.f9615a == gk.f.EVENT_BASED) {
            return (z10 && m0Var.isDataSourceTrigger()) ? false : true;
        }
        return false;
    }

    public boolean a(h hVar) {
        gk.c cVar = hVar.f10809f;
        return ((cVar.j == 0 ? cVar.f9617c : cVar.f9618d) == 0 || hVar.N == hk.m.WAITING_FOR_TRIGGERS) && m.y(hVar, hVar.f10807d);
    }

    public void c() {
        this.f845a = null;
        this.f846b = null;
        p0.e eVar = (p0.e) this.f847c;
        eVar.g();
        ((b0) this.f848d).b();
        this.f849e = eVar;
        ((p0.e) this.f850f).g();
        ((p0.e) this.f851g).g();
        this.f852h = null;
        this.f853i = null;
        this.j = null;
    }

    public void d() {
        Set set = (Set) this.f845a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                p1 p1Var = (p1) it.next();
                it.remove();
                p1Var.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void e() {
        p0.e eVar = (p0.e) this.f847c;
        p0.e eVar2 = (p0.e) this.f850f;
        Set set = (Set) this.f845a;
        if (set == null) {
            return;
        }
        this.k = null;
        if (eVar2.f20232g != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                b0 b0Var = (b0) this.f852h;
                int i10 = eVar2.f20232g;
                while (true) {
                    i10--;
                    if (-1 >= i10) {
                        break;
                    }
                    Object obj = eVar2.f20230a[i10];
                    try {
                        if (obj instanceof q1) {
                            p1 p1Var = ((q1) obj).f17291a;
                            set.remove(p1Var);
                            p1Var.c();
                        }
                        if (obj instanceof n0.h) {
                            if (b0Var == null || !b0Var.c(obj)) {
                                ((n0.h) obj).b();
                            } else {
                                ((n0.h) obj).a();
                            }
                        }
                    } catch (Throwable th2) {
                        y0.b bVar = (y0.b) this.f846b;
                        if (bVar != null) {
                            e5.T(th2, new x(bVar, 7, obj));
                        }
                        throw th2;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (eVar.f20232g != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.f845a;
                if (set2 != null) {
                    Object[] objArr = eVar.f20230a;
                    int i11 = eVar.f20232g;
                    for (int i12 = 0; i12 < i11; i12++) {
                        q1 q1Var = (q1) objArr[i12];
                        p1 p1Var2 = q1Var.f17291a;
                        set2.remove(p1Var2);
                        try {
                            p1Var2.d();
                        } catch (Throwable th3) {
                            y0.b bVar2 = (y0.b) this.f846b;
                            if (bVar2 != null) {
                                e5.T(th3, new x(bVar2, 7, q1Var));
                            }
                            throw th3;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void f(q1 q1Var) {
        p0.e eVar = (p0.e) this.f847c;
        if (((b0) this.f848d).c(q1Var)) {
            ((b0) this.f848d).k(q1Var);
            if (!((p0.e) this.f849e).j(q1Var) && !eVar.j(q1Var)) {
                Object[] objArr = eVar.f20230a;
                int i10 = eVar.f20232g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((q1) objArr[i11]).f17291a instanceof v0.f) {
                        throw null;
                    }
                }
            }
            Set set = (Set) this.f845a;
            if (set == null) {
                return;
            } else {
                set.add(q1Var.f17291a);
            }
        }
        b0 b0Var = (b0) this.k;
        if (b0Var == null || !b0Var.c(q1Var)) {
            ((p0.e) this.f850f).b(q1Var);
        }
    }

    public hk.e g(h hVar, boolean z10, m0 m0Var) {
        hk.e eVarH;
        hk.e eVarD;
        l.e(hVar, "task");
        l.e(m0Var, "triggerReason");
        synchronized (this.k) {
            try {
                boolean zJ1 = ((bm.d) this.f849e).F(hVar.f10809f).j1(hVar.f10809f);
                if (!((b9.c) this.f851g).j(hVar)) {
                    n.b("ExecutionChecker", hVar.c() + " is missing some dependencies to be executed. Do nothing");
                    eVarH = hk.e.DO_NOTHING;
                } else if (k(hVar)) {
                    n.b("ExecutionChecker", hVar.c() + " Already run and completed. Do nothing.");
                    eVarH = hk.e.DO_NOTHING;
                } else if (n(hVar)) {
                    n.b("ExecutionChecker", hVar.c() + " Already running. Do nothing.");
                    eVarH = hk.e.DO_NOTHING;
                } else {
                    boolean z11 = true;
                    if (!(hVar.f10809f.f9625m ? ((l2) this.f848d).D() : true)) {
                        n.b("ExecutionChecker", hVar.c() + " Does not have consent to run.");
                        eVarH = hk.e.DO_NOT_HAVE_CONSENT;
                    } else if (j(hVar)) {
                        n.b("ExecutionChecker", hVar.c() + " Already run. Do nothing.");
                        eVarH = hk.e.DO_NOTHING;
                    } else {
                        o oVarF = ((bm.d) this.f849e).F(hVar.f10809f);
                        gk.c cVar = hVar.f10809f;
                        oVarF.getClass();
                        l.e(cVar, "schedule");
                        int i10 = cVar.f9619e;
                        if (i10 != -1 && !(i10 == 0 && cVar.f9621g == -1) && cVar.j >= i10) {
                            n.b("ExecutionChecker", hVar.c() + " Run maximum times. Do nothing.");
                            eVarH = hk.e.DO_NOTHING;
                        } else if (i(hVar)) {
                            n.b("ExecutionChecker", hVar.c() + " Reached data limit. Do nothing.");
                            eVarH = hk.e.DO_NOTHING;
                        } else if (l(hVar)) {
                            n.b("ExecutionChecker", hVar.c() + " Intensive task already running. Do nothing.");
                            eVarH = hk.e.DO_NOTHING;
                        } else if (m(hVar, zJ1, m0Var)) {
                            n.b("ExecutionChecker", hVar.c() + " Event based task not due yet. Do nothing.");
                            eVarH = hk.e.DO_NOTHING;
                        } else if (z10) {
                            n.b("ExecutionChecker", hVar.c() + " Re-schedule task. Get state.");
                            eVarH = p(hVar, zJ1, m0Var);
                        } else {
                            if ((zJ1 || b(hVar)) ? false : true) {
                                n.b("ExecutionChecker", hVar.c() + " Past execute time: " + zJ1);
                                eVarH = h(hVar);
                            } else if (m.y(hVar, hVar.f10807d)) {
                                if (!m.y(hVar, hVar.f10807d) || !zJ1) {
                                    z11 = false;
                                }
                                if (z11) {
                                    n.b("ExecutionChecker", hVar.c() + " Execute immediately and ignore delay.");
                                    eVarH = hk.e.EXECUTE_IMMEDIATELY_IGNORE_DELAY;
                                } else if (a(hVar)) {
                                    n.b("ExecutionChecker", hVar.c() + " Execute immediately.");
                                    eVarH = hk.e.EXECUTE_IMMEDIATELY;
                                } else {
                                    n.b("ExecutionChecker", hVar.c() + " Execute later in " + (hVar.f10809f.f9622h - System.currentTimeMillis()) + " milliseconds. Task state is " + hVar.N);
                                    eVarH = hk.e.EXECUTE_LATER;
                                }
                            } else {
                                n.b("ExecutionChecker", hVar.c() + " Not all triggers met. Wait for triggers.");
                                eVarH = hk.e.WAITING_FOR_TRIGGERS;
                            }
                        }
                    }
                }
                eVarD = ((bm.d) this.f852h).D(hVar, eVarH);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVarD;
    }

    public boolean i(h hVar) {
        if (((b) this.j).g(0, 0) == e1.CONNECTED && !hVar.f10809f.f9624l) {
            a2.g gVar = (a2.g) this.f853i;
            gVar.getClass();
            bm.e eVar = (bm.e) gVar.f31a;
            if (!hVar.f10827z) {
                mj.e eVar2 = ((ak.g) ((q3.a) eVar.f2831g).f20680g).f529f.f459m;
                long j = eVar2.f16851a;
                if (j > 0) {
                    long j7 = eVar2.f16852b;
                    if (j7 > 0) {
                        long jK = bm.e.k(eVar, null, j7, eVar2.f16853c, null, 9);
                        a2.g.j(jK, eVar2.f16851a, eVar2.f16852b, null);
                        if (jK >= j) {
                            return true;
                        }
                    }
                }
            }
            hk.b bVar = hVar.T;
            if (bVar.f10798a > 0) {
                long j10 = bVar.f10799b;
                if (j10 > 0) {
                    long jK2 = bm.e.k(eVar, null, j10, bVar.f10800c, hVar, 17);
                    a2.g.j(jK2, bVar.f10798a, bVar.f10799b, hVar);
                    if (jK2 >= bVar.f10798a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean j(h hVar) {
        boolean z10;
        ek.c cVar = (ek.c) this.f847c;
        long j = hVar.f10804a;
        String str = hVar.f10805b;
        l.e(str, "taskName");
        synchronized (cVar.f8192a) {
            z10 = !cVar.f8192a.j(cVar.f8193b, e5.I("task_id", "task_name"), e5.I(String.valueOf(j), str)).isEmpty();
        }
        return z10;
    }

    public boolean k(h hVar) {
        boolean z10;
        l.e(hVar, "task");
        om.f fVar = (om.f) this.f846b;
        long j = hVar.f10804a;
        synchronized (((ArrayList) fVar.f19555g)) {
            try {
                ArrayList arrayList = (ArrayList) fVar.f19555g;
                z10 = false;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (j == ((xi.o) it.next()).f25355a) {
                            z10 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean l(h hVar) {
        boolean z10 = ((AtomicBoolean) ((l2) this.f850f).f20100d).get();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hVar.c());
        sb2.append(" Task isNetworkIntensive: ");
        boolean z11 = hVar.f10820s;
        sb2.append(z11);
        sb2.append(", Repo isNetworkIntensive: ");
        sb2.append(z10);
        n.b("ExecutionChecker", sb2.toString());
        if (z11) {
            return z10;
        }
        return false;
    }

    public boolean n(h hVar) {
        Object next;
        boolean z10;
        l.e(hVar, "task");
        r2 r2Var = (r2) this.f845a;
        r2Var.getClass();
        p pVar = (p) r2Var.f10472g;
        pVar.getClass();
        synchronized (pVar.f10444b) {
            Iterator it = pVar.f10444b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((h) next).f10804a == hVar.f10804a) {
                    break;
                }
            }
            z10 = next != null;
        }
        return z10;
    }

    public void o(Set set, y0.b bVar) {
        c();
        this.f845a = set;
        this.f846b = bVar;
    }

    public hk.e p(h hVar, boolean z10, m0 m0Var) {
        boolean zM = m(hVar, z10, m0Var);
        gk.c cVar = hVar.f10809f;
        List list = hVar.f10807d;
        if (zM) {
            n.b("ExecutionChecker", c7.a.o(hVar, new StringBuilder(), " Event based task not due yet. Do nothing."));
            return hk.e.DO_NOTHING;
        }
        if (!m.y(hVar, list)) {
            n.b("ExecutionChecker", c7.a.o(hVar, new StringBuilder(), " Not all triggers met. Wait for triggers."));
            return hk.e.WAITING_FOR_TRIGGERS;
        }
        if (m.y(hVar, list) && z10) {
            n.b("ExecutionChecker", c7.a.o(hVar, new StringBuilder(), " Re-schedule execute immediately and ignore delay."));
            return hk.e.EXECUTE_IMMEDIATELY_IGNORE_DELAY;
        }
        if (a(hVar)) {
            n.b("ExecutionChecker", c7.a.o(hVar, new StringBuilder(), " Re-schedule execute immediately."));
            n.b("ExecutionChecker", hVar.c() + " Time left to execution: " + (cVar.f9622h - System.currentTimeMillis()));
            return hk.e.EXECUTE_IMMEDIATELY;
        }
        n.b("ExecutionChecker", c7.a.o(hVar, new StringBuilder(), " Re-schedule execute later."));
        n.b("ExecutionChecker", hVar.c() + " Time left to execution is " + (cVar.f9622h - System.currentTimeMillis()));
        n.b("ExecutionChecker", hVar.c() + " Task state is " + hVar.N);
        return hk.e.EXECUTE_LATER;
    }

    public g() {
        p0.e eVar = new p0.e(new q1[16]);
        this.f847c = eVar;
        int i10 = h0.f23073a;
        this.f848d = new b0();
        this.f849e = eVar;
        this.f850f = new p0.e(new Object[16]);
        this.f851g = new p0.e(new ar.a[16]);
    }

    public g(ConstraintLayout constraintLayout, View view, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, TextView textView3, NetworkInfoView networkInfoView, ImageView imageView3, TextView textView4, TextView textView5) {
        this.f845a = constraintLayout;
        this.f846b = view;
        this.f847c = imageView;
        this.f850f = textView;
        this.f851g = textView2;
        this.f848d = imageView2;
        this.f852h = textView3;
        this.k = networkInfoView;
        this.f849e = imageView3;
        this.f853i = textView4;
        this.j = textView5;
    }
}

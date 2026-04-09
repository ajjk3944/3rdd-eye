package c1;

import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import com.google.android.gms.internal.ads.da;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.ha;
import com.google.android.gms.internal.ads.rt;
import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import u0.u1;
import u0.v1;
import x.f0;
import x.m0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public Object f2569a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2570b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2571c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2572d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2573e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2574f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2575h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2576i;
    public Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f2577k;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        this.f2570b = obj;
        this.f2571c = obj2;
        this.f2572d = obj3;
        this.f2573e = obj4;
        this.f2574f = obj5;
        this.g = obj6;
        this.f2575h = obj7;
        this.f2576i = obj8;
        this.j = obj9;
        this.f2577k = obj10;
        this.f2569a = obj11;
    }

    public static final boolean f(v1 v1Var, w0.e eVar) {
        Object[] objArr = eVar.f36397a;
        int i4 = eVar.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            u1 u1Var = ((v1) objArr[i10]).f34990a;
            if (u1Var instanceof j) {
                w0.e eVar2 = ((j) u1Var).f2564b;
                if (eVar2.k(v1Var) || f(v1Var, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a() {
        this.f2570b = null;
        this.f2571c = null;
        w0.e eVar = (w0.e) this.f2572d;
        eVar.h();
        ((f0) this.f2575h).b();
        this.f2573e = eVar;
        ((w0.e) this.f2574f).h();
        ((w0.e) this.g).h();
        this.f2576i = null;
        this.f2577k = null;
        this.f2569a = null;
    }

    public void b() {
        Set set = (Set) this.f2570b;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                u1 u1Var = (u1) it.next();
                it.remove();
                u1Var.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void c() {
        w0.e eVar = (w0.e) this.f2572d;
        w0.e eVar2 = (w0.e) this.f2574f;
        Set set = (Set) this.f2570b;
        if (set == null) {
            return;
        }
        this.j = null;
        if (eVar2.f36399c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                f0 f0Var = (f0) this.f2576i;
                int i4 = eVar2.f36399c;
                while (true) {
                    i4--;
                    if (-1 >= i4) {
                        break;
                    }
                    Object obj = eVar2.f36397a[i4];
                    try {
                        if (obj instanceof v1) {
                            u1 u1Var = ((v1) obj).f34990a;
                            set.remove(u1Var);
                            u1Var.b();
                        }
                        if (obj instanceof u0.h) {
                            if (f0Var == null || !f0Var.c(obj)) {
                                ((u0.h) obj).b();
                            } else {
                                ((u0.h) obj).a();
                            }
                        }
                    } catch (Throwable th2) {
                        h1.d dVar = (h1.d) this.f2571c;
                        if (dVar != null) {
                            z3.x(th2, new c0.p(5, dVar, obj));
                        }
                        throw th2;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (eVar.f36399c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.f2570b;
                if (set2 != null) {
                    Object[] objArr = eVar.f36397a;
                    int i10 = eVar.f36399c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        v1 v1Var = (v1) objArr[i11];
                        u1 u1Var2 = v1Var.f34990a;
                        set2.remove(u1Var2);
                        try {
                            u1Var2.d();
                        } catch (Throwable th3) {
                            h1.d dVar2 = (h1.d) this.f2571c;
                            if (dVar2 != null) {
                                z3.x(th3, new c0.p(5, dVar2, v1Var));
                            }
                            throw th3;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void d() {
        w0.e eVar = (w0.e) this.g;
        if (eVar.f36399c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.f36397a;
                int i4 = eVar.f36399c;
                for (int i10 = 0; i10 < i4; i10++) {
                    ((mk.a) objArr[i10]).invoke();
                }
                eVar.h();
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public void e(v1 v1Var) {
        w0.e eVar = (w0.e) this.f2572d;
        if (!((f0) this.f2575h).c(v1Var)) {
            f0 f0Var = (f0) this.j;
            if (f0Var == null || !f0Var.c(v1Var)) {
                ((w0.e) this.f2574f).b(v1Var);
                return;
            }
            return;
        }
        ((f0) this.f2575h).l(v1Var);
        if (!((w0.e) this.f2573e).k(v1Var) && !eVar.k(v1Var)) {
            f(v1Var, eVar);
        }
        Set set = (Set) this.f2570b;
        if (set == null) {
            return;
        }
        set.add(v1Var.f34990a);
    }

    public void g(Set set, h1.d dVar) {
        a();
        this.f2570b = set;
        this.f2571c = dVar;
    }

    public void h() {
        y9 y9Var = (y9) this.f2576i;
        if (y9Var != null) {
            y9Var.f18680d = true;
            y9Var.interrupt();
        }
        da[] daVarArr = (da[]) this.f2575h;
        for (int i4 = 0; i4 < 4; i4++) {
            da daVar = daVarArr[i4];
            if (daVar != null) {
                daVar.f10387d = true;
                daVar.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) this.f2572d;
        PriorityBlockingQueue priorityBlockingQueue2 = (PriorityBlockingQueue) this.f2573e;
        sa saVar = (sa) this.f2574f;
        fk0 fk0Var = (fk0) this.f2577k;
        y9 y9Var2 = new y9(priorityBlockingQueue, priorityBlockingQueue2, saVar, fk0Var);
        this.f2576i = y9Var2;
        y9Var2.start();
        for (int i10 = 0; i10 < 4; i10++) {
            da daVar2 = new da(priorityBlockingQueue2, (rt) this.g, saVar, fk0Var);
            daVarArr[i10] = daVar2;
            daVar2.start();
        }
    }

    public void i(ha haVar) {
        haVar.f11786h = this;
        HashSet hashSet = (HashSet) this.f2571c;
        synchronized (hashSet) {
            hashSet.add(haVar);
        }
        haVar.g = Integer.valueOf(((AtomicInteger) this.f2570b).incrementAndGet());
        haVar.a("add-to-queue");
        j();
        ((PriorityBlockingQueue) this.f2572d).add(haVar);
    }

    public void j() {
        ArrayList arrayList = (ArrayList) this.j;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public o(sa saVar, rt rtVar) {
        fk0 fk0Var = new fk0(new Handler(Looper.getMainLooper()));
        this.f2570b = new AtomicInteger();
        this.f2571c = new HashSet();
        this.f2572d = new PriorityBlockingQueue();
        this.f2573e = new PriorityBlockingQueue();
        this.f2569a = new ArrayList();
        this.j = new ArrayList();
        this.f2574f = saVar;
        this.g = rtVar;
        this.f2575h = new da[4];
        this.f2577k = fk0Var;
    }

    public o() {
        w0.e eVar = new w0.e(new v1[16]);
        this.f2572d = eVar;
        f0 f0Var = m0.f36916a;
        this.f2575h = new f0();
        this.f2573e = eVar;
        this.f2574f = new w0.e(new Object[16]);
        this.g = new w0.e(new mk.a[16]);
    }
}

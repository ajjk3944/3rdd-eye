package X0;

import A.f;
import A1.d;
import U0.j;
import V0.m;
import V2.e;
import W0.c;
import W0.k;
import a1.C0264c;
import a1.InterfaceC0263b;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import e1.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements c, InterfaceC0263b, W0.a {
    public static final String i = m.h("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4150a;

    /* renamed from: b, reason: collision with root package name */
    public final k f4151b;

    /* renamed from: c, reason: collision with root package name */
    public final C0264c f4152c;

    /* renamed from: e, reason: collision with root package name */
    public final a f4154e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4155f;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f4157h;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f4153d = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final Object f4156g = new Object();

    public b(Context context, V0.b bVar, e eVar, k kVar) {
        this.f4150a = context;
        this.f4151b = kVar;
        this.f4152c = new C0264c(context, eVar, this);
        this.f4154e = new a(this, (j) bVar.f3807h);
    }

    @Override // a1.InterfaceC0263b
    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m.f().a(i, f.l("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f4151b.L(str);
        }
    }

    @Override // W0.c
    public final boolean b() {
        return false;
    }

    @Override // W0.a
    public final void c(String str, boolean z6) {
        synchronized (this.f4156g) {
            try {
                Iterator it = this.f4153d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    h hVar = (h) it.next();
                    if (hVar.f19908a.equals(str)) {
                        m.f().a(i, "Stopping tracking for " + str, new Throwable[0]);
                        this.f4153d.remove(hVar);
                        this.f4152c.c(this.f4153d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W0.c
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.f4157h;
        k kVar = this.f4151b;
        if (bool == null) {
            this.f4157h = Boolean.valueOf(f1.h.a(this.f4150a, kVar.f3991j));
        }
        boolean zBooleanValue = this.f4157h.booleanValue();
        String str2 = i;
        if (!zBooleanValue) {
            m.f().g(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f4155f) {
            kVar.f3995n.a(this);
            this.f4155f = true;
        }
        m.f().a(str2, f.l("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.f4154e;
        if (aVar != null && (runnable = (Runnable) aVar.f4149c.remove(str)) != null) {
            ((Handler) aVar.f4148b.f3677b).removeCallbacks(runnable);
        }
        kVar.L(str);
    }

    @Override // W0.c
    public final void e(h... hVarArr) {
        if (this.f4157h == null) {
            this.f4157h = Boolean.valueOf(f1.h.a(this.f4150a, this.f4151b.f3991j));
        }
        if (!this.f4157h.booleanValue()) {
            m.f().g(i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f4155f) {
            this.f4151b.f3995n.a(this);
            this.f4155f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (h hVar : hVarArr) {
            long jA = hVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (hVar.f19909b == 1) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f4154e;
                    if (aVar != null) {
                        j jVar = aVar.f4148b;
                        HashMap map = aVar.f4149c;
                        Runnable runnable = (Runnable) map.remove(hVar.f19908a);
                        if (runnable != null) {
                            ((Handler) jVar.f3677b).removeCallbacks(runnable);
                        }
                        d dVar = new d(aVar, 17, hVar);
                        map.put(hVar.f19908a, dVar);
                        ((Handler) jVar.f3677b).postDelayed(dVar, hVar.a() - System.currentTimeMillis());
                    }
                } else if (hVar.b()) {
                    int i3 = Build.VERSION.SDK_INT;
                    V0.c cVar = hVar.f19916j;
                    if (cVar.f3810c) {
                        m.f().a(i, "Ignoring WorkSpec " + hVar + ", Requires device idle.", new Throwable[0]);
                    } else if (i3 < 24 || cVar.f3815h.f3818a.size() <= 0) {
                        hashSet.add(hVar);
                        hashSet2.add(hVar.f19908a);
                    } else {
                        m.f().a(i, "Ignoring WorkSpec " + hVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    }
                } else {
                    m.f().a(i, f.l("Starting work for ", hVar.f19908a), new Throwable[0]);
                    this.f4151b.K(hVar.f19908a, null);
                }
            }
        }
        synchronized (this.f4156g) {
            try {
                if (!hashSet.isEmpty()) {
                    m.f().a(i, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f4153d.addAll(hashSet);
                    this.f4152c.c(this.f4153d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a1.InterfaceC0263b
    public final void f(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str = (String) obj;
            m.f().a(i, f.l("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f4151b.K(str, null);
        }
    }
}

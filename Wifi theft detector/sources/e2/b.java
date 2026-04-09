package e2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkInfo$State;
import androidx.work.k;
import d2.e;
import d2.j;
import h2.c;
import h2.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l2.p;

/* loaded from: classes.dex */
public class b implements e, c, d2.b {

    /* renamed from: i, reason: collision with root package name */
    public static final String f20884i = k.f("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f20885a;

    /* renamed from: b, reason: collision with root package name */
    public final j f20886b;

    /* renamed from: c, reason: collision with root package name */
    public final d f20887c;

    /* renamed from: e, reason: collision with root package name */
    public a f20889e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20890f;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f20892h;

    /* renamed from: d, reason: collision with root package name */
    public final Set f20888d = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final Object f20891g = new Object();

    public b(Context context, androidx.work.a aVar, o2.a aVar2, j jVar) {
        this.f20885a = context;
        this.f20886b = jVar;
        this.f20887c = new d(context, aVar2, this);
        this.f20889e = new a(this, aVar.k());
    }

    @Override // d2.e
    public void a(String str) {
        if (this.f20892h == null) {
            g();
        }
        if (!this.f20892h.booleanValue()) {
            k.c().d(f20884i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        k.c().a(f20884i, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f20889e;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f20886b.x(str);
    }

    @Override // h2.c
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            k.c().a(f20884i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f20886b.x(str);
        }
    }

    @Override // d2.e
    public void c(p... pVarArr) {
        if (this.f20892h == null) {
            g();
        }
        if (!this.f20892h.booleanValue()) {
            k.c().d(f20884i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long jA = pVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (pVar.f23093b == WorkInfo$State.ENQUEUED) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f20889e;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (pVar.f23101j.h()) {
                        k.c().a(f20884i, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i10 < 24 || !pVar.f23101j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f23092a);
                    } else {
                        k.c().a(f20884i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    k.c().a(f20884i, String.format("Starting work for %s", pVar.f23092a), new Throwable[0]);
                    this.f20886b.u(pVar.f23092a);
                }
            }
        }
        synchronized (this.f20891g) {
            try {
                if (!hashSet.isEmpty()) {
                    k.c().a(f20884i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f20888d.addAll(hashSet);
                    this.f20887c.d(this.f20888d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d2.e
    public boolean d() {
        return false;
    }

    @Override // d2.b
    public void e(String str, boolean z10) {
        i(str);
    }

    @Override // h2.c
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            k.c().a(f20884i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f20886b.u(str);
        }
    }

    public final void g() {
        this.f20892h = Boolean.valueOf(m2.j.b(this.f20885a, this.f20886b.i()));
    }

    public final void h() {
        if (this.f20890f) {
            return;
        }
        this.f20886b.m().c(this);
        this.f20890f = true;
    }

    public final void i(String str) {
        synchronized (this.f20891g) {
            try {
                Iterator it = this.f20888d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p pVar = (p) it.next();
                    if (pVar.f23092a.equals(str)) {
                        k.c().a(f20884i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f20888d.remove(pVar);
                        this.f20887c.d(this.f20888d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

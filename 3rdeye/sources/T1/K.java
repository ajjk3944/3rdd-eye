package T1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.l;
import androidx.work.t;
import b2.C1842w;
import b2.InterfaceC1821b;
import b2.InterfaceC1843x;
import d2.C4268c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class K implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final String f12139t = androidx.work.m.g("WorkerWrapper");

    /* renamed from: b, reason: collision with root package name */
    public final Context f12140b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12141c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkerParameters.a f12142d;

    /* renamed from: e, reason: collision with root package name */
    public final C1842w f12143e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.l f12144f;

    /* renamed from: g, reason: collision with root package name */
    public final e2.c f12145g;
    public final androidx.work.b i;

    /* renamed from: j, reason: collision with root package name */
    public final B7.d f12147j;

    /* renamed from: k, reason: collision with root package name */
    public final l f12148k;

    /* renamed from: l, reason: collision with root package name */
    public final WorkDatabase f12149l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC1843x f12150m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC1821b f12151n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f12152o;

    /* renamed from: p, reason: collision with root package name */
    public String f12153p;

    /* renamed from: h, reason: collision with root package name */
    public l.a f12146h = new l.a.C0267a();

    /* renamed from: q, reason: collision with root package name */
    public final C4268c<Boolean> f12154q = new C4268c<>();

    /* renamed from: r, reason: collision with root package name */
    public final C4268c<l.a> f12155r = new C4268c<>();

    /* renamed from: s, reason: collision with root package name */
    public volatile int f12156s = -256;

    /* compiled from: WorkerWrapper.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f12157a;

        /* renamed from: b, reason: collision with root package name */
        public final l f12158b;

        /* renamed from: c, reason: collision with root package name */
        public final e2.c f12159c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.work.b f12160d;

        /* renamed from: e, reason: collision with root package name */
        public final WorkDatabase f12161e;

        /* renamed from: f, reason: collision with root package name */
        public final C1842w f12162f;

        /* renamed from: g, reason: collision with root package name */
        public final ArrayList f12163g;

        /* renamed from: h, reason: collision with root package name */
        public WorkerParameters.a f12164h = new WorkerParameters.a();

        @SuppressLint({"LambdaLast"})
        public a(Context context, androidx.work.b bVar, e2.c cVar, l lVar, WorkDatabase workDatabase, C1842w c1842w, ArrayList arrayList) {
            this.f12157a = context.getApplicationContext();
            this.f12159c = cVar;
            this.f12158b = lVar;
            this.f12160d = bVar;
            this.f12161e = workDatabase;
            this.f12162f = c1842w;
            this.f12163g = arrayList;
        }
    }

    public K(a aVar) {
        this.f12140b = aVar.f12157a;
        this.f12145g = aVar.f12159c;
        this.f12148k = aVar.f12158b;
        C1842w c1842w = aVar.f12162f;
        this.f12143e = c1842w;
        this.f12141c = c1842w.f17138a;
        this.f12142d = aVar.f12164h;
        this.f12144f = null;
        androidx.work.b bVar = aVar.f12160d;
        this.i = bVar;
        this.f12147j = bVar.f16867c;
        WorkDatabase workDatabase = aVar.f12161e;
        this.f12149l = workDatabase;
        this.f12150m = workDatabase.y();
        this.f12151n = workDatabase.s();
        this.f12152o = aVar.f12163g;
    }

    public final void a(l.a aVar) {
        boolean z10 = aVar instanceof l.a.c;
        C1842w c1842w = this.f12143e;
        String str = f12139t;
        if (!z10) {
            if (aVar instanceof l.a.b) {
                androidx.work.m.e().f(str, "Worker result RETRY for " + this.f12153p);
                c();
                return;
            }
            androidx.work.m.e().f(str, "Worker result FAILURE for " + this.f12153p);
            if (c1842w.d()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        androidx.work.m.e().f(str, "Worker result SUCCESS for " + this.f12153p);
        if (c1842w.d()) {
            d();
            return;
        }
        InterfaceC1821b interfaceC1821b = this.f12151n;
        String str2 = this.f12141c;
        InterfaceC1843x interfaceC1843x = this.f12150m;
        WorkDatabase workDatabase = this.f12149l;
        workDatabase.c();
        try {
            interfaceC1843x.h(t.b.SUCCEEDED, str2);
            interfaceC1843x.l(str2, ((l.a.c) this.f12146h).f16947a);
            this.f12147j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = interfaceC1821b.b(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (interfaceC1843x.t(str3) == t.b.BLOCKED && interfaceC1821b.c(str3)) {
                    androidx.work.m.e().f(str, "Setting status to enqueued for " + str3);
                    interfaceC1843x.h(t.b.ENQUEUED, str3);
                    interfaceC1843x.i(jCurrentTimeMillis, str3);
                }
            }
            workDatabase.r();
            workDatabase.n();
            e(false);
        } catch (Throwable th) {
            workDatabase.n();
            e(false);
            throw th;
        }
    }

    public final void b() {
        if (h()) {
            return;
        }
        this.f12149l.c();
        try {
            t.b bVarT = this.f12150m.t(this.f12141c);
            this.f12149l.x().a(this.f12141c);
            if (bVarT == null) {
                e(false);
            } else if (bVarT == t.b.RUNNING) {
                a(this.f12146h);
            } else if (!bVarT.isFinished()) {
                this.f12156s = -512;
                c();
            }
            this.f12149l.r();
            this.f12149l.n();
        } catch (Throwable th) {
            this.f12149l.n();
            throw th;
        }
    }

    public final void c() {
        String str = this.f12141c;
        InterfaceC1843x interfaceC1843x = this.f12150m;
        WorkDatabase workDatabase = this.f12149l;
        workDatabase.c();
        try {
            interfaceC1843x.h(t.b.ENQUEUED, str);
            this.f12147j.getClass();
            interfaceC1843x.i(System.currentTimeMillis(), str);
            interfaceC1843x.j(this.f12143e.f17158v, str);
            interfaceC1843x.d(-1L, str);
            workDatabase.r();
        } finally {
            workDatabase.n();
            e(true);
        }
    }

    public final void d() {
        String str = this.f12141c;
        InterfaceC1843x interfaceC1843x = this.f12150m;
        WorkDatabase workDatabase = this.f12149l;
        workDatabase.c();
        try {
            this.f12147j.getClass();
            interfaceC1843x.i(System.currentTimeMillis(), str);
            interfaceC1843x.h(t.b.ENQUEUED, str);
            interfaceC1843x.v(str);
            interfaceC1843x.j(this.f12143e.f17158v, str);
            interfaceC1843x.c(str);
            interfaceC1843x.d(-1L, str);
            workDatabase.r();
        } finally {
            workDatabase.n();
            e(false);
        }
    }

    public final void e(boolean z10) {
        this.f12149l.c();
        try {
            if (!this.f12149l.y().p()) {
                c2.o.a(this.f12140b, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f12150m.h(t.b.ENQUEUED, this.f12141c);
                this.f12150m.n(this.f12156s, this.f12141c);
                this.f12150m.d(-1L, this.f12141c);
            }
            this.f12149l.r();
            this.f12149l.n();
            this.f12154q.i(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f12149l.n();
            throw th;
        }
    }

    public final void f() {
        InterfaceC1843x interfaceC1843x = this.f12150m;
        String str = this.f12141c;
        t.b bVarT = interfaceC1843x.t(str);
        t.b bVar = t.b.RUNNING;
        String str2 = f12139t;
        if (bVarT == bVar) {
            androidx.work.m.e().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        androidx.work.m.e().a(str2, "Status for " + str + " is " + bVarT + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.f12141c;
        WorkDatabase workDatabase = this.f12149l;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                InterfaceC1843x interfaceC1843x = this.f12150m;
                if (zIsEmpty) {
                    androidx.work.e eVar = ((l.a.C0267a) this.f12146h).f16946a;
                    interfaceC1843x.j(this.f12143e.f17158v, str);
                    interfaceC1843x.l(str, eVar);
                    workDatabase.r();
                    return;
                }
                String str2 = (String) linkedList.remove();
                if (interfaceC1843x.t(str2) != t.b.CANCELLED) {
                    interfaceC1843x.h(t.b.FAILED, str2);
                }
                linkedList.addAll(this.f12151n.b(str2));
            }
        } finally {
            workDatabase.n();
            e(false);
        }
    }

    public final boolean h() {
        if (this.f12156s == -256) {
            return false;
        }
        androidx.work.m.e().a(f12139t, "Work interrupted for " + this.f12153p);
        if (this.f12150m.t(this.f12141c) == null) {
            e(false);
            return true;
        }
        e(!r0.isFinished());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: all -> 0x007d, TryCatch #2 {all -> 0x007d, blocks: (B:14:0x0051, B:17:0x005b, B:22:0x0080, B:24:0x0086, B:26:0x008a, B:36:0x00c6, B:31:0x0093, B:33:0x00a4), top: B:81:0x0051 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.K.run():void");
    }
}

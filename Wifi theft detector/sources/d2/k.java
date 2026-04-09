package d2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import l2.p;
import l2.q;
import l2.t;
import m2.o;

/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final String f20703t = androidx.work.k.f("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public Context f20704a;

    /* renamed from: b, reason: collision with root package name */
    public String f20705b;

    /* renamed from: c, reason: collision with root package name */
    public List f20706c;

    /* renamed from: d, reason: collision with root package name */
    public WorkerParameters.a f20707d;

    /* renamed from: e, reason: collision with root package name */
    public p f20708e;

    /* renamed from: f, reason: collision with root package name */
    public ListenableWorker f20709f;

    /* renamed from: g, reason: collision with root package name */
    public o2.a f20710g;

    /* renamed from: i, reason: collision with root package name */
    public androidx.work.a f20712i;

    /* renamed from: j, reason: collision with root package name */
    public k2.a f20713j;

    /* renamed from: k, reason: collision with root package name */
    public WorkDatabase f20714k;

    /* renamed from: l, reason: collision with root package name */
    public q f20715l;

    /* renamed from: m, reason: collision with root package name */
    public l2.b f20716m;

    /* renamed from: n, reason: collision with root package name */
    public t f20717n;

    /* renamed from: o, reason: collision with root package name */
    public List f20718o;

    /* renamed from: p, reason: collision with root package name */
    public String f20719p;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f20722s;

    /* renamed from: h, reason: collision with root package name */
    public ListenableWorker.a f20711h = ListenableWorker.a.a();

    /* renamed from: q, reason: collision with root package name */
    public n2.a f20720q = n2.a.s();

    /* renamed from: r, reason: collision with root package name */
    public com.google.common.util.concurrent.a f20721r = null;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.common.util.concurrent.a f20723a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n2.a f20724b;

        public a(com.google.common.util.concurrent.a aVar, n2.a aVar2) {
            this.f20723a = aVar;
            this.f20724b = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f20723a.get();
                androidx.work.k.c().a(k.f20703t, String.format("Starting work for %s", k.this.f20708e.f23094c), new Throwable[0]);
                k kVar = k.this;
                kVar.f20721r = kVar.f20709f.startWork();
                this.f20724b.q(k.this.f20721r);
            } catch (Throwable th) {
                this.f20724b.p(th);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n2.a f20726a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f20727b;

        public b(n2.a aVar, String str) {
            this.f20726a = aVar;
            this.f20727b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f20726a.get();
                    if (aVar == null) {
                        androidx.work.k.c().b(k.f20703t, String.format("%s returned a null result. Treating it as a failure.", k.this.f20708e.f23094c), new Throwable[0]);
                    } else {
                        androidx.work.k.c().a(k.f20703t, String.format("%s returned a %s result.", k.this.f20708e.f23094c, aVar), new Throwable[0]);
                        k.this.f20711h = aVar;
                    }
                    k.this.f();
                } catch (InterruptedException e10) {
                    e = e10;
                    androidx.work.k.c().b(k.f20703t, String.format("%s failed because it threw an exception/error", this.f20727b), e);
                    k.this.f();
                } catch (CancellationException e11) {
                    androidx.work.k.c().d(k.f20703t, String.format("%s was cancelled", this.f20727b), e11);
                    k.this.f();
                } catch (ExecutionException e12) {
                    e = e12;
                    androidx.work.k.c().b(k.f20703t, String.format("%s failed because it threw an exception/error", this.f20727b), e);
                    k.this.f();
                }
            } catch (Throwable th) {
                k.this.f();
                throw th;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public Context f20729a;

        /* renamed from: b, reason: collision with root package name */
        public ListenableWorker f20730b;

        /* renamed from: c, reason: collision with root package name */
        public k2.a f20731c;

        /* renamed from: d, reason: collision with root package name */
        public o2.a f20732d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.work.a f20733e;

        /* renamed from: f, reason: collision with root package name */
        public WorkDatabase f20734f;

        /* renamed from: g, reason: collision with root package name */
        public String f20735g;

        /* renamed from: h, reason: collision with root package name */
        public List f20736h;

        /* renamed from: i, reason: collision with root package name */
        public WorkerParameters.a f20737i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, o2.a aVar2, k2.a aVar3, WorkDatabase workDatabase, String str) {
            this.f20729a = context.getApplicationContext();
            this.f20732d = aVar2;
            this.f20731c = aVar3;
            this.f20733e = aVar;
            this.f20734f = workDatabase;
            this.f20735g = str;
        }

        public k a() {
            return new k(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f20737i = aVar;
            }
            return this;
        }

        public c c(List list) {
            this.f20736h = list;
            return this;
        }
    }

    public k(c cVar) {
        this.f20704a = cVar.f20729a;
        this.f20710g = cVar.f20732d;
        this.f20713j = cVar.f20731c;
        this.f20705b = cVar.f20735g;
        this.f20706c = cVar.f20736h;
        this.f20707d = cVar.f20737i;
        this.f20709f = cVar.f20730b;
        this.f20712i = cVar.f20733e;
        WorkDatabase workDatabase = cVar.f20734f;
        this.f20714k = workDatabase;
        this.f20715l = workDatabase.B();
        this.f20716m = this.f20714k.t();
        this.f20717n = this.f20714k.C();
    }

    public final String a(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f20705b);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public com.google.common.util.concurrent.a b() {
        return this.f20720q;
    }

    public final void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            androidx.work.k.c().d(f20703t, String.format("Worker result SUCCESS for %s", this.f20719p), new Throwable[0]);
            if (this.f20708e.d()) {
                h();
                return;
            } else {
                m();
                return;
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            androidx.work.k.c().d(f20703t, String.format("Worker result RETRY for %s", this.f20719p), new Throwable[0]);
            g();
            return;
        }
        androidx.work.k.c().d(f20703t, String.format("Worker result FAILURE for %s", this.f20719p), new Throwable[0]);
        if (this.f20708e.d()) {
            h();
        } else {
            l();
        }
    }

    public void d() {
        boolean zIsDone;
        this.f20722s = true;
        n();
        com.google.common.util.concurrent.a aVar = this.f20721r;
        if (aVar != null) {
            zIsDone = aVar.isDone();
            this.f20721r.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f20709f;
        if (listenableWorker == null || zIsDone) {
            androidx.work.k.c().a(f20703t, String.format("WorkSpec %s is already done. Not interrupting.", this.f20708e), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    public final void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f20715l.f(str2) != WorkInfo$State.CANCELLED) {
                this.f20715l.b(WorkInfo$State.FAILED, str2);
            }
            linkedList.addAll(this.f20716m.a(str2));
        }
    }

    public void f() {
        if (!n()) {
            this.f20714k.c();
            try {
                WorkInfo$State workInfo$StateF = this.f20715l.f(this.f20705b);
                this.f20714k.A().a(this.f20705b);
                if (workInfo$StateF == null) {
                    i(false);
                } else if (workInfo$StateF == WorkInfo$State.RUNNING) {
                    c(this.f20711h);
                } else if (!workInfo$StateF.d()) {
                    g();
                }
                this.f20714k.r();
                this.f20714k.g();
            } catch (Throwable th) {
                this.f20714k.g();
                throw th;
            }
        }
        List list = this.f20706c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(this.f20705b);
            }
            f.b(this.f20712i, this.f20714k, this.f20706c);
        }
    }

    public final void g() {
        this.f20714k.c();
        try {
            this.f20715l.b(WorkInfo$State.ENQUEUED, this.f20705b);
            this.f20715l.u(this.f20705b, System.currentTimeMillis());
            this.f20715l.l(this.f20705b, -1L);
            this.f20714k.r();
        } finally {
            this.f20714k.g();
            i(true);
        }
    }

    public final void h() {
        this.f20714k.c();
        try {
            this.f20715l.u(this.f20705b, System.currentTimeMillis());
            this.f20715l.b(WorkInfo$State.ENQUEUED, this.f20705b);
            this.f20715l.s(this.f20705b);
            this.f20715l.l(this.f20705b, -1L);
            this.f20714k.r();
        } finally {
            this.f20714k.g();
            i(false);
        }
    }

    public final void i(boolean z10) {
        ListenableWorker listenableWorker;
        this.f20714k.c();
        try {
            if (!this.f20714k.B().r()) {
                m2.g.a(this.f20704a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f20715l.b(WorkInfo$State.ENQUEUED, this.f20705b);
                this.f20715l.l(this.f20705b, -1L);
            }
            if (this.f20708e != null && (listenableWorker = this.f20709f) != null && listenableWorker.isRunInForeground()) {
                this.f20713j.a(this.f20705b);
            }
            this.f20714k.r();
            this.f20714k.g();
            this.f20720q.o(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f20714k.g();
            throw th;
        }
    }

    public final void j() {
        WorkInfo$State workInfo$StateF = this.f20715l.f(this.f20705b);
        if (workInfo$StateF == WorkInfo$State.RUNNING) {
            androidx.work.k.c().a(f20703t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f20705b), new Throwable[0]);
            i(true);
        } else {
            androidx.work.k.c().a(f20703t, String.format("Status for %s is %s; not doing any work", this.f20705b, workInfo$StateF), new Throwable[0]);
            i(false);
        }
    }

    public final void k() {
        androidx.work.d dVarB;
        if (n()) {
            return;
        }
        this.f20714k.c();
        try {
            p pVarG = this.f20715l.g(this.f20705b);
            this.f20708e = pVarG;
            if (pVarG == null) {
                androidx.work.k.c().b(f20703t, String.format("Didn't find WorkSpec for id %s", this.f20705b), new Throwable[0]);
                i(false);
                this.f20714k.r();
                return;
            }
            if (pVarG.f23093b != WorkInfo$State.ENQUEUED) {
                j();
                this.f20714k.r();
                androidx.work.k.c().a(f20703t, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f20708e.f23094c), new Throwable[0]);
                return;
            }
            if (pVarG.d() || this.f20708e.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                p pVar = this.f20708e;
                if (pVar.f23105n != 0 && jCurrentTimeMillis < pVar.a()) {
                    androidx.work.k.c().a(f20703t, String.format("Delaying execution for %s because it is being executed before schedule.", this.f20708e.f23094c), new Throwable[0]);
                    i(true);
                    this.f20714k.r();
                    return;
                }
            }
            this.f20714k.r();
            this.f20714k.g();
            if (this.f20708e.d()) {
                dVarB = this.f20708e.f23096e;
            } else {
                androidx.work.h hVarB = this.f20712i.f().b(this.f20708e.f23095d);
                if (hVarB == null) {
                    androidx.work.k.c().b(f20703t, String.format("Could not create Input Merger %s", this.f20708e.f23095d), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f20708e.f23096e);
                    arrayList.addAll(this.f20715l.i(this.f20705b));
                    dVarB = hVarB.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f20705b), dVarB, this.f20718o, this.f20707d, this.f20708e.f23102k, this.f20712i.e(), this.f20710g, this.f20712i.m(), new m2.q(this.f20714k, this.f20710g), new m2.p(this.f20714k, this.f20713j, this.f20710g));
            if (this.f20709f == null) {
                this.f20709f = this.f20712i.m().b(this.f20704a, this.f20708e.f23094c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f20709f;
            if (listenableWorker == null) {
                androidx.work.k.c().b(f20703t, String.format("Could not create Worker %s", this.f20708e.f23094c), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                androidx.work.k.c().b(f20703t, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f20708e.f23094c), new Throwable[0]);
                l();
                return;
            }
            this.f20709f.setUsed();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            n2.a aVarS = n2.a.s();
            o oVar = new o(this.f20704a, this.f20708e, this.f20709f, workerParameters.b(), this.f20710g);
            this.f20710g.a().execute(oVar);
            com.google.common.util.concurrent.a aVarA = oVar.a();
            aVarA.addListener(new a(aVarA, aVarS), this.f20710g.a());
            aVarS.addListener(new b(aVarS, this.f20719p), this.f20710g.getBackgroundExecutor());
        } finally {
            this.f20714k.g();
        }
    }

    public void l() {
        this.f20714k.c();
        try {
            e(this.f20705b);
            this.f20715l.o(this.f20705b, ((ListenableWorker.a.C0050a) this.f20711h).e());
            this.f20714k.r();
        } finally {
            this.f20714k.g();
            i(false);
        }
    }

    public final void m() {
        this.f20714k.c();
        try {
            this.f20715l.b(WorkInfo$State.SUCCEEDED, this.f20705b);
            this.f20715l.o(this.f20705b, ((ListenableWorker.a.c) this.f20711h).e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f20716m.a(this.f20705b)) {
                if (this.f20715l.f(str) == WorkInfo$State.BLOCKED && this.f20716m.b(str)) {
                    androidx.work.k.c().d(f20703t, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f20715l.b(WorkInfo$State.ENQUEUED, str);
                    this.f20715l.u(str, jCurrentTimeMillis);
                }
            }
            this.f20714k.r();
            this.f20714k.g();
            i(false);
        } catch (Throwable th) {
            this.f20714k.g();
            i(false);
            throw th;
        }
    }

    public final boolean n() {
        if (!this.f20722s) {
            return false;
        }
        androidx.work.k.c().a(f20703t, String.format("Work interrupted for %s", this.f20719p), new Throwable[0]);
        if (this.f20715l.f(this.f20705b) == null) {
            i(false);
        } else {
            i(!r0.d());
        }
        return true;
    }

    public final boolean o() {
        boolean z10;
        this.f20714k.c();
        try {
            if (this.f20715l.f(this.f20705b) == WorkInfo$State.ENQUEUED) {
                this.f20715l.b(WorkInfo$State.RUNNING, this.f20705b);
                this.f20715l.t(this.f20705b);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f20714k.r();
            this.f20714k.g();
            return z10;
        } catch (Throwable th) {
            this.f20714k.g();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List listB = this.f20717n.b(this.f20705b);
        this.f20718o = listB;
        this.f20719p = a(listB);
        k();
    }
}

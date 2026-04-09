package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o.C7011b;
import r3.C7564b;
import r3.C7567e;
import s3.AbstractC7893h;
import s3.AbstractC7905u;
import s3.C7899n;
import s3.C7902q;
import s3.C7904t;
import s3.InterfaceC7906v;

/* renamed from: com.google.android.gms.common.api.internal.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4276e implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f34819p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q, reason: collision with root package name */
    private static final Status f34820q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r, reason: collision with root package name */
    private static final Object f34821r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static C4276e f34822s;

    /* renamed from: c, reason: collision with root package name */
    private C7904t f34825c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC7906v f34826d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f34827e;

    /* renamed from: f, reason: collision with root package name */
    private final C7567e f34828f;

    /* renamed from: g, reason: collision with root package name */
    private final s3.G f34829g;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f34836n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f34837o;

    /* renamed from: a, reason: collision with root package name */
    private long f34823a = 10000;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34824b = false;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f34830h = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f34831i = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    private final Map f34832j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k, reason: collision with root package name */
    private r f34833k = null;

    /* renamed from: l, reason: collision with root package name */
    private final Set f34834l = new C7011b();

    /* renamed from: m, reason: collision with root package name */
    private final Set f34835m = new C7011b();

    private C4276e(Context context, Looper looper, C7567e c7567e) {
        this.f34837o = true;
        this.f34827e = context;
        A3.h hVar = new A3.h(looper, this);
        this.f34836n = hVar;
        this.f34828f = c7567e;
        this.f34829g = new s3.G(c7567e);
        if (com.google.android.gms.common.util.h.a(context)) {
            this.f34837o = false;
        }
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status f(C4273b c4273b, C7564b c7564b) {
        return new Status(c7564b, "API: " + c4273b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c7564b));
    }

    private final C4296z g(com.google.android.gms.common.api.d dVar) {
        Map map = this.f34832j;
        C4273b c4273bJ = dVar.j();
        C4296z c4296z = (C4296z) map.get(c4273bJ);
        if (c4296z == null) {
            c4296z = new C4296z(this, dVar);
            this.f34832j.put(c4273bJ, c4296z);
        }
        if (c4296z.a()) {
            this.f34835m.add(c4273bJ);
        }
        c4296z.E();
        return c4296z;
    }

    private final InterfaceC7906v h() {
        if (this.f34826d == null) {
            this.f34826d = AbstractC7905u.a(this.f34827e);
        }
        return this.f34826d;
    }

    private final void i() {
        C7904t c7904t = this.f34825c;
        if (c7904t != null) {
            if (c7904t.b() > 0 || d()) {
                h().a(c7904t);
            }
            this.f34825c = null;
        }
    }

    private final void j(TaskCompletionSource taskCompletionSource, int i10, com.google.android.gms.common.api.d dVar) {
        I iA;
        if (i10 == 0 || (iA = I.a(this, i10, dVar.j())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.f34836n;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.t
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, iA);
    }

    public static C4276e t(Context context) {
        C4276e c4276e;
        synchronized (f34821r) {
            try {
                if (f34822s == null) {
                    f34822s = new C4276e(context.getApplicationContext(), AbstractC7893h.b().getLooper(), C7567e.n());
                }
                c4276e = f34822s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4276e;
    }

    final void A(C7899n c7899n, int i10, long j10, int i11) {
        this.f34836n.sendMessage(this.f34836n.obtainMessage(18, new J(c7899n, i10, j10, i11)));
    }

    public final void B(C7564b c7564b, int i10) throws Resources.NotFoundException {
        if (e(c7564b, i10)) {
            return;
        }
        Handler handler = this.f34836n;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, c7564b));
    }

    public final void C() {
        Handler handler = this.f34836n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void D(com.google.android.gms.common.api.d dVar) {
        Handler handler = this.f34836n;
        handler.sendMessage(handler.obtainMessage(7, dVar));
    }

    public final void a(r rVar) {
        synchronized (f34821r) {
            try {
                if (this.f34833k != rVar) {
                    this.f34833k = rVar;
                    this.f34834l.clear();
                }
                this.f34834l.addAll(rVar.i());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void b(r rVar) {
        synchronized (f34821r) {
            try {
                if (this.f34833k == rVar) {
                    this.f34833k = null;
                    this.f34834l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean d() {
        if (this.f34824b) {
            return false;
        }
        s3.r rVarA = C7902q.b().a();
        if (rVarA != null && !rVarA.f()) {
            return false;
        }
        int iA = this.f34829g.a(this.f34827e, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean e(C7564b c7564b, int i10) throws Resources.NotFoundException {
        return this.f34828f.x(this.f34827e, c7564b, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        C4296z c4296z = null;
        switch (i10) {
            case 1:
                this.f34823a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f34836n.removeMessages(12);
                for (C4273b c4273b : this.f34832j.keySet()) {
                    Handler handler = this.f34836n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c4273b), this.f34823a);
                }
                return true;
            case 2:
                AbstractC5487d.a(message.obj);
                throw null;
            case 3:
                for (C4296z c4296z2 : this.f34832j.values()) {
                    c4296z2.D();
                    c4296z2.E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                K k10 = (K) message.obj;
                C4296z c4296zG = (C4296z) this.f34832j.get(k10.f34772c.j());
                if (c4296zG == null) {
                    c4296zG = g(k10.f34772c);
                }
                if (!c4296zG.a() || this.f34831i.get() == k10.f34771b) {
                    c4296zG.F(k10.f34770a);
                } else {
                    k10.f34770a.a(f34819p);
                    c4296zG.K();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                C7564b c7564b = (C7564b) message.obj;
                Iterator it = this.f34832j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C4296z c4296z3 = (C4296z) it.next();
                        if (c4296z3.s() == i11) {
                            c4296z = c4296z3;
                        }
                    }
                }
                if (c4296z == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (c7564b.b() == 13) {
                    c4296z.h(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f34828f.e(c7564b.b()) + ": " + c7564b.e()));
                } else {
                    c4296z.h(f(c4296z.f34862c, c7564b));
                }
                return true;
            case 6:
                if (this.f34827e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C4274c.c((Application) this.f34827e.getApplicationContext());
                    ComponentCallbacks2C4274c.b().a(new C4291u(this));
                    if (!ComponentCallbacks2C4274c.b().e(true)) {
                        this.f34823a = 300000L;
                    }
                }
                return true;
            case 7:
                g((com.google.android.gms.common.api.d) message.obj);
                return true;
            case 9:
                if (this.f34832j.containsKey(message.obj)) {
                    ((C4296z) this.f34832j.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it2 = this.f34835m.iterator();
                while (it2.hasNext()) {
                    C4296z c4296z4 = (C4296z) this.f34832j.remove((C4273b) it2.next());
                    if (c4296z4 != null) {
                        c4296z4.K();
                    }
                }
                this.f34835m.clear();
                return true;
            case 11:
                if (this.f34832j.containsKey(message.obj)) {
                    ((C4296z) this.f34832j.get(message.obj)).L();
                }
                return true;
            case 12:
                if (this.f34832j.containsKey(message.obj)) {
                    ((C4296z) this.f34832j.get(message.obj)).d();
                }
                return true;
            case 14:
                AbstractC5487d.a(message.obj);
                throw null;
            case 15:
                B b10 = (B) message.obj;
                if (this.f34832j.containsKey(b10.f34748a)) {
                    C4296z.B((C4296z) this.f34832j.get(b10.f34748a), b10);
                }
                return true;
            case 16:
                B b11 = (B) message.obj;
                if (this.f34832j.containsKey(b11.f34748a)) {
                    C4296z.C((C4296z) this.f34832j.get(b11.f34748a), b11);
                }
                return true;
            case 17:
                i();
                return true;
            case 18:
                J j10 = (J) message.obj;
                if (j10.f34768c == 0) {
                    h().a(new C7904t(j10.f34767b, Arrays.asList(j10.f34766a)));
                } else {
                    C7904t c7904t = this.f34825c;
                    if (c7904t != null) {
                        List listE = c7904t.e();
                        if (c7904t.b() != j10.f34767b || (listE != null && listE.size() >= j10.f34769d)) {
                            this.f34836n.removeMessages(17);
                            i();
                        } else {
                            this.f34825c.f(j10.f34766a);
                        }
                    }
                    if (this.f34825c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(j10.f34766a);
                        this.f34825c = new C7904t(j10.f34767b, arrayList);
                        Handler handler2 = this.f34836n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), j10.f34768c);
                    }
                }
                return true;
            case 19:
                this.f34824b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final int k() {
        return this.f34830h.getAndIncrement();
    }

    final C4296z s(C4273b c4273b) {
        return (C4296z) this.f34832j.get(c4273b);
    }

    public final void z(com.google.android.gms.common.api.d dVar, int i10, AbstractC4285n abstractC4285n, TaskCompletionSource taskCompletionSource, InterfaceC4284m interfaceC4284m) {
        j(taskCompletionSource, abstractC4285n.d(), dVar);
        this.f34836n.sendMessage(this.f34836n.obtainMessage(4, new K(new T(i10, abstractC4285n, taskCompletionSource, interfaceC4284m), this.f34831i.get(), dVar)));
    }
}

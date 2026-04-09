package j3;

import a3.C3754b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c3.AbstractC4208i;
import c3.AbstractC4215p;
import c3.C4207h;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import d3.AbstractC5292f;
import d3.AbstractC5293g;
import d3.InterfaceC5291e;
import d3.InterfaceC5299m;
import f3.C5515a;
import f3.C5517c;
import g3.AbstractC5861a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k3.AbstractC6377k;
import k3.InterfaceC6369c;
import k3.InterfaceC6370d;
import l3.InterfaceC6542a;
import m3.InterfaceC6756a;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50088a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5291e f50089b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6370d f50090c;

    /* renamed from: d, reason: collision with root package name */
    private final x f50091d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f50092e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6542a f50093f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6756a f50094g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC6756a f50095h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC6369c f50096i;

    public r(Context context, InterfaceC5291e interfaceC5291e, InterfaceC6370d interfaceC6370d, x xVar, Executor executor, InterfaceC6542a interfaceC6542a, InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2, InterfaceC6369c interfaceC6369c) {
        this.f50088a = context;
        this.f50089b = interfaceC5291e;
        this.f50090c = interfaceC6370d;
        this.f50091d = xVar;
        this.f50092e = executor;
        this.f50093f = interfaceC6542a;
        this.f50094g = interfaceC6756a;
        this.f50095h = interfaceC6756a2;
        this.f50096i = interfaceC6369c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(AbstractC4215p abstractC4215p) {
        return Boolean.valueOf(this.f50090c.e(abstractC4215p));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(AbstractC4215p abstractC4215p) {
        return this.f50090c.I(abstractC4215p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, AbstractC4215p abstractC4215p, long j10) {
        this.f50090c.c0(iterable);
        this.f50090c.O(abstractC4215p, this.f50094g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f50090c.i(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f50096i.g();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f50096i.a(((Integer) r0.getValue()).intValue(), C5517c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(AbstractC4215p abstractC4215p, long j10) {
        this.f50090c.O(abstractC4215p, this.f50094g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(AbstractC4215p abstractC4215p, int i10) {
        this.f50091d.b(abstractC4215p, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final AbstractC4215p abstractC4215p, final int i10, Runnable runnable) {
        try {
            try {
                InterfaceC6542a interfaceC6542a = this.f50093f;
                final InterfaceC6370d interfaceC6370d = this.f50090c;
                Objects.requireNonNull(interfaceC6370d);
                interfaceC6542a.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.i
                    @Override // l3.InterfaceC6542a.InterfaceC1933a
                    public final Object g() {
                        return Integer.valueOf(interfaceC6370d.f());
                    }
                });
                if (k()) {
                    u(abstractC4215p, i10);
                } else {
                    this.f50093f.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.j
                        @Override // l3.InterfaceC6542a.InterfaceC1933a
                        public final Object g() {
                            return this.f50069a.s(abstractC4215p, i10);
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.f50091d.b(abstractC4215p, i10 + 1);
            }
            runnable.run();
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    public AbstractC4208i j(InterfaceC5299m interfaceC5299m) {
        InterfaceC6542a interfaceC6542a = this.f50093f;
        final InterfaceC6369c interfaceC6369c = this.f50096i;
        Objects.requireNonNull(interfaceC6369c);
        return interfaceC5299m.b(AbstractC4208i.a().i(this.f50094g.a()).o(this.f50095h.a()).n("GDT_CLIENT_METRICS").h(new C4207h(C3754b.b("proto"), ((C5515a) interfaceC6542a.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.h
            @Override // l3.InterfaceC6542a.InterfaceC1933a
            public final Object g() {
                return interfaceC6369c.j();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f50088a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public AbstractC5293g u(final AbstractC4215p abstractC4215p, int i10) {
        AbstractC5293g abstractC5293gA;
        InterfaceC5299m interfaceC5299m = this.f50089b.get(abstractC4215p.b());
        long jMax = 0;
        AbstractC5293g abstractC5293gE = AbstractC5293g.e(0L);
        while (true) {
            final long j10 = jMax;
            while (((Boolean) this.f50093f.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.k
                @Override // l3.InterfaceC6542a.InterfaceC1933a
                public final Object g() {
                    return this.f50072a.l(abstractC4215p);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f50093f.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.l
                    @Override // l3.InterfaceC6542a.InterfaceC1933a
                    public final Object g() {
                        return this.f50074a.m(abstractC4215p);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return abstractC5293gE;
                }
                if (interfaceC5299m == null) {
                    AbstractC5861a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC4215p);
                    abstractC5293gA = AbstractC5293g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC6377k) it.next()).b());
                    }
                    if (abstractC4215p.e()) {
                        arrayList.add(j(interfaceC5299m));
                    }
                    abstractC5293gA = interfaceC5299m.a(AbstractC5292f.a().b(arrayList).c(abstractC4215p.c()).a());
                }
                abstractC5293gE = abstractC5293gA;
                if (abstractC5293gE.c() == AbstractC5293g.a.TRANSIENT_ERROR) {
                    this.f50093f.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.m
                        @Override // l3.InterfaceC6542a.InterfaceC1933a
                        public final Object g() {
                            return this.f50076a.n(iterable, abstractC4215p, j10);
                        }
                    });
                    this.f50091d.a(abstractC4215p, i10 + 1, true);
                    return abstractC5293gE;
                }
                this.f50093f.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.n
                    @Override // l3.InterfaceC6542a.InterfaceC1933a
                    public final Object g() {
                        return this.f50080a.o(iterable);
                    }
                });
                if (abstractC5293gE.c() == AbstractC5293g.a.OK) {
                    jMax = Math.max(j10, abstractC5293gE.b());
                    if (abstractC4215p.e()) {
                        this.f50093f.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.o
                            @Override // l3.InterfaceC6542a.InterfaceC1933a
                            public final Object g() {
                                return this.f50082a.p();
                            }
                        });
                    }
                } else if (abstractC5293gE.c() == AbstractC5293g.a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strN = ((AbstractC6377k) it2.next()).b().n();
                        if (map.containsKey(strN)) {
                            map.put(strN, Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                        } else {
                            map.put(strN, 1);
                        }
                    }
                    this.f50093f.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.p
                        @Override // l3.InterfaceC6542a.InterfaceC1933a
                        public final Object g() {
                            return this.f50083a.q(map);
                        }
                    });
                }
            }
            this.f50093f.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.q
                @Override // l3.InterfaceC6542a.InterfaceC1933a
                public final Object g() {
                    return this.f50085a.r(abstractC4215p, j10);
                }
            });
            return abstractC5293gE;
        }
    }

    public void v(final AbstractC4215p abstractC4215p, final int i10, final Runnable runnable) {
        this.f50092e.execute(new Runnable() { // from class: j3.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f50063a.t(abstractC4215p, i10, runnable);
            }
        });
    }
}

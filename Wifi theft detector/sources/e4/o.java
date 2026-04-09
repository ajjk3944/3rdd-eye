package e4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import g4.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20923a;

    /* renamed from: b, reason: collision with root package name */
    public final y3.d f20924b;

    /* renamed from: c, reason: collision with root package name */
    public final f4.d f20925c;

    /* renamed from: d, reason: collision with root package name */
    public final u f20926d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f20927e;

    /* renamed from: f, reason: collision with root package name */
    public final g4.a f20928f;

    /* renamed from: g, reason: collision with root package name */
    public final h4.a f20929g;

    /* renamed from: h, reason: collision with root package name */
    public final h4.a f20930h;

    /* renamed from: i, reason: collision with root package name */
    public final f4.c f20931i;

    public o(Context context, y3.d dVar, f4.d dVar2, u uVar, Executor executor, g4.a aVar, h4.a aVar2, h4.a aVar3, f4.c cVar) {
        this.f20923a = context;
        this.f20924b = dVar;
        this.f20925c = dVar2;
        this.f20926d = uVar;
        this.f20927e = executor;
        this.f20928f = aVar;
        this.f20929g = aVar2;
        this.f20930h = aVar3;
        this.f20931i = cVar;
    }

    public static /* synthetic */ Object b(o oVar, Iterable iterable, x3.o oVar2, long j10) {
        oVar.f20925c.G(iterable);
        oVar.f20925c.Q(oVar2, oVar.f20929g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(o oVar) {
        oVar.f20931i.d();
        return null;
    }

    public static /* synthetic */ Object e(o oVar, Iterable iterable) {
        oVar.f20925c.w(iterable);
        return null;
    }

    public static /* synthetic */ Object f(o oVar, x3.o oVar2, int i10) {
        oVar.f20926d.a(oVar2, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(o oVar, x3.o oVar2, long j10) {
        oVar.f20925c.Q(oVar2, oVar.f20929g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(o oVar, Map map) {
        oVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            oVar.f20931i.j(((Integer) r0.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final o oVar, final x3.o oVar2, final int i10, Runnable runnable) {
        oVar.getClass();
        try {
            try {
                g4.a aVar = oVar.f20928f;
                final f4.d dVar = oVar.f20925c;
                Objects.requireNonNull(dVar);
                aVar.a(new a.InterfaceC0402a() { // from class: e4.f
                    @Override // g4.a.InterfaceC0402a
                    public final Object execute() {
                        return Integer.valueOf(dVar.v());
                    }
                });
                if (oVar.k()) {
                    oVar.l(oVar2, i10);
                } else {
                    oVar.f20928f.a(new a.InterfaceC0402a() { // from class: e4.g
                        @Override // g4.a.InterfaceC0402a
                        public final Object execute() {
                            return o.f(this.f20904a, oVar2, i10);
                        }
                    });
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                oVar.f20926d.a(oVar2, i10 + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public x3.i j(y3.k kVar) {
        g4.a aVar = this.f20928f;
        final f4.c cVar = this.f20931i;
        Objects.requireNonNull(cVar);
        return kVar.a(x3.i.a().i(this.f20929g.a()).k(this.f20930h.a()).j("GDT_CLIENT_METRICS").h(new x3.h(u3.b.b("proto"), ((a4.a) aVar.a(new a.InterfaceC0402a() { // from class: e4.e
            @Override // g4.a.InterfaceC0402a
            public final Object execute() {
                return cVar.h();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f20923a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public BackendResponse l(final x3.o oVar, int i10) {
        BackendResponse backendResponseB;
        y3.k kVar = this.f20924b.get(oVar.b());
        BackendResponse backendResponseE = BackendResponse.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f20928f.a(new a.InterfaceC0402a() { // from class: e4.h
            @Override // g4.a.InterfaceC0402a
            public final Object execute() {
                return Boolean.valueOf(this.f20907a.f20925c.K(oVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f20928f.a(new a.InterfaceC0402a() { // from class: e4.i
                @Override // g4.a.InterfaceC0402a
                public final Object execute() {
                    return this.f20909a.f20925c.D(oVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return backendResponseE;
            }
            if (kVar == null) {
                b4.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                backendResponseB = BackendResponse.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f4.k) it.next()).b());
                }
                if (oVar.e()) {
                    arrayList.add(j(kVar));
                }
                backendResponseB = kVar.b(y3.e.a().b(arrayList).c(oVar.c()).a());
            }
            backendResponseE = backendResponseB;
            if (backendResponseE.c() == BackendResponse.Status.TRANSIENT_ERROR) {
                final x3.o oVar2 = oVar;
                this.f20928f.a(new a.InterfaceC0402a() { // from class: e4.j
                    @Override // g4.a.InterfaceC0402a
                    public final Object execute() {
                        return o.b(this.f20911a, iterable, oVar2, j10);
                    }
                });
                this.f20926d.b(oVar2, i10 + 1, true);
                return backendResponseE;
            }
            x3.o oVar3 = oVar;
            this.f20928f.a(new a.InterfaceC0402a() { // from class: e4.k
                @Override // g4.a.InterfaceC0402a
                public final Object execute() {
                    return o.e(this.f20915a, iterable);
                }
            });
            if (backendResponseE.c() == BackendResponse.Status.OK) {
                long jMax = Math.max(j10, backendResponseE.b());
                if (oVar3.e()) {
                    this.f20928f.a(new a.InterfaceC0402a() { // from class: e4.l
                        @Override // g4.a.InterfaceC0402a
                        public final Object execute() {
                            return o.c(this.f20917a);
                        }
                    });
                }
                j10 = jMax;
            } else if (backendResponseE.c() == BackendResponse.Status.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strJ = ((f4.k) it2.next()).b().j();
                    if (map.containsKey(strJ)) {
                        map.put(strJ, Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    } else {
                        map.put(strJ, 1);
                    }
                }
                this.f20928f.a(new a.InterfaceC0402a() { // from class: e4.m
                    @Override // g4.a.InterfaceC0402a
                    public final Object execute() {
                        return o.h(this.f20918a, map);
                    }
                });
            }
            oVar = oVar3;
        }
        final x3.o oVar4 = oVar;
        this.f20928f.a(new a.InterfaceC0402a() { // from class: e4.n
            @Override // g4.a.InterfaceC0402a
            public final Object execute() {
                return o.g(this.f20920a, oVar4, j10);
            }
        });
        return backendResponseE;
    }

    public void m(final x3.o oVar, final int i10, final Runnable runnable) {
        this.f20927e.execute(new Runnable() { // from class: e4.d
            @Override // java.lang.Runnable
            public final void run() {
                o.i(this.f20898a, oVar, i10, runnable);
            }
        });
    }
}

package M4;

import com.google.firebase.crashlytics.internal.common.AbstractC5107i;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import r.Y;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final g f12545a;

    /* renamed from: b, reason: collision with root package name */
    private final L4.f f12546b;

    /* renamed from: c, reason: collision with root package name */
    private String f12547c;

    /* renamed from: d, reason: collision with root package name */
    private final a f12548d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f12549e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    private final k f12550f = new k(128);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference f12551g = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference f12552a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference f12553b = new AtomicReference(null);

        /* renamed from: c, reason: collision with root package name */
        private final boolean f12554c;

        public a(boolean z10) {
            this.f12554c = z10;
            this.f12552a = new AtomicMarkableReference(new e(64, z10 ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() throws Throwable {
            this.f12553b.set(null);
            e();
        }

        private void d() {
            Runnable runnable = new Runnable() { // from class: M4.n
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f12544a.c();
                }
            };
            if (Y.a(this.f12553b, null, runnable)) {
                o.this.f12546b.f11230b.f(runnable);
            }
        }

        private void e() throws Throwable {
            Map mapA;
            synchronized (this) {
                try {
                    if (this.f12552a.isMarked()) {
                        mapA = ((e) this.f12552a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f12552a;
                        atomicMarkableReference.set((e) atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (mapA != null) {
                o.this.f12545a.r(o.this.f12547c, mapA, this.f12554c);
            }
        }

        public Map b() {
            return ((e) this.f12552a.getReference()).a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((e) this.f12552a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f12552a;
                    atomicMarkableReference.set((e) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public o(String str, Q4.g gVar, L4.f fVar) {
        this.f12547c = str;
        this.f12545a = new g(gVar);
        this.f12546b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str, Map map, List list) throws Throwable {
        if (i() != null) {
            this.f12545a.t(str, i());
        }
        if (!map.isEmpty()) {
            this.f12545a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.f12545a.s(str, list);
    }

    public static o k(String str, Q4.g gVar, L4.f fVar) {
        g gVar2 = new g(gVar);
        o oVar = new o(str, gVar, fVar);
        ((e) oVar.f12548d.f12552a.getReference()).e(gVar2.i(str, false));
        ((e) oVar.f12549e.f12552a.getReference()).e(gVar2.i(str, true));
        oVar.f12551g.set(gVar2.k(str), false);
        oVar.f12550f.c(gVar2.j(str));
        return oVar;
    }

    public static String l(String str, Q4.g gVar) {
        return new g(gVar).k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws Throwable {
        boolean z10;
        String strI;
        synchronized (this.f12551g) {
            try {
                z10 = false;
                if (this.f12551g.isMarked()) {
                    strI = i();
                    this.f12551g.set(strI, false);
                    z10 = true;
                } else {
                    strI = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f12545a.t(this.f12547c, strI);
        }
    }

    public Map f(Map map) {
        if (map.isEmpty()) {
            return this.f12548d.b();
        }
        HashMap map2 = new HashMap(this.f12548d.b());
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String strC = e.c((String) entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strC)) {
                map2.put(strC, e.c((String) entry.getValue(), 1024));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            I4.g.f().k("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map g() {
        return this.f12549e.b();
    }

    public List h() {
        return this.f12550f.a();
    }

    public String i() {
        return (String) this.f12551g.getReference();
    }

    public boolean n(String str, String str2) {
        return this.f12548d.f(str, str2);
    }

    public boolean o(String str, String str2) {
        return this.f12549e.f(str, str2);
    }

    public void p(final String str) {
        synchronized (this.f12547c) {
            this.f12547c = str;
            final Map mapB = this.f12548d.b();
            final List listB = this.f12550f.b();
            this.f12546b.f11230b.f(new Runnable() { // from class: M4.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f12539a.j(str, mapB, listB);
                }
            });
        }
    }

    public void q(String str) {
        String strC = e.c(str, 1024);
        synchronized (this.f12551g) {
            try {
                if (AbstractC5107i.y(strC, (String) this.f12551g.getReference())) {
                    return;
                }
                this.f12551g.set(strC, true);
                this.f12546b.f11230b.f(new Runnable() { // from class: M4.m
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f12543a.m();
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

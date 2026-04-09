package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<g> f1828d;

    /* renamed from: b, reason: collision with root package name */
    private i.a<f, b> f1826b = new i.a<>();

    /* renamed from: e, reason: collision with root package name */
    private int f1829e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1830f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1831g = false;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<d.b> f1832h = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private d.b f1827c = d.b.INITIALIZED;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1833a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f1834b;

        static {
            int[] iArr = new int[d.b.values().length];
            f1834b = iArr;
            try {
                iArr[d.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1834b[d.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1834b[d.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1834b[d.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1834b[d.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.a.values().length];
            f1833a = iArr2;
            try {
                iArr2[d.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1833a[d.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1833a[d.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1833a[d.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1833a[d.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1833a[d.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1833a[d.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        d.b f1835a;

        /* renamed from: b, reason: collision with root package name */
        e f1836b;

        b(f fVar, d.b bVar) {
            this.f1836b = j.f(fVar);
            this.f1835a = bVar;
        }

        void a(g gVar, d.a aVar) {
            d.b bVarH = h.h(aVar);
            this.f1835a = h.l(this.f1835a, bVarH);
            this.f1836b.g(gVar, aVar);
            this.f1835a = bVarH;
        }
    }

    public h(g gVar) {
        this.f1828d = new WeakReference<>(gVar);
    }

    private void d(g gVar) {
        Iterator<Map.Entry<f, b>> itA = this.f1826b.a();
        while (itA.hasNext() && !this.f1831g) {
            Map.Entry<f, b> next = itA.next();
            b value = next.getValue();
            while (value.f1835a.compareTo(this.f1827c) > 0 && !this.f1831g && this.f1826b.contains(next.getKey())) {
                d.a aVarF = f(value.f1835a);
                o(h(aVarF));
                value.a(gVar, aVarF);
                n();
            }
        }
    }

    private d.b e(f fVar) {
        Map.Entry<f, b> entryH = this.f1826b.h(fVar);
        d.b bVar = null;
        d.b bVar2 = entryH != null ? entryH.getValue().f1835a : null;
        if (!this.f1832h.isEmpty()) {
            bVar = this.f1832h.get(r0.size() - 1);
        }
        return l(l(this.f1827c, bVar2), bVar);
    }

    private static d.a f(d.b bVar) {
        int i2 = a.f1834b[bVar.ordinal()];
        if (i2 == 1) {
            throw new IllegalArgumentException();
        }
        if (i2 == 2) {
            return d.a.ON_DESTROY;
        }
        if (i2 == 3) {
            return d.a.ON_STOP;
        }
        if (i2 == 4) {
            return d.a.ON_PAUSE;
        }
        if (i2 == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(g gVar) {
        i.b<f, b>.d dVarD = this.f1826b.d();
        while (dVarD.hasNext() && !this.f1831g) {
            Map.Entry next = dVarD.next();
            b bVar = (b) next.getValue();
            while (bVar.f1835a.compareTo(this.f1827c) < 0 && !this.f1831g && this.f1826b.contains(next.getKey())) {
                o(bVar.f1835a);
                bVar.a(gVar, r(bVar.f1835a));
                n();
            }
        }
    }

    static d.b h(d.a aVar) {
        switch (a.f1833a[aVar.ordinal()]) {
            case 1:
            case 2:
                return d.b.CREATED;
            case 3:
            case 4:
                return d.b.STARTED;
            case 5:
                return d.b.RESUMED;
            case 6:
                return d.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.f1826b.size() == 0) {
            return true;
        }
        d.b bVar = this.f1826b.b().getValue().f1835a;
        d.b bVar2 = this.f1826b.e().getValue().f1835a;
        return bVar == bVar2 && this.f1827c == bVar2;
    }

    static d.b l(d.b bVar, d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(d.b bVar) {
        if (this.f1827c == bVar) {
            return;
        }
        this.f1827c = bVar;
        if (this.f1830f || this.f1829e != 0) {
            this.f1831g = true;
            return;
        }
        this.f1830f = true;
        q();
        this.f1830f = false;
    }

    private void n() {
        this.f1832h.remove(r0.size() - 1);
    }

    private void o(d.b bVar) {
        this.f1832h.add(bVar);
    }

    private void q() {
        g gVar = this.f1828d.get();
        if (gVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zJ = j();
            this.f1831g = false;
            if (zJ) {
                return;
            }
            if (this.f1827c.compareTo(this.f1826b.b().getValue().f1835a) < 0) {
                d(gVar);
            }
            Map.Entry<f, b> entryE = this.f1826b.e();
            if (!this.f1831g && entryE != null && this.f1827c.compareTo(entryE.getValue().f1835a) > 0) {
                g(gVar);
            }
        }
    }

    private static d.a r(d.b bVar) {
        int i2 = a.f1834b[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return d.a.ON_START;
            }
            if (i2 == 3) {
                return d.a.ON_RESUME;
            }
            if (i2 == 4) {
                throw new IllegalArgumentException();
            }
            if (i2 != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return d.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.d
    public void a(f fVar) {
        g gVar;
        d.b bVar = this.f1827c;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        b bVar3 = new b(fVar, bVar2);
        if (this.f1826b.i(fVar, bVar3) == null && (gVar = this.f1828d.get()) != null) {
            boolean z2 = this.f1829e != 0 || this.f1830f;
            d.b bVarE = e(fVar);
            this.f1829e++;
            while (bVar3.f1835a.compareTo(bVarE) < 0 && this.f1826b.contains(fVar)) {
                o(bVar3.f1835a);
                bVar3.a(gVar, r(bVar3.f1835a));
                n();
                bVarE = e(fVar);
            }
            if (!z2) {
                q();
            }
            this.f1829e--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.b b() {
        return this.f1827c;
    }

    @Override // androidx.lifecycle.d
    public void c(f fVar) {
        this.f1826b.g(fVar);
    }

    public void i(d.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(d.b bVar) {
        p(bVar);
    }

    public void p(d.b bVar) {
        m(bVar);
    }
}

package s0;

import r0.C5507d;
import r0.C5508e;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f45946a;

    /* renamed from: b, reason: collision with root package name */
    public C5508e f45947b;

    /* renamed from: c, reason: collision with root package name */
    public m f45948c;

    /* renamed from: d, reason: collision with root package name */
    public C5508e.b f45949d;

    /* renamed from: e, reason: collision with root package name */
    public final g f45950e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f45951f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45952g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f45953h = new f(this);
    public final f i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public b f45954j = b.NONE;

    /* compiled from: WidgetRun.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45955a;

        static {
            int[] iArr = new int[C5507d.b.values().length];
            f45955a = iArr;
            try {
                iArr[C5507d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45955a[C5507d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45955a[C5507d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45955a[C5507d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45955a[C5507d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(C5508e c5508e) {
        this.f45947b = c5508e;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f45930l.add(fVar2);
        fVar.f45925f = i;
        fVar2.f45929k.add(fVar);
    }

    public static f h(C5507d c5507d) {
        C5507d c5507d2 = c5507d.f45511f;
        if (c5507d2 == null) {
            return null;
        }
        C5508e c5508e = c5507d2.f45509d;
        int i = a.f45955a[c5507d2.f45510e.ordinal()];
        if (i == 1) {
            return c5508e.f45547d.f45953h;
        }
        if (i == 2) {
            return c5508e.f45547d.i;
        }
        if (i == 3) {
            return c5508e.f45549e.f45953h;
        }
        if (i == 4) {
            return c5508e.f45549e.f45937k;
        }
        if (i != 5) {
            return null;
        }
        return c5508e.f45549e.i;
    }

    public static f i(C5507d c5507d, int i) {
        C5507d c5507d2 = c5507d.f45511f;
        if (c5507d2 == null) {
            return null;
        }
        C5508e c5508e = c5507d2.f45509d;
        p pVar = i == 0 ? c5508e.f45547d : c5508e.f45549e;
        int i10 = a.f45955a[c5507d2.f45510e.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        return null;
                    }
                }
            }
            return pVar.i;
        }
        return pVar.f45953h;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f45930l.add(fVar2);
        fVar.f45930l.add(this.f45950e);
        fVar.f45927h = i;
        fVar.i = gVar;
        fVar2.f45929k.add(fVar);
        gVar.f45929k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i10) {
        if (i10 == 0) {
            C5508e c5508e = this.f45947b;
            int i11 = c5508e.f45578v;
            int iMax = Math.max(c5508e.f45577u, i);
            if (i11 > 0) {
                iMax = Math.min(i11, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C5508e c5508e2 = this.f45947b;
            int i12 = c5508e2.f45581y;
            int iMax2 = Math.max(c5508e2.f45580x, i);
            if (i12 > 0) {
                iMax2 = Math.min(i12, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f45950e.f45928j) {
            return r0.f45926g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(r0.C5507d r13, r0.C5507d r14, int r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.p.l(r0.d, r0.d, int):void");
    }

    @Override // s0.d
    public void a(d dVar) {
    }
}

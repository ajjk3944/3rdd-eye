package h1;

import g1.AbstractC5849g;
import g1.C5843a;
import g1.C5847e;
import j1.C6241a;

/* loaded from: classes.dex */
public class c extends C5847e {

    /* renamed from: q0, reason: collision with root package name */
    private AbstractC5849g.c f48336q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f48337r0;

    /* renamed from: s0, reason: collision with root package name */
    private C6241a f48338s0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48339a;

        static {
            int[] iArr = new int[AbstractC5849g.c.values().length];
            f48339a = iArr;
            try {
                iArr[AbstractC5849g.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48339a[AbstractC5849g.c.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48339a[AbstractC5849g.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48339a[AbstractC5849g.c.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48339a[AbstractC5849g.c.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48339a[AbstractC5849g.c.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(AbstractC5849g abstractC5849g) {
        super(abstractC5849g, AbstractC5849g.d.BARRIER);
    }

    @Override // g1.C5843a
    public C5843a J(int i10) {
        this.f48337r0 = i10;
        return this;
    }

    @Override // g1.C5843a
    public C5843a K(Object obj) {
        J(this.f47481m0.e(obj));
        return this;
    }

    @Override // g1.C5847e, g1.C5843a, g1.InterfaceC5848f
    public void apply() {
        u0();
        int i10 = a.f48339a[this.f48336q0.ordinal()];
        int i11 = 3;
        if (i10 == 3 || i10 == 4) {
            i11 = 1;
        } else if (i10 == 5) {
            i11 = 2;
        } else if (i10 != 6) {
            i11 = 0;
        }
        this.f48338s0.j1(i11);
        this.f48338s0.k1(this.f48337r0);
    }

    @Override // g1.C5847e
    public j1.j u0() {
        if (this.f48338s0 == null) {
            this.f48338s0 = new C6241a();
        }
        return this.f48338s0;
    }

    public void w0(AbstractC5849g.c cVar) {
        this.f48336q0 = cVar;
    }
}

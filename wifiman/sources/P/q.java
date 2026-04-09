package P;

import E0.A;
import E0.AbstractC2633k;
import E0.AbstractC2640s;
import E0.InterfaceC2630h;
import Ii.AbstractC3063k;
import Ii.N;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6537m;
import m0.InterfaceC6739y0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import o.C7007F;
import o0.InterfaceC7036c;
import o0.InterfaceC7039f;
import y.InterfaceC8555j;
import y.InterfaceC8556k;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
public abstract class q extends e.c implements InterfaceC2630h, E0.r, A {

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC8556k f17952n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f17953o;

    /* renamed from: p, reason: collision with root package name */
    private final float f17954p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC6739y0 f17955q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC6824a f17956r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f17957s;

    /* renamed from: t, reason: collision with root package name */
    private u f17958t;

    /* renamed from: u, reason: collision with root package name */
    private float f17959u;

    /* renamed from: v, reason: collision with root package name */
    private long f17960v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f17961w;

    /* renamed from: x, reason: collision with root package name */
    private final C7007F f17962x;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17963a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17964b;

        /* renamed from: P.q$a$a, reason: collision with other inner class name */
        static final class C0631a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f17966a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N f17967b;

            C0631a(q qVar, N n10) {
                this.f17966a = qVar;
                this.f17967b = n10;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC8555j interfaceC8555j, InterfaceC5380e interfaceC5380e) {
                if (!(interfaceC8555j instanceof InterfaceC8560o)) {
                    this.f17966a.Q2(interfaceC8555j, this.f17967b);
                } else if (this.f17966a.f17961w) {
                    this.f17966a.O2((InterfaceC8560o) interfaceC8555j);
                } else {
                    this.f17966a.f17962x.g(interfaceC8555j);
                }
                return J.f24997a;
            }
        }

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = q.this.new a(interfaceC5380e);
            aVar.f17964b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f17963a;
            if (i10 == 0) {
                Yg.v.b(obj);
                N n10 = (N) this.f17964b;
                InterfaceC3220g interfaceC3220gB = q.this.f17952n.b();
                C0631a c0631a = new C0631a(q.this, n10);
                this.f17963a = 1;
                if (interfaceC3220gB.b(c0631a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public /* synthetic */ q(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, InterfaceC6824a interfaceC6824a, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC8556k, z10, f10, interfaceC6739y0, interfaceC6824a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(InterfaceC8560o interfaceC8560o) {
        if (interfaceC8560o instanceof InterfaceC8560o.b) {
            I2((InterfaceC8560o.b) interfaceC8560o, this.f17960v, this.f17959u);
        } else if (interfaceC8560o instanceof InterfaceC8560o.c) {
            P2(((InterfaceC8560o.c) interfaceC8560o).a());
        } else if (interfaceC8560o instanceof InterfaceC8560o.a) {
            P2(((InterfaceC8560o.a) interfaceC8560o).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q2(InterfaceC8555j interfaceC8555j, N n10) {
        u uVar = this.f17958t;
        if (uVar == null) {
            uVar = new u(this.f17953o, this.f17956r);
            AbstractC2640s.a(this);
            this.f17958t = uVar;
        }
        uVar.c(interfaceC8555j, n10);
    }

    public abstract void I2(InterfaceC8560o.b bVar, long j10, float f10);

    @Override // E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        interfaceC7036c.X1();
        u uVar = this.f17958t;
        if (uVar != null) {
            uVar.b(interfaceC7036c, this.f17959u, M2());
        }
        J2(interfaceC7036c);
    }

    public abstract void J2(InterfaceC7039f interfaceC7039f);

    protected final boolean K2() {
        return this.f17953o;
    }

    protected final InterfaceC6824a L2() {
        return this.f17956r;
    }

    public final long M2() {
        return this.f17955q.a();
    }

    protected final long N2() {
        return this.f17960v;
    }

    public abstract void P2(InterfaceC8560o.b bVar);

    @Override // E0.A
    public void a0(long j10) {
        this.f17961w = true;
        Y0.d dVarI = AbstractC2633k.i(this);
        this.f17960v = Y0.s.d(j10);
        this.f17959u = Float.isNaN(this.f17954p) ? i.a(dVarI, this.f17953o, this.f17960v) : dVarI.d1(this.f17954p);
        C7007F c7007f = this.f17962x;
        Object[] objArr = c7007f.f54910a;
        int i10 = c7007f.f54911b;
        for (int i11 = 0; i11 < i10; i11++) {
            O2((InterfaceC8560o) objArr[i11]);
        }
        this.f17962x.h();
    }

    @Override // androidx.compose.ui.e.c
    public final boolean i2() {
        return this.f17957s;
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        AbstractC3063k.d(d2(), null, null, new a(null), 3, null);
    }

    private q(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, InterfaceC6824a interfaceC6824a) {
        this.f17952n = interfaceC8556k;
        this.f17953o = z10;
        this.f17954p = f10;
        this.f17955q = interfaceC6739y0;
        this.f17956r = interfaceC6824a;
        this.f17960v = C6537m.f52356b.b();
        this.f17962x = new C7007F(0, 1, null);
    }
}

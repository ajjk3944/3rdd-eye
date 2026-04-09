package C;

import B.InterfaceC2444h;
import Ii.O;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.U;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import com.google.ar.core.ImageMetadata;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.K;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import r.InterfaceC7533i;
import r.m0;
import sh.AbstractC7978m;
import x.InterfaceC8409j;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    private static final float f1906a = Y0.h.j(56);

    /* renamed from: b, reason: collision with root package name */
    private static final u f1907b = new u(AbstractC3689v.l(), 0, 0, 0, w.q.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, InterfaceC8409j.a.f65295a, new a(), false, null, null, O.a(C5385j.f46088a), ImageMetadata.HOT_PIXEL_MODE, null);

    /* renamed from: c, reason: collision with root package name */
    private static final b f1908c = new b();

    public static final class a implements C0.D {

        /* renamed from: a, reason: collision with root package name */
        private final int f1909a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1910b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f1911c = U.h();

        a() {
        }

        @Override // C0.D
        public int getHeight() {
            return this.f1910b;
        }

        @Override // C0.D
        public int getWidth() {
            return this.f1909a;
        }

        @Override // C0.D
        public Map p() {
            return this.f1911c;
        }

        @Override // C0.D
        public void q() {
        }
    }

    public static final class b implements Y0.d {

        /* renamed from: a, reason: collision with root package name */
        private final float f1912a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        private final float f1913b = 1.0f;

        b() {
        }

        @Override // Y0.d
        public float getDensity() {
            return this.f1912a;
        }

        @Override // Y0.l
        public float y() {
            return this.f1913b;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f1914a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f1915b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f1916c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1917d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2444h f1918e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f1919f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC7533i f1920g;

        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f1921a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w.v f1922b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K k10, w.v vVar) {
                super(2);
                this.f1921a = k10;
                this.f1922b = vVar;
            }

            public final void a(float f10, float f11) {
                this.f1921a.f51686a += this.f1922b.a(f10 - this.f1921a.f51686a);
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6839p interfaceC6839p, int i10, InterfaceC2444h interfaceC2444h, float f10, InterfaceC7533i interfaceC7533i, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f1916c = interfaceC6839p;
            this.f1917d = i10;
            this.f1918e = interfaceC2444h;
            this.f1919f = f10;
            this.f1920g = interfaceC7533i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = new c(this.f1916c, this.f1917d, this.f1918e, this.f1919f, this.f1920g, interfaceC5380e);
            cVar.f1915b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f1914a;
            if (i10 == 0) {
                Yg.v.b(obj);
                w.v vVar = (w.v) this.f1915b;
                this.f1916c.invoke(vVar, kotlin.coroutines.jvm.internal.b.d(this.f1917d));
                boolean z10 = this.f1917d > this.f1918e.g();
                int iC = (this.f1918e.c() - this.f1918e.g()) + 1;
                if (((z10 && this.f1917d > this.f1918e.c()) || (!z10 && this.f1917d < this.f1918e.g())) && Math.abs(this.f1917d - this.f1918e.g()) >= 3) {
                    this.f1918e.b(vVar, z10 ? AbstractC7978m.d(this.f1917d - iC, this.f1918e.g()) : AbstractC7978m.g(this.f1917d + iC, this.f1918e.g()), 0);
                }
                float f10 = this.f1918e.f(this.f1917d) + this.f1919f;
                K k10 = new K();
                InterfaceC7533i interfaceC7533i = this.f1920g;
                a aVar = new a(k10, vVar);
                this.f1914a = 1;
                if (m0.e(0.0f, f10, 0.0f, interfaceC7533i, aVar, this, 4, null) == objG) {
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
        public final Object invoke(w.v vVar, InterfaceC5380e interfaceC5380e) {
            return ((c) create(vVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1923a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f1924b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f1925c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, float f10, InterfaceC6824a interfaceC6824a) {
            super(0);
            this.f1923a = i10;
            this.f1924b = f10;
            this.f1925c = interfaceC6824a;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2517b invoke() {
            return new C2517b(this.f1923a, this.f1924b, this.f1925c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(InterfaceC2444h interfaceC2444h, int i10, float f10, InterfaceC7533i interfaceC7533i, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objD = interfaceC2444h.d(new c(interfaceC6839p, i10, interfaceC2444h, f10, interfaceC7533i, null), interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : J.f24997a;
    }

    public static final Object e(C c10, InterfaceC5380e interfaceC5380e) {
        Object objN;
        return (c10.v() + 1 >= c10.F() || (objN = C.n(c10, c10.v() + 1, 0.0f, null, interfaceC5380e, 6, null)) != AbstractC5467b.g()) ? J.f24997a : objN;
    }

    public static final Object f(C c10, InterfaceC5380e interfaceC5380e) {
        Object objN;
        return (c10.v() + (-1) < 0 || (objN = C.n(c10, c10.v() + (-1), 0.0f, null, interfaceC5380e, 6, null)) != AbstractC5467b.g()) ? J.f24997a : objN;
    }

    public static final long g(n nVar, int i10) {
        long j10 = (i10 * (nVar.j() + nVar.i())) + nVar.f() + nVar.c();
        int iG = nVar.e() == w.q.Horizontal ? Y0.r.g(nVar.b()) : Y0.r.f(nVar.b());
        return AbstractC7978m.e(j10 - (iG - AbstractC7978m.k(nVar.l().a(iG, nVar.i(), nVar.f(), nVar.c(), i10 - 1, i10), 0, iG)), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(u uVar, int i10) {
        int iG = uVar.e() == w.q.Horizontal ? Y0.r.g(uVar.b()) : Y0.r.f(uVar.b());
        return AbstractC7978m.k(uVar.l().a(iG, uVar.i(), uVar.f(), uVar.c(), 0, i10), 0, iG);
    }

    public static final float i() {
        return f1906a;
    }

    public static final u j() {
        return f1907b;
    }

    public static final C k(int i10, float f10, InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            f10 = 0.0f;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1210768637, i11, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)");
        }
        Object[] objArr = new Object[0];
        InterfaceC4182k interfaceC4182kA = C2517b.f1935L.a();
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && interfaceC3540l.i(i10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC3540l.g(f10)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && interfaceC3540l.T(interfaceC6824a)) || (i11 & 384) == 256);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new d(i10, f10, interfaceC6824a);
            interfaceC3540l.K(objF);
        }
        C2517b c2517b = (C2517b) AbstractC4174c.e(objArr, interfaceC4182kA, null, (InterfaceC6824a) objF, interfaceC3540l, 0, 4);
        c2517b.m0().setValue(interfaceC6824a);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c2517b;
    }
}

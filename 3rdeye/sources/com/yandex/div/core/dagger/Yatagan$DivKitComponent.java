package com.yandex.div.core.dagger;

import B6.k;
import B6.m;
import B7.b;
import C6.a;
import D3.f;
import H6.A;
import H6.C0674k;
import H6.C0675l;
import H6.C0682t;
import H6.C0683u;
import H6.C0685w;
import H6.H;
import H6.I;
import H6.K;
import H6.L;
import H6.Q;
import H6.z;
import H7.e;
import K6.C0719e;
import K6.C0732i0;
import K6.C0735j0;
import K6.C0738k0;
import K6.C0745n;
import K6.C0750p0;
import K6.C0752q0;
import K6.C0757t0;
import K6.C0759u0;
import K6.C0762w;
import K6.D;
import K6.I1;
import K6.S;
import K6.V0;
import K6.X0;
import K6.Z0;
import K6.v1;
import K6.x1;
import K6.y1;
import M6.w;
import O6.C1475a;
import O6.G;
import Q6.d;
import W6.c;
import android.content.Context;
import android.content.ContextWrapper;
import android.renderscript.RenderScript;
import android.view.ContextThemeWrapper;
import androidx.work.s;
import b9.p;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.dagger.DivKitComponent;
import e7.InterfaceC4322a;
import e7.f;
import e7.j;
import g0.C4356c;
import g7.b;
import h6.C4418a;
import io.appmetrica.analytics.impl.Oo;
import j6.g;
import j6.i;
import j6.j;
import j6.n;
import j6.q;
import j6.u;
import j6.x;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import k2.C5211b;
import k6.C5221A;
import k6.C5226e;
import k6.C5229h;
import k6.C5230i;
import k6.C5232k;
import k6.C5233l;
import k6.C5235n;
import k6.C5237p;
import k6.C5238q;
import k6.C5239r;
import k6.C5240s;
import k6.C5242u;
import k6.C5243v;
import k6.C5244w;
import k6.C5245x;
import k6.C5247z;
import kotlin.jvm.internal.l;
import m6.InterfaceC5328a;
import o6.C5428e;
import p7.C5469a;
import p7.C5473e;
import p7.C5476h;
import p7.C5477i;
import p7.InterfaceC5475g;
import q6.C5494c;
import q7.C5495a;
import q7.C5496b;
import s6.C5581b;
import s6.g;
import s6.h;
import t4.C5606d;
import x6.C5775g;
import x6.C5778j;
import y6.C5815a;

/* loaded from: classes.dex */
public final class Yatagan$DivKitComponent implements DivKitComponent {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f23855a = new UninitializedLock();

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f23856b = new UninitializedLock();

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f23857c = new UninitializedLock();

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f23858d = new UninitializedLock();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f23859e = new UninitializedLock();

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f23860f = new UninitializedLock();

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f23861g = new UninitializedLock();

    /* renamed from: h, reason: collision with root package name */
    public final Context f23862h;
    public final f i;

    /* compiled from: Yatagan$DivKitComponent.java */
    public static final class ComponentFactoryImpl implements DivKitComponent.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Context f23863a;

        /* renamed from: b, reason: collision with root package name */
        public f f23864b;

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public final DivKitComponent.Builder a(f fVar) {
            this.f23864b = fVar;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public final DivKitComponent.Builder b(Context context) {
            this.f23863a = context;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public final Yatagan$DivKitComponent build() {
            return new Yatagan$DivKitComponent(this.f23863a, this.f23864b);
        }
    }

    /* compiled from: Yatagan$DivKitComponent.java */
    public static final class Div2ComponentImpl implements Div2Component {

        /* renamed from: A, reason: collision with root package name */
        public C5494c f23865A;

        /* renamed from: B, reason: collision with root package name */
        public C1475a f23866B;

        /* renamed from: C, reason: collision with root package name */
        public x f23867C;

        /* renamed from: D, reason: collision with root package name */
        public a f23868D;

        /* renamed from: E, reason: collision with root package name */
        public A f23869E;

        /* renamed from: F, reason: collision with root package name */
        public w f23870F;

        /* renamed from: G, reason: collision with root package name */
        public ContextWrapper f23871G;

        /* renamed from: H, reason: collision with root package name */
        public InterfaceC5475g f23872H;

        /* renamed from: I, reason: collision with root package name */
        public C0719e f23873I;

        /* renamed from: J, reason: collision with root package name */
        public b f23874J;

        /* renamed from: K, reason: collision with root package name */
        public D f23875K;

        /* renamed from: L, reason: collision with root package name */
        public B0.f f23876L;

        /* renamed from: M, reason: collision with root package name */
        public H6.x f23877M;

        /* renamed from: N, reason: collision with root package name */
        public h f23878N;

        /* renamed from: O, reason: collision with root package name */
        public g f23879O;

        /* renamed from: P, reason: collision with root package name */
        public final ContextThemeWrapper f23880P;

        /* renamed from: Q, reason: collision with root package name */
        public final Integer f23881Q;

        /* renamed from: R, reason: collision with root package name */
        public final j f23882R;

        /* renamed from: S, reason: collision with root package name */
        public final C5581b f23883S;

        /* renamed from: T, reason: collision with root package name */
        public final i f23884T;

        /* renamed from: U, reason: collision with root package name */
        public final Yatagan$DivKitComponent f23885U;

        /* renamed from: a, reason: collision with root package name */
        public I f23886a;

        /* renamed from: b, reason: collision with root package name */
        public d f23887b;

        /* renamed from: c, reason: collision with root package name */
        public k f23888c;

        /* renamed from: d, reason: collision with root package name */
        public p6.d f23889d;

        /* renamed from: e, reason: collision with root package name */
        public C5211b f23890e;

        /* renamed from: f, reason: collision with root package name */
        public C0683u f23891f;

        /* renamed from: g, reason: collision with root package name */
        public C0674k f23892g;

        /* renamed from: h, reason: collision with root package name */
        public H f23893h;
        public C0685w i;

        /* renamed from: j, reason: collision with root package name */
        public q f23894j;

        /* renamed from: k, reason: collision with root package name */
        public L f23895k;

        /* renamed from: l, reason: collision with root package name */
        public K f23896l;

        /* renamed from: m, reason: collision with root package name */
        public C0745n f23897m;

        /* renamed from: n, reason: collision with root package name */
        public d f23898n;

        /* renamed from: o, reason: collision with root package name */
        public F3.f f23899o;

        /* renamed from: p, reason: collision with root package name */
        public C5428e f23900p;

        /* renamed from: q, reason: collision with root package name */
        public A6.b f23901q;

        /* renamed from: r, reason: collision with root package name */
        public C5775g f23902r;

        /* renamed from: s, reason: collision with root package name */
        public C5778j f23903s;

        /* renamed from: t, reason: collision with root package name */
        public A6.b f23904t;

        /* renamed from: u, reason: collision with root package name */
        public e f23905u;

        /* renamed from: v, reason: collision with root package name */
        public C5495a f23906v;

        /* renamed from: w, reason: collision with root package name */
        public C5496b f23907w;

        /* renamed from: x, reason: collision with root package name */
        public g7.a f23908x;

        /* renamed from: y, reason: collision with root package name */
        public RenderScript f23909y;

        /* renamed from: z, reason: collision with root package name */
        public Q f23910z;

        /* compiled from: Yatagan$DivKitComponent.java */
        public static final class ComponentFactoryImpl implements Div2Component.Builder {

            /* renamed from: a, reason: collision with root package name */
            public Yatagan$DivKitComponent f23911a;

            /* renamed from: b, reason: collision with root package name */
            public ContextThemeWrapper f23912b;

            /* renamed from: c, reason: collision with root package name */
            public i f23913c;

            /* renamed from: d, reason: collision with root package name */
            public Integer f23914d;

            /* renamed from: e, reason: collision with root package name */
            public j f23915e;

            /* renamed from: f, reason: collision with root package name */
            public C5581b f23916f;

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder a(int i) {
                this.f23914d = Integer.valueOf(i);
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder b(C5581b c5581b) {
                this.f23916f = c5581b;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component build() {
                return new Div2ComponentImpl(this.f23911a, this.f23912b, this.f23913c, this.f23914d, this.f23915e, this.f23916f);
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder c(j jVar) {
                this.f23915e = jVar;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder d(i iVar) {
                this.f23913c = iVar;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public final Div2Component.Builder e(ContextThemeWrapper contextThemeWrapper) {
                this.f23912b = contextThemeWrapper;
                return this;
            }
        }

        /* compiled from: Yatagan$DivKitComponent.java */
        public static final class Div2ViewComponentImpl implements Div2ViewComponent {

            /* renamed from: a, reason: collision with root package name */
            public z f23917a;

            /* renamed from: b, reason: collision with root package name */
            public O6.I f23918b;

            /* renamed from: c, reason: collision with root package name */
            public G f23919c;

            /* renamed from: d, reason: collision with root package name */
            public c f23920d;

            /* renamed from: e, reason: collision with root package name */
            public W6.d f23921e;

            /* renamed from: f, reason: collision with root package name */
            public Q6.k f23922f;

            /* renamed from: g, reason: collision with root package name */
            public E7.b f23923g;

            /* renamed from: h, reason: collision with root package name */
            public T6.b f23924h;
            public I6.c i;

            /* renamed from: j, reason: collision with root package name */
            public final C0675l f23925j;

            /* renamed from: k, reason: collision with root package name */
            public final Div2ComponentImpl f23926k;

            /* compiled from: Yatagan$DivKitComponent.java */
            public static final class CachingProviderImpl implements O7.a {

                /* renamed from: b, reason: collision with root package name */
                public final Div2ViewComponentImpl f23927b;

                /* renamed from: c, reason: collision with root package name */
                public final int f23928c;

                /* renamed from: d, reason: collision with root package name */
                public c f23929d;

                public CachingProviderImpl(Div2ViewComponentImpl div2ViewComponentImpl, int i) {
                    this.f23927b = div2ViewComponentImpl;
                    this.f23928c = i;
                }

                @Override // a9.InterfaceC1676a
                public final Object get() {
                    c aVar;
                    c cVar = this.f23929d;
                    if (cVar != null) {
                        return cVar;
                    }
                    Div2ViewComponentImpl div2ViewComponentImpl = this.f23927b;
                    Div2ComponentImpl div2ComponentImpl = div2ViewComponentImpl.f23926k;
                    int i = this.f23928c;
                    C0675l c0675l = div2ViewComponentImpl.f23925j;
                    if (i == 0) {
                        aVar = new W6.a(c0675l, div2ComponentImpl.J());
                    } else {
                        if (i != 1) {
                            throw new AssertionError();
                        }
                        aVar = new W6.b(c0675l, div2ComponentImpl.J());
                    }
                    this.f23929d = aVar;
                    return aVar;
                }
            }

            /* compiled from: Yatagan$DivKitComponent.java */
            public static final class ComponentFactoryImpl implements Div2ViewComponent.Builder {

                /* renamed from: a, reason: collision with root package name */
                public Div2ComponentImpl f23930a;

                /* renamed from: b, reason: collision with root package name */
                public C0675l f23931b;

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public final Div2ViewComponent.Builder a(C0675l c0675l) {
                    this.f23931b = c0675l;
                    return this;
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public final Div2ViewComponent build() {
                    return new Div2ViewComponentImpl(this.f23930a, this.f23931b);
                }
            }

            public Div2ViewComponentImpl(Div2ComponentImpl div2ComponentImpl, C0675l c0675l) {
                this.f23926k = div2ComponentImpl;
                this.f23925j = c0675l;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final d a() {
                return this.f23926k.S();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final I b() {
                Div2ComponentImpl div2ComponentImpl = this.f23926k;
                I i = div2ComponentImpl.f23886a;
                if (i != null) {
                    return i;
                }
                I i10 = new I(0);
                div2ComponentImpl.f23886a = i10;
                return i10;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final I6.c c() {
                I6.c cVar = this.i;
                if (cVar != null) {
                    return cVar;
                }
                I6.c cVar2 = new I6.c(this.f23925j);
                this.i = cVar2;
                return cVar2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final Q6.k d() {
                Q6.k kVar = this.f23922f;
                if (kVar != null) {
                    return kVar;
                }
                Div2ComponentImpl div2ComponentImpl = this.f23926k;
                d dVarS = div2ComponentImpl.S();
                i iVar = div2ComponentImpl.f23884T;
                boolean z10 = iVar.f43025x;
                boolean z11 = iVar.f43002H;
                E7.b bVar = this.f23923g;
                if (bVar == null) {
                    bVar = new E7.b(3);
                    this.f23923g = bVar;
                }
                Q6.k kVar2 = new Q6.k(dVarS, this.f23925j, z10, z11, bVar);
                this.f23922f = kVar2;
                return kVar2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final T6.b e() {
                T6.b bVar = this.f23924h;
                if (bVar != null) {
                    return bVar;
                }
                T6.b bVar2 = new T6.b(this.f23925j, new B7.e(1));
                this.f23924h = bVar2;
                return bVar2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final p6.d f() {
                return this.f23926k.N();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final O6.I g() {
                O6.I i = this.f23918b;
                if (i != null) {
                    return i;
                }
                Div2ComponentImpl div2ComponentImpl = this.f23926k;
                O6.I i10 = new O6.I(this.f23925j, div2ComponentImpl.f23884T.f43010h, div2ComponentImpl.K());
                this.f23918b = i10;
                return i10;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final E7.b h() {
                E7.b bVar = this.f23923g;
                if (bVar != null) {
                    return bVar;
                }
                E7.b bVar2 = new E7.b(3);
                this.f23923g = bVar2;
                return bVar2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final G i() {
                G g10 = this.f23919c;
                if (g10 != null) {
                    return g10;
                }
                G g11 = new G();
                this.f23919c = g11;
                return g11;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final k j() {
                return this.f23926k.O();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final c k() {
                c cVar = this.f23920d;
                if (cVar == null) {
                    cVar = (c) (this.f23926k.f23884T.f42999E ? new CachingProviderImpl(this, 1).get() : new CachingProviderImpl(this, 0).get());
                    this.f23920d = cVar;
                }
                return cVar;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final W6.d l() {
                W6.d dVar = this.f23921e;
                if (dVar != null) {
                    return dVar;
                }
                W6.d dVar2 = new W6.d(this.f23925j);
                this.f23921e = dVar2;
                return dVar2;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public final z m() {
                z zVar = this.f23917a;
                if (zVar == null) {
                    Div2ComponentImpl div2ComponentImpl = this.f23926k;
                    ContextThemeWrapper contextThemeWrapper = div2ComponentImpl.f23880P;
                    I i = div2ComponentImpl.f23886a;
                    if (i == null) {
                        i = new I(0);
                        div2ComponentImpl.f23886a = i;
                    }
                    zVar = new z(contextThemeWrapper, i);
                    this.f23917a = zVar;
                }
                return zVar;
            }
        }

        /* compiled from: Yatagan$DivKitComponent.java */
        public static final class ProviderImpl implements O7.a {

            /* renamed from: b, reason: collision with root package name */
            public final Div2ComponentImpl f23932b;

            /* renamed from: c, reason: collision with root package name */
            public final int f23933c;

            public ProviderImpl(Div2ComponentImpl div2ComponentImpl, int i) {
                this.f23932b = div2ComponentImpl;
                this.f23933c = i;
            }

            @Override // a9.InterfaceC1676a
            public final Object get() {
                Div2ComponentImpl div2ComponentImpl = this.f23932b;
                int i = this.f23933c;
                if (i == 0) {
                    return div2ComponentImpl.J();
                }
                if (i != 1) {
                    if (i == 2) {
                        return div2ComponentImpl.Q();
                    }
                    div2ComponentImpl.getClass();
                    throw new AssertionError();
                }
                C0674k c0674k = div2ComponentImpl.f23892g;
                if (c0674k != null) {
                    return c0674k;
                }
                C0674k c0674k2 = new C0674k(div2ComponentImpl.Q(), div2ComponentImpl.J(), div2ComponentImpl.N());
                div2ComponentImpl.f23892g = c0674k2;
                return c0674k2;
            }
        }

        public Div2ComponentImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, ContextThemeWrapper contextThemeWrapper, i iVar, Integer num, j jVar, C5581b c5581b) {
            this.f23885U = yatagan$DivKitComponent;
            this.f23880P = contextThemeWrapper;
            this.f23884T = iVar;
            this.f23881Q = num;
            this.f23882R = jVar;
            this.f23883S = c5581b;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C5494c A() {
            C5494c c5494c = this.f23865A;
            if (c5494c != null) {
                return c5494c;
            }
            C5494c c5494c2 = new C5494c(new ProviderImpl(this.f23885U, 1));
            this.f23865A = c5494c2;
            return c5494c2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final L B() {
            return R();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final A6.b C() {
            A6.b bVar = this.f23904t;
            if (bVar != null) {
                return bVar;
            }
            A6.b bVar2 = new A6.b(this.f23884T.f43007e, V());
            this.f23904t = bVar2;
            return bVar2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final n D() {
            return this.f23884T.f43006d;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final k E() {
            return O();
        }

        public final a F() {
            a aVar = this.f23868D;
            if (aVar != null) {
                return aVar;
            }
            boolean z10 = this.f23884T.f43027z;
            a aVar2 = new a();
            aVar2.f927a = z10;
            this.f23868D = aVar2;
            return aVar2;
        }

        public final C0719e G() {
            C0719e c0719e = this.f23873I;
            if (c0719e != null) {
                return c0719e;
            }
            ProviderImpl providerImpl = new ProviderImpl(this.f23885U, 3);
            i iVar = this.f23884T;
            C0719e c0719e2 = new C0719e(providerImpl, iVar.f43020s, iVar.f43021t, iVar.f43022u);
            this.f23873I = c0719e2;
            return c0719e2;
        }

        public final C0745n H() {
            C0745n c0745n = this.f23897m;
            if (c0745n != null) {
                return c0745n;
            }
            i iVar = this.f23884T;
            C0745n c0745n2 = new C0745n(iVar.f43004b, iVar.f43005c, G(), iVar.f43023v, iVar.f43024w, iVar.f43027z);
            this.f23897m = c0745n2;
            return c0745n2;
        }

        public final D I() {
            D d10 = this.f23875K;
            if (d10 != null) {
                return d10;
            }
            i iVar = this.f23884T;
            D d11 = new D(new C0762w(iVar.f43003a), O(), new C0735j0(H()), new C0682t(iVar.f43027z, F()));
            this.f23875K = d11;
            return d11;
        }

        public final C0683u J() {
            C0683u c0683u = this.f23891f;
            if (c0683u != null) {
                return c0683u;
            }
            A a10 = this.f23869E;
            if (a10 == null) {
                a10 = new A();
                this.f23869E = a10;
            }
            A a11 = a10;
            D dI = I();
            B0.f fVarP = P();
            B0.f fVarP2 = P();
            i iVar = this.f23884T;
            y1 y1Var = new y1(dI, fVarP, new V6.k(fVarP2, iVar.f43003a), iVar.f43026y);
            S s10 = new S(I(), new ProviderImpl(this, 2), M(), new ProviderImpl(this, 0), S());
            X0 x02 = new X0(I());
            D dI2 = I();
            H6.x xVar = this.f23877M;
            Yatagan$DivKitComponent yatagan$DivKitComponent = this.f23885U;
            if (xVar == null) {
                xVar = new H6.x(iVar.f43008f, (ExecutorService) yatagan$DivKitComponent.i.f1056b);
                this.f23877M = xVar;
            }
            d dVarS = S();
            D9.G g10 = iVar.f43003a;
            C0752q0 c0752q0 = new C0752q0(dI2, g10, xVar, dVarS);
            D dI3 = I();
            H6.x xVar2 = this.f23877M;
            if (xVar2 == null) {
                xVar2 = new H6.x(iVar.f43008f, (ExecutorService) yatagan$DivKitComponent.i.f1056b);
                this.f23877M = xVar2;
            }
            C0738k0 c0738k0 = new C0738k0(dI3, g10, xVar2, S());
            C0750p0 c0750p0 = new C0750p0(I(), M(), new ProviderImpl(this, 0), new ProviderImpl(this, 2));
            L6.b bVar = new L6.b(I(), Q(), new ProviderImpl(this, 0), L(), 0.0f);
            D dI4 = I();
            H hQ = Q();
            ProviderImpl providerImpl = new ProviderImpl(this, 0);
            b bVarL = L();
            C0745n c0745nH = H();
            w wVar = this.f23870F;
            if (wVar == null) {
                wVar = new w();
                this.f23870F = wVar;
            }
            M6.i iVar2 = new M6.i(dI4, hQ, providerImpl, bVarL, c0745nH, wVar, F());
            D dI5 = I();
            H hQ2 = Q();
            ProviderImpl providerImpl2 = new ProviderImpl(this, 0);
            InterfaceC5475g interfaceC5475gX = X();
            I i = new I(iVar.f43015n);
            C0745n c0745nH2 = H();
            L lR = R();
            b bVarL2 = L();
            Context contextU = U();
            p6.d dVarN = N();
            F3.f fVar = this.f23899o;
            if (fVar == null) {
                fVar = new F3.f(11, false);
                this.f23899o = fVar;
            }
            N6.d dVar = new N6.d(dI5, hQ2, providerImpl2, interfaceC5475gX, i, c0745nH2, iVar.f43005c, iVar.f43003a, lR, bVarL2, contextU, dVarN, fVar);
            v1 v1Var = new v1(I(), Q(), new ProviderImpl(this, 0), iVar.f43007e, V(), H(), G(), M(), L(), iVar.f43005c, R(), S(), W(), N());
            C0732i0 c0732i0 = new C0732i0(I(), iVar.f43010h, K(), new ProviderImpl(this, 0));
            D dI6 = I();
            w wVar2 = this.f23870F;
            if (wVar2 == null) {
                wVar2 = new w();
                this.f23870F = wVar2;
            }
            C0757t0 c0757t0 = new C0757t0(dI6, wVar2);
            D dI7 = I();
            g gVar = this.f23879O;
            if (gVar == null) {
                gVar = new g(S(), T());
                this.f23879O = gVar;
            }
            Z0 z02 = new Z0(dI7, iVar.f43005c, iVar.f43015n, gVar, S(), 0.0f, iVar.f43025x);
            C0759u0 c0759u0 = new C0759u0(I(), P(), W(), H(), F(), S());
            V0 v02 = new V0(I(), P(), W(), S());
            D dI8 = I();
            g gVar2 = this.f23879O;
            if (gVar2 == null) {
                gVar2 = new g(S(), T());
                this.f23879O = gVar2;
            }
            g gVar3 = gVar2;
            C0745n c0745nH3 = H();
            C5778j c5778j = this.f23903s;
            if (c5778j == null) {
                c5778j = new C5778j();
                this.f23903s = c5778j;
            }
            I1 i12 = new I1(dI8, gVar3, c0745nH3, c5778j, (ExecutorService) yatagan$DivKitComponent.i.f1056b, iVar.i);
            C5211b c5211bK = K();
            w wVar3 = this.f23870F;
            if (wVar3 == null) {
                wVar3 = new w();
                this.f23870F = wVar3;
            }
            C0683u c0683u2 = new C0683u(a11, y1Var, s10, x02, c0752q0, c0738k0, c0750p0, bVar, iVar2, dVar, v1Var, c0732i0, c0757t0, z02, c0759u0, v02, i12, c5211bK, wVar3, new x1(I(), new s6.f(S(), T())));
            this.f23891f = c0683u2;
            return c0683u2;
        }

        public final C5211b K() {
            C5211b c5211b = this.f23890e;
            if (c5211b != null) {
                return c5211b;
            }
            C5211b c5211b2 = new C5211b(this.f23884T.f43013l);
            this.f23890e = c5211b2;
            return c5211b2;
        }

        public final b L() {
            b bVar = this.f23874J;
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(1);
            this.f23874J = bVar2;
            return bVar2;
        }

        public final e M() {
            e eVar = this.f23905u;
            if (eVar != null) {
                return eVar;
            }
            b bVarL = L();
            new ProviderImpl(this, 1);
            e eVar2 = new e();
            eVar2.f2291b = bVarL;
            this.f23905u = eVar2;
            return eVar2;
        }

        public final p6.d N() {
            p6.d dVar = this.f23889d;
            if (dVar == null) {
                E7.b bVar = this.f23884T.f43007e;
                d dVarV = V();
                F3.f fVar = this.f23899o;
                if (fVar == null) {
                    fVar = new F3.f(11, false);
                    this.f23899o = fVar;
                }
                dVar = new p6.d(bVar, dVarV, fVar);
                this.f23889d = dVar;
            }
            return dVar;
        }

        public final k O() {
            k kVar = this.f23888c;
            if (kVar != null) {
                return kVar;
            }
            i iVar = this.f23884T;
            Oo oo = iVar.f43012k;
            L lR = R();
            q qVar = this.f23894j;
            if (qVar == null) {
                C0685w c0685w = this.i;
                if (c0685w == null) {
                    c0685w = new C0685w(iVar.f43003a);
                    this.i = c0685w;
                }
                q qVar2 = new q(c0685w, iVar.f43010h, K(), iVar.f43011j);
                this.f23894j = qVar2;
                qVar = qVar2;
            }
            k kVar2 = new k(oo, lR, qVar, new m(new ProviderImpl(this, 1)), F(), S());
            this.f23888c = kVar2;
            return kVar2;
        }

        public final B0.f P() {
            B0.f fVar = this.f23876L;
            if (fVar != null) {
                return fVar;
            }
            i iVar = this.f23884T;
            B0.f fVar2 = new B0.f(iVar.f43016o, iVar.f43015n);
            this.f23876L = fVar2;
            return fVar2;
        }

        public final H Q() {
            H h10 = this.f23893h;
            if (h10 != null) {
                return h10;
            }
            Context contextU = U();
            InterfaceC5475g interfaceC5475gX = X();
            A a10 = this.f23869E;
            if (a10 == null) {
                a10 = new A();
                this.f23869E = a10;
            }
            A a11 = a10;
            i iVar = this.f23884T;
            C5477i c5477i = iVar.f43017p;
            C5496b c5496b = this.f23907w;
            if (c5496b == null) {
                c5496b = new C5496b(this.f23885U.f23862h, iVar.f43017p);
                this.f23907w = c5496b;
            }
            H h11 = new H(contextU, interfaceC5475gX, a11, c5477i, c5496b);
            this.f23893h = h11;
            return h11;
        }

        public final L R() {
            L l5 = this.f23895k;
            if (l5 == null) {
                B7.e eVar = new B7.e(1);
                K k10 = this.f23896l;
                if (k10 == null) {
                    i iVar = this.f23884T;
                    k10 = new K(iVar.f43005c, iVar.f43009g, iVar.f43004b, G());
                    this.f23896l = k10;
                }
                l5 = new L(eVar, k10);
                this.f23895k = l5;
            }
            return l5;
        }

        public final d S() {
            d dVar = this.f23887b;
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d(0);
            this.f23887b = dVar2;
            return dVar2;
        }

        public final C5428e T() {
            C5428e c5428e = this.f23900p;
            if (c5428e != null) {
                return c5428e;
            }
            C0745n c0745nH = H();
            d dVarS = S();
            g.a aVar = this.f23884T.f43005c;
            C5494c c5494c = this.f23865A;
            if (c5494c == null) {
                c5494c = new C5494c(new ProviderImpl(this.f23885U, 1));
                this.f23865A = c5494c;
            }
            C5428e c5428e2 = new C5428e(this.f23883S, c0745nH, dVarS, aVar, c5494c);
            this.f23900p = c5428e2;
            return c5428e2;
        }

        public final Context U() {
            ContextWrapper contextWrapper = this.f23871G;
            if (contextWrapper != null) {
                return contextWrapper;
            }
            int iIntValue = this.f23881Q.intValue();
            boolean z10 = this.f23884T.f42998D;
            ContextThemeWrapper contextThemeWrapper = this.f23880P;
            ContextWrapper c5815a = z10 ? new C5815a(contextThemeWrapper, iIntValue) : new ContextThemeWrapper(contextThemeWrapper, iIntValue);
            this.f23871G = c5815a;
            return c5815a;
        }

        public final d V() {
            d dVar = this.f23898n;
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d(1);
            this.f23898n = dVar2;
            return dVar2;
        }

        public final h W() {
            h hVar = this.f23878N;
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h(S(), T());
            this.f23878N = hVar2;
            return hVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final InterfaceC5475g X() {
            Object obj;
            InterfaceC5475g c5469a = this.f23872H;
            if (c5469a == null) {
                boolean z10 = this.f23884T.f42995A;
                I i = this.f23884T.f42996B ? new I(new O7.b(new C5476h(this.f23884T.f43018q)), 10) : new I(O7.b.f10478b, 10);
                C5495a c5495a = this.f23906v;
                if (c5495a == null) {
                    boolean z11 = this.f23884T.f42997C;
                    c5495a = new C5495a();
                    this.f23906v = c5495a;
                }
                Yatagan$DivKitComponent yatagan$DivKitComponent = this.f23885U;
                Object obj2 = yatagan$DivKitComponent.f23857c;
                if (obj2 instanceof UninitializedLock) {
                    synchronized (obj2) {
                        try {
                            obj = yatagan$DivKitComponent.f23857c;
                            if (obj instanceof UninitializedLock) {
                                ((s) yatagan$DivKitComponent.i.f1057c).getClass();
                                Object value = ((p) e7.j.f37745a.a().f583c).getValue();
                                l.e(value, "histogramConfiguration.g…geHistogramReporter.get()");
                                C5473e c5473e = new C5473e((InterfaceC4322a) value);
                                yatagan$DivKitComponent.f23857c = c5473e;
                                obj = c5473e;
                            }
                        } finally {
                        }
                    }
                    obj2 = obj;
                }
                c5469a = z10 ? new C5469a((C5476h) ((O7.b) i.f2053c).f10479a, c5495a, (C5473e) obj2) : new B7.e(7);
                this.f23872H = c5469a;
            }
            return c5469a;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final d a() {
            return S();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final g7.a b() {
            g7.a aVar = this.f23908x;
            if (aVar != null) {
                return aVar;
            }
            this.f23885U.c();
            g7.a aVar2 = new g7.a(b.a.f37956a);
            this.f23908x = aVar2;
            return aVar2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final boolean c() {
            this.f23884T.getClass();
            return false;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C5775g d() {
            C5775g c5775g = this.f23902r;
            if (c5775g == null) {
                C5778j c5778j = this.f23903s;
                if (c5778j == null) {
                    c5778j = new C5778j();
                    this.f23903s = c5778j;
                }
                c5775g = new C5775g(c5778j);
                this.f23902r = c5775g;
            }
            return c5775g;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C1475a e() {
            C1475a c1475a = this.f23866B;
            if (c1475a == null) {
                RenderScript renderScriptCreateMultiContext = this.f23909y;
                if (renderScriptCreateMultiContext == null) {
                    RenderScript.ContextType contextType = RenderScript.ContextType.NORMAL;
                    ContextThemeWrapper contextThemeWrapper = this.f23880P;
                    renderScriptCreateMultiContext = RenderScript.createMultiContext(contextThemeWrapper, contextType, 0, contextThemeWrapper.getApplicationInfo().targetSdkVersion);
                    this.f23909y = renderScriptCreateMultiContext;
                }
                c1475a = new C1475a(renderScriptCreateMultiContext);
                this.f23866B = c1475a;
            }
            return c1475a;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final d f() {
            return V();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C5235n g() {
            Object c5235n;
            Yatagan$DivKitComponent yatagan$DivKitComponent = this.f23885U;
            Object obj = yatagan$DivKitComponent.f23855a;
            if (obj instanceof UninitializedLock) {
                synchronized (obj) {
                    try {
                        c5235n = yatagan$DivKitComponent.f23855a;
                        if (c5235n instanceof UninitializedLock) {
                            c5235n = new C5235n(yatagan$DivKitComponent.h());
                            yatagan$DivKitComponent.f23855a = c5235n;
                        }
                    } finally {
                    }
                }
                obj = c5235n;
            }
            return (C5235n) obj;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final K h() {
            K k10 = this.f23896l;
            if (k10 != null) {
                return k10;
            }
            i iVar = this.f23884T;
            K k11 = new K(iVar.f43005c, iVar.f43009g, iVar.f43004b, G());
            this.f23896l = k11;
            return k11;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final j i() {
            return this.f23882R;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C0674k j() {
            C0674k c0674k = this.f23892g;
            if (c0674k != null) {
                return c0674k;
            }
            C0674k c0674k2 = new C0674k(Q(), J(), N());
            this.f23892g = c0674k2;
            return c0674k2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C0745n k() {
            return H();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final boolean l() {
            return Boolean.valueOf(this.f23884T.f43001G).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final A6.b m() {
            A6.b bVar = this.f23901q;
            if (bVar != null) {
                return bVar;
            }
            A6.b bVar2 = new A6.b(H(), S());
            this.f23901q = bVar2;
            return bVar2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C5581b n() {
            return this.f23883S;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final H o() {
            return Q();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C5495a p() {
            C5495a c5495a = this.f23906v;
            if (c5495a != null) {
                return c5495a;
            }
            boolean z10 = this.f23884T.f42997C;
            C5495a c5495a2 = new C5495a();
            this.f23906v = c5495a2;
            return c5495a2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final j6.g q() {
            return this.f23884T.f43005c;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final boolean r() {
            return Boolean.valueOf(this.f23884T.f43000F).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final InterfaceC5328a s() {
            return this.f23884T.f43014m;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C5428e t() {
            return T();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final j6.k u() {
            return new j6.k();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C0683u v() {
            return J();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final Q w() {
            Q q10 = this.f23910z;
            if (q10 != null) {
                return q10;
            }
            Q q11 = new Q(T());
            this.f23910z = q11;
            return q11;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final x x() {
            x xVar = this.f23867C;
            if (xVar != null) {
                return xVar;
            }
            C0685w c0685w = this.i;
            i iVar = this.f23884T;
            if (c0685w == null) {
                c0685w = new C0685w(iVar.f43003a);
                this.i = c0685w;
            }
            x xVar2 = new x(c0685w, iVar.f43010h, K(), iVar.f43011j);
            this.f23867C = xVar2;
            return xVar2;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final Div2ViewComponent.Builder y() {
            Div2ViewComponentImpl.ComponentFactoryImpl componentFactoryImpl = new Div2ViewComponentImpl.ComponentFactoryImpl();
            componentFactoryImpl.f23930a = this;
            return componentFactoryImpl;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public final C5496b z() {
            C5496b c5496b = this.f23907w;
            if (c5496b != null) {
                return c5496b;
            }
            C5496b c5496b2 = new C5496b(this.f23885U.f23862h, this.f23884T.f43017p);
            this.f23907w = c5496b2;
            return c5496b2;
        }
    }

    /* compiled from: Yatagan$DivKitComponent.java */
    public static final class ProviderImpl implements O7.a {

        /* renamed from: b, reason: collision with root package name */
        public final Yatagan$DivKitComponent f23934b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23935c;

        public ProviderImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, int i) {
            this.f23934b = yatagan$DivKitComponent;
            this.f23935c = i;
        }

        @Override // a9.InterfaceC1676a
        public final Object get() {
            Object iVar;
            Yatagan$DivKitComponent yatagan$DivKitComponent = this.f23934b;
            int i = this.f23935c;
            if (i == 0) {
                yatagan$DivKitComponent.c();
                return b.a.f37956a;
            }
            if (i == 1) {
                return yatagan$DivKitComponent.e();
            }
            if (i == 2) {
                return (ExecutorService) yatagan$DivKitComponent.i.f1056b;
            }
            if (i == 3) {
                return yatagan$DivKitComponent.g();
            }
            if (i == 4) {
                return yatagan$DivKitComponent.f();
            }
            if (i != 5) {
                yatagan$DivKitComponent.getClass();
                throw new AssertionError();
            }
            Object obj = yatagan$DivKitComponent.f23861g;
            if (obj instanceof UninitializedLock) {
                synchronized (obj) {
                    try {
                        iVar = yatagan$DivKitComponent.f23861g;
                        if (iVar instanceof UninitializedLock) {
                            iVar = new e7.i();
                            yatagan$DivKitComponent.f23861g = iVar;
                        }
                    } finally {
                    }
                }
                obj = iVar;
            }
            return (e7.i) obj;
        }
    }

    /* compiled from: Yatagan$DivKitComponent.java */
    public static final class UninitializedLock {
    }

    public Yatagan$DivKitComponent(Context context, f fVar) {
        this.f23862h = context;
        this.i = fVar;
    }

    public static DivKitComponent.Builder builder() {
        return new ComponentFactoryImpl();
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public final e7.l a() {
        ((s) this.i.f1057c).getClass();
        j.a aVar = e7.j.f37745a;
        l.e(aVar, "histogramConfiguration.get()");
        return aVar;
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public final Div2Component.Builder b() {
        Div2ComponentImpl.ComponentFactoryImpl componentFactoryImpl = new Div2ComponentImpl.ComponentFactoryImpl();
        componentFactoryImpl.f23911a = this;
        return componentFactoryImpl;
    }

    public final g7.b c() {
        ((s) this.i.f1057c).getClass();
        l.e(e7.j.f37745a, "histogramConfiguration.get()");
        return b.a.f37956a;
    }

    public final e7.f d() {
        Object obj;
        Object obj2 = this.f23860f;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.f23860f;
                    if (obj instanceof UninitializedLock) {
                        ((s) this.i.f1057c).getClass();
                        l.e(e7.j.f37745a, "histogramConfiguration.get()");
                        e7.f.f37740a.getClass();
                        obj = (e7.f) f.a.f37742b.getValue();
                        this.f23860f = obj;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (e7.f) obj2;
    }

    public final F7.c e() {
        Object objZ;
        Object obj = this.f23856b;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objZ = this.f23856b;
                    if (objZ instanceof UninitializedLock) {
                        this.i.getClass();
                        I i = new I(O7.b.f10478b, 10);
                        Context context = this.f23862h;
                        c();
                        objZ = C5606d.z(i, context, b.a.f37956a, d());
                        this.f23856b = objZ;
                    }
                } finally {
                }
            }
            obj = objZ;
        }
        return (F7.c) obj;
    }

    public final e7.m f() {
        Object obj;
        Object obj2 = this.f23859e;
        if (obj2 instanceof UninitializedLock) {
            synchronized (obj2) {
                try {
                    obj = this.f23859e;
                    if (obj instanceof UninitializedLock) {
                        ((s) this.i.f1057c).getClass();
                        e7.m mVar = new e7.m((e7.g) ((p) e7.j.f37745a.b().f583c).getValue());
                        this.f23859e = mVar;
                        obj = mVar;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (e7.m) obj2;
    }

    public final C4418a g() {
        Object obj;
        Object obj2 = this.f23858d;
        if (s.n(obj2)) {
            synchronized (obj2) {
                try {
                    obj = this.f23858d;
                    if (s.n(obj)) {
                        Context context = this.f23862h;
                        this.i.getClass();
                        l.f(context, "context");
                        l.f(null, "executor");
                        l.f(null, "executor");
                        throw null;
                    }
                } finally {
                }
            }
            obj2 = obj;
        }
        return (C4418a) obj2;
    }

    public final HashSet h() {
        HashSet hashSet = new HashSet(15);
        hashSet.add(new C5221A());
        hashSet.add(new C5226e());
        hashSet.add(new C5229h());
        hashSet.add(new C5230i());
        hashSet.add(new C5232k());
        hashSet.add(new C5233l());
        hashSet.add(new C5237p());
        hashSet.add(new C5238q());
        hashSet.add(new C5239r());
        hashSet.add(new C5242u());
        hashSet.add(new C5240s());
        hashSet.add(new C5243v());
        ((C4356c) this.i.f1058d).getClass();
        hashSet.add(new C5244w(u.f43061a));
        hashSet.add(new C5245x());
        hashSet.add(new C5247z());
        return hashSet;
    }
}

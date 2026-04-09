package androidx.compose.foundation.relocation;

import C0.r;
import E0.A;
import E0.A0;
import E0.AbstractC2633k;
import Ii.AbstractC3063k;
import Ii.N;
import Ii.O;
import Yg.J;
import Yg.v;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class f extends e.c implements D.a, A, A0 {

    /* renamed from: q, reason: collision with root package name */
    public static final a f28405q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f28406r = 8;

    /* renamed from: n, reason: collision with root package name */
    private D.c f28407n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f28408o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f28409p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28410a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28411b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f28413d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f28414e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f28415f;

        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f28416a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f28417b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r f28418c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f28419d;

            /* renamed from: androidx.compose.foundation.relocation.f$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1052a extends C6490p implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ f f28420a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ r f28421b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC6824a f28422c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1052a(f fVar, r rVar, InterfaceC6824a interfaceC6824a) {
                    super(0, AbstractC6492s.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f28420a = fVar;
                    this.f28421b = rVar;
                    this.f28422c = interfaceC6824a;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C6533i invoke() {
                    return f.E2(this.f28420a, this.f28421b, this.f28422c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, r rVar, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f28417b = fVar;
                this.f28418c = rVar;
                this.f28419d = interfaceC6824a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f28417b, this.f28418c, this.f28419d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f28416a;
                if (i10 == 0) {
                    v.b(obj);
                    D.c cVarF2 = this.f28417b.F2();
                    C1052a c1052a = new C1052a(this.f28417b, this.f28418c, this.f28419d);
                    this.f28416a = 1;
                    if (cVarF2.K0(c1052a, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: androidx.compose.foundation.relocation.f$b$b, reason: collision with other inner class name */
        static final class C1053b extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f28423a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f28424b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f28425c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1053b(f fVar, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f28424b = fVar;
                this.f28425c = interfaceC6824a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C1053b(this.f28424b, this.f28425c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                D.a aVarC;
                Object objG = AbstractC5467b.g();
                int i10 = this.f28423a;
                if (i10 == 0) {
                    v.b(obj);
                    if (this.f28424b.k2() && (aVarC = androidx.compose.foundation.relocation.b.c(this.f28424b)) != null) {
                        r rVarK = AbstractC2633k.k(this.f28424b);
                        InterfaceC6824a interfaceC6824a = this.f28425c;
                        this.f28423a = 1;
                        if (aVarC.r1(rVarK, interfaceC6824a, this) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1053b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f28413d = rVar;
            this.f28414e = interfaceC6824a;
            this.f28415f = interfaceC6824a2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = f.this.new b(this.f28413d, this.f28414e, this.f28415f, interfaceC5380e);
            bVar.f28411b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f28410a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            N n10 = (N) this.f28411b;
            AbstractC3063k.d(n10, null, null, new a(f.this, this.f28413d, this.f28414e, null), 3, null);
            return AbstractC3063k.d(n10, null, null, new C1053b(f.this, this.f28415f, null), 3, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f28427b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f28428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r rVar, InterfaceC6824a interfaceC6824a) {
            super(0);
            this.f28427b = rVar;
            this.f28428c = interfaceC6824a;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6533i invoke() {
            C6533i c6533iE2 = f.E2(f.this, this.f28427b, this.f28428c);
            if (c6533iE2 != null) {
                return f.this.F2().w0(c6533iE2);
            }
            return null;
        }
    }

    public f(D.c cVar) {
        this.f28407n = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6533i E2(f fVar, r rVar, InterfaceC6824a interfaceC6824a) {
        C6533i c6533i;
        if (!fVar.k2() || !fVar.f28409p) {
            return null;
        }
        r rVarK = AbstractC2633k.k(fVar);
        if (!rVar.M()) {
            rVar = null;
        }
        if (rVar == null || (c6533i = (C6533i) interfaceC6824a.invoke()) == null) {
            return null;
        }
        return d.c(rVarK, rVar, c6533i);
    }

    public final D.c F2() {
        return this.f28407n;
    }

    @Override // E0.A0
    public Object W() {
        return f28405q;
    }

    @Override // E0.A
    public void Y1(r rVar) {
        this.f28409p = true;
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f28408o;
    }

    @Override // D.a
    public Object r1(r rVar, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new b(rVar, interfaceC6824a, new c(rVar, interfaceC6824a), null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }
}

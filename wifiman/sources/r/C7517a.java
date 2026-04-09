package r;

import T.InterfaceC3551q0;
import T.t1;
import T.z1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7517a {

    /* renamed from: m, reason: collision with root package name */
    public static final int f59558m = 8;

    /* renamed from: a, reason: collision with root package name */
    private final s0 f59559a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f59560b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59561c;

    /* renamed from: d, reason: collision with root package name */
    private final C7536k f59562d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f59563e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3551q0 f59564f;

    /* renamed from: g, reason: collision with root package name */
    private final Z f59565g;

    /* renamed from: h, reason: collision with root package name */
    private final C7532h0 f59566h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC7542q f59567i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC7542q f59568j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC7542q f59569k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC7542q f59570l;

    /* renamed from: r.a$a, reason: collision with other inner class name */
    static final class C2082a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        Object f59571a;

        /* renamed from: b, reason: collision with root package name */
        Object f59572b;

        /* renamed from: c, reason: collision with root package name */
        int f59573c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f59575e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC7523d f59576f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f59577g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f59578h;

        /* renamed from: r.a$a$a, reason: collision with other inner class name */
        static final class C2083a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7517a f59579a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7536k f59580b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f59581c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.J f59582d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2083a(C7517a c7517a, C7536k c7536k, InterfaceC6835l interfaceC6835l, kotlin.jvm.internal.J j10) {
                super(1);
                this.f59579a = c7517a;
                this.f59580b = c7536k;
                this.f59581c = interfaceC6835l;
                this.f59582d = j10;
            }

            public final void a(C7531h c7531h) {
                m0.o(c7531h, this.f59579a.j());
                Object objH = this.f59579a.h(c7531h.e());
                if (AbstractC6492s.d(objH, c7531h.e())) {
                    InterfaceC6835l interfaceC6835l = this.f59581c;
                    if (interfaceC6835l != null) {
                        interfaceC6835l.invoke(this.f59579a);
                        return;
                    }
                    return;
                }
                this.f59579a.j().v(objH);
                this.f59580b.v(objH);
                InterfaceC6835l interfaceC6835l2 = this.f59581c;
                if (interfaceC6835l2 != null) {
                    interfaceC6835l2.invoke(this.f59579a);
                }
                c7531h.a();
                this.f59582d.f51685a = true;
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C7531h) obj);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2082a(Object obj, InterfaceC7523d interfaceC7523d, long j10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(1, interfaceC5380e);
            this.f59575e = obj;
            this.f59576f = interfaceC7523d;
            this.f59577g = j10;
            this.f59578h = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
            return C7517a.this.new C2082a(this.f59575e, this.f59576f, this.f59577g, this.f59578h, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C7536k c7536k;
            kotlin.jvm.internal.J j10;
            Object objG = AbstractC5467b.g();
            int i10 = this.f59573c;
            try {
                if (i10 == 0) {
                    Yg.v.b(obj);
                    C7517a.this.j().w((AbstractC7542q) C7517a.this.l().a().invoke(this.f59575e));
                    C7517a.this.s(this.f59576f.g());
                    C7517a.this.r(true);
                    C7536k c7536kH = AbstractC7537l.h(C7517a.this.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    kotlin.jvm.internal.J j11 = new kotlin.jvm.internal.J();
                    InterfaceC7523d interfaceC7523d = this.f59576f;
                    long j12 = this.f59577g;
                    C2083a c2083a = new C2083a(C7517a.this, c7536kH, this.f59578h, j11);
                    this.f59571a = c7536kH;
                    this.f59572b = j11;
                    this.f59573c = 1;
                    if (m0.c(c7536kH, interfaceC7523d, j12, c2083a, this) == objG) {
                        return objG;
                    }
                    c7536k = c7536kH;
                    j10 = j11;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = (kotlin.jvm.internal.J) this.f59572b;
                    c7536k = (C7536k) this.f59571a;
                    Yg.v.b(obj);
                }
                EnumC7525e enumC7525e = j10.f51685a ? EnumC7525e.BoundReached : EnumC7525e.Finished;
                C7517a.this.i();
                return new C7529g(c7536k, enumC7525e);
            } catch (CancellationException e10) {
                C7517a.this.i();
                throw e10;
            }
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5380e interfaceC5380e) {
            return ((C2082a) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: r.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        int f59583a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f59585c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, InterfaceC5380e interfaceC5380e) {
            super(1, interfaceC5380e);
            this.f59585c = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
            return C7517a.this.new b(this.f59585c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f59583a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            C7517a.this.i();
            Object objH = C7517a.this.h(this.f59585c);
            C7517a.this.j().v(objH);
            C7517a.this.s(objH);
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: r.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        int f59586a;

        c(InterfaceC5380e interfaceC5380e) {
            super(1, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
            return C7517a.this.new c(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f59586a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            C7517a.this.i();
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5380e interfaceC5380e) {
            return ((c) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public C7517a(Object obj, s0 s0Var, Object obj2, String str) {
        this.f59559a = s0Var;
        this.f59560b = obj2;
        this.f59561c = str;
        this.f59562d = new C7536k(s0Var, obj, null, 0L, 0L, false, 60, null);
        this.f59563e = t1.d(Boolean.FALSE, null, 2, null);
        this.f59564f = t1.d(obj, null, 2, null);
        this.f59565g = new Z();
        this.f59566h = new C7532h0(0.0f, 0.0f, obj2, 3, null);
        AbstractC7542q abstractC7542qO = o();
        AbstractC7542q abstractC7542q = abstractC7542qO instanceof C7538m ? AbstractC7519b.f59592e : abstractC7542qO instanceof C7539n ? AbstractC7519b.f59593f : abstractC7542qO instanceof C7540o ? AbstractC7519b.f59594g : AbstractC7519b.f59595h;
        AbstractC6492s.g(abstractC7542q, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f59567i = abstractC7542q;
        AbstractC7542q abstractC7542qO2 = o();
        AbstractC7542q abstractC7542q2 = abstractC7542qO2 instanceof C7538m ? AbstractC7519b.f59588a : abstractC7542qO2 instanceof C7539n ? AbstractC7519b.f59589b : abstractC7542qO2 instanceof C7540o ? AbstractC7519b.f59590c : AbstractC7519b.f59591d;
        AbstractC6492s.g(abstractC7542q2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f59568j = abstractC7542q2;
        this.f59569k = abstractC7542q;
        this.f59570l = abstractC7542q2;
    }

    public static /* synthetic */ Object f(C7517a c7517a, Object obj, InterfaceC7533i interfaceC7533i, Object obj2, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            interfaceC7533i = c7517a.f59566h;
        }
        InterfaceC7533i interfaceC7533i2 = interfaceC7533i;
        if ((i10 & 4) != 0) {
            obj2 = c7517a.n();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            interfaceC6835l = null;
        }
        return c7517a.e(obj, interfaceC7533i2, obj4, interfaceC6835l, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(Object obj) {
        if (AbstractC6492s.d(this.f59569k, this.f59567i) && AbstractC6492s.d(this.f59570l, this.f59568j)) {
            return obj;
        }
        AbstractC7542q abstractC7542q = (AbstractC7542q) this.f59559a.a().invoke(obj);
        int iB = abstractC7542q.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < iB; i10++) {
            if (abstractC7542q.a(i10) < this.f59569k.a(i10) || abstractC7542q.a(i10) > this.f59570l.a(i10)) {
                abstractC7542q.e(i10, AbstractC7978m.j(abstractC7542q.a(i10), this.f59569k.a(i10), this.f59570l.a(i10)));
                z10 = true;
            }
        }
        return z10 ? this.f59559a.b().invoke(abstractC7542q) : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        C7536k c7536k = this.f59562d;
        c7536k.q().d();
        c7536k.t(Long.MIN_VALUE);
        r(false);
    }

    private final Object q(InterfaceC7523d interfaceC7523d, Object obj, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return Z.e(this.f59565g, null, new C2082a(obj, interfaceC7523d, this.f59562d.i(), interfaceC6835l, null), interfaceC5380e, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z10) {
        this.f59563e.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Object obj) {
        this.f59564f.setValue(obj);
    }

    public final Object e(Object obj, InterfaceC7533i interfaceC7533i, Object obj2, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return q(AbstractC7527f.a(interfaceC7533i, this.f59559a, m(), obj, obj2), obj2, interfaceC6835l, interfaceC5380e);
    }

    public final z1 g() {
        return this.f59562d;
    }

    public final C7536k j() {
        return this.f59562d;
    }

    public final Object k() {
        return this.f59564f.getValue();
    }

    public final s0 l() {
        return this.f59559a;
    }

    public final Object m() {
        return this.f59562d.getValue();
    }

    public final Object n() {
        return this.f59559a.b().invoke(o());
    }

    public final AbstractC7542q o() {
        return this.f59562d.q();
    }

    public final boolean p() {
        return ((Boolean) this.f59563e.getValue()).booleanValue();
    }

    public final Object t(Object obj, InterfaceC5380e interfaceC5380e) {
        Object objE = Z.e(this.f59565g, null, new b(obj, null), interfaceC5380e, 1, null);
        return objE == AbstractC5467b.g() ? objE : Yg.J.f24997a;
    }

    public final Object u(InterfaceC5380e interfaceC5380e) {
        Object objE = Z.e(this.f59565g, null, new c(null), interfaceC5380e, 1, null);
        return objE == AbstractC5467b.g() ? objE : Yg.J.f24997a;
    }

    public /* synthetic */ C7517a(Object obj, s0 s0Var, Object obj2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, s0Var, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ C7517a(Object obj, s0 s0Var, Object obj2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, s0Var, (i10 & 4) != 0 ? null : obj2);
    }

    public /* synthetic */ C7517a(Object obj, s0 s0Var, Object obj2) {
        this(obj, s0Var, obj2, "Animatable");
    }
}

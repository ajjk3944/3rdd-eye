package N;

import c0.AbstractC4183l;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.InterfaceC7533i;

/* renamed from: N.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3335n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14621d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f14622e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7533i f14623a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14624b;

    /* renamed from: c, reason: collision with root package name */
    private final C3310b f14625c;

    /* renamed from: N.n0$a */
    public static final class a {

        /* renamed from: N.n0$a$a, reason: collision with other inner class name */
        static final class C0560a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            public static final C0560a f14626a = new C0560a();

            C0560a() {
                super(2);
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EnumC3337o0 invoke(InterfaceC4184m interfaceC4184m, C3335n0 c3335n0) {
                return c3335n0.e();
            }
        }

        /* renamed from: N.n0$a$b */
        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Y0.d f14627a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f14628b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC7533i f14629c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f14630d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Y0.d dVar, InterfaceC6835l interfaceC6835l, InterfaceC7533i interfaceC7533i, boolean z10) {
                super(1);
                this.f14627a = dVar;
                this.f14628b = interfaceC6835l;
                this.f14629c = interfaceC7533i;
                this.f14630d = z10;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3335n0 invoke(EnumC3337o0 enumC3337o0) {
                return new C3335n0(enumC3337o0, this.f14627a, this.f14628b, this.f14629c, this.f14630d);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a(InterfaceC7533i interfaceC7533i, InterfaceC6835l interfaceC6835l, boolean z10, Y0.d dVar) {
            return AbstractC4183l.a(C0560a.f14626a, new b(dVar, interfaceC6835l, interfaceC7533i, z10));
        }

        private a() {
        }
    }

    /* renamed from: N.n0$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14631a;

        static {
            int[] iArr = new int[EnumC3337o0.values().length];
            try {
                iArr[EnumC3337o0.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14631a = iArr;
        }
    }

    /* renamed from: N.n0$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y0.d f14632a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Y0.d dVar) {
            super(1);
            this.f14632a = dVar;
        }

        public final Float a(float f10) {
            return Float.valueOf(this.f14632a.d1(AbstractC3333m0.f14551a));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    /* renamed from: N.n0$d */
    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y0.d f14633a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Y0.d dVar) {
            super(0);
            this.f14633a = dVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f14633a.d1(AbstractC3333m0.f14552b));
        }
    }

    public C3335n0(EnumC3337o0 enumC3337o0, Y0.d dVar, InterfaceC6835l interfaceC6835l, InterfaceC7533i interfaceC7533i, boolean z10) {
        this.f14623a = interfaceC7533i;
        this.f14624b = z10;
        this.f14625c = new C3310b(enumC3337o0, new c(dVar), new d(dVar), interfaceC7533i, interfaceC6835l);
        if (z10 && enumC3337o0 == EnumC3337o0.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public static /* synthetic */ Object b(C3335n0 c3335n0, EnumC3337o0 enumC3337o0, float f10, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = c3335n0.f14625c.v();
        }
        return c3335n0.a(enumC3337o0, f10, interfaceC5380e);
    }

    public final Object a(EnumC3337o0 enumC3337o0, float f10, InterfaceC5380e interfaceC5380e) throws Throwable {
        Object objF = androidx.compose.material.a.f(this.f14625c, enumC3337o0, f10, interfaceC5380e);
        return objF == AbstractC5467b.g() ? objF : Yg.J.f24997a;
    }

    public final Object c(InterfaceC5380e interfaceC5380e) {
        Object objB;
        D dO = this.f14625c.o();
        EnumC3337o0 enumC3337o0 = EnumC3337o0.Expanded;
        return (dO.f(enumC3337o0) && (objB = b(this, enumC3337o0, 0.0f, interfaceC5380e, 2, null)) == AbstractC5467b.g()) ? objB : Yg.J.f24997a;
    }

    public final C3310b d() {
        return this.f14625c;
    }

    public final EnumC3337o0 e() {
        return (EnumC3337o0) this.f14625c.s();
    }

    public final boolean f() {
        return this.f14625c.o().f(EnumC3337o0.HalfExpanded);
    }

    public final EnumC3337o0 g() {
        return (EnumC3337o0) this.f14625c.x();
    }

    public final Object h(InterfaceC5380e interfaceC5380e) {
        Object objB;
        return (f() && (objB = b(this, EnumC3337o0.HalfExpanded, 0.0f, interfaceC5380e, 2, null)) == AbstractC5467b.g()) ? objB : Yg.J.f24997a;
    }

    public final Object i(InterfaceC5380e interfaceC5380e) {
        Object objB = b(this, EnumC3337o0.Hidden, 0.0f, interfaceC5380e, 2, null);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }

    public final boolean j() {
        return this.f14624b;
    }

    public final boolean k() {
        return this.f14625c.s() != EnumC3337o0.Hidden;
    }

    public final Object l(InterfaceC5380e interfaceC5380e) {
        D dO = this.f14625c.o();
        EnumC3337o0 enumC3337o0 = EnumC3337o0.Expanded;
        boolean zF = dO.f(enumC3337o0);
        if (b.f14631a[e().ordinal()] == 1) {
            if (f()) {
                enumC3337o0 = EnumC3337o0.HalfExpanded;
            }
        } else if (!zF) {
            enumC3337o0 = EnumC3337o0.Hidden;
        }
        Object objB = b(this, enumC3337o0, 0.0f, interfaceC5380e, 2, null);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }
}

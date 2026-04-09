package w;

import Ii.N;
import Ii.O;
import T.InterfaceC3551q0;
import T.t1;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s.EnumC7839L;
import s.M;

/* loaded from: classes.dex */
final class i implements y {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f63915a;

    /* renamed from: b, reason: collision with root package name */
    private final v f63916b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final M f63917c = new M();

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f63918d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f63919e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3551q0 f63920f;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63921a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC7839L f63923c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f63924d;

        /* renamed from: w.i$a$a, reason: collision with other inner class name */
        static final class C2275a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f63925a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f63926b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f63927c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f63928d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2275a(i iVar, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f63927c = iVar;
                this.f63928d = interfaceC6839p;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C2275a c2275a = new C2275a(this.f63927c, this.f63928d, interfaceC5380e);
                c2275a.f63926b = obj;
                return c2275a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f63925a;
                try {
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        v vVar = (v) this.f63926b;
                        this.f63927c.f63918d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        InterfaceC6839p interfaceC6839p = this.f63928d;
                        this.f63925a = 1;
                        if (interfaceC6839p.invoke(vVar, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    this.f63927c.f63918d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    return J.f24997a;
                } catch (Throwable th2) {
                    this.f63927c.f63918d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v vVar, InterfaceC5380e interfaceC5380e) {
                return ((C2275a) create(vVar, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63923c = enumC7839L;
            this.f63924d = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return i.this.new a(this.f63923c, this.f63924d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f63921a;
            if (i10 == 0) {
                Yg.v.b(obj);
                M m10 = i.this.f63917c;
                v vVar = i.this.f63916b;
                EnumC7839L enumC7839L = this.f63923c;
                C2275a c2275a = new C2275a(i.this, this.f63924d, null);
                this.f63921a = 1;
                if (m10.f(vVar, enumC7839L, c2275a, this) == objG) {
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

    public static final class b implements v {
        b() {
        }

        @Override // w.v
        public float a(float f10) {
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            float fFloatValue = ((Number) i.this.l().invoke(Float.valueOf(f10))).floatValue();
            i.this.f63919e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            i.this.f63920f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    public i(InterfaceC6835l interfaceC6835l) {
        this.f63915a = interfaceC6835l;
        Boolean bool = Boolean.FALSE;
        this.f63918d = t1.d(bool, null, 2, null);
        this.f63919e = t1.d(bool, null, 2, null);
        this.f63920f = t1.d(bool, null, 2, null);
    }

    @Override // w.y
    public boolean a() {
        return ((Boolean) this.f63918d.getValue()).booleanValue();
    }

    @Override // w.y
    public Object c(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new a(enumC7839L, interfaceC6839p, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    @Override // w.y
    public float f(float f10) {
        return ((Number) this.f63915a.invoke(Float.valueOf(f10))).floatValue();
    }

    public final InterfaceC6835l l() {
        return this.f63915a;
    }
}

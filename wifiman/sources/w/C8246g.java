package w;

import Ii.N;
import Ii.O;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s.EnumC7839L;
import s.M;

/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8246g implements m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f63894a;

    /* renamed from: b, reason: collision with root package name */
    private final k f63895b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final M f63896c = new M();

    /* renamed from: w.g$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63897a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC7839L f63899c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f63900d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63899c = enumC7839L;
            this.f63900d = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C8246g.this.new a(this.f63899c, this.f63900d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f63897a;
            if (i10 == 0) {
                Yg.v.b(obj);
                M m10 = C8246g.this.f63896c;
                k kVar = C8246g.this.f63895b;
                EnumC7839L enumC7839L = this.f63899c;
                InterfaceC6839p interfaceC6839p = this.f63900d;
                this.f63897a = 1;
                if (m10.f(kVar, enumC7839L, interfaceC6839p, this) == objG) {
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

    /* renamed from: w.g$b */
    public static final class b implements k {
        b() {
        }

        @Override // w.k
        public void a(float f10) {
            C8246g.this.e().invoke(Float.valueOf(f10));
        }
    }

    public C8246g(InterfaceC6835l interfaceC6835l) {
        this.f63894a = interfaceC6835l;
    }

    @Override // w.m
    public Object a(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new a(enumC7839L, interfaceC6839p, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    public final InterfaceC6835l e() {
        return this.f63894a;
    }
}

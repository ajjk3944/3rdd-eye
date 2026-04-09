package T;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import T.InterfaceC3530g0;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
final class Y0 implements InterfaceC3530g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0 f20993a = new Y0();

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f20994a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f20995b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f20995b = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f20995b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f20994a;
            if (i10 == 0) {
                Yg.v.b(obj);
                this.f20994a = 1;
                if (Ii.Y.a(16L, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return this.f20995b.invoke(kotlin.coroutines.jvm.internal.b.e(System.nanoTime()));
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    private Y0() {
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
        return InterfaceC3530g0.a.a(this, obj, interfaceC6839p);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return InterfaceC3530g0.a.b(this, cVar);
    }

    @Override // T.InterfaceC3530g0
    public Object j(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.c(), new a(interfaceC6835l, null), interfaceC5380e);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return InterfaceC3530g0.a.c(this, cVar);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return InterfaceC3530g0.a.d(this, interfaceC5384i);
    }
}

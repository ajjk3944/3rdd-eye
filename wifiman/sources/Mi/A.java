package Mi;

import Li.InterfaceC3221h;
import Yg.J;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
final class A implements InterfaceC3221h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5384i f13225a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13226b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6839p f13227c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13228a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13229b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221h f13230c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13230c = interfaceC3221h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f13230c, interfaceC5380e);
            aVar.f13229b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f13228a;
            if (i10 == 0) {
                Yg.v.b(obj);
                Object obj2 = this.f13229b;
                InterfaceC3221h interfaceC3221h = this.f13230c;
                this.f13228a = 1;
                if (interfaceC3221h.a(obj2, this) == objG) {
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
        public final Object invoke(Object obj, InterfaceC5380e interfaceC5380e) {
            return ((a) create(obj, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public A(InterfaceC3221h interfaceC3221h, InterfaceC5384i interfaceC5384i) {
        this.f13225a = interfaceC5384i;
        this.f13226b = Ni.J.g(interfaceC5384i);
        this.f13227c = new a(interfaceC3221h, null);
    }

    @Override // Li.InterfaceC3221h
    public Object a(Object obj, InterfaceC5380e interfaceC5380e) {
        Object objB = e.b(this.f13225a, obj, this.f13226b, this.f13227c, interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : J.f24997a;
    }
}

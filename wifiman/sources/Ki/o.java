package Ki;

import Ii.AbstractC3061j;
import Ii.N;
import Ki.k;
import Yg.J;
import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
abstract /* synthetic */ class o {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f10879a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10880b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f10881c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f10882d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w wVar, Object obj, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f10881c = wVar;
            this.f10882d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f10881c, this.f10882d, interfaceC5380e);
            aVar.f10880b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objC;
            Object objG = AbstractC5467b.g();
            int i10 = this.f10879a;
            try {
                if (i10 == 0) {
                    Yg.v.b(obj);
                    w wVar = this.f10881c;
                    Object obj2 = this.f10882d;
                    u.a aVar = Yg.u.f25017b;
                    this.f10879a = 1;
                    if (wVar.b(obj2, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                objC = Yg.u.c(J.f24997a);
            } catch (Throwable th2) {
                u.a aVar2 = Yg.u.f25017b;
                objC = Yg.u.c(Yg.v.a(th2));
            }
            return k.b(Yg.u.m(objC) ? k.f10873b.c(J.f24997a) : k.f10873b.a(Yg.u.h(objC)));
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final Object a(w wVar, Object obj) {
        Object objK = wVar.k(obj);
        if (objK instanceof k.c) {
            return ((k) AbstractC3061j.b(null, new a(wVar, obj, null), 1, null)).l();
        }
        return k.f10873b.c(J.f24997a);
    }
}

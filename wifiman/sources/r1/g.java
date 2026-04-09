package R1;

import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class g {

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f19550a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19551b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f19552c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f19552c = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f19552c, interfaceC5380e);
            aVar.f19551b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f19550a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a aVar = (R1.a) this.f19551b;
                v.b(obj);
                return aVar;
            }
            v.b(obj);
            R1.a aVarC = ((d) this.f19551b).c();
            InterfaceC6839p interfaceC6839p = this.f19552c;
            this.f19551b = aVarC;
            this.f19550a = 1;
            return interfaceC6839p.invoke(aVarC, this) == objG ? objG : aVarC;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, InterfaceC5380e interfaceC5380e) {
            return ((a) create(dVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final Object a(O1.e eVar, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        return eVar.a(new a(interfaceC6839p, null), interfaceC5380e);
    }
}

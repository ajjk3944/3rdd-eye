package R1;

import Li.InterfaceC3220g;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class b implements O1.e {

    /* renamed from: a, reason: collision with root package name */
    private final O1.e f19543a;

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f19544a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19545b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f19546c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f19546c = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f19546c, interfaceC5380e);
            aVar.f19545b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f19544a;
            if (i10 == 0) {
                v.b(obj);
                d dVar = (d) this.f19545b;
                InterfaceC6839p interfaceC6839p = this.f19546c;
                this.f19544a = 1;
                obj = interfaceC6839p.invoke(dVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            d dVar2 = (d) obj;
            ((R1.a) dVar2).f();
            return dVar2;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, InterfaceC5380e interfaceC5380e) {
            return ((a) create(dVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public b(O1.e delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f19543a = delegate;
    }

    @Override // O1.e
    public Object a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        return this.f19543a.a(new a(interfaceC6839p, null), interfaceC5380e);
    }

    @Override // O1.e
    public InterfaceC3220g b() {
        return this.f19543a.b();
    }
}

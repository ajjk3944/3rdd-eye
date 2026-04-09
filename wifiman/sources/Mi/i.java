package Mi;

import Ii.AbstractC3063k;
import Ii.N;
import Li.InterfaceC3220g;
import Yg.J;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class i extends d {

    /* renamed from: d, reason: collision with root package name */
    private final Iterable f13269d;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13270a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f13271b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f13272c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3220g interfaceC3220g, x xVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f13271b = interfaceC3220g;
            this.f13272c = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f13271b, this.f13272c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f13270a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3220g interfaceC3220g = this.f13271b;
                x xVar = this.f13272c;
                this.f13270a = 1;
                if (interfaceC3220g.b(xVar, this) == objG) {
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

    public /* synthetic */ i(Iterable iterable, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i11 & 2) != 0 ? C5385j.f46088a : interfaceC5384i, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Ki.a.SUSPEND : aVar);
    }

    @Override // Mi.d
    protected Object g(Ki.t tVar, InterfaceC5380e interfaceC5380e) {
        x xVar = new x(tVar);
        Iterator it = this.f13269d.iterator();
        while (it.hasNext()) {
            AbstractC3063k.d(tVar, null, null, new a((InterfaceC3220g) it.next(), xVar, null), 3, null);
        }
        return J.f24997a;
    }

    @Override // Mi.d
    protected d i(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return new i(this.f13269d, interfaceC5384i, i10, aVar);
    }

    @Override // Mi.d
    public Ki.v o(N n10) {
        return Ki.r.c(n10, this.f13236a, this.f13237b, m());
    }

    public i(Iterable iterable, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        super(interfaceC5384i, i10, aVar);
        this.f13269d = iterable;
    }
}

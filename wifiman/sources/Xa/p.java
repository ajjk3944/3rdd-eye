package xa;

import Ii.N;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class p implements o {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8439a f65541b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f65542c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f65543a;

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return p.this.new a(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f65543a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8439a interfaceC8439a = p.this.f65541b;
                this.f65543a = 1;
                if (interfaceC8439a.a(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public p(InterfaceC8439a coroutinesCatalog) {
        AbstractC6492s.i(coroutinesCatalog, "coroutinesCatalog");
        this.f65541b = coroutinesCatalog;
        gg.i iVarI2 = Qi.i.c(coroutinesCatalog.b(), null, 1, null).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f65542c = iVarI2;
    }

    @Override // xa.o
    public AbstractC5912b a() {
        return Qi.g.c(null, new a(null), 1, null);
    }

    @Override // xa.o
    public gg.i b() {
        return this.f65542c;
    }
}

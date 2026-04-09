package T;

import Ii.C3073p;
import T.InterfaceC3530g0;
import Yg.u;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: T.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3532h implements InterfaceC3530g0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6824a f21078a;

    /* renamed from: c, reason: collision with root package name */
    private Throwable f21080c;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21079b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private List f21081d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private List f21082e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final C3529g f21083f = new C3529g(0);

    /* renamed from: T.h$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6835l f21084a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5380e f21085b;

        public a(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            this.f21084a = interfaceC6835l;
            this.f21085b = interfaceC5380e;
        }

        public final InterfaceC5380e a() {
            return this.f21085b;
        }

        public final void b(long j10) {
            Object objC;
            InterfaceC5380e interfaceC5380e = this.f21085b;
            try {
                u.a aVar = Yg.u.f25017b;
                objC = Yg.u.c(this.f21084a.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                u.a aVar2 = Yg.u.f25017b;
                objC = Yg.u.c(Yg.v.a(th2));
            }
            interfaceC5380e.resumeWith(objC);
        }
    }

    /* renamed from: T.h$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f21087b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.f21087b = aVar;
        }

        public final void a(Throwable th2) {
            Object obj = C3532h.this.f21079b;
            C3532h c3532h = C3532h.this;
            a aVar = this.f21087b;
            synchronized (obj) {
                try {
                    c3532h.f21081d.remove(aVar);
                    if (c3532h.f21081d.isEmpty()) {
                        c3532h.f21083f.set(0);
                    }
                    Yg.J j10 = Yg.J.f24997a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    public C3532h(InterfaceC6824a interfaceC6824a) {
        this.f21078a = interfaceC6824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Throwable th2) {
        synchronized (this.f21079b) {
            try {
                if (this.f21080c != null) {
                    return;
                }
                this.f21080c = th2;
                List list = this.f21081d;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC5380e interfaceC5380eA = ((a) list.get(i10)).a();
                    u.a aVar = Yg.u.f25017b;
                    interfaceC5380eA.resumeWith(Yg.u.c(Yg.v.a(th2)));
                }
                this.f21081d.clear();
                this.f21083f.set(0);
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
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
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        a aVar = new a(interfaceC6835l, c3073p);
        synchronized (this.f21079b) {
            Throwable th2 = this.f21080c;
            if (th2 != null) {
                u.a aVar2 = Yg.u.f25017b;
                c3073p.resumeWith(Yg.u.c(Yg.v.a(th2)));
            } else {
                boolean zIsEmpty = this.f21081d.isEmpty();
                this.f21081d.add(aVar);
                if (zIsEmpty) {
                    this.f21083f.set(1);
                }
                c3073p.B(new b(aVar));
                if (zIsEmpty && this.f21078a != null) {
                    try {
                        this.f21078a.invoke();
                    } catch (Throwable th3) {
                        i(th3);
                    }
                }
            }
        }
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    public final boolean k() {
        return this.f21083f.get() != 0;
    }

    public final void l(long j10) {
        synchronized (this.f21079b) {
            try {
                List list = this.f21081d;
                this.f21081d = this.f21082e;
                this.f21082e = list;
                this.f21083f.set(0);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((a) list.get(i10)).b(j10);
                }
                list.clear();
                Yg.J j11 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
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

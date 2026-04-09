package Ti;

import Ii.C3073p;
import Ii.InterfaceC3069n;
import Ii.S;
import Ii.a1;
import Ii.r;
import Ni.z;
import Ti.f;
import Yg.J;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import f.AbstractC5487d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mh.InterfaceC6835l;
import mh.q;

/* loaded from: classes4.dex */
public class f extends i implements Ti.a {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22026i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* renamed from: h, reason: collision with root package name */
    private final q f22027h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements InterfaceC3069n, a1 {

        /* renamed from: a, reason: collision with root package name */
        public final C3073p f22028a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f22029b;

        public a(C3073p c3073p, Object obj) {
            this.f22028a = c3073p;
            this.f22029b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J e(f fVar, a aVar, Throwable th2) {
            fVar.d(aVar.f22029b);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J h(f fVar, a aVar, Throwable th2, J j10, InterfaceC5384i interfaceC5384i) {
            f.x().set(fVar, aVar.f22029b);
            fVar.d(aVar.f22029b);
            return J.f24997a;
        }

        @Override // Ii.InterfaceC3069n
        public void B(InterfaceC6835l interfaceC6835l) {
            this.f22028a.B(interfaceC6835l);
        }

        @Override // Ii.InterfaceC3069n
        public void C0(Object obj) {
            this.f22028a.C0(obj);
        }

        @Override // Ii.a1
        public void b(z zVar, int i10) {
            this.f22028a.b(zVar, i10);
        }

        @Override // Ii.InterfaceC3069n
        public boolean cancel(Throwable th2) {
            return this.f22028a.cancel(th2);
        }

        @Override // Ii.InterfaceC3069n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b0(J j10, q qVar) {
            f.x().set(f.this, this.f22029b);
            C3073p c3073p = this.f22028a;
            final f fVar = f.this;
            c3073p.M(j10, new InterfaceC6835l() { // from class: Ti.e
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return f.a.e(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // Ii.InterfaceC3069n
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void J(Ii.J j10, J j11) {
            this.f22028a.J(j10, j11);
        }

        @Override // Ii.InterfaceC3069n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object p(J j10, Object obj, q qVar) {
            final f fVar = f.this;
            Object objP = this.f22028a.p(j10, obj, new q() { // from class: Ti.d
                @Override // mh.q
                public final Object s(Object obj2, Object obj3, Object obj4) {
                    return f.a.h(fVar, this, (Throwable) obj2, (J) obj3, (InterfaceC5384i) obj4);
                }
            });
            if (objP != null) {
                f.x().set(f.this, this.f22029b);
            }
            return objP;
        }

        @Override // dh.InterfaceC5380e
        public InterfaceC5384i getContext() {
            return this.f22028a.getContext();
        }

        @Override // Ii.InterfaceC3069n
        public boolean isCompleted() {
            return this.f22028a.isCompleted();
        }

        @Override // Ii.InterfaceC3069n
        public Object r(Throwable th2) {
            return this.f22028a.r(th2);
        }

        @Override // dh.InterfaceC5380e
        public void resumeWith(Object obj) {
            this.f22028a.resumeWith(obj);
        }
    }

    public f(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : g.f22031a;
        this.f22027h = new q() { // from class: Ti.b
            @Override // mh.q
            public final Object s(Object obj, Object obj2, Object obj3) {
                f fVar = this.f22019a;
                AbstractC5487d.a(obj);
                return f.B(fVar, null, obj2, obj3);
            }
        };
    }

    private final Object A(Object obj, InterfaceC5380e interfaceC5380e) {
        C3073p c3073pB = r.b(AbstractC5467b.d(interfaceC5380e));
        try {
            f(new a(c3073pB, obj));
            Object objU = c3073pB.u();
            if (objU == AbstractC5467b.g()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
            }
            return objU == AbstractC5467b.g() ? objU : J.f24997a;
        } catch (Throwable th2) {
            c3073pB.K();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q B(final f fVar, Si.e eVar, final Object obj, Object obj2) {
        return new q() { // from class: Ti.c
            @Override // mh.q
            public final Object s(Object obj3, Object obj4, Object obj5) {
                return f.C(this.f22020a, obj, (Throwable) obj3, obj4, (InterfaceC5384i) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J C(f fVar, Object obj, Throwable th2, Object obj2, InterfaceC5384i interfaceC5384i) {
        fVar.d(obj);
        return J.f24997a;
    }

    private final int D(Object obj) {
        while (!r()) {
            if (obj == null) {
                return 1;
            }
            int iY = y(obj);
            if (iY == 1) {
                return 2;
            }
            if (iY == 2) {
                return 1;
            }
        }
        f22026i.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater x() {
        return f22026i;
    }

    private final int y(Object obj) {
        while (c()) {
            Object obj2 = f22026i.get(this);
            if (obj2 != g.f22031a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object z(f fVar, Object obj, InterfaceC5380e interfaceC5380e) {
        Object objA;
        return (!fVar.b(obj) && (objA = fVar.A(obj, interfaceC5380e)) == AbstractC5467b.g()) ? objA : J.f24997a;
    }

    @Override // Ti.a
    public Object a(Object obj, InterfaceC5380e interfaceC5380e) {
        return z(this, obj, interfaceC5380e);
    }

    @Override // Ti.a
    public boolean b(Object obj) {
        int iD = D(obj);
        if (iD == 0) {
            return true;
        }
        if (iD == 1) {
            return false;
        }
        if (iD != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // Ti.a
    public boolean c() {
        return j() == 0;
    }

    @Override // Ti.a
    public void d(Object obj) {
        while (c()) {
            Object obj2 = f22026i.get(this);
            if (obj2 != g.f22031a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f22026i, this, obj2, g.f22031a)) {
                    q();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + S.b(this) + "[isLocked=" + c() + ",owner=" + f22026i.get(this) + ']';
    }
}

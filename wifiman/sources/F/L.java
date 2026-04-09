package F;

import I.InterfaceC2948o;
import Li.AbstractC3222i;
import T.z1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final z1 f4916a;

    /* renamed from: b, reason: collision with root package name */
    private final J f4917b = new J(new c(this));

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2948o f4918c = new InterfaceC2948o() { // from class: F.K
        @Override // I.InterfaceC2948o
        public final int a(int i10, int i11) {
            return L.c(this.f4915a, i10, i11);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private final androidx.compose.ui.e f4919d = androidx.compose.ui.focus.b.a(androidx.compose.ui.e.f28771b0, new a());

    /* renamed from: e, reason: collision with root package name */
    private final Ki.g f4920e = Ki.j.b(MPv3.MAX_MESSAGE_ID, null, null, 6, null);

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(k0.l lVar) {
            if (lVar.isFocused()) {
                return;
            }
            L.this.f().d();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k0.l) obj);
            return Yg.J.f24997a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f4922a;

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return L.this.new b(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f4922a;
            if (i10 == 0) {
                Yg.v.b(obj);
                this.f4922a = 1;
                if (Ii.Y.a(1500L, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            L.this.f().d();
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Yg.J j10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(j10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* synthetic */ class c extends C6490p implements InterfaceC6824a {
        c(Object obj) {
            super(0, obj, L.class, "scheduleHide", "scheduleHide()V", 0);
        }

        public final void a() {
            ((L) this.receiver).h();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public L(z1 z1Var) {
        this.f4916a = z1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(L l10, int i10, int i11) {
        return i10 == l10.f4917b.c() ? i11 : ((Character) l10.f4916a.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        if (Ki.k.i(this.f4920e.k(Yg.J.f24997a))) {
            this.f4917b.d();
        }
    }

    public final InterfaceC2948o d() {
        return this.f4918c;
    }

    public final androidx.compose.ui.e e() {
        return this.f4919d;
    }

    public final J f() {
        return this.f4917b;
    }

    public final Object g(InterfaceC5380e interfaceC5380e) {
        Object objI = AbstractC3222i.i(AbstractC3222i.m(this.f4920e), new b(null), interfaceC5380e);
        return objI == AbstractC5467b.g() ? objI : Yg.J.f24997a;
    }
}

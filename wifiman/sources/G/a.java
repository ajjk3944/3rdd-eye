package G;

import E0.AbstractC2635m;
import E0.s0;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import k0.InterfaceC6354b;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import w.o;
import y0.AbstractC8576P;
import y0.C8593n;
import y0.EnumC8595p;
import y0.InterfaceC8567G;
import y0.InterfaceC8578S;
import y0.InterfaceC8581b;

/* loaded from: classes.dex */
public class a extends AbstractC2635m implements s0, InterfaceC6354b {

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC6824a f6739p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6740q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC8578S f6741r = (InterfaceC8578S) D2(AbstractC8576P.a(new C0272a(null)));

    /* renamed from: G.a$a, reason: collision with other inner class name */
    static final class C0272a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f6742a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f6743b;

        /* renamed from: G.a$a$a, reason: collision with other inner class name */
        static final class C0273a extends k implements InterfaceC6839p {

            /* renamed from: b, reason: collision with root package name */
            Object f6745b;

            /* renamed from: c, reason: collision with root package name */
            Object f6746c;

            /* renamed from: d, reason: collision with root package name */
            int f6747d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f6748e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f6749f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0273a(a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f6749f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C0273a c0273a = new C0273a(this.f6749f, interfaceC5380e);
                c0273a.f6748e = obj;
                return c0273a;
            }

            /* JADX WARN: Path cross not found for [B:58:0x0138, B:56:0x0123], limit reached: 91 */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e9 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0180 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x018e  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x01b8  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x01c2  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x01b3 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x011d A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e7 -> B:42:0x00ea). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x017e -> B:69:0x0181). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 453
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G.a.C0272a.C0273a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                return ((C0273a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        C0272a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            C0272a c0272a = a.this.new C0272a(interfaceC5380e);
            c0272a.f6743b = obj;
            return c0272a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f6742a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f6743b;
                C0273a c0273a = new C0273a(a.this, null);
                this.f6742a = 1;
                if (o.d(interfaceC8567G, c0273a, this) == objG) {
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
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((C0272a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public a(InterfaceC6824a interfaceC6824a) {
        this.f6739p = interfaceC6824a;
    }

    @Override // E0.s0
    public void C0() {
        this.f6741r.C0();
    }

    @Override // k0.InterfaceC6354b
    public void J1(k0.l lVar) {
        this.f6740q = lVar.isFocused();
    }

    public final InterfaceC6824a K2() {
        return this.f6739p;
    }

    public final void L2(InterfaceC6824a interfaceC6824a) {
        this.f6739p = interfaceC6824a;
    }

    public final void Z1() {
        this.f6741r.Z1();
    }

    @Override // E0.s0
    public void s0(C8593n c8593n, EnumC8595p enumC8595p, long j10) {
        this.f6741r.s0(c8593n, enumC8595p, j10);
    }
}

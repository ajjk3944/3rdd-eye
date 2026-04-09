package A8;

import Ii.C3073p;
import Ii.InterfaceC3069n;
import Yg.J;
import Yg.u;
import com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import hg.InterfaceC6043c;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;

/* renamed from: A8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2412d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2412d f374a = new C2412d();

    /* renamed from: A8.d$a */
    static final class a implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6043c f375a;

        a(InterfaceC6043c interfaceC6043c) {
            this.f375a = interfaceC6043c;
        }

        public final void a(Throwable th2) {
            this.f375a.dispose();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    /* renamed from: A8.d$b */
    static final class b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f376a;

        b(InterfaceC3069n interfaceC3069n) {
            this.f376a = interfaceC3069n;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(z controller) {
            AbstractC6492s.i(controller, "controller");
            InterfaceC3069n interfaceC3069n = this.f376a;
            u.a aVar = Yg.u.f25017b;
            interfaceC3069n.resumeWith(Yg.u.c(new C2411c(controller)));
        }
    }

    /* renamed from: A8.d$c */
    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f377a;

        c(InterfaceC3069n interfaceC3069n) {
            this.f377a = interfaceC3069n;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (error instanceof WifimanFloorplanViewControllerManager.Error) {
                Z7.b.e("Failed to load controller", error, null, 4, null);
                this.f377a.resumeWith(Yg.u.c(null));
            } else {
                InterfaceC3069n interfaceC3069n = this.f377a;
                u.a aVar = Yg.u.f25017b;
                interfaceC3069n.resumeWith(Yg.u.c(Yg.v.a(error)));
            }
        }
    }

    /* renamed from: A8.d$d, reason: collision with other inner class name */
    static final class C0010d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        long f378a;

        /* renamed from: b, reason: collision with root package name */
        Object f379b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f380c;

        /* renamed from: e, reason: collision with root package name */
        int f382e;

        C0010d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f380c = obj;
            this.f382e |= PduHandle.NONE;
            return C2412d.this.b(0L, null, null, this);
        }
    }

    private C2412d() {
    }

    public final Object a(long j10, WifimanFloorplanViewControllerManager wifimanFloorplanViewControllerManager, InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        InterfaceC6043c interfaceC6043cM = wifimanFloorplanViewControllerManager.c(j10).M(new b(c3073p), new c(c3073p));
        AbstractC6492s.h(interfaceC6043cM, "subscribe(...)");
        c3073p.B(new a(interfaceC6043cM));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r20, android.content.Context r22, com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager r23, dh.InterfaceC5380e r24) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r24
            boolean r4 = r3 instanceof A8.C2412d.C0010d
            if (r4 == 0) goto L19
            r4 = r3
            A8.d$d r4 = (A8.C2412d.C0010d) r4
            int r5 = r4.f382e
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.f382e = r5
            goto L1e
        L19:
            A8.d$d r4 = new A8.d$d
            r4.<init>(r3)
        L1e:
            java.lang.Object r3 = r4.f380c
            java.lang.Object r5 = eh.AbstractC5467b.g()
            int r6 = r4.f382e
            r7 = 1
            r8 = 2
            r9 = 0
            if (r6 == 0) goto L51
            if (r6 == r7) goto L42
            if (r6 != r8) goto L39
            long r1 = r4.f378a
            java.lang.Object r4 = r4.f379b
            android.content.Context r4 = (android.content.Context) r4
            Yg.v.b(r3)
            goto L7f
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L42:
            long r1 = r4.f378a
            java.lang.Object r6 = r4.f379b
            android.content.Context r6 = (android.content.Context) r6
            Yg.v.b(r3)
            r18 = r6
            r6 = r3
            r3 = r18
            goto L65
        L51:
            Yg.v.b(r3)
            r3 = r22
            r4.f379b = r3
            r4.f378a = r1
            r4.f382e = r7
            r6 = r23
            java.lang.Object r6 = r0.a(r1, r6, r4)
            if (r6 != r5) goto L65
            return r5
        L65:
            Ue.g r6 = (Ue.g) r6
            if (r6 == 0) goto L82
            r4.f379b = r3
            r4.f378a = r1
            r4.f382e = r8
            r7 = 1024(0x400, float:1.435E-42)
            r10 = 576(0x240, float:8.07E-43)
            java.lang.Object r4 = r6.c(r7, r10, r4)
            if (r4 != r5) goto L7a
            return r5
        L7a:
            r18 = r4
            r4 = r3
            r3 = r18
        L7f:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            goto L84
        L82:
            r4 = r3
            r3 = r9
        L84:
            if (r3 == 0) goto Laf
            L8.h r1 = L8.h.f11265a
            java.io.File r9 = L8.h.b(r1, r4, r9, r8, r9)
            B8.a$a r1 = B8.a.f1224a
            B8.a r1 = r1.a()
            B8.b r2 = new B8.b
            r16 = 15
            r17 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r2
            r15 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            android.graphics.Bitmap r1 = r1.a(r4, r2)
            L8.a.a(r1, r9)
            r1.recycle()
            r3.recycle()
            goto Lc5
        Laf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate floorplan controller "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2 = 6
            Z7.b.e(r1, r9, r9, r2, r9)
        Lc5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: A8.C2412d.b(long, android.content.Context, com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager, dh.e):java.lang.Object");
    }
}

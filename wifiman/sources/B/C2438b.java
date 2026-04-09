package B;

import Yg.u;
import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* renamed from: B.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2438b implements C0.J {

    /* renamed from: a, reason: collision with root package name */
    private boolean f927a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC5380e f928b;

    /* renamed from: B.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f929a;

        /* renamed from: b, reason: collision with root package name */
        Object f930b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f931c;

        /* renamed from: e, reason: collision with root package name */
        int f933e;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f931c = obj;
            this.f933e |= PduHandle.NONE;
            return C2438b.this.a(this);
        }
    }

    @Override // C0.J
    public void B(C0.r rVar) {
        if (this.f927a) {
            return;
        }
        this.f927a = true;
        InterfaceC5380e interfaceC5380e = this.f928b;
        if (interfaceC5380e != null) {
            u.a aVar = Yg.u.f25017b;
            interfaceC5380e.resumeWith(Yg.u.c(Yg.J.f24997a));
        }
        this.f928b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(dh.InterfaceC5380e r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof B.C2438b.a
            if (r0 == 0) goto L13
            r0 = r5
            B.b$a r0 = (B.C2438b.a) r0
            int r1 = r0.f933e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f933e = r1
            goto L18
        L13:
            B.b$a r0 = new B.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f931c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f933e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f930b
            dh.e r1 = (dh.InterfaceC5380e) r1
            java.lang.Object r0 = r0.f929a
            B.b r0 = (B.C2438b) r0
            Yg.v.b(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            Yg.v.b(r5)
            boolean r5 = r4.f927a
            if (r5 != 0) goto L71
            dh.e r5 = r4.f928b
            r0.f929a = r4
            r0.f930b = r5
            r0.f933e = r3
            dh.k r2 = new dh.k
            dh.e r3 = eh.AbstractC5467b.d(r0)
            r2.<init>(r3)
            r4.f928b = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = eh.AbstractC5467b.g()
            if (r2 != r3) goto L60
            kotlin.coroutines.jvm.internal.h.c(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            Yg.u$a r5 = Yg.u.f25017b
            Yg.J r5 = Yg.J.f24997a
            java.lang.Object r5 = Yg.u.c(r5)
            r1.resumeWith(r5)
        L71:
            Yg.J r5 = Yg.J.f24997a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C2438b.a(dh.e):java.lang.Object");
    }
}

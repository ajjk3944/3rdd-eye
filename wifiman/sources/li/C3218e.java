package Li;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* renamed from: Li.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3218e implements InterfaceC3220g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3220g f11907a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6835l f11908b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC6839p f11909c;

    /* renamed from: Li.e$a */
    static final class a implements InterfaceC3221h {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f11911b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3221h f11912c;

        /* renamed from: Li.e$a$a, reason: collision with other inner class name */
        static final class C0469a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f11913a;

            /* renamed from: c, reason: collision with root package name */
            int f11915c;

            C0469a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f11913a = obj;
                this.f11915c |= PduHandle.NONE;
                return a.this.a(null, this);
            }
        }

        a(kotlin.jvm.internal.N n10, InterfaceC3221h interfaceC3221h) {
            this.f11911b = n10;
            this.f11912c = interfaceC3221h;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Li.InterfaceC3221h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.lang.Object r6, dh.InterfaceC5380e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Li.C3218e.a.C0469a
                if (r0 == 0) goto L13
                r0 = r7
                Li.e$a$a r0 = (Li.C3218e.a.C0469a) r0
                int r1 = r0.f11915c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f11915c = r1
                goto L18
            L13:
                Li.e$a$a r0 = new Li.e$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f11913a
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f11915c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Yg.v.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                Yg.v.b(r7)
                Li.e r7 = Li.C3218e.this
                mh.l r7 = r7.f11908b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.N r2 = r5.f11911b
                java.lang.Object r2 = r2.f51689a
                Ni.C r4 = Mi.r.f13298a
                if (r2 == r4) goto L58
                Li.e r4 = Li.C3218e.this
                mh.p r4 = r4.f11909c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                Yg.J r6 = Yg.J.f24997a
                return r6
            L58:
                kotlin.jvm.internal.N r2 = r5.f11911b
                r2.f51689a = r7
                Li.h r7 = r5.f11912c
                r0.f11915c = r3
                java.lang.Object r6 = r7.a(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                Yg.J r6 = Yg.J.f24997a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.C3218e.a.a(java.lang.Object, dh.e):java.lang.Object");
        }
    }

    public C3218e(InterfaceC3220g interfaceC3220g, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p) {
        this.f11907a = interfaceC3220g;
        this.f11908b = interfaceC6835l;
        this.f11909c = interfaceC6839p;
    }

    @Override // Li.InterfaceC3220g
    public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        n10.f51689a = Mi.r.f13298a;
        Object objB = this.f11907a.b(new a(n10, interfaceC3221h), interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }
}

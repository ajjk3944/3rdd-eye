package O;

import dh.InterfaceC5380e;
import l0.AbstractC6532h;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import x0.InterfaceC8412a;

/* loaded from: classes.dex */
final class f implements InterfaceC8412a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f16696a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6839p f16697b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16698c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        float f16699a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16700b;

        /* renamed from: d, reason: collision with root package name */
        int f16702d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16700b = obj;
            this.f16702d |= PduHandle.NONE;
            return f.this.R(0L, this);
        }
    }

    public f(InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p, boolean z10) {
        this.f16696a = interfaceC6835l;
        this.f16697b = interfaceC6839p;
        this.f16698c = z10;
    }

    @Override // x0.InterfaceC8412a
    public long L1(long j10, long j11, int i10) {
        return !this.f16698c ? C6531g.f52335b.c() : (!x0.e.d(i10, x0.e.f65322a.b()) || C6531g.n(j11) <= 0.0f) ? C6531g.f52335b.c() : AbstractC6532h.a(0.0f, ((Number) this.f16696a.invoke(Float.valueOf(C6531g.n(j11)))).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // x0.InterfaceC8412a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object R(long r5, dh.InterfaceC5380e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof O.f.a
            if (r0 == 0) goto L13
            r0 = r7
            O.f$a r0 = (O.f.a) r0
            int r1 = r0.f16702d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16702d = r1
            goto L18
        L13:
            O.f$a r0 = new O.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16700b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f16702d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r5 = r0.f16699a
            Yg.v.b(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            Yg.v.b(r7)
            mh.p r7 = r4.f16697b
            float r5 = Y0.y.i(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.c(r5)
            r6 = 0
            r0.f16699a = r6
            r0.f16702d = r3
            java.lang.Object r7 = r7.invoke(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r6
        L4d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = Y0.z.a(r5, r6)
            Y0.y r5 = Y0.y.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O.f.R(long, dh.e):java.lang.Object");
    }

    @Override // x0.InterfaceC8412a
    public long V0(long j10, int i10) {
        return !this.f16698c ? C6531g.f52335b.c() : (!x0.e.d(i10, x0.e.f65322a.b()) || C6531g.n(j10) >= 0.0f) ? C6531g.f52335b.c() : AbstractC6532h.a(0.0f, ((Number) this.f16696a.invoke(Float.valueOf(C6531g.n(j10)))).floatValue());
    }
}

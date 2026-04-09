package w;

import Ti.a;
import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class s implements r, Y0.d {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Y0.d f64001a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f64002b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f64003c;

    /* renamed from: d, reason: collision with root package name */
    private final Ti.a f64004d = Ti.g.a(false);

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f64005a;

        /* renamed from: c, reason: collision with root package name */
        int f64007c;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f64005a = obj;
            this.f64007c |= PduHandle.NONE;
            return s.this.F1(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f64008a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f64009b;

        /* renamed from: d, reason: collision with root package name */
        int f64011d;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f64009b = obj;
            this.f64011d |= PduHandle.NONE;
            return s.this.q(this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f64012a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f64013b;

        /* renamed from: d, reason: collision with root package name */
        int f64015d;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f64013b = obj;
            this.f64015d |= PduHandle.NONE;
            return s.this.q0(this);
        }
    }

    public s(Y0.d dVar) {
        this.f64001a = dVar;
    }

    @Override // Y0.d
    public long F0(float f10) {
        return this.f64001a.F0(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // w.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object F1(dh.InterfaceC5380e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof w.s.a
            if (r0 == 0) goto L13
            r0 = r5
            w.s$a r0 = (w.s.a) r0
            int r1 = r0.f64007c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64007c = r1
            goto L18
        L13:
            w.s$a r0 = new w.s$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f64005a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f64007c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Yg.v.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            Yg.v.b(r5)
            r0.f64007c = r3
            java.lang.Object r5 = r4.q0(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            Yg.J r5 = Yg.J.f24997a
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w.s.F1(dh.e):java.lang.Object");
    }

    @Override // Y0.d
    public long K1(long j10) {
        return this.f64001a.K1(j10);
    }

    @Override // Y0.d
    public float N0(float f10) {
        return this.f64001a.N0(f10);
    }

    @Override // Y0.d
    public float N1(long j10) {
        return this.f64001a.N1(j10);
    }

    public final void b() {
        this.f64003c = true;
        a.C0811a.c(this.f64004d, null, 1, null);
    }

    @Override // Y0.d
    public float d1(float f10) {
        return this.f64001a.d1(f10);
    }

    @Override // Y0.l
    public long e0(float f10) {
        return this.f64001a.e0(f10);
    }

    @Override // Y0.d
    public long f0(long j10) {
        return this.f64001a.f0(j10);
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f64001a.getDensity();
    }

    @Override // Y0.l
    public float n0(long j10) {
        return this.f64001a.n0(j10);
    }

    public final void p() {
        this.f64002b = true;
        a.C0811a.c(this.f64004d, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(dh.InterfaceC5380e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof w.s.b
            if (r0 == 0) goto L13
            r0 = r5
            w.s$b r0 = (w.s.b) r0
            int r1 = r0.f64011d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64011d = r1
            goto L18
        L13:
            w.s$b r0 = new w.s$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f64009b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f64011d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f64008a
            w.s r0 = (w.s) r0
            Yg.v.b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            Yg.v.b(r5)
            Ti.a r5 = r4.f64004d
            r0.f64008a = r4
            r0.f64011d = r3
            r2 = 0
            java.lang.Object r5 = Ti.a.C0811a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.f64002b = r5
            r0.f64003c = r5
            Yg.J r5 = Yg.J.f24997a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w.s.q(dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // w.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q0(dh.InterfaceC5380e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof w.s.c
            if (r0 == 0) goto L13
            r0 = r6
            w.s$c r0 = (w.s.c) r0
            int r1 = r0.f64015d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64015d = r1
            goto L18
        L13:
            w.s$c r0 = new w.s$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f64013b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f64015d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f64012a
            w.s r0 = (w.s) r0
            Yg.v.b(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            Yg.v.b(r6)
            boolean r6 = r5.f64002b
            if (r6 != 0) goto L55
            boolean r6 = r5.f64003c
            if (r6 != 0) goto L55
            Ti.a r6 = r5.f64004d
            r0.f64012a = r5
            r0.f64015d = r4
            java.lang.Object r6 = Ti.a.C0811a.a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            Ti.a r6 = r0.f64004d
            Ti.a.C0811a.c(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.f64002b
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w.s.q0(dh.e):java.lang.Object");
    }

    @Override // Y0.d
    public float x(int i10) {
        return this.f64001a.x(i10);
    }

    @Override // Y0.d
    public int x1(float f10) {
        return this.f64001a.x1(f10);
    }

    @Override // Y0.l
    public float y() {
        return this.f64001a.y();
    }
}

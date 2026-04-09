package N;

import T.z1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.PduHandle;
import r.C7517a;
import y.C8549d;
import y.C8552g;
import y.InterfaceC8555j;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
final class W {

    /* renamed from: a, reason: collision with root package name */
    private float f14117a;

    /* renamed from: b, reason: collision with root package name */
    private float f14118b;

    /* renamed from: c, reason: collision with root package name */
    private float f14119c;

    /* renamed from: d, reason: collision with root package name */
    private float f14120d;

    /* renamed from: e, reason: collision with root package name */
    private final C7517a f14121e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC8555j f14122f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC8555j f14123g;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f14124a;

        /* renamed from: b, reason: collision with root package name */
        Object f14125b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14126c;

        /* renamed from: e, reason: collision with root package name */
        int f14128e;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14126c = obj;
            this.f14128e |= PduHandle.NONE;
            return W.this.b(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f14129a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14130b;

        /* renamed from: d, reason: collision with root package name */
        int f14132d;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14130b = obj;
            this.f14132d |= PduHandle.NONE;
            return W.this.e(this);
        }
    }

    public /* synthetic */ W(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    private final float d(InterfaceC8555j interfaceC8555j) {
        return interfaceC8555j instanceof InterfaceC8560o.b ? this.f14118b : interfaceC8555j instanceof C8552g ? this.f14119c : interfaceC8555j instanceof C8549d ? this.f14120d : this.f14117a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(dh.InterfaceC5380e r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof N.W.b
            if (r0 == 0) goto L13
            r0 = r5
            N.W$b r0 = (N.W.b) r0
            int r1 = r0.f14132d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14132d = r1
            goto L18
        L13:
            N.W$b r0 = new N.W$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14130b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f14132d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f14129a
            N.W r0 = (N.W) r0
            Yg.v.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L64
        L2d:
            r5 = move-exception
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            Yg.v.b(r5)
            y.j r5 = r4.f14123g
            float r5 = r4.d(r5)
            r.a r2 = r4.f14121e
            java.lang.Object r2 = r2.k()
            Y0.h r2 = (Y0.h) r2
            float r2 = r2.s()
            boolean r2 = Y0.h.n(r2, r5)
            if (r2 != 0) goto L70
            r.a r2 = r4.f14121e     // Catch: java.lang.Throwable -> L69
            Y0.h r5 = Y0.h.d(r5)     // Catch: java.lang.Throwable -> L69
            r0.f14129a = r4     // Catch: java.lang.Throwable -> L69
            r0.f14132d = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = r2.t(r5, r0)     // Catch: java.lang.Throwable -> L69
            if (r5 != r1) goto L63
            return r1
        L63:
            r0 = r4
        L64:
            y.j r5 = r0.f14123g
            r0.f14122f = r5
            goto L70
        L69:
            r5 = move-exception
            r0 = r4
        L6b:
            y.j r1 = r0.f14123g
            r0.f14122f = r1
            throw r5
        L70:
            Yg.J r5 = Yg.J.f24997a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N.W.e(dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(y.InterfaceC8555j r6, dh.InterfaceC5380e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof N.W.a
            if (r0 == 0) goto L13
            r0 = r7
            N.W$a r0 = (N.W.a) r0
            int r1 = r0.f14128e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14128e = r1
            goto L18
        L13:
            N.W$a r0 = new N.W$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14126c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f14128e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f14125b
            y.j r6 = (y.InterfaceC8555j) r6
            java.lang.Object r0 = r0.f14124a
            N.W r0 = (N.W) r0
            Yg.v.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r7 = move-exception
            goto L70
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            Yg.v.b(r7)
            float r7 = r5.d(r6)
            r5.f14123g = r6
            r.a r2 = r5.f14121e     // Catch: java.lang.Throwable -> L67
            java.lang.Object r2 = r2.k()     // Catch: java.lang.Throwable -> L67
            Y0.h r2 = (Y0.h) r2     // Catch: java.lang.Throwable -> L67
            float r2 = r2.s()     // Catch: java.lang.Throwable -> L67
            boolean r2 = Y0.h.n(r2, r7)     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L6a
            r.a r2 = r5.f14121e     // Catch: java.lang.Throwable -> L67
            y.j r4 = r5.f14122f     // Catch: java.lang.Throwable -> L67
            r0.f14124a = r5     // Catch: java.lang.Throwable -> L67
            r0.f14125b = r6     // Catch: java.lang.Throwable -> L67
            r0.f14128e = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = N.L.d(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L67
            if (r7 != r1) goto L6a
            return r1
        L67:
            r7 = move-exception
            r0 = r5
            goto L70
        L6a:
            r0 = r5
        L6b:
            r0.f14122f = r6
            Yg.J r6 = Yg.J.f24997a
            return r6
        L70:
            r0.f14122f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N.W.b(y.j, dh.e):java.lang.Object");
    }

    public final z1 c() {
        return this.f14121e.g();
    }

    public final Object f(float f10, float f11, float f12, float f13, InterfaceC5380e interfaceC5380e) throws Throwable {
        this.f14117a = f10;
        this.f14118b = f11;
        this.f14119c = f12;
        this.f14120d = f13;
        Object objE = e(interfaceC5380e);
        return objE == AbstractC5467b.g() ? objE : Yg.J.f24997a;
    }

    private W(float f10, float f11, float f12, float f13) {
        this.f14117a = f10;
        this.f14118b = f11;
        this.f14119c = f12;
        this.f14120d = f13;
        this.f14121e = new C7517a(Y0.h.d(this.f14117a), r.u0.b(Y0.h.f24523b), null, null, 12, null);
    }
}

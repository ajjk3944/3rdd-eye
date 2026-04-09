package Li;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import org.snmp4j.mp.PduHandle;

/* renamed from: Li.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC3224k {

    /* renamed from: Li.k$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11918a;

        /* renamed from: b, reason: collision with root package name */
        Object f11919b;

        /* renamed from: c, reason: collision with root package name */
        Object f11920c;

        /* renamed from: d, reason: collision with root package name */
        boolean f11921d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f11922e;

        /* renamed from: f, reason: collision with root package name */
        int f11923f;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11922e = obj;
            this.f11923f |= PduHandle.NONE;
            return AbstractC3224k.d(null, null, false, this);
        }
    }

    public static final InterfaceC3220g b(Ki.v vVar) {
        return new C3216c(vVar, true, null, 0, null, 28, null);
    }

    public static final Object c(InterfaceC3221h interfaceC3221h, Ki.v vVar, InterfaceC5380e interfaceC5380e) {
        Object objD = d(interfaceC3221h, vVar, true, interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(Li.InterfaceC3221h r6, Ki.v r7, boolean r8, dh.InterfaceC5380e r9) {
        /*
            boolean r0 = r9 instanceof Li.AbstractC3224k.a
            if (r0 == 0) goto L13
            r0 = r9
            Li.k$a r0 = (Li.AbstractC3224k.a) r0
            int r1 = r0.f11923f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11923f = r1
            goto L18
        L13:
            Li.k$a r0 = new Li.k$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f11922e
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f11923f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f11921d
            java.lang.Object r6 = r0.f11920c
            Ki.i r6 = (Ki.i) r6
            java.lang.Object r7 = r0.f11919b
            Ki.v r7 = (Ki.v) r7
            java.lang.Object r2 = r0.f11918a
            Li.h r2 = (Li.InterfaceC3221h) r2
            Yg.v.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f11921d
            java.lang.Object r6 = r0.f11920c
            Ki.i r6 = (Ki.i) r6
            java.lang.Object r7 = r0.f11919b
            Ki.v r7 = (Ki.v) r7
            java.lang.Object r2 = r0.f11918a
            Li.h r2 = (Li.InterfaceC3221h) r2
            Yg.v.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            Yg.v.b(r9)
            Li.AbstractC3222i.v(r6)
            Ki.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f11918a = r6     // Catch: java.lang.Throwable -> L3c
            r0.f11919b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f11920c = r9     // Catch: java.lang.Throwable -> L3c
            r0.f11921d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f11923f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f11918a = r2     // Catch: java.lang.Throwable -> L3c
            r0.f11919b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f11920c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f11921d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f11923f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.a(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            Ki.n.a(r7, r6)
        L9a:
            Yg.J r6 = Yg.J.f24997a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            Ki.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.AbstractC3224k.d(Li.h, Ki.v, boolean, dh.e):java.lang.Object");
    }
}

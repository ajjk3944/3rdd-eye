package Li;

import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* renamed from: Li.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3214a implements InterfaceC3220g {

    /* renamed from: Li.a$a, reason: collision with other inner class name */
    static final class C0468a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11894a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11895b;

        /* renamed from: d, reason: collision with root package name */
        int f11897d;

        C0468a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11895b = obj;
            this.f11897d |= PduHandle.NONE;
            return AbstractC3214a.this.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Li.InterfaceC3220g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(Li.InterfaceC3221h r6, dh.InterfaceC5380e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Li.AbstractC3214a.C0468a
            if (r0 == 0) goto L13
            r0 = r7
            Li.a$a r0 = (Li.AbstractC3214a.C0468a) r0
            int r1 = r0.f11897d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11897d = r1
            goto L18
        L13:
            Li.a$a r0 = new Li.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11895b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f11897d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f11894a
            Mi.t r6 = (Mi.t) r6
            Yg.v.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            Yg.v.b(r7)
            Mi.t r7 = new Mi.t
            dh.i r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f11894a = r7     // Catch: java.lang.Throwable -> L55
            r0.f11897d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.e(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            Yg.J r6 = Yg.J.f24997a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.AbstractC3214a.b(Li.h, dh.e):java.lang.Object");
    }

    public abstract Object e(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e);
}

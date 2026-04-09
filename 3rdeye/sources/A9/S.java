package A9;

import f9.InterfaceC4347e;
import java.util.concurrent.CancellationException;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes3.dex */
public abstract class S<T> extends I9.h {

    /* renamed from: d, reason: collision with root package name */
    public int f207d;

    public S(int i) {
        this.f207d = i;
    }

    public abstract InterfaceC4347e<T> b();

    public Throwable d(Object obj) {
        C0602t c0602t = obj instanceof C0602t ? (C0602t) obj : null;
        if (c0602t != null) {
            return c0602t.f272a;
        }
        return null;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            b9.x.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.l.c(th);
        C.a(b().getContext(), new H("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
            I9.i r0 = r12.f2629c
            f9.e r1 = r12.b()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.l.d(r1, r2)     // Catch: java.lang.Throwable -> L23
            F9.i r1 = (F9.i) r1     // Catch: java.lang.Throwable -> L23
            h9.c r2 = r1.f1756f     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.f1758h     // Catch: java.lang.Throwable -> L23
            f9.h r3 = r2.getContext()     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = F9.A.c(r3, r1)     // Catch: java.lang.Throwable -> L23
            F9.y r4 = F9.A.f1727a     // Catch: java.lang.Throwable -> L23
            r5 = 0
            if (r1 == r4) goto L26
            A9.S0 r4 = A9.C0609x.c(r2, r3, r1)     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r1 = move-exception
            goto La1
        L26:
            r4 = r5
        L27:
            f9.h r6 = r2.getContext()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r7 = r12.h()     // Catch: java.lang.Throwable -> L4a
            java.lang.Throwable r8 = r12.d(r7)     // Catch: java.lang.Throwable -> L4a
            if (r8 != 0) goto L4c
            int r9 = r12.f207d     // Catch: java.lang.Throwable -> L4a
            r10 = 1
            if (r9 == r10) goto L3f
            r11 = 2
            if (r9 != r11) goto L3e
            goto L3f
        L3e:
            r10 = 0
        L3f:
            if (r10 == 0) goto L4c
            A9.o0$a r9 = A9.InterfaceC0594o0.a.f263b     // Catch: java.lang.Throwable -> L4a
            f9.h$a r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L4a
            A9.o0 r6 = (A9.InterfaceC0594o0) r6     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r2 = move-exception
            goto L95
        L4c:
            r6 = r5
        L4d:
            if (r6 == 0) goto L64
            boolean r9 = r6.isActive()     // Catch: java.lang.Throwable -> L4a
            if (r9 != 0) goto L64
            java.util.concurrent.CancellationException r6 = r6.A()     // Catch: java.lang.Throwable -> L4a
            r12.a(r7, r6)     // Catch: java.lang.Throwable -> L4a
            b9.m$a r6 = b9.n.a(r6)     // Catch: java.lang.Throwable -> L4a
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L4a
            goto L75
        L64:
            if (r8 == 0) goto L6e
            b9.m$a r6 = b9.n.a(r8)     // Catch: java.lang.Throwable -> L4a
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L4a
            goto L75
        L6e:
            java.lang.Object r6 = r12.e(r7)     // Catch: java.lang.Throwable -> L4a
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L4a
        L75:
            b9.A r2 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L7f
            boolean r2 = r4.f0()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L82
        L7f:
            F9.A.a(r3, r1)     // Catch: java.lang.Throwable -> L23
        L82:
            r0.getClass()     // Catch: java.lang.Throwable -> L88
            b9.A r0 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L88
            goto L8d
        L88:
            r0 = move-exception
            b9.m$a r0 = b9.n.a(r0)
        L8d:
            java.lang.Throwable r0 = b9.m.a(r0)
            r12.f(r5, r0)
            goto Lb3
        L95:
            if (r4 == 0) goto L9d
            boolean r4 = r4.f0()     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto La0
        L9d:
            F9.A.a(r3, r1)     // Catch: java.lang.Throwable -> L23
        La0:
            throw r2     // Catch: java.lang.Throwable -> L23
        La1:
            r0.getClass()     // Catch: java.lang.Throwable -> La7
            b9.A r0 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> La7
            goto Lac
        La7:
            r0 = move-exception
            b9.m$a r0 = b9.n.a(r0)
        Lac:
            java.lang.Throwable r0 = b9.m.a(r0)
            r12.f(r1, r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.S.run():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public void a(Object obj, CancellationException cancellationException) {
    }
}

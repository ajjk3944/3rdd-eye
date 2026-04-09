package z5;

import com.google.android.gms.internal.ads.C2113xD;
import h5.InterfaceC2370d;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public abstract class C extends G5.i {

    /* renamed from: c, reason: collision with root package name */
    public int f24484c;

    public C(int i) {
        super(0L, G5.k.f1719g);
        this.f24484c = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC2370d c();

    public Throwable f(Object obj) {
        C3038n c3038n = obj instanceof C3038n ? (C3038n) obj : null;
        if (c3038n != null) {
            return c3038n.f24546a;
        }
        return null;
    }

    public final void j(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            com.bumptech.glide.e.b(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        q5.i.b(th);
        AbstractC3046w.j(c().getContext(), new C2113xD("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r13 = this;
            c5.i r0 = c5.C0412i.f5929a
            V0.m r1 = r13.f1711b
            h5.d r2 = r13.c()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            q5.i.c(r2, r3)     // Catch: java.lang.Throwable -> L25
            E5.h r2 = (E5.h) r2     // Catch: java.lang.Throwable -> L25
            j5.b r3 = r2.f1387e     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.f1389g     // Catch: java.lang.Throwable -> L25
            h5.i r4 = r3.getContext()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = E5.a.k(r4, r2)     // Catch: java.lang.Throwable -> L25
            B2.a r5 = E5.a.f1377f     // Catch: java.lang.Throwable -> L25
            r6 = 0
            if (r2 == r5) goto L28
            z5.l0 r5 = z5.AbstractC3046w.q(r3, r4, r2)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            goto La1
        L28:
            r5 = r6
        L29:
            h5.i r7 = r3.getContext()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r8 = r13.k()     // Catch: java.lang.Throwable -> L4c
            java.lang.Throwable r9 = r13.f(r8)     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L4e
            int r10 = r13.f24484c     // Catch: java.lang.Throwable -> L4c
            r11 = 1
            if (r10 == r11) goto L41
            r12 = 2
            if (r10 != r12) goto L40
            goto L41
        L40:
            r11 = 0
        L41:
            if (r11 == 0) goto L4e
            z5.t r10 = z5.C3043t.f24555b     // Catch: java.lang.Throwable -> L4c
            h5.g r7 = r7.h(r10)     // Catch: java.lang.Throwable -> L4c
            z5.T r7 = (z5.T) r7     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r3 = move-exception
            goto L95
        L4e:
            r7 = r6
        L4f:
            if (r7 == 0) goto L68
            boolean r10 = r7.a()     // Catch: java.lang.Throwable -> L4c
            if (r10 != 0) goto L68
            z5.c0 r7 = (z5.c0) r7     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.CancellationException r7 = r7.u()     // Catch: java.lang.Throwable -> L4c
            r13.b(r8, r7)     // Catch: java.lang.Throwable -> L4c
            c5.e r7 = R2.a.d(r7)     // Catch: java.lang.Throwable -> L4c
            r3.e(r7)     // Catch: java.lang.Throwable -> L4c
            goto L79
        L68:
            if (r9 == 0) goto L72
            c5.e r7 = R2.a.d(r9)     // Catch: java.lang.Throwable -> L4c
            r3.e(r7)     // Catch: java.lang.Throwable -> L4c
            goto L79
        L72:
            java.lang.Object r7 = r13.h(r8)     // Catch: java.lang.Throwable -> L4c
            r3.e(r7)     // Catch: java.lang.Throwable -> L4c
        L79:
            if (r5 == 0) goto L81
            boolean r3 = r5.O()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L84
        L81:
            E5.a.f(r4, r2)     // Catch: java.lang.Throwable -> L25
        L84:
            r1.getClass()     // Catch: java.lang.Throwable -> L88
            goto L8d
        L88:
            r0 = move-exception
            c5.e r0 = R2.a.d(r0)
        L8d:
            java.lang.Throwable r0 = c5.C0409f.a(r0)
            r13.j(r6, r0)
            goto Lb1
        L95:
            if (r5 == 0) goto L9d
            boolean r5 = r5.O()     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto La0
        L9d:
            E5.a.f(r4, r2)     // Catch: java.lang.Throwable -> L25
        La0:
            throw r3     // Catch: java.lang.Throwable -> L25
        La1:
            r1.getClass()     // Catch: java.lang.Throwable -> La5
            goto Laa
        La5:
            r0 = move-exception
            c5.e r0 = R2.a.d(r0)
        Laa:
            java.lang.Throwable r0 = c5.C0409f.a(r0)
            r13.j(r2, r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.C.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}

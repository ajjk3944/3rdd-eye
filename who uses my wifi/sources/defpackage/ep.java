package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ep extends j01 {
    public int h;

    public ep(int i) {
        super(0L, o01.g);
        this.h = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract oj d();

    public Throwable f(Object obj) {
        pg pgVar = obj instanceof pg ? (pg) obj : null;
        if (pgVar != null) {
            return pgVar.a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            gi2.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        i30.j(th);
        uk2.q(d().getContext(), new uk("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r13 = this;
            z31 r0 = defpackage.z31.a
            h80 r1 = r13.g
            oj r2 = r13.d()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            defpackage.i30.k(r2, r3)     // Catch: java.lang.Throwable -> L25
            cp r2 = (defpackage.cp) r2     // Catch: java.lang.Throwable -> L25
            qj r3 = r2.j     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.l     // Catch: java.lang.Throwable -> L25
            hk r4 = r3.getContext()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = defpackage.wl2.y(r4, r2)     // Catch: java.lang.Throwable -> L25
            gs3 r5 = defpackage.wl2.i     // Catch: java.lang.Throwable -> L25
            r6 = 0
            if (r2 == r5) goto L28
            x31 r5 = defpackage.bd2.y(r3, r4, r2)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            goto La1
        L28:
            r5 = r6
        L29:
            hk r7 = r3.getContext()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r8 = r13.i()     // Catch: java.lang.Throwable -> L4c
            java.lang.Throwable r9 = r13.f(r8)     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L4e
            int r10 = r13.h     // Catch: java.lang.Throwable -> L4c
            r11 = 1
            if (r10 == r11) goto L41
            r12 = 2
            if (r10 != r12) goto L40
            goto L41
        L40:
            r11 = 0
        L41:
            if (r11 == 0) goto L4e
            fr r10 = defpackage.fr.j     // Catch: java.lang.Throwable -> L4c
            fk r7 = r7.h(r10)     // Catch: java.lang.Throwable -> L4c
            w30 r7 = (defpackage.w30) r7     // Catch: java.lang.Throwable -> L4c
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
            g40 r7 = (defpackage.g40) r7     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.CancellationException r7 = r7.v()     // Catch: java.lang.Throwable -> L4c
            r13.b(r8, r7)     // Catch: java.lang.Throwable -> L4c
            iq0 r7 = defpackage.bd2.k(r7)     // Catch: java.lang.Throwable -> L4c
            r3.e(r7)     // Catch: java.lang.Throwable -> L4c
            goto L79
        L68:
            if (r9 == 0) goto L72
            iq0 r7 = defpackage.bd2.k(r9)     // Catch: java.lang.Throwable -> L4c
            r3.e(r7)     // Catch: java.lang.Throwable -> L4c
            goto L79
        L72:
            java.lang.Object r7 = r13.g(r8)     // Catch: java.lang.Throwable -> L4c
            r3.e(r7)     // Catch: java.lang.Throwable -> L4c
        L79:
            if (r5 == 0) goto L81
            boolean r3 = r5.R()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L84
        L81:
            defpackage.wl2.v(r4, r2)     // Catch: java.lang.Throwable -> L25
        L84:
            r1.getClass()     // Catch: java.lang.Throwable -> L88
            goto L8d
        L88:
            r0 = move-exception
            iq0 r0 = defpackage.bd2.k(r0)
        L8d:
            java.lang.Throwable r0 = defpackage.jq0.a(r0)
            r13.h(r6, r0)
            goto Lb1
        L95:
            if (r5 == 0) goto L9d
            boolean r5 = r5.R()     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto La0
        L9d:
            defpackage.wl2.v(r4, r2)     // Catch: java.lang.Throwable -> L25
        La0:
            throw r3     // Catch: java.lang.Throwable -> L25
        La1:
            r1.getClass()     // Catch: java.lang.Throwable -> La5
            goto Laa
        La5:
            r0 = move-exception
            iq0 r0 = defpackage.bd2.k(r0)
        Laa:
            java.lang.Throwable r0 = defpackage.jq0.a(r0)
            r13.h(r2, r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep.run():void");
    }

    public Object g(Object obj) {
        return obj;
    }
}

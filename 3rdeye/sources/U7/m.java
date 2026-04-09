package U7;

import A9.InterfaceC0594o0;
import A9.K0;
import D9.E;
import D9.J;
import F9.C0663f;
import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: InterstitialProvider.kt */
/* loaded from: classes3.dex */
public abstract class m<AdType> {

    /* renamed from: a, reason: collision with root package name */
    public final C0663f f12547a;

    /* renamed from: b, reason: collision with root package name */
    public final J f12548b = E.c(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f12549c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0594o0 f12550d;

    public m(C0663f c0663f) {
        this.f12547a = c0663f;
    }

    public final boolean a() {
        return this.f12548b.getValue() != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.app.Activity r7, java.lang.String r8, U7.c r9, h9.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof U7.i
            if (r0 == 0) goto L13
            r0 = r10
            U7.i r0 = (U7.i) r0
            int r1 = r0.f12533o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12533o = r1
            goto L18
        L13:
            U7.i r0 = new U7.i
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f12531m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f12533o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            U7.m r7 = r0.f12530l
            b9.n.b(r10)
            goto L78
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            b9.n.b(r10)
            va.a$b r10 = va.a.f47104a
            java.lang.String r2 = "[InterstitialManager] loadInterstitial:adUnitId="
            java.lang.String r2 = androidx.work.s.d(r2, r8)
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r10.a(r2, r5)
            boolean r2 = r6.a()
            if (r2 == 0) goto L52
            java.lang.String r7 = "[InterstitialManager] Interstitial already loaded. Take it from cache"
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r10.a(r7, r8)
            b9.A r7 = b9.C1992A.f18074a
            return r7
        L52:
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.f12549c
            boolean r2 = r2.get()
            if (r2 == 0) goto L64
            java.lang.String r7 = "[InterstitialManager] Interstitial loading in progress"
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r10.a(r7, r8)
            b9.A r7 = b9.C1992A.f18074a
            return r7
        L64:
            A9.o0 r10 = r6.f12550d
            if (r10 == 0) goto L6c
            r2 = 0
            r10.c(r2)
        L6c:
            r0.f12530l = r6
            r0.f12533o = r3
            A9.K0 r10 = r6.c(r7, r8, r9, r0)
            if (r10 != r1) goto L77
            return r1
        L77:
            r7 = r6
        L78:
            A9.o0 r10 = (A9.InterfaceC0594o0) r10
            r7.f12550d = r10
            b9.A r7 = b9.C1992A.f18074a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.m.b(android.app.Activity, java.lang.String, U7.c, h9.c):java.lang.Object");
    }

    public abstract K0 c(Activity activity, String str, c cVar, i iVar);

    public final void d(AdType adtype) {
        this.f12549c.set(false);
        this.f12548b.setValue(adtype);
    }

    public abstract void e(Activity activity, Object obj, h hVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(long r6, h9.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof U7.k
            if (r0 == 0) goto L13
            r0 = r8
            U7.k r0 = (U7.k) r0
            int r1 = r0.f12543n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12543n = r1
            goto L18
        L13:
            U7.k r0 = new U7.k
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f12541l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f12543n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            b9.n.b(r8)     // Catch: java.lang.Exception -> L42
            return r8
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            b9.n.b(r8)
            U7.l r8 = new U7.l     // Catch: java.lang.Exception -> L42
            r8.<init>(r5, r3)     // Catch: java.lang.Exception -> L42
            r0.f12543n = r4     // Catch: java.lang.Exception -> L42
            java.lang.Object r6 = A9.C0585k.b(r6, r8, r0)     // Catch: java.lang.Exception -> L42
            if (r6 != r1) goto L41
            return r1
        L41:
            return r6
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.m.f(long, h9.c):java.lang.Object");
    }
}

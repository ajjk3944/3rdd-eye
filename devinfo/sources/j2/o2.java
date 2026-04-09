package j2;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class o2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f27246a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final j2.l2 a(j2.a r6, u0.t r7, c1.h r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = j2.f1.f27140a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L41
            r0 = 6
            zk.h r0 = com.bumptech.glide.e.f(r2, r0, r3)
            yj.n r2 = j2.j0.f27189m
            java.lang.Object r2 = r2.getValue()
            ck.h r2 = (ck.h) r2
            cl.d r2 = xk.x.b(r2)
            bh.t r4 = new bh.t
            r5 = 14
            r4.<init>(r0, r3, r5)
            r5 = 3
            xk.x.v(r2, r3, r3, r4, r5)
            c2.l0 r2 = new c2.l0
            r4 = 12
            r2.<init>(r4, r0)
            java.lang.Object r0 = g1.m.f24260c
            monitor-enter(r0)
            java.lang.Object r4 = g1.m.f24265i     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r2 = zj.n.k0(r4, r2)     // Catch: java.lang.Throwable -> L3e
            g1.m.f24265i = r2     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            g1.m.a()
            goto L41
        L3e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L41:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L54
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof j2.r
            if (r1 == 0) goto L52
            j2.r r0 = (j2.r) r0
            goto L58
        L52:
            r0 = r3
            goto L58
        L54:
            r6.removeAllViews()
            goto L52
        L58:
            if (r0 != 0) goto L70
            j2.r r0 = new j2.r
            android.content.Context r1 = r6.getContext()
            ck.h r2 = r7.j()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = j2.o2.f27246a
            r6.addView(r1, r2)
        L70:
            android.view.View r6 = r0.getView()
            r1 = 2131297779(0x7f0905f3, float:1.8213513E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof j2.l2
            if (r2 == 0) goto L82
            r3 = r6
            j2.l2 r3 = (j2.l2) r3
        L82:
            if (r3 != 0) goto L9e
            j2.l2 r3 = new j2.l2
            i0.f r6 = new i0.f
            i2.e0 r2 = r0.getRoot()
            r6.<init>(r2)
            u0.w r2 = new u0.w
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9e:
            r3.b(r8)
            ck.h r6 = r0.getCoroutineContext()
            ck.h r8 = r7.j()
            boolean r6 = nk.k.a(r6, r8)
            if (r6 != 0) goto Lb6
            ck.h r6 = r7.j()
            r0.setCoroutineContext(r6)
        Lb6:
            j2.n2 r6 = new j2.n2
            r6.<init>(r7)
            r0.setFrameEndScheduler$ui(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.o2.a(j2.a, u0.t, c1.h):j2.l2");
    }
}

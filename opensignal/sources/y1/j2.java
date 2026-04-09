package y1;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class j2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f25724a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final y1.i2 a(y1.a r6, n0.s r7, v0.d r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = y1.j1.f25722a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L41
            r0 = 6
            yt.c r0 = a.a.b(r2, r0, r3)
            lq.q r2 = y1.n0.I
            java.lang.Object r2 = r2.getValue()
            pq.h r2 = (pq.h) r2
            bu.c r2 = wt.w.b(r2)
            au.e r4 = new au.e
            r5 = 13
            r4.<init>(r0, r3, r5)
            r5 = 3
            wt.w.s(r2, r3, r3, r4, r5)
            j1.a r2 = new j1.a
            r4 = 28
            r2.<init>(r4, r0)
            java.lang.Object r0 = x0.l.f24717c
            monitor-enter(r0)
            java.lang.Object r4 = x0.l.f24723i     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r2 = mq.o.F0(r4, r2)     // Catch: java.lang.Throwable -> L3e
            x0.l.f24723i = r2     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            x0.l.a()
            goto L41
        L3e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L41:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L54
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L52
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L58
        L52:
            r0 = r3
            goto L58
        L54:
            r6.removeAllViews()
            goto L52
        L58:
            if (r0 != 0) goto L70
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r6.getContext()
            pq.h r2 = r7.h()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = y1.j2.f25724a
            r6.addView(r1, r2)
        L70:
            android.view.View r6 = r0.getView()
            int r1 = z0.n.wrapped_composition_tag
            java.lang.Object r6 = r6.getTag(r1)
            boolean r1 = r6 instanceof y1.i2
            if (r1 == 0) goto L81
            r3 = r6
            y1.i2 r3 = (y1.i2) r3
        L81:
            if (r3 != 0) goto L9f
            y1.i2 r3 = new y1.i2
            qm.c r6 = new qm.c
            x1.f0 r1 = r0.getRoot()
            r6.<init>(r1)
            n0.v r1 = new n0.v
            r1.<init>(r7, r6)
            r3.<init>(r0, r1)
            android.view.View r6 = r0.getView()
            int r1 = z0.n.wrapped_composition_tag
            r6.setTag(r1, r3)
        L9f:
            r3.c(r8)
            pq.h r6 = r0.getCoroutineContext()
            pq.h r8 = r7.h()
            boolean r6 = br.l.a(r6, r8)
            if (r6 != 0) goto Lb7
            pq.h r6 = r7.h()
            r0.setCoroutineContext(r6)
        Lb7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.j2.a(y1.a, n0.s, v0.d):y1.i2");
    }
}

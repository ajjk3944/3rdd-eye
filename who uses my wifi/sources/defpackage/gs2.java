package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gs2 implements GestureDetector.OnGestureListener {
    public final pr2 f;
    public final cs2 g;

    public gs2(pr2 pr2Var, cs2 cs2Var) {
        this.f = pr2Var;
        this.g = cs2Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            pr2 r0 = r6.f     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            if (r0 != 0) goto L8
            goto L77
        L8:
            float r2 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L2a
            float r3 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> L2a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = -1
            r4 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            if (r2 <= 0) goto L40
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto L2c
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2a
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2a
            r3 = 1
            goto L64
        L2a:
            r7 = move-exception
            goto L7c
        L2c:
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L3e
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2a
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2a
            r3 = 2
            goto L64
        L3e:
            r7 = r1
            goto L64
        L40:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L53
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2a
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2a
            r3 = 8
            goto L64
        L53:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L3e
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2a
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2a
            r3 = 4
        L64:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2a
            wr2 r8 = r0.n     // Catch: java.lang.Throwable -> L79
            int r8 = r8.v()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            if (r3 != r8) goto L77
            cs2 r8 = r6.g     // Catch: java.lang.Throwable -> L2a
            android.widget.FrameLayout r8 = r8.i     // Catch: java.lang.Throwable -> L2a
            r0.c(r8, r7)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r6)
            return r1
        L77:
            monitor-exit(r6)
            return r1
        L79:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            throw r7     // Catch: java.lang.Throwable -> L2a
        L7c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs2.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

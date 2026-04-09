package cj;

import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.util.Objects;
import zc.d2;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3982a = 1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3983d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3984g;

    public f(d2 d2Var, boolean z10) {
        this.f3983d = z10;
        Objects.requireNonNull(d2Var);
        this.f3984g = d2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            r9 = this;
            int r0 = r9.f3982a
            r1 = 0
            switch(r0) {
                case 0: goto L79;
                case 1: goto L6d;
                default: goto L6;
            }
        L6:
            java.lang.Object r0 = r9.f3984g
            zc.d2 r0 = (zc.d2) r0
            java.lang.Object r2 = r0.f1504d
            zc.c1 r2 = (zc.c1) r2
            boolean r3 = r2.a()
            java.lang.Boolean r4 = r2.U
            r5 = 1
            if (r4 == 0) goto L21
            java.lang.Boolean r4 = r2.U
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            r4 = r5
            goto L22
        L21:
            r4 = r1
        L22:
            boolean r6 = r9.f3983d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r2.U = r7
            if (r4 != r6) goto L3c
            zc.j0 r4 = r2.f26889y
            zc.c1.g(r4)
            su.b r4 = r4.K
            java.lang.String r7 = "Default data collection state already set to"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            r4.c(r8, r7)
        L3c:
            boolean r4 = r2.a()
            if (r4 == r3) goto L55
            boolean r4 = r2.a()
            java.lang.Boolean r7 = r2.U
            if (r7 == 0) goto L53
            java.lang.Boolean r7 = r2.U
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L53
            r1 = r5
        L53:
            if (r4 == r1) goto L69
        L55:
            zc.j0 r1 = r2.f26889y
            zc.c1.g(r1)
            su.b r1 = r1.H
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Default data collection is different than actual status"
            r1.d(r2, r3, r4)
        L69:
            r0.K1()
            return
        L6d:
            r9.f3983d = r1
            java.lang.Object r0 = r9.f3984g
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = (com.google.android.exoplayer2.ui.AspectRatioFrameLayout) r0
            int r1 = com.google.android.exoplayer2.ui.AspectRatioFrameLayout.f4601r
            r0.getClass()
            return
        L79:
            java.lang.Object r0 = r9.f3984g
            hk.h r0 = (hk.h) r0
            gk.c r1 = r0.f10809f
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto L88
            android.os.Looper.prepare()
        L88:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.c()
            r2.append(r3)
            java.lang.String r3 = " Run with schedule: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "ExecServiceExecPipeline"
            ch.n.b(r3, r2)
            boolean r2 = r9.f3983d
            r4 = 0
            if (r2 == 0) goto Lb1
            r1 = r4
            goto Lb8
        Lb1:
            long r1 = r1.f9622h
            long r6 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
        Lb8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r0.c()
            r6.append(r7)
            java.lang.String r7 = " Wait for delay: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            ch.n.b(r3, r6)
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto Lde
            java.lang.Thread.sleep(r1)
        Lde:
            r0.j()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto Lea
            r0.quit()
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.f.run():void");
    }

    public f(hk.h hVar, boolean z10, df.c cVar) {
        this.f3984g = hVar;
        this.f3983d = z10;
    }

    public f(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f3984g = aspectRatioFrameLayout;
    }
}

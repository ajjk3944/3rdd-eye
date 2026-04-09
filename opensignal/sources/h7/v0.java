package h7;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public n0 f10218a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10219b;

    /* renamed from: c, reason: collision with root package name */
    public long f10220c;

    /* renamed from: d, reason: collision with root package name */
    public long f10221d;

    /* renamed from: e, reason: collision with root package name */
    public long f10222e;

    /* renamed from: f, reason: collision with root package name */
    public long f10223f;

    public static void b(n1 n1Var) {
        RecyclerView recyclerView;
        int i10 = n1Var.j;
        if (n1Var.f() || (i10 & 4) != 0 || (recyclerView = n1Var.f10170r) == null) {
            return;
        }
        recyclerView.J(n1Var);
    }

    public abstract boolean a(n1 n1Var, n1 n1Var2, androidx.media3.common.i0 i0Var, androidx.media3.common.i0 i0Var2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(h7.n1 r11) {
        /*
            r10 = this;
            h7.n0 r0 = r10.f10218a
            if (r0 == 0) goto La2
            androidx.recyclerview.widget.RecyclerView r0 = r0.f10153a
            r1 = 1
            r11.n(r1)
            android.view.View r2 = r11.f10155a
            h7.n1 r3 = r11.f10162h
            r4 = 0
            if (r3 == 0) goto L17
            h7.n1 r3 = r11.f10163i
            if (r3 != 0) goto L17
            r11.f10162h = r4
        L17:
            r11.f10163i = r4
            int r3 = r11.j
            r3 = r3 & 16
            if (r3 == 0) goto L21
            goto La2
        L21:
            h7.f1 r3 = r0.f2064g
            r0.m0()
            bj.c r4 = r0.f2085y
            java.lang.Object r5 = r4.f2796r
            dj.i r5 = (dj.i) r5
            java.lang.Object r6 = r4.f2795g
            b9.c r6 = (b9.c) r6
            int r7 = r4.f2794d
            r8 = 0
            if (r7 != r1) goto L45
            java.lang.Object r1 = r4.f2798y
            android.view.View r1 = (android.view.View) r1
            if (r1 != r2) goto L3d
        L3b:
            r1 = r8
            goto L70
        L3d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r11.<init>(r0)
            throw r11
        L45:
            r9 = 2
            if (r7 == r9) goto L9a
            r4.f2794d = r9     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r7 = r6.f2478d     // Catch: java.lang.Throwable -> L5b
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7     // Catch: java.lang.Throwable -> L5b
            int r7 = r7.indexOfChild(r2)     // Catch: java.lang.Throwable -> L5b
            r9 = -1
            if (r7 != r9) goto L5d
            r4.K(r2)     // Catch: java.lang.Throwable -> L5b
        L58:
            r4.f2794d = r8
            goto L70
        L5b:
            r11 = move-exception
            goto L97
        L5d:
            boolean r9 = r5.C(r7)     // Catch: java.lang.Throwable -> L5b
            if (r9 == 0) goto L6d
            r5.E(r7)     // Catch: java.lang.Throwable -> L5b
            r4.K(r2)     // Catch: java.lang.Throwable -> L5b
            r6.v(r7)     // Catch: java.lang.Throwable -> L5b
            goto L58
        L6d:
            r4.f2794d = r8
            goto L3b
        L70:
            if (r1 == 0) goto L86
            h7.n1 r4 = androidx.recyclerview.widget.RecyclerView.M(r2)
            r3.m(r4)
            r3.j(r4)
            boolean r3 = androidx.recyclerview.widget.RecyclerView.X0
            if (r3 == 0) goto L86
            java.util.Objects.toString(r2)
            r0.toString()
        L86:
            r3 = r1 ^ 1
            r0.n0(r3)
            if (r1 != 0) goto La2
            boolean r11 = r11.j()
            if (r11 == 0) goto La2
            r0.removeDetachedView(r2, r8)
            return
        L97:
            r4.f2794d = r8
            throw r11
        L9a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r11.<init>(r0)
            throw r11
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.v0.c(h7.n1):void");
    }

    public abstract void d(n1 n1Var);

    public abstract void e();

    public abstract boolean f();
}

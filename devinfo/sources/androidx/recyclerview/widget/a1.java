package androidx.recyclerview.widget;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public r0 f1299a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1300b;

    /* renamed from: c, reason: collision with root package name */
    public long f1301c;

    /* renamed from: d, reason: collision with root package name */
    public long f1302d;

    /* renamed from: e, reason: collision with root package name */
    public long f1303e;

    /* renamed from: f, reason: collision with root package name */
    public long f1304f;

    public static void b(x1 x1Var) {
        int i4 = x1Var.mFlags;
        if (!x1Var.isInvalid() && (i4 & 4) == 0) {
            x1Var.getOldPosition();
            x1Var.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(x1 x1Var, x1 x1Var2, z0 z0Var, z0 z0Var2);

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.recyclerview.widget.x1 r11) {
        /*
            r10 = this;
            androidx.recyclerview.widget.r0 r0 = r10.f1299a
            if (r0 == 0) goto Laf
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1497a
            r1 = 1
            r11.setIsRecyclable(r1)
            androidx.recyclerview.widget.x1 r2 = r11.mShadowedHolder
            r3 = 0
            if (r2 == 0) goto L15
            androidx.recyclerview.widget.x1 r2 = r11.mShadowingHolder
            if (r2 != 0) goto L15
            r11.mShadowedHolder = r3
        L15:
            r11.mShadowingHolder = r3
            boolean r2 = r11.shouldBeKeptAsChild()
            if (r2 != 0) goto Laf
            android.view.View r2 = r11.itemView
            androidx.recyclerview.widget.m1 r3 = r0.f1223c
            r0.o0()
            androidx.recyclerview.widget.e r4 = r0.f1229f
            androidx.recyclerview.widget.d r5 = r4.f1329b
            androidx.recyclerview.widget.r0 r6 = r4.f1328a
            int r7 = r4.f1331d
            r8 = 0
            if (r7 != r1) goto L3d
            android.view.View r1 = r4.f1332e
            if (r1 != r2) goto L35
        L33:
            r1 = r8
            goto L66
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r11.<init>(r0)
            throw r11
        L3d:
            r9 = 2
            if (r7 == r9) goto La7
            r4.f1331d = r9     // Catch: java.lang.Throwable -> L51
            androidx.recyclerview.widget.RecyclerView r7 = r6.f1497a     // Catch: java.lang.Throwable -> L51
            int r7 = r7.indexOfChild(r2)     // Catch: java.lang.Throwable -> L51
            r9 = -1
            if (r7 != r9) goto L53
            r4.l(r2)     // Catch: java.lang.Throwable -> L51
        L4e:
            r4.f1331d = r8
            goto L66
        L51:
            r11 = move-exception
            goto La4
        L53:
            boolean r9 = r5.k(r7)     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto L63
            r5.q(r7)     // Catch: java.lang.Throwable -> L51
            r4.l(r2)     // Catch: java.lang.Throwable -> L51
            r6.h(r7)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L63:
            r4.f1331d = r8
            goto L33
        L66:
            if (r1 == 0) goto L91
            androidx.recyclerview.widget.x1 r4 = androidx.recyclerview.widget.RecyclerView.P(r2)
            r3.m(r4)
            r3.j(r4)
            boolean r3 = androidx.recyclerview.widget.RecyclerView.D0
            if (r3 == 0) goto L91
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "after removing animated view: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L91:
            r2 = r1 ^ 1
            r0.q0(r2)
            if (r1 != 0) goto Laf
            boolean r1 = r11.isTmpDetached()
            if (r1 == 0) goto Laf
            android.view.View r11 = r11.itemView
            r0.removeDetachedView(r11, r8)
            return
        La4:
            r4.f1331d = r8
            throw r11
        La7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r11.<init>(r0)
            throw r11
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a1.c(androidx.recyclerview.widget.x1):void");
    }

    public abstract void d(x1 x1Var);

    public abstract void e();

    public abstract boolean f();
}

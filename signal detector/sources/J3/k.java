package J3;

import B4.r;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.apm.insight.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2129C = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: A, reason: collision with root package name */
    public final AccessibilityManager f2130A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2131B;

    public k(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f2130A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static J3.k f(android.view.View r7, java.lang.String r8, int r9) {
        /*
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L9:
            boolean r2 = r7 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L19:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r7 == 0) goto L2a
            android.view.ViewParent r7 = r7.getParent()
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r7 = (android.view.View) r7
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 != 0) goto L2
            r7 = r1
        L2d:
            if (r7 == 0) goto L73
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int[] r2 = J3.k.f2129C
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2)
            r3 = 0
            r4 = -1
            int r5 = r2.getResourceId(r3, r4)
            r6 = 1
            int r6 = r2.getResourceId(r6, r4)
            r2.recycle()
            if (r5 == r4) goto L53
            if (r6 == r4) goto L53
            r2 = 2131493063(0x7f0c00c7, float:1.8609596E38)
            goto L56
        L53:
            r2 = 2131492936(0x7f0c0048, float:1.8609338E38)
        L56:
            android.view.View r1 = r1.inflate(r2, r7, r3)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            J3.k r2 = new J3.k
            r2.<init>(r0, r7, r1, r1)
            J3.h r7 = r2.i
            android.view.View r7 = r7.getChildAt(r3)
            com.google.android.material.snackbar.SnackbarContentLayout r7 = (com.google.android.material.snackbar.SnackbarContentLayout) r7
            android.widget.TextView r7 = r7.getMessageView()
            r7.setText(r8)
            r2.f2119k = r9
            return r2
        L73:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No suitable parent found from the given view. Please provide a valid view."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.k.f(android.view.View, java.lang.String, int):J3.k");
    }

    public final void g(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f2131B = false;
        } else {
            this.f2131B = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new r(this, 3, onClickListener));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r8 = this;
            c1.g r0 = c1.g.t()
            android.view.accessibility.AccessibilityManager r1 = r8.f2130A
            int r2 = r8.f2119k
            r3 = 0
            r4 = 4
            r5 = -2
            if (r2 != r5) goto Lf
        Ld:
            r2 = r5
            goto L2e
        Lf:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 29
            if (r6 < r7) goto L23
            boolean r5 = r8.f2131B
            if (r5 == 0) goto L1b
            r5 = r4
            goto L1c
        L1b:
            r5 = r3
        L1c:
            r5 = r5 | 3
            int r2 = C4.a.d(r1, r2, r5)
            goto L2e
        L23:
            boolean r6 = r8.f2131B
            if (r6 == 0) goto L2e
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L2e
            goto Ld
        L2e:
            J3.f r1 = r8.f2128t
            java.lang.Object r5 = r0.f5896b
            monitor-enter(r5)
            boolean r6 = r0.v(r1)     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L51
            java.lang.Object r1 = r0.f5898d     // Catch: java.lang.Throwable -> L4f
            J3.m r1 = (J3.m) r1     // Catch: java.lang.Throwable -> L4f
            r1.f2135b = r2     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r0.f5897c     // Catch: java.lang.Throwable -> L4f
            android.os.Handler r2 = (android.os.Handler) r2     // Catch: java.lang.Throwable -> L4f
            r2.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r0.f5898d     // Catch: java.lang.Throwable -> L4f
            J3.m r1 = (J3.m) r1     // Catch: java.lang.Throwable -> L4f
            r0.E(r1)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4f
            return
        L4f:
            r0 = move-exception
            goto L86
        L51:
            java.lang.Object r6 = r0.f5899e     // Catch: java.lang.Throwable -> L4f
            J3.m r6 = (J3.m) r6     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L60
            java.lang.ref.WeakReference r6 = r6.f2134a     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L4f
            if (r6 != r1) goto L60
            r3 = 1
        L60:
            if (r3 == 0) goto L69
            java.lang.Object r1 = r0.f5899e     // Catch: java.lang.Throwable -> L4f
            J3.m r1 = (J3.m) r1     // Catch: java.lang.Throwable -> L4f
            r1.f2135b = r2     // Catch: java.lang.Throwable -> L4f
            goto L70
        L69:
            J3.m r3 = new J3.m     // Catch: java.lang.Throwable -> L4f
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L4f
            r0.f5899e = r3     // Catch: java.lang.Throwable -> L4f
        L70:
            java.lang.Object r1 = r0.f5898d     // Catch: java.lang.Throwable -> L4f
            J3.m r1 = (J3.m) r1     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L7e
            boolean r1 = r0.g(r1, r4)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L7e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4f
            return
        L7e:
            r1 = 0
            r0.f5898d = r1     // Catch: java.lang.Throwable -> L4f
            r0.G()     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4f
            return
        L86:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.k.h():void");
    }
}

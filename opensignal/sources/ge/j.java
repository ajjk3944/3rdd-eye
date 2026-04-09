package ge;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.google.android.material.snackbar.SnackbarContentLayout;
import kg.r;

/* loaded from: classes.dex */
public final class j extends h {
    public static final int[] B = {ed.b.snackbarButtonStyle, ed.b.snackbarTextViewStyle};
    public boolean A;

    /* renamed from: z, reason: collision with root package name */
    public final AccessibilityManager f9555z;

    public j(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f9555z = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ge.j f(android.view.View r7, java.lang.String r8) {
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
            if (r7 == 0) goto L6f
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int[] r2 = ge.j.B
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2)
            r3 = 0
            r4 = -1
            int r5 = r2.getResourceId(r3, r4)
            r6 = 1
            int r6 = r2.getResourceId(r6, r4)
            r2.recycle()
            if (r5 == r4) goto L52
            if (r6 == r4) goto L52
            int r2 = ed.h.mtrl_layout_snackbar_include
            goto L54
        L52:
            int r2 = ed.h.design_layout_snackbar_include
        L54:
            android.view.View r1 = r1.inflate(r2, r7, r3)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            ge.j r2 = new ge.j
            r2.<init>(r0, r7, r1, r1)
            ge.g r7 = r2.f9546i
            android.view.View r7 = r7.getChildAt(r3)
            com.google.android.material.snackbar.SnackbarContentLayout r7 = (com.google.android.material.snackbar.SnackbarContentLayout) r7
            android.widget.TextView r7 = r7.getMessageView()
            r7.setText(r8)
            return r2
        L6f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No suitable parent found from the given view. Please provide a valid view."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.j.f(android.view.View, java.lang.String):ge.j");
    }

    public final void g(String str, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f9546i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(str)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.A = false;
        } else {
            this.A = true;
            actionView.setVisibility(0);
            actionView.setText(str);
            actionView.setOnClickListener(new dn.j(this, 1, onClickListener));
        }
    }

    public final void h() {
        int recommendedTimeoutMillis;
        r rVarJ = r.j();
        AccessibilityManager accessibilityManager = this.f9555z;
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(0, (this.A ? 4 : 0) | 3);
        } else {
            recommendedTimeoutMillis = (this.A && accessibilityManager.isTouchExplorationEnabled()) ? -2 : 0;
        }
        e eVar = this.f9554s;
        synchronized (rVarJ.f14395a) {
            try {
                if (rVarJ.o(eVar)) {
                    l lVar = (l) rVarJ.f14397g;
                    lVar.f9559b = recommendedTimeoutMillis;
                    ((Handler) rVarJ.f14396d).removeCallbacksAndMessages(lVar);
                    rVarJ.v((l) rVarJ.f14397g);
                    return;
                }
                l lVar2 = (l) rVarJ.f14398r;
                if (lVar2 != null && lVar2.f9558a.get() == eVar) {
                    z10 = true;
                }
                if (z10) {
                    ((l) rVarJ.f14398r).f9559b = recommendedTimeoutMillis;
                } else {
                    rVarJ.f14398r = new l(recommendedTimeoutMillis, eVar);
                }
                l lVar3 = (l) rVarJ.f14397g;
                if (lVar3 == null || !rVarJ.b(lVar3, 4)) {
                    rVarJ.f14397g = null;
                    rVarJ.w();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package h3;

import A0.e;
import J3.i;
import T2.g;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2364c extends g {

    /* renamed from: d, reason: collision with root package name */
    public int f20478d;

    /* renamed from: e, reason: collision with root package name */
    public int f20479e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f20480f;

    public C2364c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f20480f = swipeDismissBehavior;
    }

    @Override // T2.g
    public final void A(int i) {
        e eVar = this.f20480f.f18107b;
        if (eVar != null) {
            i iVar = (i) eVar.f73b;
            if (i == 0) {
                c1.g.t().D(iVar.f2128t);
            } else if (i == 1 || i == 2) {
                c1.g.t().B(iVar.f2128t);
            }
        }
    }

    @Override // T2.g
    public final void B(View view, int i, int i3) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f20480f;
        float f2 = width * swipeDismissBehavior.f18111f;
        float width2 = view.getWidth() * swipeDismissBehavior.f18112g;
        float fAbs = Math.abs(i - this.f20478d);
        if (fAbs <= f2) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // T2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f20479e = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f20480f
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.f18110e
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f20478d
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.f20478d
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.f20478d
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f20478d
        L67:
            X.f r10 = r3.f18106a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L7c
            androidx.lifecycle.W r10 = new androidx.lifecycle.W
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
            return
        L7c:
            if (r2 == 0) goto L85
            A0.e r10 = r3.f18107b
            if (r10 == 0) goto L85
            r10.q(r9)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.C2364c.C(android.view.View, float, float):void");
    }

    @Override // T2.g
    public final boolean N(int i, View view) {
        int i3 = this.f20479e;
        return (i3 == -1 || i3 == i) && this.f20480f.w(view);
    }

    @Override // T2.g
    public final int d(int i, View view) {
        int width;
        int width2;
        int width3;
        boolean z6 = view.getLayoutDirection() == 1;
        int i3 = this.f20480f.f18110e;
        if (i3 == 0) {
            if (z6) {
                width = this.f20478d - view.getWidth();
                width2 = this.f20478d;
            } else {
                width = this.f20478d;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i3 != 1) {
            width = this.f20478d - view.getWidth();
            width2 = view.getWidth() + this.f20478d;
        } else if (z6) {
            width = this.f20478d;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f20478d - view.getWidth();
            width2 = this.f20478d;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // T2.g
    public final int e(int i, View view) {
        return view.getTop();
    }

    @Override // T2.g
    public final int r(View view) {
        return view.getWidth();
    }

    @Override // T2.g
    public final void z(int i, View view) {
        this.f20479e = i;
        this.f20478d = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f20480f;
            swipeDismissBehavior.f18109d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f18109d = false;
        }
    }
}

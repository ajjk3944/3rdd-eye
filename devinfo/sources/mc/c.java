package mc;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public int f29028a;

    /* renamed from: b, reason: collision with root package name */
    public int f29029b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f29030c;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f29030c = swipeDismissBehavior;
    }

    @Override // me.t1
    public final void A(View view, int i4, int i10) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f29030c;
        float f10 = width * swipeDismissBehavior.f20348e;
        float width2 = view.getWidth() * swipeDismissBehavior.f20349f;
        float fAbs = Math.abs(i4 - this.f29028a);
        if (fAbs <= f10) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // me.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f29029b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f29030c
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.f20347d
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
            int r5 = r8.f29028a
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
            int r0 = r8.f29028a
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.f29028a
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f29028a
        L67:
            n4.c r10 = r3.f20344a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7b
            fb.r r10 = new fb.r
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.c.B(android.view.View, float, float):void");
    }

    @Override // me.t1
    public final boolean G(int i4, View view) {
        int i10 = this.f29029b;
        return (i10 == -1 || i10 == i4) && this.f29030c.w(view);
    }

    @Override // me.t1
    public final int f(int i4, View view) {
        int width;
        int width2;
        int width3;
        boolean z3 = view.getLayoutDirection() == 1;
        int i10 = this.f29030c.f20347d;
        if (i10 == 0) {
            if (z3) {
                width = this.f29028a - view.getWidth();
                width2 = this.f29028a;
            } else {
                width = this.f29028a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i10 != 1) {
            width = this.f29028a - view.getWidth();
            width2 = view.getWidth() + this.f29028a;
        } else if (z3) {
            width = this.f29028a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f29028a - view.getWidth();
            width2 = this.f29028a;
        }
        return Math.min(Math.max(width, i4), width2);
    }

    @Override // me.t1
    public final int g(int i4, View view) {
        return view.getTop();
    }

    @Override // me.t1
    public final int r(View view) {
        return view.getWidth();
    }

    @Override // me.t1
    public final void y(int i4, View view) {
        this.f29029b = i4;
        this.f29028a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f29030c;
            swipeDismissBehavior.f20346c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f20346c = false;
        }
    }

    @Override // me.t1
    public final void z(int i4) {
    }
}

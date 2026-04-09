package id;

import a2.g;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import ge.h;
import kc.f;
import kg.r;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: e, reason: collision with root package name */
    public int f11332e;

    /* renamed from: f, reason: collision with root package name */
    public int f11333f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f11334g;

    public d(SwipeDismissBehavior swipeDismissBehavior) {
        this.f11334g = swipeDismissBehavior;
    }

    @Override // kc.f
    public final int B(View view) {
        return view.getWidth();
    }

    @Override // kc.f
    public final void L(View view, int i10) {
        this.f11333f = i10;
        this.f11332e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f11334g;
            swipeDismissBehavior.f5503d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f5503d = false;
        }
    }

    @Override // kc.f
    public final void M(int i10) {
        g gVar = this.f11334g.f5501b;
        if (gVar != null) {
            ge.e eVar = ((h) gVar.f31a).f9554s;
            if (i10 == 0) {
                r.j().t(eVar);
            } else if (i10 == 1 || i10 == 2) {
                r.j().s(eVar);
            }
        }
    }

    @Override // kc.f
    public final void N(View view, int i10, int i11) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f11334g;
        float f10 = width * swipeDismissBehavior.f5505f;
        float width2 = view.getWidth() * swipeDismissBehavior.f5506g;
        float fAbs = Math.abs(i10 - this.f11332e);
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
    @Override // kc.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f11333f = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f11334g
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.f5504e
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
            int r5 = r8.f11332e
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
            int r0 = r8.f11332e
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.f11332e
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f11332e
        L67:
            b4.f r10 = r3.f5500a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7c
            id.e r10 = new id.e
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
            return
        L7c:
            if (r2 == 0) goto L85
            a2.g r10 = r3.f5501b
            if (r10 == 0) goto L85
            r10.i(r9)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.d.O(android.view.View, float, float):void");
    }

    @Override // kc.f
    public final boolean W(View view, int i10) {
        int i11 = this.f11333f;
        return (i11 == -1 || i11 == i10) && this.f11334g.s(view);
    }

    @Override // kc.f
    public final int k(View view, int i10) {
        int width;
        int width2;
        int width3;
        boolean z10 = view.getLayoutDirection() == 1;
        int i11 = this.f11334g.f5504e;
        if (i11 == 0) {
            if (z10) {
                width = this.f11332e - view.getWidth();
                width2 = this.f11332e;
            } else {
                width = this.f11332e;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 != 1) {
            width = this.f11332e - view.getWidth();
            width2 = view.getWidth() + this.f11332e;
        } else if (z10) {
            width = this.f11332e;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f11332e - view.getWidth();
            width2 = this.f11332e;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // kc.f
    public final int l(View view, int i10) {
        return view.getTop();
    }
}

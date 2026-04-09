package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import h7.r1;
import i.a0;
import o.m;
import p.f;
import p.r2;
import p.x0;
import p.y0;
import u3.l0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public final Rect B;
    public x0 D;

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f973a;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f974d;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f975g;

    /* renamed from: r, reason: collision with root package name */
    public TypedValue f976r;

    /* renamed from: x, reason: collision with root package name */
    public TypedValue f977x;

    /* renamed from: y, reason: collision with root package name */
    public TypedValue f978y;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.B = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f977x == null) {
            this.f977x = new TypedValue();
        }
        return this.f977x;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f978y == null) {
            this.f978y = new TypedValue();
        }
        return this.f978y;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f975g == null) {
            this.f975g = new TypedValue();
        }
        return this.f975g;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f976r == null) {
            this.f976r = new TypedValue();
        }
        return this.f976r;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f973a == null) {
            this.f973a = new TypedValue();
        }
        return this.f973a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f974d == null) {
            this.f974d = new TypedValue();
        }
        return this.f974d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x0 x0Var = this.D;
        if (x0Var != null) {
            x0Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b bVar;
        super.onDetachedFromWindow();
        x0 x0Var = this.D;
        if (x0Var != null) {
            a0 a0Var = (a0) ((r1) x0Var).f10199d;
            y0 y0Var = a0Var.N;
            if (y0Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) y0Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((r2) actionBarOverlayLayout.f953x).f20152a.f1011a;
                if (actionMenuView != null && (bVar = actionMenuView.P) != null) {
                    bVar.g();
                    f fVar = bVar.Q;
                    if (fVar != null && fVar.b()) {
                        fVar.f18681i.dismiss();
                    }
                }
            }
            if (a0Var.S != null) {
                a0Var.H.getDecorView().removeCallbacks(a0Var.T);
                if (a0Var.S.isShowing()) {
                    try {
                        a0Var.S.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                a0Var.S = null;
            }
            l0 l0Var = a0Var.U;
            if (l0Var != null) {
                l0Var.b();
            }
            m mVar = a0Var.x(0).f11128h;
            if (mVar != null) {
                mVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(x0 x0Var) {
        this.D = x0Var;
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.h21;
import defpackage.h6;
import defpackage.od0;
import defpackage.ug0;
import defpackage.v1;
import defpackage.vm;
import defpackage.w61;
import defpackage.y1;
import defpackage.yi;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue f;
    public TypedValue g;
    public TypedValue h;
    public TypedValue i;
    public TypedValue j;
    public TypedValue k;
    public final Rect l;
    public yi m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.j == null) {
            this.j = new TypedValue();
        }
        return this.j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.k == null) {
            this.k = new TypedValue();
        }
        return this.k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yi yiVar = this.m;
        if (yiVar != null) {
            yiVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        y1 y1Var;
        super.onDetachedFromWindow();
        yi yiVar = this.m;
        if (yiVar != null) {
            h6 h6Var = (h6) ((ug0) yiVar).g;
            vm vmVar = h6Var.w;
            if (vmVar != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) vmVar;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((h21) actionBarOverlayLayout.j).a.f;
                if (actionMenuView != null && (y1Var = actionMenuView.y) != null) {
                    y1Var.c();
                    v1 v1Var = y1Var.y;
                    if (v1Var != null && v1Var.b()) {
                        v1Var.i.dismiss();
                    }
                }
            }
            if (h6Var.B != null) {
                h6Var.q.getDecorView().removeCallbacks(h6Var.C);
                if (h6Var.B.isShowing()) {
                    try {
                        h6Var.B.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                h6Var.B = null;
            }
            w61 w61Var = h6Var.D;
            if (w61Var != null) {
                w61Var.b();
            }
            od0 od0Var = h6Var.z(0).h;
            if (od0Var != null) {
                od0Var.c(true);
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

    public void setAttachListener(yi yiVar) {
        this.m = yiVar;
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import e4.c1;
import i.v;
import o.m;
import o7.c;
import p.d1;
import p.e1;
import p.g;
import p.k;
import p.n3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f784a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f785b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f786c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f787d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f788e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f789f;
    public final Rect g;

    /* renamed from: h, reason: collision with root package name */
    public d1 f790h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f788e == null) {
            this.f788e = new TypedValue();
        }
        return this.f788e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f789f == null) {
            this.f789f = new TypedValue();
        }
        return this.f789f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f786c == null) {
            this.f786c = new TypedValue();
        }
        return this.f786c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f787d == null) {
            this.f787d = new TypedValue();
        }
        return this.f787d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f784a == null) {
            this.f784a = new TypedValue();
        }
        return this.f784a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f785b == null) {
            this.f785b = new TypedValue();
        }
        return this.f785b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d1 d1Var = this.f790h;
        if (d1Var != null) {
            d1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        k kVar;
        super.onDetachedFromWindow();
        d1 d1Var = this.f790h;
        if (d1Var != null) {
            v vVar = (v) ((c) d1Var).f30419b;
            e1 e1Var = vVar.f25381r;
            if (e1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) e1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((n3) actionBarOverlayLayout.f725e).f30779a.f818a;
                if (actionMenuView != null && (kVar = actionMenuView.f749t) != null) {
                    kVar.h();
                    g gVar = kVar.f30742t;
                    if (gVar != null && gVar.b()) {
                        gVar.f30307i.dismiss();
                    }
                }
            }
            if (vVar.f25386w != null) {
                vVar.f25375l.getDecorView().removeCallbacks(vVar.f25387x);
                if (vVar.f25386w.isShowing()) {
                    try {
                        vVar.f25386w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vVar.f25386w = null;
            }
            c1 c1Var = vVar.f25388y;
            if (c1Var != null) {
                c1Var.b();
            }
            m mVar = vVar.B(0).f25356h;
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

    public void setAttachListener(d1 d1Var) {
        this.f790h = d1Var;
    }
}

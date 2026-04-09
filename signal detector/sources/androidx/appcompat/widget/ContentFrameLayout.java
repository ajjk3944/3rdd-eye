package androidx.appcompat.widget;

import A0.e;
import R.S;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import h.v;
import n.MenuC2677k;
import o.C2713g;
import o.C2723l;
import o.InterfaceC2710e0;
import o.InterfaceC2712f0;
import o.i1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f4876a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f4877b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f4878c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f4879d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f4880e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f4881f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f4882g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2710e0 f4883h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4882g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4880e == null) {
            this.f4880e = new TypedValue();
        }
        return this.f4880e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4881f == null) {
            this.f4881f = new TypedValue();
        }
        return this.f4881f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4878c == null) {
            this.f4878c = new TypedValue();
        }
        return this.f4878c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4879d == null) {
            this.f4879d = new TypedValue();
        }
        return this.f4879d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4876a == null) {
            this.f4876a = new TypedValue();
        }
        return this.f4876a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4877b == null) {
            this.f4877b = new TypedValue();
        }
        return this.f4877b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2710e0 interfaceC2710e0 = this.f4883h;
        if (interfaceC2710e0 != null) {
            interfaceC2710e0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2723l c2723l;
        super.onDetachedFromWindow();
        InterfaceC2710e0 interfaceC2710e0 = this.f4883h;
        if (interfaceC2710e0 != null) {
            v vVar = (v) ((e) interfaceC2710e0).f73b;
            InterfaceC2712f0 interfaceC2712f0 = vVar.f20388F;
            if (interfaceC2712f0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2712f0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((i1) actionBarOverlayLayout.f4835e).f22522a.f5005a;
                if (actionMenuView != null && (c2723l = actionMenuView.f4848H) != null) {
                    c2723l.g();
                    C2713g c2713g = c2723l.f22549I;
                    if (c2713g != null && c2713g.b()) {
                        c2713g.i.dismiss();
                    }
                }
            }
            if (vVar.f20393K != null) {
                vVar.f20420l.getDecorView().removeCallbacks(vVar.f20394L);
                if (vVar.f20393K.isShowing()) {
                    try {
                        vVar.f20393K.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vVar.f20393K = null;
            }
            S s5 = vVar.M;
            if (s5 != null) {
                s5.b();
            }
            MenuC2677k menuC2677k = vVar.G(0).f20375h;
            if (menuC2677k != null) {
                menuC2677k.c(true);
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

    public void setAttachListener(InterfaceC2710e0 interfaceC2710e0) {
        this.f4883h = interfaceC2710e0;
    }
}

package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.y;
import com.google.android.material.shape.MaterialShapeDrawable;
import d5.c;
import d5.e;
import j4.b;
import j4.j;
import j4.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.slf4j.Marker;

/* loaded from: classes2.dex */
public class BadgeDrawable extends Drawable implements y.b {

    /* renamed from: n, reason: collision with root package name */
    public static final int f9830n = k.Widget_MaterialComponents_Badge;

    /* renamed from: o, reason: collision with root package name */
    public static final int f9831o = b.badgeStyle;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f9832a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialShapeDrawable f9833b;

    /* renamed from: c, reason: collision with root package name */
    public final y f9834c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f9835d;

    /* renamed from: e, reason: collision with root package name */
    public final BadgeState f9836e;

    /* renamed from: f, reason: collision with root package name */
    public float f9837f;

    /* renamed from: g, reason: collision with root package name */
    public float f9838g;

    /* renamed from: h, reason: collision with root package name */
    public int f9839h;

    /* renamed from: i, reason: collision with root package name */
    public float f9840i;

    /* renamed from: j, reason: collision with root package name */
    public float f9841j;

    /* renamed from: k, reason: collision with root package name */
    public float f9842k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f9843l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f9844m;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public BadgeDrawable(Context context, int i10, int i11, int i12, BadgeState.State state) {
        this.f9832a = new WeakReference(context);
        a0.c(context);
        this.f9835d = new Rect();
        y yVar = new y(this);
        this.f9834c = yVar;
        yVar.g().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i10, i11, i12, state);
        this.f9836e = badgeState;
        this.f9833b = new MaterialShapeDrawable(com.google.android.material.shape.a.b(context, y() ? badgeState.m() : badgeState.i(), y() ? badgeState.l() : badgeState.h()).m());
        K();
    }

    public static void L(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public static BadgeDrawable e(Context context) {
        return new BadgeDrawable(context, 0, f9831o, f9830n, null);
    }

    public boolean A() {
        return this.f9836e.D();
    }

    public final void B() {
        this.f9834c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void C() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f9836e.e());
        if (this.f9833b.D() != colorStateListValueOf) {
            this.f9833b.i0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public final void D() {
        this.f9834c.l(true);
        F();
        N();
        invalidateSelf();
    }

    public final void E() {
        WeakReference weakReference = this.f9843l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f9843l.get();
        WeakReference weakReference2 = this.f9844m;
        M(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    public final void F() {
        Context context = (Context) this.f9832a.get();
        if (context == null) {
            return;
        }
        this.f9833b.setShapeAppearanceModel(com.google.android.material.shape.a.b(context, y() ? this.f9836e.m() : this.f9836e.i(), y() ? this.f9836e.l() : this.f9836e.h()).m());
        invalidateSelf();
    }

    public final void G() {
        e eVar;
        Context context = (Context) this.f9832a.get();
        if (context == null || this.f9834c.e() == (eVar = new e(context, this.f9836e.z()))) {
            return;
        }
        this.f9834c.k(eVar, context);
        H();
        N();
        invalidateSelf();
    }

    public final void H() {
        this.f9834c.g().setColor(this.f9836e.j());
        invalidateSelf();
    }

    public final void I() {
        O();
        this.f9834c.l(true);
        N();
        invalidateSelf();
    }

    public final void J() {
        setVisible(this.f9836e.F(), false);
    }

    public final void K() {
        F();
        G();
        I();
        D();
        B();
        C();
        H();
        E();
        N();
        J();
    }

    public void M(View view, FrameLayout frameLayout) {
        this.f9843l = new WeakReference(view);
        this.f9844m = new WeakReference(frameLayout);
        L(view);
        N();
        invalidateSelf();
    }

    public final void N() {
        Context context = (Context) this.f9832a.get();
        WeakReference weakReference = this.f9843l;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f9835d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f9844m;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        d(rect2, view);
        a.d(this.f9835d, this.f9837f, this.f9838g, this.f9841j, this.f9842k);
        float f10 = this.f9840i;
        if (f10 != -1.0f) {
            this.f9833b.e0(f10);
        }
        if (rect.equals(this.f9835d)) {
            return;
        }
        this.f9833b.setBounds(this.f9835d);
    }

    public final void O() {
        if (m() != -2) {
            this.f9839h = ((int) Math.pow(10.0d, m() - 1.0d)) - 1;
        } else {
            this.f9839h = n();
        }
    }

    @Override // com.google.android.material.internal.y.b
    public void a() {
        invalidateSelf();
    }

    public final void b(View view) {
        ViewParent viewParentJ = j();
        if (viewParentJ == null) {
            viewParentJ = view.getParent();
        }
        if ((viewParentJ instanceof View) && (viewParentJ.getParent() instanceof View)) {
            c(view, (View) viewParentJ.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void c(View view, View view2) {
        float y10;
        float x10;
        View parent;
        boolean z10;
        FrameLayout frameLayoutJ = j();
        if (frameLayoutJ == null) {
            float y11 = view.getY();
            x10 = view.getX();
            parent = view.getParent();
            y10 = y11;
        } else {
            y10 = 0.0f;
            x10 = 0.0f;
            parent = frameLayoutJ;
        }
        while (true) {
            z10 = parent instanceof View;
            if (!z10 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = parent;
            y10 += view3.getY();
            x10 += view3.getX();
            parent = parent.getParent();
        }
        if (z10) {
            float fV = v(y10);
            float fL = l(x10);
            View view4 = parent;
            float fH = h(view4.getHeight(), y10);
            float fR = r(view4.getWidth(), x10);
            if (fV < 0.0f) {
                this.f9838g += Math.abs(fV);
            }
            if (fL < 0.0f) {
                this.f9837f += Math.abs(fL);
            }
            if (fH > 0.0f) {
                this.f9838g -= Math.abs(fH);
            }
            if (fR > 0.0f) {
                this.f9837f -= Math.abs(fR);
            }
        }
    }

    public final void d(Rect rect, View view) {
        float f10 = y() ? this.f9836e.f9848d : this.f9836e.f9847c;
        this.f9840i = f10;
        if (f10 != -1.0f) {
            this.f9841j = f10;
            this.f9842k = f10;
        } else {
            this.f9841j = Math.round((y() ? this.f9836e.f9851g : this.f9836e.f9849e) / 2.0f);
            this.f9842k = Math.round((y() ? this.f9836e.f9852h : this.f9836e.f9850f) / 2.0f);
        }
        if (y()) {
            String strG = g();
            this.f9841j = Math.max(this.f9841j, (this.f9834c.h(strG) / 2.0f) + this.f9836e.g());
            float fMax = Math.max(this.f9842k, (this.f9834c.f(strG) / 2.0f) + this.f9836e.k());
            this.f9842k = fMax;
            this.f9841j = Math.max(this.f9841j, fMax);
        }
        int iX = x();
        int iF = this.f9836e.f();
        if (iF == 8388691 || iF == 8388693) {
            this.f9838g = rect.bottom - iX;
        } else {
            this.f9838g = rect.top + iX;
        }
        int iW = w();
        int iF2 = this.f9836e.f();
        if (iF2 == 8388659 || iF2 == 8388691) {
            this.f9837f = this.f9836e.f9856l == 0 ? view.getLayoutDirection() == 0 ? (rect.left + this.f9841j) - ((this.f9842k * 2.0f) - iW) : (rect.right - this.f9841j) + ((this.f9842k * 2.0f) - iW) : view.getLayoutDirection() == 0 ? (rect.left - this.f9841j) + iW : (rect.right + this.f9841j) - iW;
        } else {
            this.f9837f = this.f9836e.f9856l == 0 ? view.getLayoutDirection() == 0 ? (rect.right + this.f9841j) - iW : (rect.left - this.f9841j) + iW : view.getLayoutDirection() == 0 ? (rect.right - this.f9841j) + ((this.f9842k * 2.0f) - iW) : (rect.left + this.f9841j) - ((this.f9842k * 2.0f) - iW);
        }
        if (this.f9836e.E()) {
            b(view);
        } else {
            c(view, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f9833b.draw(canvas);
        if (y()) {
            f(canvas);
        }
    }

    public final void f(Canvas canvas) {
        String strG = g();
        if (strG != null) {
            Rect rect = new Rect();
            this.f9834c.g().getTextBounds(strG, 0, strG.length(), rect);
            float fExactCenterY = this.f9838g - rect.exactCenterY();
            canvas.drawText(strG, this.f9837f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f9834c.g());
        }
    }

    public final String g() {
        if (A()) {
            return t();
        }
        if (z()) {
            return p();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9836e.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9835d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9835d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final float h(float f10, float f11) {
        return ((this.f9838g + this.f9842k) - f10) + f11;
    }

    public CharSequence i() {
        if (isVisible()) {
            return A() ? u() : z() ? q() : k();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public FrameLayout j() {
        WeakReference weakReference = this.f9844m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final CharSequence k() {
        return this.f9836e.p();
    }

    public final float l(float f10) {
        return (this.f9837f - this.f9841j) + f10;
    }

    public int m() {
        return this.f9836e.u();
    }

    public int n() {
        return this.f9836e.v();
    }

    public int o() {
        if (this.f9836e.C()) {
            return this.f9836e.w();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.y.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final String p() {
        if (this.f9839h == -2 || o() <= this.f9839h) {
            return NumberFormat.getInstance(this.f9836e.x()).format(o());
        }
        Context context = (Context) this.f9832a.get();
        return context == null ? "" : String.format(this.f9836e.x(), context.getString(j.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f9839h), Marker.ANY_NON_NULL_MARKER);
    }

    public final String q() {
        Context context;
        if (this.f9836e.q() == 0 || (context = (Context) this.f9832a.get()) == null) {
            return null;
        }
        return (this.f9839h == -2 || o() <= this.f9839h) ? context.getResources().getQuantityString(this.f9836e.q(), o(), Integer.valueOf(o())) : context.getString(this.f9836e.n(), Integer.valueOf(this.f9839h));
    }

    public final float r(float f10, float f11) {
        return ((this.f9837f + this.f9841j) - f10) + f11;
    }

    public String s() {
        return this.f9836e.y();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f9836e.H(i10);
        B();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final String t() {
        String strS = s();
        int iM = m();
        if (iM == -2 || strS == null || strS.length() <= iM) {
            return strS;
        }
        Context context = (Context) this.f9832a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(j.m3_exceed_max_badge_text_suffix), strS.substring(0, iM - 1), "…");
    }

    public final CharSequence u() {
        CharSequence charSequenceO = this.f9836e.o();
        return charSequenceO != null ? charSequenceO : s();
    }

    public final float v(float f10) {
        return (this.f9838g - this.f9842k) + f10;
    }

    public final int w() {
        int iR = y() ? this.f9836e.r() : this.f9836e.s();
        if (this.f9836e.f9855k == 1) {
            iR += y() ? this.f9836e.f9854j : this.f9836e.f9853i;
        }
        return iR + this.f9836e.b();
    }

    public final int x() {
        int iB = this.f9836e.B();
        if (y()) {
            iB = this.f9836e.A();
            Context context = (Context) this.f9832a.get();
            if (context != null) {
                iB = k4.a.c(iB, iB - this.f9836e.t(), k4.a.b(0.0f, 1.0f, 0.3f, 1.0f, c.e(context) - 1.0f));
            }
        }
        if (this.f9836e.f9855k == 0) {
            iB -= Math.round(this.f9842k);
        }
        return iB + this.f9836e.c();
    }

    public final boolean y() {
        return A() || z();
    }

    public boolean z() {
        return !this.f9836e.D() && this.f9836e.C();
    }
}

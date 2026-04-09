package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p.a0;
import p.b0;
import p.d0;
import p.g0;

/* loaded from: classes.dex */
public final class c extends Spinner {
    public static final int[] E = {R.attr.spinnerMode};
    public int B;
    public final Rect D;

    /* renamed from: a, reason: collision with root package name */
    public final h7.b f1049a;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1050d;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f1051g;

    /* renamed from: r, reason: collision with root package name */
    public SpinnerAdapter f1052r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1053x;

    /* renamed from: y, reason: collision with root package name */
    public final g0 f1054y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r11, android.util.AttributeSet r12) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = h.a.spinnerStyle
            r10.<init>(r11, r12, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.D = r1
            android.content.Context r1 = r10.getContext()
            p.h2.a(r1, r10)
            int[] r1 = h.j.Spinner
            io.sentry.k r1 = io.sentry.k.h0(r11, r12, r1, r0)
            java.lang.Object r2 = r1.f12398g
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2
            h7.b r3 = new h7.b
            r3.<init>(r10)
            r10.f1049a = r3
            int r3 = h.j.Spinner_popupTheme
            r4 = 0
            int r3 = r2.getResourceId(r3, r4)
            if (r3 == 0) goto L35
            n.c r5 = new n.c
            r5.<init>(r11, r3)
            r10.f1050d = r5
            goto L37
        L35:
            r10.f1050d = r11
        L37:
            r3 = -1
            r5 = 0
            int[] r6 = androidx.appcompat.widget.c.E     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r12, r6, r0, r4)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            boolean r7 = r6.hasValue(r4)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L5b
            if (r7 == 0) goto L4d
            int r3 = r6.getInt(r4, r4)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L5b
            goto L4d
        L4a:
            r11 = move-exception
            r5 = r6
            goto L55
        L4d:
            r6.recycle()
            goto L5e
        L51:
            r11 = move-exception
            goto L55
        L53:
            r6 = r5
            goto L5b
        L55:
            if (r5 == 0) goto L5a
            r5.recycle()
        L5a:
            throw r11
        L5b:
            if (r6 == 0) goto L5e
            goto L4d
        L5e:
            r4 = 1
            if (r3 == 0) goto L9e
            if (r3 == r4) goto L64
            goto Lad
        L64:
            p.f0 r3 = new p.f0
            android.content.Context r6 = r10.f1050d
            r3.<init>(r10, r6, r12, r0)
            android.content.Context r6 = r10.f1050d
            int[] r7 = h.j.Spinner
            io.sentry.k r6 = io.sentry.k.h0(r6, r12, r7, r0)
            int r7 = h.j.Spinner_android_dropDownWidth
            java.lang.Object r8 = r6.f12398g
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = -2
            int r7 = r8.getLayoutDimension(r7, r9)
            r10.B = r7
            int r7 = h.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r7 = r6.U(r7)
            r3.k(r7)
            int r7 = h.j.Spinner_android_prompt
            java.lang.String r7 = r2.getString(r7)
            r3.Y = r7
            r6.l0()
            r10.f1054y = r3
            p.a0 r6 = new p.a0
            r6.<init>(r10, r10, r3)
            r10.f1051g = r6
            goto Lad
        L9e:
            p.c0 r3 = new p.c0
            r3.<init>(r10)
            r10.f1054y = r3
            int r6 = h.j.Spinner_android_prompt
            java.lang.String r6 = r2.getString(r6)
            r3.f20032g = r6
        Lad:
            int r3 = h.j.Spinner_android_entries
            java.lang.CharSequence[] r2 = r2.getTextArray(r3)
            if (r2 == 0) goto Lc5
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r6 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r11, r6, r2)
            int r11 = h.g.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r11)
            r10.setAdapter(r3)
        Lc5:
            r1.l0()
            r10.f1053x = r4
            android.widget.SpinnerAdapter r11 = r10.f1052r
            if (r11 == 0) goto Ld3
            r10.setAdapter(r11)
            r10.f1052r = r5
        Ld3:
            h7.b r11 = r10.f1049a
            r11.k(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.D;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h7.b bVar = this.f1049a;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g0 g0Var = this.f1054y;
        return g0Var != null ? g0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g0 g0Var = this.f1054y;
        return g0Var != null ? g0Var.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1054y != null ? this.B : super.getDropDownWidth();
    }

    public final g0 getInternalPopup() {
        return this.f1054y;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g0 g0Var = this.f1054y;
        return g0Var != null ? g0Var.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1050d;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g0 g0Var = this.f1054y;
        return g0Var != null ? g0Var.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        h7.b bVar = this.f1049a;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h7.b bVar = this.f1049a;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g0 g0Var = this.f1054y;
        if (g0Var == null || !g0Var.a()) {
            return;
        }
        g0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1054y == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.f969a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new o.d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        g0 g0Var = this.f1054y;
        appCompatSpinner$SavedState.f969a = g0Var != null && g0Var.a();
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a0 a0Var = this.f1051g;
        if (a0Var == null || !a0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        g0 g0Var = this.f1054y;
        if (g0Var == null) {
            return super.performClick();
        }
        if (g0Var.a()) {
            return true;
        }
        g0Var.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h7.b bVar = this.f1049a;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        h7.b bVar = this.f1049a;
        if (bVar != null) {
            bVar.n(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g0 g0Var = this.f1054y;
        if (g0Var == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            g0Var.m(i10);
            g0Var.d(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g0 g0Var = this.f1054y;
        if (g0Var != null) {
            g0Var.l(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1054y != null) {
            this.B = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g0 g0Var = this.f1054y;
        if (g0Var != null) {
            g0Var.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(ic.a.r(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g0 g0Var = this.f1054y;
        if (g0Var != null) {
            g0Var.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h7.b bVar = this.f1049a;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h7.b bVar = this.f1049a;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1053x) {
            this.f1052r = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        g0 g0Var = this.f1054y;
        if (g0Var != null) {
            Context context = this.f1050d;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            d0 d0Var = new d0();
            d0Var.f20045a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                d0Var.f20046b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                b0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            g0Var.p(d0Var);
        }
    }
}

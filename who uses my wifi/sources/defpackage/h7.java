package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h7 extends Spinner {
    public static final int[] n = {R.attr.spinnerMode};
    public final fw3 f;
    public final Context g;
    public final x6 h;
    public SpinnerAdapter i;
    public final boolean j;
    public final g7 k;
    public int l;
    public final Rect m;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h7(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130969759(0x7f04049f, float:1.7548209E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.m = r1
            android.content.Context r1 = r12.getContext()
            defpackage.n11.a(r1, r12)
            int[] r1 = defpackage.hn0.v
            xb4 r2 = defpackage.xb4.r(r13, r14, r1, r0)
            java.lang.Object r3 = r2.h
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            fw3 r4 = new fw3
            r4.<init>(r12)
            r12.f = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            nj r6 = new nj
            r6.<init>(r13, r4)
            r12.g = r6
            goto L37
        L35:
            r12.g = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = defpackage.h7.n     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L5b
            if (r8 == 0) goto L4d
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L5b
            goto L4d
        L4a:
            r13 = move-exception
            r6 = r7
            goto L55
        L4d:
            r7.recycle()
            goto L5e
        L51:
            r13 = move-exception
            goto L55
        L53:
            r7 = r6
            goto L5b
        L55:
            if (r6 == 0) goto L5a
            r6.recycle()
        L5a:
            throw r13
        L5b:
            if (r7 == 0) goto L5e
            goto L4d
        L5e:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L98
            if (r4 == r8) goto L65
            goto La5
        L65:
            e7 r4 = new e7
            android.content.Context r9 = r12.g
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.g
            xb4 r1 = defpackage.xb4.r(r9, r14, r1, r0)
            java.lang.Object r9 = r1.h
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.l = r9
            android.graphics.drawable.Drawable r9 = r1.m(r8)
            r4.f(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.H = r7
            r1.z()
            r12.k = r4
            x6 r1 = new x6
            r1.<init>(r12, r12, r4)
            r12.h = r1
            goto La5
        L98:
            a7 r1 = new a7
            r1.<init>(r12)
            r12.k = r1
            java.lang.String r4 = r3.getString(r7)
            r1.h = r4
        La5:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131493026(0x7f0c00a2, float:1.860952E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lbc:
            r2.z()
            r12.j = r8
            android.widget.SpinnerAdapter r13 = r12.i
            if (r13 == 0) goto Lca
            r12.setAdapter(r13)
            r12.i = r6
        Lca:
            fw3 r13 = r12.f
            r13.k(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
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
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
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
        Rect rect = this.m;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g7 g7Var = this.k;
        return g7Var != null ? g7Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g7 g7Var = this.k;
        return g7Var != null ? g7Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.k != null ? this.l : super.getDropDownWidth();
    }

    public final g7 getInternalPopup() {
        return this.k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g7 g7Var = this.k;
        return g7Var != null ? g7Var.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g7 g7Var = this.k;
        return g7Var != null ? g7Var.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            return fw3Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            return fw3Var.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g7 g7Var = this.k;
        if (g7Var == null || !g7Var.a()) {
            return;
        }
        g7Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.k == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f7 f7Var = (f7) parcelable;
        super.onRestoreInstanceState(f7Var.getSuperState());
        if (!f7Var.f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new y6(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        f7 f7Var = new f7(super.onSaveInstanceState());
        g7 g7Var = this.k;
        f7Var.f = g7Var != null && g7Var.a();
        return f7Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x6 x6Var = this.h;
        if (x6Var == null || !x6Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        g7 g7Var = this.k;
        if (g7Var == null) {
            return super.performClick();
        }
        if (g7Var.a()) {
            return true;
        }
        g7Var.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.n(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        g7 g7Var = this.k;
        if (g7Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            g7Var.j(i);
            g7Var.k(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        g7 g7Var = this.k;
        if (g7Var != null) {
            g7Var.g(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.k != null) {
            this.l = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g7 g7Var = this.k;
        if (g7Var != null) {
            g7Var.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(ob1.h(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g7 g7Var = this.k;
        if (g7Var != null) {
            g7Var.e(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.t(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.j) {
            this.i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        g7 g7Var = this.k;
        if (g7Var != null) {
            Context context = this.g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            b7 b7Var = new b7();
            b7Var.f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                b7Var.g = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                z6.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            g7Var.p(b7Var);
        }
    }
}

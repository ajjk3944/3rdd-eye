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
import com.google.android.gms.internal.ads.be1;
import jm.a;
import o.d;
import p.f0;
import p.g0;
import p.i0;
import p.l0;
import p.m0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f767i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final be1 f768a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f769b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f770c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f771d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f772e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f773f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f774h;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130969824(0x7f0404e0, float:1.754834E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f774h = r1
            android.content.Context r1 = r12.getContext()
            p.d3.a(r1, r12)
            int[] r1 = h.a.f24795v
            i0.f r2 = i0.f.J(r13, r14, r1, r0)
            java.lang.Object r3 = r2.f25417c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            com.google.android.gms.internal.ads.be1 r4 = new com.google.android.gms.internal.ads.be1
            r4.<init>(r12)
            r12.f768a = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            n.c r6 = new n.c
            r6.<init>(r13, r4)
            r12.f769b = r6
            goto L37
        L35:
            r12.f769b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = androidx.appcompat.widget.AppCompatSpinner.f767i     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            p.k0 r4 = new p.k0
            android.content.Context r9 = r12.f769b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f769b
            i0.f r1 = i0.f.J(r9, r14, r1, r0)
            java.lang.Object r9 = r1.f25417c
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.g = r9
            android.graphics.drawable.Drawable r9 = r1.A(r8)
            r4.j(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.D = r7
            r1.M()
            r12.f773f = r4
            p.f0 r1 = new p.f0
            r1.<init>(r12, r12, r4)
            r12.f770c = r1
            goto Laa
        L9d:
            p.h0 r1 = new p.h0
            r1.<init>(r12)
            r12.f773f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f30707c = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131493169(0x7f0c0131, float:1.860981E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.M()
            r12.f772e = r8
            android.widget.SpinnerAdapter r13 = r12.f771d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f771d = r6
        Lcf:
            com.google.android.gms.internal.ads.be1 r13 = r12.f768a
            r13.x(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
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
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
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
        Rect rect = this.f774h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        be1 be1Var = this.f768a;
        if (be1Var != null) {
            be1Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        m0 m0Var = this.f773f;
        return m0Var != null ? m0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        m0 m0Var = this.f773f;
        return m0Var != null ? m0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f773f != null ? this.g : super.getDropDownWidth();
    }

    public final m0 getInternalPopup() {
        return this.f773f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        m0 m0Var = this.f773f;
        return m0Var != null ? m0Var.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f769b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        m0 m0Var = this.f773f;
        return m0Var != null ? m0Var.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        be1 be1Var = this.f768a;
        if (be1Var != null) {
            return be1Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        be1 be1Var = this.f768a;
        if (be1Var != null) {
            return be1Var.v();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m0 m0Var = this.f773f;
        if (m0Var == null || !m0Var.a()) {
            return;
        }
        m0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        if (this.f773f == null || View.MeasureSpec.getMode(i4) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        l0 l0Var = (l0) parcelable;
        super.onRestoreInstanceState(l0Var.getSuperState());
        if (!l0Var.f30758a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        l0 l0Var = new l0(super.onSaveInstanceState());
        m0 m0Var = this.f773f;
        l0Var.f30758a = m0Var != null && m0Var.a();
        return l0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.f770c;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        m0 m0Var = this.f773f;
        if (m0Var == null) {
            return super.performClick();
        }
        if (m0Var.a()) {
            return true;
        }
        m0Var.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        be1 be1Var = this.f768a;
        if (be1Var != null) {
            be1Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        be1 be1Var = this.f768a;
        if (be1Var != null) {
            be1Var.A(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        m0 m0Var = this.f773f;
        if (m0Var == null) {
            super.setDropDownHorizontalOffset(i4);
        } else {
            m0Var.l(i4);
            m0Var.c(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        m0 m0Var = this.f773f;
        if (m0Var != null) {
            m0Var.k(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f773f != null) {
            this.g = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        m0 m0Var = this.f773f;
        if (m0Var != null) {
            m0Var.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(a.l(i4, getPopupContext()));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        m0 m0Var = this.f773f;
        if (m0Var != null) {
            m0Var.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        be1 be1Var = this.f768a;
        if (be1Var != null) {
            be1Var.F(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        be1 be1Var = this.f768a;
        if (be1Var != null) {
            be1Var.G(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f772e) {
            this.f771d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        m0 m0Var = this.f773f;
        if (m0Var != null) {
            Context context = this.f769b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            i0 i0Var = new i0();
            i0Var.f30711a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                i0Var.f30712b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                g0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            m0Var.o(i0Var);
        }
    }
}

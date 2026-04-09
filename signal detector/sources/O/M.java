package o;

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
import androidx.recyclerview.widget.C0305b;

/* loaded from: classes.dex */
public final class M extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0305b f22407a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22408b;

    /* renamed from: c, reason: collision with root package name */
    public final C2694E f22409c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f22410d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22411e;

    /* renamed from: f, reason: collision with root package name */
    public final L f22412f;

    /* renamed from: g, reason: collision with root package name */
    public int f22413g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f22414h;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public M(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130969719(0x7f040477, float:1.7548128E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f22414h = r1
            android.content.Context r1 = r12.getContext()
            o.W0.a(r1, r12)
            int[] r1 = g.AbstractC2327a.f20135w
            o.a1 r2 = o.a1.i(r13, r14, r1, r0)
            java.lang.Object r3 = r2.f22480c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            androidx.recyclerview.widget.b r4 = new androidx.recyclerview.widget.b
            r4.<init>(r12)
            r12.f22407a = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            m.c r6 = new m.c
            r6.<init>(r13, r4)
            r12.f22408b = r6
            goto L37
        L35:
            r12.f22408b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = o.M.i     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
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
            o.J r4 = new o.J
            android.content.Context r9 = r12.f22408b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f22408b
            o.a1 r1 = o.a1.i(r9, r14, r1, r0)
            java.lang.Object r9 = r1.f22480c
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.f22413g = r9
            android.graphics.drawable.Drawable r9 = r1.d(r8)
            r4.j(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f22393R = r7
            r1.j()
            r12.f22412f = r4
            o.E r1 = new o.E
            r1.<init>(r12, r12, r4)
            r12.f22409c = r1
            goto Laa
        L9d:
            o.G r1 = new o.G
            r1.<init>(r12)
            r12.f22412f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f22377c = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131493099(0x7f0c00eb, float:1.8609669E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.j()
            r12.f22411e = r8
            android.widget.SpinnerAdapter r13 = r12.f22410d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f22410d = r6
        Lcf:
            androidx.recyclerview.widget.b r13 = r12.f22407a
            r13.k(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.M.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i3 = 0;
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
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
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
        Rect rect = this.f22414h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0305b c0305b = this.f22407a;
        if (c0305b != null) {
            c0305b.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        L l2 = this.f22412f;
        return l2 != null ? l2.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        L l2 = this.f22412f;
        return l2 != null ? l2.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f22412f != null ? this.f22413g : super.getDropDownWidth();
    }

    public final L getInternalPopup() {
        return this.f22412f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        L l2 = this.f22412f;
        return l2 != null ? l2.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f22408b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        L l2 = this.f22412f;
        return l2 != null ? l2.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0305b c0305b = this.f22407a;
        if (c0305b != null) {
            return c0305b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0305b c0305b = this.f22407a;
        if (c0305b != null) {
            return c0305b.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        L l2 = this.f22412f;
        if (l2 == null || !l2.a()) {
            return;
        }
        l2.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i3, int i6) {
        super.onMeasure(i3, i6);
        if (this.f22412f == null || View.MeasureSpec.getMode(i3) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C2700K c2700k = (C2700K) parcelable;
        super.onRestoreInstanceState(c2700k.getSuperState());
        if (!c2700k.f22398a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new A3.C(3, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C2700K c2700k = new C2700K(super.onSaveInstanceState());
        L l2 = this.f22412f;
        c2700k.f22398a = l2 != null && l2.a();
        return c2700k;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2694E c2694e = this.f22409c;
        if (c2694e == null || !c2694e.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        L l2 = this.f22412f;
        if (l2 == null) {
            return super.performClick();
        }
        if (l2.a()) {
            return true;
        }
        this.f22412f.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0305b c0305b = this.f22407a;
        if (c0305b != null) {
            c0305b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0305b c0305b = this.f22407a;
        if (c0305b != null) {
            c0305b.n(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i3) {
        L l2 = this.f22412f;
        if (l2 == null) {
            super.setDropDownHorizontalOffset(i3);
        } else {
            l2.l(i3);
            l2.d(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i3) {
        L l2 = this.f22412f;
        if (l2 != null) {
            l2.k(i3);
        } else {
            super.setDropDownVerticalOffset(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i3) {
        if (this.f22412f != null) {
            this.f22413g = i3;
        } else {
            super.setDropDownWidth(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        L l2 = this.f22412f;
        if (l2 != null) {
            l2.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i3) {
        setPopupBackgroundDrawable(a4.t.i(getPopupContext(), i3));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        L l2 = this.f22412f;
        if (l2 != null) {
            l2.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0305b c0305b = this.f22407a;
        if (c0305b != null) {
            c0305b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0305b c0305b = this.f22407a;
        if (c0305b != null) {
            c0305b.t(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f22411e) {
            this.f22410d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        L l2 = this.f22412f;
        if (l2 != null) {
            Context context = this.f22408b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C2697H c2697h = new C2697H();
            c2697h.f22379a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c2697h.f22380b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC2695F.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            l2.o(c2697h);
        }
    }
}

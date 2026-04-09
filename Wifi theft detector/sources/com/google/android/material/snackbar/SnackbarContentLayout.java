package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import b5.k;
import j4.b;
import j4.d;
import j4.f;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements i5.a {

    /* renamed from: a, reason: collision with root package name */
    public TextView f11170a;

    /* renamed from: b, reason: collision with root package name */
    public Button f11171b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f11172c;

    /* renamed from: d, reason: collision with root package name */
    public int f11173d;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    public static void d(View view, int i10, int i11) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i10, view.getPaddingEnd(), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    @Override // i5.a
    public void a(int i10, int i11) {
        this.f11170a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f11170a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f11172c).setStartDelay(j11).start();
        if (this.f11171b.getVisibility() == 0) {
            this.f11171b.setAlpha(0.0f);
            this.f11171b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f11172c).setStartDelay(j11).start();
        }
    }

    @Override // i5.a
    public void b(int i10, int i11) {
        this.f11170a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f11170a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f11172c).setStartDelay(j11).start();
        if (this.f11171b.getVisibility() == 0) {
            this.f11171b.setAlpha(1.0f);
            this.f11171b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f11172c).setStartDelay(j11).start();
        }
    }

    public void c(float f10) {
        if (f10 != 1.0f) {
            this.f11171b.setTextColor(u4.a.j(u4.a.d(this, b.colorSurface), this.f11171b.getCurrentTextColor(), f10));
        }
    }

    public final boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f11170a.getPaddingTop() == i11 && this.f11170a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f11170a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f11171b;
    }

    public TextView getMessageView() {
        return this.f11170a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f11170a = (TextView) findViewById(f.snackbar_text);
        this.f11171b = (Button) findViewById(f.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(d.design_snackbar_padding_vertical);
        Layout layout = this.f11170a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f11173d <= 0 || this.f11171b.getMeasuredWidth() <= this.f11173d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f11173d = i10;
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11172c = k.g(context, b.motionEasingEmphasizedInterpolator, k4.a.f21835b);
    }
}

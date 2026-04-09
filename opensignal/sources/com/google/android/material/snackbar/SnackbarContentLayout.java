package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ed.b;
import ed.d;
import ed.f;
import fd.a;
import ge.i;
import ir.f0;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements i {

    /* renamed from: a, reason: collision with root package name */
    public TextView f5705a;

    /* renamed from: d, reason: collision with root package name */
    public Button f5706d;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f5707g;

    /* renamed from: r, reason: collision with root package name */
    public int f5708r;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5707g = f0.V(context, b.motionEasingEmphasizedInterpolator, a.f8823b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f5705a.getPaddingTop() == i11 && this.f5705a.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f5705a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i11, textView.getPaddingEnd(), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f5706d;
    }

    public TextView getMessageView() {
        return this.f5705a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f5705a = (TextView) findViewById(f.snackbar_text);
        this.f5706d = (Button) findViewById(f.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(d.design_snackbar_padding_vertical);
        Layout layout = this.f5705a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f5708r <= 0 || this.f5706d.getMeasuredWidth() <= this.f5708r) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f5708r = i10;
    }
}

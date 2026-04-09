package com.google.android.material.snackbar;

import J3.j;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apm.insight.R;
import com.bumptech.glide.d;
import e3.AbstractC2303a;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements j {

    /* renamed from: a, reason: collision with root package name */
    public TextView f18441a;

    /* renamed from: b, reason: collision with root package name */
    public Button f18442b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f18443c;

    /* renamed from: d, reason: collision with root package name */
    public int f18444d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18443c = d.P(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19928b);
    }

    public final boolean a(int i, int i3, int i6) {
        boolean z6;
        if (i != getOrientation()) {
            setOrientation(i);
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f18441a.getPaddingTop() == i3 && this.f18441a.getPaddingBottom() == i6) {
            return z6;
        }
        TextView textView = this.f18441a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i6);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i6);
        return true;
    }

    public Button getActionView() {
        return this.f18442b;
    }

    public TextView getMessageView() {
        return this.f18441a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f18441a = (TextView) findViewById(R.id.snackbar_text);
        this.f18442b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i3) throws Resources.NotFoundException {
        super.onMeasure(i, i3);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f18441a.getLayout();
        boolean z6 = layout != null && layout.getLineCount() > 1;
        if (!z6 || this.f18444d <= 0 || this.f18442b.getMeasuredWidth() <= this.f18444d) {
            if (!z6) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i3);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f18444d = i;
    }
}

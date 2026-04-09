package com.google.android.material.snackbar;

import L0.I;
import L0.S;
import L3.a;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import f4.C4334b;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public TextView f23041b;

    /* renamed from: c, reason: collision with root package name */
    public Button f23042c;

    /* renamed from: d, reason: collision with root package name */
    public int f23043d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C4334b.d(context, R.attr.motionEasingEmphasizedInterpolator, a.f4035b);
    }

    public final boolean a(int i, int i10, int i11) {
        boolean z10;
        if (i != getOrientation()) {
            setOrientation(i);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f23041b.getPaddingTop() == i10 && this.f23041b.getPaddingBottom() == i11) {
            return z10;
        }
        TextView textView = this.f23041b;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i10, textView.getPaddingEnd(), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f23042c;
    }

    public TextView getMessageView() {
        return this.f23041b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f23041b = (TextView) findViewById(R.id.snackbar_text);
        this.f23042c = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) throws Resources.NotFoundException {
        super.onMeasure(i, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f23041b.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f23043d <= 0 || this.f23042c.getMeasuredWidth() <= this.f23043d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i10);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f23043d = i;
    }
}

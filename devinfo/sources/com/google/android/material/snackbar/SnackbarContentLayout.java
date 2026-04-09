package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import nh.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f20567a;

    /* renamed from: b, reason: collision with root package name */
    public Button f20568b;

    /* renamed from: c, reason: collision with root package name */
    public int f20569c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.w(context, R.attr.motionEasingEmphasizedInterpolator, jc.a.f27483b);
    }

    public final boolean a(int i4, int i10, int i11) {
        boolean z3;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f20567a.getPaddingTop() == i10 && this.f20567a.getPaddingBottom() == i11) {
            return z3;
        }
        TextView textView = this.f20567a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i10, textView.getPaddingEnd(), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f20568b;
    }

    public TextView getMessageView() {
        return this.f20567a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f20567a = (TextView) findViewById(R.id.snackbar_text);
        this.f20568b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i10) throws Resources.NotFoundException {
        super.onMeasure(i4, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f20567a.getLayout();
        boolean z3 = layout != null && layout.getLineCount() > 1;
        if (!z3 || this.f20569c <= 0 || this.f20568b.getMeasuredWidth() <= this.f20569c) {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i4, i10);
    }

    public void setMaxInlineActionWidth(int i4) {
        this.f20569c = i4;
    }
}

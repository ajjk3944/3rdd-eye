package com.google.android.material.snackbar;

import F1.W;
import O3.c;
import O3.e;
import a4.AbstractC3764d;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f37669a;

    /* renamed from: b, reason: collision with root package name */
    private Button f37670b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f37671c;

    /* renamed from: d, reason: collision with root package name */
    private int f37672d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37671c = AbstractC3764d.g(context, O3.a.f16950D, P3.a.f18022b);
    }

    private static void a(View view, int i10, int i11) {
        if (W.S(view)) {
            W.z0(view, W.E(view), i10, W.D(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37669a.getPaddingTop() == i11 && this.f37669a.getPaddingBottom() == i12) {
            return z10;
        }
        a(this.f37669a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f37670b;
    }

    public TextView getMessageView() {
        return this.f37669a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f37669a = (TextView) findViewById(e.f17061G);
        this.f37670b = (Button) findViewById(e.f17060F);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.f17022d);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.f17021c);
        Layout layout = this.f37669a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f37672d <= 0 || this.f37670b.getMeasuredWidth() <= this.f37672d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f37672d = i10;
    }
}

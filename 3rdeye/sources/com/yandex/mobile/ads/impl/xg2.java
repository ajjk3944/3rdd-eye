package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class xg2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f35305a;

    public xg2(TextView textView) {
        this.f35305a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f35305a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}

package com.liuzh.deviceinfo.utilities;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        if (z3) {
            view.animate().scaleX(1.05f).scaleY(1.05f).start();
        } else {
            view.animate().scaleX(1.0f).scaleY(1.0f).start();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.requestLayout();
            viewGroup.postInvalidate();
        }
    }
}

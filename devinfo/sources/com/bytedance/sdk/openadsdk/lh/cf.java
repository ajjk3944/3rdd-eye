package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf extends View {
    private final int ouw;

    public cf(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        setMeasuredDimension(getMeasuredWidth(), this.ouw);
    }

    public cf(Context context, int i4) {
        super(context);
        setBackgroundColor(i4);
        this.ouw = osn.ouw(getContext(), 0.66f);
    }
}

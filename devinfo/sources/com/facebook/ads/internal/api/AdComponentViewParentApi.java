package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes.dex */
public interface AdComponentViewParentApi extends AdComponentView {
    void bringChildToFront(View view);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    void onMeasure(int i4, int i10);

    void onVisibilityChanged(View view, int i4);

    void setMeasuredDimension(int i4, int i10);
}

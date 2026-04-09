package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.AdClosedListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes.dex */
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int i4);

    void setIconSizeDp(int i4);

    void setOnAdClosedListener(AdClosedListener adClosedListener);

    void setSingleIcon(boolean z3);
}

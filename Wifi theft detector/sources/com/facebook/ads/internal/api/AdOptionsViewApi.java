package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.facebook.ads.AdClosedListener;

@Keep
@UiThread
/* loaded from: classes.dex */
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int i10);

    void setIconSizeDp(int i10);

    void setOnAdClosedListener(AdClosedListener adClosedListener);

    void setSingleIcon(boolean z10);
}

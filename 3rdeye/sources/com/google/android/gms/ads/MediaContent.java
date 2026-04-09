package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.zzbhh;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    Drawable getMainImage();

    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(Drawable drawable);

    zzbhh zza();

    boolean zzb();
}

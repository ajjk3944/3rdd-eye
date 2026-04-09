package com.google.android.gms.common.internal;

import android.net.Uri;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class ResourceUtils {
    private static final Uri zza = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath(AppIntroBaseFragmentKt.ARG_DRAWABLE).build();

    private ResourceUtils() {
    }
}

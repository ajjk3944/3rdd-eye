package com.google.android.recaptcha.internal;

import Ii.AbstractC3063k;
import Ii.N;
import android.webkit.WebView;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzfw {
    private final WebView zza;
    private final N zzb;

    public zzfw(WebView webView, N n10) {
        this.zza = webView;
        this.zzb = n10;
    }

    public final void zzb(String str, String... strArr) {
        AbstractC3063k.d(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }
}

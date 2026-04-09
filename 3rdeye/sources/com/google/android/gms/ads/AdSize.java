package com.google.android.gms.ads;

import F3.h;
import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import g0.C4356c;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    public static final AdSize BANNER = new AdSize(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    static {
        new AdSize(-3, 0, "search_v2");
    }

    public AdSize(int i, int i10) {
        this(i, i10, h.i(i == -1 ? "FULL" : String.valueOf(i), "x", i10 == -2 ? "AUTO" : String.valueOf(i10), "_as"));
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 0);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 0);
        if (iZza == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i10) {
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = i10;
        adSize.zzf = true;
        if (i10 < 32) {
            zzo.zzj("The maximum height set for the inline adaptive ad size was " + i10 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 2);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize adSizeZzd = com.google.android.gms.ads.internal.util.client.zzf.zzd(context, i, 50, 1);
        adSizeZzd.zze = true;
        return adSizeZzd;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i) {
        int iZza = com.google.android.gms.ads.internal.util.client.zzf.zza(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(Context context) {
        int i = this.zzc;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzr.zza(context.getResources().getDisplayMetrics());
        }
        zzbb.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(Context context) {
        int i = this.zzb;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            zzbb.zzb();
            return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzr> creator = zzr.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    public String toString() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final void zzc(int i) {
        this.zzg = i;
    }

    public final void zzd(int i) {
        this.zzi = i;
    }

    public final void zze(boolean z10) {
        this.zzf = true;
    }

    public final void zzf(boolean z10) {
        this.zzh = true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public AdSize(int i, int i10, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException(C4356c.h(i, "Invalid width for AdSize: "));
        }
        if (i10 < 0 && i10 != -2 && i10 != -4) {
            throw new IllegalArgumentException(C4356c.h(i10, "Invalid height for AdSize: "));
        }
        this.zzb = i;
        this.zzc = i10;
        this.zzd = str;
    }
}

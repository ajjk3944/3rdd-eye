package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import r1.AbstractC5515a;
import t1.C5594a;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzedc {
    private final Context zza;

    public zzedc(Context context) {
        this.zza = context;
    }

    public final A4.a zza(boolean z10) {
        try {
            C5594a c5594a = new C5594a(MobileAds.ERROR_DOMAIN, z10);
            AbstractC5515a.C0520a c0520aA = AbstractC5515a.a(this.zza);
            return c0520aA != null ? c0520aA.b(c5594a) : zzgdb.zzg(new IllegalStateException());
        } catch (Exception e4) {
            return zzgdb.zzg(e4);
        }
    }
}

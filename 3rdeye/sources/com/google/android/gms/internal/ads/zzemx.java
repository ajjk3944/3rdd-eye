package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.singular.sdk.internal.Constants;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzemx implements zzetu {
    private final Context zza;
    private final zzgdm zzb;

    public zzemx(zzgdm zzgdmVar, Context context) {
        this.zzb = zzgdmVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznb)).booleanValue()) {
            return zzgdb.zzh(new zzemy(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzgdb.zzh(new zzemy(null, false)) : this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzemy(Settings.Secure.getString(contentResolver2, Constants.AMAZON_ADVERTISING_ID), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }
}

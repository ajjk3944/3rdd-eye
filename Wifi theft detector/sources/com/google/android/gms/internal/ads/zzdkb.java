package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdkb extends zzdhd {
    public zzdkb(Set set) {
        super(set);
    }

    public final synchronized void zza(@Nullable final com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdka
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjy) obj).zzd(zzbjVar);
            }
        });
    }

    public final synchronized void zzb(@Nullable final String str) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((zzdjy) obj).zze(str);
            }
        });
    }
}

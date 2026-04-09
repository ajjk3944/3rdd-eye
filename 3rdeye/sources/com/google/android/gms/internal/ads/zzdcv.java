package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdcv extends zzdbm implements zzdcx {
    public zzdcv(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zza(String str) {
        final String str2 = "MalformedJson";
        zzq(new zzdbl(str2) { // from class: com.google.android.gms.internal.ads.zzdcp
            public final /* synthetic */ String zza = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzdcx) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzb(final String str, final String str2) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdcs
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzdcx) obj).zzb(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzc(final String str) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdcr
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzdcx) obj).zzc(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzd(final String str) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdct
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzdcx) obj).zzd(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zze() {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdcu
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzdcx) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zzf() {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdcq
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzdcx) obj).zzf();
            }
        });
    }
}

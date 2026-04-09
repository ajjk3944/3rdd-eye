package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcwd extends zzdbm implements zzcvv {
    public zzcwd(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcwc
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcwh) obj).zzr(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzd() {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcwb
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcwh) obj).zzr(zzfdp.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zze(final zzdgf zzdgfVar) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcwa
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                zzcwh zzcwhVar = (zzcwh) obj;
                String message = zzdgfVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzcwhVar.zzr(zzfdp.zzd(12, message, null));
            }
        });
    }
}

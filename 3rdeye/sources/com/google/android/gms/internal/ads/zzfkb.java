package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfkb extends com.google.android.gms.ads.internal.client.zzcj {
    private final zzfkh zza;
    private final zzfju zzb;

    public zzfkb(zzfkh zzfkhVar, zzfju zzfjuVar) {
        this.zza = zzfkhVar;
        this.zzb = zzfjuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final int zze(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return 0;
        }
        return this.zzb.zza(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final Bundle zzf(int i) {
        Map mapZzf = this.zzb.zzf(i);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapZzf.entrySet()) {
            bundle.putByteArray((String) entry.getKey(), SafeParcelableSerializer.serializeToBytes((com.google.android.gms.ads.internal.client.zzfv) entry.getValue()));
        }
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbau zzg(String str) {
        return this.zzb.zzb(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbau zzh(String str) {
        return this.zza.zza(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final com.google.android.gms.ads.internal.client.zzbx zzi(String str) {
        return this.zzb.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final com.google.android.gms.ads.internal.client.zzbx zzj(String str) {
        return this.zza.zzb(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final com.google.android.gms.ads.internal.client.zzfv zzk(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return null;
        }
        return this.zzb.zzd(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbwt zzl(String str) {
        return this.zzb.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbwt zzm(String str) {
        return this.zza.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzn(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzo(zzbpo zzbpoVar) {
        zzfkh zzfkhVar = this.zza;
        zzfkhVar.zzg(zzbpoVar);
        zzfkhVar.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzp(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        this.zza.zzh(list, zzceVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzq(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzh(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzr(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzi(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzs(String str) {
        return this.zza.zzj(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzt(String str) {
        return this.zza.zzk(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzu(String str) {
        return this.zza.zzl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzv(String str, com.google.android.gms.ads.internal.client.zzfv zzfvVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        return this.zzb.zzj(str, zzfvVar, zzchVar);
    }
}

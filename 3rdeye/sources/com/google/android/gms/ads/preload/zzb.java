package com.google.android.gms.ads.preload;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public class zzb {
    protected final zzck zza;
    private final AdFormat zzb;
    private final Context zzc;

    public zzb(Context context, AdFormat adFormat) {
        this.zza = com.google.android.gms.ads.zzb.zza(context);
        this.zzc = context.getApplicationContext();
        this.zzb = adFormat;
    }

    public final int zzb(String str) {
        try {
            return this.zza.zze(this.zzb.getValue(), str);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return 0;
        }
    }

    public final Context zzc() {
        return this.zzc;
    }

    public final PreloadConfiguration zzd(String str) {
        try {
            zzfv zzfvVarZzk = this.zza.zzk(this.zzb.getValue(), str);
            if (zzfvVarZzk == null) {
                return null;
            }
            return zzf.zzg(zzfvVarZzk);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return null;
        }
    }

    public final Map zze() {
        PreloadConfiguration preloadConfigurationZzg;
        try {
            Bundle bundleZzf = this.zza.zzf(this.zzb.getValue());
            HashMap map = new HashMap();
            for (String str : bundleZzf.keySet()) {
                byte[] byteArray = bundleZzf.getByteArray(str);
                if (byteArray != null && (preloadConfigurationZzg = zzf.zzg((zzfv) SafeParcelableSerializer.deserializeFromBytes(byteArray, zzfv.CREATOR))) != null) {
                    map.put(str, preloadConfigurationZzg);
                }
            }
            return map;
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return new HashMap();
        }
    }

    public final void zzf() {
        try {
            this.zza.zzn(this.zzb.getValue());
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final boolean zzg(String str) {
        try {
            return this.zza.zzq(this.zzb.getValue(), str);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return false;
        }
    }

    public final boolean zzh(String str) {
        try {
            return this.zza.zzr(this.zzb.getValue(), str);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return false;
        }
    }

    public final boolean zzi(String str, PreloadConfiguration preloadConfiguration) {
        if (str == null) {
            return false;
        }
        try {
            return this.zza.zzv(str, zzf.zzf(this.zzc, preloadConfiguration, this.zzb), null);
        } catch (RemoteException e4) {
            zzo.zzk("Failed to preload ad for preload ID " + str + ".", e4);
            return false;
        }
    }

    public final boolean zzj(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        if (str == null) {
            return false;
        }
        try {
            return this.zza.zzv(str, zzf.zzf(this.zzc, preloadConfiguration, this.zzb), preloadCallbackV2 == null ? null : new zza(this, preloadCallbackV2));
        } catch (RemoteException e4) {
            zzo.zzk("Failed to preload ad for preload ID " + str + ".", e4);
            return false;
        }
    }
}

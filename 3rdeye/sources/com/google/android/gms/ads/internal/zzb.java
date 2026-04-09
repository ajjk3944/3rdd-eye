package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbxy;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbxy zzc;
    private final zzbuw zzd = new zzbuw(false, Collections.EMPTY_LIST);

    public zzb(Context context, zzbxy zzbxyVar, zzbuw zzbuwVar) {
        this.zza = context;
        this.zzc = zzbxyVar;
    }

    private final boolean zzd() {
        zzbxy zzbxyVar = this.zzc;
        return (zzbxyVar != null && zzbxyVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbxy zzbxyVar = this.zzc;
            if (zzbxyVar != null) {
                zzbxyVar.zze(str, null, 3);
                return;
            }
            zzbuw zzbuwVar = this.zzd;
            if (!zzbuwVar.zza || (list = zzbuwVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzv.zzr();
                    com.google.android.gms.ads.internal.util.zzs.zzM(context, "", strReplace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}

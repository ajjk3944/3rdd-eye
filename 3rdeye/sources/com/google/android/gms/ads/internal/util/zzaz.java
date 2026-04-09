package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzaqk;
import com.google.android.gms.internal.ads.zzaqp;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzarc;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzfqj;
import com.google.android.gms.internal.ads.zzfqk;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzaz extends zzaqq {
    private final Context zzb;

    private zzaz(Context context, zzaqp zzaqpVar) {
        super(zzaqpVar);
        this.zzb = context;
    }

    public static zzaqe zzb(Context context) {
        zzaqe zzaqeVar = new zzaqe(new zzaqx(new File(zzfqk.zza(zzfqj.zza(), context.getCacheDir(), "admob_volley")), 20971520), new zzaz(context, new zzarc(null, null)), 4);
        zzaqeVar.zzd();
        return zzaqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqq, com.google.android.gms.internal.ads.zzapu
    public final zzapx zza(zzaqb zzaqbVar) throws zzaqk {
        if (zzaqbVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeF), zzaqbVar.zzk())) {
                Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzbb.zzb();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 13400000)) {
                    zzapx zzapxVarZza = new zzbma(context).zza(zzaqbVar);
                    if (zzapxVarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzaqbVar.zzk())));
                        return zzapxVarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzaqbVar.zzk())));
                }
            }
        }
        return super.zza(zzaqbVar);
    }
}

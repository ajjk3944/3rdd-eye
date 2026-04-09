package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfrx {
    private static zzfrx zzb;
    final zzfrt zza;

    private zzfrx(Context context) {
        this.zza = zzfrt.zzb(context);
        zzfrs.zza(context);
    }

    public static final zzfrx zza(Context context) {
        zzfrx zzfrxVar;
        synchronized (zzfrx.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfrx(context);
                }
                zzfrxVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfrxVar;
    }

    public final void zzb(zzfrr zzfrrVar) throws IOException {
        synchronized (zzfrx.class) {
            zzfrt zzfrtVar = this.zza;
            zzfrtVar.zze("vendor_scoped_gpid_v2_id");
            zzfrtVar.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}

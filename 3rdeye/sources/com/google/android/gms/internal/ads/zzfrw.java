package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfrw extends zzfru {
    private static zzfrw zzd;

    private zzfrw(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfrw zzi(Context context) {
        zzfrw zzfrwVar;
        synchronized (zzfrw.class) {
            try {
                if (zzd == null) {
                    zzd = new zzfrw(context);
                }
                zzfrwVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfrwVar;
    }

    public final zzfrr zzh(long j4, boolean z10) throws IOException {
        synchronized (zzfrw.class) {
            try {
                if (this.zzc.zzd()) {
                    return zzb(null, null, j4, z10);
                }
                return new zzfrr();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfrw.class) {
            try {
                if (zzg(false)) {
                    zzf(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

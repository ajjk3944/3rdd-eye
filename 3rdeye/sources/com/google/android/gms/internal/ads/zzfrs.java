package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfrs {
    private static zzfrs zzb;
    final zzfrt zza;

    private zzfrs(Context context) {
        this.zza = zzfrt.zzb(context);
    }

    public static final zzfrs zza(Context context) {
        zzfrs zzfrsVar;
        synchronized (zzfrs.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfrs(context);
                }
                zzfrsVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfrsVar;
    }

    public final void zzb(boolean z10) throws IOException {
        synchronized (zzfrs.class) {
            this.zza.zzd("paidv2_user_option", Boolean.valueOf(z10));
        }
    }

    public final void zzc(boolean z10) throws IOException {
        synchronized (zzfrs.class) {
            try {
                zzfrt zzfrtVar = this.zza;
                zzfrtVar.zzd("paidv2_publisher_option", Boolean.valueOf(z10));
                if (!z10) {
                    zzfrtVar.zze("paidv2_creation_time");
                    zzfrtVar.zze("paidv2_id");
                    zzfrtVar.zze("vendor_scoped_gpid_v2_id");
                    zzfrtVar.zze("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd() {
        boolean zZzf;
        synchronized (zzfrs.class) {
            zZzf = this.zza.zzf("paidv2_publisher_option", true);
        }
        return zZzf;
    }

    public final boolean zze() {
        boolean zZzf;
        synchronized (zzfrs.class) {
            zZzf = this.zza.zzf("paidv2_user_option", true);
        }
        return zZzf;
    }
}

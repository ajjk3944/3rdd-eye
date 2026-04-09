package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfrv extends zzfru {
    private static zzfrv zzd;

    private zzfrv(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfrv zzj(Context context) {
        zzfrv zzfrvVar;
        synchronized (zzfrv.class) {
            try {
                if (zzd == null) {
                    zzd = new zzfrv(context);
                }
                zzfrvVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfrvVar;
    }

    public final zzfrr zzh(long j4, boolean z10) throws IOException {
        zzfrr zzfrrVarZzb;
        synchronized (zzfrv.class) {
            zzfrrVarZzb = zzb(null, null, j4, z10);
        }
        return zzfrrVarZzb;
    }

    public final zzfrr zzi(String str, String str2, long j4, boolean z10) throws IOException {
        zzfrr zzfrrVarZzb;
        synchronized (zzfrv.class) {
            zzfrrVarZzb = zzb(str, str2, j4, z10);
        }
        return zzfrrVarZzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfrv.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfrv.class) {
            zzf(true);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzabd extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzabb zzd;
    private boolean zze;

    public /* synthetic */ zzabd(zzabb zzabbVar, SurfaceTexture surfaceTexture, boolean z10, zzabc zzabcVar) {
        super(surfaceTexture);
        this.zzd = zzabbVar;
        this.zza = z10;
    }

    public static zzabd zza(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !zzb(context)) {
            z11 = false;
        }
        zzdd.zzf(z11);
        return new zzabb().zza(z10 ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        try {
            if (!zzc) {
                zzb = zzdr.zzd(context) ? zzdr.zze() ? 1 : 2 : 0;
                zzc = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzabb zzabbVar = this.zzd;
        synchronized (zzabbVar) {
            try {
                if (!this.zze) {
                    zzabbVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

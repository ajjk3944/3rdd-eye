package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
final class zzakv {
    public final zzalc zza;
    public final zzalf zzb;
    public final zzagh zzc;

    @Nullable
    public final zzagi zzd;
    public int zze;

    @Nullable
    public zzv zzf;

    public zzakv(zzalc zzalcVar, zzalf zzalfVar, zzagh zzaghVar) {
        this.zza = zzalcVar;
        this.zzb = zzalfVar;
        this.zzc = zzaghVar;
        this.zzd = MimeTypes.AUDIO_TRUEHD.equals(zzalcVar.zzg.zzo) ? new zzagi() : null;
    }
}

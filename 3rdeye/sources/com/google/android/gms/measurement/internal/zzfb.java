package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzfb {

    @VisibleForTesting
    final String zza;
    final /* synthetic */ zzfd zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    public /* synthetic */ zzfb(zzfd zzfdVar, String str, long j4, zzfa zzfaVar) {
        this.zzb = zzfdVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j4 > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j4;
    }

    private final long zzc() {
        return this.zzb.zza().getLong(this.zza, 0L);
    }

    private final void zzd() {
        this.zzb.zzg();
        long jCurrentTimeMillis = this.zzb.zzs.zzav().currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.zzb.zza().edit();
        editorEdit.remove(this.zzc);
        editorEdit.remove(this.zzd);
        editorEdit.putLong(this.zza, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public final Pair zza() {
        long jAbs;
        this.zzb.zzg();
        this.zzb.zzg();
        long jZzc = zzc();
        if (jZzc == 0) {
            zzd();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jZzc - this.zzb.zzs.zzav().currentTimeMillis());
        }
        long j4 = this.zze;
        if (jAbs < j4) {
            return null;
        }
        if (jAbs > j4 + j4) {
            zzd();
            return null;
        }
        String string = this.zzb.zza().getString(this.zzd, null);
        long j10 = this.zzb.zza().getLong(this.zzc, 0L);
        zzd();
        return (string == null || j10 <= 0) ? zzfd.zza : new Pair(string, Long.valueOf(j10));
    }

    public final void zzb(String str, long j4) {
        this.zzb.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        long j10 = this.zzb.zza().getLong(this.zzc, 0L);
        if (j10 <= 0) {
            SharedPreferences.Editor editorEdit = this.zzb.zza().edit();
            editorEdit.putString(this.zzd, str);
            editorEdit.putLong(this.zzc, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = this.zzb.zzs.zzv().zzG().nextLong();
        long j11 = j10 + 1;
        long j12 = Long.MAX_VALUE / j11;
        SharedPreferences.Editor editorEdit2 = this.zzb.zza().edit();
        if ((Long.MAX_VALUE & jNextLong) < j12) {
            editorEdit2.putString(this.zzd, str);
        }
        editorEdit2.putLong(this.zzc, j11);
        editorEdit2.apply();
    }
}

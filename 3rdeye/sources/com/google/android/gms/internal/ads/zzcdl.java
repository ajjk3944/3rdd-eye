package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzcdl implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcdl(zzcbz zzcbzVar) {
        Context context = zzcbzVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzv.zzr().zzc(context, zzcbzVar.zzm().afmaVersion);
        this.zzc = new WeakReference(zzcbzVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzcdl zzcdlVar, String str, Map map) {
        zzcbz zzcbzVar = (zzcbz) zzcdlVar.zzc.get();
        if (zzcbzVar != null) {
            zzcbzVar.zzd("onPrecacheEvent", map);
        }
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdk(this, str, str2, str3, str4));
    }

    public final void zzh(String str, String str2, int i) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdi(this, str, str2, i));
    }

    public final void zzj(String str, String str2, long j4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdj(this, str, str2, j4));
    }

    public final void zzn(String str, String str2, int i, int i10, long j4, long j10, boolean z10, int i11, int i12) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdh(this, str, str2, i, i10, j4, j10, z10, i11, i12));
    }

    public final void zzo(String str, String str2, long j4, long j10, boolean z10, long j11, long j12, long j13, int i, int i10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdg(this, str, str2, j4, j10, j11, j12, j13, z10, i, i10));
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcdd zzcddVar) {
        return zzt(str);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public void zzp(int i) {
    }

    public void zzq(int i) {
    }

    public void zzr(int i) {
    }

    public void zzs(int i) {
    }
}

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzayi implements Callable {
    protected final zzawv zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzasr zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzayi(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10) {
        this.zza = zzawvVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzasrVar;
        this.zzf = i;
        this.zzg = i10;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            zzawv zzawvVar = this.zza;
            Method methodZzi = zzawvVar.zzi(this.zzb, this.zzc);
            this.zze = methodZzi;
            if (methodZzi == null) {
                return null;
            }
            zza();
            zzavm zzavmVarZzd = zzawvVar.zzd();
            if (zzavmVarZzd == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzavmVarZzd.zzc(this.zzg, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;
}

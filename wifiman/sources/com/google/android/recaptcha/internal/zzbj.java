package com.google.android.recaptcha.internal;

import ch.AbstractC4260a;
import kotlin.text.t;

/* loaded from: classes3.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return "avgExecutionTime: " + t.w0(String.valueOf(this.zzb / this.zza), 10, (char) 0, 2, null) + " us| maxExecutionTime: " + t.w0(String.valueOf(this.zzc), 10, (char) 0, 2, null) + " us| totalTime: " + t.w0(String.valueOf(this.zzb), 10, (char) 0, 2, null) + " us| #Usages: " + t.w0(String.valueOf(this.zza), 5, (char) 0, 2, null);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return AbstractC4260a.e(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}

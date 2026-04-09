package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzri extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzri(int i10, zzv zzvVar, boolean z10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 25);
        sb.append("AudioTrack write failed: ");
        sb.append(i10);
        super(sb.toString());
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzvVar;
    }
}

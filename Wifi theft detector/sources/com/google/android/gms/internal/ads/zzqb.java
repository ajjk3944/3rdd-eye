package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzqb extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzqb(int i10, boolean z10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 26);
        sb.append("AudioOutput write failed: ");
        sb.append(i10);
        super(sb.toString());
        this.zzb = z10;
        this.zza = i10;
    }
}

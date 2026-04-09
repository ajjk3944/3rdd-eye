package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzakp implements zzagc {
    public static final zzakp zza = new zzakp(true);
    public static final zzakp zzb = new zzakp(false);
    public final boolean zzc;

    private zzakp(boolean z10) {
        this.zzc = z10;
    }

    public final String toString() {
        boolean z10 = !this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(z10).length() + 33);
        sb.append("IncorrectFragmentation{expected=");
        sb.append(z10);
        sb.append("}");
        return sb.toString();
    }
}

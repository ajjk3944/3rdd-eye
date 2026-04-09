package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzecr extends Exception {
    private final int zza;

    public zzecr(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzecr(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzecr(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}

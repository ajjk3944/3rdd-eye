package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzat extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzat(@Nullable String str, @Nullable Throwable th, boolean z10, int i10) {
        super(str, th);
        this.zza = z10;
        this.zzb = i10;
    }

    public static zzat zza(@Nullable String str, @Nullable Throwable th) {
        return new zzat(str, th, true, 0);
    }

    public static zzat zzb(@Nullable String str, @Nullable Throwable th) {
        return new zzat(str, th, true, 1);
    }

    public static zzat zzc(@Nullable String str) {
        return new zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        boolean z10 = this.zza;
        int i10 = this.zzb;
        StringBuilder sb = new StringBuilder(strConcat.length() + 20 + String.valueOf(z10).length() + 11 + String.valueOf(i10).length() + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z10);
        sb.append(", dataType=");
        sb.append(i10);
        sb.append("}");
        return sb.toString();
    }
}

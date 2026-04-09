package com.google.android.gms.internal.ads;

import B4.f;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzin extends zzba {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzz zzf;
    public final int zzg;
    public final zzvh zzh;
    final boolean zzi;

    private zzin(int i, Throwable th, int i10) {
        this(i, th, null, i10, null, -1, null, 4, null, false);
    }

    public static zzin zzb(Throwable th, String str, int i, zzz zzzVar, int i10, zzvh zzvhVar, boolean z10, int i11) {
        if (zzzVar == null) {
            i10 = 4;
        }
        return new zzin(1, th, null, i11, str, i, zzzVar, i10, zzvhVar, z10);
    }

    public static zzin zzc(IOException iOException, int i) {
        return new zzin(0, iOException, i);
    }

    public static zzin zzd(RuntimeException runtimeException, int i) {
        return new zzin(2, runtimeException, i);
    }

    public final zzin zza(zzvh zzvhVar) {
        String message = getMessage();
        String str = zzex.zza;
        return new zzin(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzvhVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzin(int i, Throwable th, String str, int i10, String str2, int i11, zzz zzzVar, int i12, zzvh zzvhVar, boolean z10) {
        String str3;
        int i13;
        String strC;
        String str4;
        if (i == 0) {
            str3 = str2;
            i13 = i11;
            strC = "Source error";
        } else if (i != 1) {
            strC = "Unexpected runtime error";
            str3 = str2;
            i13 = i11;
        } else {
            String strValueOf = String.valueOf(zzzVar);
            String str5 = zzex.zza;
            if (i12 == 0) {
                str4 = "NO";
            } else if (i12 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i13 = i11;
            sb.append(i13);
            sb.append(", format=");
            sb.append(strValueOf);
            strC = f.c(sb, ", format_supported=", str4);
        }
        this(TextUtils.isEmpty(null) ? strC : strC.concat(": null"), th, i10, i, str3, i13, zzzVar, i12, zzvhVar, SystemClock.elapsedRealtime(), z10);
    }

    private zzin(String str, Throwable th, int i, int i10, String str2, int i11, zzz zzzVar, int i12, zzvh zzvhVar, long j4, boolean z10) {
        boolean z11;
        super(str, th, i, Bundle.EMPTY, j4);
        if (!z10) {
            z11 = true;
        } else if (i10 == 1) {
            i10 = 1;
            z11 = true;
        } else {
            z11 = false;
        }
        zzdd.zzd(z11);
        zzdd.zzd(th != null);
        this.zzc = i10;
        this.zzd = str2;
        this.zze = i11;
        this.zzf = zzzVar;
        this.zzg = i12;
        this.zzh = zzvhVar;
        this.zzi = z10;
    }
}

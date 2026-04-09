package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzadx {
    public static int zza(zzadu zzaduVar, byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int iZzb = zzaduVar.zzb(bArr, i + i11, i10 - i11);
            if (iZzb == -1) {
                break;
            }
            i11 += iZzb;
        }
        return i11;
    }

    public static void zzb(boolean z10, String str) throws zzaz {
        if (!z10) {
            throw zzaz.zza(str, null);
        }
    }

    public static boolean zzc(zzadu zzaduVar, byte[] bArr, int i, int i10, boolean z10) throws IOException {
        try {
            return zzaduVar.zzm(bArr, 0, i10, z10);
        } catch (EOFException e4) {
            if (z10) {
                return false;
            }
            throw e4;
        }
    }

    public static boolean zzd(zzadu zzaduVar, byte[] bArr, int i, int i10) throws IOException {
        try {
            zzaduVar.zzi(bArr, i, i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzadu zzaduVar, int i) throws IOException {
        try {
            zzaduVar.zzk(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}

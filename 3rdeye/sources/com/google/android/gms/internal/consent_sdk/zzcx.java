package com.google.android.gms.internal.consent_sdk;

import g0.C4356c;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes2.dex */
public final class zzcx {
    public static int zza(int i, int i10, String str) {
        String strZza;
        if (i >= 0 && i < i10) {
            return i;
        }
        if (i < 0) {
            strZza = zzcy.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(C4356c.h(i10, "negative size: "));
            }
            strZza = zzcy.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i10, String str) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(zzd(i, i10, "index"));
        }
        return i;
    }

    public static void zzc(int i, int i10, int i11) {
        if (i < 0 || i10 < i || i10 > i11) {
            throw new IndexOutOfBoundsException((i < 0 || i > i11) ? zzd(i, i11, "start index") : (i10 < 0 || i10 > i11) ? zzd(i10, i11, "end index") : zzcy.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i)));
        }
    }

    private static String zzd(int i, int i10, String str) {
        if (i < 0) {
            return zzcy.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return zzcy.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(C4356c.h(i10, "negative size: "));
    }
}

package com.google.android.gms.internal.ads;

import g0.C4356c;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfve {
    public static int zza(int i, int i10, String str) {
        String strZzb;
        if (i >= 0 && i < i10) {
            return i;
        }
        if (i < 0) {
            strZzb = zzfvv.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(C4356c.h(i10, "negative size: "));
            }
            strZzb = zzfvv.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i, int i10, String str) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(zzn(i, i10, "index"));
        }
        return i;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfvv.zzb(str, obj2));
    }

    public static void zze(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzfvv.zzb(str, Character.valueOf(c10)));
        }
    }

    public static void zzh(boolean z10, String str, long j4) {
        if (!z10) {
            throw new IllegalArgumentException(zzfvv.zzb(str, Long.valueOf(j4)));
        }
    }

    public static void zzi(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(zzfvv.zzb(str, obj));
        }
    }

    public static void zzj(boolean z10, String str, int i, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(zzfvv.zzb(str, Integer.valueOf(i), Integer.valueOf(i10)));
        }
    }

    public static void zzk(int i, int i10, int i11) {
        if (i < 0 || i10 < i || i10 > i11) {
            throw new IndexOutOfBoundsException((i < 0 || i > i11) ? zzn(i, i11, "start index") : (i10 < 0 || i10 > i11) ? zzn(i10, i11, "end index") : zzfvv.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i)));
        }
    }

    public static void zzl(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzm(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzn(int i, int i10, String str) {
        if (i < 0) {
            return zzfvv.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return zzfvv.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(C4356c.h(i10, "negative size: "));
    }
}

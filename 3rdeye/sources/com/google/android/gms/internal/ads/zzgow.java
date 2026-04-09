package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgow extends RuntimeException {
    public zzgow(String str) {
        super(str);
    }

    public static Object zza(zzgov zzgovVar) {
        try {
            return zzgovVar.zza();
        } catch (Exception e4) {
            throw new zzgow(e4);
        }
    }

    public zzgow(String str, Throwable th) {
        super(str, th);
    }

    public zzgow(Throwable th) {
        super(th);
    }
}

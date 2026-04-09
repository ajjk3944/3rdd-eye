package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfup implements zzfvf {
    public static zzfup zzc(char c10) {
        return new zzfum(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}

package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfqw implements Closeable {
    public static zzfri zza() {
        return new zzfri();
    }

    public static zzfri zzb(final int i, zzfrh zzfrhVar) {
        return new zzfri(new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfqu
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return Integer.valueOf(i);
            }
        }, new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfqv
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return zzfqw.zze();
            }
        }, zzfrhVar);
    }

    public static zzfri zzc(zzfvw<Integer> zzfvwVar, zzfvw<Integer> zzfvwVar2, zzfrh zzfrhVar) {
        return new zzfri(zzfvwVar, zzfvwVar2, zzfrhVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}

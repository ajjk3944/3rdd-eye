package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzbft extends zzcen {
    final /* synthetic */ zzbfz zza;

    public zzbft(zzbfz zzbfzVar) {
        Objects.requireNonNull(zzbfzVar);
        this.zza = zzbfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcen, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        this.zza.zzb();
        return super.cancel(z10);
    }
}

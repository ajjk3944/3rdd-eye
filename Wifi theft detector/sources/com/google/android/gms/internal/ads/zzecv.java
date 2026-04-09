package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
final /* synthetic */ class zzecv implements zzgyw {
    static final /* synthetic */ zzecv zza = new zzecv();

    private /* synthetic */ zzecv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return zzgzo.zzc(cause);
    }
}

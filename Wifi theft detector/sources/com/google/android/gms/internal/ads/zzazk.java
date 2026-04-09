package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzazk {
    private final com.google.common.util.concurrent.a zza;

    public zzazk(final Context context, Executor executor) {
        this.zza = zzgzo.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzazj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return zzfvo.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final com.google.common.util.concurrent.a zza() {
        return this.zza;
    }
}

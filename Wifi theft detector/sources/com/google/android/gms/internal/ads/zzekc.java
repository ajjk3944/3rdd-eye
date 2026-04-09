package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzekc {

    @Nullable
    private MeasurementManagerFutures zza;
    private final Context zzb;

    public zzekc(Context context) {
        this.zzb = context;
    }

    public final com.google.common.util.concurrent.a zza() {
        try {
            MeasurementManagerFutures measurementManagerFuturesA = MeasurementManagerFutures.a(this.zzb);
            this.zza = measurementManagerFuturesA;
            return measurementManagerFuturesA == null ? zzgzo.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesA.b();
        } catch (Exception e10) {
            return zzgzo.zzc(e10);
        }
    }

    public final com.google.common.util.concurrent.a zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.c(uri, inputEvent);
        } catch (Exception e10) {
            return zzgzo.zzc(e10);
        }
    }
}

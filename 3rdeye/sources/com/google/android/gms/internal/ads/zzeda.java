package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;
import q1.AbstractC5488a;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeda {
    private AbstractC5488a zza;
    private final Context zzb;

    public zzeda(Context context) {
        this.zzb = context;
    }

    public final A4.a zza() {
        try {
            AbstractC5488a.C0513a c0513aA = AbstractC5488a.a(this.zzb);
            this.zza = c0513aA;
            return c0513aA == null ? zzgdb.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : c0513aA.d();
        } catch (Exception e4) {
            return zzgdb.zzg(e4);
        }
    }

    public final A4.a zzb(Uri uri, InputEvent inputEvent) {
        try {
            AbstractC5488a abstractC5488a = this.zza;
            Objects.requireNonNull(abstractC5488a);
            return abstractC5488a.b(uri, inputEvent);
        } catch (Exception e4) {
            return zzgdb.zzg(e4);
        }
    }
}

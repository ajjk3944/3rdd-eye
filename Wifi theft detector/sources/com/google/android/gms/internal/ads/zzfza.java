package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzfza {

    @NotNull
    private final zzfyw zza;

    @PublishedApi
    public final /* synthetic */ zzfyy zza() {
        zzibr zzibrVarZzbu = this.zza.zzbu();
        kotlin.jvm.internal.p.d(zzibrVarZzbu, "build(...)");
        return (zzfyy) zzibrVarZzbu;
    }

    @JvmName(name = "getQueryIdToAdQualityDataMapMap")
    public final /* synthetic */ zziev zzb() {
        Map mapZzb = this.zza.zzb();
        kotlin.jvm.internal.p.d(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziev(mapZzb);
    }

    @JvmName(name = "putQueryIdToAdQualityDataMap")
    public final void zzc(@NotNull zziev zzievVar, @NotNull String key, @NotNull zzfyu value) {
        kotlin.jvm.internal.p.e(zzievVar, "<this>");
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(value, "value");
        this.zza.zzc(key, value);
    }

    @JvmName(name = "removeQueryIdToAdQualityDataMap")
    public final /* synthetic */ void zzd(zziev zzievVar, String key) {
        kotlin.jvm.internal.p.e(zzievVar, "<this>");
        kotlin.jvm.internal.p.e(key, "key");
        this.zza.zza(key);
    }
}

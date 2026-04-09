package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcwh implements zzcwi {
    private final Map zza;

    public zzcwh(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    @Nullable
    public final zzekg zza(int i10, String str) {
        return (zzekg) this.zza.get(str);
    }
}

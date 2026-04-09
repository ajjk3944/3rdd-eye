package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import m0.C5315h;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
final class zzfm extends C5315h {
    final /* synthetic */ zzfp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(zzfp zzfpVar, int i) {
        super(20);
        this.zza = zzfpVar;
    }

    @Override // m0.C5315h
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfp.zzd(this.zza, str);
    }
}

package com.google.android.gms.measurement.internal;

import androidx.work.s;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzje extends zzap {
    final /* synthetic */ zzjs zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzje(zzjs zzjsVar, zzgt zzgtVar) {
        super(zzgtVar);
        this.zza = zzjsVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        s.m(this.zza.zzs, "Tasks have been queued for a long time");
    }
}

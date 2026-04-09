package com.google.android.recaptcha.internal;

import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zzbp extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzbq zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbp(zzbq zzbqVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzg = zzbqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= PduHandle.NONE;
        return this.zzg.zza(null, 0L, 0L, 0.0d, null, this);
    }
}

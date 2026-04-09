package com.google.android.recaptcha.internal;

import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zzcs extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    Object zzb;
    Object zzc;
    long zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzcv zzf;
    int zzg;
    String zzh;
    zzch zzi;
    zzbi zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcs(zzcv zzcvVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzf = zzcvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= PduHandle.NONE;
        return this.zzf.zzg(null, 0L, null, null, null, this);
    }
}

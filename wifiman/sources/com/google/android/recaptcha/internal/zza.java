package com.google.android.recaptcha.internal;

import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zza extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zza(zze zzeVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzd = zzeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        this.zzc = obj;
        this.zze |= PduHandle.NONE;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == AbstractC5467b.g() ? objZzc : u.a(objZzc);
    }
}

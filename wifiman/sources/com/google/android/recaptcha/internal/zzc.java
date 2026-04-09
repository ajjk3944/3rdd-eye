package com.google.android.recaptcha.internal;

import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zzc extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(zze zzeVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzc = zzeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        this.zzb = obj;
        this.zzd |= PduHandle.NONE;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == AbstractC5467b.g() ? objZze : u.a(objZze);
    }
}

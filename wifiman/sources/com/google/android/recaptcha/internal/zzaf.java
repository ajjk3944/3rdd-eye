package com.google.android.recaptcha.internal;

import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zzaf extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzan zzb;
    int zzc;
    zzan zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaf(zzan zzanVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzb = zzanVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PduHandle.NONE;
        return this.zzb.zzc(null, this);
    }
}

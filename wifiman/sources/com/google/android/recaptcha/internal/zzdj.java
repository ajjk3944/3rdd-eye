package com.google.android.recaptcha.internal;

import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zzdj extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdt zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdj(zzdt zzdtVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzc = zzdtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= PduHandle.NONE;
        return this.zzc.zzv(null, 0L, this);
    }
}

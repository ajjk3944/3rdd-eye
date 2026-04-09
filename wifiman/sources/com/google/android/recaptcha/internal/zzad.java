package com.google.android.recaptcha.internal;

import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zzad extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzae zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzad(zzae zzaeVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzc = zzaeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= PduHandle.NONE;
        return this.zzc.zzd(null, this);
    }
}

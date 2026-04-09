package com.google.android.recaptcha.internal;

import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zzt extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzv zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzt(zzv zzvVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzb = zzvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PduHandle.NONE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == AbstractC5467b.g() ? objZzh : u.a(objZzh);
    }
}

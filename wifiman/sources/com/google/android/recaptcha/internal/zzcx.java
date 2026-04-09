package com.google.android.recaptcha.internal;

import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zzcx extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcx(zzdc zzdcVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzb = zzdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PduHandle.NONE;
        Object objMo9executegIAlus = this.zzb.mo9executegIAlus(null, this);
        return objMo9executegIAlus == AbstractC5467b.g() ? objMo9executegIAlus : u.a(objMo9executegIAlus);
    }
}

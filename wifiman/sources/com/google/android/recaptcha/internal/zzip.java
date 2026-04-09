package com.google.android.recaptcha.internal;

import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zzip extends kotlin.coroutines.jvm.internal.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzip(zzja zzjaVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzb = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PduHandle.NONE;
        Object objZzf = this.zzb.zzf(null, this);
        return objZzf == AbstractC5467b.g() ? objZzf : u.a(objZzf);
    }
}

package com.google.android.recaptcha;

import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.d;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class Recaptcha$getClient$1 extends d {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recaptcha$getClient$1(Recaptcha recaptcha, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzb = recaptcha;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PduHandle.NONE;
        Object objM7getClientBWLJW6A = this.zzb.m7getClientBWLJW6A(null, null, 0L, this);
        return objM7getClientBWLJW6A == AbstractC5467b.g() ? objM7getClientBWLJW6A : u.a(objM7getClientBWLJW6A);
    }
}

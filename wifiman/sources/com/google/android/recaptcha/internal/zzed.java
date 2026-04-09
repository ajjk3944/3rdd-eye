package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
final class zzed extends kotlin.coroutines.jvm.internal.d {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;
    int zzd;
    zzef zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzed(zzef zzefVar, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.zzc = zzefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= PduHandle.NONE;
        return this.zzc.zza(null, null, 0L, this);
    }
}

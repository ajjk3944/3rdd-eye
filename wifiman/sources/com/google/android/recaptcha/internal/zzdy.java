package com.google.android.recaptcha.internal;

import Ii.W0;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
final class zzdy extends l implements InterfaceC6835l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdy(long j10, zzec zzecVar, InterfaceC5380e interfaceC5380e) {
        super(1, interfaceC5380e);
        this.zzb = j10;
        this.zzc = zzecVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
        return new zzdy(this.zzb, this.zzc, interfaceC5380e);
    }

    @Override // mh.InterfaceC6835l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((InterfaceC5380e) obj)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = AbstractC5467b.g();
        int i10 = this.zza;
        v.b(obj);
        if (i10 == 0) {
            long j10 = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (W0.c(j10, zzdxVar, this) == objG) {
                return objG;
            }
        }
        return J.f24997a;
    }
}

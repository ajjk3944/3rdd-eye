package com.google.android.recaptcha.internal;

import Ii.N;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzdl extends l implements InterfaceC6839p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsc zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdl(zzdt zzdtVar, zzsc zzscVar, long j10, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzb = zzdtVar;
        this.zzc = zzscVar;
        this.zzd = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        return new zzdl(this.zzb, this.zzc, this.zzd, interfaceC5380e);
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdl) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = AbstractC5467b.g();
        int i10 = this.zza;
        v.b(obj);
        if (i10 == 0) {
            zzdt zzdtVar = this.zzb;
            zzsc zzscVar = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            if (zzdtVar.zzv(zzscVar, j10, this) == objG) {
                return objG;
            }
        }
        return J.f24997a;
    }
}

package com.google.android.recaptcha.internal;

import Ii.N;
import Yg.J;
import Yg.u;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzj extends l implements InterfaceC6839p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzj(zze zzeVar, long j10, zzsc zzscVar, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzb = zzeVar;
        this.zzc = j10;
        this.zzd = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        return new zzj(this.zzb, this.zzc, this.zzd, interfaceC5380e);
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        Object objZze;
        Object objG = AbstractC5467b.g();
        int i10 = this.zza;
        v.b(obj);
        if (i10 != 0) {
            objZze = ((u) obj).o();
        } else {
            zze zzeVar = this.zzb;
            long j10 = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            objZze = zzeVar.zze(j10, zzscVar, this);
            if (objZze == objG) {
                return objG;
            }
        }
        return u.a(objZze);
    }
}

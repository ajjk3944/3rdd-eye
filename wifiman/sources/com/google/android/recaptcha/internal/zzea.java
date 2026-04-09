package com.google.android.recaptcha.internal;

import Ii.InterfaceC3088x;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
final class zzea extends l implements InterfaceC6835l {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ InterfaceC3088x zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzea(zzec zzecVar, long j10, InterfaceC3088x interfaceC3088x, InterfaceC5380e interfaceC5380e) {
        super(1, interfaceC5380e);
        this.zzc = zzecVar;
        this.zzd = j10;
        this.zze = interfaceC3088x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
        return new zzea(this.zzc, this.zzd, this.zze, interfaceC5380e);
    }

    @Override // mh.InterfaceC6835l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((InterfaceC5380e) obj)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        zzbd e10;
        zzen zzenVar2;
        Object objG = AbstractC5467b.g();
        int i10 = this.zzb;
        if (i10 == 0) {
            v.b(obj);
            zzen zzenVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzdtVar = this.zzc.zza;
                long j10 = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objZzo = zzdtVar.zzo(j10, this);
                if (objZzo != objG) {
                    zzenVar2 = zzenVarZzf;
                    obj = objZzo;
                }
                return objG;
            } catch (zzbd e11) {
                zzenVar = zzenVarZzf;
                e10 = e11;
                this.zzc.zzd = e10;
                zzenVar.zzb(e10);
                throw e10;
            }
        }
        if (i10 != 1) {
            zzenVar = (zzen) this.zza;
            try {
                v.b(obj);
                zzenVar.zza();
                this.zzc.zzf = zzcm.zzb;
                return kotlin.coroutines.jvm.internal.b.a(this.zze.S(J.f24997a));
            } catch (zzbd e12) {
                e10 = e12;
                this.zzc.zzd = e10;
                zzenVar.zzb(e10);
                throw e10;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            v.b(obj);
        } catch (zzbd e13) {
            e10 = e13;
            zzenVar = zzenVar2;
            this.zzc.zzd = e10;
            zzenVar.zzb(e10);
            throw e10;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdt zzdtVar2 = this.zzc.zza;
        long j11 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j11, this) != objG) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            this.zzc.zzf = zzcm.zzb;
            return kotlin.coroutines.jvm.internal.b.a(this.zze.S(J.f24997a));
        }
        return objG;
    }
}

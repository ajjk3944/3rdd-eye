package com.google.android.recaptcha.internal;

import Ii.InterfaceC3088x;
import Ii.N;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzeb extends l implements InterfaceC6839p {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC3088x zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(zzec zzecVar, InterfaceC3088x interfaceC3088x, long j10, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzb = zzecVar;
        this.zzc = interfaceC3088x;
        this.zzd = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        return new zzeb(this.zzb, this.zzc, this.zzd, interfaceC5380e);
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objG = AbstractC5467b.g();
        try {
            if (this.zza != 0) {
                v.b(obj);
            } else {
                v.b(obj);
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, this);
                if (obj == objG) {
                    return objG;
                }
            }
            ((Boolean) obj).booleanValue();
        } catch (zzbd e10) {
            this.zzb.zzf = zzcm.zzd;
            this.zzc.a(e10);
        }
        return J.f24997a;
    }
}

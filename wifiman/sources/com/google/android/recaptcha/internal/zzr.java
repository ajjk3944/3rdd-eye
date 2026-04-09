package com.google.android.recaptcha.internal;

import Ii.N;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzr extends l implements InterfaceC6839p {
    int zza;
    final /* synthetic */ zzy zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzr(zzy zzyVar, String str, List list, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzb = zzyVar;
        this.zzc = str;
        this.zzd = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        return new zzr(this.zzb, this.zzc, this.zzd, interfaceC5380e);
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = AbstractC5467b.g();
        int i10 = this.zza;
        v.b(obj);
        if (i10 == 0) {
            zzy zzyVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzyVar.zzc(str, this);
            if (obj == objG) {
                return objG;
            }
        }
        this.zzd.add((zzaa) obj);
        return J.f24997a;
    }
}

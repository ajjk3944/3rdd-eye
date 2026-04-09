package com.google.android.recaptcha.internal;

import Ii.AbstractC3053f;
import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Ii.N;
import Yg.J;
import Yg.u;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzs extends l implements InterfaceC6839p {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(zzv zzvVar, String str, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, interfaceC5380e);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = AbstractC5467b.g();
        int i10 = this.zza;
        v.b(obj);
        if (i10 == 0) {
            N n10 = (N) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC3063k.d(n10, null, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3, null));
            }
            InterfaceC3091y0[] interfaceC3091y0Arr = (InterfaceC3091y0[]) arrayList2.toArray(new InterfaceC3091y0[0]);
            InterfaceC3091y0[] interfaceC3091y0Arr2 = (InterfaceC3091y0[]) Arrays.copyOf(interfaceC3091y0Arr, interfaceC3091y0Arr.length);
            this.zza = 1;
            if (AbstractC3053f.c(interfaceC3091y0Arr2, this) == objG) {
                return objG;
            }
        }
        u.a aVar = u.f25017b;
        return u.a(u.c(this.zzb.zzq(this.zzc)));
    }
}

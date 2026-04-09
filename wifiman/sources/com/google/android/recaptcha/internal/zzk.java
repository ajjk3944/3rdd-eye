package com.google.android.recaptcha.internal;

import Ii.AbstractC3053f;
import Ii.AbstractC3063k;
import Ii.N;
import Ii.V;
import Yg.J;
import Yg.u;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzk extends l implements InterfaceC6839p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(zzl zzlVar, zzek zzekVar, long j10, zzsc zzscVar, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j10;
        this.zze = zzscVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, interfaceC5380e);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        zzen zzenVar;
        Object objC;
        Object objG = AbstractC5467b.g();
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            v.b(obj);
            objA = obj;
        } else {
            v.b(obj);
            N n10 = (N) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3063k.b(n10, null, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3, null));
            }
            V[] vArr = (V[]) arrayList.toArray(new V[0]);
            V[] vArr2 = (V[]) Arrays.copyOf(vArr, vArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            objA = AbstractC3053f.a(vArr2, this);
            if (objA == objG) {
                return objG;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) objA;
        if ((list instanceof Collection) && list.isEmpty()) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            u.a aVar = u.f25017b;
            objC = u.c(v.a(zzbdVar));
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!u.l(((u) it2.next()).o())) {
                    zzenVar.zza();
                    objC = u.c(J.f24997a);
                    break;
                }
            }
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            u.a aVar2 = u.f25017b;
            objC = u.c(v.a(zzbdVar2));
        }
        return u.a(objC);
    }
}

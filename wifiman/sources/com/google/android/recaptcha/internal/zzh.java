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
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzh extends l implements InterfaceC6839p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(zzl zzlVar, String str, long j10, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, interfaceC5380e);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzen zzenVarZzf;
        Object objA;
        zzen zzenVar;
        Object objG = AbstractC5467b.g();
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            v.b(obj);
            objA = obj;
        } else {
            v.b(obj);
            N n10 = (N) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            zzen zzenVar2 = zzenVarZzf;
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(AbstractC3063k.b(n10, null, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3, null));
                }
            }
            V[] vArr = (V[]) arrayList.toArray(new V[0]);
            V[] vArr2 = (V[]) Arrays.copyOf(vArr, vArr.length);
            this.zze = zzenVar2;
            this.zza = 1;
            objA = AbstractC3053f.a(vArr2, this);
            if (objA == objG) {
                return objG;
            }
            zzenVar = zzenVar2;
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) objA).iterator();
        while (it.hasNext()) {
            Object objO = ((u) it.next()).o();
            if (u.m(objO)) {
                zzshVarZzf.zzh((zzsi) objO);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}

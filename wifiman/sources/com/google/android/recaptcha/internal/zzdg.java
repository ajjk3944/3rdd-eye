package com.google.android.recaptcha.internal;

import Ii.N;
import Ii.W0;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.TimeoutCancellationException;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzdg extends l implements InterfaceC6839p {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdg(zzdt zzdtVar, String str, long j10, zzsp zzspVar, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j10;
        this.zzf = zzspVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, interfaceC5380e);
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        Exception e10;
        TimeoutCancellationException e11;
        zzbd e12;
        Object objG = AbstractC5467b.g();
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                v.b(obj);
            } catch (zzbd e13) {
                e12 = e13;
                zzbd zzbdVarZzs = this.zzc.zzs(e12, e12);
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (TimeoutCancellationException e14) {
                e11 = e14;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e15) {
                e10 = e15;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e10, new zzbd(zzbb.zzc, zzba.zzZ, e10.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            v.b(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j10 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objC = W0.c(j10, zzdfVar, this);
                if (objC == objG) {
                    return objG;
                }
                zzenVar = zzenVarZzf;
                obj = objC;
            } catch (zzbd e16) {
                zzenVar = zzenVarZzf;
                e12 = e16;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e12, e12);
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (TimeoutCancellationException e17) {
                zzenVar = zzenVarZzf;
                e11 = e17;
                zzbd zzbdVarZzs22 = this.zzc.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                zzenVar.zzb(zzbdVarZzs22);
                throw zzbdVarZzs22;
            } catch (Exception e18) {
                zzenVar = zzenVarZzf;
                e10 = e18;
                zzbd zzbdVarZzs32 = this.zzc.zzs(e10, new zzbd(zzbb.zzc, zzba.zzZ, e10.getMessage()));
                zzenVar.zzb(zzbdVarZzs32);
                throw zzbdVarZzs32;
            }
        }
        return (zzsr) obj;
    }
}

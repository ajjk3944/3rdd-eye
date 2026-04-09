package com.google.android.recaptcha.internal;

import Ii.N;
import Yg.J;
import Yg.v;
import android.os.Build;
import com.google.android.recaptcha.RecaptchaException;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;
import r3.C7568f;

/* loaded from: classes3.dex */
final class zzdh extends l implements InterfaceC6839p {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdh(zzdt zzdtVar, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzb = zzdtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        return new zzdh(this.zzb, interfaceC5380e);
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws RecaptchaException {
        Object objG = AbstractC5467b.g();
        int i10 = this.zza;
        v.b(obj);
        if (i10 == 0) {
            int iZza = new zzbs(C7568f.f()).zza(this.zzb.zzr());
            zzdt zzdtVar = this.zzb;
            String str = zzdtVar.zza;
            String packageName = zzdtVar.zzr().getPackageName();
            String strZzd = this.zzb.zzb.zzd();
            zzbf zzbfVarZzt = this.zzb.zzt();
            int i11 = Build.VERSION.SDK_INT;
            String strZza = zzbfVarZzt.zza();
            zztn zztnVarZzf = zzto.zzf();
            zztnVarZzf.zzt(str);
            zztnVarZzf.zzq(packageName);
            zztnVarZzf.zzu(iZza);
            zztnVarZzf.zzr("18.6.1");
            zztnVarZzf.zzs(strZzd);
            zztnVarZzf.zzf(String.valueOf(i11));
            zztnVarZzf.zze(strZza);
            zzto zztoVar = (zzto) zztnVarZzf.zzk();
            zzdt zzdtVar2 = this.zzb;
            zzff zzffVarZzg = zzdt.zzg(zzdtVar2);
            String strZzb = zzdt.zzd(zzdtVar2).zzb();
            this.zza = 1;
            obj = zzffVarZzg.zzc(strZzb, zztoVar, this);
            if (obj == objG) {
                return objG;
            }
        }
        return obj;
    }
}

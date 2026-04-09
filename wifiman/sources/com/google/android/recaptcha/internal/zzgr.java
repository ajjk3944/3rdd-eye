package com.google.android.recaptcha.internal;

import Yg.J;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzgr extends AbstractC6494u implements InterfaceC6839p {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgr(zzgd zzgdVar, String str, int i10) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i10;
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzc().zze(i10, objArr);
        }
        return J.f24997a;
    }
}

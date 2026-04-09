package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class zzdm extends AbstractC6494u implements InterfaceC6824a {
    public static final zzdm zza = new zzdm();

    public zzdm() {
        super(0);
    }

    @Override // mh.InterfaceC6824a
    public final Object invoke() throws zzbd {
        int i10 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzff.class.getName().hashCode());
        if (objZzb != null) {
            return (zzff) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}

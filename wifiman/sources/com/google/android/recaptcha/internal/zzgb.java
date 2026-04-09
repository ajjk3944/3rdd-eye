package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class zzgb extends AbstractC6494u implements InterfaceC6824a {
    public static final zzgb zza = new zzgb();

    public zzgb() {
        super(0);
    }

    @Override // mh.InterfaceC6824a
    public final Object invoke() throws zzbd {
        int i10 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzfu.class.getName().hashCode());
        if (objZzb != null) {
            return (zzfu) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}

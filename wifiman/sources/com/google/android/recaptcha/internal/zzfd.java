package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class zzfd extends AbstractC6494u implements InterfaceC6824a {
    public static final zzfd zza = new zzfd();

    public zzfd() {
        super(0);
    }

    @Override // mh.InterfaceC6824a
    public final Object invoke() throws zzbd {
        int i10 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzaq.class.getName().hashCode());
        if (objZzb != null) {
            return (zzaq) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}

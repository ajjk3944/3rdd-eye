package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class zzdq extends AbstractC6494u implements InterfaceC6824a {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // mh.InterfaceC6824a
    public final Object invoke() throws zzbd {
        int i10 = zzav.zza;
        Object objZzb = zzau.zza().zzb(Application.class.getName().hashCode());
        if (objZzb != null) {
            return (Application) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}

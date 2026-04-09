package com.google.android.recaptcha.internal;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List listL;
        if (!AbstractC6492s.d(method.getName(), this.zzb)) {
            return false;
        }
        zzfz zzfzVar = this.zza;
        if (objArr == null || (listL = AbstractC3682n.e(objArr)) == null) {
            listL = AbstractC3689v.l();
        }
        zzfzVar.zzb(listL);
        return true;
    }
}

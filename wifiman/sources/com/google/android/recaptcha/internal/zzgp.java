package com.google.android.recaptcha.internal;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.Objects;
import kotlin.text.C6510d;

/* loaded from: classes3.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i10, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        String strZ0;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        if (objZza instanceof int[]) {
            strZ0 = AbstractC3682n.G0((int[]) objZza, ",", "[", "]", 0, null, null, 56, null);
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, C6510d.f52215b);
            } else if (objZza instanceof long[]) {
                strZ0 = AbstractC3682n.H0((long[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof short[]) {
                strZ0 = AbstractC3682n.J0((short[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof float[]) {
                strZ0 = AbstractC3682n.F0((float[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof double[]) {
                strZ0 = AbstractC3682n.E0((double[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strZ0 = AbstractC3682n.I0((Object[]) objZza, ",", "[", "]", 0, null, null, 56, null);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                strZ0 = AbstractC3689v.z0((Iterable) objZza, ",", "[", "]", 0, null, null, 56, null);
            }
            strZ0 = str;
        }
        zzgdVar.zzc().zze(i10, strZ0);
    }
}

package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.impl.Oo;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaeq {
    public final zzaet zza;
    public final zzaet zzb;

    public zzaeq(zzaet zzaetVar, zzaet zzaetVar2) {
        this.zza = zzaetVar;
        this.zzb = zzaetVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeq.class == obj.getClass()) {
            zzaeq zzaeqVar = (zzaeq) obj;
            if (this.zza.equals(zzaeqVar.zza) && this.zzb.equals(zzaeqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzaet zzaetVar = this.zza;
        zzaet zzaetVar2 = this.zzb;
        return Oo.f("[", zzaetVar.toString(), zzaetVar.equals(zzaetVar2) ? "" : ", ".concat(zzaetVar2.toString()), "]");
    }
}

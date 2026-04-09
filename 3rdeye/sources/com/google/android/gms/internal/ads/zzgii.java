package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.impl.Oo;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgii {
    private zzgik zza;
    private String zzb;
    private zzgij zzc;
    private zzgfo zzd;

    private zzgii() {
        throw null;
    }

    public final zzgii zza(zzgfo zzgfoVar) {
        this.zzd = zzgfoVar;
        return this;
    }

    public final zzgii zzb(zzgij zzgijVar) {
        this.zzc = zzgijVar;
        return this;
    }

    public final zzgii zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzgii zzd(zzgik zzgikVar) {
        this.zza = zzgikVar;
        return this;
    }

    public final zzgim zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzgik.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzgij zzgijVar = this.zzc;
        if (zzgijVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzgfo zzgfoVar = this.zzd;
        if (zzgfoVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzgfoVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzgijVar.equals(zzgij.zza) && (zzgfoVar instanceof zzgha)) || ((zzgijVar.equals(zzgij.zzc) && (zzgfoVar instanceof zzghr)) || ((zzgijVar.equals(zzgij.zzb) && (zzgfoVar instanceof zzgjo)) || ((zzgijVar.equals(zzgij.zzd) && (zzgfoVar instanceof zzggf)) || ((zzgijVar.equals(zzgij.zze) && (zzgfoVar instanceof zzggp)) || (zzgijVar.equals(zzgij.zzf) && (zzgfoVar instanceof zzghl))))))) {
            return new zzgim(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        throw new GeneralSecurityException(Oo.h("Cannot use parsing strategy ", this.zzc.toString(), " when new keys are picked according to ", String.valueOf(this.zzd), "."));
    }

    public /* synthetic */ zzgii(zzgil zzgilVar) {
    }
}

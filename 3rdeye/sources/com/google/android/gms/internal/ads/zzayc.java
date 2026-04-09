package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzayc extends zzayi {
    private final zzaxc zzh;
    private long zzi;

    public zzayc(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10, zzaxc zzaxcVar) {
        super(zzawvVar, "YdsvNQpLn71zCPsmNiBmaxgvKAoUotN+t67Ej8NmXEez61kI/ElwL7USsI8xuH+E", "BTo9KBR1VAIklcWQcnKn1k6hpYvG+18rom++PUlQVcU=", zzasrVar, i, 53);
        this.zzh = zzaxcVar;
        if (zzaxcVar != null) {
            this.zzi = zzaxcVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzN(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}

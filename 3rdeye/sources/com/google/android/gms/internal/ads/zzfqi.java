package com.google.android.gms.internal.ads;

import B4.f;
import j6.l;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfqi extends zzfqp {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfqi(String str, boolean z10, int i, zzfqe zzfqeVar, zzfqf zzfqfVar, int i10, zzfqh zzfqhVar) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqp) {
            zzfqp zzfqpVar = (zzfqp) obj;
            if (this.zzb.equals(zzfqpVar.zzc())) {
                zzfqpVar.zzd();
                int i = this.zzc;
                int iZze = zzfqpVar.zze();
                if (i == 0) {
                    throw null;
                }
                if (i == iZze) {
                    zzfqpVar.zza();
                    zzfqpVar.zzb();
                    int i10 = this.zzd;
                    int iZzf = zzfqpVar.zzf();
                    if (i10 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i = this.zzc;
        if (i == 0) {
            throw null;
        }
        int i10 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.zzd != 0) {
            return (i10 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.zzc;
        return f.c(l.d("FileComplianceOptions{fileOwner=", this.zzb, ", hasDifferentDmaOwner=false, fileChecks=", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS", ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="), this.zzd == 1 ? "READ_AND_WRITE" : "null", "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final zzfqe zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final zzfqf zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final int zzf() {
        return this.zzd;
    }
}

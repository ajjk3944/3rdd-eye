package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbam implements Comparator {
    public zzbam(zzban zzbanVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbab zzbabVar = (zzbab) obj;
        zzbab zzbabVar2 = (zzbab) obj2;
        if (zzbabVar.zzd() < zzbabVar2.zzd()) {
            return -1;
        }
        if (zzbabVar.zzd() > zzbabVar2.zzd()) {
            return 1;
        }
        if (zzbabVar.zzb() < zzbabVar2.zzb()) {
            return -1;
        }
        if (zzbabVar.zzb() > zzbabVar2.zzb()) {
            return 1;
        }
        float fZza = (zzbabVar.zza() - zzbabVar.zzd()) * (zzbabVar.zzc() - zzbabVar.zzb());
        float fZza2 = (zzbabVar2.zza() - zzbabVar2.zzd()) * (zzbabVar2.zzc() - zzbabVar2.zzb());
        if (fZza > fZza2) {
            return -1;
        }
        return fZza < fZza2 ? 1 : 0;
    }
}

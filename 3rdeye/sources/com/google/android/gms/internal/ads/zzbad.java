package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbad implements Comparator {
    public zzbad(zzbaf zzbafVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbaj zzbajVar = (zzbaj) obj;
        zzbaj zzbajVar2 = (zzbaj) obj2;
        int i = zzbajVar.zzc - zzbajVar2.zzc;
        return i != 0 ? i : Long.compare(zzbajVar.zza, zzbajVar2.zza);
    }
}

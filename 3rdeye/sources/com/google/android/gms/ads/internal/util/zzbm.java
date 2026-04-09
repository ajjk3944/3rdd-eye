package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzcai;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzbm extends zzaqb {
    private final zzcai zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbm(String str, Map map, zzcai zzcaiVar) throws IOException {
        super(0, str, new zzbl(zzcaiVar));
        this.zza = zzcaiVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final zzaqh zzh(zzapx zzapxVar) {
        return zzaqh.zzb(zzapxVar, zzaqy.zzb(zzapxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final /* bridge */ /* synthetic */ void zzo(Object obj) throws IOException {
        zzapx zzapxVar = (zzapx) obj;
        Map map = zzapxVar.zzc;
        int i = zzapxVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzf(map, i);
        byte[] bArr = zzapxVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && bArr != null) {
            zzlVar.zzh(bArr);
        }
        this.zza.zzc(zzapxVar);
    }
}

package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapj;
import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzaqg;
import com.google.android.gms.internal.ads.zzarg;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
final class zzbj extends zzarg {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbo zzboVar, int i, String str, zzaqg zzaqgVar, zzaqf zzaqfVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzaqgVar, zzaqfVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final Map zzl() throws zzapj {
        Map map = this.zzb;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final byte[] zzx() throws zzapj {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzarg, com.google.android.gms.internal.ads.zzaqb
    /* renamed from: zzz */
    public final void zzo(String str) throws IOException {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}

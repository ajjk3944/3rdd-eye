package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzasc;
import com.google.android.gms.internal.ads.zzasd;
import com.google.android.gms.internal.ads.zzatb;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzbh extends zzatb {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbl zzblVar, int i10, String str, zzasd zzasdVar, zzasc zzascVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i10, str, zzasdVar, zzascVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final Map zzm() throws zzarg {
        Map map = this.zzb;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final byte[] zzn() throws zzarg {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzatb, com.google.android.gms.internal.ads.zzary
    public final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzs((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    /* renamed from: zzz */
    public final void zzs(String str) throws IOException {
        this.zzc.zze(str);
        super.zzs(str);
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgh extends zzgc {
    private zzgo zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgh() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.zzd;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.zzb;
        String str = zzex.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws IOException {
        zzi(zzgoVar);
        this.zza = zzgoVar;
        Uri uriNormalizeScheme = zzgoVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzdd.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zzex.zza;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw zzaz.zzb("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e4) {
                throw zzaz.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e4);
            }
        } else {
            this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j4 = zzgoVar.zze;
        int length = this.zzb.length;
        if (j4 > length) {
            this.zzb = null;
            throw new zzgk(2008);
        }
        int i = (int) j4;
        this.zzc = i;
        int i10 = length - i;
        this.zzd = i10;
        long j10 = zzgoVar.zzf;
        if (j10 != -1) {
            this.zzd = (int) Math.min(i10, j10);
        }
        zzj(zzgoVar);
        return j10 != -1 ? j10 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        zzgo zzgoVar = this.zza;
        if (zzgoVar != null) {
            return zzgoVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}

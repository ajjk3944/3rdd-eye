package com.google.android.gms.internal.ads;

import B4.i;
import N7.B8;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgo {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzaq.zzb("media3.datasource");
    }

    public final String toString() {
        StringBuilder sbK = B8.k("DataSpec[GET ", this.zza.toString(), ", ");
        sbK.append(this.zze);
        sbK.append(", ");
        sbK.append(this.zzf);
        sbK.append(", null, ");
        return i.j(sbK, this.zzg, "]");
    }

    public final zzgm zza() {
        return new zzgm(this, null);
    }

    public final boolean zzb(int i) {
        return (this.zzg & i) == i;
    }

    private zzgo(Uri uri, long j4, int i, byte[] bArr, Map map, long j10, long j11, String str, int i10, Object obj) {
        boolean z10 = false;
        boolean z11 = j10 >= 0;
        zzdd.zzd(z11);
        zzdd.zzd(z11);
        if (j11 > 0) {
            z10 = true;
        } else if (j11 == -1) {
            j11 = -1;
            z10 = true;
        }
        zzdd.zzd(z10);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j10;
        this.zzf = j11;
        this.zzg = i10;
    }

    @Deprecated
    public zzgo(Uri uri, long j4, long j10, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j4, j10, null, 0, null);
    }
}

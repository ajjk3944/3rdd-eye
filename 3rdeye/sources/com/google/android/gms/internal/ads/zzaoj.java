package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaoj {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzaoj(int i, String str, int i10, List list, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i = this.zzc;
        if (i == 2) {
            return 2048;
        }
        if (i != 3) {
            return 0;
        }
        return AdRequest.MAX_CONTENT_URL_LENGTH;
    }
}

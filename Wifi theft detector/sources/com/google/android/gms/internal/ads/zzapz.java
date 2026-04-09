package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import org.xbill.DNS.KEYRecord;

/* loaded from: classes2.dex */
public final class zzapz {
    public final int zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzapz(int i10, @Nullable String str, int i11, @Nullable List list, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = i11;
        this.zzd = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i10 = this.zzc;
        return i10 != 2 ? i10 != 3 ? 0 : 512 : KEYRecord.Flags.FLAG4;
    }
}

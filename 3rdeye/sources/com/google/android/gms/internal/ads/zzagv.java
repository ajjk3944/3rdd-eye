package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzagv extends zzahd {
    public final byte[] zza;

    public zzagv(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagv.class == obj.getClass()) {
            zzagv zzagvVar = (zzagv) obj;
            if (this.zzf.equals(zzagvVar.zzf) && Arrays.equals(this.zza, zzagvVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        return Arrays.hashCode(this.zza) + (iHashCode * 31);
    }
}

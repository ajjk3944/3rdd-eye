package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzbf {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbf zza(String str, double d10, double d11) {
        List list;
        int i = 0;
        while (true) {
            list = this.zza;
            if (i >= list.size()) {
                break;
            }
            double dDoubleValue = ((Double) this.zzc.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) this.zzb.get(i)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            }
            i++;
        }
        list.add(i, str);
        this.zzc.add(i, Double.valueOf(d10));
        this.zzb.add(i, Double.valueOf(d11));
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this, null);
    }
}

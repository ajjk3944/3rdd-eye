package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzawn {
    private List zza = Collections.EMPTY_LIST;

    public final List zza() {
        List list = this.zza;
        this.zza = Collections.EMPTY_LIST;
        return list;
    }

    public final void zzb(List list) {
        this.zza = new ArrayList(list);
    }
}

package com.google.android.gms.internal.ads;

import g0.C4356c;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfzp {
    public static Object zza(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(C4356c.h(i, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            zza(objArr[i10], i10);
        }
        return objArr;
    }
}

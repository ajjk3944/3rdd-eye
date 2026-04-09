package com.google.android.gms.internal.play_billing;

import N7.C1154e9;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzad {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(C1154e9.i("null value in entry: ", obj.toString(), "=null"));
        }
    }
}

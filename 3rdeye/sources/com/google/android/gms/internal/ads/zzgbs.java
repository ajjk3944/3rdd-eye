package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzgbs {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j4, Object obj2, Object obj3) {
        while (!c.a(unsafe, obj, j4, obj2, obj3)) {
            if (unsafe.getObject(obj, j4) != obj2) {
                return false;
            }
        }
        return true;
    }
}

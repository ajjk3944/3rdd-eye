package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzff {
    public final int zzd;

    public static String zze(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
        return sb.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}

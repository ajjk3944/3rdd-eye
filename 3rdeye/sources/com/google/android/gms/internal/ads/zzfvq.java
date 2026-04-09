package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfvq implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfvt zzb;

    public zzfvq(zzfvt zzfvtVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfvtVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfuw.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}

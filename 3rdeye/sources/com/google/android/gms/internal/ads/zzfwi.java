package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfwi extends zzfyy {
    final /* synthetic */ zzfwk zza;

    public zzfwi(zzfwk zzfwkVar) {
        this.zza = zzfwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfxe.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfwj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfwk zzfwkVar = this.zza;
        zzfwx.zzo(zzfwkVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
    public final Map zza() {
        return this.zza;
    }
}

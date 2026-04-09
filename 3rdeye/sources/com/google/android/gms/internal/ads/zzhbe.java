package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhbe implements Iterator {
    final /* synthetic */ zzhbh zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhbe(zzhbh zzhbhVar, zzhbg zzhbgVar) {
        this.zza = zzhbhVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzhbh zzhbhVar = this.zza;
        if (i >= zzhbhVar.zzb) {
            return !zzhbhVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzhbh zzhbhVar = this.zza;
        return i < zzhbhVar.zzb ? (zzhbd) zzhbhVar.zza[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzhbh zzhbhVar = this.zza;
        zzhbhVar.zzo();
        int i = this.zzb;
        if (i >= zzhbhVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzhbhVar.zzm(i);
        }
    }
}

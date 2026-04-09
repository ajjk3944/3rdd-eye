package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhaw implements Iterator {
    private final ArrayDeque zza;
    private zzgxj zzb;

    public /* synthetic */ zzhaw(zzgxn zzgxnVar, zzhax zzhaxVar) {
        if (!(zzgxnVar instanceof zzhay)) {
            this.zza = null;
            this.zzb = (zzgxj) zzgxnVar;
            return;
        }
        zzhay zzhayVar = (zzhay) zzgxnVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhayVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhayVar);
        this.zzb = zzb(zzhayVar.zzd);
    }

    private final zzgxj zzb(zzgxn zzgxnVar) {
        while (zzgxnVar instanceof zzhay) {
            zzhay zzhayVar = (zzhay) zzgxnVar;
            this.zza.push(zzhayVar);
            zzgxnVar = zzhayVar.zzd;
        }
        return (zzgxj) zzgxnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgxj next() {
        zzgxj zzgxjVarZzb;
        zzgxj zzgxjVar = this.zzb;
        if (zzgxjVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgxjVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgxjVarZzb = zzb(((zzhay) arrayDeque.pop()).zze);
        } while (zzgxjVarZzb.zzd() == 0);
        this.zzb = zzgxjVarZzb;
        return zzgxjVar;
    }
}

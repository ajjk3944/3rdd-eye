package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhav {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhav() {
    }

    public static /* bridge */ /* synthetic */ zzgxn zza(zzhav zzhavVar, zzgxn zzgxnVar, zzgxn zzgxnVar2) {
        zzhavVar.zzb(zzgxnVar);
        zzhavVar.zzb(zzgxnVar2);
        ArrayDeque arrayDeque = zzhavVar.zza;
        zzgxn zzhayVar = (zzgxn) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzhayVar = new zzhay((zzgxn) arrayDeque.pop(), zzhayVar);
        }
        return zzhayVar;
    }

    private final void zzb(zzgxn zzgxnVar) {
        zzhax zzhaxVar;
        if (!zzgxnVar.zzh()) {
            if (!(zzgxnVar instanceof zzhay)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgxnVar.getClass())));
            }
            zzhay zzhayVar = (zzhay) zzgxnVar;
            zzb(zzhayVar.zzd);
            zzb(zzhayVar.zze);
            return;
        }
        int iZzc = zzc(zzgxnVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int iZzc2 = zzhay.zzc(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzgxn) arrayDeque.peek()).zzd() >= iZzc2) {
            arrayDeque.push(zzgxnVar);
            return;
        }
        int iZzc3 = zzhay.zzc(iZzc);
        zzgxn zzhayVar2 = (zzgxn) arrayDeque.pop();
        while (true) {
            zzhaxVar = null;
            if (arrayDeque.isEmpty() || ((zzgxn) arrayDeque.peek()).zzd() >= iZzc3) {
                break;
            } else {
                zzhayVar2 = new zzhay((zzgxn) arrayDeque.pop(), zzhayVar2);
            }
        }
        zzhay zzhayVar3 = new zzhay(zzhayVar2, zzgxnVar);
        while (!arrayDeque.isEmpty()) {
            if (((zzgxn) arrayDeque.peek()).zzd() >= zzhay.zzc(zzc(zzhayVar3.zzd()) + 1)) {
                break;
            } else {
                zzhayVar3 = new zzhay((zzgxn) arrayDeque.pop(), zzhayVar3);
            }
        }
        arrayDeque.push(zzhayVar3);
    }

    private static final int zzc(int i) {
        int iBinarySearch = Arrays.binarySearch(zzhay.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public /* synthetic */ zzhav(zzhax zzhaxVar) {
    }
}

package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzget {
    private final List zza = new ArrayList();
    private final zzgmv zzb = zzgmv.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzger) it.next()).zza = false;
        }
    }

    public final zzget zza(zzger zzgerVar) {
        if (zzgerVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgerVar.zza) {
            zzd();
        }
        zzgerVar.zzf = this;
        this.zza.add(zzgerVar);
        return this;
    }

    public final zzgew zzb() throws GeneralSecurityException {
        int i;
        int i10;
        char c10 = 1;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzger> list = this.zza;
        zzgtx zzgtxVarZzc = zzgub.zzc();
        ArrayList arrayList = new ArrayList(list.size());
        int i11 = 0;
        int i12 = 0;
        while (i12 < list.size() - 1) {
            int i13 = i12 + 1;
            if (((zzger) list.get(i12)).zze == zzges.zza && ((zzger) list.get(i13)).zze != zzges.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i12 = i13;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzger zzgerVar : list) {
            zzgep unused = zzgerVar.zzb;
            if (zzgerVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzgerVar.zze == zzges.zza) {
                int i14 = i11;
                while (true) {
                    if (i14 != 0 && !hashSet.contains(Integer.valueOf(i14))) {
                        break;
                    }
                    int i15 = zzgox.zza;
                    i14 = i11;
                    while (i14 == 0) {
                        byte[] bArrZzb = zzgoo.zzb(4);
                        i14 = (bArrZzb[3] & 255) | ((bArrZzb[i11] & 255) << 24) | ((bArrZzb[c10] & 255) << 16) | ((bArrZzb[2] & 255) << 8);
                    }
                }
                i = i14;
            } else {
                zzges unused2 = zzgerVar.zze;
                i = i11;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(C4356c.i(i, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzger.zza(zzgerVar);
            zzgen zzgenVarZza = zzgnc.zzb().zza(zzgerVar.zzd, c10 != zzgerVar.zzd.zza() ? null : numValueOf);
            zzgeu zzgeuVar = new zzgeu(zzgenVarZza, zzgerVar.zzb, i, zzgerVar.zza, null);
            int i16 = i;
            zzgep zzgepVar = zzgerVar.zzb;
            zzgol zzgolVar = (zzgol) zzgnm.zzc().zzd(zzgenVarZza, zzgol.class, zzgfb.zza());
            Integer numZzf = zzgolVar.zzf();
            if (numZzf != null && numZzf.intValue() != i16) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            zzgep zzgepVar2 = zzgep.zza;
            if (zzgepVar2.equals(zzgepVar)) {
                i10 = 3;
            } else if (zzgep.zzb.equals(zzgepVar)) {
                i10 = 4;
            } else {
                if (!zzgep.zzc.equals(zzgepVar)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i10 = 5;
            }
            zzgty zzgtyVarZzc = zzgtz.zzc();
            zzgtm zzgtmVarZza = zzgtp.zza();
            zzgtmVarZza.zzb(zzgolVar.zzg());
            zzgtmVarZza.zzc(zzgolVar.zze());
            zzgtmVarZza.zza(zzgolVar.zzb());
            zzgtyVarZzc.zza(zzgtmVarZza);
            zzgtyVarZzc.zzd(i10);
            zzgtyVarZzc.zzb(i16);
            zzgtyVarZzc.zzc(zzgolVar.zzc());
            zzgtxVarZzc.zza((zzgtz) zzgtyVarZzc.zzbr());
            if (zzgerVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgerVar.zzb != zzgepVar2) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzgeuVar);
            c10 = 1;
            i11 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzgtxVarZzc.zzb(num.intValue());
        zzgub zzgubVar = (zzgub) zzgtxVarZzc.zzbr();
        zzgew.zzj(zzgubVar);
        return new zzgew(zzgubVar, arrayList, this.zzb);
    }
}

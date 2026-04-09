package com.google.android.gms.internal.ads;

import N7.H7;
import g0.C4356c;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgew implements zzgmm {
    private final zzgub zza;
    private final List zzb;
    private final zzgmv zzc;

    public static final zzgew zzd(zzgub zzgubVar) throws GeneralSecurityException {
        zzj(zzgubVar);
        return new zzgew(zzgubVar, zzi(zzgubVar), zzgmv.zza);
    }

    public static final zzgew zze(zzgfa zzgfaVar) throws GeneralSecurityException {
        zzget zzgetVar = new zzget();
        zzger zzgerVar = new zzger(zzgfaVar, null);
        zzgerVar.zzd();
        zzgerVar.zzc();
        zzgetVar.zza(zzgerVar);
        return zzgetVar.zzb();
    }

    private static List zzi(zzgub zzgubVar) throws GeneralSecurityException {
        zzgep zzgepVar;
        ArrayList arrayList = new ArrayList(zzgubVar.zza());
        for (zzgtz zzgtzVar : zzgubVar.zzh()) {
            int iZza = zzgtzVar.zza();
            try {
                zzgol zzgolVarZza = zzgol.zza(zzgtzVar.zzb().zzg(), zzgtzVar.zzb().zzf(), zzgtzVar.zzb().zzb(), zzgtzVar.zzf(), zzgtzVar.zzf() == zzgut.RAW ? null : Integer.valueOf(zzgtzVar.zza()));
                zzgnm zzgnmVarZzc = zzgnm.zzc();
                zzgfb zzgfbVarZza = zzgfb.zza();
                zzgen zzgmrVar = !zzgnmVarZzc.zzj(zzgolVarZza) ? new zzgmr(zzgolVarZza, zzgfbVarZza) : zzgnmVarZzc.zza(zzgolVarZza, zzgfbVarZza);
                int iZzk = zzgtzVar.zzk() - 2;
                if (iZzk == 1) {
                    zzgepVar = zzgep.zza;
                } else if (iZzk == 2) {
                    zzgepVar = zzgep.zzb;
                } else {
                    if (iZzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzgepVar = zzgep.zzc;
                }
                arrayList.add(new zzgeu(zzgmrVar, zzgepVar, iZza, iZza == zzgubVar.zzb(), null));
            } catch (GeneralSecurityException e4) {
                if (zzgls.zza.zza()) {
                    throw new GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e4);
                }
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzj(zzgub zzgubVar) throws GeneralSecurityException {
        if (zzgubVar == null || zzgubVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i = zzgfd.zza;
        zzguc zzgucVarZza = zzgug.zza();
        zzgub zzgubVar = this.zza;
        zzgucVarZza.zzb(zzgubVar.zzb());
        for (zzgtz zzgtzVar : zzgubVar.zzh()) {
            zzgud zzgudVarZza = zzgue.zza();
            zzgudVarZza.zzc(zzgtzVar.zzb().zzg());
            zzgudVarZza.zzd(zzgtzVar.zzk());
            zzgudVarZza.zzb(zzgtzVar.zzf());
            zzgudVarZza.zza(zzgtzVar.zza());
            zzgucVarZza.zza((zzgue) zzgudVarZza.zzbr());
        }
        return ((zzgug) zzgucVarZza.zzbr()).toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgmm
    public final int zza() {
        return this.zzb.size();
    }

    public final zzgeu zzb(int i) {
        if (i < 0 || i >= zza()) {
            throw new IndexOutOfBoundsException(H7.n(i, zza(), "Invalid index ", " for keyset of size "));
        }
        List list = this.zzb;
        if (list.get(i) != null) {
            return (zzgeu) list.get(i);
        }
        throw new IllegalStateException(C4356c.i(i, "Keyset-Entry at position ", " has wrong status or key parsing failed"));
    }

    public final zzgeu zzc() {
        for (zzgeu zzgeuVar : this.zzb) {
            if (zzgeuVar != null && zzgeuVar.zzd()) {
                if (zzgeuVar.zzc() == zzgep.zza) {
                    return zzgeuVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final zzgub zzf() {
        return this.zza;
    }

    public final Object zzg(zzgel zzgelVar, Class cls) throws GeneralSecurityException {
        if (!(zzgelVar instanceof zzgmc)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzgmc zzgmcVar = (zzgmc) zzgelVar;
        zzgub zzgubVar = this.zza;
        int i = zzgfd.zza;
        int iZzb = zzgubVar.zzb();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzgtz zzgtzVar : zzgubVar.zzh()) {
            if (zzgtzVar.zzk() == 3) {
                if (!zzgtzVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgtzVar.zza())));
                }
                if (zzgtzVar.zzf() == zzgut.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgtzVar.zza())));
                }
                if (zzgtzVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgtzVar.zza())));
                }
                if (zzgtzVar.zza() == iZzb) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z11 &= zzgtzVar.zzb().zzb() == zzgtn.ASYMMETRIC_PUBLIC;
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i11 = 0; i11 < zza(); i11++) {
            if (this.zzb.get(i11) == null) {
                throw new GeneralSecurityException("Key parsing of key with index " + i11 + " and type_url " + zzgubVar.zzd(i11).zzb().zzg() + " failed, unable to get primitive");
            }
        }
        return zzgmcVar.zza(this, this.zzc, cls);
    }

    private zzgew(zzgub zzgubVar, List list, zzgmv zzgmvVar) throws GeneralSecurityException {
        this.zza = zzgubVar;
        this.zzb = list;
        this.zzc = zzgmvVar;
        if (zzgls.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzgtz zzgtzVar : zzgubVar.zzh()) {
                if (hashSet.contains(Integer.valueOf(zzgtzVar.zza()))) {
                    throw new GeneralSecurityException(C4356c.i(zzgtzVar.zza(), "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(zzgtzVar.zza()));
            }
            if (!hashSet.contains(Integer.valueOf(zzgubVar.zzb()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }
}

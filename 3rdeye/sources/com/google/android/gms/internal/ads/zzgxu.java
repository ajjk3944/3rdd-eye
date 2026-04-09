package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgxu implements zzhat {
    private final zzgxt zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgxu(zzgxt zzgxtVar) {
        zzgzi.zzc(zzgxtVar, "input");
        this.zza = zzgxtVar;
        zzgxtVar.zzd = this;
    }

    private final void zzO(Object obj, zzhaz zzhazVar, zzgyf zzgyfVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzhazVar.zzh(obj, this, zzgyfVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzgzk("Failed to parse the message.");
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzP(Object obj, zzhaz zzhazVar, zzgyf zzgyfVar) throws IOException {
        zzgxt zzgxtVar = this.zza;
        int iZzm = zzgxtVar.zzm();
        if (zzgxtVar.zzb >= zzgxtVar.zzc) {
            throw new zzgzk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZzd = zzgxtVar.zzd(iZzm);
        zzgxtVar.zzb++;
        zzhazVar.zzh(obj, this, zzgyfVar);
        zzgxtVar.zzy(0);
        zzgxtVar.zzb--;
        zzgxtVar.zzz(iZzd);
    }

    private final void zzQ(int i) throws IOException {
        if (this.zza.zzc() != i) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw new zzgzj("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new zzgzk("Failed to parse the message.");
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new zzgzk("Failed to parse the message.");
        }
    }

    public static zzgxu zzq(zzgxt zzgxtVar) {
        zzgxu zzgxuVar = zzgxtVar.zzd;
        return zzgxuVar != null ? zzgxuVar : new zzgxu(zzgxtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzA(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgzv) {
            zzgzv zzgzvVar = (zzgzv) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzm = zzgxtVar.zzm();
                zzT(iZzm);
                int iZzc = zzgxtVar.zzc() + iZzm;
                do {
                    zzgzvVar.zzg(zzgxtVar.zzn());
                } while (zzgxtVar.zzc() < iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgzvVar.zzg(zzgxtVar2.zzn());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzm2 = zzgxtVar3.zzm();
                zzT(iZzm2);
                int iZzc2 = zzgxtVar3.zzc() + iZzm2;
                do {
                    list.add(Long.valueOf(zzgxtVar3.zzn()));
                } while (zzgxtVar3.zzc() < iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Long.valueOf(zzgxtVar4.zzn()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzB(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgym) {
            zzgym zzgymVar = (zzgym) list;
            int i = this.zzb & 7;
            if (i == 2) {
                zzgxt zzgxtVar = this.zza;
                int iZzm = zzgxtVar.zzm();
                zzS(iZzm);
                int iZzc = zzgxtVar.zzc() + iZzm;
                do {
                    zzgymVar.zzh(zzgxtVar.zzb());
                } while (zzgxtVar.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new zzgzj("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgymVar.zzh(zzgxtVar2.zzb());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zzgxt zzgxtVar3 = this.zza;
                int iZzm2 = zzgxtVar3.zzm();
                zzS(iZzm2);
                int iZzc2 = zzgxtVar3.zzc() + iZzm2;
                do {
                    list.add(Float.valueOf(zzgxtVar3.zzb()));
                } while (zzgxtVar3.zzc() < iZzc2);
                return;
            }
            if (i10 != 5) {
                throw new zzgzj("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Float.valueOf(zzgxtVar4.zzb()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    @Deprecated
    public final void zzC(List list, zzhaz zzhazVar, zzgyf zzgyfVar) throws IOException {
        int iZzl;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw new zzgzj("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzhazVar.zze();
            zzO(objZze, zzhazVar, zzgyfVar);
            zzhazVar.zzf(objZze);
            list.add(objZze);
            zzgxt zzgxtVar = this.zza;
            if (zzgxtVar.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = zzgxtVar.zzl();
            }
        } while (iZzl == i);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzD(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyw) {
            zzgyw zzgywVar = (zzgyw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzc = zzgxtVar.zzc() + zzgxtVar.zzm();
                do {
                    zzgywVar.zzi(zzgxtVar.zzg());
                } while (zzgxtVar.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgywVar.zzi(zzgxtVar2.zzg());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzc2 = zzgxtVar3.zzc() + zzgxtVar3.zzm();
                do {
                    list.add(Integer.valueOf(zzgxtVar3.zzg()));
                } while (zzgxtVar3.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Integer.valueOf(zzgxtVar4.zzg()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzE(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgzv) {
            zzgzv zzgzvVar = (zzgzv) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzc = zzgxtVar.zzc() + zzgxtVar.zzm();
                do {
                    zzgzvVar.zzg(zzgxtVar.zzo());
                } while (zzgxtVar.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgzvVar.zzg(zzgxtVar2.zzo());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzc2 = zzgxtVar3.zzc() + zzgxtVar3.zzm();
                do {
                    list.add(Long.valueOf(zzgxtVar3.zzo()));
                } while (zzgxtVar3.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Long.valueOf(zzgxtVar4.zzo()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzF(List list, zzhaz zzhazVar, zzgyf zzgyfVar) throws IOException {
        int iZzl;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw new zzgzj("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzhazVar.zze();
            zzP(objZze, zzhazVar, zzgyfVar);
            zzhazVar.zzf(objZze);
            list.add(objZze);
            zzgxt zzgxtVar = this.zza;
            if (zzgxtVar.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = zzgxtVar.zzl();
            }
        } while (iZzl == i);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzG(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyw) {
            zzgyw zzgywVar = (zzgyw) list;
            int i = this.zzb & 7;
            if (i == 2) {
                zzgxt zzgxtVar = this.zza;
                int iZzm = zzgxtVar.zzm();
                zzS(iZzm);
                int iZzc = zzgxtVar.zzc() + iZzm;
                do {
                    zzgywVar.zzi(zzgxtVar.zzj());
                } while (zzgxtVar.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new zzgzj("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgywVar.zzi(zzgxtVar2.zzj());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zzgxt zzgxtVar3 = this.zza;
                int iZzm2 = zzgxtVar3.zzm();
                zzS(iZzm2);
                int iZzc2 = zzgxtVar3.zzc() + iZzm2;
                do {
                    list.add(Integer.valueOf(zzgxtVar3.zzj()));
                } while (zzgxtVar3.zzc() < iZzc2);
                return;
            }
            if (i10 != 5) {
                throw new zzgzj("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Integer.valueOf(zzgxtVar4.zzj()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzH(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgzv) {
            zzgzv zzgzvVar = (zzgzv) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzm = zzgxtVar.zzm();
                zzT(iZzm);
                int iZzc = zzgxtVar.zzc() + iZzm;
                do {
                    zzgzvVar.zzg(zzgxtVar.zzs());
                } while (zzgxtVar.zzc() < iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgzvVar.zzg(zzgxtVar2.zzs());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzm2 = zzgxtVar3.zzm();
                zzT(iZzm2);
                int iZzc2 = zzgxtVar3.zzc() + iZzm2;
                do {
                    list.add(Long.valueOf(zzgxtVar3.zzs()));
                } while (zzgxtVar3.zzc() < iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Long.valueOf(zzgxtVar4.zzs()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzI(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyw) {
            zzgyw zzgywVar = (zzgyw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzc = zzgxtVar.zzc() + zzgxtVar.zzm();
                do {
                    zzgywVar.zzi(zzgxtVar.zzk());
                } while (zzgxtVar.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgywVar.zzi(zzgxtVar2.zzk());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzc2 = zzgxtVar3.zzc() + zzgxtVar3.zzm();
                do {
                    list.add(Integer.valueOf(zzgxtVar3.zzk()));
                } while (zzgxtVar3.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Integer.valueOf(zzgxtVar4.zzk()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzJ(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgzv) {
            zzgzv zzgzvVar = (zzgzv) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzc = zzgxtVar.zzc() + zzgxtVar.zzm();
                do {
                    zzgzvVar.zzg(zzgxtVar.zzt());
                } while (zzgxtVar.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgzvVar.zzg(zzgxtVar2.zzt());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzc2 = zzgxtVar3.zzc() + zzgxtVar3.zzm();
                do {
                    list.add(Long.valueOf(zzgxtVar3.zzt()));
                } while (zzgxtVar3.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Long.valueOf(zzgxtVar4.zzt()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    public final void zzK(List list, boolean z10) throws IOException {
        int iZzl;
        int iZzl2;
        if ((this.zzb & 7) != 2) {
            throw new zzgzj("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzgzs) && !z10) {
            zzgzs zzgzsVar = (zzgzs) list;
            do {
                zzp();
                zzgzsVar.zzb();
                zzgxt zzgxtVar = this.zza;
                if (zzgxtVar.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            do {
                list.add(z10 ? zzs() : zzr());
                zzgxt zzgxtVar2 = this.zza;
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar2.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzL(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyw) {
            zzgyw zzgywVar = (zzgyw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzc = zzgxtVar.zzc() + zzgxtVar.zzm();
                do {
                    zzgywVar.zzi(zzgxtVar.zzm());
                } while (zzgxtVar.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgywVar.zzi(zzgxtVar2.zzm());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzc2 = zzgxtVar3.zzc() + zzgxtVar3.zzm();
                do {
                    list.add(Integer.valueOf(zzgxtVar3.zzm()));
                } while (zzgxtVar3.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Integer.valueOf(zzgxtVar4.zzm()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzM(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgzv) {
            zzgzv zzgzvVar = (zzgzv) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzc = zzgxtVar.zzc() + zzgxtVar.zzm();
                do {
                    zzgzvVar.zzg(zzgxtVar.zzu());
                } while (zzgxtVar.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgzvVar.zzg(zzgxtVar2.zzu());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzc2 = zzgxtVar3.zzc() + zzgxtVar3.zzm();
                do {
                    list.add(Long.valueOf(zzgxtVar3.zzu()));
                } while (zzgxtVar3.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Long.valueOf(zzgxtVar4.zzu()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final int zzc() throws IOException {
        int iZzl = this.zzd;
        if (iZzl != 0) {
            this.zzb = iZzl;
            this.zzd = 0;
        } else {
            iZzl = this.zza.zzl();
            this.zzb = iZzl;
        }
        if (iZzl == 0 || iZzl == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZzl >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final zzgxn zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzt(Object obj, zzhaz zzhazVar, zzgyf zzgyfVar) throws IOException {
        zzR(3);
        zzO(obj, zzhazVar, zzgyfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzu(Object obj, zzhaz zzhazVar, zzgyf zzgyfVar) throws IOException {
        zzR(2);
        zzP(obj, zzhazVar, zzgyfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzv(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxd) {
            zzgxd zzgxdVar = (zzgxd) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzc = zzgxtVar.zzc() + zzgxtVar.zzm();
                do {
                    zzgxdVar.zzg(zzgxtVar.zzB());
                } while (zzgxtVar.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgxdVar.zzg(zzgxtVar2.zzB());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzc2 = zzgxtVar3.zzc() + zzgxtVar3.zzm();
                do {
                    list.add(Boolean.valueOf(zzgxtVar3.zzB()));
                } while (zzgxtVar3.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Boolean.valueOf(zzgxtVar4.zzB()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzw(List list) throws IOException {
        int iZzl;
        if ((this.zzb & 7) != 2) {
            throw new zzgzj("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            zzgxt zzgxtVar = this.zza;
            if (zzgxtVar.zzA()) {
                return;
            } else {
                iZzl = zzgxtVar.zzl();
            }
        } while (iZzl == this.zzb);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzx(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyc) {
            zzgyc zzgycVar = (zzgyc) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzm = zzgxtVar.zzm();
                zzT(iZzm);
                int iZzc = zzgxtVar.zzc() + iZzm;
                do {
                    zzgycVar.zzh(zzgxtVar.zza());
                } while (zzgxtVar.zzc() < iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgycVar.zzh(zzgxtVar2.zza());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzm2 = zzgxtVar3.zzm();
                zzT(iZzm2);
                int iZzc2 = zzgxtVar3.zzc() + iZzm2;
                do {
                    list.add(Double.valueOf(zzgxtVar3.zza()));
                } while (zzgxtVar3.zzc() < iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Double.valueOf(zzgxtVar4.zza()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzy(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyw) {
            zzgyw zzgywVar = (zzgyw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar = this.zza;
                int iZzc = zzgxtVar.zzc() + zzgxtVar.zzm();
                do {
                    zzgywVar.zzi(zzgxtVar.zze());
                } while (zzgxtVar.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgywVar.zzi(zzgxtVar2.zze());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzgzj("Protocol message tag had invalid wire type.");
                }
                zzgxt zzgxtVar3 = this.zza;
                int iZzc2 = zzgxtVar3.zzc() + zzgxtVar3.zzm();
                do {
                    list.add(Integer.valueOf(zzgxtVar3.zze()));
                } while (zzgxtVar3.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Integer.valueOf(zzgxtVar4.zze()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzz(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyw) {
            zzgyw zzgywVar = (zzgyw) list;
            int i = this.zzb & 7;
            if (i == 2) {
                zzgxt zzgxtVar = this.zza;
                int iZzm = zzgxtVar.zzm();
                zzS(iZzm);
                int iZzc = zzgxtVar.zzc() + iZzm;
                do {
                    zzgywVar.zzi(zzgxtVar.zzf());
                } while (zzgxtVar.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new zzgzj("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxt zzgxtVar2 = this.zza;
                zzgywVar.zzi(zzgxtVar2.zzf());
                if (zzgxtVar2.zzA()) {
                    return;
                } else {
                    iZzl2 = zzgxtVar2.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zzgxt zzgxtVar3 = this.zza;
                int iZzm2 = zzgxtVar3.zzm();
                zzS(iZzm2);
                int iZzc2 = zzgxtVar3.zzc() + iZzm2;
                do {
                    list.add(Integer.valueOf(zzgxtVar3.zzf()));
                } while (zzgxtVar3.zzc() < iZzc2);
                return;
            }
            if (i10 != 5) {
                throw new zzgzj("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxt zzgxtVar4 = this.zza;
                list.add(Integer.valueOf(zzgxtVar4.zzf()));
                if (zzgxtVar4.zzA()) {
                    return;
                } else {
                    iZzl = zzgxtVar4.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }
}

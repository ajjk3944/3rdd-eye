package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzamu implements zzaok {
    private final List zza;

    public zzamu(int i, List list) {
        this.zza = list;
    }

    private final zzaob zzc(zzaoj zzaojVar) {
        return new zzaob(zze(zzaojVar), "video/mp2t");
    }

    private final zzaop zzd(zzaoj zzaojVar) {
        return new zzaop(zze(zzaojVar), "video/mp2t");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzaoj zzaojVar) {
        String str;
        int i;
        List listSingletonList;
        zzen zzenVar = new zzen(zzaojVar.zze);
        ArrayList arrayList = this.zza;
        while (zzenVar.zza() > 0) {
            int iZzm = zzenVar.zzm();
            int iZzc = zzenVar.zzc() + zzenVar.zzm();
            if (iZzm == 134) {
                arrayList = new ArrayList();
                int iZzm2 = zzenVar.zzm() & 31;
                for (int i10 = 0; i10 < iZzm2; i10++) {
                    String strZzB = zzenVar.zzB(3, StandardCharsets.UTF_8);
                    int iZzm3 = zzenVar.zzm();
                    boolean z10 = (iZzm3 & 128) != 0;
                    if (z10) {
                        i = iZzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZzm = (byte) zzenVar.zzm();
                    zzenVar.zzM(1);
                    if (z10) {
                        int i11 = bZzm & 64;
                        int i12 = zzdk.zza;
                        listSingletonList = Collections.singletonList(i11 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzx zzxVar = new zzx();
                    zzxVar.zzah(str);
                    zzxVar.zzW(strZzB);
                    zzxVar.zzB(i);
                    zzxVar.zzT(listSingletonList);
                    arrayList.add(zzxVar.zzan());
                }
            }
            zzenVar.zzL(iZzc);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final zzaom zzb(int i, zzaoj zzaojVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzanr(new zzanj(zzaojVar.zzb, zzaojVar.zza(), "video/mp2t"));
            }
            if (i == 21) {
                return new zzanr(new zzanh("video/mp2t"));
            }
            if (i == 27) {
                return new zzanr(new zzane(zzc(zzaojVar), false, false, "video/mp2t"));
            }
            if (i == 36) {
                return new zzanr(new zzang(zzc(zzaojVar), "video/mp2t"));
            }
            if (i == 45) {
                return new zzanr(new zzank("video/mp2t"));
            }
            if (i == 89) {
                return new zzanr(new zzamw(zzaojVar.zzd, "video/mp2t"));
            }
            if (i == 172) {
                return new zzanr(new zzamr(zzaojVar.zzb, zzaojVar.zza(), "video/mp2t"));
            }
            if (i == 257) {
                return new zzanz(new zzanq("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzanr(new zzamv(zzaojVar.zzb, zzaojVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i) {
                            case 15:
                                return new zzanr(new zzamt(false, zzaojVar.zzb, zzaojVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzanr(new zzanc(zzd(zzaojVar), "video/mp2t"));
                            case 17:
                                return new zzanr(new zzani(zzaojVar.zzb, zzaojVar.zza(), "video/mp2t"));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzanz(new zzanq("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzanr(new zzamv(zzaojVar.zzb, zzaojVar.zza(), 4096, "video/mp2t"));
                }
                return new zzanr(new zzamp(zzaojVar.zzb, zzaojVar.zza(), "video/mp2t"));
            }
        }
        return new zzanr(new zzamz(zzd(zzaojVar), "video/mp2t"));
    }

    public zzamu() {
        this(0);
    }

    public zzamu(int i) {
        this.zza = zzfyf.zzn();
    }
}

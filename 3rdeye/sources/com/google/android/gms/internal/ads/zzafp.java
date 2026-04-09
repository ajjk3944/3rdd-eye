package com.google.android.gms.internal.ads;

import N7.H7;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzafp implements zzafh {
    public final zzfyf zza;
    private final int zzb;

    private zzafp(int i, zzfyf zzfyfVar) {
        this.zzb = i;
        this.zza = zzfyfVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzafp zzc(int i, zzen zzenVar) {
        zzafh zzafqVar;
        String str;
        zzfyc zzfycVar = new zzfyc();
        int iZzd = zzenVar.zzd();
        int iZzb = -2;
        while (zzenVar.zza() > 8) {
            int iZzi = zzenVar.zzi();
            int iZzc = zzenVar.zzc() + zzenVar.zzi();
            zzenVar.zzK(iZzc);
            if (iZzi != 1414744396) {
                zzafq zzafqVar2 = null;
                switch (iZzi) {
                    case 1718776947:
                        if (iZzb == 2) {
                            zzenVar.zzM(4);
                            int iZzi2 = zzenVar.zzi();
                            int iZzi3 = zzenVar.zzi();
                            zzenVar.zzM(4);
                            int iZzi4 = zzenVar.zzi();
                            switch (iZzi4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                H7.r(iZzi4, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                zzx zzxVar = new zzx();
                                zzxVar.zzam(iZzi2);
                                zzxVar.zzQ(iZzi3);
                                zzxVar.zzah(str);
                                zzafqVar2 = new zzafq(zzxVar.zzan());
                            }
                        } else if (iZzb == 1) {
                            int iZzk = zzenVar.zzk();
                            String str2 = iZzk != 1 ? iZzk != 85 ? iZzk != 255 ? iZzk != 8192 ? iZzk != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int iZzk2 = zzenVar.zzk();
                                int iZzi5 = zzenVar.zzi();
                                zzenVar.zzM(6);
                                int iZzn = zzex.zzn(zzenVar.zzk());
                                int iZzk3 = zzenVar.zza() > 0 ? zzenVar.zzk() : 0;
                                zzx zzxVar2 = new zzx();
                                zzxVar2.zzah(str2);
                                zzxVar2.zzD(iZzk2);
                                zzxVar2.zzai(iZzi5);
                                if (str2.equals("audio/raw") && iZzn != 0) {
                                    zzxVar2.zzab(iZzn);
                                }
                                if (str2.equals("audio/mp4a-latm") && iZzk3 > 0) {
                                    byte[] bArr = new byte[iZzk3];
                                    zzenVar.zzH(bArr, 0, iZzk3);
                                    zzxVar2.zzT(zzfyf.zzo(bArr));
                                }
                                zzafqVar = new zzafq(zzxVar2.zzan());
                                break;
                            } else {
                                H7.r(iZzk, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                            }
                        } else {
                            zzea.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzex.zzD(iZzb)));
                        }
                        zzafqVar = zzafqVar2;
                        break;
                    case 1751742049:
                        zzafqVar = zzafm.zzb(zzenVar);
                        break;
                    case 1752331379:
                        zzafqVar = zzafn.zzd(zzenVar);
                        break;
                    case 1852994675:
                        zzafqVar = zzafr.zzb(zzenVar);
                        break;
                    default:
                        zzafqVar = zzafqVar2;
                        break;
                }
            } else {
                zzafqVar = zzc(zzenVar.zzi(), zzenVar);
            }
            if (zzafqVar != null) {
                if (zzafqVar.zza() == 1752331379) {
                    iZzb = ((zzafn) zzafqVar).zzb();
                }
                zzfycVar.zzf(zzafqVar);
            }
            zzenVar.zzL(iZzc);
            zzenVar.zzK(iZzd);
        }
        return new zzafp(i, zzfycVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final int zza() {
        return this.zzb;
    }

    public final zzafh zzb(Class cls) {
        zzfyf zzfyfVar = this.zza;
        int size = zzfyfVar.size();
        int i = 0;
        while (i < size) {
            zzafh zzafhVar = (zzafh) zzfyfVar.get(i);
            i++;
            if (zzafhVar.getClass() == cls) {
                return zzafhVar;
            }
        }
        return null;
    }
}

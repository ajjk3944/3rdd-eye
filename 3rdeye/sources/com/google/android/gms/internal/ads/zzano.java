package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzano {
    public static zzanm zza(zzem zzemVar) throws zzaz {
        int iZzd;
        int i;
        char c10;
        int i10;
        int i11;
        int iZzd2;
        char c11;
        int iZzd3 = zzemVar.zzd(8);
        int i12 = 5;
        int iZzd4 = zzemVar.zzd(5);
        if (iZzd4 != 31) {
            switch (iZzd4) {
                case 0:
                    iZzd = 96000;
                    break;
                case 1:
                    iZzd = 88200;
                    break;
                case 2:
                    iZzd = 64000;
                    break;
                case 3:
                    iZzd = 48000;
                    break;
                case 4:
                    iZzd = 44100;
                    break;
                case 5:
                    iZzd = 32000;
                    break;
                case 6:
                    iZzd = 24000;
                    break;
                case 7:
                    iZzd = 22050;
                    break;
                case 8:
                    iZzd = 16000;
                    break;
                case 9:
                    iZzd = 12000;
                    break;
                case 10:
                    iZzd = 11025;
                    break;
                case 11:
                    iZzd = 8000;
                    break;
                case 12:
                    iZzd = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzaz.zzc("Unsupported sampling rate index " + iZzd4);
                case 15:
                    iZzd = 57600;
                    break;
                case 16:
                    iZzd = 51200;
                    break;
                case 17:
                    iZzd = 40000;
                    break;
                case 18:
                    iZzd = 38400;
                    break;
                case 19:
                    iZzd = 34150;
                    break;
                case 20:
                    iZzd = 28800;
                    break;
                case 21:
                    iZzd = 25600;
                    break;
                case 22:
                    iZzd = 20000;
                    break;
                case 23:
                    iZzd = 19200;
                    break;
                case 24:
                    iZzd = 17075;
                    break;
                case 25:
                    iZzd = 14400;
                    break;
                case 26:
                    iZzd = 12800;
                    break;
                case 27:
                    iZzd = 9600;
                    break;
            }
        } else {
            iZzd = zzemVar.zzd(24);
        }
        int iZzd5 = zzemVar.zzd(3);
        int i13 = 1;
        if (iZzd5 == 0) {
            i = 768;
        } else if (iZzd5 == 1) {
            i = 1024;
        } else if (iZzd5 == 2 || iZzd5 == 3) {
            i = 2048;
        } else {
            if (iZzd5 != 4) {
                throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + iZzd5);
            }
            i = 4096;
        }
        if (iZzd5 == 0 || iZzd5 == 1) {
            c10 = 0;
        } else if (iZzd5 == 2) {
            c10 = 2;
        } else if (iZzd5 == 3) {
            c10 = 3;
        } else {
            if (iZzd5 != 4) {
                throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + iZzd5);
            }
            c10 = 1;
        }
        zzemVar.zzn(2);
        zze(zzemVar);
        int iZzd6 = zzemVar.zzd(5);
        int i14 = 0;
        int iZzc = 0;
        while (true) {
            int i15 = 16;
            if (i14 < iZzd6 + 1) {
                int iZzd7 = zzemVar.zzd(3);
                iZzc += zzc(zzemVar, 5, 8, 16) + 1;
                if ((iZzd7 == 0 || iZzd7 == 2) && zzemVar.zzp()) {
                    zze(zzemVar);
                }
                i14++;
            } else {
                int iZzc2 = zzc(zzemVar, 4, 8, 16) + 1;
                zzemVar.zzm();
                int i16 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i16 >= iZzc2) {
                        int i17 = iZzd3;
                        byte[] bArr = null;
                        if (zzemVar.zzp()) {
                            int iZzc3 = zzc(zzemVar, 2, 4, 8) + 1;
                            for (int i18 = 0; i18 < iZzc3; i18++) {
                                int iZzc4 = zzc(zzemVar, 4, 8, 16);
                                int iZzc5 = zzc(zzemVar, 4, 8, 16);
                                if (iZzc4 == 7) {
                                    int iZzd8 = zzemVar.zzd(4) + 1;
                                    zzemVar.zzn(4);
                                    byte[] bArr2 = new byte[iZzd8];
                                    for (int i19 = 0; i19 < iZzd8; i19++) {
                                        bArr2[i19] = (byte) zzemVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzemVar.zzn(iZzc5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzd) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                throw zzaz.zzc("Unsupported sampling rate " + iZzd);
                        }
                        return new zzanm(i17, (int) (iZzd * d10), (int) (i * d10), bArr3, null);
                    }
                    int iZzd9 = zzemVar.zzd(2);
                    if (iZzd9 == 0) {
                        i10 = iZzd3;
                        i11 = i13;
                        zzf(zzemVar);
                        if (c10 > 0) {
                            zzd(zzemVar);
                        }
                    } else if (iZzd9 == i13) {
                        i11 = i13;
                        if (zzf(zzemVar)) {
                            zzemVar.zzm();
                        }
                        if (c10 > 0) {
                            zzd(zzemVar);
                            iZzd2 = zzemVar.zzd(2);
                            c11 = c10;
                        } else {
                            iZzd2 = 0;
                            c11 = 0;
                        }
                        if (iZzd2 > 0) {
                            zzemVar.zzn(6);
                            int iZzd10 = zzemVar.zzd(2);
                            zzemVar.zzn(4);
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(i12);
                            }
                            if (iZzd2 == 2 || iZzd2 == 3) {
                                zzemVar.zzn(6);
                            }
                            if (iZzd10 == 2) {
                                zzemVar.zzm();
                            }
                        }
                        i10 = iZzd3;
                        int iFloor = ((int) Math.floor(Math.log(iZzc - 1) / Math.log(2.0d))) + 1;
                        int iZzd11 = zzemVar.zzd(2);
                        if (iZzd11 > 0 && zzemVar.zzp()) {
                            zzemVar.zzn(iFloor);
                        }
                        if (zzemVar.zzp()) {
                            zzemVar.zzn(iFloor);
                        }
                        if (c11 == 0 && iZzd11 == 0) {
                            zzemVar.zzm();
                        }
                    } else if (iZzd9 != 3) {
                        i10 = iZzd3;
                        i11 = i13;
                    } else {
                        zzc(zzemVar, 4, 8, i15);
                        int iZzc6 = zzc(zzemVar, 4, 8, i15);
                        i11 = i13;
                        if (zzemVar.zzp()) {
                            zzc(zzemVar, 8, i15, 0);
                        }
                        zzemVar.zzm();
                        if (iZzc6 > 0) {
                            zzemVar.zzn(iZzc6 * 8);
                        }
                        i10 = iZzd3;
                    }
                    i16++;
                    iZzd3 = i10;
                    i13 = i11;
                    i12 = 5;
                    i15 = 16;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzb(com.google.android.gms.internal.ads.zzem r18, com.google.android.gms.internal.ads.zzanl r19) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r0 = r18
            r1 = r19
            r0.zzb()
            r2 = 3
            r3 = 8
            int r2 = zzc(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lc4
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzdd.zzd(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.zzgbd.zza(r10, r12)
            r16 = r10
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.zzgbd.zza(r14, r10)
            int r6 = r0.zza()
            r10 = -1
            if (r6 >= r2) goto L46
        L44:
            r14 = r10
            goto L6f
        L46:
            long r14 = r0.zze(r2)
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 != 0) goto L6f
            int r6 = r0.zza()
            if (r6 >= r3) goto L55
            goto L44
        L55:
            long r14 = r0.zze(r3)
            long r16 = r14 + r16
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 != 0) goto L6d
            int r3 = r0.zza()
            if (r3 >= r7) goto L66
            goto L44
        L66:
            long r6 = r0.zze(r7)
            long r14 = r6 + r16
            goto L6f
        L6d:
            r14 = r16
        L6f:
            r1.zzb = r14
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 != 0) goto L76
            return r4
        L76:
            r6 = 16
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 > 0) goto Lb1
            r6 = 0
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto La3
            int r3 = r1.zza
            r6 = 0
            if (r3 == r9) goto L9c
            if (r3 == r2) goto L95
            r2 = 17
            if (r3 == r2) goto L8e
            goto La3
        L8e:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r6)
            throw r0
        L95:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r6)
            throw r0
        L9c:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r6)
            throw r0
        La3:
            r2 = 11
            r3 = 24
            int r0 = zzc(r0, r2, r3, r3)
            r1.zzc = r0
            if (r0 == r5) goto Lb0
            return r9
        Lb0:
            return r4
        Lb1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        Lc4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzano.zzb(com.google.android.gms.internal.ads.zzem, com.google.android.gms.internal.ads.zzanl):boolean");
    }

    private static int zzc(zzem zzemVar, int i, int i10, int i11) {
        zzdd.zzd(Math.max(Math.max(i, i10), i11) <= 31);
        int i12 = (1 << i) - 1;
        int i13 = (1 << i10) - 1;
        zzgbb.zza(zzgbb.zza(i12, i13), 1 << i11);
        if (zzemVar.zza() < i) {
            return -1;
        }
        int iZzd = zzemVar.zzd(i);
        if (iZzd == i12) {
            if (zzemVar.zza() < i10) {
                return -1;
            }
            int iZzd2 = zzemVar.zzd(i10);
            iZzd += iZzd2;
            if (iZzd2 == i13) {
                if (zzemVar.zza() < i11) {
                    return -1;
                }
                return zzemVar.zzd(i11) + iZzd;
            }
        }
        return iZzd;
    }

    private static void zzd(zzem zzemVar) {
        zzemVar.zzn(3);
        zzemVar.zzn(8);
        boolean zZzp = zzemVar.zzp();
        boolean zZzp2 = zzemVar.zzp();
        if (zZzp) {
            zzemVar.zzn(5);
        }
        if (zZzp2) {
            zzemVar.zzn(6);
        }
    }

    private static void zze(zzem zzemVar) {
        int iZzd;
        int iZzd2 = zzemVar.zzd(2);
        if (iZzd2 == 0) {
            zzemVar.zzn(6);
            return;
        }
        int iZzc = zzc(zzemVar, 5, 8, 16) + 1;
        if (iZzd2 == 1) {
            zzemVar.zzn(iZzc * 7);
            return;
        }
        if (iZzd2 == 2) {
            boolean zZzp = zzemVar.zzp();
            int i = true != zZzp ? 5 : 1;
            int i10 = true == zZzp ? 7 : 5;
            int i11 = true == zZzp ? 8 : 6;
            int i12 = 0;
            while (i12 < iZzc) {
                if (zzemVar.zzp()) {
                    zzemVar.zzn(7);
                    iZzd = 0;
                } else {
                    if (zzemVar.zzd(2) == 3 && zzemVar.zzd(i10) * i != 0) {
                        zzemVar.zzm();
                    }
                    iZzd = zzemVar.zzd(i11) * i;
                    if (iZzd != 0 && iZzd != 180) {
                        zzemVar.zzm();
                    }
                    zzemVar.zzm();
                }
                if (iZzd != 0 && iZzd != 180 && zzemVar.zzp()) {
                    i12++;
                }
                i12++;
            }
        }
    }

    private static boolean zzf(zzem zzemVar) {
        zzemVar.zzn(3);
        boolean zZzp = zzemVar.zzp();
        if (zZzp) {
            zzemVar.zzn(13);
        }
        return zZzp;
    }
}

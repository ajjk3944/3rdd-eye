package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzags implements zzau {
    public final String zza;
    public final String zzb;

    public zzags(String str, String str2) {
        this.zza = zzfuk.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzags zzagsVar = (zzags) obj;
            if (this.zza.equals(zzagsVar.zza) && this.zzb.equals(zzagsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return this.zzb.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzar r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.zza
            int r1 = r0.hashCode()
            switch(r1) {
                case -1935137620: goto L67;
                case -215998278: goto L5d;
                case -113312716: goto L53;
                case 62359119: goto L49;
                case 67703139: goto L3e;
                case 79833656: goto L34;
                case 428414940: goto L29;
                case 993300766: goto L1f;
                case 1746739798: goto L15;
                case 1939198791: goto Lb;
                default: goto L9;
            }
        L9:
            goto L71
        Lb:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 1
            goto L72
        L15:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 3
            goto L72
        L1f:
            java.lang.String r1 = "DISCNUMBER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 6
            goto L72
        L29:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 9
            goto L72
        L34:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 0
            goto L72
        L3e:
            java.lang.String r1 = "GENRE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 8
            goto L72
        L49:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 2
            goto L72
        L53:
            java.lang.String r1 = "TRACKNUMBER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 4
            goto L72
        L5d:
            java.lang.String r1 = "TOTALDISCS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 7
            goto L72
        L67:
            java.lang.String r1 = "TOTALTRACKS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 5
            goto L72
        L71:
            r0 = -1
        L72:
            r1 = 10
            switch(r0) {
                case 0: goto Lc6;
                case 1: goto Lc0;
                case 2: goto Lba;
                case 3: goto Lb4;
                case 4: goto La8;
                case 5: goto L9c;
                case 6: goto L90;
                case 7: goto L84;
                case 8: goto L7e;
                case 9: goto L78;
                default: goto L77;
            }
        L77:
            goto Lb3
        L78:
            java.lang.String r0 = r2.zzb
            r3.zzh(r0)
            return
        L7e:
            java.lang.String r0 = r2.zzb
            r3.zzj(r0)
            return
        L84:
            java.lang.String r0 = r2.zzb
            java.lang.Integer r0 = com.google.android.gms.internal.ads.zzgbi.zzg(r0, r1)
            if (r0 == 0) goto Lb3
            r3.zzs(r0)
            return
        L90:
            java.lang.String r0 = r2.zzb
            java.lang.Integer r0 = com.google.android.gms.internal.ads.zzgbi.zzg(r0, r1)
            if (r0 == 0) goto Lb3
            r3.zzi(r0)
            return
        L9c:
            java.lang.String r0 = r2.zzb
            java.lang.Integer r0 = com.google.android.gms.internal.ads.zzgbi.zzg(r0, r1)
            if (r0 == 0) goto Lb3
            r3.zzt(r0)
            return
        La8:
            java.lang.String r0 = r2.zzb
            java.lang.Integer r0 = com.google.android.gms.internal.ads.zzgbi.zzg(r0, r1)
            if (r0 == 0) goto Lb3
            r3.zzu(r0)
        Lb3:
            return
        Lb4:
            java.lang.String r0 = r2.zzb
            r3.zzc(r0)
            return
        Lba:
            java.lang.String r0 = r2.zzb
            r3.zzd(r0)
            return
        Lc0:
            java.lang.String r0 = r2.zzb
            r3.zze(r0)
            return
        Lc6:
            java.lang.String r0 = r2.zzb
            r3.zzr(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzags.zza(com.google.android.gms.internal.ads.zzar):void");
    }
}

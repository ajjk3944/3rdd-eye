package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbak {
    public static long zza(long j4, int i) {
        if (i == 1) {
            return j4;
        }
        int i10 = i >> 1;
        long j10 = (j4 * j4) % 1073807359;
        return (i & 1) == 0 ? zza(j10, i10) % 1073807359 : ((zza(j10, i10) % 1073807359) * j4) % 1073807359;
    }

    public static String zzb(String[] strArr, int i, int i10) {
        int i11 = i10 + i;
        if (strArr.length < i11) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i13 = i11 - 1;
            if (i >= i13) {
                sb.append(strArr[i13]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static void zzc(String[] strArr, int i, int i10, PriorityQueue priorityQueue) throws UnsupportedEncodingException {
        int length = strArr.length;
        if (length < 6) {
            zzd(i, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzd(i, jZze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i11 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i11 >= length2 - 5) {
                return;
            }
            long jZza = zzbag.zza(strArr[i11 - 1]);
            long jZza2 = zzbag.zza(strArr[i11 + 5]);
            String strZzb = zzb(strArr, i11, 6);
            jZze = (((jZza2 + 2147483647L) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + 2147483647L) % 1073807359) * zza(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzd(i, jZze, strZzb, length2, priorityQueue);
            i11++;
        }
    }

    public static void zzd(int i, long j4, String str, int i10, PriorityQueue priorityQueue) {
        zzbaj zzbajVar = new zzbaj(j4, str, i10);
        if ((priorityQueue.size() != i || (((zzbaj) priorityQueue.peek()).zzc <= zzbajVar.zzc && ((zzbaj) priorityQueue.peek()).zza <= zzbajVar.zza)) && !priorityQueue.contains(zzbajVar)) {
            priorityQueue.add(zzbajVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i, int i10) {
        long jZza = (zzbag.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i11 = 1; i11 < i10; i11++) {
            jZza = (((zzbag.zza(strArr[i11]) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}

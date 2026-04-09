package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbaf {
    private final int zza;
    private final zzbac zzb = new zzbah();

    public zzbaf(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) throws IOException {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbae zzbaeVar = new zzbae();
        int i10 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i10, new zzbad(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbag.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzbak.zzc(strArrZzb, i10, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbaeVar.zzb.write(this.zzb.zzb(((zzbaj) it.next()).zzb));
            } catch (IOException e4) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while writing hash to byteStream", e4);
            }
        }
        return zzbaeVar.toString();
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaqo implements zzaqa {
    private final Map zza = new HashMap();
    private final zzapn zzb;
    private final BlockingQueue zzc;
    private final zzaps zzd;

    public zzaqo(zzapn zzapnVar, BlockingQueue blockingQueue, zzaps zzapsVar) {
        this.zzd = zzapsVar;
        this.zzb = zzapnVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final synchronized void zza(zzaqb zzaqbVar) {
        try {
            Map map = this.zza;
            String strZzj = zzaqbVar.zzj();
            List list = (List) map.remove(strZzj);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzaqn.zzb) {
                zzaqn.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
            }
            zzaqb zzaqbVar2 = (zzaqb) list.remove(0);
            map.put(strZzj, list);
            zzaqbVar2.zzu(this);
            try {
                this.zzc.put(zzaqbVar2);
            } catch (InterruptedException e4) {
                zzaqn.zzb("Couldn't add request to queue. %s", e4.toString());
                Thread.currentThread().interrupt();
                this.zzb.zzb();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzaqb zzaqbVar, zzaqh zzaqhVar) {
        List list;
        zzapk zzapkVar = zzaqhVar.zzb;
        if (zzapkVar == null || zzapkVar.zza(System.currentTimeMillis())) {
            zza(zzaqbVar);
            return;
        }
        String strZzj = zzaqbVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(strZzj);
        }
        if (list != null) {
            if (zzaqn.zzb) {
                zzaqn.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzaqb) it.next(), zzaqhVar, null);
            }
        }
    }

    public final synchronized boolean zzc(zzaqb zzaqbVar) {
        try {
            Map map = this.zza;
            String strZzj = zzaqbVar.zzj();
            if (!map.containsKey(strZzj)) {
                map.put(strZzj, null);
                zzaqbVar.zzu(this);
                if (zzaqn.zzb) {
                    zzaqn.zza("new request, sending to network %s", strZzj);
                }
                return false;
            }
            List arrayList = (List) map.get(strZzj);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzaqbVar.zzm("waiting-for-response");
            arrayList.add(zzaqbVar);
            map.put(strZzj, arrayList);
            if (zzaqn.zzb) {
                zzaqn.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}

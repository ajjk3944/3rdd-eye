package com.google.android.gms.ads.internal.util;

import T1.z;
import android.content.Context;
import android.os.Build;
import androidx.work.b;
import androidx.work.d;
import androidx.work.e;
import androidx.work.n;
import androidx.work.p;
import b2.C1842w;
import c2.C2053c;
import c9.C2097r;
import c9.C2101v;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.l;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbq {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void zzb(Context context) {
        try {
            z.d(context.getApplicationContext(), new b(new b.a()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            z zVarC = z.c(context);
            zVarC.getClass();
            zVarC.f12233d.d(new C2053c(zVarC, "offline_ping_sender_work"));
            n nVar = n.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            n networkType = n.CONNECTED;
            l.f(networkType, "networkType");
            d dVar = new d(networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? C2097r.L0(linkedHashSet) : C2101v.f18583b);
            p.a aVar = new p.a(OfflinePingSender.class);
            aVar.f17047c.f17146j = dVar;
            aVar.f17048d.add("offline_ping_sender_work");
            zVarC.a(Collections.singletonList(aVar.a()));
        } catch (IllegalStateException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to instantiate WorkManager.", e4);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws Throwable {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        n nVar = n.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        n networkType = n.CONNECTED;
        l.f(networkType, "networkType");
        d dVar = new d(networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? C2097r.L0(linkedHashSet) : C2101v.f18583b);
        HashMap map = new HashMap();
        map.put("uri", zzaVar.zza);
        map.put("gws_query_id", zzaVar.zzb);
        map.put("image_url", zzaVar.zzc);
        e eVar = new e(map);
        e.i(eVar);
        p.a aVar = new p.a(OfflineNotificationPoster.class);
        C1842w c1842w = aVar.f17047c;
        c1842w.f17146j = dVar;
        c1842w.f17142e = eVar;
        aVar.f17048d.add("offline_notification_work");
        p pVarA = aVar.a();
        try {
            z zVarC = z.c(context);
            zVarC.getClass();
            zVarC.a(Collections.singletonList(pVarA));
            return true;
        } catch (IllegalStateException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to instantiate WorkManager.", e4);
            return false;
        }
    }
}

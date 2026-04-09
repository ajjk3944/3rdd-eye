package com.google.android.gms.ads.nonagon.signalgeneration;

import A4.a;
import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzdxg;
import com.google.android.gms.internal.ads.zzdyq;
import com.google.android.gms.internal.ads.zzgci;
import com.google.android.gms.internal.ads.zzgdb;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzbi implements zzgci {
    private final Executor zza;
    private final zzdxg zzb;

    public zzbi(Executor executor, zzdxg zzdxgVar) {
        this.zza = executor;
        this.zzb = zzdxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final /* bridge */ /* synthetic */ a zza(Object obj) throws Exception {
        final zzbvo zzbvoVar = (zzbvo) obj;
        return zzgdb.zzn(this.zzb.zzc(zzbvoVar), new zzgci() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
            @Override // com.google.android.gms.internal.ads.zzgci
            public final a zza(Object obj2) {
                zzdyq zzdyqVar = (zzdyq) obj2;
                zzbk zzbkVar = new zzbk(new JsonReader(new InputStreamReader(zzdyqVar.zzb())), zzdyqVar.zza());
                zzbvo zzbvoVar2 = zzbvoVar;
                try {
                    zzbkVar.zzb = com.google.android.gms.ads.internal.client.zzbb.zzb().zzn(zzbvoVar2.zza).toString();
                } catch (JSONException unused) {
                    zzbkVar.zzb = JsonUtils.EMPTY_JSON;
                }
                Bundle bundle = zzbvoVar2.zzn;
                if (!bundle.isEmpty()) {
                    try {
                        zzbkVar.zzc = com.google.android.gms.ads.internal.client.zzbb.zzb().zzn(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return zzgdb.zzh(zzbkVar);
            }
        }, this.zza);
    }
}

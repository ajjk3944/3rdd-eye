package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfno extends zzfnk {
    public zzfno(zzfnd zzfndVar, HashSet hashSet, JSONObject jSONObject, long j4) {
        super(zzfndVar, hashSet, jSONObject, j4);
    }

    private final void zzc(String str) {
        zzflz zzflzVarZza = zzflz.zza();
        if (zzflzVarZza != null) {
            for (zzflh zzflhVar : zzflzVarZza.zzc()) {
                if (((zzfnk) this).zza.contains(zzflhVar.zzh())) {
                    zzflhVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnl, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}

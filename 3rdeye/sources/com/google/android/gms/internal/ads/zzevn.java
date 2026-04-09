package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzevn implements zzetu {
    private final JSONObject zza;

    public zzevn(Context context) {
        this.zza = zzbvk.zzc(context, VersionInfoParcel.forPackage());
    }

    public static /* synthetic */ void zzc(zzevn zzevnVar, JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", zzevnVar.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmi)).booleanValue() ? zzgdb.zzh(new zzett() { // from class: com.google.android.gms.internal.ads.zzevl
            @Override // com.google.android.gms.internal.ads.zzett
            public final void zzb(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.zzett
            public final /* synthetic */ void zza(Object obj) {
            }
        }) : zzgdb.zzh(new zzett() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // com.google.android.gms.internal.ads.zzett
            public final void zzb(Object obj) throws JSONException {
                zzevn.zzc(this.zza, (JSONObject) obj);
            }

            @Override // com.google.android.gms.internal.ads.zzett
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }
}

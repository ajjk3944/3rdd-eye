package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import s.C5537a;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbee extends C5537a {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkf)).split(StringUtils.COMMA));
    private final zzbeh zzc;
    private final C5537a zzd;
    private final zzdsh zze;

    public zzbee(zzbeh zzbehVar, C5537a c5537a, zzdsh zzdshVar) {
        this.zzd = c5537a;
        this.zzc = zzbehVar;
        this.zze = zzdshVar;
    }

    private final void zzb(String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zze, null, "pact_action", new Pair("pe", str));
    }

    @Override // s.C5537a
    public final void extraCallback(String str, Bundle bundle) {
        C5537a c5537a = this.zzd;
        if (c5537a != null) {
            c5537a.extraCallback(str, bundle);
        }
    }

    @Override // s.C5537a
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        C5537a c5537a = this.zzd;
        if (c5537a != null) {
            return c5537a.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // s.C5537a
    public final void onActivityResized(int i, int i10, Bundle bundle) {
        C5537a c5537a = this.zzd;
        if (c5537a != null) {
            c5537a.onActivityResized(i, i10, bundle);
        }
    }

    @Override // s.C5537a
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        C5537a c5537a = this.zzd;
        if (c5537a != null) {
            c5537a.onMessageChannelReady(bundle);
        }
    }

    @Override // s.C5537a
    public final void onNavigationEvent(int i, Bundle bundle) {
        this.zza.set(false);
        C5537a c5537a = this.zzd;
        if (c5537a != null) {
            c5537a.onNavigationEvent(i, bundle);
        }
        zzbeh zzbehVar = this.zzc;
        zzbehVar.zzi(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        zzbehVar.zzf();
        zzb("pact_reqpmc");
    }

    @Override // s.C5537a
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e4);
        }
        C5537a c5537a = this.zzd;
        if (c5537a != null) {
            c5537a.onPostMessage(str, bundle);
        }
    }

    @Override // s.C5537a
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z10, Bundle bundle) {
        C5537a c5537a = this.zzd;
        if (c5537a != null) {
            c5537a.onRelationshipValidationResult(i, uri, z10, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzduw {
    private final zzdug zza;
    private final zzdpp zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzduw(zzdug zzdugVar, zzdpp zzdppVar) {
        this.zza = zzdugVar;
        this.zzb = zzdppVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        zzdpo zzdpoVarZza;
        zzdpo zzdpoVarZza2;
        zzbsc zzbscVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbmb zzbmbVar = (zzbmb) it.next();
                    String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjC)).booleanValue() || (zzdpoVarZza2 = this.zzb.zza(zzbmbVar.zza)) == null || (zzbscVar = zzdpoVarZza2.zzc) == null) ? "" : zzbscVar.toString();
                    String str = string;
                    boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjD)).booleanValue() && (zzdpoVarZza = this.zzb.zza(zzbmbVar.zza)) != null && zzdpoVarZza.zzd;
                    List list2 = this.zzd;
                    String str2 = zzbmbVar.zza;
                    list2.add(new zzduv(str2, str, this.zzb.zzb(str2), zzbmbVar.zzb ? 1 : 0, zzbmbVar.zzd, zzbmbVar.zzc, z10));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    zzdug zzdugVar = this.zza;
                    if (!zzdugVar.zzt()) {
                        zzc();
                        return jSONArray;
                    }
                    zzd(zzdugVar.zzg());
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzduv) it.next()).zza());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzduu(this));
    }
}

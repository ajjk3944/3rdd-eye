package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbsj extends zzbss {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbsj(zzcfe zzcfeVar, Map map) {
        super(zzcfeVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcfeVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        Map map = this.zza;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(AppIntroBaseFragmentKt.ARG_TITLE, this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j4 = this.zzd;
        if (j4 > -1) {
            data.putExtra("beginTime", j4);
        }
        long j10 = this.zze;
        if (j10 > -1) {
            data.putExtra("endTime", j10);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() throws JSONException {
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        if (!new zzbck(context).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(context);
        Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        builderZzL.setTitle(resourcesZze != null ? resourcesZze.getString(R.string.f22445s5) : "Create calendar event");
        builderZzL.setMessage(resourcesZze != null ? resourcesZze.getString(R.string.f22446s6) : "Allow Ad to create a calendar event?");
        builderZzL.setPositiveButton(resourcesZze != null ? resourcesZze.getString(R.string.f22443s3) : "Accept", new zzbsh(this));
        builderZzL.setNegativeButton(resourcesZze != null ? resourcesZze.getString(R.string.f22444s4) : "Decline", new zzbsi(this));
        builderZzL.create().show();
    }
}

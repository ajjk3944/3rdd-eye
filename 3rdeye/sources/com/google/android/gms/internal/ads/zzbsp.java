package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbsp extends zzbss {
    private final Map zza;
    private final Context zzb;

    public zzbsp(zzcfe zzcfeVar, Map map) {
        super(zzcfeVar, "storePicture");
        this.zza = map;
        this.zzb = zzcfeVar.zzi();
    }

    public final void zzb() throws JSONException {
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        if (!new zzbck(context).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzh("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzv.zzr();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        com.google.android.gms.ads.internal.zzv.zzr();
        AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(context);
        builderZzL.setTitle(resourcesZze != null ? resourcesZze.getString(R.string.f22441s1) : "Save image");
        builderZzL.setMessage(resourcesZze != null ? resourcesZze.getString(R.string.f22442s2) : "Allow Ad to store image in Picture gallery?");
        builderZzL.setPositiveButton(resourcesZze != null ? resourcesZze.getString(R.string.f22443s3) : "Accept", new zzbsn(this, str, lastPathSegment));
        builderZzL.setNegativeButton(resourcesZze != null ? resourcesZze.getString(R.string.f22444s4) : "Decline", new zzbso(this));
        builderZzL.create().show();
    }
}

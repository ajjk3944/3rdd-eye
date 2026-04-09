package com.google.android.gms.ads.identifier;

import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@18.2.0 */
/* loaded from: classes.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            try {
                zzk.zzb(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    zzk.zza();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e4) {
                e = e4;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                zzk.zza();
            } catch (IndexOutOfBoundsException e10) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e10.getMessage(), e10);
                zzk.zza();
            } catch (RuntimeException e11) {
                e = e11;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                zzk.zza();
            }
        } catch (Throwable th) {
            zzk.zza();
            throw th;
        }
    }
}

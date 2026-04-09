package com.google.android.gms.ads.identifier;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e2) {
            e = e2;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
        } catch (IndexOutOfBoundsException e10) {
            Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
        }
    }
}

package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ed1 extends Thread {
    public final /* synthetic */ HashMap f;

    public ed1(HashMap map) {
        this.f = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap map = this.f;
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String string = builderBuildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    new StringBuilder(String.valueOf(string).length() + 65);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
        } catch (RuntimeException e3) {
            e = e3;
            String message3 = e.getMessage();
            new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
        } catch (Throwable th) {
            throw th;
        }
    }
}

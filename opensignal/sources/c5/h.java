package c5;

import android.net.Uri;
import android.os.Looper;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3309a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(n6.c cVar, int i10) {
        super("ExoPlayer:SimpleDecoder");
        this.f3309a = i10;
        this.f3310d = cVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f3309a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e4) {
                        throw new IllegalStateException(e4);
                    }
                } while (((eb.c) this.f3310d).j());
                return;
            case 1:
                try {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    ((hk.h) this.f3310d).j();
                    return;
                } catch (InterruptedIOException | InterruptedException unused) {
                    return;
                }
            case 2:
                HashMap map = (HashMap) this.f3310d;
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(string);
                            e0.p("HttpUrlPinger", sb2.toString());
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th2) {
                        httpURLConnection.disconnect();
                        throw th2;
                    }
                } catch (IOException e10) {
                    e = e10;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(c7.a.d(c7.a.d(27, string), message));
                    sb3.append("Error while pinging URL: ");
                    sb3.append(string);
                    sb3.append(". ");
                    sb3.append(message);
                    e0.q("HttpUrlPinger", sb3.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e11) {
                    String message2 = e11.getMessage();
                    StringBuilder sb4 = new StringBuilder(c7.a.d(c7.a.d(32, string), message2));
                    sb4.append("Error while parsing ping URL: ");
                    sb4.append(string);
                    sb4.append(". ");
                    sb4.append(message2);
                    e0.q("HttpUrlPinger", sb4.toString(), e11);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    String message3 = e.getMessage();
                    StringBuilder sb32 = new StringBuilder(c7.a.d(c7.a.d(27, string), message3));
                    sb32.append("Error while pinging URL: ");
                    sb32.append(string);
                    sb32.append(". ");
                    sb32.append(message3);
                    e0.q("HttpUrlPinger", sb32.toString(), e);
                    return;
                } finally {
                }
            default:
                do {
                    try {
                    } catch (InterruptedException e13) {
                        throw new IllegalStateException(e13);
                    }
                } while (((eb.c) this.f3310d).j());
                return;
        }
    }

    public h(HashMap map) {
        this.f3309a = 2;
        this.f3310d = map;
    }

    public h(hk.h hVar) {
        this.f3309a = 1;
        this.f3310d = hVar;
    }
}

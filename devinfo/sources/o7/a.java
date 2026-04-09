package o7;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f30412a;

    public a(HttpURLConnection httpURLConnection) {
        this.f30412a = httpURLConnection;
    }

    public static String e(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    public final String c() {
        HttpURLConnection httpURLConnection = this.f30412a;
        boolean z3 = false;
        try {
            try {
                if (httpURLConnection.getResponseCode() / 100 == 2) {
                    z3 = true;
                }
            } catch (IOException unused) {
            }
            if (z3) {
                return null;
            }
            try {
                return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + e(httpURLConnection);
            } catch (IOException e2) {
                e = e2;
                r7.d.c("get error failed ", e);
                return e.getMessage();
            }
        } catch (NullPointerException e10) {
            e = e10;
            r7.d.c("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f30412a.disconnect();
    }
}

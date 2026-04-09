package r2;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import u2.C5624c;

/* compiled from: DefaultLottieFetchResult.java */
/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5516a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f45672b;

    public C5516a(HttpURLConnection httpURLConnection) {
        this.f45672b = httpURLConnection;
    }

    public final String a() throws IOException {
        HttpURLConnection httpURLConnection = this.f45672b;
        boolean z10 = false;
        try {
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                z10 = true;
            }
        } catch (IOException unused) {
        }
        if (z10) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to fetch ");
            sb.append(httpURLConnection.getURL());
            sb.append(". Failed with ");
            sb.append(httpURLConnection.getResponseCode());
            sb.append("\n");
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
                        } catch (Exception unused2) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                }
            }
            sb.append(sb2.toString());
            return sb.toString();
        } catch (IOException e4) {
            C5624c.c("get error failed ", e4);
            return e4.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45672b.disconnect();
    }
}

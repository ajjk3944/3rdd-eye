package b9;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2475a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2476d;

    public /* synthetic */ a(int i10, Object obj) {
        this.f2475a = i10;
        this.f2476d = obj;
    }

    public static String f(HttpURLConnection httpURLConnection) throws IOException {
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

    public String b() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f2476d;
        boolean z10 = false;
        try {
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
                return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + f(httpURLConnection);
            } catch (IOException e4) {
                e = e4;
                e9.c.c("get error failed ", e);
                return e.getMessage();
            }
        } catch (NullPointerException e10) {
            e = e10;
            e9.c.c("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f2475a) {
            case 0:
                ((HttpURLConnection) this.f2476d).disconnect();
                break;
            default:
                ((d8.c) this.f2476d).close();
                break;
        }
    }
}

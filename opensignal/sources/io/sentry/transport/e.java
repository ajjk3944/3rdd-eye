package io.sentry.transport;

import com.survicate.surveys.infrastructure.network.URLRequest;
import io.sentry.b5;
import io.sentry.t;
import io.sentry.u0;
import io.sentry.u5;
import io.sentry.x5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f12760e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Proxy f12761a;

    /* renamed from: b, reason: collision with root package name */
    public final t f12762b;

    /* renamed from: c, reason: collision with root package name */
    public final x5 f12763c;

    /* renamed from: d, reason: collision with root package name */
    public final p f12764d;

    public e(x5 x5Var, t tVar, p pVar) {
        Proxy proxy;
        this.f12762b = tVar;
        this.f12763c = x5Var;
        this.f12764d = pVar;
        u5 proxy2 = x5Var.getProxy();
        if (proxy2 != null) {
            String str = proxy2.f12797b;
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.f12796a, Integer.parseInt(str)));
            } catch (NumberFormatException e4) {
                this.f12763c.getLogger().f(b5.ERROR, e4, h0.b.o("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
            }
        } else {
            proxy = null;
        }
        this.f12761a = proxy;
        if (proxy == null || x5Var.getProxy() == null) {
            return;
        }
        String str2 = x5Var.getProxy().f12798c;
        String str3 = x5Var.getProxy().f12799d;
        if (str2 == null || str3 == null) {
            return;
        }
        Authenticator.setDefault(new l(str2, str3));
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static String b(HttpURLConnection httpURLConnection) throws IOException {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f12760e));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z10 = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z10) {
                            sb2.append("\n");
                        }
                        sb2.append(line);
                        z10 = false;
                    }
                    String string = sb2.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final ba.m c(HttpURLConnection httpURLConnection) {
        x5 x5Var = this.f12763c;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                e(httpURLConnection, responseCode);
                if (responseCode == 200) {
                    x5Var.getLogger().m(b5.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return s.f12783i;
                }
                u0 logger = x5Var.getLogger();
                b5 b5Var = b5.ERROR;
                logger.m(b5Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (x5Var.isDebug()) {
                    x5Var.getLogger().m(b5Var, "%s", b(httpURLConnection));
                }
                return new r(responseCode);
            } catch (IOException e4) {
                x5Var.getLogger().f(b5.ERROR, e4, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return new r(-1);
            }
        } finally {
            a(httpURLConnection);
        }
    }

    public final ba.m d(i4.b bVar) {
        OutputStream outputStream;
        x5 x5Var = this.f12763c;
        x5Var.getSocketTagger().b();
        t tVar = this.f12762b;
        URL url = (URL) tVar.f12736a;
        Proxy proxy = this.f12761a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        for (Map.Entry entry : ((HashMap) tVar.f12737d).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod(URLRequest.METHOD_POST);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(x5Var.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(x5Var.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = x5Var.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            outputStream = httpURLConnection.getOutputStream();
        } finally {
            try {
            } finally {
            }
        }
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                x5Var.getSerializer().d(bVar, gZIPOutputStream);
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                return c(httpURLConnection);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee A[PHI: r1
  0x00ee: PHI (r1v7 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v8 java.lang.String[]) binds: [B:14:0x0054, B:73:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.net.HttpURLConnection r24, int r25) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.e.e(java.net.HttpURLConnection, int):void");
    }
}

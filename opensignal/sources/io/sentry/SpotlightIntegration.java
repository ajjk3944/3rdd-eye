package io.sentry;

import com.survicate.surveys.infrastructure.network.URLRequest;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;

/* loaded from: classes.dex */
public final class SpotlightIntegration implements q1, l5, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public x5 f11444a;

    /* renamed from: d, reason: collision with root package name */
    public u0 f11445d = m2.f12434a;

    /* renamed from: g, reason: collision with root package name */
    public e1 f11446g = j2.f12379x;

    public static void b(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static HttpURLConnection f(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod(URLRequest.METHOD_POST);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11446g.d(0L);
        x5 x5Var = this.f11444a;
        if (x5Var == null || x5Var.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f11444a.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.q1
    public final void w(x5 x5Var) {
        this.f11444a = x5Var;
        this.f11445d = x5Var.getLogger();
        if (x5Var.getBeforeEnvelopeCallback() != null || !x5Var.isEnableSpotlight()) {
            this.f11445d.m(b5.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f11446g = new kg.r(x5Var);
        x5Var.setBeforeEnvelopeCallback(this);
        this.f11445d.m(b5.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
        ic.a.b("Spotlight");
    }
}

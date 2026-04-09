package defpackage;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ug4 implements px2 {
    public final Context f;
    public final String g;
    public String h;

    public ug4(Context context, String str) {
        this.f = context;
        this.g = str;
    }

    public final eg4 a(String str, HashMap map) {
        eg4 eg4Var = eg4.h;
        eg4 eg4Var2 = eg4.g;
        if (str != null) {
            if (!((Boolean) tw1.e.c.a(mz1.f)).booleanValue() || !str.isEmpty()) {
                try {
                    StringBuilder sb = new StringBuilder(str.length() + 13);
                    sb.append("Pinging URL: ");
                    sb.append(str);
                    gi2.U(sb.toString());
                    HttpURLConnection httpURLConnection = (HttpURLConnection) b(str).openConnection();
                    try {
                        j63 j63Var = sv1.f.a;
                        String str2 = this.g;
                        httpURLConnection.setConnectTimeout(60000);
                        httpURLConnection.setInstanceFollowRedirects(true);
                        httpURLConnection.setReadTimeout(60000);
                        if (str2 != null) {
                            httpURLConnection.setRequestProperty("User-Agent", str2);
                        }
                        httpURLConnection.setUseCaches(false);
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        wb4 wb4Var = new wb4();
                        wb4Var.a(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        wb4Var.b(httpURLConnection, responseCode);
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(str);
                            gi2.i0(sb2.toString());
                            if (responseCode == 502) {
                                eg4Var2 = eg4Var;
                            }
                        } else {
                            if (((Boolean) tw1.e.c.a(mz1.y8)).booleanValue()) {
                                this.h = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                            }
                            eg4Var2 = eg4.f;
                        }
                        httpURLConnection.disconnect();
                        return eg4Var2;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (MalformedURLException e) {
                    e = e;
                    eg4Var = eg4Var2;
                    c(str, e);
                    return eg4Var;
                } catch (IOException e2) {
                    e = e2;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                    sb3.append("Error while pinging URL: ");
                    sb3.append(str);
                    sb3.append(". ");
                    sb3.append(message);
                    gi2.i0(sb3.toString());
                    return eg4Var;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    eg4Var = eg4Var2;
                    c(str, e);
                    return eg4Var;
                } catch (RuntimeException e4) {
                    e = e4;
                    String message2 = e.getMessage();
                    StringBuilder sb32 = new StringBuilder(String.valueOf(message2).length() + str.length() + 27);
                    sb32.append("Error while pinging URL: ");
                    sb32.append(str);
                    sb32.append(". ");
                    sb32.append(message2);
                    gi2.i0(sb32.toString());
                    return eg4Var;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return eg4Var2;
    }

    public final URL b(String str) throws MalformedURLException {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            c(str, e);
        } catch (MalformedURLException e2) {
            e = e2;
            c(str, e);
        } catch (URISyntaxException e3) {
            c(str, e3);
            if (((Boolean) tw1.e.c.a(mz1.e)).booleanValue()) {
                try {
                    gi2.U("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String string = uri.toString();
                    StringBuilder sb = new StringBuilder(str.length() + 114 + string.length());
                    sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb.append(str);
                    sb.append("\" -> encoded URI: ");
                    sb.append(string);
                    gi2.U(sb.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e4) {
                    c(str, e4);
                }
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        gi2.U(sb2.toString());
        return new URL(str);
    }

    public final void c(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        gi2.i0(sb.toString());
        r92.a(this.f).g(exc, "HttpUrlPinger.pingUrl", ((Integer) tw1.e.c.a(mz1.zd)).intValue() / 100.0f);
    }

    @Override // defpackage.px2
    public final eg4 l(String str) {
        return a(str, null);
    }
}

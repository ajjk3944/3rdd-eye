package za;

import android.content.Context;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ut;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import va.r;
import va.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38161a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38162b;

    /* renamed from: c, reason: collision with root package name */
    public String f38163c;

    public l(Context context, String str) {
        this.f38161a = context;
        this.f38162b = str;
    }

    public final k a(HashMap map, String str) {
        k kVar = k.f38158c;
        k kVar2 = k.f38157b;
        if (str != null) {
            pk pkVar = sk.g;
            s sVar = s.f36163e;
            if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) sVar.f36166c.a(sk.Q2)).booleanValue() || !r.g.f36159c) {
                    try {
                        StringBuilder sb2 = new StringBuilder(str.length() + 13);
                        sb2.append("Pinging URL: ");
                        sb2.append(str);
                        i.c(sb2.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) b(str).openConnection();
                        try {
                            d dVar = r.g.f36157a;
                            String str2 = this.f38162b;
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
                            f fVar = new f();
                            fVar.a(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            fVar.b(httpURLConnection, responseCode);
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                                sb3.append("Received non-success response code ");
                                sb3.append(responseCode);
                                sb3.append(" from pinging URL: ");
                                sb3.append(str);
                                i.h(sb3.toString());
                                if (responseCode == 502) {
                                    kVar2 = kVar;
                                }
                            } else {
                                if (((Boolean) s.f36163e.f36166c.a(sk.T8)).booleanValue()) {
                                    this.f38163c = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                kVar2 = k.f38156a;
                            }
                            httpURLConnection.disconnect();
                            return kVar2;
                        } catch (Throwable th2) {
                            httpURLConnection.disconnect();
                            throw th2;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        String message = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                        sb4.append("Error while pinging URL: ");
                        sb4.append(str);
                        sb4.append(". ");
                        sb4.append(message);
                        i.h(sb4.toString());
                        return kVar;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        kVar = kVar2;
                        c(str, e);
                        return kVar;
                    } catch (RuntimeException e11) {
                        e = e11;
                        String message2 = e.getMessage();
                        StringBuilder sb42 = new StringBuilder(String.valueOf(message2).length() + str.length() + 27);
                        sb42.append("Error while pinging URL: ");
                        sb42.append(str);
                        sb42.append(". ");
                        sb42.append(message2);
                        i.h(sb42.toString());
                        return kVar;
                    } catch (MalformedURLException e12) {
                        e = e12;
                        kVar = kVar2;
                        c(str, e);
                        return kVar;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        return kVar2;
    }

    public final URL b(String str) throws MalformedURLException {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e2) {
            e = e2;
            c(str, e);
        } catch (MalformedURLException e10) {
            e = e10;
            c(str, e);
        } catch (URISyntaxException e11) {
            c(str, e11);
            if (((Boolean) s.f36163e.f36166c.a(sk.f16115f)).booleanValue()) {
                try {
                    i.c("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String string = uri.toString();
                    StringBuilder sb2 = new StringBuilder(str.length() + 114 + string.length());
                    sb2.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb2.append(str);
                    sb2.append("\" -> encoded URI: ");
                    sb2.append(string);
                    i.c(sb2.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e12) {
                    c(str, e12);
                }
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 47);
        sb3.append("Falling back to direct new URL(\"");
        sb3.append(str);
        sb3.append("\") constructor.");
        i.c(sb3.toString());
        return new URL(str);
    }

    public final void c(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb2.append("Error while parsing ping URL: ");
        sb2.append(str);
        sb2.append(". ");
        sb2.append(message);
        i.h(sb2.toString());
        ut.a(this.f38161a).e(exc, "HttpUrlPinger.pingUrl", ((Integer) s.f36163e.f36166c.a(sk.Yd)).intValue() / 100.0f);
    }

    @Override // za.c
    public final k g(String str) {
        return a(null, str);
    }
}

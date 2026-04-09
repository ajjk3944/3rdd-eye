package u2;

import android.content.Context;
import com.google.android.gms.internal.ads.C1053de;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H9;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import q2.C2841s;
import q2.r;

/* loaded from: classes.dex */
public final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23821a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23822b;

    /* renamed from: c, reason: collision with root package name */
    public String f23823c;

    public n(Context context, String str) {
        this.f23821a = context;
        this.f23822b = str;
    }

    public final m a(HashMap map, String str) {
        m mVar = m.f23818c;
        m mVar2 = m.f23817b;
        if (str != null) {
            E9 e9 = H9.f8745g;
            C2841s c2841s = C2841s.f23267e;
            if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) c2841s.f23270c.a(H9.f8656Q2)).booleanValue() || !r.f23260g.f23263c) {
                    try {
                        StringBuilder sb = new StringBuilder(str.length() + 13);
                        sb.append("Pinging URL: ");
                        sb.append(str);
                        k.c(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) b(str).openConnection();
                        try {
                            f fVar = r.f23260g.f23261a;
                            String str2 = this.f23822b;
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
                            h hVar = new h();
                            hVar.a(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            hVar.b(httpURLConnection, responseCode);
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                                sb2.append("Received non-success response code ");
                                sb2.append(responseCode);
                                sb2.append(" from pinging URL: ");
                                sb2.append(str);
                                k.h(sb2.toString());
                                if (responseCode == 502) {
                                    mVar2 = mVar;
                                }
                            } else {
                                if (((Boolean) C2841s.f23267e.f23270c.a(H9.T8)).booleanValue()) {
                                    this.f23823c = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                mVar2 = m.f23816a;
                            }
                            httpURLConnection.disconnect();
                            return mVar2;
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                        sb3.append("Error while pinging URL: ");
                        sb3.append(str);
                        sb3.append(". ");
                        sb3.append(message);
                        k.h(sb3.toString());
                        return mVar;
                    } catch (IndexOutOfBoundsException e7) {
                        e = e7;
                        mVar = mVar2;
                        d(str, e);
                        return mVar;
                    } catch (RuntimeException e8) {
                        e = e8;
                        String message2 = e.getMessage();
                        StringBuilder sb32 = new StringBuilder(String.valueOf(message2).length() + str.length() + 27);
                        sb32.append("Error while pinging URL: ");
                        sb32.append(str);
                        sb32.append(". ");
                        sb32.append(message2);
                        k.h(sb32.toString());
                        return mVar;
                    } catch (MalformedURLException e10) {
                        e = e10;
                        mVar = mVar2;
                        d(str, e);
                        return mVar;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return mVar2;
    }

    public final URL b(String str) throws MalformedURLException {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e6) {
            e = e6;
            d(str, e);
        } catch (MalformedURLException e7) {
            e = e7;
            d(str, e);
        } catch (URISyntaxException e8) {
            d(str, e8);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8740f)).booleanValue()) {
                try {
                    k.c("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String string = uri.toString();
                    StringBuilder sb = new StringBuilder(str.length() + 114 + string.length());
                    sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb.append(str);
                    sb.append("\" -> encoded URI: ");
                    sb.append(string);
                    k.c(sb.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e9) {
                    d(str, e9);
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
        k.c(sb2.toString());
        return new URL(str);
    }

    @Override // u2.e
    public final m c(String str) {
        return a(null, str);
    }

    public final void d(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        k.h(sb.toString());
        C1053de.a(this.f23821a).f(exc, "HttpUrlPinger.pingUrl", ((Integer) C2841s.f23267e.f23270c.a(H9.Wd)).intValue() / 100.0f);
    }
}

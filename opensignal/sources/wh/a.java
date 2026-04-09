package wh;

import android.webkit.URLUtil;
import ch.n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24525b = 0;

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.internal.debugmeta.c f24526a;

    static {
        Charset.forName("UTF-8");
    }

    public final int a(String str) throws Throwable {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        io.sentry.internal.debugmeta.c cVar = this.f24526a;
        if (!URLUtil.isValidUrl(str)) {
            n.b("CommonNetworkUtils", "executeRequest: Url is not valid");
            return -1;
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
            cVar.b(Thread.currentThread());
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (IOException | RuntimeException unused) {
        } catch (Throwable th3) {
            th2 = th3;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(1000);
            httpURLConnection.setReadTimeout(1000);
            httpURLConnection.setRequestMethod("HEAD");
            int responseCode = httpURLConnection.getResponseCode();
            cVar.B(Thread.currentThread());
            httpURLConnection.disconnect();
            return responseCode;
        } catch (IOException | RuntimeException unused2) {
            httpURLConnection2 = httpURLConnection;
            cVar.B(Thread.currentThread());
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return -1;
        } catch (Throwable th4) {
            th2 = th4;
            cVar.B(Thread.currentThread());
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            io.sentry.internal.debugmeta.c r1 = r8.f24526a
            boolean r2 = android.webkit.URLUtil.isValidUrl(r9)
            java.lang.String r3 = "CommonNetworkUtils"
            r4 = 0
            if (r2 != 0) goto L1a
            java.lang.String r9 = "executeRequest: Url is not valid"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            ch.n.b(r3, r9)
            return r4
        L1a:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91 java.io.IOException -> L94
            r1.b(r2)     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91 java.io.IOException -> L94
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91 java.io.IOException -> L94
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91 java.io.IOException -> L94
            java.net.URLConnection r9 = r2.openConnection()     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91 java.io.IOException -> L94
            javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch: java.lang.Throwable -> L8f java.lang.RuntimeException -> L91 java.io.IOException -> L94
            r2 = 1000(0x3e8, float:1.401E-42)
            r9.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            r9.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            java.lang.String r2 = "GET"
            r9.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            java.util.Set r2 = r0.keySet()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
        L41:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            if (r5 == 0) goto L5e
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            r9.addRequestProperty(r5, r6)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            goto L41
        L57:
            r0 = move-exception
            r4 = r9
            goto La6
        L5a:
            r0 = move-exception
            goto L96
        L5c:
            r0 = move-exception
            goto L96
        L5e:
            r9.connect()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            r0.<init>()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            java.io.InputStream r5 = r9.getInputStream()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
        L6e:
            int r6 = r5.read(r2)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            if (r6 <= 0) goto L78
            r7 = 0
            r0.write(r2, r7, r6)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
        L78:
            r7 = -1
            if (r6 != r7) goto L6e
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L5a java.io.IOException -> L5c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1.B(r0)
            r9.disconnect()
            return r2
        L8f:
            r0 = move-exception
            goto La6
        L91:
            r0 = move-exception
        L92:
            r9 = r4
            goto L96
        L94:
            r0 = move-exception
            goto L92
        L96:
            ch.n.e(r3, r0)     // Catch: java.lang.Throwable -> L57
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1.B(r0)
            if (r9 == 0) goto La5
            r9.disconnect()
        La5:
            return r4
        La6:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r1.B(r9)
            if (r4 == 0) goto Lb2
            r4.disconnect()
        Lb2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.a.b(java.lang.String):java.lang.String");
    }
}

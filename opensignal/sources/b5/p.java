package b5;

import android.net.Uri;
import com.survicate.surveys.infrastructure.network.URLRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import oe.z0;

/* loaded from: classes.dex */
public final class p extends c {
    public final String B;
    public final io.sentry.internal.debugmeta.c D;
    public final io.sentry.internal.debugmeta.c E;
    public HttpURLConnection F;
    public InputStream G;
    public boolean H;
    public int I;
    public long J;
    public long K;

    /* renamed from: x, reason: collision with root package name */
    public final int f2463x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2464y;

    public p(String str, int i10, int i11, io.sentry.internal.debugmeta.c cVar) {
        super(true);
        this.B = str;
        this.f2463x = i10;
        this.f2464y = i11;
        this.D = cVar;
        this.E = new io.sentry.internal.debugmeta.c(5);
    }

    public static void q(HttpURLConnection httpURLConnection, long j) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        if (httpURLConnection == null || (i10 = a5.d0.f105a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // b5.h
    public final void close() {
        try {
            InputStream inputStream = this.G;
            if (inputStream != null) {
                long j = this.J;
                long j7 = -1;
                if (j != -1) {
                    j7 = j - this.K;
                }
                q(this.F, j7);
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    int i10 = a5.d0.f105a;
                    throw new u(e4, 2000, 3);
                }
            }
        } finally {
            this.G = null;
            j();
            if (this.H) {
                this.H = false;
                e();
            }
        }
    }

    public final void j() {
        HttpURLConnection httpURLConnection = this.F;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                a5.a.n("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
            this.F = null;
        }
    }

    @Override // b5.h
    public final Map k() {
        HttpURLConnection httpURLConnection = this.F;
        return httpURLConnection == null ? z0.B : new o(httpURLConnection.getHeaderFields());
    }

    public final HttpURLConnection n(URL url, int i10, byte[] bArr, long j, long j7, boolean z10, boolean z11, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f2463x);
        httpURLConnection.setReadTimeout(this.f2464y);
        HashMap map2 = new HashMap();
        io.sentry.internal.debugmeta.c cVar = this.D;
        if (cVar != null) {
            map2.putAll(cVar.m());
        }
        map2.putAll(this.E.m());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = x.f2469a;
        if (j == 0 && j7 == -1) {
            string = null;
        } else {
            StringBuilder sbK = w.g.k(j, "bytes=", "-");
            if (j7 != -1) {
                sbK.append((j + j7) - 1);
            }
            string = sbK.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.B;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        int i11 = k.f2442i;
        if (i10 == 1) {
            str = URLRequest.METHOD_GET;
        } else if (i10 == 2) {
            str = URLRequest.METHOD_POST;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    @Override // b5.h
    public final Uri o() {
        HttpURLConnection httpURLConnection = this.F;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void r(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.G;
            int i10 = a5.d0.f105a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new u(new InterruptedIOException(), 2000, 1);
            }
            if (i11 == -1) {
                throw new u();
            }
            j -= i11;
            a(i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // androidx.media3.common.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.J     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.K     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.G     // Catch: java.io.IOException -> L32
            int r1 = a5.d0.f105a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.K     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.K = r8     // Catch: java.io.IOException -> L32
            r6.a(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            int r8 = a5.d0.f105a
            r8 = 2
            b5.u r7 = b5.u.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.p.read(byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    @Override // b5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long t(b5.k r27) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.p.t(b5.k):long");
    }
}

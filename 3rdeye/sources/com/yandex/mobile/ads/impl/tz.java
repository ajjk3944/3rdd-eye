package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.ov;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public class tz extends dk {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33813e;

    /* renamed from: f, reason: collision with root package name */
    private final int f33814f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33815g;

    /* renamed from: h, reason: collision with root package name */
    private final String f33816h;
    private final fh0 i;

    /* renamed from: j, reason: collision with root package name */
    private final fh0 f33817j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f33818k;

    /* renamed from: l, reason: collision with root package name */
    private qj1<String> f33819l;

    /* renamed from: m, reason: collision with root package name */
    private HttpURLConnection f33820m;

    /* renamed from: n, reason: collision with root package name */
    private InputStream f33821n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f33822o;

    /* renamed from: p, reason: collision with root package name */
    private int f33823p;

    /* renamed from: q, reason: collision with root package name */
    private long f33824q;

    /* renamed from: r, reason: collision with root package name */
    private long f33825r;

    public static final class a implements ov.a {

        /* renamed from: b, reason: collision with root package name */
        private String f33827b;

        /* renamed from: a, reason: collision with root package name */
        private final fh0 f33826a = new fh0();

        /* renamed from: c, reason: collision with root package name */
        private int f33828c = 8000;

        /* renamed from: d, reason: collision with root package name */
        private int f33829d = 8000;

        @Override // com.yandex.mobile.ads.impl.ov.a
        public final ov a() {
            return new tz(this.f33827b, this.f33828c, this.f33829d, this.f33826a);
        }

        public final a b() {
            this.f33827b = null;
            return this;
        }
    }

    public static class b extends gc0<String, List<String>> {

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, List<String>> f33830b;

        public b(Map<String, List<String>> map) {
            this.f33830b = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(String str) {
            return str != null;
        }

        @Override // com.yandex.mobile.ads.impl.gc0
        public final Map<String, List<String>> b() {
            return this.f33830b;
        }

        @Override // com.yandex.mobile.ads.impl.gc0, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(Object obj) {
            Iterator it = (Iterator) pj1.a(entrySet().iterator());
            if (obj == null) {
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() == null) {
                        return true;
                    }
                }
                return false;
            }
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.gc0, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return lx1.a(super.entrySet(), (qj1) new Q3());
        }

        @Override // java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && a(obj);
        }

        @Override // com.yandex.mobile.ads.impl.gc0, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return c();
        }

        @Override // com.yandex.mobile.ads.impl.gc0, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.yandex.mobile.ads.impl.gc0, java.util.Map
        public final Set<String> keySet() {
            return lx1.a(super.keySet(), (qj1) new R3());
        }

        @Override // com.yandex.mobile.ads.impl.gc0, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.yandex.mobile.ads.impl.hc0
        public final Map a() {
            return this.f33830b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(Map.Entry entry) {
            return entry.getKey() != null;
        }
    }

    public tz(String str, int i, int i10, fh0 fh0Var) {
        super(true);
        this.f33816h = str;
        this.f33814f = i;
        this.f33815g = i10;
        this.f33813e = false;
        this.i = fh0Var;
        this.f33819l = null;
        this.f33817j = new fh0();
        this.f33818k = false;
    }

    private URL a(URL url, String str) throws ch0 {
        if (str == null) {
            throw new ch0("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ch0(androidx.work.s.d("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f33813e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new ch0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e4) {
            throw new ch0(e4, 2001, 1);
        }
    }

    private HttpURLConnection d(sv svVar) throws IOException {
        HttpURLConnection httpURLConnectionA;
        URL url = new URL(svVar.f33250a.toString());
        int i = svVar.f33252c;
        byte[] bArr = svVar.f33253d;
        long j4 = svVar.f33255f;
        long j10 = svVar.f33256g;
        int i10 = 1;
        int i11 = 0;
        boolean z10 = (svVar.i & 1) == 1;
        if (!this.f33813e && !this.f33818k) {
            return a(url, i, bArr, j4, j10, z10, true, svVar.f33254e);
        }
        while (true) {
            int i12 = i11 + 1;
            if (i11 > 20) {
                throw new ch0(new NoRouteToHostException(fe.a("Too many redirects: ", i12)), 2001, 1);
            }
            httpURLConnectionA = a(url, i, bArr, j4, j10, z10, false, svVar.f33254e);
            int responseCode = httpURLConnectionA.getResponseCode();
            String headerField = httpURLConnectionA.getHeaderField("Location");
            if ((i == i10 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionA.disconnect();
                url = a(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionA.disconnect();
                if (!this.f33818k || responseCode != 302) {
                    bArr = null;
                    i = 1;
                }
                url = a(url, headerField);
            }
            i11 = i12;
            i10 = 1;
        }
        return httpURLConnectionA;
    }

    private void f() {
        HttpURLConnection httpURLConnection = this.f33820m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                rs0.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
            this.f33820m = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws ch0 {
        try {
            InputStream inputStream = this.f33821n;
            if (inputStream != null) {
                long j4 = this.f33824q;
                long j10 = -1;
                if (j4 != -1) {
                    j10 = j4 - this.f33825r;
                }
                a(this.f33820m, j10);
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    int i = s82.f32899a;
                    throw new ch0(e4, 2000, 3);
                }
            }
        } finally {
            this.f33821n = null;
            f();
            if (this.f33822o) {
                this.f33822o = false;
                e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.dk, com.yandex.mobile.ads.impl.ov
    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f33820m;
        return httpURLConnection == null ? yj0.g() : new b(httpURLConnection.getHeaderFields());
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f33820m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:13:0x0020, B:16:0x002b), top: B:20:0x0004 }] */
    @Override // com.yandex.mobile.ads.impl.lv
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
            long r0 = r6.f33824q     // Catch: java.io.IOException -> L1e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L20
            long r4 = r6.f33825r     // Catch: java.io.IOException -> L1e
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L2a
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L1e
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L1e
            int r9 = (int) r0     // Catch: java.io.IOException -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L35
        L20:
            java.io.InputStream r0 = r6.f33821n     // Catch: java.io.IOException -> L1e
            int r1 = com.yandex.mobile.ads.impl.s82.f32899a     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1e
            if (r7 != r3) goto L2b
        L2a:
            return r3
        L2b:
            long r8 = r6.f33825r     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f33825r = r8     // Catch: java.io.IOException -> L1e
            r6.c(r7)     // Catch: java.io.IOException -> L1e
            return r7
        L35:
            int r8 = com.yandex.mobile.ads.impl.s82.f32899a
            r8 = 2
            com.yandex.mobile.ads.impl.ch0 r7 = com.yandex.mobile.ads.impl.ch0.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.tz.read(byte[], int, int):int");
    }

    private HttpURLConnection a(URL url, int i, byte[] bArr, long j4, long j10, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        String string;
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f33814f);
        httpURLConnectionA.setReadTimeout(this.f33815g);
        HashMap map2 = new HashMap();
        fh0 fh0Var = this.i;
        if (fh0Var != null) {
            map2.putAll(fh0Var.a());
        }
        map2.putAll(this.f33817j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i10 = sh0.f33069c;
        if (j4 == 0 && j10 == -1) {
            string = null;
        } else {
            StringBuilder sbJ = androidx.work.s.j("bytes=", "-", j4);
            if (j10 != -1) {
                sbJ.append((j4 + j10) - 1);
            }
            string = sbJ.toString();
        }
        if (string != null) {
            httpURLConnectionA.setRequestProperty("Range", string);
        }
        String str = this.f33816h;
        if (str != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionA.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z11);
        httpURLConnectionA.setDoOutput(bArr != null);
        httpURLConnectionA.setRequestMethod(sv.a(i));
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnectionA;
        }
        httpURLConnectionA.connect();
        return httpURLConnectionA;
    }

    private static void a(HttpURLConnection httpURLConnection, long j4) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        if (httpURLConnection == null || (i = s82.f32899a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j4 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j4 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException, NumberFormatException {
        long j4 = 0;
        this.f33825r = 0L;
        this.f33824q = 0L;
        b(svVar);
        try {
            HttpURLConnection httpURLConnectionD = d(svVar);
            this.f33820m = httpURLConnectionD;
            this.f33823p = httpURLConnectionD.getResponseCode();
            httpURLConnectionD.getResponseMessage();
            int i = this.f33823p;
            if (i >= 200 && i <= 299) {
                String contentType = httpURLConnectionD.getContentType();
                qj1<String> qj1Var = this.f33819l;
                if (qj1Var != null && !qj1Var.apply(contentType)) {
                    f();
                    throw new dh0(contentType);
                }
                if (this.f33823p == 200) {
                    long j10 = svVar.f33255f;
                    if (j10 != 0) {
                        j4 = j10;
                    }
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionD.getHeaderField("Content-Encoding"));
                if (!zEqualsIgnoreCase) {
                    long j11 = svVar.f33256g;
                    if (j11 != -1) {
                        this.f33824q = j11;
                    } else {
                        long jA = sh0.a(httpURLConnectionD.getHeaderField("Content-Length"), httpURLConnectionD.getHeaderField("Content-Range"));
                        this.f33824q = jA != -1 ? jA - j4 : -1L;
                    }
                } else {
                    this.f33824q = svVar.f33256g;
                }
                try {
                    this.f33821n = httpURLConnectionD.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.f33821n = new GZIPInputStream(this.f33821n);
                    }
                    this.f33822o = true;
                    c(svVar);
                    try {
                        a(j4);
                        return this.f33824q;
                    } catch (IOException e4) {
                        f();
                        if (e4 instanceof ch0) {
                            throw ((ch0) e4);
                        }
                        throw new ch0(e4, 2000, 1);
                    }
                } catch (IOException e10) {
                    f();
                    throw new ch0(e10, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = httpURLConnectionD.getHeaderFields();
            if (this.f33823p == 416) {
                if (svVar.f33255f == sh0.a(httpURLConnectionD.getHeaderField("Content-Range"))) {
                    this.f33822o = true;
                    c(svVar);
                    long j12 = svVar.f33256g;
                    if (j12 != -1) {
                        return j12;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = httpURLConnectionD.getErrorStream();
            try {
                if (errorStream != null) {
                    int i10 = s82.f32899a;
                    byte[] bArr = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i11 = errorStream.read(bArr);
                        if (i11 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i11);
                    }
                    byteArrayOutputStream.toByteArray();
                } else {
                    int i12 = s82.f32899a;
                }
            } catch (IOException unused) {
                int i13 = s82.f32899a;
            }
            f();
            throw new eh0(this.f33823p, this.f33823p == 416 ? new pv(2008) : null, headerFields);
        } catch (IOException e11) {
            f();
            throw ch0.a(e11, 1);
        }
    }

    public HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    private void a(long j4) throws IOException {
        if (j4 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j4 > 0) {
            int iMin = (int) Math.min(j4, 4096);
            InputStream inputStream = this.f33821n;
            int i = s82.f32899a;
            int i10 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new ch0(new InterruptedIOException(), 2000, 1);
            }
            if (i10 != -1) {
                j4 -= i10;
                c(i10);
            } else {
                throw new ch0(2008);
            }
        }
    }
}

package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uf2 extends zd3 implements fq3 {
    public static final Pattern A = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public final int j;
    public final int k;
    public final String l;
    public final mr2 m;
    public ij3 n;
    public HttpURLConnection o;
    public final ArrayDeque p;
    public InputStream q;
    public boolean r;
    public int s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public final long y;
    public final long z;

    public uf2(String str, sf2 sf2Var, int i, int i2, long j, long j2) {
        super(true);
        zt0.D(true ^ TextUtils.isEmpty(str));
        this.l = str;
        this.m = new mr2(12);
        this.j = i;
        this.k = i2;
        this.p = new ArrayDeque();
        this.y = j;
        this.z = j2;
        if (sf2Var != null) {
            b(sf2Var);
        }
    }

    @Override // defpackage.th3
    public final long a(ij3 ij3Var) throws IOException, NumberFormatException {
        this.n = ij3Var;
        this.u = 0L;
        long j = ij3Var.c;
        long j2 = ij3Var.d;
        long jMin = this.y;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2);
        }
        this.v = j;
        HttpURLConnection httpURLConnectionK = k(1, j, (jMin + j) - 1);
        this.o = httpURLConnectionK;
        String headerField = httpURLConnectionK.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = A.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    if (j2 != -1) {
                        this.t = j2;
                        this.w = Math.max(j3, (this.v + j2) - 1);
                    } else {
                        this.t = j4 - this.v;
                        this.w = j4 - 1;
                    }
                    this.x = j3;
                    this.r = true;
                    e(ij3Var);
                    return this.t;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb.append("Unexpected Content-Range [");
                    sb.append(headerField);
                    sb.append("]");
                    gi2.Z(sb.toString());
                }
            }
        }
        throw new tf2("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.t;
            long j2 = this.u;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.v + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.z;
            long j6 = this.x;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.w;
                if (j6 < j8) {
                    long jMin = Math.min(j8, Math.max(((this.y + j7) - r4) - 1, (j7 + j4) - 1));
                    k(2, j7, jMin);
                    this.x = jMin;
                    j6 = jMin;
                }
            }
            int i3 = this.q.read(bArr, i, (int) Math.min(j4, ((j6 + 1) - this.v) - this.u));
            if (i3 == -1) {
                throw new EOFException();
            }
            this.u += i3;
            f(i3);
            return i3;
        } catch (IOException e) {
            throw new kn3(e, 2000, 2);
        }
    }

    @Override // defpackage.th3
    public final Map g() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // defpackage.th3
    public final Uri h() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection k(int i, long j, long j2) throws IOException {
        String string = this.n.a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.j);
            httpURLConnection.setReadTimeout(this.k);
            for (Map.Entry entry : this.m.t().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 7 + String.valueOf(j2).length());
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            sb.append(j2);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.l);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.p.add(httpURLConnection);
            String string2 = this.n.a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.s = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    m();
                    int i2 = this.s;
                    throw new tf2(ex0.j(new StringBuilder(String.valueOf(i2).length() + 15), "Response code: ", i2), 2000, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.q != null) {
                        inputStream = new SequenceInputStream(this.q, inputStream);
                    }
                    this.q = inputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    m();
                    throw new kn3(e, 2000, i);
                }
            } catch (IOException e2) {
                m();
                throw new kn3("Unable to connect to ".concat(String.valueOf(string2)), e2, 2000, i);
            }
        } catch (IOException e3) {
            throw new kn3("Unable to connect to ".concat(String.valueOf(string)), e3, 2000, i);
        }
    }

    @Override // defpackage.th3
    public final void l() {
        try {
            InputStream inputStream = this.q;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new kn3(e, 2000, 3);
                }
            }
        } finally {
            this.q = null;
            m();
            if (this.r) {
                this.r = false;
                j();
            }
        }
    }

    public final void m() {
        while (true) {
            ArrayDeque arrayDeque = this.p;
            if (arrayDeque.isEmpty()) {
                this.o = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e) {
                    gi2.c0("Unexpected error while disconnecting", e);
                }
            }
        }
    }
}

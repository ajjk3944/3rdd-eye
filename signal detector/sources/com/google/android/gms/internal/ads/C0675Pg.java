package com.google.android.gms.internal.ads;

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

/* renamed from: com.google.android.gms.internal.ads.Pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675Pg extends AbstractC2003vB implements InterfaceC1742qJ {

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f10447J = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: C, reason: collision with root package name */
    public long f10448C;

    /* renamed from: D, reason: collision with root package name */
    public long f10449D;

    /* renamed from: E, reason: collision with root package name */
    public long f10450E;

    /* renamed from: F, reason: collision with root package name */
    public long f10451F;

    /* renamed from: G, reason: collision with root package name */
    public long f10452G;

    /* renamed from: H, reason: collision with root package name */
    public final long f10453H;

    /* renamed from: I, reason: collision with root package name */
    public final long f10454I;

    /* renamed from: e, reason: collision with root package name */
    public final int f10455e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10456f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10457g;

    /* renamed from: h, reason: collision with root package name */
    public final C1879sw f10458h;
    public TE i;

    /* renamed from: j, reason: collision with root package name */
    public HttpURLConnection f10459j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f10460k;

    /* renamed from: l, reason: collision with root package name */
    public InputStream f10461l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10462m;

    /* renamed from: n, reason: collision with root package name */
    public int f10463n;

    public C0675Pg(String str, C0641Ng c0641Ng, int i, int i3, long j6, long j7) {
        super(true);
        AbstractC0582Jp.m(true ^ TextUtils.isEmpty(str));
        this.f10457g = str;
        this.f10458h = new C1879sw(6);
        this.f10455e = i;
        this.f10456f = i3;
        this.f10460k = new ArrayDeque();
        this.f10453H = j6;
        this.f10454I = j7;
        if (c0641Ng != null) {
            c(c0641Ng);
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) throws IOException, NumberFormatException {
        this.i = te;
        this.f10449D = 0L;
        long j6 = te.f11363c;
        long j7 = te.f11364d;
        long jMin = this.f10453H;
        if (j7 != -1) {
            jMin = Math.min(jMin, j7);
        }
        this.f10450E = j6;
        HttpURLConnection httpURLConnectionK = k(j6, (jMin + j6) - 1, 1);
        this.f10459j = httpURLConnectionK;
        String headerField = httpURLConnectionK.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f10447J.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j8 = Long.parseLong(matcher.group(2));
                    long j9 = Long.parseLong(matcher.group(3));
                    if (j7 != -1) {
                        this.f10448C = j7;
                        this.f10451F = Math.max(j8, (this.f10450E + j7) - 1);
                    } else {
                        this.f10448C = j9 - this.f10450E;
                        this.f10451F = j9 - 1;
                    }
                    this.f10452G = j8;
                    this.f10462m = true;
                    e(te);
                    return this.f10448C;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb.append("Unexpected Content-Range [");
                    sb.append(headerField);
                    sb.append("]");
                    u2.k.e(sb.toString());
                }
            }
        }
        throw new C0658Og("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j6 = this.f10448C;
            long j7 = this.f10449D;
            if (j6 - j7 == 0) {
                return -1;
            }
            long j8 = this.f10450E + j7;
            long j9 = i3;
            long j10 = j8 + j9 + this.f10454I;
            long j11 = this.f10452G;
            long j12 = j11 + 1;
            if (j10 > j12) {
                long j13 = this.f10451F;
                if (j11 < j13) {
                    long jMin = Math.min(j13, Math.max(((this.f10453H + j12) - r4) - 1, (j12 + j9) - 1));
                    k(j12, jMin, 2);
                    this.f10452G = jMin;
                    j11 = jMin;
                }
            }
            int i6 = this.f10461l.read(bArr, i, (int) Math.min(j9, ((j11 + 1) - this.f10450E) - this.f10449D));
            if (i6 == -1) {
                throw new EOFException();
            }
            this.f10449D += i6;
            g(i6);
            return i6;
        } catch (IOException e6) {
            throw new YH(e6, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        HttpURLConnection httpURLConnection = this.f10459j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2003vB, com.google.android.gms.internal.ads.XD
    public final Map h() {
        HttpURLConnection httpURLConnection = this.f10459j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection k(long j6, long j7, int i) throws IOException {
        String string = this.i.f11361a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f10455e);
            httpURLConnection.setReadTimeout(this.f10456f);
            for (Map.Entry entry : this.f10458h.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 7 + String.valueOf(j7).length());
            sb.append("bytes=");
            sb.append(j6);
            sb.append("-");
            sb.append(j7);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.f10457g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f10460k.add(httpURLConnection);
            String string2 = this.i.f11361a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f10463n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    l();
                    int i3 = this.f10463n;
                    throw new C0658Og(A.f.i(i3, "Response code: ", new StringBuilder(String.valueOf(i3).length() + 15)), 2000, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f10461l != null) {
                        inputStream = new SequenceInputStream(this.f10461l, inputStream);
                    }
                    this.f10461l = inputStream;
                    return httpURLConnection;
                } catch (IOException e6) {
                    l();
                    throw new YH(e6, 2000, i);
                }
            } catch (IOException e7) {
                l();
                throw new YH("Unable to connect to ".concat(String.valueOf(string2)), e7, 2000, i);
            }
        } catch (IOException e8) {
            throw new YH("Unable to connect to ".concat(String.valueOf(string)), e8, 2000, i);
        }
    }

    public final void l() {
        while (true) {
            ArrayDeque arrayDeque = this.f10460k;
            if (arrayDeque.isEmpty()) {
                this.f10459j = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e6) {
                    u2.k.f("Unexpected error while disconnecting", e6);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        try {
            InputStream inputStream = this.f10461l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    throw new YH(e6, 2000, 3);
                }
            }
        } finally {
            this.f10461l = null;
            l();
            if (this.f10462m) {
                this.f10462m = false;
                j();
            }
        }
    }
}

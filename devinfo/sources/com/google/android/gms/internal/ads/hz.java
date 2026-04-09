package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hz extends h41 implements dk1 {

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f12023v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e, reason: collision with root package name */
    public final int f12024e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12025f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final ce1 f12026h;

    /* renamed from: i, reason: collision with root package name */
    public gb1 f12027i;
    public HttpURLConnection j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f12028k;

    /* renamed from: l, reason: collision with root package name */
    public InputStream f12029l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12030m;

    /* renamed from: n, reason: collision with root package name */
    public int f12031n;

    /* renamed from: o, reason: collision with root package name */
    public long f12032o;

    /* renamed from: p, reason: collision with root package name */
    public long f12033p;

    /* renamed from: q, reason: collision with root package name */
    public long f12034q;

    /* renamed from: r, reason: collision with root package name */
    public long f12035r;

    /* renamed from: s, reason: collision with root package name */
    public long f12036s;

    /* renamed from: t, reason: collision with root package name */
    public final long f12037t;

    /* renamed from: u, reason: collision with root package name */
    public final long f12038u;

    public hz(String str, fz fzVar, int i4, int i10, long j, long j8) {
        super(true);
        mq0.m(true ^ TextUtils.isEmpty(str));
        this.g = str;
        this.f12026h = new ce1();
        this.f12024e = i4;
        this.f12025f = i10;
        this.f12028k = new ArrayDeque();
        this.f12037t = j;
        this.f12038u = j8;
        if (fzVar != null) {
            b(fzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.h41, com.google.android.gms.internal.ads.l91
    public final Map A1() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) throws IOException, NumberFormatException {
        this.f12027i = gb1Var;
        this.f12033p = 0L;
        long j = gb1Var.f11481c;
        long j8 = gb1Var.f11482d;
        long jMin = this.f12037t;
        if (j8 != -1) {
            jMin = Math.min(jMin, j8);
        }
        this.f12034q = j;
        HttpURLConnection httpURLConnectionI = i(j, (jMin + j) - 1, 1);
        this.j = httpURLConnectionI;
        String headerField = httpURLConnectionI.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f12023v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j9 = Long.parseLong(matcher.group(2));
                    long j10 = Long.parseLong(matcher.group(3));
                    if (j8 != -1) {
                        this.f12032o = j8;
                        this.f12035r = Math.max(j9, (this.f12034q + j8) - 1);
                    } else {
                        this.f12032o = j10 - this.f12034q;
                        this.f12035r = j10 - 1;
                    }
                    this.f12036s = j9;
                    this.f12030m = true;
                    e(gb1Var);
                    return this.f12032o;
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb2.append("Unexpected Content-Range [");
                    sb2.append(headerField);
                    sb2.append("]");
                    za.i.e(sb2.toString());
                }
            }
        }
        throw new gz("Invalid content range: ".concat(String.valueOf(headerField)), AdError.SERVER_ERROR_CODE, 1);
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j = this.f12032o;
            long j8 = this.f12033p;
            if (j - j8 == 0) {
                return -1;
            }
            long j9 = this.f12034q + j8;
            long j10 = i10;
            long j11 = j9 + j10 + this.f12038u;
            long j12 = this.f12036s;
            long j13 = j12 + 1;
            if (j11 > j13) {
                long j14 = this.f12035r;
                if (j12 < j14) {
                    long jMin = Math.min(j14, Math.max(((this.f12037t + j13) - r4) - 1, (j13 + j10) - 1));
                    i(j13, jMin, 2);
                    this.f12036s = jMin;
                    j12 = jMin;
                }
            }
            int i11 = this.f12029l.read(bArr, i4, (int) Math.min(j10, ((j12 + 1) - this.f12034q) - this.f12033p));
            if (i11 == -1) {
                throw new EOFException();
            }
            this.f12033p += i11;
            g(i11);
            return i11;
        } catch (IOException e2) {
            throw new mh1(e2, AdError.SERVER_ERROR_CODE, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() {
        try {
            InputStream inputStream = this.f12029l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new mh1(e2, AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.f12029l = null;
            j();
            if (this.f12030m) {
                this.f12030m = false;
                h();
            }
        }
    }

    public final HttpURLConnection i(long j, long j8, int i4) throws IOException {
        String string = this.f12027i.f11479a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f12024e);
            httpURLConnection.setReadTimeout(this.f12025f);
            for (Map.Entry entry : this.f12026h.g().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 7 + String.valueOf(j8).length());
            sb2.append("bytes=");
            sb2.append(j);
            sb2.append("-");
            sb2.append(j8);
            httpURLConnection.setRequestProperty("Range", sb2.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f12028k.add(httpURLConnection);
            String string2 = this.f12027i.f11479a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f12031n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    j();
                    int i10 = this.f12031n;
                    throw new gz(d.h.q(i10, "Response code: ", new StringBuilder(String.valueOf(i10).length() + 15)), AdError.SERVER_ERROR_CODE, i4);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f12029l != null) {
                        inputStream = new SequenceInputStream(this.f12029l, inputStream);
                    }
                    this.f12029l = inputStream;
                    return httpURLConnection;
                } catch (IOException e2) {
                    j();
                    throw new mh1(e2, AdError.SERVER_ERROR_CODE, i4);
                }
            } catch (IOException e10) {
                j();
                throw new mh1("Unable to connect to ".concat(String.valueOf(string2)), e10, AdError.SERVER_ERROR_CODE, i4);
            }
        } catch (IOException e11) {
            throw new mh1("Unable to connect to ".concat(String.valueOf(string)), e11, AdError.SERVER_ERROR_CODE, i4);
        }
    }

    public final void j() {
        while (true) {
            ArrayDeque arrayDeque = this.f12028k;
            if (arrayDeque.isEmpty()) {
                this.j = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e2) {
                    za.i.f("Unexpected error while disconnecting", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}

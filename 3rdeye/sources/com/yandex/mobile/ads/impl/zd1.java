package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.hn;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zd1 extends dk {

    /* renamed from: e, reason: collision with root package name */
    private final hn.a f36417e;

    /* renamed from: f, reason: collision with root package name */
    private final fh0 f36418f;

    /* renamed from: g, reason: collision with root package name */
    private final String f36419g;

    /* renamed from: h, reason: collision with root package name */
    private final om f36420h;
    private final fh0 i;

    /* renamed from: j, reason: collision with root package name */
    private qj1<String> f36421j;

    /* renamed from: k, reason: collision with root package name */
    private pq1 f36422k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f36423l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f36424m;

    /* renamed from: n, reason: collision with root package name */
    private long f36425n;

    /* renamed from: o, reason: collision with root package name */
    private long f36426o;

    static {
        p60.a("goog.exo.okhttp");
    }

    public zd1(vd1 vd1Var, String str, fh0 fh0Var) {
        super(true);
        this.f36417e = (hn.a) zf.a(vd1Var);
        this.f36419g = str;
        this.f36420h = null;
        this.i = fh0Var;
        this.f36421j = null;
        this.f36418f = new fh0();
    }

    private int c(byte[] bArr, int i, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j4 = this.f36425n;
        if (j4 != -1) {
            long j10 = j4 - this.f36426o;
            if (j10 == 0) {
                return -1;
            }
            i10 = (int) Math.min(i10, j10);
        }
        InputStream inputStream = this.f36423l;
        int i11 = s82.f32899a;
        int i12 = inputStream.read(bArr, i, i10);
        if (i12 == -1) {
            return -1;
        }
        this.f36426o += i12;
        c(i12);
        return i12;
    }

    private void f() throws IOException {
        pq1 pq1Var = this.f36422k;
        if (pq1Var != null) {
            tq1 tq1VarA = pq1Var.a();
            tq1VarA.getClass();
            t82.a((Closeable) tq1VarA.c());
            this.f36422k = null;
        }
        this.f36423l = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ab  */
    @Override // com.yandex.mobile.ads.impl.ov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.yandex.mobile.ads.impl.sv r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zd1.a(com.yandex.mobile.ads.impl.sv):long");
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws IOException {
        if (this.f36424m) {
            this.f36424m = false;
            e();
            f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dk, com.yandex.mobile.ads.impl.ov
    public final Map<String, List<String>> getResponseHeaders() {
        pq1 pq1Var = this.f36422k;
        return pq1Var == null ? Collections.EMPTY_MAP : pq1Var.g().c();
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        pq1 pq1Var = this.f36422k;
        if (pq1Var == null) {
            return null;
        }
        return Uri.parse(pq1Var.o().g().toString());
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws ch0 {
        try {
            return c(bArr, i, i10);
        } catch (IOException e4) {
            int i11 = s82.f32899a;
            throw ch0.a(e4, 2);
        }
    }

    private void a(long j4) throws IOException {
        if (j4 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j4 > 0) {
            try {
                int iMin = (int) Math.min(j4, 4096);
                InputStream inputStream = this.f36423l;
                int i = s82.f32899a;
                int i10 = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i10 != -1) {
                    j4 -= i10;
                    c(i10);
                } else {
                    throw new ch0(2008);
                }
            } catch (IOException e4) {
                if (e4 instanceof ch0) {
                    throw ((ch0) e4);
                }
                throw new ch0(2000);
            }
        }
    }
}

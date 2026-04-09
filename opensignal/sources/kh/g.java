package kh;

import android.net.TrafficStats;
import android.os.SystemClock;
import ch.n;
import h9.r2;
import ih.i;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import mi.p;

/* loaded from: classes.dex */
public final class g extends ih.e {
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final AtomicBoolean H;
    public final r2 I;
    public i J;
    public long K;
    public final io.sentry.internal.debugmeta.c L;
    public final b4.e M;
    public final p N;
    public final ThreadFactory O;

    public g(long j, int i10, dh.e eVar, r2 r2Var, int i11, int i12, int i13, int i14, p pVar, io.sentry.internal.debugmeta.c cVar, ThreadFactory threadFactory) {
        super(j, i10, eVar);
        this.H = new AtomicBoolean(false);
        this.M = new b4.e(21, this);
        this.I = r2Var;
        this.N = pVar;
        this.f11384s = new fm.b(this, ih.d.UPLOAD, 1);
        this.D = i11;
        this.E = i12;
        this.F = i13;
        this.G = i14;
        this.L = cVar;
        this.O = threadFactory;
    }

    public static void m(g gVar, i iVar, HttpURLConnection httpURLConnection) throws Throwable {
        if (!(iVar instanceof a)) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                BufferedInputStream bufferedInputStream = responseCode != 200 ? new BufferedInputStream(httpURLConnection.getErrorStream()) : new BufferedInputStream(httpURLConnection.getInputStream());
                n.b("UploadTest", "    > responseCode   : ", Integer.valueOf(responseCode));
                n.b("UploadTest", "    > responseMessage: ", httpURLConnection.getResponseMessage());
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(bufferedInputStream));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb2.toString();
                            n.b("UploadTest", "    > response [" + Thread.currentThread().getName() + "]:\n");
                            n.b("UploadTest", string);
                            i3.g.e(bufferedReader2);
                            return;
                        }
                        sb2.append(line);
                        sb2.append("\n");
                    }
                } catch (Exception e4) {
                    e = e4;
                    bufferedReader = bufferedReader2;
                    n.e("UploadTest", e);
                    gVar.h(e);
                    i3.g.e(bufferedReader);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    i3.g.e(bufferedReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static DataOutputStream o(HttpURLConnection httpURLConnection) {
        return new DataOutputStream(httpURLConnection.getOutputStream());
    }

    public static void t(i iVar, DataOutputStream dataOutputStream) throws IOException {
        if (iVar instanceof e) {
            dataOutputStream.write(((e) iVar).f14440a.getBytes());
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [ih.c, mi.f] */
    public final void n() {
        if (this.f11368a == null) {
            this.f11368a = new ag.b(16, (byte) 0);
        }
        int i10 = this.f11368a.f345d;
        dv.d dVar = new dv.d(TrafficStats.getUidRxBytes(i10), TrafficStats.getUidTxBytes(i10));
        long j = 0;
        while (!Thread.currentThread().isInterrupted() && !this.f11371d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime > this.B + j) {
                if (this.f11368a == null) {
                    this.f11368a = new ag.b(16, (byte) 0);
                }
                int i11 = this.f11368a.f345d;
                long uidRxBytes = TrafficStats.getUidRxBytes(i11);
                long uidTxBytes = TrafficStats.getUidTxBytes(i11);
                dv.d dVar2 = new dv.d(uidRxBytes, uidTxBytes);
                long j7 = uidTxBytes - dVar.f7598b;
                synchronized (this) {
                    this.f11380o += j7;
                }
                if (this.f11372e.getAndSet(true) || this.f11371d) {
                    this.j = SystemClock.elapsedRealtime();
                    this.f11370c.e(jElapsedRealtime - this.k);
                    this.f11370c.f(this.f11380o);
                    if (this.f11370c.f11427u >= 1) {
                        f();
                    }
                } else {
                    this.k = jElapsedRealtime;
                    n.b("UploadTest", "mTransferStartTime ", Long.valueOf(jElapsedRealtime));
                    ?? r02 = this.f11385t;
                    if (r02 != 0) {
                        r02.b(this.f11370c);
                    }
                    this.f11382q.schedule(this.f11384s, this.f11378m);
                }
                j = jElapsedRealtime;
                dVar = dVar2;
            }
        }
    }

    public final void p(HttpURLConnection httpURLConnection, int i10) {
        if (this.J instanceof a) {
            n.b("UploadTest", "Setting chunkedStreamingMode for Akamai");
            httpURLConnection.setChunkedStreamingMode(i10);
        }
    }

    public final void q(HttpURLConnection httpURLConnection) {
        if (this.J instanceof c) {
            int i10 = this.F;
            if (i10 == 1) {
                n.b("UploadTest", "Setting setFixedLengthStreamingMode for Cloudflare");
                httpURLConnection.setFixedLengthStreamingMode(Integer.MAX_VALUE);
            }
            if (i10 == 0) {
                n.b("UploadTest", "Setting setChunkedStreamingMode for Cloudflare");
                httpURLConnection.setChunkedStreamingMode(this.G);
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(52428800L));
            }
        }
    }

    public final void r(HttpURLConnection httpURLConnection) {
        if (this.J instanceof e) {
            int i10 = this.D;
            if (i10 == 1) {
                n.b("UploadTest", "Setting setFixedLengthStreamingMode for Cloudfront");
                httpURLConnection.setFixedLengthStreamingMode(Integer.MAX_VALUE);
            }
            if (i10 == 0) {
                n.b("UploadTest", "Setting setChunkedStreamingMode for Cloudfront");
                httpURLConnection.setChunkedStreamingMode(this.E);
                e eVar = (e) this.J;
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(eVar.f14441d.length() + eVar.f14440a.length() + 52428800));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021b  */
    /* JADX WARN: Type inference failed for: r5v59, types: [ih.c, mi.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.io.DataOutputStream r21, int r22, ih.m r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.g.s(java.io.DataOutputStream, int, ih.m):void");
    }
}

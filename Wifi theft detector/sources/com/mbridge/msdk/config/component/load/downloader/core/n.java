package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.c;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class n implements m {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f13467a;

    /* renamed from: b, reason: collision with root package name */
    private final d f13468b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f13469c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.b f13470d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.d f13471e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f13472f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.resource.stream.a f13473g;

    /* renamed from: h, reason: collision with root package name */
    private b0 f13474h;

    /* renamed from: i, reason: collision with root package name */
    private String f13475i;

    /* renamed from: j, reason: collision with root package name */
    private long f13476j;

    private n(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.f13468b = dVar;
        this.f13470d = bVar;
        this.f13467a = cVar;
        this.f13469c = bVar2;
    }

    private boolean a(int i10, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        return i10 == 206;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.d run() throws IOException {
        a0 a0VarD;
        this.f13471e = new com.mbridge.msdk.config.component.load.downloader.d();
        if (this.f13468b.j() == com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            this.f13471e.a(true);
            return this.f13471e;
        }
        long jL = this.f13468b.l();
        long jG = this.f13468b.g();
        com.mbridge.msdk.config.component.load.downloader.utils.b.a(jL, jG);
        if (jL != 0 && jG != 0 && jL == jG) {
            this.f13471e.b(true);
            return this.f13471e;
        }
        String strE = this.f13469c.e();
        String strD = this.f13469c.d();
        long jK = this.f13468b.k();
        long jC = this.f13468b.c();
        long jH = this.f13468b.h();
        long jM = this.f13468b.m();
        String str = String.format(Locale.ENGLISH, "bytes=%d-", Long.valueOf(jG));
        try {
            v.b bVarS = l.c().d().s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            com.mbridge.msdk.thrid.okhttp.d dVarA = bVarS.b(jC, timeUnit).a(new MBridgeHostnameVerifier(strD)).d(jH, timeUnit).e(jM, timeUnit).a(Math.max(0L, jK), timeUnit).b(true).a().a(new y.a().b(strD).a(new c.a().b().a()).a("Connection", "close").a(Command.HTTP_HEADER_RANGE, str).a(Command.HTTP_HEADER_USER_AGENT).a(Command.HTTP_HEADER_USER_AGENT, Command.DEFAULT_USER_AGENT).a());
            try {
                try {
                    a0VarD = dVarA.d();
                } catch (Exception e10) {
                    a(strE, strD, e10);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13472f);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13473g);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a((a0) null);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13474h);
                    if (!dVarA.h()) {
                    }
                }
                if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(a0VarD) && !com.mbridge.msdk.config.component.load.downloader.utils.a.b(a0VarD.d())) {
                    int iK = a0VarD.k();
                    if (a0VarD.n()) {
                        this.f13471e = a(strE, strD, a0VarD, iK);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13472f);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13473g);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13474h);
                        if (!dVarA.h()) {
                            dVarA.cancel();
                        }
                        return this.f13471e;
                    }
                    this.f13471e.a(new IOException("responseCode " + iK));
                    com.mbridge.msdk.config.component.load.downloader.d dVar = this.f13471e;
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13472f);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13473g);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13474h);
                    if (!dVarA.h()) {
                        dVarA.cancel();
                    }
                    return dVar;
                }
                this.f13471e.a(new IOException("response is null"));
                com.mbridge.msdk.config.component.load.downloader.d dVar2 = this.f13471e;
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13472f);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13473g);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(a0VarD);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13474h);
                if (!dVarA.h()) {
                    dVarA.cancel();
                }
                return dVar2;
            } catch (Throwable th) {
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13472f);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13473g);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a((a0) null);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13474h);
                if (!dVarA.h()) {
                    dVarA.cancel();
                }
                throw th;
            }
        } catch (Exception e11) {
            a(strE, strD, e11);
            this.f13471e.b(false);
            return this.f13471e;
        }
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new n(dVar, bVar, cVar, bVar2);
    }

    private com.mbridge.msdk.config.component.load.downloader.d a(String str, String str2, a0 a0Var, int i10) throws IllegalAccessException, IOException {
        com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
        boolean zA = a(i10, this.f13470d);
        boolean z10 = (a0Var == null || this.f13468b == null || i10 != 206 || a0Var.d() == null || this.f13468b.l() <= 0 || a0Var.d().k() == this.f13468b.l() - this.f13468b.g()) ? false : true;
        if (!zA && z10) {
            this.f13468b.a(0L);
            this.f13468b.b(0L);
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13467a)) {
                this.f13467a.remove(str2, str);
            }
            this.f13470d = null;
            com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(this.f13469c.e()));
        }
        b0 b0VarD = a0Var.d();
        this.f13474h = b0VarD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(b0VarD)) {
            dVar.a(new IOException("response body is null"));
            this.f13468b.b(0L);
            this.f13468b.a(0L);
            return dVar;
        }
        long jK = this.f13474h.k();
        String strA = a0Var.a(CommonGatewayClient.HEADER_CONTENT_TYPE, "");
        this.f13475i = strA;
        this.f13468b.a(strA);
        if (jK <= 0) {
            dVar.a(new IOException("response content length is null"));
            return dVar;
        }
        if (this.f13468b.l() == 0) {
            this.f13468b.b(jK);
        }
        InputStream inputStreamD = this.f13474h.d();
        this.f13472f = inputStreamD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(inputStreamD)) {
            dVar.a(new IOException("response inputStream is null"));
            return dVar;
        }
        this.f13469c.a(this.f13468b.l());
        this.f13468b.c(this.f13469c);
        return a(str, str2);
    }

    private void a(String str, String str2, Exception exc) {
        try {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13467a) && com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13468b)) {
                if (!s0.a().a("r_f_s_d_e", true)) {
                    this.f13467a.remove(str2, str);
                    com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(str));
                }
                this.f13468b.a(0L);
                this.f13468b.b(0L);
            }
        } catch (Exception e10) {
            q0.b(IDownloadTask.TAG, e10.getMessage(), e10);
        }
        this.f13471e.a(exc);
    }

    private com.mbridge.msdk.config.component.load.downloader.d a(String str, String str2) throws IllegalAccessException, IOException {
        String str3;
        com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
        this.f13476j = System.currentTimeMillis();
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f13470d)) {
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f13469c.d(), str, this.f13476j, 0L, System.currentTimeMillis(), this.f13468b.l(), this.f13475i, 0, "");
            str3 = str;
            this.f13470d = bVarA;
            this.f13467a.a(bVarA);
        } else {
            str3 = str;
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA2 = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f13470d.c(), this.f13470d.e(), this.f13470d.b(), this.f13470d.i(), this.f13470d.h(), this.f13470d.g(), this.f13475i, 0, this.f13470d.d());
            this.f13470d = bVarA2;
            this.f13467a.a(bVarA2, str3);
        }
        com.mbridge.msdk.config.component.load.downloader.resource.stream.a aVarB = com.mbridge.msdk.config.component.load.downloader.resource.a.a().b(new File(str3));
        this.f13473g = aVarB;
        aVarB.seek(this.f13468b.g());
        byte[] bArr = new byte[l.c().a()];
        while (true) {
            int i10 = this.f13472f.read(bArr);
            if (i10 == -1) {
                break;
            }
            this.f13473g.write(bArr, 0, i10);
            d dVar2 = this.f13468b;
            dVar2.a(dVar2.g() + i10);
            this.f13473g.flushAndSync();
            int iA = com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f13468b.l(), this.f13468b.g());
            a(this.f13468b, this.f13469c, this.f13468b.g(), this.f13468b.l(), iA);
            if (this.f13469c.c() != 100 && iA >= this.f13469c.c()) {
                break;
            }
            if (this.f13468b.j() == com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
                dVar.a(true);
                break;
            }
        }
        l.c().b().a(str2, str3, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f13469c.d(), this.f13469c.e(), this.f13476j, System.currentTimeMillis(), 0L, this.f13468b.l(), this.f13475i, 0, ""));
        try {
            if (this.f13468b.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED && this.f13468b.l() == this.f13468b.g()) {
                String strC = com.mbridge.msdk.config.component.common.file.a.c(this.f13469c.e());
                this.f13469c.a(strC);
                this.f13467a.a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f13469c.d(), this.f13469c.e(), this.f13476j, System.currentTimeMillis(), System.currentTimeMillis(), this.f13468b.l(), this.f13475i, 1, strC), this.f13469c.e());
            }
        } catch (Throwable th) {
            q0.b(IDownloadTask.TAG, th.getMessage(), th);
        }
        if (!dVar.b()) {
            dVar.b(true);
        }
        return dVar;
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, long j10, long j11, int i10) {
        if (dVar.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            if (bVar != null) {
                bVar.a(i10);
                bVar.a(j11);
            }
            dVar.a(bVar, new DownloadProgress(j10, j11, i10));
        }
    }
}

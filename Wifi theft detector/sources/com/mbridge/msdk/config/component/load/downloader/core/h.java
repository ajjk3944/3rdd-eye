package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.config.component.load.downloader.c f13450a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13451b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f13452c;

    /* renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f13453d;

    public h(d<?> dVar) {
        this.f13452c = dVar;
        this.f13450a = dVar.e();
        this.f13451b = dVar.i();
    }

    @Override // java.lang.Runnable
    public void run() {
        q0.a(IDownloadTask.TAG, "开始下载任务");
        if (this.f13452c.j() != com.mbridge.msdk.config.component.load.downloader.e.RETRY) {
            this.f13452c.d(this.f13452c.d());
        }
        this.f13452c.a(com.mbridge.msdk.config.component.load.downloader.e.RUNNING);
        this.f13453d = this.f13452c.d();
        q0.a(IDownloadTask.TAG, "filePath ： " + this.f13453d.e());
        com.mbridge.msdk.config.component.load.downloader.d dVarRun = g.a(this.f13452c, this.f13453d, l.c().b()).run();
        if (dVarRun.c()) {
            this.f13452c.e(this.f13453d);
        } else if (dVarRun.a() != null) {
            this.f13452c.a(this.f13453d, dVarRun.a());
        } else if (dVarRun.b()) {
            this.f13452c.b(this.f13453d);
        }
    }
}

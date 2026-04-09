package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;

/* loaded from: classes3.dex */
class k implements m {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f13456a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13457b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.b f13458c;

    /* renamed from: d, reason: collision with root package name */
    private final d<?> f13459d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b<?> f13460e;

    private k(d<?> dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b<?> bVar2) {
        this.f13459d = dVar;
        this.f13458c = bVar;
        this.f13456a = cVar;
        this.f13457b = str;
        this.f13460e = bVar2;
    }

    public static m a(d<?> dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b<?> bVar2) {
        return new k(dVar, bVar, cVar, str, bVar2);
    }

    private void b(com.mbridge.msdk.config.component.load.downloader.d dVar, File file) {
        long length = file.length();
        long jLastModified = file.lastModified();
        this.f13459d.b(this.f13458c.g());
        this.f13459d.a(file.length());
        l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f13458c.c(), file.getAbsolutePath(), this.f13458c.b(), this.f13458c.i(), jLastModified, this.f13458c.g(), this.f13458c.a(), this.f13458c.f(), this.f13458c.d()), this.f13460e.e());
        dVar.b(a(length));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.d run() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f13458c)) {
            return null;
        }
        com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
        File file = new File(this.f13460e.e());
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            this.f13459d.a(0L);
            this.f13456a.remove(this.f13457b);
            dVar.b(false);
            return dVar;
        }
        long jC = com.mbridge.msdk.config.component.load.downloader.resource.a.a().c(file);
        if (jC == this.f13458c.g()) {
            this.f13459d.b(this.f13458c.g());
            this.f13459d.a(jC);
            dVar.b(a(jC));
            return dVar;
        }
        boolean zA = a();
        q0.a(IDownloadTask.TAG, "数据库记录和文件大小不一致，是否以文件大小为基准进行断点续传： " + zA);
        if (zA) {
            b(dVar, file);
            return dVar;
        }
        a(dVar, file);
        return dVar;
    }

    private boolean a() {
        try {
            return Boolean.parseBoolean(this.f13459d.a("do_us_fi_re", Boolean.toString(true)));
        } catch (Exception unused) {
            q0.a(IDownloadTask.TAG, "类型转换错误： do_us_fi_re");
            return false;
        }
    }

    private void a(com.mbridge.msdk.config.component.load.downloader.d dVar, File file) {
        this.f13459d.a(0L);
        this.f13459d.b(0L);
        this.f13456a.remove(this.f13457b);
        com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(file);
        dVar.b(false);
    }

    private boolean a(long j10) {
        return com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f13458c.g(), j10) >= this.f13460e.c();
    }
}

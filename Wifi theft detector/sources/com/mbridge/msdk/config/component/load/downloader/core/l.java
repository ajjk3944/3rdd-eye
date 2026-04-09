package com.mbridge.msdk.config.component.load.downloader.core;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    private static volatile l f13461e;

    /* renamed from: a, reason: collision with root package name */
    private int f13462a = 4096;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.f f13463b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f13464c;

    /* renamed from: d, reason: collision with root package name */
    private volatile v f13465d;

    public class a implements com.mbridge.msdk.config.component.load.downloader.database.d {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.d
        public SQLiteDatabase getWritableDatabase() {
            return com.mbridge.msdk.config.component.database.a.a().a(true);
        }
    }

    private l() {
    }

    public static l c() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(f13461e)) {
            synchronized (l.class) {
                try {
                    if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(f13461e)) {
                        f13461e = new l();
                    }
                } finally {
                }
            }
        }
        return f13461e;
    }

    private void e() {
        HandlerThread handlerThread = new HandlerThread("mb_db_thread");
        handlerThread.start();
        this.f13464c = new com.mbridge.msdk.config.component.load.downloader.database.a(new Handler(handlerThread.getLooper()), new a());
    }

    public int a() {
        return this.f13462a;
    }

    public com.mbridge.msdk.config.component.load.downloader.database.c b() {
        return this.f13464c;
    }

    public v d() {
        if (this.f13465d == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(w.HTTP_1_1);
            com.mbridge.msdk.thrid.okhttp.m mVar = new com.mbridge.msdk.thrid.okhttp.m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
            mVar.a(this.f13463b.f());
            mVar.b(this.f13463b.g());
            v.b bVar = new v.b();
            long jA = this.f13463b.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f13465d = bVar.b(jA, timeUnit).d(this.f13463b.a(), timeUnit).e(this.f13463b.d(), timeUnit).a(mVar).c(this.f13463b.b(), timeUnit).b(true).a(new com.mbridge.msdk.thrid.okhttp.i(32, 5L, TimeUnit.MINUTES)).a(arrayList).a();
        }
        return this.f13465d;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.f fVar) {
        this.f13463b = fVar;
        e();
    }
}

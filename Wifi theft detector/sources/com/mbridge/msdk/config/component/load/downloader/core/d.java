package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class d<T> {

    /* renamed from: a, reason: collision with root package name */
    private long f13395a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b<T> f13396b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.c f13397c;

    /* renamed from: d, reason: collision with root package name */
    private long f13398d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f13399e;

    /* renamed from: f, reason: collision with root package name */
    private Future f13400f;

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, List<String>> f13401g;

    /* renamed from: h, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.h f13402h;

    /* renamed from: i, reason: collision with root package name */
    private long f13403i;

    /* renamed from: j, reason: collision with root package name */
    private int f13404j;

    /* renamed from: l, reason: collision with root package name */
    private int f13406l;

    /* renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.e f13407m;

    /* renamed from: n, reason: collision with root package name */
    private long f13408n;

    /* renamed from: p, reason: collision with root package name */
    private String f13410p;

    /* renamed from: q, reason: collision with root package name */
    private String f13411q;

    /* renamed from: r, reason: collision with root package name */
    private long f13412r;

    /* renamed from: k, reason: collision with root package name */
    private volatile int f13405k = 0;

    /* renamed from: o, reason: collision with root package name */
    private long f13409o = 0;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f13413a;

        public a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f13413a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f13402h != null) {
                    d.this.f13402h.a(this.f13413a);
                }
                d.this.b();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f13415a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.a f13416b;

        public b(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            this.f13415a = bVar;
            this.f13416b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f13405k >= d.this.f13404j) {
                    d.this.a(com.mbridge.msdk.config.component.load.downloader.e.FAILED);
                    if (d.this.f13402h != null) {
                        d.this.f13402h.a(this.f13415a, this.f13416b);
                    }
                    d.this.b();
                    return;
                }
                d.this.a(com.mbridge.msdk.config.component.load.downloader.e.RETRY);
                d.this.f13405k++;
                d.this.a(0L);
                d.this.b(0L);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().b(d.this);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().a(d.this);
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f13418a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DownloadProgress f13419b;

        public c(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
            this.f13418a = bVar;
            this.f13419b = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f13402h != null) {
                    d.this.f13402h.a(this.f13418a, this.f13419b);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$d, reason: collision with other inner class name */
    public class RunnableC0243d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f13421a;

        public RunnableC0243d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f13421a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f13402h != null) {
                    d.this.f13402h.c(this.f13421a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f13423a;

        public e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f13423a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f13402h != null) {
                    d.this.f13402h.b(this.f13423a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f13425a;

        public f(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f13425a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f13399e != null && !d.this.f13399e.isEmpty()) {
                    String str = (String) d.this.f13399e.get("responseHeaders");
                    if (!TextUtils.isEmpty(str)) {
                        this.f13425a.a("responseHeaders", str);
                    }
                }
                if (d.this.f13402h != null) {
                    d.this.f13402h.d(this.f13425a);
                }
                d.this.b();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public d(com.mbridge.msdk.config.component.load.downloader.core.e<T> eVar) {
        this.f13401g = eVar.f13432f;
        this.f13397c = eVar.f13429c;
        this.f13403i = eVar.f13433g;
        this.f13395a = eVar.f13427a;
        this.f13410p = eVar.f13436j;
        this.f13396b = eVar.f13428b;
        this.f13412r = eVar.f13437k;
        this.f13402h = eVar.f13430d;
        this.f13404j = eVar.f13434h;
        this.f13408n = eVar.f13435i;
        this.f13399e = eVar.f13431e;
    }

    public String f() {
        com.mbridge.msdk.config.component.load.downloader.b<T> bVar = this.f13396b;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public long g() {
        return this.f13398d;
    }

    public long h() {
        return this.f13403i;
    }

    public int i() {
        return this.f13406l;
    }

    public com.mbridge.msdk.config.component.load.downloader.e j() {
        return this.f13407m;
    }

    public long k() {
        return this.f13408n;
    }

    public long l() {
        return this.f13409o;
    }

    public long m() {
        return this.f13412r;
    }

    public void n() {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(this);
    }

    public void b(long j10) {
        this.f13409o = j10;
    }

    public long c() {
        return this.f13395a;
    }

    public com.mbridge.msdk.config.component.load.downloader.b<T> d() {
        return this.f13396b;
    }

    public com.mbridge.msdk.config.component.load.downloader.c e() {
        return this.f13397c;
    }

    public static d a(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        return new d(eVar);
    }

    public void b(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        i.b().a().getDownloadResultTasks().execute(new a(bVar));
    }

    public void c(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f13407m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new e(bVar));
        }
    }

    public void d(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f13407m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new RunnableC0243d(bVar));
        }
    }

    public void e(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f13407m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            a(com.mbridge.msdk.config.component.load.downloader.e.COMPLETED);
            i.b().a().getDownloadResultTasks().execute(new f(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a();
        com.mbridge.msdk.config.component.load.downloader.core.f.a().b(this);
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        this.f13407m = com.mbridge.msdk.config.component.load.downloader.e.CANCELLED;
        Future future = this.f13400f;
        if (future != null) {
            future.cancel(false);
        }
    }

    public String a(String str, String str2) {
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f13399e) && this.f13399e.containsKey(str) && !TextUtils.isEmpty(str)) {
            String str3 = this.f13399e.get(str);
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return str2;
    }

    public void a(long j10) {
        this.f13398d = j10;
    }

    public void a(int i10) {
        this.f13406l = i10;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.e eVar) {
        this.f13407m = eVar;
    }

    public void a(String str) {
        this.f13411q = str;
    }

    private void a() {
        this.f13402h = null;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
        if (this.f13407m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            a(com.mbridge.msdk.config.component.load.downloader.e.FAILED);
            i.b().a().getDownloadResultTasks().execute(new b(bVar, aVar));
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar, DownloadProgress downloadProgress) {
        if (this.f13407m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new c(bVar, downloadProgress));
        }
    }

    public void a(Future future) {
        this.f13400f = future;
    }
}

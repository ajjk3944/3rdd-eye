package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b {

    /* renamed from: r, reason: collision with root package name */
    private static IThreadPoolCallback f6656r;

    /* renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f6657s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6658a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f6659b;

    /* renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f6660c;

    /* renamed from: d, reason: collision with root package name */
    private final INetWork f6661d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f6662e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f6663f;
    private final com.bykv.vk.openvk.preload.geckox.a.a.a g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f6664h;

    /* renamed from: i, reason: collision with root package name */
    private final String f6665i;
    private final String j;

    /* renamed from: k, reason: collision with root package name */
    private final String f6666k;

    /* renamed from: l, reason: collision with root package name */
    private final String f6667l;

    /* renamed from: m, reason: collision with root package name */
    private final String f6668m;

    /* renamed from: n, reason: collision with root package name */
    private final File f6669n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f6670o;

    /* renamed from: p, reason: collision with root package name */
    private final long f6671p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f6672q;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private INetWork f6673a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f6674b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f6675c;

        /* renamed from: d, reason: collision with root package name */
        private Context f6676d;

        /* renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f6677e;

        /* renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f6678f;
        private boolean g = true;

        /* renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f6679h;

        /* renamed from: i, reason: collision with root package name */
        private Long f6680i;
        private String j;

        /* renamed from: k, reason: collision with root package name */
        private String f6681k;

        /* renamed from: l, reason: collision with root package name */
        private String f6682l;

        /* renamed from: m, reason: collision with root package name */
        private File f6683m;

        /* renamed from: n, reason: collision with root package name */
        private String f6684n;

        /* renamed from: o, reason: collision with root package name */
        private String f6685o;

        /* renamed from: p, reason: collision with root package name */
        private long f6686p;

        public a(Context context) {
            this.f6676d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f6675c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f6674b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f6682l = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f6673a = iNetWork;
            return this;
        }

        public final a b() {
            this.f6680i = 38L;
            return this;
        }

        public final a a(long j) {
            this.f6686p = j;
            return this;
        }

        public final a b(String str) {
            this.f6681k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f6678f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f6679h = aVar;
            return this;
        }

        public final a a(String str) {
            this.j = str;
            return this;
        }

        public final a a(File file) {
            this.f6683m = file;
            return this;
        }
    }

    public /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = f6656r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f6657s == null) {
            synchronized (b.class) {
                try {
                    if (f6657s == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f6657s = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f6657s;
    }

    public final Context a() {
        return this.f6658a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.g;
    }

    public final boolean c() {
        return this.f6670o;
    }

    public final List<String> d() {
        return this.f6663f;
    }

    public final List<String> e() {
        return this.f6662e;
    }

    public final JSONObject f() {
        return this.f6672q;
    }

    public final INetWork i() {
        return this.f6661d;
    }

    public final String j() {
        return this.f6666k;
    }

    public final long k() {
        return this.f6664h.longValue();
    }

    public final String l() {
        return this.f6668m;
    }

    public final String m() {
        return this.f6667l;
    }

    public final File n() {
        return this.f6669n;
    }

    public final String o() {
        return this.f6665i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f6659b;
    }

    public final IStatisticMonitor q() {
        return this.f6660c;
    }

    public final String r() {
        return this.j;
    }

    public final long s() {
        return this.f6671p;
    }

    private b(a aVar) {
        Context context = aVar.f6676d;
        this.f6658a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f6674b;
        this.f6662e = list;
        this.f6663f = aVar.f6675c;
        this.f6659b = aVar.f6677e;
        this.g = aVar.f6679h;
        Long l10 = aVar.f6680i;
        this.f6664h = l10;
        if (TextUtils.isEmpty(aVar.j)) {
            this.f6665i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f6665i = aVar.j;
        }
        String str = aVar.f6681k;
        this.j = str;
        this.f6667l = aVar.f6684n;
        this.f6668m = aVar.f6685o;
        this.f6671p = aVar.f6686p;
        if (aVar.f6683m == null) {
            this.f6669n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f6669n = aVar.f6683m;
        }
        String str2 = aVar.f6682l;
        this.f6666k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l10 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f6661d = aVar.f6673a;
        this.f6660c = aVar.f6678f;
        this.f6670o = aVar.g;
    }

    public final void a(JSONObject jSONObject) {
        this.f6672q = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f6656r = iThreadPoolCallback;
    }
}

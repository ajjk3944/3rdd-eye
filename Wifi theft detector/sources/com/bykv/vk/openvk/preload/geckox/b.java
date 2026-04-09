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

/* loaded from: classes.dex */
public class b {

    /* renamed from: r, reason: collision with root package name */
    private static IThreadPoolCallback f9043r;

    /* renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f9044s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f9045a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f9046b;

    /* renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f9047c;

    /* renamed from: d, reason: collision with root package name */
    private final INetWork f9048d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f9049e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f9050f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f9051g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f9052h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9053i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9054j;

    /* renamed from: k, reason: collision with root package name */
    private final String f9055k;

    /* renamed from: l, reason: collision with root package name */
    private final String f9056l;

    /* renamed from: m, reason: collision with root package name */
    private final String f9057m;

    /* renamed from: n, reason: collision with root package name */
    private final File f9058n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f9059o;

    /* renamed from: p, reason: collision with root package name */
    private final long f9060p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f9061q;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private INetWork f9062a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f9063b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f9064c;

        /* renamed from: d, reason: collision with root package name */
        private Context f9065d;

        /* renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f9066e;

        /* renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f9067f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9068g = true;

        /* renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f9069h;

        /* renamed from: i, reason: collision with root package name */
        private Long f9070i;

        /* renamed from: j, reason: collision with root package name */
        private String f9071j;

        /* renamed from: k, reason: collision with root package name */
        private String f9072k;

        /* renamed from: l, reason: collision with root package name */
        private String f9073l;

        /* renamed from: m, reason: collision with root package name */
        private File f9074m;

        /* renamed from: n, reason: collision with root package name */
        private String f9075n;

        /* renamed from: o, reason: collision with root package name */
        private String f9076o;

        /* renamed from: p, reason: collision with root package name */
        private long f9077p;

        public a(Context context) {
            this.f9065d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f9064c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f9063b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f9073l = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f9062a = iNetWork;
            return this;
        }

        public final a b() {
            this.f9070i = 38L;
            return this;
        }

        public final a a(long j10) {
            this.f9077p = j10;
            return this;
        }

        public final a b(String str) {
            this.f9072k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f9067f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.f9068g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f9069h = aVar;
            return this;
        }

        public final a a(String str) {
            this.f9071j = str;
            return this;
        }

        public final a a(File file) {
            this.f9074m = file;
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
        IThreadPoolCallback iThreadPoolCallback = f9043r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f9044s == null) {
            synchronized (b.class) {
                try {
                    if (f9044s == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f9044s = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9044s;
    }

    public final Context a() {
        return this.f9045a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f9051g;
    }

    public final boolean c() {
        return this.f9059o;
    }

    public final List<String> d() {
        return this.f9050f;
    }

    public final List<String> e() {
        return this.f9049e;
    }

    public final JSONObject f() {
        return this.f9061q;
    }

    public final INetWork i() {
        return this.f9048d;
    }

    public final String j() {
        return this.f9055k;
    }

    public final long k() {
        return this.f9052h.longValue();
    }

    public final String l() {
        return this.f9057m;
    }

    public final String m() {
        return this.f9056l;
    }

    public final File n() {
        return this.f9058n;
    }

    public final String o() {
        return this.f9053i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f9046b;
    }

    public final IStatisticMonitor q() {
        return this.f9047c;
    }

    public final String r() {
        return this.f9054j;
    }

    public final long s() {
        return this.f9060p;
    }

    private b(a aVar) {
        Context context = aVar.f9065d;
        this.f9045a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f9063b;
        this.f9049e = list;
        this.f9050f = aVar.f9064c;
        this.f9046b = aVar.f9066e;
        this.f9051g = aVar.f9069h;
        Long l10 = aVar.f9070i;
        this.f9052h = l10;
        if (TextUtils.isEmpty(aVar.f9071j)) {
            this.f9053i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f9053i = aVar.f9071j;
        }
        String str = aVar.f9072k;
        this.f9054j = str;
        this.f9056l = aVar.f9075n;
        this.f9057m = aVar.f9076o;
        this.f9060p = aVar.f9077p;
        if (aVar.f9074m == null) {
            this.f9058n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f9058n = aVar.f9074m;
        }
        String str2 = aVar.f9073l;
        this.f9055k = str2;
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
        this.f9048d = aVar.f9062a;
        this.f9047c = aVar.f9067f;
        this.f9059o = aVar.f9068g;
    }

    public final void a(JSONObject jSONObject) {
        this.f9061q = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f9043r = iThreadPoolCallback;
    }
}

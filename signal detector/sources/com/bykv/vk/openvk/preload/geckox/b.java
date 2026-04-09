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
    private static IThreadPoolCallback f6664r;

    /* renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f6665s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6666a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f6667b;

    /* renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f6668c;

    /* renamed from: d, reason: collision with root package name */
    private final INetWork f6669d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f6670e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f6671f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f6672g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f6673h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final String f6674j;

    /* renamed from: k, reason: collision with root package name */
    private final String f6675k;

    /* renamed from: l, reason: collision with root package name */
    private final String f6676l;

    /* renamed from: m, reason: collision with root package name */
    private final String f6677m;

    /* renamed from: n, reason: collision with root package name */
    private final File f6678n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f6679o;

    /* renamed from: p, reason: collision with root package name */
    private final long f6680p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f6681q;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private INetWork f6682a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f6683b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f6684c;

        /* renamed from: d, reason: collision with root package name */
        private Context f6685d;

        /* renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f6686e;

        /* renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f6687f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f6688g = true;

        /* renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f6689h;
        private Long i;

        /* renamed from: j, reason: collision with root package name */
        private String f6690j;

        /* renamed from: k, reason: collision with root package name */
        private String f6691k;

        /* renamed from: l, reason: collision with root package name */
        private String f6692l;

        /* renamed from: m, reason: collision with root package name */
        private File f6693m;

        /* renamed from: n, reason: collision with root package name */
        private String f6694n;

        /* renamed from: o, reason: collision with root package name */
        private String f6695o;

        /* renamed from: p, reason: collision with root package name */
        private long f6696p;

        public a(Context context) {
            this.f6685d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f6684c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f6683b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f6692l = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f6682a = iNetWork;
            return this;
        }

        public final a b() {
            this.i = 38L;
            return this;
        }

        public final a a(long j6) {
            this.f6696p = j6;
            return this;
        }

        public final a b(String str) {
            this.f6691k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f6687f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.f6688g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f6689h = aVar;
            return this;
        }

        public final a a(String str) {
            this.f6690j = str;
            return this;
        }

        public final a a(File file) {
            this.f6693m = file;
            return this;
        }
    }

    public /* synthetic */ b(a aVar, byte b5) {
        this(aVar);
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = f6664r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f6665s == null) {
            synchronized (b.class) {
                try {
                    if (f6665s == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f6665s = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6665s;
    }

    public final Context a() {
        return this.f6666a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f6672g;
    }

    public final boolean c() {
        return this.f6679o;
    }

    public final List<String> d() {
        return this.f6671f;
    }

    public final List<String> e() {
        return this.f6670e;
    }

    public final JSONObject f() {
        return this.f6681q;
    }

    public final INetWork i() {
        return this.f6669d;
    }

    public final String j() {
        return this.f6675k;
    }

    public final long k() {
        return this.f6673h.longValue();
    }

    public final String l() {
        return this.f6677m;
    }

    public final String m() {
        return this.f6676l;
    }

    public final File n() {
        return this.f6678n;
    }

    public final String o() {
        return this.i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f6667b;
    }

    public final IStatisticMonitor q() {
        return this.f6668c;
    }

    public final String r() {
        return this.f6674j;
    }

    public final long s() {
        return this.f6680p;
    }

    private b(a aVar) {
        Context context = aVar.f6685d;
        this.f6666a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f6683b;
        this.f6670e = list;
        this.f6671f = aVar.f6684c;
        this.f6667b = aVar.f6686e;
        this.f6672g = aVar.f6689h;
        Long l2 = aVar.i;
        this.f6673h = l2;
        if (TextUtils.isEmpty(aVar.f6690j)) {
            this.i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.i = aVar.f6690j;
        }
        String str = aVar.f6691k;
        this.f6674j = str;
        this.f6676l = aVar.f6694n;
        this.f6677m = aVar.f6695o;
        this.f6680p = aVar.f6696p;
        if (aVar.f6693m == null) {
            this.f6678n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f6678n = aVar.f6693m;
        }
        String str2 = aVar.f6692l;
        this.f6675k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l2 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f6669d = aVar.f6682a;
        this.f6668c = aVar.f6687f;
        this.f6679o = aVar.f6688g;
    }

    public final void a(JSONObject jSONObject) {
        this.f6681q = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f6664r = iThreadPoolCallback;
    }
}

package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.p;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: r, reason: collision with root package name */
    private static int f3060r = 2;

    /* renamed from: a, reason: collision with root package name */
    private c f3061a;

    /* renamed from: b, reason: collision with root package name */
    private int f3062b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f3063c;

    /* renamed from: d, reason: collision with root package name */
    private int f3064d;

    /* renamed from: e, reason: collision with root package name */
    private int f3065e;

    /* renamed from: f, reason: collision with root package name */
    private f f3066f;
    private long g;

    /* renamed from: h, reason: collision with root package name */
    private long f3067h;

    /* renamed from: i, reason: collision with root package name */
    private int f3068i;
    private long j;

    /* renamed from: k, reason: collision with root package name */
    private String f3069k;

    /* renamed from: l, reason: collision with root package name */
    private String f3070l;

    /* renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f3071m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f3072n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3073o;

    /* renamed from: p, reason: collision with root package name */
    private final p f3074p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f3075q;

    /* renamed from: s, reason: collision with root package name */
    private Runnable f3076s;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f3085a;

        /* renamed from: b, reason: collision with root package name */
        long f3086b;

        /* renamed from: c, reason: collision with root package name */
        long f3087c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3088d;

        /* renamed from: e, reason: collision with root package name */
        int f3089e;

        /* renamed from: f, reason: collision with root package name */
        StackTraceElement[] f3090f;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        a f3091a;

        /* renamed from: b, reason: collision with root package name */
        private int f3092b;

        public final void a(a aVar) {
            throw null;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface c {
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class d {
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public long f3093a;

        /* renamed from: b, reason: collision with root package name */
        long f3094b;

        /* renamed from: c, reason: collision with root package name */
        long f3095c;

        /* renamed from: d, reason: collision with root package name */
        int f3096d;

        /* renamed from: e, reason: collision with root package name */
        int f3097e;

        /* renamed from: f, reason: collision with root package name */
        long f3098f;
        long g;

        /* renamed from: h, reason: collision with root package name */
        String f3099h;

        /* renamed from: i, reason: collision with root package name */
        public String f3100i;
        private String j;

        /* renamed from: k, reason: collision with root package name */
        private d f3101k;

        public final JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", g.a(this.f3099h));
                jSONObject.put("cpuDuration", this.g);
                jSONObject.put("duration", this.f3098f);
                jSONObject.put("type", this.f3096d);
                jSONObject.put("count", this.f3097e);
                jSONObject.put("messageCount", this.f3097e);
                jSONObject.put("lastDuration", this.f3094b - this.f3095c);
                jSONObject.put("start", this.f3093a);
                jSONObject.put("end", this.f3094b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e2) {
                e2.printStackTrace();
                return jSONObject;
            }
        }

        public final void b() {
            this.f3096d = -1;
            this.f3097e = -1;
            this.f3098f = -1L;
            this.f3099h = null;
            this.j = null;
            this.f3101k = null;
            this.f3100i = null;
        }
    }

    public g() {
        this((byte) 0);
    }

    public static /* synthetic */ b c() {
        return null;
    }

    public static /* synthetic */ p e() {
        return null;
    }

    private g(byte b10) {
        this.f3062b = 0;
        this.f3063c = 0;
        this.f3064d = 100;
        this.f3065e = TTAdConstant.MATE_VALID;
        this.g = -1L;
        this.f3067h = -1L;
        this.f3068i = -1;
        this.j = -1L;
        this.f3072n = false;
        this.f3073o = false;
        this.f3075q = false;
        this.f3076s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* renamed from: b, reason: collision with root package name */
            private long f3079b;

            /* renamed from: a, reason: collision with root package name */
            private long f3078a = 0;

            /* renamed from: c, reason: collision with root package name */
            private int f3080c = -1;

            /* renamed from: d, reason: collision with root package name */
            private int f3081d = 0;

            /* renamed from: e, reason: collision with root package name */
            private int f3082e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f3091a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f3080c == g.this.f3063c) {
                    this.f3081d++;
                } else {
                    this.f3081d = 0;
                    this.f3082e = 0;
                    this.f3079b = jUptimeMillis;
                }
                this.f3080c = g.this.f3063c;
                int i4 = this.f3081d;
                if (i4 > 0 && i4 - this.f3082e >= g.f3060r && this.f3078a != 0 && jUptimeMillis - this.f3079b > 700 && g.this.f3075q) {
                    aVar.f3090f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f3082e = this.f3081d;
                }
                aVar.f3088d = g.this.f3075q;
                aVar.f3087c = (jUptimeMillis - this.f3078a) - 300;
                aVar.f3085a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f3078a = jUptimeMillis2;
                aVar.f3086b = jUptimeMillis2 - jUptimeMillis;
                aVar.f3089e = g.this.f3063c;
                g.e().a(g.this.f3076s, 300L);
                g.c().a(aVar);
            }
        };
        this.f3061a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f3074p = null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i4 = gVar.f3062b;
        gVar.f3062b = i4 + 1;
        return i4;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i4 = 0;
            for (e eVar : this.f3066f.a()) {
                if (eVar != null) {
                    i4++;
                    jSONArray.put(eVar.a().put(FacebookMediationAdapter.KEY_ID, i4));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f3072n) {
            return;
        }
        this.f3072n = true;
        this.f3064d = 100;
        this.f3065e = 300;
        this.f3066f = new f(100);
        this.f3071m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f3054a);
                g gVar = g.this;
                gVar.f3069k = gVar.f3070l;
                g.this.f3070l = "no message running";
                g.this.f3075q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f3075q = true;
                g.this.f3070l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f3054a);
            }
        };
        h.a();
        h.a(this.f3071m);
        j.a(j.a());
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private int f3102a;

        /* renamed from: b, reason: collision with root package name */
        private int f3103b;

        /* renamed from: c, reason: collision with root package name */
        private e f3104c;

        /* renamed from: d, reason: collision with root package name */
        private List<e> f3105d = new ArrayList();

        public f(int i4) {
            this.f3102a = i4;
        }

        public final e a(int i4) {
            e eVar = this.f3104c;
            if (eVar != null) {
                eVar.f3096d = i4;
                this.f3104c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f3096d = i4;
            return eVar2;
        }

        public final void a(e eVar) {
            int size = this.f3105d.size();
            int i4 = this.f3102a;
            if (size < i4) {
                this.f3105d.add(eVar);
                this.f3103b = this.f3105d.size();
                return;
            }
            int i10 = this.f3103b % i4;
            this.f3103b = i10;
            e eVar2 = this.f3105d.set(i10, eVar);
            eVar2.b();
            this.f3104c = eVar2;
            this.f3103b++;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            if (this.f3105d.size() == this.f3102a) {
                for (int i10 = this.f3103b; i10 < this.f3105d.size(); i10++) {
                    arrayList.add(this.f3105d.get(i10));
                }
                while (i4 < this.f3103b - 1) {
                    arrayList.add(this.f3105d.get(i4));
                    i4++;
                }
            } else {
                while (i4 < this.f3105d.size()) {
                    arrayList.add(this.f3105d.get(i4));
                    i4++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i4, long j, String str) {
        a(i4, j, str, true);
    }

    private void a(int i4, long j, String str, boolean z3) {
        this.f3073o = true;
        e eVarA = this.f3066f.a(i4);
        eVarA.f3098f = j - this.g;
        if (z3) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.g = jCurrentThreadTimeMillis - this.j;
            this.j = jCurrentThreadTimeMillis;
        } else {
            eVarA.g = -1L;
        }
        eVarA.f3097e = this.f3062b;
        eVarA.f3099h = str;
        eVarA.f3100i = this.f3069k;
        eVarA.f3093a = this.g;
        eVarA.f3094b = j;
        eVarA.f3095c = this.f3067h;
        this.f3066f.a(eVarA);
        this.f3062b = 0;
        this.g = j;
    }

    public final e a(long j) {
        e eVar = new e();
        eVar.f3099h = this.f3070l;
        eVar.f3100i = this.f3069k;
        eVar.f3098f = j - this.f3067h;
        eVar.g = 0 - this.j;
        eVar.f3097e = this.f3062b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(":");
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    public static /* synthetic */ void a(g gVar, boolean z3, long j) {
        int i4 = gVar.f3063c + 1;
        gVar.f3063c = i4;
        gVar.f3063c = i4 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        gVar.f3073o = false;
        if (gVar.g < 0) {
            gVar.g = j;
        }
        if (gVar.f3067h < 0) {
            gVar.f3067h = j;
        }
        if (gVar.f3068i < 0) {
            gVar.f3068i = Process.myTid();
            gVar.j = SystemClock.currentThreadTimeMillis();
        }
        long j8 = j - gVar.g;
        int i10 = gVar.f3065e;
        if (j8 > i10) {
            long j9 = gVar.f3067h;
            if (j - j9 <= i10) {
                gVar.a(9, j, gVar.f3070l);
            } else if (z3) {
                if (gVar.f3062b == 0) {
                    gVar.a(1, j, "no message running");
                } else {
                    gVar.a(9, j9, gVar.f3069k);
                    gVar.a(1, j, "no message running", false);
                }
            } else if (gVar.f3062b == 0) {
                gVar.a(8, j, gVar.f3070l, true);
            } else {
                gVar.a(9, j9, gVar.f3069k, false);
                gVar.a(8, j, gVar.f3070l, true);
            }
        }
        gVar.f3067h = j;
    }
}

package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.p;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: r, reason: collision with root package name */
    private static int f6007r = 2;

    /* renamed from: a, reason: collision with root package name */
    private c f6008a;

    /* renamed from: b, reason: collision with root package name */
    private int f6009b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f6010c;

    /* renamed from: d, reason: collision with root package name */
    private int f6011d;

    /* renamed from: e, reason: collision with root package name */
    private int f6012e;

    /* renamed from: f, reason: collision with root package name */
    private f f6013f;

    /* renamed from: g, reason: collision with root package name */
    private long f6014g;

    /* renamed from: h, reason: collision with root package name */
    private long f6015h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private long f6016j;

    /* renamed from: k, reason: collision with root package name */
    private String f6017k;

    /* renamed from: l, reason: collision with root package name */
    private String f6018l;

    /* renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f6019m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f6020n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6021o;

    /* renamed from: p, reason: collision with root package name */
    private final p f6022p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f6023q;

    /* renamed from: s, reason: collision with root package name */
    private Runnable f6024s;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f6033a;

        /* renamed from: b, reason: collision with root package name */
        long f6034b;

        /* renamed from: c, reason: collision with root package name */
        long f6035c;

        /* renamed from: d, reason: collision with root package name */
        boolean f6036d;

        /* renamed from: e, reason: collision with root package name */
        int f6037e;

        /* renamed from: f, reason: collision with root package name */
        StackTraceElement[] f6038f;

        private a() {
        }

        public /* synthetic */ a(byte b5) {
            this();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        a f6039a;

        /* renamed from: b, reason: collision with root package name */
        private int f6040b;

        public final void a(a aVar) {
            throw null;
        }
    }

    public interface c {
    }

    public static class d {
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public long f6041a;

        /* renamed from: b, reason: collision with root package name */
        long f6042b;

        /* renamed from: c, reason: collision with root package name */
        long f6043c;

        /* renamed from: d, reason: collision with root package name */
        int f6044d;

        /* renamed from: e, reason: collision with root package name */
        int f6045e;

        /* renamed from: f, reason: collision with root package name */
        long f6046f;

        /* renamed from: g, reason: collision with root package name */
        long f6047g;

        /* renamed from: h, reason: collision with root package name */
        String f6048h;
        public String i;

        /* renamed from: j, reason: collision with root package name */
        private String f6049j;

        /* renamed from: k, reason: collision with root package name */
        private d f6050k;

        public final JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", g.a(this.f6048h));
                jSONObject.put("cpuDuration", this.f6047g);
                jSONObject.put("duration", this.f6046f);
                jSONObject.put("type", this.f6044d);
                jSONObject.put("count", this.f6045e);
                jSONObject.put("messageCount", this.f6045e);
                jSONObject.put("lastDuration", this.f6042b - this.f6043c);
                jSONObject.put("start", this.f6041a);
                jSONObject.put("end", this.f6042b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e6) {
                e6.printStackTrace();
                return jSONObject;
            }
        }

        public final void b() {
            this.f6044d = -1;
            this.f6045e = -1;
            this.f6046f = -1L;
            this.f6048h = null;
            this.f6049j = null;
            this.f6050k = null;
            this.i = null;
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

    private g(byte b5) {
        this.f6009b = 0;
        this.f6010c = 0;
        this.f6011d = 100;
        this.f6012e = TTAdConstant.MATE_VALID;
        this.f6014g = -1L;
        this.f6015h = -1L;
        this.i = -1;
        this.f6016j = -1L;
        this.f6020n = false;
        this.f6021o = false;
        this.f6023q = false;
        this.f6024s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* renamed from: b, reason: collision with root package name */
            private long f6027b;

            /* renamed from: a, reason: collision with root package name */
            private long f6026a = 0;

            /* renamed from: c, reason: collision with root package name */
            private int f6028c = -1;

            /* renamed from: d, reason: collision with root package name */
            private int f6029d = 0;

            /* renamed from: e, reason: collision with root package name */
            private int f6030e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f6039a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f6028c == g.this.f6010c) {
                    this.f6029d++;
                } else {
                    this.f6029d = 0;
                    this.f6030e = 0;
                    this.f6027b = jUptimeMillis;
                }
                this.f6028c = g.this.f6010c;
                int i = this.f6029d;
                if (i > 0 && i - this.f6030e >= g.f6007r && this.f6026a != 0 && jUptimeMillis - this.f6027b > 700 && g.this.f6023q) {
                    aVar.f6038f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f6030e = this.f6029d;
                }
                aVar.f6036d = g.this.f6023q;
                aVar.f6035c = (jUptimeMillis - this.f6026a) - 300;
                aVar.f6033a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f6026a = jUptimeMillis2;
                aVar.f6034b = jUptimeMillis2 - jUptimeMillis;
                aVar.f6037e = g.this.f6010c;
                g.e().a(g.this.f6024s, 300L);
                g.c().a(aVar);
            }
        };
        this.f6008a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f6022p = null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i = gVar.f6009b;
        gVar.f6009b = i + 1;
        return i;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 0;
            for (e eVar : this.f6013f.a()) {
                if (eVar != null) {
                    i++;
                    jSONArray.put(eVar.a().put("id", i));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f6020n) {
            return;
        }
        this.f6020n = true;
        this.f6011d = 100;
        this.f6012e = 300;
        this.f6013f = new f(100);
        this.f6019m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f6001a);
                g gVar = g.this;
                gVar.f6017k = gVar.f6018l;
                g.this.f6018l = "no message running";
                g.this.f6023q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f6023q = true;
                g.this.f6018l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f6001a);
            }
        };
        h.a();
        h.a(this.f6019m);
        j.a(j.a());
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private int f6051a;

        /* renamed from: b, reason: collision with root package name */
        private int f6052b;

        /* renamed from: c, reason: collision with root package name */
        private e f6053c;

        /* renamed from: d, reason: collision with root package name */
        private List<e> f6054d = new ArrayList();

        public f(int i) {
            this.f6051a = i;
        }

        public final e a(int i) {
            e eVar = this.f6053c;
            if (eVar != null) {
                eVar.f6044d = i;
                this.f6053c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f6044d = i;
            return eVar2;
        }

        public final void a(e eVar) {
            int size = this.f6054d.size();
            int i = this.f6051a;
            if (size < i) {
                this.f6054d.add(eVar);
                this.f6052b = this.f6054d.size();
                return;
            }
            int i3 = this.f6052b % i;
            this.f6052b = i3;
            e eVar2 = this.f6054d.set(i3, eVar);
            eVar2.b();
            this.f6053c = eVar2;
            this.f6052b++;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.f6054d.size() == this.f6051a) {
                for (int i3 = this.f6052b; i3 < this.f6054d.size(); i3++) {
                    arrayList.add(this.f6054d.get(i3));
                }
                while (i < this.f6052b - 1) {
                    arrayList.add(this.f6054d.get(i));
                    i++;
                }
            } else {
                while (i < this.f6054d.size()) {
                    arrayList.add(this.f6054d.get(i));
                    i++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i, long j6, String str) {
        a(i, j6, str, true);
    }

    private void a(int i, long j6, String str, boolean z6) {
        this.f6021o = true;
        e eVarA = this.f6013f.a(i);
        eVarA.f6046f = j6 - this.f6014g;
        if (z6) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f6047g = jCurrentThreadTimeMillis - this.f6016j;
            this.f6016j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f6047g = -1L;
        }
        eVarA.f6045e = this.f6009b;
        eVarA.f6048h = str;
        eVarA.i = this.f6017k;
        eVarA.f6041a = this.f6014g;
        eVarA.f6042b = j6;
        eVarA.f6043c = this.f6015h;
        this.f6013f.a(eVarA);
        this.f6009b = 0;
        this.f6014g = j6;
    }

    public final e a(long j6) {
        e eVar = new e();
        eVar.f6048h = this.f6018l;
        eVar.i = this.f6017k;
        eVar.f6046f = j6 - this.f6015h;
        eVar.f6047g = 0 - this.f6016j;
        eVar.f6045e = this.f6009b;
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

    public static /* synthetic */ void a(g gVar, boolean z6, long j6) {
        int i = gVar.f6010c + 1;
        gVar.f6010c = i;
        gVar.f6010c = i & 65535;
        gVar.f6021o = false;
        if (gVar.f6014g < 0) {
            gVar.f6014g = j6;
        }
        if (gVar.f6015h < 0) {
            gVar.f6015h = j6;
        }
        if (gVar.i < 0) {
            gVar.i = Process.myTid();
            gVar.f6016j = SystemClock.currentThreadTimeMillis();
        }
        long j7 = j6 - gVar.f6014g;
        int i3 = gVar.f6012e;
        if (j7 > i3) {
            long j8 = gVar.f6015h;
            if (j6 - j8 <= i3) {
                gVar.a(9, j6, gVar.f6018l);
            } else if (z6) {
                if (gVar.f6009b == 0) {
                    gVar.a(1, j6, "no message running");
                } else {
                    gVar.a(9, j8, gVar.f6017k);
                    gVar.a(1, j6, "no message running", false);
                }
            } else if (gVar.f6009b == 0) {
                gVar.a(8, j6, gVar.f6018l, true);
            } else {
                gVar.a(9, j8, gVar.f6017k, false);
                gVar.a(8, j6, gVar.f6018l, true);
            }
        }
        gVar.f6015h = j6;
    }
}

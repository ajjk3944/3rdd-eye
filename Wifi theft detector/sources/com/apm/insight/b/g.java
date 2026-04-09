package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.p;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: r, reason: collision with root package name */
    private static int f4822r = 2;

    /* renamed from: a, reason: collision with root package name */
    private c f4823a;

    /* renamed from: b, reason: collision with root package name */
    private int f4824b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f4825c;

    /* renamed from: d, reason: collision with root package name */
    private int f4826d;

    /* renamed from: e, reason: collision with root package name */
    private int f4827e;

    /* renamed from: f, reason: collision with root package name */
    private f f4828f;

    /* renamed from: g, reason: collision with root package name */
    private long f4829g;

    /* renamed from: h, reason: collision with root package name */
    private long f4830h;

    /* renamed from: i, reason: collision with root package name */
    private int f4831i;

    /* renamed from: j, reason: collision with root package name */
    private long f4832j;

    /* renamed from: k, reason: collision with root package name */
    private String f4833k;

    /* renamed from: l, reason: collision with root package name */
    private String f4834l;

    /* renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f4835m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f4836n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4837o;

    /* renamed from: p, reason: collision with root package name */
    private final p f4838p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f4839q;

    /* renamed from: s, reason: collision with root package name */
    private Runnable f4840s;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f4849a;

        /* renamed from: b, reason: collision with root package name */
        long f4850b;

        /* renamed from: c, reason: collision with root package name */
        long f4851c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4852d;

        /* renamed from: e, reason: collision with root package name */
        int f4853e;

        /* renamed from: f, reason: collision with root package name */
        StackTraceElement[] f4854f;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        a f4855a;

        /* renamed from: b, reason: collision with root package name */
        private int f4856b;

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
        public long f4857a;

        /* renamed from: b, reason: collision with root package name */
        long f4858b;

        /* renamed from: c, reason: collision with root package name */
        long f4859c;

        /* renamed from: d, reason: collision with root package name */
        int f4860d;

        /* renamed from: e, reason: collision with root package name */
        int f4861e;

        /* renamed from: f, reason: collision with root package name */
        long f4862f;

        /* renamed from: g, reason: collision with root package name */
        long f4863g;

        /* renamed from: h, reason: collision with root package name */
        String f4864h;

        /* renamed from: i, reason: collision with root package name */
        public String f4865i;

        /* renamed from: j, reason: collision with root package name */
        private String f4866j;

        /* renamed from: k, reason: collision with root package name */
        private d f4867k;

        public final JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, g.a(this.f4864h));
                jSONObject.put("cpuDuration", this.f4863g);
                jSONObject.put("duration", this.f4862f);
                jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, this.f4860d);
                jSONObject.put("count", this.f4861e);
                jSONObject.put("messageCount", this.f4861e);
                jSONObject.put("lastDuration", this.f4858b - this.f4859c);
                jSONObject.put("start", this.f4857a);
                jSONObject.put(TtmlNode.END, this.f4858b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }

        public final void b() {
            this.f4860d = -1;
            this.f4861e = -1;
            this.f4862f = -1L;
            this.f4864h = null;
            this.f4866j = null;
            this.f4867k = null;
            this.f4865i = null;
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
        this.f4824b = 0;
        this.f4825c = 0;
        this.f4826d = 100;
        this.f4827e = 200;
        this.f4829g = -1L;
        this.f4830h = -1L;
        this.f4831i = -1;
        this.f4832j = -1L;
        this.f4836n = false;
        this.f4837o = false;
        this.f4839q = false;
        this.f4840s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* renamed from: b, reason: collision with root package name */
            private long f4843b;

            /* renamed from: a, reason: collision with root package name */
            private long f4842a = 0;

            /* renamed from: c, reason: collision with root package name */
            private int f4844c = -1;

            /* renamed from: d, reason: collision with root package name */
            private int f4845d = 0;

            /* renamed from: e, reason: collision with root package name */
            private int f4846e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f4855a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f4844c == g.this.f4825c) {
                    this.f4845d++;
                } else {
                    this.f4845d = 0;
                    this.f4846e = 0;
                    this.f4843b = jUptimeMillis;
                }
                this.f4844c = g.this.f4825c;
                int i10 = this.f4845d;
                if (i10 > 0 && i10 - this.f4846e >= g.f4822r && this.f4842a != 0 && jUptimeMillis - this.f4843b > 700 && g.this.f4839q) {
                    aVar.f4854f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f4846e = this.f4845d;
                }
                aVar.f4852d = g.this.f4839q;
                aVar.f4851c = (jUptimeMillis - this.f4842a) - 300;
                aVar.f4849a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f4842a = jUptimeMillis2;
                aVar.f4850b = jUptimeMillis2 - jUptimeMillis;
                aVar.f4853e = g.this.f4825c;
                g.e().a(g.this.f4840s, 300L);
                g.c().a(aVar);
            }
        };
        this.f4823a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f4838p = null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i10 = gVar.f4824b;
        gVar.f4824b = i10 + 1;
        return i10;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 0;
            for (e eVar : this.f4828f.a()) {
                if (eVar != null) {
                    i10++;
                    jSONArray.put(eVar.a().put("id", i10));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f4836n) {
            return;
        }
        this.f4836n = true;
        this.f4826d = 100;
        this.f4827e = 300;
        this.f4828f = new f(100);
        this.f4835m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f4816a);
                g gVar = g.this;
                gVar.f4833k = gVar.f4834l;
                g.this.f4834l = "no message running";
                g.this.f4839q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f4839q = true;
                g.this.f4834l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f4816a);
            }
        };
        h.a();
        h.a(this.f4835m);
        j.a(j.a());
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private int f4868a;

        /* renamed from: b, reason: collision with root package name */
        private int f4869b;

        /* renamed from: c, reason: collision with root package name */
        private e f4870c;

        /* renamed from: d, reason: collision with root package name */
        private List<e> f4871d = new ArrayList();

        public f(int i10) {
            this.f4868a = i10;
        }

        public final e a(int i10) {
            e eVar = this.f4870c;
            if (eVar != null) {
                eVar.f4860d = i10;
                this.f4870c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f4860d = i10;
            return eVar2;
        }

        public final void a(e eVar) {
            int size = this.f4871d.size();
            int i10 = this.f4868a;
            if (size < i10) {
                this.f4871d.add(eVar);
                this.f4869b = this.f4871d.size();
                return;
            }
            int i11 = this.f4869b % i10;
            this.f4869b = i11;
            e eVar2 = this.f4871d.set(i11, eVar);
            eVar2.b();
            this.f4870c = eVar2;
            this.f4869b++;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f4871d.size() == this.f4868a) {
                for (int i11 = this.f4869b; i11 < this.f4871d.size(); i11++) {
                    arrayList.add(this.f4871d.get(i11));
                }
                while (i10 < this.f4869b - 1) {
                    arrayList.add(this.f4871d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f4871d.size()) {
                    arrayList.add(this.f4871d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z10) {
        this.f4837o = true;
        e eVarA = this.f4828f.a(i10);
        eVarA.f4862f = j10 - this.f4829g;
        if (z10) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f4863g = jCurrentThreadTimeMillis - this.f4832j;
            this.f4832j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f4863g = -1L;
        }
        eVarA.f4861e = this.f4824b;
        eVarA.f4864h = str;
        eVarA.f4865i = this.f4833k;
        eVarA.f4857a = this.f4829g;
        eVarA.f4858b = j10;
        eVarA.f4859c = this.f4830h;
        this.f4828f.a(eVarA);
        this.f4824b = 0;
        this.f4829g = j10;
    }

    public final e a(long j10) {
        e eVar = new e();
        eVar.f4864h = this.f4834l;
        eVar.f4865i = this.f4833k;
        eVar.f4862f = j10 - this.f4830h;
        eVar.f4863g = 0 - this.f4832j;
        eVar.f4861e = this.f4824b;
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

    public static /* synthetic */ void a(g gVar, boolean z10, long j10) {
        int i10 = gVar.f4825c + 1;
        gVar.f4825c = i10;
        gVar.f4825c = i10 & 65535;
        gVar.f4837o = false;
        if (gVar.f4829g < 0) {
            gVar.f4829g = j10;
        }
        if (gVar.f4830h < 0) {
            gVar.f4830h = j10;
        }
        if (gVar.f4831i < 0) {
            gVar.f4831i = Process.myTid();
            gVar.f4832j = SystemClock.currentThreadTimeMillis();
        }
        long j11 = j10 - gVar.f4829g;
        int i11 = gVar.f4827e;
        if (j11 > i11) {
            long j12 = gVar.f4830h;
            if (j10 - j12 <= i11) {
                gVar.a(9, j10, gVar.f4834l);
            } else if (z10) {
                if (gVar.f4824b == 0) {
                    gVar.a(1, j10, "no message running");
                } else {
                    gVar.a(9, j12, gVar.f4833k);
                    gVar.a(1, j10, "no message running", false);
                }
            } else if (gVar.f4824b == 0) {
                gVar.a(8, j10, gVar.f4834l, true);
            } else {
                gVar.a(9, j12, gVar.f4833k, false);
                gVar.a(8, j10, gVar.f4834l, true);
            }
        }
        gVar.f4830h = j10;
    }
}

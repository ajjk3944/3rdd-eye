package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.pgl.ssdk.a5;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.az;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f19877a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f19878b = false;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f19879c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f19880d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static aw.a f19881e;

    /* renamed from: g, reason: collision with root package name */
    public Context f19883g;

    /* renamed from: h, reason: collision with root package name */
    private String f19884h;

    /* renamed from: i, reason: collision with root package name */
    private int f19885i;

    /* renamed from: j, reason: collision with root package name */
    private String f19886j;

    /* renamed from: n, reason: collision with root package name */
    private String f19890n;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19882f = false;

    /* renamed from: k, reason: collision with root package name */
    private String f19887k = null;

    /* renamed from: l, reason: collision with root package name */
    private String f19888l = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19889m = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19891o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f19892p = 1;

    /* renamed from: q, reason: collision with root package name */
    public int f19893q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19894r = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    public class RunnableC0352b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19896a;

        public RunnableC0352b(String str) {
            this.f19896a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f19896a) && this.f19896a.equals("AdShow")) {
                ab.b(b.this.f19883g);
            }
            al.a(b.this.f19883g).a();
            aa.b(b.this.f19883g);
        }
    }

    private b(Context context, String str) {
        this.f19883g = context;
        this.f19884h = str;
    }

    public static b a(Context context, String str, int i10, int i11, String str2) {
        if (f19877a == null) {
            synchronized (b.class) {
                try {
                    if (f19877a == null) {
                        if (context == null) {
                            context = ab.a().getApplicationContext();
                        }
                        if (context == null) {
                            f19880d = 4;
                            return null;
                        }
                        a(i10);
                        aw.a aVarB = aw.b(context, "nms");
                        if (aVarB != null) {
                            f19880d = aVarB.f19874a;
                            f19881e = aVarB;
                            return null;
                        }
                        b bVar = new b(context, str);
                        f19877a = bVar;
                        bVar.f19885i = i11;
                        f19877a.f19886j = str2;
                        f19877a.b(context);
                        f19877a.e(a(context));
                        z.a(context);
                        f19880d = 0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19877a;
    }

    public static String b() {
        if (e() != null) {
            return e().f19887k;
        }
        return null;
    }

    public static String c() {
        b bVarE = e();
        if (bVarE == null || !bVarE.f19889m || TextUtils.isEmpty(bVarE.f19888l)) {
            return null;
        }
        return bVarE.f19888l;
    }

    public static int d() {
        return f19880d;
    }

    public static b e() {
        return f19877a;
    }

    public static aw.a f() {
        return f19881e;
    }

    public String g() {
        return a5.a();
    }

    public void h() {
        this.f19891o = true;
        a5.a(this.f19883g, this.f19884h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (az.a(ax.a(this.f19883g, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i10 = f19877a.f19893q;
            if ((i10 > 0 && i10 < 100 && Math.random() * 100.0d < i10) || i10 == 100) {
                a("Start", (Map<String, Object>) null);
            }
        } else {
            a("Start", (Map<String, Object>) null);
            ax.b(this.f19883g, "pgl_init_report", jCurrentTimeMillis);
        }
        a("Start");
        if (this.f19894r) {
            ar.a(new a(), 20000L);
        }
    }

    private void b(Context context) {
        if (context == null || f19878b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.f19884h);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f19885i));
            StringBuilder sb = new StringBuilder();
            sb.append(ab.h(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb.toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(107, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(115, null, this.f19886j);
            f19878b = true;
        } catch (Throwable unused) {
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f19890n = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f19888l)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f19888l = str;
            a5.b();
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f19887k)) {
            this.f19887k = str;
            com.pgl.ssdk.ces.a.meta(103, null, str);
            a5.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r10) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.ces.b.b(java.lang.String):void");
    }

    private static String a(Context context) {
        String strA = ax.a(context, "iid");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        ax.b(context, "iid", string);
        return string;
    }

    public static void a(int i10) {
        an.a(i10);
    }

    public static String a() {
        if (e() != null) {
            return e().f19884h;
        }
        return null;
    }

    public void a(String str, String str2, String str3, String str4) {
        c(str2);
        d(str4);
        try {
            h();
        } catch (Throwable unused) {
        }
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.f19883g, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(String str, Map<String, Object> map) {
        try {
            ar.a(new ao(this.f19883g, Sdk$SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, new Object[]{str, map}), "Start".equals(str) ? 10000L : 0L);
        } catch (Throwable unused) {
        }
    }

    public Object a(int i10, Object obj) {
        if (i10 == 123) {
            return af.a(this.f19883g);
        }
        if (i10 == 121) {
            return ad.a();
        }
        if (i10 == 122) {
            return ad.b();
        }
        if (i10 == 126) {
            return ad.b(this.f19883g);
        }
        if (i10 == 128) {
            return ad.c(this.f19883g);
        }
        if (i10 == 120) {
            return ac.c();
        }
        if (i10 == 124) {
            return ag.c(this.f19883g);
        }
        if (i10 == 130) {
            return ag.a(this.f19883g);
        }
        if (i10 == 145) {
            return ah.c(this.f19883g);
        }
        if (i10 == 125) {
            return ag.b(this.f19883g);
        }
        if (i10 == 129) {
            return ae.f(this.f19883g);
        }
        if (i10 == 141) {
            return ae.e(this.f19883g);
        }
        if (i10 == 134) {
            return ak.a(this.f19883g).b();
        }
        if (i10 == 140) {
            return al.a(this.f19883g).e();
        }
        if (i10 == 144) {
            return al.a(this.f19883g).d();
        }
        if (i10 == 133) {
            return a(obj);
        }
        if (i10 == 135) {
            return v.e();
        }
        if (i10 == 201) {
            return ad.a(this.f19883g);
        }
        if (i10 == 202) {
            return ad.c();
        }
        if (i10 == 236) {
            return ay.a((String) obj);
        }
        if (i10 == 142) {
            return ab.g(this.f19883g);
        }
        if (i10 == 143) {
            return ah.a(this.f19883g);
        }
        if (i10 == 146) {
            try {
                return v.b();
            } catch (Throwable unused) {
                return null;
            }
        }
        if (i10 == 147) {
            return Boolean.valueOf(ab.j(this.f19883g));
        }
        if (i10 == 148) {
            return u.b(this.f19883g);
        }
        if (i10 == 149) {
            return w.a(this.f19883g);
        }
        if (i10 == 150) {
            return Integer.valueOf(x.a());
        }
        if (i10 == 151) {
            return w.c();
        }
        if (i10 == 161) {
            return Boolean.valueOf(v.f());
        }
        if (i10 == 163) {
            return aj.a();
        }
        if (i10 == 169) {
            return Boolean.valueOf(aa.a(this.f19883g));
        }
        if (i10 == 170) {
            return Integer.valueOf(y.b((String) obj));
        }
        if (i10 == 203) {
            return ab.b();
        }
        if (i10 == 205) {
            return Integer.valueOf(ab.k(this.f19883g));
        }
        if (i10 == 204) {
            return Integer.valueOf(ae.a(this.f19883g));
        }
        if (i10 == 206) {
            return ah.b(this.f19883g);
        }
        return null;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.f19883g);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(java.util.Map<java.lang.String, java.lang.Object> r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.ces.b.a(java.util.Map):void");
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f19879c) == null || map.isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            return new JSONObject(f19879c).toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    public void a(String str) {
        ar.b(new RunnableC0352b(str));
    }
}

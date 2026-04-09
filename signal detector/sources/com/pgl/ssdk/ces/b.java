package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
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
import com.pgl.ssdk.ces.out.PglSSManager;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f19619a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f19620b = false;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f19621c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f19622d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static aw.a f19623e;

    /* renamed from: g, reason: collision with root package name */
    public Context f19625g;

    /* renamed from: h, reason: collision with root package name */
    private String f19626h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private String f19627j;

    /* renamed from: n, reason: collision with root package name */
    private String f19631n;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19624f = false;

    /* renamed from: k, reason: collision with root package name */
    private String f19628k = null;

    /* renamed from: l, reason: collision with root package name */
    private String f19629l = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19630m = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19632o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f19633p = 1;

    /* renamed from: q, reason: collision with root package name */
    public int f19634q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19635r = true;

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
    public class RunnableC0111b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19637a;

        public RunnableC0111b(String str) {
            this.f19637a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f19637a) && this.f19637a.equals(PglSSManager.REPORT_SCENE_ADSHOW)) {
                ab.b(b.this.f19625g);
            }
            al.a(b.this.f19625g).a();
            aa.b(b.this.f19625g);
        }
    }

    private b(Context context, String str) {
        this.f19625g = context;
        this.f19626h = str;
    }

    public static b a(Context context, String str, int i, int i3, String str2) {
        if (f19619a == null) {
            synchronized (b.class) {
                try {
                    if (f19619a == null) {
                        if (context == null) {
                            context = ab.a().getApplicationContext();
                        }
                        if (context == null) {
                            f19622d = 4;
                            return null;
                        }
                        a(i);
                        aw.a aVarB = aw.b(context, "nms");
                        if (aVarB != null) {
                            f19622d = aVarB.f19616a;
                            f19623e = aVarB;
                            return null;
                        }
                        b bVar = new b(context, str);
                        f19619a = bVar;
                        bVar.i = i3;
                        f19619a.f19627j = str2;
                        f19619a.b(context);
                        f19619a.e(a(context));
                        z.a(context);
                        f19622d = 0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19619a;
    }

    public static String b() {
        if (e() != null) {
            return e().f19628k;
        }
        return null;
    }

    public static String c() {
        b bVarE = e();
        if (bVarE == null || !bVarE.f19630m || TextUtils.isEmpty(bVarE.f19629l)) {
            return null;
        }
        return bVarE.f19629l;
    }

    public static int d() {
        return f19622d;
    }

    public static b e() {
        return f19619a;
    }

    public static aw.a f() {
        return f19623e;
    }

    public String g() {
        return a5.a();
    }

    public void h() {
        this.f19632o = true;
        a5.a(this.f19625g, this.f19626h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (az.a(ax.a(this.f19625g, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i = f19619a.f19634q;
            if ((i > 0 && i < 100 && Math.random() * 100.0d < i) || i == 100) {
                a("Start", (Map<String, Object>) null);
            }
        } else {
            a("Start", (Map<String, Object>) null);
            ax.b(this.f19625g, "pgl_init_report", jCurrentTimeMillis);
        }
        a("Start");
        if (this.f19635r) {
            ar.a(new a(), 20000L);
        }
    }

    private void b(Context context) {
        if (context == null || f19620b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.f19626h);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.i));
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
            com.pgl.ssdk.ces.a.meta(115, null, this.f19627j);
            f19620b = true;
        } catch (Throwable unused) {
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f19631n = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f19629l)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f19629l = str;
            a5.b();
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f19628k)) {
            this.f19628k = str;
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

    public static void a(int i) {
        an.a(i);
    }

    public static String a() {
        if (e() != null) {
            return e().f19626h;
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
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.f19625g, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(String str, Map<String, Object> map) {
        try {
            ar.a(new ao(this.f19625g, 222, new Object[]{str, map}), "Start".equals(str) ? 10000L : 0L);
        } catch (Throwable unused) {
        }
    }

    public Object a(int i, Object obj) {
        if (i == 123) {
            return af.a(this.f19625g);
        }
        if (i == 121) {
            return ad.a();
        }
        if (i == 122) {
            return ad.b();
        }
        if (i == 126) {
            return ad.b(this.f19625g);
        }
        if (i == 128) {
            return ad.c(this.f19625g);
        }
        if (i == 120) {
            return ac.c();
        }
        if (i == 124) {
            return ag.c(this.f19625g);
        }
        if (i == 130) {
            return ag.a(this.f19625g);
        }
        if (i == 145) {
            return ah.c(this.f19625g);
        }
        if (i == 125) {
            return ag.b(this.f19625g);
        }
        if (i == 129) {
            return ae.f(this.f19625g);
        }
        if (i == 141) {
            return ae.e(this.f19625g);
        }
        if (i == 134) {
            return ak.a(this.f19625g).b();
        }
        if (i == 140) {
            return al.a(this.f19625g).e();
        }
        if (i == 144) {
            return al.a(this.f19625g).d();
        }
        if (i == 133) {
            return a(obj);
        }
        if (i == 135) {
            return v.e();
        }
        if (i == 201) {
            return ad.a(this.f19625g);
        }
        if (i == 202) {
            return ad.c();
        }
        if (i == 236) {
            return ay.a((String) obj);
        }
        if (i == 142) {
            return ab.g(this.f19625g);
        }
        if (i == 143) {
            return ah.a(this.f19625g);
        }
        if (i == 146) {
            try {
                return v.b();
            } catch (Throwable unused) {
                return null;
            }
        }
        if (i == 147) {
            return Boolean.valueOf(ab.j(this.f19625g));
        }
        if (i == 148) {
            return u.b(this.f19625g);
        }
        if (i == 149) {
            return w.a(this.f19625g);
        }
        if (i == 150) {
            return Integer.valueOf(x.a());
        }
        if (i == 151) {
            return w.c();
        }
        if (i == 161) {
            return Boolean.valueOf(v.f());
        }
        if (i == 163) {
            return aj.a();
        }
        if (i == 169) {
            return Boolean.valueOf(aa.a(this.f19625g));
        }
        if (i == 170) {
            return Integer.valueOf(y.b((String) obj));
        }
        if (i == 203) {
            return ab.b();
        }
        if (i == 205) {
            return Integer.valueOf(ab.k(this.f19625g));
        }
        if (i == 204) {
            return Integer.valueOf(ae.a(this.f19625g));
        }
        if (i == 206) {
            return ah.b(this.f19625g);
        }
        return null;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.f19625g);
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
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f19621c) == null || map.isEmpty()) {
            return "{}";
        }
        try {
            return new JSONObject(f19621c).toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public void a(String str) {
        ar.b(new RunnableC0111b(str));
    }
}

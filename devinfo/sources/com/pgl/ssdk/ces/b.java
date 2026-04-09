package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.pgl.ssdk.a5;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.ai;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.am;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.az;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f21491a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f21492b = false;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f21493c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f21494d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static aw.a f21495e;
    public Context g;

    /* renamed from: h, reason: collision with root package name */
    private String f21497h;

    /* renamed from: i, reason: collision with root package name */
    private int f21498i;
    private String j;

    /* renamed from: n, reason: collision with root package name */
    private String f21502n;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21496f = false;

    /* renamed from: k, reason: collision with root package name */
    private String f21499k = null;

    /* renamed from: l, reason: collision with root package name */
    private String f21500l = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21501m = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21503o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f21504p = 1;

    /* renamed from: q, reason: collision with root package name */
    public int f21505q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21506r = true;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
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

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    public class RunnableC0134b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21508a;

        public RunnableC0134b(String str) {
            this.f21508a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f21508a) && this.f21508a.equals(PglSSManager.REPORT_SCENE_ADSHOW)) {
                ab.b(b.this.g);
            }
            al.a(b.this.g).a();
            aa.b(b.this.g);
        }
    }

    private b(Context context, String str) {
        this.g = context;
        this.f21497h = str;
    }

    public static b a(Context context, String str, int i4, int i10, String str2) {
        if (f21491a == null) {
            synchronized (b.class) {
                try {
                    if (f21491a == null) {
                        if (context == null) {
                            context = ab.a().getApplicationContext();
                        }
                        if (context == null) {
                            f21494d = 4;
                            return null;
                        }
                        a(i4);
                        aw.a aVarB = aw.b(context, "nms");
                        if (aVarB != null) {
                            f21494d = aVarB.f21488a;
                            f21495e = aVarB;
                            return null;
                        }
                        b bVar = new b(context, str);
                        f21491a = bVar;
                        bVar.f21498i = i10;
                        f21491a.j = str2;
                        f21491a.b(context);
                        f21491a.e(a(context));
                        z.a(context);
                        f21494d = 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21491a;
    }

    public static String b() {
        if (e() != null) {
            return e().f21499k;
        }
        return null;
    }

    public static String c() {
        b bVarE = e();
        if (bVarE == null || !bVarE.f21501m || TextUtils.isEmpty(bVarE.f21500l)) {
            return null;
        }
        return bVarE.f21500l;
    }

    public static int d() {
        return f21494d;
    }

    public static b e() {
        return f21491a;
    }

    public static aw.a f() {
        return f21495e;
    }

    public String g() {
        return a5.a();
    }

    public void h() {
        this.f21503o = true;
        a5.a(this.g, this.f21497h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (az.a(ax.a(this.g, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i4 = f21491a.f21505q;
            if ((i4 > 0 && i4 < 100 && Math.random() * 100.0d < i4) || i4 == 100) {
                a("Start", (Map<String, Object>) null);
            }
        } else {
            a("Start", (Map<String, Object>) null);
            ax.b(this.g, "pgl_init_report", jCurrentTimeMillis);
        }
        a("Start");
        if (this.f21506r) {
            ar.a(new a(), 20000L);
        }
    }

    private void b(Context context) {
        if (context == null || f21492b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, null, this.f21497h);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f21498i));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ab.h(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb2.toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(FacebookMediationAdapter.ERROR_NULL_CONTEXT, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(115, null, this.j);
            f21492b = true;
        } catch (Throwable unused) {
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f21502n = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f21500l)) {
            com.pgl.ssdk.ces.a.meta(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, null, str);
            this.f21500l = str;
            a5.b();
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f21499k)) {
            this.f21499k = str;
            com.pgl.ssdk.ces.a.meta(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, null, str);
            a5.b();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b(String str) throws JSONException {
        int iIntValue;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                switch (next.hashCode()) {
                    case -417749689:
                        if (!next.equals("touch_trace_enabled") || !(obj instanceof Boolean)) {
                            break;
                        } else {
                            y.g = ((Boolean) obj).booleanValue();
                            break;
                        }
                    case -257777372:
                        if (next.equals("init_prob") && (obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) >= 0 && iIntValue <= 100) {
                            this.f21505q = iIntValue;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case -93508180:
                        if (!next.equals("autoctl_detect_enable") || !(obj instanceof Boolean)) {
                            break;
                        } else {
                            ak.f21443b = ((Boolean) obj).booleanValue();
                            break;
                        }
                    case 449342513:
                        if (!next.equals("craw_ratio") || !(obj instanceof Integer) || ((Integer) obj).intValue() <= 0) {
                            break;
                        } else {
                            f.f21529b = ((Integer) obj).intValue();
                            break;
                        }
                        break;
                    case 944591168:
                        if (!next.equals("report_ratio") || !(obj instanceof Integer) || ((Integer) obj).intValue() <= 0) {
                            break;
                        } else {
                            this.f21504p = ((Integer) obj).intValue();
                            break;
                        }
                    case 1286849298:
                        if (!next.equals("app_switch") || !(obj instanceof Boolean)) {
                            break;
                        } else {
                            this.f21506r = ((Boolean) obj).booleanValue();
                            break;
                        }
                        break;
                }
            }
        } catch (JSONException unused) {
        }
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

    public static void a(int i4) {
        an.a(i4);
    }

    public static String a() {
        if (e() != null) {
            return e().f21497h;
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
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.g, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(String str, Map<String, Object> map) {
        try {
            ar.a(new ao(this.g, 222, new Object[]{str, map}), "Start".equals(str) ? 10000L : 0L);
        } catch (Throwable unused) {
        }
    }

    public Object a(int i4, Object obj) {
        if (i4 == 123) {
            return af.a(this.g);
        }
        if (i4 == 121) {
            return ad.a();
        }
        if (i4 == 122) {
            return ad.b();
        }
        if (i4 == 126) {
            return ad.b(this.g);
        }
        if (i4 == 128) {
            return ad.c(this.g);
        }
        if (i4 == 120) {
            return ac.c();
        }
        if (i4 == 124) {
            return ag.c(this.g);
        }
        if (i4 == 130) {
            return ag.a(this.g);
        }
        if (i4 == 145) {
            return ah.c(this.g);
        }
        if (i4 == 125) {
            return ag.b(this.g);
        }
        if (i4 == 129) {
            return ae.f(this.g);
        }
        if (i4 == 141) {
            return ae.e(this.g);
        }
        if (i4 == 134) {
            return ak.a(this.g).b();
        }
        if (i4 == 140) {
            return al.a(this.g).e();
        }
        if (i4 == 144) {
            return al.a(this.g).d();
        }
        if (i4 == 133) {
            return a(obj);
        }
        if (i4 == 135) {
            return v.e();
        }
        if (i4 == 201) {
            return ad.a(this.g);
        }
        if (i4 == 202) {
            return ad.c();
        }
        if (i4 == 236) {
            return ay.a((String) obj);
        }
        if (i4 == 142) {
            return ab.g(this.g);
        }
        if (i4 == 143) {
            return ah.a(this.g);
        }
        if (i4 == 146) {
            try {
                return v.b();
            } catch (Throwable th2) {
                th2.printStackTrace();
                return null;
            }
        }
        if (i4 == 147) {
            return Boolean.valueOf(ab.j(this.g));
        }
        if (i4 == 148) {
            return u.b(this.g);
        }
        if (i4 == 149) {
            return w.a(this.g);
        }
        if (i4 == 150) {
            return Integer.valueOf(x.a());
        }
        if (i4 == 151) {
            return w.c();
        }
        if (i4 == 161) {
            return Boolean.valueOf(v.f());
        }
        if (i4 == 163) {
            return aj.a();
        }
        if (i4 == 169) {
            return Boolean.valueOf(aa.a(this.g));
        }
        if (i4 == 170) {
            return Integer.valueOf(y.b((String) obj));
        }
        if (i4 == 203) {
            return ab.b();
        }
        if (i4 == 205) {
            return Integer.valueOf(ab.k(this.g));
        }
        if (i4 == 204) {
            return Integer.valueOf(ae.a(this.g));
        }
        if (i4 == 206) {
            return ah.b(this.g);
        }
        return null;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.g);
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            try {
            } finally {
            }
            if (!map.isEmpty()) {
                try {
                    for (String str : map.keySet()) {
                        Object obj = map.get(str);
                        if (obj != null) {
                            switch (str.hashCode()) {
                                case -2021683300:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST)) {
                                        if (obj instanceof String) {
                                            an.a((String) obj);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case -1195280656:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR)) {
                                        if (obj instanceof String) {
                                            b((String) obj);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 156851746:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                                        if (obj instanceof Set) {
                                            try {
                                                Set set = (Set) obj;
                                                com.pgl.ssdk.ces.a.meta(165, null, Boolean.valueOf(set.contains("boot")));
                                                com.pgl.ssdk.ces.a.meta(166, null, Boolean.valueOf(set.contains("mnc")));
                                                com.pgl.ssdk.ces.a.meta(167, null, Boolean.valueOf(set.contains("mcc")));
                                                com.pgl.ssdk.ces.a.meta(168, null, Boolean.valueOf(set.contains("gaid")));
                                                this.f21501m = set.contains("gaid");
                                                break;
                                            } catch (Throwable unused) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 398905722:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ)) {
                                        if (obj instanceof String) {
                                            String strA = ai.a((String) obj);
                                            if (TextUtils.isEmpty(strA)) {
                                                break;
                                            } else {
                                                com.pgl.ssdk.ces.a.meta(159, null, strA);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 485444716:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC)) {
                                        if (obj instanceof String) {
                                            an.b((String) obj);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 500804551:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_IPV6)) {
                                        if (obj instanceof String) {
                                            String str2 = (String) obj;
                                            if (TextUtils.isEmpty(str2)) {
                                                break;
                                            } else {
                                                am.a(str2);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                        }
                    }
                    if (f21493c == null) {
                        f21493c = new HashMap();
                    }
                    f21493c.putAll(map);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f21493c) == null || map.isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            return new JSONObject(f21493c).toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    public void a(String str) {
        ar.b(new RunnableC0134b(str));
    }
}

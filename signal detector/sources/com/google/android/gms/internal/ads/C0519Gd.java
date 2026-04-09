package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519Gd extends C0697Ql implements InterfaceC0466Db {

    /* renamed from: C, reason: collision with root package name */
    public int f8394C;

    /* renamed from: D, reason: collision with root package name */
    public int f8395D;

    /* renamed from: d, reason: collision with root package name */
    public final C1273hh f8396d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8397e;

    /* renamed from: f, reason: collision with root package name */
    public final WindowManager f8398f;

    /* renamed from: g, reason: collision with root package name */
    public final C9 f8399g;

    /* renamed from: h, reason: collision with root package name */
    public DisplayMetrics f8400h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f8401j;

    /* renamed from: k, reason: collision with root package name */
    public int f8402k;

    /* renamed from: l, reason: collision with root package name */
    public int f8403l;

    /* renamed from: m, reason: collision with root package name */
    public int f8404m;

    /* renamed from: n, reason: collision with root package name */
    public int f8405n;

    public C0519Gd(C1273hh c1273hh, Context context, C9 c9) {
        super(c1273hh, 9, "");
        this.f8401j = -1;
        this.f8402k = -1;
        this.f8404m = -1;
        this.f8405n = -1;
        this.f8394C = -1;
        this.f8395D = -1;
        this.f8396d = c1273hh;
        this.f8397e = context;
        this.f8399g = c9;
        this.f8398f = (WindowManager) context.getSystemService("window");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[PHI: r5
  0x0063: PHI (r5v2 int) = (r5v1 int), (r5v5 int) binds: [B:11:0x0042, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f8397e
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L15
            p2.j r1 = p2.j.f22785C
            t2.G r1 = r1.f22790c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = t2.C2911G.r(r1)
            r1 = r1[r2]
            goto L16
        L15:
            r1 = r2
        L16:
            com.google.android.gms.internal.ads.hh r3 = r8.f8396d
            com.google.android.gms.internal.ads.kh r4 = r3.f14532a
            T2.d r5 = r4.d0()
            if (r5 == 0) goto L2a
            T2.d r5 = r4.d0()
            boolean r5 = r5.b()
            if (r5 != 0) goto L76
        L2a:
            int r5 = r3.getWidth()
            int r3 = r3.getHeight()
            com.google.android.gms.internal.ads.E9 r6 = com.google.android.gms.internal.ads.H9.f8816r0
            q2.s r7 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r7 = r7.f23270c
            java.lang.Object r6 = r7.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L63
            if (r5 != 0) goto L54
            T2.d r5 = r4.d0()
            if (r5 == 0) goto L53
            T2.d r5 = r4.d0()
            int r5 = r5.f3571c
            goto L54
        L53:
            r5 = r2
        L54:
            if (r3 != 0) goto L63
            T2.d r3 = r4.d0()
            if (r3 == 0) goto L64
            T2.d r2 = r4.d0()
            int r2 = r2.f3570b
            goto L64
        L63:
            r2 = r3
        L64:
            q2.r r3 = q2.r.f23260g
            u2.f r6 = r3.f23261a
            int r5 = r6.h(r0, r5)
            r8.f8394C = r5
            u2.f r3 = r3.f23261a
            int r0 = r3.h(r0, r2)
            r8.f8395D = r0
        L76:
            int r0 = r10 - r1
            int r1 = r8.f8394C
            int r2 = r8.f8395D
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> La3
            r3.<init>()     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "x"
            org.json.JSONObject r3 = r3.put(r5, r9)     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "y"
            org.json.JSONObject r0 = r3.put(r5, r0)     // Catch: org.json.JSONException -> La3
            java.lang.String r3 = "width"
            org.json.JSONObject r0 = r0.put(r3, r1)     // Catch: org.json.JSONException -> La3
            java.lang.String r1 = "height"
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> La3
            java.lang.Object r1 = r8.f10691b     // Catch: org.json.JSONException -> La3
            com.google.android.gms.internal.ads.Yg r1 = (com.google.android.gms.internal.ads.InterfaceC0828Yg) r1     // Catch: org.json.JSONException -> La3
            java.lang.String r2 = "onDefaultPositionReceived"
            r1.p(r2, r0)     // Catch: org.json.JSONException -> La3
            goto La9
        La3:
            r0 = move-exception
            java.lang.String r1 = "Error occurred while dispatching default position."
            u2.k.f(r1, r0)
        La9:
            com.google.android.gms.internal.ads.oh r0 = r4.f15228n
            com.google.android.gms.internal.ads.Dd r0 = r0.f15998L
            if (r0 == 0) goto Lb3
            r0.f7799f = r9
            r0.f7800g = r10
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0519Gd.E(int, int):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.f8400h = new DisplayMetrics();
        Display defaultDisplay = this.f8398f.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f8400h);
        this.i = this.f8400h.density;
        this.f8403l = defaultDisplay.getRotation();
        u2.f fVar = q2.r.f23260g.f23261a;
        this.f8401j = Math.round(r11.widthPixels / this.f8400h.density);
        this.f8402k = Math.round(r11.heightPixels / this.f8400h.density);
        C1273hh c1273hh = this.f8396d;
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = c1273hh.f14532a;
        Activity activityH = c1273hh.h();
        if (activityH == null || activityH.getWindow() == null) {
            this.f8404m = this.f8401j;
            this.f8405n = this.f8402k;
        } else {
            C2911G c2911g = p2.j.f22785C.f22790c;
            int[] iArrQ = C2911G.q(activityH);
            this.f8404m = Math.round(iArrQ[0] / this.f8400h.density);
            this.f8405n = Math.round(iArrQ[1] / this.f8400h.density);
        }
        if (viewTreeObserverOnGlobalLayoutListenerC1433kh.d0().b()) {
            this.f8394C = this.f8401j;
            this.f8395D = this.f8402k;
        } else {
            c1273hh.measure(0, 0);
        }
        D(this.f8401j, this.f8402k, this.f8404m, this.f8405n, this.f8403l, this.i);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        C9 c9 = this.f8399g;
        boolean zC = c9.c(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean zC2 = c9.c(intent2);
        boolean zC3 = c9.c(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        Context context = c9.f7545a;
        try {
            jSONObjectPut = new JSONObject().put("sms", zC2).put("tel", zC).put("calendar", zC3).put("storePicture", ((Boolean) d5.y.s(context, B9.f7306b)).booleanValue() && R2.b.a(context).f2065b.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e6) {
            u2.k.f("Error occurred while obtaining the MRAID capabilities.", e6);
            jSONObjectPut = null;
        }
        c1273hh.p("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        c1273hh.getLocationOnScreen(iArr);
        q2.r rVar = q2.r.f23260g;
        u2.f fVar2 = rVar.f23261a;
        int i = iArr[0];
        Context context2 = this.f8397e;
        E(fVar2.h(context2, i), rVar.f23261a.h(context2, iArr[1]));
        if (u2.k.l(2)) {
            u2.k.g("Dispatching Ready Event.");
        }
        try {
            ((InterfaceC0828Yg) this.f10691b).p("onReadyEventReceived", new JSONObject().put("js", viewTreeObserverOnGlobalLayoutListenerC1433kh.f15211e.f23784a));
        } catch (JSONException e7) {
            u2.k.f("Error occurred while dispatching ready Event.", e7);
        }
    }
}

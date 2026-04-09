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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ws extends rt implements oo {

    /* renamed from: e, reason: collision with root package name */
    public final b00 f18156e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f18157f;
    public final WindowManager g;

    /* renamed from: h, reason: collision with root package name */
    public final nk f18158h;

    /* renamed from: i, reason: collision with root package name */
    public DisplayMetrics f18159i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public int f18160k;

    /* renamed from: l, reason: collision with root package name */
    public int f18161l;

    /* renamed from: m, reason: collision with root package name */
    public int f18162m;

    /* renamed from: n, reason: collision with root package name */
    public int f18163n;

    /* renamed from: o, reason: collision with root package name */
    public int f18164o;

    /* renamed from: p, reason: collision with root package name */
    public int f18165p;

    /* renamed from: q, reason: collision with root package name */
    public int f18166q;

    public ws(b00 b00Var, Context context, nk nkVar) {
        super(7, b00Var, "");
        this.f18160k = -1;
        this.f18161l = -1;
        this.f18163n = -1;
        this.f18164o = -1;
        this.f18165p = -1;
        this.f18166q = -1;
        this.f18156e = b00Var;
        this.f18157f = context;
        this.f18158h = nkVar;
        this.g = (WindowManager) context.getSystemService("window");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[PHI: r5
  0x0063: PHI (r5v2 int) = (r5v1 int), (r5v5 int) binds: [B:11:0x0042, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f18157f
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L15
            ua.j r1 = ua.j.C
            ya.f0 r1 = r1.f35261c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = ya.f0.r(r1)
            r1 = r1[r2]
            goto L16
        L15:
            r1 = r2
        L16:
            com.google.android.gms.internal.ads.b00 r3 = r8.f18156e
            com.google.android.gms.internal.ads.e00 r4 = r3.f9521a
            com.google.android.gms.internal.ads.h0 r5 = r4.R()
            if (r5 == 0) goto L2a
            com.google.android.gms.internal.ads.h0 r5 = r4.R()
            boolean r5 = r5.b()
            if (r5 != 0) goto L76
        L2a:
            int r5 = r3.getWidth()
            int r3 = r3.getHeight()
            com.google.android.gms.internal.ads.pk r6 = com.google.android.gms.internal.ads.sk.f16299r0
            va.s r7 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r7 = r7.f36166c
            java.lang.Object r6 = r7.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L63
            if (r5 != 0) goto L54
            com.google.android.gms.internal.ads.h0 r5 = r4.R()
            if (r5 == 0) goto L53
            com.google.android.gms.internal.ads.h0 r5 = r4.R()
            int r5 = r5.f11673c
            goto L54
        L53:
            r5 = r2
        L54:
            if (r3 != 0) goto L63
            com.google.android.gms.internal.ads.h0 r3 = r4.R()
            if (r3 == 0) goto L64
            com.google.android.gms.internal.ads.h0 r2 = r4.R()
            int r2 = r2.f11672b
            goto L64
        L63:
            r2 = r3
        L64:
            va.r r3 = va.r.g
            za.d r6 = r3.f36157a
            int r5 = r6.h(r5, r0)
            r8.f18165p = r5
            za.d r3 = r3.f36157a
            int r0 = r3.h(r2, r0)
            r8.f18166q = r0
        L76:
            int r0 = r10 - r1
            int r1 = r8.f18165p
            int r2 = r8.f18166q
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
            java.lang.Object r1 = r8.f15753b     // Catch: org.json.JSONException -> La3
            com.google.android.gms.internal.ads.qz r1 = (com.google.android.gms.internal.ads.qz) r1     // Catch: org.json.JSONException -> La3
            java.lang.String r2 = "onDefaultPositionReceived"
            r1.h(r2, r0)     // Catch: org.json.JSONException -> La3
            goto La9
        La3:
            r0 = move-exception
            java.lang.String r1 = "Error occurred while dispatching default position."
            za.i.f(r1, r0)
        La9:
            com.google.android.gms.internal.ads.i00 r0 = r4.f10645n
            com.google.android.gms.internal.ads.ts r0 = r0.f12102x
            if (r0 == 0) goto Lb3
            r0.g = r9
            r0.f16927h = r10
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws.C(int, int):void");
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.f18159i = new DisplayMetrics();
        Display defaultDisplay = this.g.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f18159i);
        this.j = this.f18159i.density;
        this.f18162m = defaultDisplay.getRotation();
        za.d dVar = va.r.g.f36157a;
        this.f18160k = Math.round(r11.widthPixels / this.f18159i.density);
        this.f18161l = Math.round(r11.heightPixels / this.f18159i.density);
        b00 b00Var = this.f18156e;
        e00 e00Var = b00Var.f9521a;
        Activity activityA1 = b00Var.A1();
        if (activityA1 == null || activityA1.getWindow() == null) {
            this.f18163n = this.f18160k;
            this.f18164o = this.f18161l;
        } else {
            ya.f0 f0Var = ua.j.C.f35261c;
            int[] iArrQ = ya.f0.q(activityA1);
            this.f18163n = Math.round(iArrQ[0] / this.f18159i.density);
            this.f18164o = Math.round(iArrQ[1] / this.f18159i.density);
        }
        if (e00Var.R().b()) {
            this.f18165p = this.f18160k;
            this.f18166q = this.f18161l;
        } else {
            b00Var.measure(0, 0);
        }
        B(this.f18160k, this.f18161l, this.f18163n, this.f18164o, this.j, this.f18162m);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        nk nkVar = this.f18158h;
        boolean zD = nkVar.d(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean zD2 = nkVar.d(intent2);
        boolean zD3 = nkVar.d(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        Context context = nkVar.f14309b;
        try {
            jSONObjectPut = new JSONObject().put("sms", zD2).put("tel", zD).put("calendar", zD3).put("storePicture", ((Boolean) t6.i0.y(context, mk.f13916b)).booleanValue() && ((Context) ub.b.a(context).f27058a).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e2) {
            za.i.f("Error occurred while obtaining the MRAID capabilities.", e2);
            jSONObjectPut = null;
        }
        b00Var.h("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        b00Var.getLocationOnScreen(iArr);
        va.r rVar = va.r.g;
        za.d dVar2 = rVar.f36157a;
        int i4 = iArr[0];
        Context context2 = this.f18157f;
        C(dVar2.h(i4, context2), rVar.f36157a.h(iArr[1], context2));
        if (za.i.l(2)) {
            za.i.g("Dispatching Ready Event.");
        }
        try {
            ((qz) this.f15753b).h("onReadyEventReceived", new JSONObject().put("js", e00Var.f10638e.f38129a));
        } catch (JSONException e10) {
            za.i.f("Error occurred while dispatching ready Event.", e10);
        }
    }
}

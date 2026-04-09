package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nb0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14220a;

    /* renamed from: b, reason: collision with root package name */
    public final gb0 f14221b;

    /* renamed from: c, reason: collision with root package name */
    public final oe f14222c;

    /* renamed from: d, reason: collision with root package name */
    public final za.a f14223d;

    /* renamed from: e, reason: collision with root package name */
    public final km.n f14224e;

    /* renamed from: f, reason: collision with root package name */
    public final li f14225f;
    public final Executor g;

    /* renamed from: h, reason: collision with root package name */
    public final qm f14226h;

    /* renamed from: i, reason: collision with root package name */
    public final ub0 f14227i;
    public final wc0 j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f14228k;

    /* renamed from: l, reason: collision with root package name */
    public final lc0 f14229l;

    /* renamed from: m, reason: collision with root package name */
    public final qd0 f14230m;

    /* renamed from: n, reason: collision with root package name */
    public final ct0 f14231n;

    /* renamed from: o, reason: collision with root package name */
    public final lh0 f14232o;

    /* renamed from: p, reason: collision with root package name */
    public final qh0 f14233p;

    /* renamed from: q, reason: collision with root package name */
    public final jq0 f14234q;

    /* renamed from: r, reason: collision with root package name */
    public final od0 f14235r;

    /* renamed from: s, reason: collision with root package name */
    public final be0 f14236s;

    public nb0(Context context, gb0 gb0Var, oe oeVar, za.a aVar, km.n nVar, li liVar, ex exVar, hq0 hq0Var, ub0 ub0Var, wc0 wc0Var, ScheduledExecutorService scheduledExecutorService, qd0 qd0Var, ct0 ct0Var, lh0 lh0Var, lc0 lc0Var, qh0 qh0Var, jq0 jq0Var, od0 od0Var, be0 be0Var) {
        this.f14220a = context;
        this.f14221b = gb0Var;
        this.f14222c = oeVar;
        this.f14223d = aVar;
        this.f14224e = nVar;
        this.f14225f = liVar;
        this.g = exVar;
        this.f14226h = hq0Var.j;
        this.f14227i = ub0Var;
        this.j = wc0Var;
        this.f14228k = scheduledExecutorService;
        this.f14230m = qd0Var;
        this.f14231n = ct0Var;
        this.f14232o = lh0Var;
        this.f14229l = lc0Var;
        this.f14233p = qh0Var;
        this.f14234q = jq0Var;
        this.f14235r = od0Var;
        this.f14236s = be0Var;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final va.j2 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new va.j2(strOptString, strOptString2);
    }

    public final vd.b a(JSONArray jSONArray, boolean z3, boolean z10, int i4) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return yo0.e(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z10 ? jSONArray.length() : 1;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.I2)).booleanValue()) {
            d.h.D(ua.j.C.f35267k, this.f14235r.f14678e, d7.f(i4));
        }
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(b(jSONArray.optJSONObject(i10), z3, 0));
        }
        return yo0.G(new f81(x41.q(arrayList), true), o5.f14547i, this.g);
    }

    public final vd.b b(JSONObject jSONObject, boolean z3, int i4) {
        if (jSONObject == null) {
            return s81.f15906b;
        }
        pk pkVar = sk.F4;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        boolean zBooleanValue = ((Boolean) rkVar.a(pkVar)).booleanValue();
        HashMap map = null;
        if (zBooleanValue && jSONObject.has((String) rkVar2.a(sk.G4))) {
            map = new HashMap();
            for (String str : ((String) rkVar2.a(sk.H4)).split(",")) {
                try {
                    map.put(str, jSONObject.getString(str));
                } catch (JSONException unused) {
                }
            }
        }
        HashMap map2 = map;
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map2 == null) {
            return s81.f15906b;
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.I2)).booleanValue() && i4 != 0) {
            d.h.D(ua.j.C.f35267k, this.f14235r.f14678e, d7.f(i4));
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z3 || map2 != null) {
            return yo0.e(new om(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, map2));
        }
        final gb0 gb0Var = this.f14221b;
        gb0Var.f11475a.getClass();
        gx gxVar = new gx();
        ya.r.f37485a.i(new ya.q(strOptString, gxVar));
        x71 x71VarG = yo0.G(yo0.G(gxVar, new z21() { // from class: com.google.android.gms.internal.ads.fb0
            @Override // com.google.android.gms.internal.ads.z21
            public final Object apply(Object obj) {
                gb0 gb0Var2 = gb0Var;
                gb0Var2.getClass();
                byte[] bArr = ((fa) obj).f11075b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (dOptDouble * 160.0d);
                if (!zOptBoolean) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                pk pkVar2 = sk.T6;
                va.s sVar2 = va.s.f36163e;
                if (((Boolean) sVar2.f36166c.a(pkVar2)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    gb0Var2.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i10 = options.outWidth * options.outHeight;
                    if (i10 > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) sVar2.f36166c.a(sk.U6)).intValue())) / 2);
                    }
                }
                return gb0Var2.a(bArr, options);
            }
        }, gb0Var.f11477c), new z21() { // from class: com.google.android.gms.internal.ads.kb0
            @Override // com.google.android.gms.internal.ads.z21
            public final /* synthetic */ Object apply(Object obj) {
                return new om(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.g);
        return jSONObject.optBoolean("require") ? yo0.F(x71VarG, new fp(5, x71VarG), fx.g) : yo0.D(x71VarG, Exception.class, new k20(1), fx.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.w71 d(org.json.JSONObject r12, com.google.android.gms.internal.ads.wp0 r13, com.google.android.gms.internal.ads.yp0 r14, ua.a r15, com.google.android.gms.internal.ads.sv r16) {
        /*
            r11 = this;
            java.lang.String r0 = "base_url"
            java.lang.String r8 = r12.optString(r0)
            java.lang.String r0 = "html"
            java.lang.String r9 = r12.optString(r0)
            java.lang.String r0 = "width"
            r1 = 0
            int r0 = r12.optInt(r0, r1)
            java.lang.String r2 = "height"
            int r12 = r12.optInt(r2, r1)
            if (r0 != 0) goto L24
            if (r12 == 0) goto L1e
            goto L25
        L1e:
            va.c3 r12 = va.c3.a()
            r3 = r12
            goto L32
        L24:
            r1 = r0
        L25:
            va.c3 r0 = new va.c3
            pa.h r2 = new pa.h
            r2.<init>(r1, r12)
            android.content.Context r12 = r11.f14220a
            r0.<init>(r12, r2)
            r3 = r0
        L32:
            com.google.android.gms.internal.ads.ub0 r2 = r11.f14227i
            r2.getClass()
            com.google.android.gms.internal.ads.pk r12 = com.google.android.gms.internal.ads.sk.I2
            va.s r0 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r0 = r0.f36166c
            java.lang.Object r12 = r0.a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L56
            com.google.android.gms.internal.ads.od0 r12 = r2.f17146i
            android.os.Bundle r12 = r12.f14678e
            ua.j r0 = ua.j.C
            tb.a r0 = r0.f35267k
            java.lang.String r1 = "native-assets-loading-video-composition-start"
            d.h.D(r0, r12, r1)
        L56:
            com.google.android.gms.internal.ads.s81 r12 = com.google.android.gms.internal.ads.s81.f15906b
            com.google.android.gms.internal.ads.lb0 r1 = new com.google.android.gms.internal.ads.lb0
            r10 = 1
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.concurrent.Executor r13 = r2.f17140b
            com.google.android.gms.internal.ads.w71 r12 = com.google.android.gms.internal.ads.yo0.F(r12, r1, r13)
            com.google.android.gms.internal.ads.mb0 r13 = new com.google.android.gms.internal.ads.mb0
            r14 = 1
            r13.<init>(r12, r14)
            com.google.android.gms.internal.ads.ex r14 = com.google.android.gms.internal.ads.fx.g
            com.google.android.gms.internal.ads.w71 r12 = com.google.android.gms.internal.ads.yo0.F(r12, r13, r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nb0.d(org.json.JSONObject, com.google.android.gms.internal.ads.wp0, com.google.android.gms.internal.ads.yp0, ua.a, com.google.android.gms.internal.ads.sv):com.google.android.gms.internal.ads.w71");
    }
}

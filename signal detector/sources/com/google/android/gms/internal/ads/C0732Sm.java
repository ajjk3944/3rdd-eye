package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732Sm {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11227a;

    /* renamed from: b, reason: collision with root package name */
    public final C0613Lm f11228b;

    /* renamed from: c, reason: collision with root package name */
    public final H6 f11229c;

    /* renamed from: d, reason: collision with root package name */
    public final C2951a f11230d;

    /* renamed from: e, reason: collision with root package name */
    public final V2.h f11231e;

    /* renamed from: f, reason: collision with root package name */
    public final A8 f11232f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f11233g;

    /* renamed from: h, reason: collision with root package name */
    public final C0499Fa f11234h;
    public final C0851Zm i;

    /* renamed from: j, reason: collision with root package name */
    public final C0427An f11235j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f11236k;

    /* renamed from: l, reason: collision with root package name */
    public final C1709pn f11237l;

    /* renamed from: m, reason: collision with root package name */
    public final C0784Vn f11238m;

    /* renamed from: n, reason: collision with root package name */
    public final C2202yv f11239n;

    /* renamed from: o, reason: collision with root package name */
    public final C0633Mp f11240o;

    /* renamed from: p, reason: collision with root package name */
    public final BinderC0718Rp f11241p;

    /* renamed from: q, reason: collision with root package name */
    public final C1068du f11242q;

    /* renamed from: r, reason: collision with root package name */
    public final C0750Tn f11243r;

    /* renamed from: s, reason: collision with root package name */
    public final C1280ho f11244s;

    public C0732Sm(Context context, C0613Lm c0613Lm, H6 h6, C2951a c2951a, V2.h hVar, A8 a8, C0623Mf c0623Mf, C0960bu c0960bu, C0851Zm c0851Zm, C0427An c0427An, ScheduledExecutorService scheduledExecutorService, C0784Vn c0784Vn, C2202yv c2202yv, C0633Mp c0633Mp, C1709pn c1709pn, BinderC0718Rp binderC0718Rp, C1068du c1068du, C0750Tn c0750Tn, C1280ho c1280ho) {
        this.f11227a = context;
        this.f11228b = c0613Lm;
        this.f11229c = h6;
        this.f11230d = c2951a;
        this.f11231e = hVar;
        this.f11232f = a8;
        this.f11233g = c0623Mf;
        this.f11234h = c0960bu.f13487j;
        this.i = c0851Zm;
        this.f11235j = c0427An;
        this.f11236k = scheduledExecutorService;
        this.f11238m = c0784Vn;
        this.f11239n = c2202yv;
        this.f11240o = c0633Mp;
        this.f11237l = c1709pn;
        this.f11241p = binderC0718Rp;
        this.f11242q = c1068du;
        this.f11243r = c0750Tn;
        this.f11244s = c1280ho;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final q2.K0 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new q2.K0(strOptString, strOptString2);
    }

    public final InterfaceFutureC2326a a(JSONArray jSONArray, boolean z6, boolean z7, int i) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return AbstractC1984ut.e(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z7 ? jSONArray.length() : 1;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8610I2)).booleanValue()) {
            A.f.r(p2.j.f22785C.f22797k, this.f11243r.f11461e, AbstractC1135f5.d(i));
        }
        for (int i3 = 0; i3 < length; i3++) {
            arrayList.add(b(jSONArray.optJSONObject(i3), 0, z6));
        }
        return AbstractC1984ut.G(new C1789rD(LB.m(arrayList), true), C1563n2.i, this.f11233g);
    }

    public final InterfaceFutureC2326a b(JSONObject jSONObject, int i, boolean z6) {
        if (jSONObject == null) {
            return ED.f7928b;
        }
        E9 e9 = H9.f8593F4;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        boolean zBooleanValue = ((Boolean) g9.a(e9)).booleanValue();
        HashMap map = null;
        if (zBooleanValue && jSONObject.has((String) g92.a(H9.f8599G4))) {
            map = new HashMap();
            for (String str : ((String) g92.a(H9.f8605H4)).split(",")) {
                try {
                    map.put(str, jSONObject.getString(str));
                } catch (JSONException unused) {
                }
            }
        }
        HashMap map2 = map;
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map2 == null) {
            return ED.f7928b;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8610I2)).booleanValue() && i != 0) {
            A.f.r(p2.j.f22785C.f22797k, this.f11243r.f11461e, AbstractC1135f5.d(i));
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z6 || map2 != null) {
            return AbstractC1984ut.e(new BinderC0465Da(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, map2));
        }
        final C0613Lm c0613Lm = this.f11228b;
        c0613Lm.f9753a.getClass();
        C0657Of c0657Of = new C0657Of();
        t2.u.f23657a.b(new t2.t(strOptString, c0657Of));
        C1358jD c1358jDG = AbstractC1984ut.G(AbstractC1984ut.G(c0657Of, new NA() { // from class: com.google.android.gms.internal.ads.Km
            @Override // com.google.android.gms.internal.ads.NA
            public final Object apply(Object obj) {
                C0613Lm c0613Lm2 = c0613Lm;
                c0613Lm2.getClass();
                byte[] bArr = ((A4) obj).f6927b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (dOptDouble * 160.0d);
                if (!zOptBoolean) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                E9 e92 = H9.T6;
                C2841s c2841s2 = C2841s.f23267e;
                if (((Boolean) c2841s2.f23270c.a(e92)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    c0613Lm2.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i3 = options.outWidth * options.outHeight;
                    if (i3 > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i3 - 1) / ((Integer) c2841s2.f23270c.a(H9.U6)).intValue())) / 2);
                    }
                }
                return c0613Lm2.a(bArr, options);
            }
        }, c0613Lm.f9755c), new NA() { // from class: com.google.android.gms.internal.ads.Pm
            @Override // com.google.android.gms.internal.ads.NA
            public final /* synthetic */ Object apply(Object obj) {
                return new BinderC0465Da(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.f11233g);
        return jSONObject.optBoolean("require") ? AbstractC1984ut.F(c1358jDG, new C0738Tb(5, c1358jDG), AbstractC0640Nf.f10011g) : AbstractC1984ut.D(c1358jDG, Exception.class, new C1704pi(1), AbstractC0640Nf.f10011g);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1306iD d(org.json.JSONObject r12, com.google.android.gms.internal.ads.Qt r13, com.google.android.gms.internal.ads.St r14, p2.C2771a r15, com.google.android.gms.internal.ads.C0945bf r16) {
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
            q2.d1 r12 = q2.d1.a()
            r3 = r12
            goto L32
        L24:
            r1 = r0
        L25:
            q2.d1 r0 = new q2.d1
            j2.h r2 = new j2.h
            r2.<init>(r1, r12)
            android.content.Context r12 = r11.f11227a
            r0.<init>(r12, r2)
            r3 = r0
        L32:
            com.google.android.gms.internal.ads.Zm r2 = r11.i
            r2.getClass()
            com.google.android.gms.internal.ads.E9 r12 = com.google.android.gms.internal.ads.H9.f8610I2
            q2.s r0 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r0 = r0.f23270c
            java.lang.Object r12 = r0.a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L56
            com.google.android.gms.internal.ads.Tn r12 = r2.i
            android.os.Bundle r12 = r12.f11461e
            p2.j r0 = p2.j.f22785C
            Q2.a r0 = r0.f22797k
            java.lang.String r1 = "native-assets-loading-video-composition-start"
            A.f.r(r0, r12, r1)
        L56:
            com.google.android.gms.internal.ads.ED r12 = com.google.android.gms.internal.ads.ED.f7928b
            com.google.android.gms.internal.ads.Qm r1 = new com.google.android.gms.internal.ads.Qm
            r10 = 1
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.concurrent.Executor r13 = r2.f12950b
            com.google.android.gms.internal.ads.iD r12 = com.google.android.gms.internal.ads.AbstractC1984ut.F(r12, r1, r13)
            com.google.android.gms.internal.ads.Rm r13 = new com.google.android.gms.internal.ads.Rm
            r14 = 1
            r13.<init>(r12, r14)
            com.google.android.gms.internal.ads.Mf r14 = com.google.android.gms.internal.ads.AbstractC0640Nf.f10011g
            com.google.android.gms.internal.ads.iD r12 = com.google.android.gms.internal.ads.AbstractC1984ut.F(r12, r13, r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0732Sm.d(org.json.JSONObject, com.google.android.gms.internal.ads.Qt, com.google.android.gms.internal.ads.St, p2.a, com.google.android.gms.internal.ads.bf):com.google.android.gms.internal.ads.iD");
    }
}

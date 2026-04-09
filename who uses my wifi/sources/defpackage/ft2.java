package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ft2 {
    public final Context a;
    public final zs2 b;
    public final vs1 c;
    public final e51 d;
    public final l92 e;
    public final cx1 f;
    public final Executor g;
    public final r12 h;
    public final mt2 i;
    public final pu2 j;
    public final ScheduledExecutorService k;
    public final du2 l;
    public final mv2 m;
    public final eb3 n;
    public final jz2 o;
    public final pz2 p;
    public final m83 q;
    public final jv2 r;
    public final xv2 s;

    public ft2(Context context, zs2 zs2Var, vs1 vs1Var, e51 e51Var, l92 l92Var, cx1 cx1Var, ld2 ld2Var, l83 l83Var, mt2 mt2Var, pu2 pu2Var, ScheduledExecutorService scheduledExecutorService, mv2 mv2Var, eb3 eb3Var, jz2 jz2Var, du2 du2Var, pz2 pz2Var, m83 m83Var, jv2 jv2Var, xv2 xv2Var) {
        this.a = context;
        this.b = zs2Var;
        this.c = vs1Var;
        this.d = e51Var;
        this.e = l92Var;
        this.f = cx1Var;
        this.g = ld2Var;
        this.h = l83Var.j;
        this.i = mt2Var;
        this.j = pu2Var;
        this.k = scheduledExecutorService;
        this.m = mv2Var;
        this.n = eb3Var;
        this.o = jz2Var;
        this.l = du2Var;
        this.p = pz2Var;
        this.q = m83Var;
        this.r = jv2Var;
        this.s = xv2Var;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final c63 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new c63(strOptString, strOptString2);
    }

    public final n70 a(JSONArray jSONArray, boolean z, boolean z2, int i) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return pu1.r(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) tw1.e.c.a(mz1.t2)).booleanValue()) {
            ga1.n(hg4.C.k, this.r.e, ga1.b(i));
        }
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(b(jSONArray.optJSONObject(i2), z, 0));
        }
        return pu1.P(new zp3(xm3.m(arrayList), true), gj1.k, this.g);
    }

    public final n70 b(JSONObject jSONObject, boolean z, int i) {
        if (jSONObject == null) {
            return lq3.g;
        }
        iz1 iz1Var = mz1.o4;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        boolean zBooleanValue = ((Boolean) kz1Var.a(iz1Var)).booleanValue();
        HashMap map = null;
        if (zBooleanValue && jSONObject.has((String) kz1Var2.a(mz1.p4))) {
            map = new HashMap();
            for (String str : ((String) kz1Var2.a(mz1.q4)).split(",")) {
                try {
                    map.put(str, jSONObject.getString(str));
                } catch (JSONException unused) {
                }
            }
        }
        HashMap map2 = map;
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map2 == null) {
            return lq3.g;
        }
        if (((Boolean) tw1.e.c.a(mz1.t2)).booleanValue() && i != 0) {
            ga1.n(hg4.C.k, this.r.e, ga1.b(i));
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z || map2 != null) {
            return pu1.r(new p12(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, map2));
        }
        final zs2 zs2Var = this.b;
        zs2Var.a.getClass();
        pd2 pd2Var = new pd2();
        p32.a.b(new b32(strOptString, pd2Var));
        rp3 rp3VarP = pu1.P(pu1.P(pd2Var, new zk3() { // from class: ys2
            @Override // defpackage.zk3
            public final Object apply(Object obj) {
                zs2 zs2Var2 = zs2Var;
                zs2Var2.getClass();
                byte[] bArr = ((ho1) obj).b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (dOptDouble * 160.0d);
                if (!zOptBoolean) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                iz1 iz1Var2 = mz1.z6;
                tw1 tw1Var2 = tw1.e;
                if (((Boolean) tw1Var2.c.a(iz1Var2)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    zs2Var2.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i2 = options.outWidth * options.outHeight;
                    if (i2 > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i2 - 1) / ((Integer) tw1Var2.c.a(mz1.A6)).intValue())) / 2);
                    }
                }
                return zs2Var2.a(bArr, options);
            }
        }, zs2Var.c), new zk3() { // from class: ct2
            @Override // defpackage.zk3
            public final /* synthetic */ Object apply(Object obj) {
                return new p12(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.g);
        return jSONObject.optBoolean("require") ? pu1.O(rp3VarP, new u42(5, rp3VarP), md2.g) : pu1.L(rp3VarP, Exception.class, new fi1(2), md2.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qp3 d(org.json.JSONObject r12, defpackage.a83 r13, defpackage.c83 r14, defpackage.su1 r15, defpackage.qb2 r16) {
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
            xe4 r12 = defpackage.xe4.a()
            r3 = r12
            goto L32
        L24:
            r1 = r0
        L25:
            xe4 r0 = new xe4
            d3 r2 = new d3
            r2.<init>(r1, r12)
            android.content.Context r12 = r11.a
            r0.<init>(r12, r2)
            r3 = r0
        L32:
            mt2 r2 = r11.i
            r2.getClass()
            iz1 r12 = defpackage.mz1.t2
            tw1 r0 = defpackage.tw1.e
            kz1 r0 = r0.c
            java.lang.Object r12 = r0.a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L56
            jv2 r12 = r2.i
            android.os.Bundle r12 = r12.e
            hg4 r0 = defpackage.hg4.C
            ym r0 = r0.k
            java.lang.String r1 = "native-assets-loading-video-composition-start"
            defpackage.ga1.n(r0, r12, r1)
        L56:
            lq3 r12 = defpackage.lq3.g
            dt2 r1 = new dt2
            r10 = 1
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.concurrent.Executor r13 = r2.b
            qp3 r12 = defpackage.pu1.O(r12, r1, r13)
            et2 r13 = new et2
            r14 = 1
            r13.<init>(r12, r14)
            ld2 r14 = defpackage.md2.g
            qp3 r12 = defpackage.pu1.O(r12, r13, r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft2.d(org.json.JSONObject, a83, c83, su1, qb2):qp3");
    }
}

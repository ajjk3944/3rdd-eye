package j6;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.cardview.widget.CardView;
import b5.u0;
import com.google.android.gms.internal.ads.h0;
import com.google.android.gms.internal.ads.j5;
import com.google.android.gms.internal.ads.s9;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class i implements m8.m, o.x, wi.a, re.b, se.a, x5.a, u8.c, v2.n, wb.c, y2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27414a;

    public /* synthetic */ i(int i4) {
        this.f27414a = i4;
    }

    public static RectF i(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.E || !(view instanceof jd.k)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        jd.k kVar = (jd.k) view;
        int contentWidth = kVar.getContentWidth();
        int contentHeight = kVar.getContentHeight();
        int iD = (int) zc.m.d(24, kVar.getContext());
        if (contentWidth < iD) {
            contentWidth = iD;
        }
        int right = (kVar.getRight() + kVar.getLeft()) / 2;
        int bottom = (kVar.getBottom() + kVar.getTop()) / 2;
        int i4 = contentWidth / 2;
        return new RectF(right - i4, bottom - (contentHeight / 2), i4 + right, (right / 2) + bottom);
    }

    public static Typeface l(String str, v2.k kVar, int i4) {
        if (i4 == 0 && nk.k.a(kVar, v2.k.f35777c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iH = i0.h(kVar, i4);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iH) : Typeface.create(str, iH);
    }

    public static o7.a m(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new o7.a(httpURLConnection);
    }

    public static Path n(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static void o(pi.a aVar) {
        nk.k.e(aVar, "adItem");
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iR = com.liuzh.deviceinfo.utilities.f.r() + 1;
        com.liuzh.deviceinfo.utilities.f.m("today_ad_click_count", new SimpleDateFormat("yyyyMMdd", Locale.US).format(Long.valueOf(System.currentTimeMillis())) + "_" + iR);
        long j = (long) iR;
        long jV = kh.a.f28295b == null ? 4L : ja.c.v("risk_user_ad_click_limited");
        if (j >= (jV >= 4 ? jV : 4L)) {
            com.liuzh.deviceinfo.utilities.f.k("risk_user", true);
            cg.a.f2848b.b("RiskUser", "yes");
        }
        com.liuzh.deviceinfo.utilities.f.l(com.liuzh.deviceinfo.utilities.f.f21257c.getInt("total_ad_click_count", 0) + 1, "total_ad_click_count");
        int iR2 = com.liuzh.deviceinfo.utilities.f.r();
        if (iR2 > 20) {
            cg.a.f2848b.f(null, "ad_click_20");
        } else if (iR2 > 10) {
            cg.a.f2848b.f(null, "ad_click_10");
        } else if (iR2 > 5) {
            cg.a.f2848b.f(null, "ad_click_5");
        }
    }

    public static void q(pi.a aVar) {
        nk.k.e(aVar, "adItem");
        if (aVar.f32005c == 3) {
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            com.liuzh.deviceinfo.utilities.f.f21257c.edit().putLong("last_inter_ad_show_time", System.currentTimeMillis()).apply();
        }
    }

    @Override // y2.d
    public y2.c b() {
        return new y2.c(cm.g.s(new y2.b(Locale.getDefault())));
    }

    @Override // x5.a
    public void c(e6.a aVar) {
        nk.k.e(aVar, "db");
        aVar.j("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // wi.a
    public void d(String str) {
        nk.k.e(str, "file");
    }

    @Override // v2.n
    public Typeface f(v2.k kVar, int i4) {
        return l(null, kVar, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @Override // v2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface g(v2.m r5, v2.k r6, int r7) {
        /*
            r4 = this;
            r5.getClass()
            int r5 = r6.f35780a
            int r5 = r5 / 100
            java.lang.String r0 = "sans-serif"
            r1 = 2
            if (r5 < 0) goto L11
            if (r5 >= r1) goto L11
            java.lang.String r5 = "sans-serif-thin"
            goto L33
        L11:
            r2 = 4
            if (r1 > r5) goto L19
            if (r5 >= r2) goto L19
            java.lang.String r5 = "sans-serif-light"
            goto L33
        L19:
            if (r5 != r2) goto L1d
        L1b:
            r5 = r0
            goto L33
        L1d:
            r1 = 5
            if (r5 != r1) goto L23
            java.lang.String r5 = "sans-serif-medium"
            goto L33
        L23:
            r1 = 6
            r2 = 8
            if (r1 > r5) goto L2b
            if (r5 >= r2) goto L2b
            goto L1b
        L2b:
            if (r2 > r5) goto L1b
            r1 = 11
            if (r5 >= r1) goto L1b
            java.lang.String r5 = "sans-serif-black"
        L33:
            int r1 = r5.length()
            r2 = 0
            if (r1 != 0) goto L3b
            goto L5a
        L3b:
            android.graphics.Typeface r5 = l(r5, r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            int r3 = t6.i0.h(r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)
            boolean r1 = nk.k.a(r5, r1)
            if (r1 != 0) goto L5a
            android.graphics.Typeface r1 = l(r2, r6, r7)
            boolean r1 = nk.k.a(r5, r1)
            if (r1 != 0) goto L5a
            r2 = r5
        L5a:
            if (r2 != 0) goto L61
            android.graphics.Typeface r5 = l(r0, r6, r7)
            return r5
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.i.g(v2.m, v2.k, int):android.graphics.Typeface");
    }

    @Override // y2.d
    public Locale h(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (nk.k.a(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    @Override // wb.c
    public h0 j(Context context, String str, wb.b bVar) {
        int iA;
        switch (this.f27414a) {
            case 24:
                h0 h0Var = new h0();
                int iA2 = bVar.a(context, str, true);
                h0Var.f11672b = iA2;
                if (iA2 != 0) {
                    h0Var.f11673c = 1;
                } else {
                    int iE = bVar.e(context, str);
                    h0Var.f11671a = iE;
                    if (iE != 0) {
                        h0Var.f11673c = -1;
                    }
                }
                return h0Var;
            default:
                h0 h0Var2 = new h0();
                int iE2 = bVar.e(context, str);
                h0Var2.f11671a = iE2;
                int i4 = 1;
                int i10 = 0;
                if (iE2 != 0) {
                    iA = bVar.a(context, str, false);
                    h0Var2.f11672b = iA;
                } else {
                    iA = bVar.a(context, str, true);
                    h0Var2.f11672b = iA;
                }
                int i11 = h0Var2.f11671a;
                if (i11 == 0) {
                    if (iA == 0) {
                        i4 = 0;
                    }
                    h0Var2.f11673c = i4;
                    return h0Var2;
                }
                i10 = i11;
                if (i10 >= iA) {
                    i4 = -1;
                }
                h0Var2.f11673c = i4;
                return h0Var2;
        }
    }

    @Override // u8.c
    public void k(Object obj) {
        ((List) obj).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // se.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] p(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
            r6 = r3
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r2
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r3
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.i.p(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    public void r(km.o oVar, float f10) {
        w.a aVar = (w.a) ((Drawable) oVar.f28445a);
        CardView cardView = (CardView) oVar.f28446b;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f10 != aVar.f36384e || aVar.f36385f != useCompatPadding || aVar.g != preventCornerOverlap) {
            aVar.f36384e = f10;
            aVar.f36385f = useCompatPadding;
            aVar.g = preventCornerOverlap;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            oVar.n(0, 0, 0, 0);
            return;
        }
        w.a aVar2 = (w.a) ((Drawable) oVar.f28445a);
        float f11 = aVar2.f36384e;
        float f12 = aVar2.f36380a;
        int iCeil = (int) Math.ceil(w.b.a(f11, f12, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(w.b.b(f11, f12, cardView.getPreventCornerOverlap()));
        oVar.n(iCeil, iCeil2, iCeil, iCeil2);
    }

    public void s(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF rectFI = i(tabLayout, view);
        RectF rectFI2 = i(tabLayout, view2);
        drawable.setBounds(jc.a.c(f10, (int) rectFI.left, (int) rectFI2.left), drawable.getBounds().top, jc.a.c(f10, (int) rectFI.right, (int) rectFI2.right), drawable.getBounds().bottom);
    }

    @Override // re.b
    public re.a u(i7.b bVar, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        s9 s9Var = jSONObject.has("session") ? new s9(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 10) : new s9(new JSONObject().optInt("max_custom_exception_events", 8), 10);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new re.a(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (iOptInt * 1000) + System.currentTimeMillis(), s9Var, new j5(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // o.x
    public boolean v(o.m mVar) {
        return false;
    }

    public i(km.n nVar, u0 u0Var) {
        this.f27414a = 5;
    }

    @Override // wi.a
    public void a(LinkedList linkedList, LinkedList linkedList2) {
    }

    @Override // o.x
    public void e(o.m mVar, boolean z3) {
    }
}

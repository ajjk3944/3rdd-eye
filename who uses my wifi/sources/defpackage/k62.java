package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.InputEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k62 implements yp3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ k62(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    public n70 a(Object obj) {
        pd2 pd2Var = new pd2();
        x52 x52VarC = ((mm2) this.e).c();
        gi2.G("callJs > getEngine: Promise created");
        x52VarC.t(new mc2(this, x52VarC, obj, pd2Var, 11), new l92(this, pd2Var, x52VarC));
        return pd2Var;
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) throws hg2, JSONException {
        n70 n70VarB;
        lq3 lq3VarR;
        switch (this.a) {
            case 0:
                return a(obj);
            case 1:
                gj2 gj2Var = (gj2) this.c;
                Uri.Builder builder = (Uri.Builder) this.d;
                String str = (String) this.b;
                InputEvent inputEvent = (InputEvent) this.e;
                if (((Integer) obj).intValue() != 1) {
                    builder.appendQueryParameter((String) tw1.e.c.a(mz1.Ya), "10");
                    return pu1.r(builder.toString());
                }
                Uri.Builder builderBuildUpon = builder.build().buildUpon();
                iz1 iz1Var = mz1.Za;
                kz1 kz1Var = tw1.e.c;
                builderBuildUpon.appendQueryParameter((String) kz1Var.a(iz1Var), "1");
                builderBuildUpon.appendQueryParameter((String) kz1Var.a(mz1.Ya), "12");
                if (str.contains((CharSequence) kz1Var.a(mz1.ab))) {
                    builderBuildUpon.authority((String) kz1Var.a(mz1.bb));
                }
                yz2 yz2Var = gj2Var.c;
                Uri uriBuild = builderBuildUpon.build();
                yz2Var.getClass();
                try {
                    wc0 wc0Var = yz2Var.a;
                    Objects.requireNonNull(wc0Var);
                    n70VarB = wc0Var.c(uriBuild, inputEvent);
                } catch (Exception e) {
                    n70VarB = pu1.B(e);
                }
                return pu1.O(gq3.r(n70VarB), new u42(2, builder), gj2Var.f);
            case 2:
                Long l = (Long) this.c;
                mv2 mv2Var = (mv2) this.d;
                aa3 aa3Var = (aa3) this.e;
                ea3 ea3Var = (ea3) this.b;
                JSONObject jSONObject = (JSONObject) obj;
                int i = 0;
                boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
                if (zOptBoolean) {
                    String string = jSONObject.getString("appSettingsJson");
                    hg4 hg4Var = hg4.C;
                    ra4 ra4VarG = hg4Var.h.g();
                    ra4VarG.h();
                    synchronized (ra4VarG.a) {
                        try {
                            hg4Var.k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (string == null || string.equals(ra4VarG.n.e)) {
                                ra4VarG.n.f = jCurrentTimeMillis;
                            } else {
                                ra4VarG.n = new ed2(string, jCurrentTimeMillis);
                                SharedPreferences.Editor editor = ra4VarG.g;
                                if (editor != null) {
                                    editor.putString("app_settings_json", string);
                                    ra4VarG.g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                    ra4VarG.g.apply();
                                }
                                ra4VarG.i();
                                ArrayList arrayList = ra4VarG.c;
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj2 = arrayList.get(i);
                                    i++;
                                    ((Runnable) obj2).run();
                                }
                            }
                        } finally {
                        }
                    }
                    if (l != null) {
                        hg4.C.k.getClass();
                        ue.G(mv2Var, "cld_s", SystemClock.elapsedRealtime() - l.longValue());
                    }
                }
                String strOptString = jSONObject.optString("errorReason", "");
                if (!TextUtils.isEmpty(strOptString)) {
                    aa3Var.m(strOptString);
                }
                aa3Var.b(zOptBoolean);
                ea3Var.b(aa3Var.n());
                return lq3.g;
            case 3:
                ft2 ft2Var = (ft2) this.c;
                String str2 = (String) this.b;
                sb2 sb2Var = (sb2) this.d;
                su1 su1Var = (su1) this.e;
                ft2Var.getClass();
                sd2 sd2Var = hg4.C.d;
                ag2 ag2VarB = sd2.b(ft2Var.a, new zq(0, 0, 0), "native-omid", false, false, ft2Var.c, null, ft2Var.d, null, ft2Var.e, ft2Var.f, null, null, ft2Var.p, ft2Var.q, ft2Var.m);
                yw1 yw1Var = new yw1(ag2VarB);
                ag2VarB.e0().l = new f20(21, yw1Var);
                ag2VarB.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                if (((Boolean) tw1.e.c.a(mz1.pe)).booleanValue()) {
                    if (sb2Var != null) {
                        ag2VarB.e0().D = sb2Var;
                    }
                    ag2VarB.e0().B = su1Var;
                }
                return yw1Var;
            case 4:
                t83 t83Var = (t83) this.c;
                return pu1.O(((oy2) this.d).e((fa2) this.e), (yp3) this.b, (pq3) t83Var.g);
            case 5:
                s13 s13Var = (s13) this.c;
                a83 a83Var = (a83) this.d;
                h83 h83Var = (h83) this.e;
                zz2 zz2Var = (zz2) this.b;
                aa3 aa3VarL = aa3.l(s13Var.j, 12);
                aa3VarL.q0(a83Var.E);
                aa3VarL.a();
                n70 n70VarN = pu1.N(zz2Var.b(h83Var, a83Var), a83Var.R, TimeUnit.MILLISECONDS, s13Var.f);
                s13Var.h.b(h83Var, a83Var, n70VarN, s13Var.c);
                qb1.P(n70VarN, s13Var.k, aa3VarL, false);
                return n70VarN;
            case 6:
                gc3 gc3Var = (gc3) this.c;
                z71 z71Var = (z71) this.d;
                t83 t83Var2 = (t83) this.e;
                a73 a73Var = (a73) this.b;
                e93 e93Var = (e93) obj;
                synchronized (gc3Var) {
                    try {
                        gc3Var.b = true;
                        e93Var.a = (lm2) ((vg0) z71Var.g).g;
                        if (gc3Var.a) {
                            lq3VarR = pu1.r(new k93(e93Var, a73Var));
                        } else {
                            t83Var2.W(a73Var.g, e93Var);
                            lq3VarR = lq3.g;
                        }
                    } finally {
                    }
                }
                return lq3VarR;
            case 7:
                return ((kh3) ((tf3) this.b).b.f.get()).b((Context) this.c, (View) this.d, (Activity) this.e);
            default:
                return ((kh3) ((tf3) this.e).b.f.get()).f((Context) this.c, (String) this.b, (View) this.d);
        }
    }

    public /* synthetic */ k62(gj2 gj2Var, Uri.Builder builder, String str, InputEvent inputEvent) {
        this.a = 1;
        this.c = gj2Var;
        this.d = builder;
        this.b = str;
        this.e = inputEvent;
    }

    public k62(mm2 mm2Var, String str, g62 g62Var, f62 f62Var) {
        this.a = 0;
        this.e = mm2Var;
        this.b = str;
        this.d = g62Var;
        this.c = f62Var;
    }

    public /* synthetic */ k62(ft2 ft2Var, String str, qb2 qb2Var, su1 su1Var) {
        this.a = 3;
        this.c = ft2Var;
        this.b = str;
        this.d = qb2Var;
        this.e = su1Var;
    }

    public k62(tf3 tf3Var, Context context, View view, Activity activity) {
        this.a = 7;
        this.c = context;
        this.d = view;
        this.e = activity;
        Objects.requireNonNull(tf3Var);
        this.b = tf3Var;
    }

    public k62(tf3 tf3Var, Context context, String str, View view) {
        this.a = 8;
        this.c = context;
        this.b = str;
        this.d = view;
        Objects.requireNonNull(tf3Var);
        this.e = tf3Var;
    }
}

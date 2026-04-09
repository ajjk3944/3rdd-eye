package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class us0 implements p61, ye1, ef1, nf1, ws2, jk1, e41, td2, f62, g62, aw0, s92 {
    public static us0 f;
    public static us0 g;
    public static final /* synthetic */ us0 h = new us0();
    public static final /* synthetic */ us0 i = new us0();

    public static ts m(jo1 jo1Var, Map map) {
        String str = jo1Var.h;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(jo1Var.e());
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i2 = jo1Var.q.a;
        httpURLConnection.setConnectTimeout(i2);
        httpURLConnection.setReadTimeout(i2);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str2 : map2.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
            }
            if (jo1Var.g != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrF = jo1Var.f();
                if (bArrF != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrF);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                ts tsVar = new ts(responseCode, r(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return tsVar;
            }
            try {
                return new ts(responseCode, r(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new xo1(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final yw1 n(Context context, ww1 ww1Var) {
        wy0 wy0Var = new wy0(context, 3);
        yw1 yw1Var = new yw1(wy0Var);
        xb4 xb4Var = new xb4(wy0Var, ww1Var, yw1Var, 16, false);
        l92 l92Var = new l92((Object) wy0Var, (Object) yw1Var, false);
        synchronized (wy0Var.h) {
            vw1 vw1Var = new vw1(context, hg4.C.t.a(), xb4Var, l92Var, 0);
            wy0Var.g = vw1Var;
            vw1Var.n();
        }
        return yw1Var;
    }

    public static final void o(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i2));
            }
            Collections.unmodifiableList(arrayList);
        }
    }

    public static final boolean q(Context context, Intent intent, kf1 kf1Var, id1 id1Var, boolean z, mv2 mv2Var, String str, Bundle bundle) {
        int iJ;
        if (z) {
            try {
                iJ = hg4.C.c.J(context, intent.getData(), bundle);
                if (kf1Var != null) {
                    kf1Var.i();
                }
            } catch (ActivityNotFoundException e) {
                gi2.i0(e.getMessage());
                iJ = 6;
            }
            if (id1Var != null) {
                id1Var.c(iJ);
            }
            return iJ == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            gi2.G(sb.toString());
            if (((Boolean) tw1.e.c.a(mz1.Td)).booleanValue()) {
                lf4 lf4Var = hg4.C.c;
                lf4.v(context, intent, mv2Var, str);
            } else {
                lf4 lf4Var2 = hg4.C.c;
                lf4.s(context, intent);
            }
            if (kf1Var != null) {
                kf1Var.i();
            }
            if (id1Var != null) {
                id1Var.T(true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            gi2.i0(e2.getMessage());
            if (id1Var != null) {
                id1Var.T(false);
            }
            return false;
        }
    }

    public static ArrayList r(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new do1((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static final boolean t(Context context, fc2 fc2Var, kf1 kf1Var, id1 id1Var, mv2 mv2Var, String str) throws NumberFormatException {
        int i2 = 0;
        if (fc2Var == null) {
            gi2.i0("No intent data for launcher overlay.");
            return false;
        }
        mz1.a(context);
        Intent intent = fc2Var.m;
        if (intent != null) {
            return q(context, intent, kf1Var, id1Var, fc2Var.o, mv2Var, str, fc2Var.p);
        }
        Intent intent2 = new Intent();
        String str2 = fc2Var.g;
        if (TextUtils.isEmpty(str2)) {
            gi2.i0("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = fc2Var.h;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = fc2Var.i;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = fc2Var.j;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                gi2.i0("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = fc2Var.k;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i2 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                gi2.i0("Could not parse intent flags.");
            }
            intent2.addFlags(i2);
        }
        iz1 iz1Var = mz1.W4;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) tw1Var.c.a(mz1.V4)).booleanValue()) {
                lf4 lf4Var = hg4.C.c;
                lf4.L(context, intent2);
            }
        }
        return q(context, intent2, kf1Var, id1Var, fc2Var.o, mv2Var, str, fc2Var.p);
    }

    @Override // defpackage.eu2
    /* renamed from: a */
    public Object mo18a() {
        return new jf1();
    }

    @Override // defpackage.p61
    public m61 b(Class cls) {
        return yb.i(cls);
    }

    @Override // defpackage.td2, defpackage.dp2
    /* renamed from: c */
    public void mo14c(Object obj) {
        gi2.G("Ending javascript session.");
        d62 d62Var = (d62) ((c62) obj);
        HashSet hashSet = d62Var.g;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            gi2.G("Unregistering eventhandler: ".concat(String.valueOf(((y32) simpleEntry.getValue()).toString())));
            d62Var.f.h((String) simpleEntry.getKey(), (y32) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // defpackage.jk1
    public boolean f(ph4 ph4Var) {
        String str = ph4Var.m;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.p61
    public m61 h(Class cls, mf0 mf0Var) {
        return b(cls);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.jk1
    public int i(ph4 ph4Var) {
        String str = ph4Var.m;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return 2;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return 2;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return 2;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return 1;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return 2;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return 1;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return 2;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return 1;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return 1;
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // defpackage.e41
    public void j(bw bwVar) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(bwVar.a)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.jk1
    public kk1 k(ph4 ph4Var) {
        String str = ph4Var.m;
        List list = ph4Var.p;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        uk1 uk1Var = new uk1();
                        kz2 kz2Var = new kz2((byte[]) list.get(0));
                        int iL = kz2Var.L();
                        int iL2 = kz2Var.L();
                        Paint paint = new Paint();
                        uk1Var.f = paint;
                        paint.setStyle(Paint.Style.FILL_AND_STROKE);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                        paint.setPathEffect(null);
                        Paint paint2 = new Paint();
                        uk1Var.g = paint2;
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                        paint2.setPathEffect(null);
                        uk1Var.h = new Canvas();
                        int i2 = 719;
                        uk1Var.i = new ok1(i2, 575, 0, i2, 0, 575);
                        uk1Var.j = new nk1(0, new int[]{0, -1, -16777216, -8421505}, uk1.m(), uk1.p());
                        uk1Var.k = new tk1(iL, iL2);
                        return uk1Var;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new p21(8);
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new vg0(10);
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new vq2(20);
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new ll1(list);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new wk1(list);
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        return new mc2(list);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new dl1();
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new il1();
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // defpackage.p61
    public m61 l(hf hfVar, mf0 mf0Var) {
        return h(m54.h(hfVar), mf0Var);
    }

    @Override // defpackage.g62
    public /* bridge */ /* synthetic */ JSONObject p(Object obj) {
        return (JSONObject) obj;
    }

    @Override // defpackage.nf1
    public jg1 z(int i2, int i3) {
        return new gf1();
    }

    @Override // defpackage.ef1, defpackage.eu2
    /* renamed from: a */
    public /* synthetic */ Constructor mo18a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int[] iArr = ff1.h;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(lf1.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // defpackage.nf1
    public void s() {
    }

    @Override // defpackage.ye1
    public long d(long j) {
        return j;
    }

    @Override // defpackage.nf1
    public void v(cg1 cg1Var) {
    }

    @Override // defpackage.f62
    public /* bridge */ /* synthetic */ Object x(JSONObject jSONObject) {
        return jSONObject;
    }

    @Override // defpackage.s92
    public void e(String str, Throwable th) {
    }

    @Override // defpackage.s92
    public void g(Throwable th, String str, float f2) {
    }
}

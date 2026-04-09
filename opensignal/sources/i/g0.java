package i;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import coil.memory.MemoryCache$Key;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.opensignal.sdk.data.traceroute.TracerouteListener;
import com.staircase3.opensignal.activities.SpeedTestActivity;
import com.staircase3.opensignal.goldstar.videotest.result.VideoResultActivity;
import h7.r1;
import io.sentry.android.core.u0;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.x3;
import io.sentry.x5;
import io.sentry.y3;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import ni.v0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.p2;
import p.u1;

/* loaded from: classes.dex */
public final class g0 implements v3.m, y3, io.sentry.android.replay.util.g, j5.h, js.o, TracerouteListener, om.e, o9.b, u1, o.k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11051a;

    public /* synthetic */ g0(Object obj) {
        this.f11051a = obj;
    }

    public static boolean D(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static l8.q F(g8.j jVar, l8.j jVar2, MemoryCache$Key memoryCache$Key, j8.a aVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(jVar2.f14922a.getResources(), aVar.f13412a);
        c8.h hVar = c8.h.MEMORY_CACHE;
        Map map = aVar.f13413b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z10 = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = q8.i.f20736a;
        if (jVar != null && jVar.f9407g) {
            z10 = true;
        }
        return new l8.q(bitmapDrawable, jVar2, hVar, memoryCache$Key, str, zBooleanValue, z10);
    }

    public static String N(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // o.k
    public void A(o.m mVar) {
        o.k kVar = ((ActionMenuView) this.f11051a).R;
        if (kVar != null) {
            kVar.A(mVar);
        }
    }

    public String B(String str) {
        Bundle bundle = (Bundle) this.f11051a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public Boolean C(String str) {
        x5 x5Var = (x5) this.f11051a;
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = x5Var.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = x5Var.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public MemoryCache$Key E(l8.j jVar, Object obj, l8.n nVar, a8.b bVar) {
        String strA;
        Map linkedHashMap;
        jVar.getClass();
        List list = jVar.f14927f;
        List list2 = ((a8.l) this.f11051a).k.f188c;
        int size = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strA = null;
                break;
            }
            lq.l lVar = (lq.l) list2.get(i10);
            h8.b bVar2 = (h8.b) lVar.f15571a;
            if (((Class) lVar.f15572d).isAssignableFrom(obj.getClass())) {
                br.l.c(bVar2, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strA = bVar2.a(obj, nVar);
                if (strA != null) {
                    break;
                }
            }
            i10++;
        }
        if (strA == null) {
            return null;
        }
        Map map = jVar.f14943x.f14962a;
        boolean zIsEmpty = map.isEmpty();
        mq.x xVar = mq.x.f16946a;
        if (zIsEmpty) {
            linkedHashMap = xVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new MemoryCache$Key(strA, xVar);
        }
        LinkedHashMap linkedHashMapY = mq.b0.Y(linkedHashMap);
        if (!list.isEmpty()) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                linkedHashMapY.put(h0.b.h(i11, "coil#transformation_"), ((o8.a) list.get(i11)).f19165a);
            }
            linkedHashMapY.put("coil#transformation_size", nVar.f14951d.toString());
        }
        return new MemoryCache$Key(strA, linkedHashMapY);
    }

    public void G(Exception exc) {
        ch.n.b("PingReceiverListener", "onPingError() called with: exception = [" + exc + "]");
        ((mh.l) this.f11051a).f16768r.r(exc, null);
    }

    public void I(mh.c cVar) {
        ch.n.b("PingReceiverListener", "<-- Received payload: " + cVar);
        ((mh.l) this.f11051a).f16755c.g(cVar);
    }

    public Bundle J() {
        Bundle bundle = (Bundle) this.f11051a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // js.o
    public js.o K(qs.b bVar, qs.g gVar) {
        return null;
    }

    public void L(String str, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        oe.w wVar = (oe.w) this.f11051a;
        Collection collection = (Collection) wVar.get(str);
        if (collection != null) {
            for (Object obj : listAsList) {
                oe.s.b(str, obj);
                collection.add(obj);
            }
            return;
        }
        Iterator it = listAsList.iterator();
        if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                Object next = it.next();
                oe.s.b(str, next);
                arrayList.add(next);
            }
            wVar.put(str, arrayList);
        }
    }

    @Override // js.o
    public js.p P(qs.g gVar) {
        String strB = gVar.b();
        if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
            return new ks.f(this, 0);
        }
        if ("strings".equals(strB)) {
            return new ks.f(this, 1);
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.g
    public int a(int i10) {
        return ((Layout) this.f11051a).getLineTop(i10);
    }

    @Override // p.u1
    public void c(o.m mVar, MenuItem menuItem) {
        ((o.g) this.f11051a).f18597y.removeCallbacksAndMessages(mVar);
    }

    @Override // v3.m
    public boolean d(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f11051a;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        boolean z10 = view.getLayoutDirection() == 1;
        int i10 = swipeDismissBehavior.f5504e;
        int width = (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = u3.i0.f23177a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        a2.g gVar = swipeDismissBehavior.f5501b;
        if (gVar != null) {
            gVar.i(view);
        }
        return true;
    }

    @Override // io.sentry.android.replay.util.g
    public float e(int i10, int i11) {
        return ((Layout) this.f11051a).getPrimaryHorizontal(i11);
    }

    @Override // io.sentry.android.replay.util.g
    public int f(int i10) {
        return ((Layout) this.f11051a).getLineBottom(i10);
    }

    @Override // io.sentry.android.replay.util.g
    public int g(int i10) {
        return ((Layout) this.f11051a).getLineStart(i10);
    }

    @Override // kq.a
    public Object get() {
        return new io.sentry.k((Context) ((a2.a) this.f11051a).f28a, new et.d(), new ee.f(27), 17);
    }

    @Override // io.sentry.android.replay.util.g
    public int h() {
        return ((Layout) this.f11051a).getLineCount();
    }

    @Override // p.u1
    public void i(o.m mVar, o.o oVar) {
        o.g gVar = (o.g) this.f11051a;
        Handler handler = gVar.f18597y;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.D;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (mVar == ((o.f) arrayList.get(i10)).f18591b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new o.e(this, i11 < arrayList.size() ? (o.f) arrayList.get(i11) : null, oVar, mVar, 0), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // io.sentry.android.replay.util.g
    public Integer j() {
        int i10;
        Layout layout = (Layout) this.f11051a;
        if (!(layout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = layout.getText();
        br.l.c(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
        br.l.b(foregroundColorSpanArr);
        int i11 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = layout.getText();
            br.l.c(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = layout.getText();
            br.l.c(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i10 = spanEnd - spanStart) > i11) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i11 = i10;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(numValueOf.intValue() | (-16777216));
        }
        return null;
    }

    @Override // io.sentry.y3
    public x3 k(b1 b1Var, x5 x5Var) {
        ir.f0.T(b1Var, "Scopes are required");
        ir.f0.T(x5Var, "SentryOptions is required");
        String cacheDirPath = ((io.sentry.android.core.m) this.f11051a).f11702a.getCacheDirPath();
        if (cacheDirPath == null || !y3.H(x5Var.getLogger(), cacheDirPath)) {
            x5Var.getLogger().m(b5.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return null;
        }
        return new x3(x5Var.getLogger(), cacheDirPath, new io.sentry.b0(b1Var, x5Var.getSerializer(), x5Var.getLogger(), x5Var.getFlushTimeoutMillis(), x5Var.getMaxQueueSize()), new File(cacheDirPath));
    }

    @Override // js.o
    public void l(qs.g gVar, Object obj) {
        ks.g gVar2 = (ks.g) this.f11051a;
        String strB = gVar.b();
        if ("version".equals(strB)) {
            if (obj instanceof int[]) {
                gVar2.f14500a = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strB)) {
            gVar2.f14501d = obj instanceof String ? (String) obj : null;
        }
    }

    @Override // io.sentry.android.replay.util.g
    public int m(int i10) {
        return ((Layout) this.f11051a).getLineVisibleEnd(i10);
    }

    @Override // o.k
    public boolean n(o.m mVar, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        p.l lVar = ((ActionMenuView) this.f11051a).W;
        if (lVar != null) {
            Toolbar toolbar = ((al.f) lVar).f844a;
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1018f0.f20918d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    p2 p2Var = toolbar.f1021h0;
                    zOnMenuItemSelected = p2Var != null ? ((h0) ((r1) p2Var).f10199d).f11055d.onMenuItemSelected(0, menuItem) : false;
                } else if (((o4.d0) it.next()).f18787a.p(menuItem)) {
                    zOnMenuItemSelected = true;
                    break;
                }
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.android.replay.util.g
    public int o(int i10) {
        return ((Layout) this.f11051a).getEllipsisCount(i10);
    }

    @Override // com.opensignal.sdk.data.traceroute.TracerouteListener
    public void onEndpoint(String str) {
        br.l.e(str, "endpoint");
        StringBuilder sb2 = new StringBuilder();
        mi.v vVar = (mi.v) this.f11051a;
        sb2.append(vVar.u());
        sb2.append(" onEndpoint() called with: endpoint = ");
        sb2.append(str);
        ch.n.b("TracerouteJob", sb2.toString());
        vVar.X = str;
    }

    @Override // com.opensignal.sdk.data.traceroute.TracerouteListener
    public void onEndpointResolved(String str) {
        br.l.e(str, "ipAddress");
        StringBuilder sb2 = new StringBuilder();
        mi.v vVar = (mi.v) this.f11051a;
        sb2.append(vVar.u());
        sb2.append(" onEndpointResolved() called with: ipAddress = ");
        sb2.append(str);
        ch.n.b("TracerouteJob", sb2.toString());
        vVar.Y = str;
    }

    @Override // com.opensignal.sdk.data.traceroute.TracerouteListener
    public void onError(String str) {
        br.l.e(str, "logMessage");
        StringBuilder sb2 = new StringBuilder();
        mi.v vVar = (mi.v) this.f11051a;
        sb2.append(vVar.u());
        sb2.append(" onError() called with: logMessage = ");
        sb2.append(str);
        ch.n.b("TracerouteJob", sb2.toString());
        vVar.w("ERROR", str);
    }

    @Override // com.opensignal.sdk.data.traceroute.TracerouteListener
    public void onFinish(String str) {
        br.l.e(str, "logMessage");
        StringBuilder sb2 = new StringBuilder();
        mi.v vVar = (mi.v) this.f11051a;
        sb2.append(vVar.u());
        sb2.append(" onFinish() called with: logMessage = ");
        sb2.append(str);
        ch.n.b("TracerouteJob", sb2.toString());
        vVar.w("STOP", str);
    }

    @Override // com.opensignal.sdk.data.traceroute.TracerouteListener
    public void onProgress(String str) {
        br.l.e(str, "logMessage");
        StringBuilder sb2 = new StringBuilder();
        mi.v vVar = (mi.v) this.f11051a;
        sb2.append(vVar.u());
        sb2.append(" onProgress() called with: logMessage = ");
        sb2.append(str);
        ch.n.b("TracerouteJob", sb2.toString());
        vVar.w("PROGRESS", str);
    }

    @Override // com.opensignal.sdk.data.traceroute.TracerouteListener
    public void onResult(String str) {
        br.l.e(str, "jsonStringResult");
        StringBuilder sb2 = new StringBuilder();
        mi.v vVar = (mi.v) this.f11051a;
        sb2.append(vVar.u());
        sb2.append(" onResult() called with: string = ");
        sb2.append(str);
        ch.n.b("TracerouteJob", sb2.toString());
        try {
            JSONObject jSONObject = new JSONObject(str);
            vVar.v(jSONObject);
            JSONArray jSONArray = vVar.W;
            br.l.e(jSONArray, "<this>");
            jSONArray.put(jSONObject);
        } catch (JSONException e4) {
            vVar.S.getClass();
            cj.a.G(e4);
            ch.n.c("TracerouteJob", vVar.u() + " onResult() exception = " + e4);
        }
        String str2 = vVar.X;
        String str3 = vVar.Y;
        long jG = vVar.g();
        long j = vVar.f23926y;
        String str4 = vVar.f23922d;
        String str5 = vVar.T;
        String str6 = vVar.D;
        vVar.P.getClass();
        v0 v0Var = new v0(jG, j, str4, str5, str6, System.currentTimeMillis(), str, str2, str3);
        hk.h hVar = vVar.E;
        if (hVar != null) {
            hVar.f(vVar.T, v0Var);
        }
    }

    @Override // com.opensignal.sdk.data.traceroute.TracerouteListener
    public void onStart(String str) {
        br.l.e(str, "logMessage");
        StringBuilder sb2 = new StringBuilder();
        mi.v vVar = (mi.v) this.f11051a;
        sb2.append(vVar.u());
        sb2.append(" onStart() called with: logMessage = ");
        sb2.append(str);
        ch.n.b("TracerouteJob", sb2.toString());
        vVar.w("START", str);
    }

    @Override // om.e
    public void p() {
        int i10 = SpeedTestActivity.W;
        VideoResultActivity videoResultActivity = (VideoResultActivity) this.f11051a;
        Intent intent = new Intent(videoResultActivity, (Class<?>) SpeedTestActivity.class);
        intent.addFlags(1073741824);
        videoResultActivity.startActivity(intent);
        videoResultActivity.finish();
    }

    public Binder r(mk.c cVar) {
        ch.n.b("BinderFactory", "binderType: " + cVar);
        int i10 = mk.a.f16858a[cVar.ordinal()];
        if (i10 == 1) {
            return new mk.g((df.c) this.f11051a);
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return null;
            }
            throw new bf.n();
        }
        mk.d dVar = new mk.d();
        dVar.attachInterface(dVar, "com.opensignal.sdk.data.task.GetTasksService");
        return dVar;
    }

    public boolean s(String str) {
        String strB = B(str);
        return "1".equals(strB) || Boolean.parseBoolean(strB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
    
        if (r7 != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j8.a t(l8.j r18, coil.memory.MemoryCache$Key r19, m8.h r20, m8.g r21) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g0.t(l8.j, coil.memory.MemoryCache$Key, m8.h, m8.g):j8.a");
    }

    public List u() {
        ArrayList arrayListZ = z(new Exception().getStackTrace(), false);
        if (arrayListZ == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(arrayListZ.size());
        Iterator it = arrayListZ.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (Boolean.TRUE.equals(((io.sentry.protocol.x) next).G)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayListZ.size());
        Iterator it2 = arrayListZ.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            String str = ((io.sentry.protocol.x) next2).f12656y;
            if (str == null || (!str.startsWith("sun.") && !str.startsWith("java.") && !str.startsWith("android.") && !str.startsWith("com.android."))) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    public Integer v(String str) {
        String strB = B(str);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strB));
        } catch (NumberFormatException unused) {
            io.sentry.android.core.e0.p("NotificationParams", "Couldn't parse value of " + N(str) + "(" + strB + ") into an int");
            return null;
        }
    }

    public JSONArray w(String str) {
        String strB = B(str);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            return new JSONArray(strB);
        } catch (JSONException unused) {
            io.sentry.android.core.e0.p("NotificationParams", "Malformed JSON for key " + N(str) + ": " + strB + ", falling back to default");
            return null;
        }
    }

    public ActivityManager.MemoryInfo x() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f11051a).getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    public String y(Resources resources, String str, String str2) {
        String[] strArr;
        String strB = B(str2);
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        String strB2 = B(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strB2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strB2, "string", str);
        if (identifier == 0) {
            io.sentry.android.core.e0.p("NotificationParams", N(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayW = w(str2.concat("_loc_args"));
        if (jSONArrayW == null) {
            strArr = null;
        } else {
            int length = jSONArrayW.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = jSONArrayW.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e4) {
            io.sentry.android.core.e0.q("NotificationParams", "Missing format argument for " + N(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e4);
            return null;
        }
    }

    public ArrayList z(StackTraceElement[] stackTraceElementArr, boolean z10) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z10 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.x xVar = new io.sentry.protocol.x();
                    xVar.G = C(className);
                    xVar.f12656y = className;
                    xVar.f12655x = stackTraceElement.getMethodName();
                    xVar.f12654r = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        xVar.B = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    xVar.I = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(xVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public /* synthetic */ g0(Object obj, Object obj2) {
        this.f11051a = obj;
    }

    public g0(int i10) {
        Object fVar;
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f11051a = new io.sentry.transport.q();
                break;
            case 9:
                this.f11051a = new SparseArray();
                break;
            case 12:
                if (Build.VERSION.SDK_INT >= 28) {
                    fVar = new df.c();
                } else {
                    fVar = new ee.f(12);
                }
                this.f11051a = fVar;
                break;
            case 25:
                this.f11051a = oe.w.a();
                break;
            case 28:
                br.l.e(TimeUnit.MINUTES, "timeUnit");
                this.f11051a = new su.l(ru.c.f21810h);
                break;
            default:
                this.f11051a = new io.sentry.util.e(new u0(2));
                break;
        }
    }

    @Override // js.o
    public void b() {
    }

    public g0(Bundle bundle) {
        this.f11051a = new Bundle(bundle);
    }

    public g0(TextView textView) {
        this.f11051a = new l4.g(textView);
    }

    @Override // js.o
    public void M(qs.g gVar, vs.f fVar) {
    }

    @Override // js.o
    public void q(qs.g gVar, qs.b bVar, qs.g gVar2) {
    }
}

package pk;

import a4.f;
import a6.e;
import android.app.KeyguardManager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import c4.c;
import com.google.android.gms.internal.ads.j31;
import com.google.android.gms.internal.ads.k31;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.rg0;
import com.google.android.gms.internal.ads.rk;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.y21;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.play_billing.j0;
import com.google.android.gms.internal.play_billing.k0;
import com.google.android.gms.internal.play_billing.t0;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import nk.k;
import org.json.JSONException;
import org.json.JSONObject;
import pf.w;
import rl.b;
import rl.e0;
import rl.g;
import rl.l;
import ua.j;
import va.r;
import va.s;
import xk.h;
import ya.f0;
import za.d;
import za.i;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f32022a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f32023b = false;

    /* renamed from: c, reason: collision with root package name */
    public static int f32024c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static String f32025d = "";

    public static int A(int i4) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i4) {
                return i11;
            }
        }
        return 1;
    }

    public static boolean C(int i4) {
        pk pkVar = sk.f16136g4;
        s sVar = s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            return ((Boolean) sVar.f36166c.a(sk.f16151h4)).booleanValue() || i4 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141 A[Catch: JSONException -> 0x0131, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0131, blocks: (B:31:0x0113, B:40:0x012d, B:48:0x0141, B:47:0x013d), top: B:65:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject E(android.content.Context r17, android.view.View r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.a.E(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject F(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                pk pkVar = sk.Y8;
                s sVar = s.f36163e;
                rk rkVar = sVar.f36166c;
                rk rkVar2 = sVar.f36166c;
                if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
                    if (((Boolean) rkVar2.a(sk.Z8)).booleanValue()) {
                        f0 f0Var = j.C.f35261c;
                        jSONObject.put("contained_in_scroll_view", f0.b(view) != 0);
                    }
                    if (((Boolean) rkVar2.a(sk.f16043a9)).booleanValue()) {
                        f0 f0Var2 = j.C.f35261c;
                        jSONObject.put("scroll_view_type", f0.b(view));
                        return jSONObject;
                    }
                } else {
                    f0 f0Var3 = j.C.f35261c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject H(Context context, View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                f0 f0Var = j.C.f35261c;
                jSONObject.put("can_show_on_lock_screen", f0.M(view));
                boolean z3 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z3 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z3);
                return jSONObject;
            } catch (JSONException unused) {
                i.h("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject J(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) throws JSONException {
        int[] iArr;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i4 = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i4];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            r rVar = r.g;
                            jSONObject4.put("width", rVar.f36157a.h(measuredWidth, context));
                            jSONObject4.put("height", rVar.f36157a.h(view2.getMeasuredHeight(), context));
                            jSONObject4.put("x", rVar.f36157a.h(iArr3[0] - iArr[0], context));
                            jSONObject4.put("y", rVar.f36157a.h(iArr3[1] - iArr[1], context));
                            jSONObject4.put("relative_to", "ad_view");
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = R(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", rVar.f36157a.h(iArr3[0] - iArr[0], context));
                                jSONObject.put("y", rVar.f36157a.h(iArr3[1] - iArr[1], context));
                                jSONObject.put("relative_to", "ad_view");
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                pk pkVar = sk.f16060b9;
                                s sVar = s.f36163e;
                                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) sVar.f36166c.a(sk.c9)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", S(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", S(layoutParams.height) - 1);
                                }
                                if (((Boolean) sVar.f36166c.a(sk.f16093d9)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) s.f36163e.f36166c.a(sk.f16108e9)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused) {
                            i.h("Unable to get asset views information");
                            it = it2;
                            iArr2 = iArr;
                            i4 = 2;
                        }
                    } catch (JSONException unused2) {
                        iArr = iArr2;
                    }
                    it = it2;
                    iArr2 = iArr;
                    i4 = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject L(String str, Context context, Point point, Point point2) throws JSONException {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i4 = point2.x;
                    r rVar = r.g;
                    jSONObject3.put("x", rVar.f36157a.h(i4, context));
                    jSONObject3.put("y", rVar.f36157a.h(point2.y, context));
                    jSONObject3.put("start_x", rVar.f36157a.h(point.x, context));
                    jSONObject3.put("start_y", rVar.f36157a.h(point.y, context));
                    jSONObject = jSONObject3;
                } catch (JSONException e2) {
                    i.f("Error occurred while putting signals into JSON object.", e2);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e10) {
                e = e10;
                jSONObject = jSONObject2;
                i.f("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static boolean O(Context context, wp0 wp0Var) {
        j31 j31Var;
        if (!wp0Var.N) {
            return false;
        }
        pk pkVar = sk.f16125f9;
        s sVar = s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            return ((Boolean) rkVar2.a(sk.f16170i9)).booleanValue();
        }
        String str = (String) rkVar2.a(sk.f16140g9);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        rg0 rg0VarK = rg0.k(new y21(';'));
        Iterator itM = ((k31) rg0VarK.f15651b).m(rg0VarK, str);
        do {
            j31Var = (j31) itM;
            if (!j31Var.hasNext()) {
                return false;
            }
        } while (!((String) j31Var.next()).equals(packageName));
        return true;
    }

    public static JSONObject P(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        f0 f0Var = j.C.f35261c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i4 = displayMetrics.widthPixels;
            r rVar = r.g;
            jSONObject.put("width", rVar.f36157a.h(i4, context));
            jSONObject.put("height", rVar.f36157a.h(displayMetrics.heightPixels, context));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams Q() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) s.f36163e.f36166c.a(sk.h9)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject R(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i4 = rect.right - rect.left;
        r rVar = r.g;
        jSONObject.put("width", rVar.f36157a.h(i4, context));
        int i10 = rect.bottom - rect.top;
        d dVar = rVar.f36157a;
        jSONObject.put("height", dVar.h(i10, context));
        jSONObject.put("x", dVar.h(rect.left, context));
        jSONObject.put("y", dVar.h(rect.top, context));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int S(int i4) {
        if (i4 != -2) {
            return i4 != -1 ? 2 : 3;
        }
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.util.List r6, p4.j r7, ek.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p4.e
            if (r0 == 0) goto L13
            r0 = r8
            p4.e r0 = (p4.e) r0
            int r1 = r0.f31189d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31189d = r1
            goto L18
        L13:
            p4.e r0 = new p4.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31188c
            int r1 = r0.f31189d
            r2 = 2
            r3 = 1
            dk.a r4 = dk.a.f22275a
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.util.Iterator r6 = r0.f31187b
            java.io.Serializable r7 = r0.f31186a
            nk.u r7 = (nk.u) r7
            ci.b.D(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f31186a
            java.util.List r6 = (java.util.List) r6
            ci.b.D(r8)
            goto L5c
        L42:
            ci.b.D(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            a0.g0 r1 = new a0.g0
            r5 = 0
            r1.<init>(r6, r8, r5)
            r0.f31186a = r8
            r0.f31189d = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r4) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            nk.u r7 = new nk.u
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            mk.c r8 = (mk.c) r8
            r0.f31186a = r7     // Catch: java.lang.Throwable -> L30
            r0.f31187b = r6     // Catch: java.lang.Throwable -> L30
            r0.f31189d = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r4) goto L65
            goto L93
        L7e:
            java.lang.Object r1 = r7.f29986a
            if (r1 != 0) goto L85
            r7.f29986a = r8
            goto L65
        L85:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            wd.b.a(r1, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f29986a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            yj.u r4 = yj.u.f37649a
        L93:
            return r4
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.a.a(java.util.List, p4.j, ek.c):java.lang.Object");
    }

    public static final Object b(Task task, w wVar) throws Exception {
        if (!task.isComplete()) {
            h hVar = new h(1, a.a.r(wVar));
            hVar.s();
            task.addOnCompleteListener(hl.a.f25160a, new p6.i(hVar));
            return hVar.r();
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static void c(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int f(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static l g(SSLSession sSLSession) throws IOException {
        Object objK;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        g gVarB = g.f33066b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        e0.f33058b.getClass();
        e0 e0VarC = b.c(protocol);
        try {
            objK = sl.h.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objK = zj.s.f38317a;
        }
        return new l(e0VarC, gVarB, sl.h.k(sSLSession.getLocalCertificates()), new e(23, objK));
    }

    public static final Class h(tk.b bVar) {
        k.e(bVar, "<this>");
        Class clsA = ((nk.d) bVar).a();
        k.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class i(tk.b bVar) {
        k.e(bVar, "<this>");
        Class clsA = ((nk.d) bVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static c j(AppCompatTextView appCompatTextView) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new c(f.q(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i4 < 28 || (appCompatTextView.getInputType() & 15) != 3) {
                boolean z3 = appCompatTextView.getLayoutDirection() == 1;
                switch (appCompatTextView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(f.g(j4.h(appCompatTextView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static f6.c k(o7.c cVar, SQLiteDatabase sQLiteDatabase) {
        k.e(cVar, "refHolder");
        f6.c cVar2 = (f6.c) cVar.f30419b;
        if (cVar2 != null && cVar2.f23663a.equals(sQLiteDatabase)) {
            return cVar2;
        }
        f6.c cVar3 = new f6.c(sQLiteDatabase);
        cVar.f30419b = cVar3;
        return cVar3;
    }

    public static String l(String str) {
        return TextUtils.isEmpty(f32025d) ? str : o(a0.g.p(new StringBuilder("["), f32025d, "]-[", str, "]"));
    }

    public static void m(String str, String str2) {
        if (f32023b && str2 != null && f32024c <= 6) {
            Log.e(l(str), str2);
        }
    }

    public static void n(String str, String str2, Throwable th2) {
        if (f32023b && f32024c <= 6) {
            Log.e(l(str), str2, th2);
        }
    }

    public static String o(Object... objArr) {
        if (objArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb2.append(obj.toString());
            } else {
                sb2.append(" null ");
            }
            sb2.append(" ");
        }
        return sb2.toString();
    }

    public static void p(String str) {
        if (f32023b && str != null && f32024c <= 3) {
            Log.d(l("CSJ_VIDEO_MEDIA"), str);
        }
    }

    public static void q(String str, Throwable th2) {
        if (f32023b && f32024c <= 3) {
            Log.d(l("CSJ_VIDEO_MEDIA"), str, th2);
        }
    }

    public static void r(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "fail");
        bundle.putString("errMsg", str2);
        cg.a.f2848b.f(bundle, str);
    }

    public static int s(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static void t(TextView textView, int i4) {
        d(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            f.B(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void u(TextView textView, int i4) {
        d(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i10);
        }
    }

    public static void v(TextView textView, int i4) {
        d(i4);
        if (i4 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public static ActionMode.Callback w(ActionMode.Callback callback) {
        return (!(callback instanceof j4.i) || Build.VERSION.SDK_INT < 26) ? callback : ((j4.i) callback).f27390a;
    }

    public static void x(String str, String str2) {
        if (f32023b && str2 != null && f32024c <= 4) {
            Log.i(l(str), str2);
        }
    }

    public static void y(String str, Object... objArr) {
        if (f32023b && f32024c <= 4) {
            Log.v(l(str), o(objArr));
        }
    }

    public static ActionMode.Callback z(ActionMode.Callback callback, TextView textView) {
        int i4 = Build.VERSION.SDK_INT;
        return (i4 < 26 || i4 > 27 || (callback instanceof j4.i) || callback == null) ? callback : new j4.i(callback, textView);
    }

    public abstract com.google.android.gms.internal.play_billing.e0 B(t0 t0Var);

    public abstract j0 D(t0 t0Var);

    public abstract void G(j0 j0Var, j0 j0Var2);

    public abstract void I(j0 j0Var, Thread thread);

    public abstract boolean K(t0 t0Var, com.google.android.gms.internal.play_billing.e0 e0Var, com.google.android.gms.internal.play_billing.e0 e0Var2);

    public abstract boolean M(k0 k0Var, Object obj, Object obj2);

    public abstract boolean N(k0 k0Var, j0 j0Var, j0 j0Var2);
}

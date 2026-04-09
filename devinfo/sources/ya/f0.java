package ya;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.google.android.gms.internal.ads.j31;
import com.google.android.gms.internal.ads.k31;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.qz;
import com.google.android.gms.internal.ads.rg0;
import com.google.android.gms.internal.ads.rk;
import com.google.android.gms.internal.ads.rt;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.vu0;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.y21;
import com.google.android.gms.internal.ads.yc0;
import com.google.android.gms.internal.ads.yp0;
import ec.p1;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f37440l = new b0(Looper.getMainLooper(), 1);
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f37447h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f37441a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f37442b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f37443c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f37444d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public boolean f37445e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f37446f = new Object();

    /* renamed from: i, reason: collision with root package name */
    public boolean f37448i = false;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f37449k = Executors.newSingleThreadExecutor();

    public static final void A(u.l lVar, Bundle bundle) {
        Intent intent = (Intent) lVar.f34714c;
        if (bundle.isEmpty()) {
            return;
        }
        int i4 = bundle.getInt("h", -1);
        if (i4 >= 0) {
            if (i4 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i4);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
        }
        int i10 = bundle.getInt("cbp", -1);
        if (i10 < 0 || i10 > 2) {
            return;
        }
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
    }

    public static final String B(Context context, String str) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        if (str == null) {
            return P();
        }
        String strP = null;
        try {
            if (gb.a.f24624c == null) {
                gb.a.f24624c = new gb.a(2);
            }
            gb.a aVar = gb.a.f24624c;
            if (TextUtils.isEmpty(aVar.f24626b)) {
                AtomicBoolean atomicBoolean = nb.i.f29900a;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                aVar.f24626b = (String) t6.i0.y(context, new p1(5, context, (Object) contextCreatePackageContext));
            }
            strP = aVar.f24626b;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strP)) {
            strP = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strP)) {
            strP = P();
        }
        String strM = r5.c.m(new StringBuilder(String.valueOf(strP).length() + 10 + str.length()), strP, " (Mobile; ", str);
        try {
            if (ub.b.a(context).f()) {
                StringBuilder sb2 = new StringBuilder(strM.length() + 4);
                sb2.append(strM);
                sb2.append(";aia");
                strM = sb2.toString();
            }
        } catch (Exception e2) {
            ua.j.C.f35265h.f("AdUtil.getUserAgent", e2);
        }
        return strM.concat(")");
    }

    public static ArrayList I() {
        pk pkVar = sk.f16033a;
        ArrayList arrayListB = va.s.f36163e.f36164a.B();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListB.get(i4);
            i4++;
            String str = (String) obj;
            rg0 rg0VarK = rg0.k(new y21(','));
            str.getClass();
            Iterator itM = ((k31) rg0VarK.f15651b).m(rg0VarK, str);
            while (true) {
                j31 j31Var = (j31) itM;
                if (j31Var.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) j31Var.next()));
                    } catch (NumberFormatException unused) {
                        a0.m("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static String J(String str, String str2) {
        char[] charArray = str.toCharArray();
        for (int i4 = 0; i4 < charArray.length; i4++) {
            charArray[i4] = (char) (charArray[i4] ^ str2.charAt(i4 % str2.length()));
        }
        return new String(charArray);
    }

    public static n K(Context context) {
        n nVar = new n(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33) {
            if (i4 >= 24) {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                return new n(locale.getLanguage(), locale.getCountry());
            }
            Locale locale2 = context.getResources().getConfiguration().locale;
            return new n(locale2.getLanguage(), locale2.getCountry());
        }
        LocaleManager localeManager = (LocaleManager) context.getSystemService(LocaleManager.class);
        if (localeManager == null || localeManager.getSystemLocales().isEmpty()) {
            return nVar;
        }
        Locale locale3 = localeManager.getSystemLocales().get(0);
        return new n(locale3.getLanguage(), locale3.getCountry());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean M(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.f0.M(android.view.View):boolean");
    }

    public static final void N(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String O(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return y(z(context));
    }

    public static final String P() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String Q() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : r5.c.m(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    public static final HashMap R(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i4);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e2) {
            ua.j.C.f35265h.f("AdUtil.getMapOfFileNamesToKeysFromJsonString", e2);
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long a(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final int b(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof e4.y) {
                return 4;
            }
        }
        return 0;
    }

    public static final t c(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                za.i.e("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof t ? (t) iInterfaceQueryLocalInterface : new s(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 1);
        } catch (Exception e2) {
            ua.j.C.f35265h.f("Failed to instantiate WorkManagerUtil", e2);
            return null;
        }
    }

    public static final boolean d(Context context, String str) {
        int i4 = qu.f15446a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return ((Context) ub.b.a(context).f27058a).getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean e(Context context) {
        try {
            if (tb.b.f34535h == null) {
                tb.b.f34535h = Boolean.valueOf(tb.b.h() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return tb.b.f34535h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(java.lang.String r6) {
        /*
            boolean r0 = za.f.c()
            r1 = 0
            if (r0 != 0) goto L8
            goto L69
        L8:
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.W5
            va.s r2 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r3 = r2.f36166c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1b
            goto L69
        L1b:
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.Y5
            com.google.android.gms.internal.ads.rk r2 = r2.f36166c
            java.lang.Object r0 = r2.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r0.isEmpty()
            java.lang.String r3 = ";"
            if (r2 != 0) goto L41
            java.lang.String[] r0 = r0.split(r3)
            int r2 = r0.length
            r4 = r1
        L33:
            if (r4 >= r2) goto L41
            r5 = r0[r4]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3e
            goto L69
        L3e:
            int r4 = r4 + 1
            goto L33
        L41:
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.X5
            va.s r2 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r2 = r2.f36166c
            java.lang.Object r0 = r2.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L54
            goto L64
        L54:
            java.lang.String[] r0 = r0.split(r3)
            int r2 = r0.length
            r3 = r1
        L5a:
            if (r3 >= r2) goto L69
            r4 = r0[r3]
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L66
        L64:
            r6 = 1
            return r6
        L66:
            int r3 = r3 + 1
            goto L5a
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.f0.f(java.lang.String):boolean");
    }

    public static final boolean g(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            za.i.f("Error loading class.", th2);
            ua.j.C.f35265h.f("AdUtil.isLiteSdk", th2);
            return false;
        }
    }

    public static final boolean h(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean i(Context context) {
        try {
            Bundle bundleZ = z(context);
            String string = bundleZ.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(y(bundleZ))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean j(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void k(int i4, View view) {
        String str;
        int i10;
        int iHeight;
        int iWidth;
        String str2;
        String str3;
        String strA;
        wp0 wp0VarS;
        yp0 yp0VarN0;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof yc0) {
                childAt = ((yc0) childAt).getChildAt(0);
            }
            if (childAt instanceof eb.e) {
                str = "NATIVE";
                i10 = 1;
            } else {
                str = "UNKNOWN";
                i10 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            f0 f0Var = ua.j.C.f35261c;
            long jA = a(childAt);
            childAt.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            String str4 = "none";
            if (!(childAt instanceof qz) || (yp0VarN0 = ((qz) childAt).n0()) == null) {
                str2 = str;
                str3 = "none";
            } else {
                str3 = yp0VarN0.f18820b;
                int iHashCode = childAt.hashCode();
                str2 = str;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(iHashCode).length());
                sb2.append(str3);
                sb2.append(":");
                sb2.append(iHashCode);
                childAt.setContentDescription(sb2.toString());
            }
            if (!(childAt instanceof qz) || (wp0VarS = ((qz) childAt).s()) == null) {
                strA = str2;
            } else {
                strA = wp0.a(wp0VarS.f18074b);
                i10 = wp0VarS.f18080e;
                str4 = wp0VarS.E;
            }
            Locale locale = Locale.US;
            za.i.g("<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str4 + ", gwsQueryId=" + str3 + ", format=" + strA + ", impType=" + i10 + ", class=" + childAt.getClass().getName() + ", x=" + i11 + ", y=" + i12 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jA + ", state=" + Integer.toString(i4, 2) + ">");
        } catch (Exception e2) {
            za.i.f("Failure getting view location.", e2);
        }
    }

    public static final AlertDialog.Builder l(Context context) {
        ja.c cVar = ua.j.C.f35264f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void m(Context context, wp0 wp0Var, qd0 qd0Var) {
        rt rtVarA = qd0Var.a();
        rtVarA.u("action", "can_show");
        ua.j jVar = ua.j.C;
        f0 f0Var = jVar.f35261c;
        rtVarA.u("foreground", true != h(context) ? "1" : "0");
        rtVarA.u("fg_al", true == jVar.g.l() ? "1" : "0");
        if (wp0Var != null) {
            List list = wp0Var.f18108t;
            if (!list.isEmpty()) {
                rtVarA.u("ancn", (String) list.get(0));
            }
            rtVarA.u("ad_format", wp0.a(wp0Var.f18074b));
        }
        rtVarA.v();
    }

    public static final boolean n(wp0 wp0Var) {
        return ((Boolean) va.s.f36163e.f36166c.a(sk.Ne)).booleanValue() && wp0Var != null && wp0Var.f18080e == 4;
    }

    public static final int o(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            za.i.h("Could not parse value:".concat(e2.toString()));
            return 0;
        }
    }

    public static final HashMap p(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16330t)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i4 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i4);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i4);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i4, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i4 = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] q(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] r(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        va.r rVar = va.r.g;
        return new int[]{rVar.f36157a.h(iArr[0], activity), rVar.f36157a.h(iArr[1], activity)};
    }

    public static final boolean s(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z3 = ua.j.C.f35261c.f37445e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || M(view);
        long jA = a(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z3)) {
            pk pkVar = sk.J1;
            va.s sVar = va.s.f36163e;
            rk rkVar = sVar.f36166c;
            rk rkVar2 = sVar.f36166c;
            if ((!((Boolean) rkVar.a(pkVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) rkVar2.a(sk.Qb)).booleanValue() || jA >= ((Integer) rkVar2.a(sk.Sb)).intValue())) {
                return true;
            }
        }
        return false;
    }

    public static int t(int i4) {
        if (i4 >= 5000) {
            return i4;
        }
        if (i4 <= 0) {
            return 60000;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 86);
        sb2.append("HTTP timeout too low: ");
        sb2.append(i4);
        sb2.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        za.i.h(sb2.toString());
        return 60000;
    }

    public static final void u(Context context, Intent intent) {
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16246nc)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (SecurityException e2) {
                za.i.i("", e2);
                ua.j.C.f35265h.f("AdUtil.startActivityWithUnknownContext", e2);
            }
        } catch (Throwable unused2) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final void v(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            N(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 26);
            sb2.append("Opening ");
            sb2.append(string);
            sb2.append(" in a new browser.");
            za.i.c(sb2.toString());
        } catch (ActivityNotFoundException e2) {
            za.i.f("No browser is found.", e2);
        }
    }

    public static final void w(Context context, Intent intent, qd0 qd0Var, String str) {
        pk pkVar = sk.f16328se;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (!((Boolean) rkVar.a(pkVar)).booleanValue() || !(context instanceof p00)) {
            u(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) rkVar2.a(sk.f16358ue))) {
                u(context, intent);
                return;
            }
            ((p00) context).a(intent);
            if (!((Boolean) rkVar2.a(sk.f16344te)).booleanValue() || qd0Var == null) {
                return;
            }
            rt rtVarA = qd0Var.a();
            rtVarA.u("action", "hila");
            if (str == null) {
                str = "";
            }
            rtVarA.u("gqi", str);
            rtVarA.x();
        } catch (ActivityNotFoundException e2) {
            e = e2;
            za.i.f("Error occurred while starting activity for result", e);
            ua.j.C.f35265h.f("AdUtil.startActivityForResult", e);
            u(context, intent);
        } catch (SecurityException e10) {
            e = e10;
            za.i.f("Error occurred while starting activity for result", e);
            ua.j.C.f35265h.f("AdUtil.startActivityForResult", e);
            u(context, intent);
        } catch (Exception e11) {
            za.i.f("Error occurred while starting activity for result", e11);
            ua.j.C.f35265h.f("AdUtil.startActivityForResult", e11);
            u(context, intent);
        }
    }

    public static boolean x(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String y(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static Bundle z(Context context) {
        try {
            return ub.b.a(context).d(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            a0.n("Error getting metadata", e2);
            return null;
        }
    }

    public final void C(Context context, String str, HttpURLConnection httpURLConnection, int i4) {
        int iT = t(i4);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iT).length() + 28);
        sb2.append("HTTP timeout: ");
        sb2.append(iT);
        sb2.append(" milliseconds.");
        za.i.g(sb2.toString());
        httpURLConnection.setConnectTimeout(iT);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iT);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", F(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void D(Context context) {
        if (this.f37448i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        sk.a(context);
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16230mc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new kf(17, this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new kf(17, this), intentFilter, 4);
        }
        this.f37448i = true;
    }

    public final void E(Context context) {
        if (this.j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        sk.a(context);
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16230mc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new vu0(4), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new vu0(4), intentFilter, 4);
        }
        this.j = true;
    }

    public final String F(Context context, String str) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16439zc)).booleanValue()) {
            if (this.f37447h != null) {
                return this.f37447h;
            }
            this.f37447h = B(context, str);
            return this.f37447h;
        }
        synchronized (this.f37446f) {
            try {
                String str2 = this.g;
                if (str2 != null) {
                    return str2;
                }
                String strB = B(context, str);
                this.g = strB;
                return strB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean G(String str) {
        return x(str, this.f37441a, (String) va.s.f36163e.f36166c.a(sk.D0));
    }

    public final boolean H(String str) {
        return x(str, this.f37442b, (String) va.s.f36163e.f36166c.a(sk.E0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (za.d.o() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int L(android.content.Context r12, android.net.Uri r13, android.os.Bundle r14) {
        /*
            r11 = this;
            if (r12 != 0) goto L9
            java.lang.String r12 = "Trying to open chrome custom tab on a null context"
            ya.a0.m(r12)
            r12 = 3
            return r12
        L9:
            boolean r0 = r12 instanceof android.app.Activity
            r1 = 268435456(0x10000000, float:2.524355E-29)
            java.lang.String r2 = "android.intent.action.VIEW"
            if (r0 != 0) goto L21
            android.content.Intent r14 = new android.content.Intent
            r14.<init>(r2)
            r14.setData(r13)
            r14.addFlags(r1)
            r12.startActivity(r14)
            r12 = 2
            return r12
        L21:
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16287q5
            va.s r3 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r4 = r3.f36166c
            com.google.android.gms.internal.ads.rk r3 = r3.f36166c
            java.lang.Object r0 = r4.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 5
            if (r0 == 0) goto L7e
            u.l r0 = new u.l
            ua.j r1 = ua.j.C
            com.google.android.gms.internal.ads.zk r1 = r1.f35270n
            u.p r2 = r1.f19098e
            if (r2 != 0) goto L4c
            com.google.android.gms.internal.ads.ex r2 = com.google.android.gms.internal.ads.fx.f11274a
            com.google.android.gms.internal.ads.s r5 = new com.google.android.gms.internal.ads.s
            r6 = 12
            r5.<init>(r6, r1)
            r2.execute(r5)
        L4c:
            u.p r1 = r1.f19098e
            r0.<init>(r1)
            A(r0, r14)
            u.m r14 = r0.a()
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.D5
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L71
            va.r r0 = va.r.g
            za.d r0 = r0.f36157a
            boolean r0 = za.d.o()
            if (r0 == 0) goto L71
            goto Lb4
        L71:
            android.content.Intent r0 = r14.f34718a
            java.lang.String r1 = com.google.android.gms.internal.ads.yo0.g(r12)
            r0.setPackage(r1)
            r14.a(r12, r13)
            return r4
        L7e:
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16255o5
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb5
            com.google.android.gms.internal.ads.al r7 = new com.google.android.gms.internal.ads.al
            r7.<init>()
            se.b r5 = new se.b
            r6 = r11
            r9 = r12
            r10 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r7.f9347d = r5
            r12 = r9
            android.app.Activity r12 = (android.app.Activity) r12
            u.n r13 = r7.f9345b
            if (r13 == 0) goto La4
            goto Lb4
        La4:
            java.lang.String r13 = com.google.android.gms.internal.ads.yo0.g(r12)
            if (r13 == 0) goto Lb4
            com.google.android.gms.internal.ads.ms1 r14 = new com.google.android.gms.internal.ads.ms1
            r14.<init>(r7)
            r7.f9346c = r14
            u.h.a(r12, r13, r14)
        Lb4:
            return r4
        Lb5:
            r9 = r12
            r10 = r13
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r2)
            r12.setData(r10)
            r12.addFlags(r1)
            r9.startActivity(r12)
            r12 = 9
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.f0.L(android.content.Context, android.net.Uri, android.os.Bundle):int");
    }
}

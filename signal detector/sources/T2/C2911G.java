package t2;

import R.InterfaceC0193u;
import Y2.C0219v;
import Y4.AbstractC0235o;
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
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.AbstractC2239ze;
import com.google.android.gms.internal.ads.C0461Cn;
import com.google.android.gms.internal.ads.C0697Ql;
import com.google.android.gms.internal.ads.C0784Vn;
import com.google.android.gms.internal.ads.C0855Zq;
import com.google.android.gms.internal.ads.C1448kw;
import com.google.android.gms.internal.ads.C1772qw;
import com.google.android.gms.internal.ads.C2026vh;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.G9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC0828Yg;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.Qt;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.XA;
import com.google.android.gms.internal.ads.YA;
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
import q2.C2841s;

/* renamed from: t2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2911G {

    /* renamed from: l, reason: collision with root package name */
    public static final HandlerC2908D f23576l = new HandlerC2908D(Looper.getMainLooper(), 3);

    /* renamed from: g, reason: collision with root package name */
    public String f23583g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f23584h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f23577a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f23578b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f23579c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f23580d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public boolean f23581e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f23582f = new Object();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23585j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f23586k = Executors.newSingleThreadExecutor();

    public static final void A(C0855Zq c0855Zq, Bundle bundle) {
        Intent intent = (Intent) c0855Zq.f12974c;
        if (bundle.isEmpty()) {
            return;
        }
        int i = bundle.getInt("h", -1);
        if (i >= 0) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
        }
        int i3 = bundle.getInt("cbp", -1);
        if (i3 < 0 || i3 > 2) {
            return;
        }
        if (i3 < 0 || i3 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i3);
    }

    public static final String B(Context context, String str) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        if (str == null) {
            return P();
        }
        String strP = null;
        try {
            if (B2.a.f519c == null) {
                B2.a.f519c = new B2.a(6);
            }
            B2.a aVar = B2.a.f519c;
            if (TextUtils.isEmpty(aVar.f521b)) {
                int i = J2.h.f2062c;
                int i3 = 3;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                aVar.f521b = (String) d5.y.s(context, new A2.B(contextCreatePackageContext, i3, context));
            }
            strP = aVar.f521b;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strP)) {
            strP = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strP)) {
            strP = P();
        }
        String strN = AbstractC1135f5.n(new StringBuilder(String.valueOf(strP).length() + 10 + str.length()), strP, " (Mobile; ", str);
        try {
            if (R2.b.a(context).i()) {
                StringBuilder sb = new StringBuilder(strN.length() + 4);
                sb.append(strN);
                sb.append(";aia");
                strN = sb.toString();
            }
        } catch (Exception e6) {
            p2.j.f22785C.f22795h.f("AdUtil.getUserAgent", e6);
        }
        return strN.concat(")");
    }

    public static ArrayList I() {
        E9 e9 = H9.f8707a;
        ArrayList arrayListD = C2841s.f23267e.f23268a.D();
        ArrayList arrayList = new ArrayList();
        int size = arrayListD.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            String str = (String) obj;
            C1448kw c1448kwF = C1448kw.f(new MA(','));
            str.getClass();
            Iterator itE = ((YA) c1448kwF.f15314b).e(c1448kwF, str);
            while (true) {
                XA xa = (XA) itE;
                if (xa.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) xa.next()));
                    } catch (NumberFormatException unused) {
                        AbstractC2907C.m("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static String J(String str, String str2) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public static C0219v K(Context context) {
        C0219v c0219v = new C0219v(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 24) {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                return new C0219v(locale.getLanguage(), locale.getCountry());
            }
            Locale locale2 = context.getResources().getConfiguration().locale;
            return new C0219v(locale2.getLanguage(), locale2.getCountry());
        }
        LocaleManager localeManagerD = AbstractC0235o.d(context.getSystemService(AbstractC0235o.n()));
        if (localeManagerD == null || localeManagerD.getSystemLocales().isEmpty()) {
            return c0219v;
        }
        Locale locale3 = localeManagerD.getSystemLocales().get(0);
        return new C0219v(locale3.getLanguage(), locale3.getCountry());
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
        throw new UnsupportedOperationException("Method not decompiled: t2.C2911G.M(android.view.View):boolean");
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
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String Q() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : AbstractC1135f5.n(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
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
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e6) {
            p2.j.f22785C.f22795h.f("AdUtil.getMapOfFileNamesToKeysFromJsonString", e6);
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
            if (parent instanceof InterfaceC0193u) {
                return 4;
            }
        }
        return 0;
    }

    public static final w c(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                u2.k.e("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new v(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 2);
        } catch (Exception e6) {
            p2.j.f22785C.f22795h.f("Failed to instantiate WorkManagerUtil", e6);
            return null;
        }
    }

    public static final boolean d(Context context, String str) {
        int i = AbstractC2239ze.f17887a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return R2.b.a(context).f2065b.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean e(Context context) {
        try {
            if (Q2.b.f3176g == null) {
                Q2.b.f3176g = Boolean.valueOf(Q2.b.f() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return Q2.b.f3176g.booleanValue();
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
            boolean r0 = u2.h.c()
            r1 = 0
            if (r0 != 0) goto L8
            goto L69
        L8:
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.W5
            q2.s r2 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r3 = r2.f23270c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1b
            goto L69
        L1b:
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.Y5
            com.google.android.gms.internal.ads.G9 r2 = r2.f23270c
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
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.X5
            q2.s r2 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r2 = r2.f23270c
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
        throw new UnsupportedOperationException("Method not decompiled: t2.C2911G.f(java.lang.String):boolean");
    }

    public static final boolean g(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            u2.k.f("Error loading class.", th);
            p2.j.f22785C.f22795h.f("AdUtil.isLiteSdk", th);
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

    public static final void k(int i, View view) {
        String str;
        int i3;
        int iHeight;
        int iWidth;
        String str2;
        String str3;
        String strA;
        Qt qtJ;
        St stZ0;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof C0461Cn) {
                childAt = ((C0461Cn) childAt).getChildAt(0);
            }
            if (childAt instanceof NativeAdView) {
                str = "NATIVE";
                i3 = 1;
            } else {
                str = "UNKNOWN";
                i3 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            C2911G c2911g = p2.j.f22785C.f22790c;
            long jA = a(childAt);
            childAt.getLocationOnScreen(iArr);
            int i6 = iArr[0];
            int i7 = iArr[1];
            String str4 = "none";
            if (!(childAt instanceof InterfaceC0828Yg) || (stZ0 = ((InterfaceC0828Yg) childAt).z0()) == null) {
                str2 = str;
                str3 = "none";
            } else {
                str3 = stZ0.f11269b;
                int iHashCode = childAt.hashCode();
                str2 = str;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(iHashCode).length());
                sb.append(str3);
                sb.append(":");
                sb.append(iHashCode);
                childAt.setContentDescription(sb.toString());
            }
            if (!(childAt instanceof InterfaceC0828Yg) || (qtJ = ((InterfaceC0828Yg) childAt).J()) == null) {
                strA = str2;
            } else {
                strA = Qt.a(qtJ.f10759b);
                i3 = qtJ.f10764e;
                str4 = qtJ.f10732E;
            }
            Locale locale = Locale.US;
            u2.k.g("<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str4 + ", gwsQueryId=" + str3 + ", format=" + strA + ", impType=" + i3 + ", class=" + childAt.getClass().getName() + ", x=" + i6 + ", y=" + i7 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jA + ", state=" + Integer.toString(i, 2) + ">");
        } catch (Exception e6) {
            u2.k.f("Failure getting view location.", e6);
        }
    }

    public static final AlertDialog.Builder l(Context context) {
        p1.e eVar = p2.j.f22785C.f22793f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void m(Context context, Qt qt, C0784Vn c0784Vn) {
        C0697Ql c0697QlA = c0784Vn.a();
        c0697QlA.r("action", "can_show");
        p2.j jVar = p2.j.f22785C;
        C2911G c2911g = jVar.f22790c;
        c0697QlA.r("foreground", true != h(context) ? "1" : "0");
        c0697QlA.r("fg_al", true == jVar.f22794g.s() ? "1" : "0");
        if (qt != null) {
            List list = qt.f10793t;
            if (!list.isEmpty()) {
                c0697QlA.r("ancn", (String) list.get(0));
            }
            c0697QlA.r("ad_format", Qt.a(qt.f10759b));
        }
        c0697QlA.s();
    }

    public static final boolean n(Qt qt) {
        return ((Boolean) C2841s.f23267e.f23270c.a(H9.Le)).booleanValue() && qt != null && qt.f10764e == 4;
    }

    public static final int o(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e6) {
            u2.k.h("Could not parse value:".concat(e6.toString()));
            return 0;
        }
    }

    public static final HashMap p(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8828t)).booleanValue()) {
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
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
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
        q2.r rVar = q2.r.f23260g;
        return new int[]{rVar.f23261a.h(activity, iArr[0]), rVar.f23261a.h(activity, iArr[1])};
    }

    public static final boolean s(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z6 = p2.j.f22785C.f22790c.f23581e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || M(view);
        long jA = a(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z6)) {
            E9 e9 = H9.f8616J1;
            C2841s c2841s = C2841s.f23267e;
            G9 g9 = c2841s.f23270c;
            G9 g92 = c2841s.f23270c;
            if ((!((Boolean) g9.a(e9)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) g92.a(H9.Ob)).booleanValue() || jA >= ((Integer) g92.a(H9.Qb)).intValue())) {
                return true;
            }
        }
        return false;
    }

    public static int t(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 86);
        sb.append("HTTP timeout too low: ");
        sb.append(i);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        u2.k.h(sb.toString());
        return 60000;
    }

    public static final void u(Context context, Intent intent) {
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.lc)).booleanValue()) {
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
            } catch (SecurityException e6) {
                u2.k.i("", e6);
                p2.j.f22785C.f22795h.f("AdUtil.startActivityWithUnknownContext", e6);
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
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            u2.k.c(sb.toString());
        } catch (ActivityNotFoundException e6) {
            u2.k.f("No browser is found.", e6);
        }
    }

    public static final void w(Context context, Intent intent, C0784Vn c0784Vn, String str) {
        E9 e9 = H9.qe;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (!((Boolean) g9.a(e9)).booleanValue() || !(context instanceof C2026vh)) {
            u(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) g92.a(H9.se))) {
                u(context, intent);
                return;
            }
            ((C2026vh) context).a(intent);
            if (!((Boolean) g92.a(H9.re)).booleanValue() || c0784Vn == null) {
                return;
            }
            C0697Ql c0697QlA = c0784Vn.a();
            c0697QlA.r("action", "hila");
            if (str == null) {
                str = "";
            }
            c0697QlA.r("gqi", str);
            c0697QlA.x();
        } catch (ActivityNotFoundException e6) {
            e = e6;
            u2.k.f("Error occurred while starting activity for result", e);
            p2.j.f22785C.f22795h.f("AdUtil.startActivityForResult", e);
            u(context, intent);
        } catch (SecurityException e7) {
            e = e7;
            u2.k.f("Error occurred while starting activity for result", e);
            p2.j.f22785C.f22795h.f("AdUtil.startActivityForResult", e);
            u(context, intent);
        } catch (Exception e8) {
            u2.k.f("Error occurred while starting activity for result", e8);
            p2.j.f22785C.f22795h.f("AdUtil.startActivityForResult", e8);
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
            return R2.b.a(context).f(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e6) {
            AbstractC2907C.n("Error getting metadata", e6);
            return null;
        }
    }

    public final void C(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int iT = t(i);
        StringBuilder sb = new StringBuilder(String.valueOf(iT).length() + 28);
        sb.append("HTTP timeout: ");
        sb.append(iT);
        sb.append(" milliseconds.");
        u2.k.g(sb.toString());
        httpURLConnection.setConnectTimeout(iT);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iT);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", F(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void D(Context context) {
        if (this.i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        H9.a(context);
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.kc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new A1.t(16, this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new A1.t(16, this), intentFilter, 4);
        }
        this.i = true;
    }

    public final void E(Context context) {
        if (this.f23585j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        H9.a(context);
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.kc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C1772qw(1), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C1772qw(1), intentFilter, 4);
        }
        this.f23585j = true;
    }

    public final String F(Context context, String str) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.xc)).booleanValue()) {
            if (this.f23584h != null) {
                return this.f23584h;
            }
            this.f23584h = B(context, str);
            return this.f23584h;
        }
        synchronized (this.f23582f) {
            try {
                String str2 = this.f23583g;
                if (str2 != null) {
                    return str2;
                }
                String strB = B(context, str);
                this.f23583g = strB;
                return strB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean G(String str) {
        return x(str, this.f23577a, (String) C2841s.f23267e.f23270c.a(H9.f8576D0));
    }

    public final boolean H(String str) {
        return x(str, this.f23578b, (String) C2841s.f23267e.f23270c.a(H9.f8583E0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (u2.f.o() != false) goto L32;
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
            t2.AbstractC2907C.m(r12)
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
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.f8814q5
            q2.s r3 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r4 = r3.f23270c
            com.google.android.gms.internal.ads.G9 r3 = r3.f23270c
            java.lang.Object r0 = r4.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 5
            if (r0 == 0) goto L83
            com.google.android.gms.internal.ads.Zq r0 = new com.google.android.gms.internal.ads.Zq
            p2.j r1 = p2.j.f22785C
            com.google.android.gms.internal.ads.P9 r1 = r1.f22800n
            c1.g r2 = r1.f10329e
            if (r2 != 0) goto L4c
            com.google.android.gms.internal.ads.Mf r2 = com.google.android.gms.internal.ads.AbstractC0640Nf.f10005a
            com.google.android.gms.internal.ads.t r5 = new com.google.android.gms.internal.ads.t
            r6 = 13
            r5.<init>(r6, r1)
            r2.execute(r5)
        L4c:
            c1.g r1 = r1.f10329e
            r0.<init>(r1)
            A(r0, r14)
            r.i r14 = r0.a()
            android.content.Intent r0 = r14.f23314a
            com.google.android.gms.internal.ads.E9 r1 = com.google.android.gms.internal.ads.H9.f8581D5
            java.lang.Object r1 = r3.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L73
            q2.r r1 = q2.r.f23260g
            u2.f r1 = r1.f23261a
            boolean r1 = u2.f.o()
            if (r1 == 0) goto L73
            goto Ld1
        L73:
            java.lang.String r1 = com.google.android.gms.internal.ads.AbstractC1984ut.g(r12)
            r0.setPackage(r1)
            r0.setData(r13)
            android.os.Bundle r13 = r14.f23315b
            r12.startActivity(r0, r13)
            return r4
        L83:
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.o5
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld2
            com.google.android.gms.internal.ads.Q9 r7 = new com.google.android.gms.internal.ads.Q9
            r7.<init>()
            c1.g r5 = new c1.g
            r6 = r11
            r9 = r12
            r10 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r7.f10584d = r5
            r12 = r9
            android.app.Activity r12 = (android.app.Activity) r12
            r.j r13 = r7.f10582b
            if (r13 == 0) goto La9
            goto Ld1
        La9:
            java.lang.String r13 = com.google.android.gms.internal.ads.AbstractC1984ut.g(r12)
            if (r13 == 0) goto Ld1
            com.google.android.gms.internal.ads.zN r14 = new com.google.android.gms.internal.ads.zN
            r14.<init>(r7)
            r7.f10583c = r14
            android.content.Context r0 = r12.getApplicationContext()
            r14.f23319a = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.support.customtabs.action.CustomTabsService"
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 != 0) goto Lcc
            r0.setPackage(r13)
        Lcc:
            r13 = 33
            r12.bindService(r0, r14, r13)
        Ld1:
            return r4
        Ld2:
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
        throw new UnsupportedOperationException("Method not decompiled: t2.C2911G.L(android.content.Context, android.net.Uri, android.os.Bundle):int");
    }
}

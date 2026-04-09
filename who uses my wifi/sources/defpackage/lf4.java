package defpackage;

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
import android.view.Window;
import android.webkit.WebSettings;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.lang.reflect.InvocationTargetException;
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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lf4 {
    public static final i63 l = new i63(Looper.getMainLooper(), 2);
    public String g;
    public volatile String h;
    public final AtomicReference a = new AtomicReference(null);
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicReference c = new AtomicReference(new Bundle());
    public final AtomicBoolean d = new AtomicBoolean();
    public boolean e = true;
    public final Object f = new Object();
    public boolean i = false;
    public boolean j = false;
    public final ExecutorService k = Executors.newSingleThreadExecutor();

    public static ArrayList G() {
        iz1 iz1Var = mz1.a;
        ArrayList arrayListJ = tw1.e.a.J();
        ArrayList arrayList = new ArrayList();
        int size = arrayListJ.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListJ.get(i);
            i++;
            String str = (String) obj;
            sq0 sq0VarP = sq0.p(new yk3(','));
            str.getClass();
            Iterator itD = ((kl3) sq0VarP.g).d(sq0VarP, str);
            while (true) {
                jl3 jl3Var = (jl3) itD;
                if (jl3Var.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) jl3Var.next()));
                    } catch (NumberFormatException unused) {
                        gi2.G("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static String H(String str, String str2) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public static uo2 I(Context context) {
        uo2 uo2Var = new uo2(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new uo2(locale.getLanguage(), locale.getCountry());
        }
        LocaleManager localeManagerB = t0.b(context.getSystemService(t0.j()));
        if (localeManagerB == null || localeManagerB.getSystemLocales().isEmpty()) {
            return uo2Var;
        }
        Locale locale2 = localeManagerB.getSystemLocales().get(0);
        return new uo2(locale2.getLanguage(), locale2.getCountry());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean K(android.view.View r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf4.K(android.view.View):boolean");
    }

    public static final void L(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String M(Context context) {
        Bundle bundle;
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        try {
            bundle = za1.a(context).a(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            gi2.R();
            bundle = null;
        }
        return x(bundle);
    }

    public static final String N() {
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

    public static final String O() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : ex0.l(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    public static final HashMap P(String str) {
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
        } catch (JSONException e) {
            hg4.C.h.d("AdUtil.getMapOfFileNamesToKeysFromJsonString", e);
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

    public static final y42 b(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                gi2.Z("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof y42 ? (y42) iInterfaceQueryLocalInterface : new a42(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 2);
        } catch (Exception e) {
            hg4.C.h.d("Failed to instantiate WorkManagerUtil", e);
            return null;
        }
    }

    public static final boolean c(Context context, String str) {
        int i = w11.b;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return za1.a(context).f.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean d(Context context) {
        try {
            if (i30.v == null) {
                i30.v = Boolean.valueOf(ob1.m() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return i30.v.booleanValue();
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
    public static final boolean e(java.lang.String r6) {
        /*
            boolean r0 = defpackage.wb4.c()
            r1 = 0
            if (r0 != 0) goto L8
            goto L69
        L8:
            iz1 r0 = defpackage.mz1.C5
            tw1 r2 = defpackage.tw1.e
            kz1 r3 = r2.c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1b
            goto L69
        L1b:
            iz1 r0 = defpackage.mz1.E5
            kz1 r2 = r2.c
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
            iz1 r0 = defpackage.mz1.D5
            tw1 r2 = defpackage.tw1.e
            kz1 r2 = r2.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf4.e(java.lang.String):boolean");
    }

    public static final boolean f(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            gi2.c0("Error loading class.", th);
            hg4.C.h.d("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean g(Context context) {
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

    public static final boolean h(Context context) {
        Bundle bundle;
        try {
            try {
                bundle = za1.a(context).a(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                gi2.R();
                bundle = null;
            }
            String string = bundle.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(x(bundle))) {
                return !TextUtils.isEmpty(string);
            }
            return false;
        } catch (RemoteException unused2) {
            return false;
        }
    }

    public static final boolean i(Context context) {
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

    public static final void j(View view, int i) {
        String str;
        int i2;
        int iHeight;
        int iWidth;
        String str2;
        String str3;
        String strA;
        a83 a83VarF;
        c83 c83VarF0;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof ru2) {
                childAt = ((ru2) childAt).getChildAt(0);
            }
            if (childAt instanceof NativeAdView) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            lf4 lf4Var = hg4.C.c;
            long jA = a(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            String str4 = "none";
            if (!(childAt instanceof ag2) || (c83VarF0 = ((ag2) childAt).F0()) == null) {
                str2 = str;
                str3 = "none";
            } else {
                str3 = c83VarF0.b;
                int iHashCode = childAt.hashCode();
                str2 = str;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(iHashCode).length());
                sb.append(str3);
                sb.append(":");
                sb.append(iHashCode);
                childAt.setContentDescription(sb.toString());
            }
            if (!(childAt instanceof ag2) || (a83VarF = ((ag2) childAt).F()) == null) {
                strA = str2;
            } else {
                strA = a83.a(a83VarF.b);
                i2 = a83VarF.e;
                str4 = a83VarF.E;
            }
            Locale locale = Locale.US;
            gi2.f0("<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str4 + ", gwsQueryId=" + str3 + ", format=" + strA + ", impType=" + i2 + ", class=" + childAt.getClass().getName() + ", x=" + i3 + ", y=" + i4 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jA + ", state=" + Integer.toString(i, 2) + ">");
        } catch (Exception e) {
            gi2.c0("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder k(Context context) {
        nh4 nh4Var = hg4.C.f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void l(Context context, a83 a83Var, mv2 mv2Var) {
        lv2 lv2VarA = mv2Var.a();
        lv2VarA.k("action", "can_show");
        hg4 hg4Var = hg4.C;
        lf4 lf4Var = hg4Var.c;
        lv2VarA.k("foreground", true != g(context) ? "1" : "0");
        lv2VarA.k("fg_al", true == hg4Var.g.k() ? "1" : "0");
        if (a83Var != null) {
            List list = a83Var.t;
            if (!list.isEmpty()) {
                lv2VarA.k("ancn", (String) list.get(0));
            }
            lv2VarA.k("ad_format", a83.a(a83Var.b));
        }
        lv2VarA.m();
    }

    public static final boolean m(a83 a83Var) {
        return ((Boolean) tw1.e.c.a(mz1.he)).booleanValue() && a83Var != null && a83Var.e == 4;
    }

    public static final int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            gi2.i0("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final HashMap o(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) tw1.e.c.a(mz1.s)).booleanValue()) {
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

    public static final int[] p(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] q(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        sv1 sv1Var = sv1.f;
        return new int[]{sv1Var.a.h(activity, iArr[0]), sv1Var.a.h(activity, iArr[1])};
    }

    public static final boolean r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = hg4.C.c.e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || K(view);
        long jA = a(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            iz1 iz1Var = mz1.u1;
            tw1 tw1Var = tw1.e;
            kz1 kz1Var = tw1Var.c;
            kz1 kz1Var2 = tw1Var.c;
            if ((!((Boolean) kz1Var.a(iz1Var)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) kz1Var2.a(mz1.rb)).booleanValue() || jA >= ((Integer) kz1Var2.a(mz1.tb)).intValue())) {
                return true;
            }
        }
        return false;
    }

    public static final void s(Context context, Intent intent) {
        if (!((Boolean) tw1.e.c.a(mz1.Ob)).booleanValue()) {
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
            } catch (SecurityException e) {
                gi2.q0(5);
                hg4.C.h.d("AdUtil.startActivityWithUnknownContext", e);
            }
        } catch (Throwable unused2) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
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
        gi2.i0(sb.toString());
        return 60000;
    }

    public static final void u(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            L(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            gi2.U(sb.toString());
        } catch (ActivityNotFoundException e) {
            gi2.c0("No browser is found.", e);
        }
    }

    public static final void v(Context context, Intent intent, mv2 mv2Var, String str) {
        iz1 iz1Var = mz1.Td;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (!((Boolean) kz1Var.a(iz1Var)).booleanValue() || !(context instanceof yg2)) {
            s(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) kz1Var2.a(mz1.Vd))) {
                s(context, intent);
                return;
            }
            ((yg2) context).a(intent);
            if (!((Boolean) kz1Var2.a(mz1.Ud)).booleanValue() || mv2Var == null) {
                return;
            }
            lv2 lv2VarA = mv2Var.a();
            lv2VarA.k("action", "hila");
            if (str == null) {
                str = "";
            }
            lv2VarA.k("gqi", str);
            lv2VarA.o();
        } catch (ActivityNotFoundException e) {
            e = e;
            gi2.c0("Error occurred while starting activity for result", e);
            hg4.C.h.d("AdUtil.startActivityForResult", e);
            s(context, intent);
        } catch (SecurityException e2) {
            e = e2;
            gi2.c0("Error occurred while starting activity for result", e);
            hg4.C.h.d("AdUtil.startActivityForResult", e);
            s(context, intent);
        } catch (Exception e3) {
            gi2.c0("Error occurred while starting activity for result", e3);
            hg4.C.h.d("AdUtil.startActivityForResult", e3);
            s(context, intent);
        }
    }

    public static boolean w(String str, AtomicReference atomicReference, String str2) {
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

    public static String x(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static final void y(rl rlVar, Bundle bundle) {
        Intent intent = (Intent) rlVar.g;
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
        int i2 = bundle.getInt("cbp", -1);
        if (i2 < 0 || i2 > 2) {
            return;
        }
        if (i2 < 0 || i2 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i2);
    }

    public static final String z(Context context, String str) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        if (str == null) {
            return N();
        }
        String strN = null;
        try {
            if (gs3.o == null) {
                gs3.o = new gs3(4);
            }
            gs3 gs3Var = gs3.o;
            if (TextUtils.isEmpty(gs3Var.g)) {
                int i = oz.c;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                gs3Var.g = (String) yb.u(context, new gs1(contextCreatePackageContext, context));
            }
            strN = gs3Var.g;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strN)) {
            strN = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strN)) {
            strN = N();
        }
        String strL = ex0.l(new StringBuilder(String.valueOf(strN).length() + 10 + str.length()), strN, " (Mobile; ", str);
        try {
            if (za1.a(context).d()) {
                StringBuilder sb = new StringBuilder(strL.length() + 4);
                sb.append(strL);
                sb.append(";aia");
                strL = sb.toString();
            }
        } catch (Exception e) {
            hg4.C.h.d("AdUtil.getUserAgent", e);
        }
        return strL.concat(")");
    }

    public final void A(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int iT = t(i);
        StringBuilder sb = new StringBuilder(String.valueOf(iT).length() + 28);
        sb.append("HTTP timeout: ");
        sb.append(iT);
        sb.append(" milliseconds.");
        gi2.f0(sb.toString());
        httpURLConnection.setConnectTimeout(iT);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iT);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", D(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void B(Context context) {
        if (this.i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        mz1.a(context);
        if (!((Boolean) tw1.e.c.a(mz1.Nb)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new d6(9, this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new d6(9, this), intentFilter, 4);
        }
        this.i = true;
    }

    public final void C(Context context) {
        if (this.j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        mz1.a(context);
        if (!((Boolean) tw1.e.c.a(mz1.Nb)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new wc3(1), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new wc3(1), intentFilter, 4);
        }
        this.j = true;
    }

    public final String D(Context context, String str) {
        if (((Boolean) tw1.e.c.a(mz1.ac)).booleanValue()) {
            if (this.h != null) {
                return this.h;
            }
            this.h = z(context, str);
            return this.h;
        }
        synchronized (this.f) {
            try {
                String str2 = this.g;
                if (str2 != null) {
                    return str2;
                }
                String strZ = z(context, str);
                this.g = strZ;
                return strZ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean E(String str) {
        return w(str, this.a, (String) tw1.e.c.a(mz1.o0));
    }

    public final boolean F(String str) {
        return w(str, this.b, (String) tw1.e.c.a(mz1.p0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (defpackage.j63.n() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int J(android.content.Context r12, android.net.Uri r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf4.J(android.content.Context, android.net.Uri, android.os.Bundle):int");
    }
}

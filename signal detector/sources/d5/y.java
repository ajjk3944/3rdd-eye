package d5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Parcelable;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;
import c.C0371K;
import c.C0372L;
import c5.C0408e;
import c5.C0409f;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C1053de;
import e5.C2310f;
import e5.C2313i;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.j1;
import o.l1;
import org.xmlpull.v1.XmlPullParserException;
import q0.C2794g;
import q0.E;
import q0.F;
import q0.G;
import q0.H;
import q0.I;
import q0.J;

/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static int f19830a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static int f19831b = 10;

    /* renamed from: c, reason: collision with root package name */
    public static int f19832c = 10;

    /* renamed from: d, reason: collision with root package name */
    public static int f19833d = 10;

    /* renamed from: e, reason: collision with root package name */
    public static M1.b f19834e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f19835f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f19836g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static int f19837h = 8192;
    public static ThreadPoolExecutor i;

    public static void a(C0371K c0371k, p5.l lVar) {
        q5.i.e(c0371k, "<this>");
        c0371k.a(new C0372L(lVar));
    }

    public static C2313i b(C2313i c2313i) {
        C2310f c2310f = c2313i.f19976a;
        c2310f.b();
        return c2310f.i > 0 ? c2313i : C2313i.f19975b;
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b5 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b5)));
        }
        return sb.toString();
    }

    public static void d(int i3) {
        if (2 > i3 || i3 >= 37) {
            StringBuilder sbP = AbstractC1135f5.p(i3, "radix ", " was not in valid range ");
            sbP.append(new v5.c(2, 36, 1));
            throw new IllegalArgumentException(sbP.toString());
        }
    }

    public static float e(float f2, float f5, float f6) {
        return f2 < f5 ? f5 : f2 > f6 ? f6 : f2;
    }

    public static int f(int i3, int i6, int i7) {
        return i3 < i6 ? i6 : i3 > i7 ? i7 : i3;
    }

    public static int g(Comparable comparable, Comparable comparable2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] h(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            jArr[i3] = iArr[i3];
        }
        return jArr;
    }

    public static void i(Context context, String str) {
        Object objD;
        if (context == null || str == null || str.length() == 0) {
            return;
        }
        try {
            Object systemService = context.getSystemService("clipboard");
            q5.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("copy", str));
            objD = C0412i.f5929a;
        } catch (Throwable th) {
            objD = R2.a.d(th);
        }
        if (C0409f.a(objD) != null) {
            F4.d.b(context, context.getString(R.string.copy_failed));
        }
        if (objD instanceof C0408e) {
            return;
        }
        F4.d.b(context, context.getResources().getString(R.string.copy_success));
    }

    public static InvocationHandler j() throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static J k(String str, String str2) throws ClassNotFoundException {
        if ("integer".equals(str)) {
            return J.f22927b;
        }
        if ("integer[]".equals(str)) {
            return J.f22929d;
        }
        if ("long".equals(str)) {
            return J.f22930e;
        }
        if ("long[]".equals(str)) {
            return J.f22931f;
        }
        if ("boolean".equals(str)) {
            return J.i;
        }
        if ("boolean[]".equals(str)) {
            return J.f22934j;
        }
        if (!"string".equals(str)) {
            if ("string[]".equals(str)) {
                return J.f22936l;
            }
            if ("float".equals(str)) {
                return J.f22932g;
            }
            if ("float[]".equals(str)) {
                return J.f22933h;
            }
            if ("reference".equals(str)) {
                return J.f22928c;
            }
            if (str != null && str.length() != 0) {
                try {
                    String strConcat = (!str.startsWith(".") || str2 == null) ? str : str2.concat(str);
                    if (y5.l.W(str, "[]")) {
                        strConcat = strConcat.substring(0, strConcat.length() - 2);
                        q5.i.d(strConcat, "this as java.lang.String…ing(startIndex, endIndex)");
                        Class<?> cls = Class.forName(strConcat);
                        if (Parcelable.class.isAssignableFrom(cls)) {
                            return new F(cls);
                        }
                        if (Serializable.class.isAssignableFrom(cls)) {
                            return new H(cls);
                        }
                    } else {
                        Class<?> cls2 = Class.forName(strConcat);
                        if (Parcelable.class.isAssignableFrom(cls2)) {
                            return new G(cls2);
                        }
                        if (Enum.class.isAssignableFrom(cls2)) {
                            return new E(cls2);
                        }
                        if (Serializable.class.isAssignableFrom(cls2)) {
                            return new I(cls2);
                        }
                    }
                    throw new IllegalArgumentException(strConcat + " is not Serializable or Parcelable.");
                } catch (ClassNotFoundException e6) {
                    throw new RuntimeException(e6);
                }
            }
        }
        return J.f22935k;
    }

    public static H0.c l(H0.d dVar, SQLiteDatabase sQLiteDatabase) {
        q5.i.e(dVar, "refHolder");
        H0.c cVar = dVar.f1733a;
        if (cVar != null && cVar.f1732a.equals(sQLiteDatabase)) {
            return cVar;
        }
        H0.c cVar2 = new H0.c(sQLiteDatabase);
        dVar.f1733a = cVar2;
        return cVar2;
    }

    public static LinkedHashSet m(Set set, C2794g c2794g) {
        q5.i.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(v.J(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(c2794g);
        return linkedHashSet;
    }

    public static TypedValue n(Context context, int i3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean o(Context context, int i3, boolean z6) {
        TypedValue typedValueN = n(context, i3);
        return (typedValueN == null || typedValueN.type != 18) ? z6 : typedValueN.data != 0;
    }

    public static int p(Context context) {
        TypedValue typedValueN = n(context, R.attr.minTouchTargetSize);
        return (int) ((typedValueN == null || typedValueN.type != 5) ? context.getResources().getDimension(R.dimen.mtrl_min_touch_target_size) : typedValueN.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static TypedValue q(Context context, int i3, String str) {
        TypedValue typedValueN = n(context, i3);
        if (typedValueN != null) {
            return typedValueN;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i3)));
    }

    public static void r(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            j1.a(view, charSequence);
            return;
        }
        l1 l1Var = l1.f22570k;
        if (l1Var != null && l1Var.f22572a == view) {
            l1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new l1(view, charSequence);
            return;
        }
        l1 l1Var2 = l1.f22571l;
        if (l1Var2 != null && l1Var2.f22572a == view) {
            l1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static Object s(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            u2.k.f("Unexpected exception.", th);
            C1053de.a(context).e("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }

    public static ThreadPoolExecutor t() {
        if (i == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new O.k(1));
            i = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return i;
    }

    public static final String u(String str, XmlResourceParser xmlResourceParser) {
        for (int i3 = 0; i3 < xmlResourceParser.getAttributeCount(); i3++) {
            if (xmlResourceParser.getAttributeName(i3).equals(str)) {
                return xmlResourceParser.getAttributeValue(i3);
            }
        }
        return null;
    }

    public static final void v(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i3 = 1;
        while (i3 != 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }
}

package a4;

import android.app.job.JobParameters;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f {
    public static int A(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static void B(TextView textView, int i4) {
        textView.setFirstBaselineToTopHeight(i4);
    }

    public static void C(ViewStructure viewStructure, int i4) {
        viewStructure.setMaxTextLength(i4);
    }

    public static void D(int i4, View view) {
        view.setOutlineAmbientShadowColor(i4);
    }

    public static void E(int i4, View view) {
        view.setOutlineSpotShadowColor(i4);
    }

    public static boolean F(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static final DisplayCutout a(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e2) {
            if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                throw e2;
            }
            s6.b.f33472a.getClass();
            Log.w(s6.a.f33471b, e2);
            return null;
        }
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Bitmap d(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static ui.k e(PackageInfo packageInfo) {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners = (Build.VERSION.SDK_INT < 28 || (signingInfo = packageInfo.signingInfo) == null) ? packageInfo.signatures : signingInfo.getApkContentsSigners();
        if (apkContentsSigners == null || apkContentsSigners.length == 0) {
            return null;
        }
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(apkContentsSigners[0].toByteArray()));
            ui.k kVar = new ui.k();
            kVar.f35398a = x509Certificate.getSigAlgName();
            try {
                kVar.f35399b = t.m(x509Certificate.getEncoded());
            } catch (CertificateEncodingException unused) {
            }
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            StringBuilder sb2 = new StringBuilder(encoded.length);
            for (byte b10 : encoded) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() < 2) {
                    sb2.append(0);
                }
                sb2.append(hexString.toUpperCase());
            }
            kVar.f35400c = t.m(sb2.toString().getBytes());
            kVar.f35401d = x509Certificate.getNotBefore();
            kVar.f35402e = x509Certificate.getNotAfter();
            kVar.f35403f = x509Certificate.getSerialNumber().toString();
            X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
            if (issuerX500Principal != null) {
                String name = issuerX500Principal.getName("RFC1779");
                if (!TextUtils.isEmpty(name)) {
                    kVar.g = v(name, "CN=([^,]*)");
                    kVar.f35404h = v(name, "O=([^,]*)");
                    kVar.f35405i = v(name, "C=([^,]*)");
                }
            }
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            if (subjectX500Principal != null) {
                String name2 = subjectX500Principal.getName("RFC1779");
                if (!TextUtils.isEmpty(name2)) {
                    kVar.j = v(name2, "CN=([^,]*)");
                    kVar.f35406k = v(name2, "O=([^,]*)");
                    kVar.f35407l = v(name2, "C=([^,]*)");
                }
            }
            return kVar;
        } catch (CertificateException unused2) {
            return null;
        }
    }

    public static List f(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] g(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long h(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Network i(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static int j(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String k(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int p(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params q(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int r(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri s(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static ClassLoader t() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper u(WebView webView) {
        return webView.getWebViewLooper();
    }

    public static String v(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void w(View view) {
        view.resetPivot();
    }

    public static int x(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int y(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int z(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }
}

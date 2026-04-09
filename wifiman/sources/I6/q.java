package I6;

import G6.B;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.snmp4j.mp.MPv3;

/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f8670a = Pattern.compile("\\$\\d+$");

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f8671b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    private static final B.b f8672c;

    /* renamed from: d, reason: collision with root package name */
    private static L6.a f8673d;

    class a implements B.b {
        a() {
        }

        @Override // G6.B.b
        public void a(int i10, String str, String str2) {
            Log.println(i10, str, str2);
        }
    }

    static {
        a aVar = new a();
        f8672c = aVar;
        f8673d = new L6.a(MPv3.MAX_MESSAGE_ID, MPv3.MAX_MESSAGE_ID, MPv3.MAX_MESSAGE_ID, false, true, aVar);
    }

    private static String a() {
        ThreadLocal threadLocal = f8671b;
        String str = (String) threadLocal.get();
        if (str != null) {
            threadLocal.remove();
            return str;
        }
        List listAsList = Arrays.asList(q.class.getName(), L6.b.class.getName(), L6.c.class.getName());
        Throwable th2 = new Throwable();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int i10 = 0;
        while (i10 < stackTrace.length && listAsList.contains(stackTrace[i10].getClassName())) {
            i10++;
        }
        if (stackTrace.length <= i10) {
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?", th2);
        }
        String className = stackTrace[i10].getClassName();
        Matcher matcher = f8670a.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll("");
        }
        String strReplace = className.replace("Impl", "").replace("RxBle", "");
        int iIndexOf = strReplace.indexOf(36);
        return "RxBle#" + (iIndexOf <= 0 ? strReplace.substring(strReplace.lastIndexOf(46) + 1) : strReplace.substring(strReplace.lastIndexOf(46) + 1, iIndexOf));
    }

    public static void b(String str, Object... objArr) {
        n(3, null, str, objArr);
    }

    public static void c(Throwable th2, String str, Object... objArr) {
        n(3, th2, str, objArr);
    }

    public static void d(String str, Object... objArr) {
        n(6, null, str, objArr);
    }

    public static void e(Throwable th2, String str, Object... objArr) {
        n(6, th2, str, objArr);
    }

    private static String f(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(str, objArr);
    }

    public static int g() {
        return f8673d.f11237b;
    }

    public static boolean h() {
        return f8673d.f11239d;
    }

    public static boolean i() {
        return f8673d.f11240e;
    }

    public static int j() {
        return f8673d.f11238c;
    }

    public static void k(String str, Object... objArr) {
        n(4, null, str, objArr);
    }

    public static boolean l(int i10) {
        return f8673d.f11236a <= i10;
    }

    private static void m(int i10, String str, String str2) {
        if (str2.length() < 4000) {
            f8673d.f11241f.a(i10, str, str2);
            return;
        }
        for (String str3 : str2.split("\n")) {
            f8673d.f11241f.a(i10, str, str3);
        }
    }

    private static void n(int i10, Throwable th2, String str, Object... objArr) {
        if (i10 < f8673d.f11236a) {
            return;
        }
        String strF = f(str, objArr);
        if (strF == null || strF.length() == 0) {
            if (th2 == null) {
                return;
            } else {
                strF = Log.getStackTraceString(th2);
            }
        } else if (th2 != null) {
            strF = strF + "\n" + Log.getStackTraceString(th2);
        }
        m(i10, a(), strF);
    }

    public static void o(B b10) {
        L6.a aVar = f8673d;
        L6.a aVarA = aVar.a(b10);
        b("Received new options (%s) and merged with old setup: %s. New setup: %s", b10, aVar, aVarA);
        f8673d = aVarA;
    }

    public static void p(String str, Object... objArr) {
        n(2, null, str, objArr);
    }

    public static void q(String str, Object... objArr) {
        n(5, null, str, objArr);
    }

    public static void r(Throwable th2, String str, Object... objArr) {
        n(5, th2, str, objArr);
    }
}

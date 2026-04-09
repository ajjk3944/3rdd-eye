package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard;", "", "Ljava/lang/reflect/Method;", "getMethod", "openMethod", "warnIfOpenMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "closer", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;)Ljava/lang/Object;", "closeGuardInstance", "", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/lang/Object;)Z", "Ljava/lang/reflect/Method;", SnmpConfigurator.O_COMMUNITY, "d", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CloseGuard {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Method getMethod;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Method openMethod;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Method warnIfOpenMethod;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard$Companion;", "", "<init>", "()V", "Lokhttp3/internal/platform/android/CloseGuard;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lokhttp3/internal/platform/android/CloseGuard;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CloseGuard a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new CloseGuard(method3, method2, method);
        }

        private Companion() {
        }
    }

    public CloseGuard(Method method, Method method2, Method method3) {
        this.getMethod = method;
        this.openMethod = method2;
        this.warnIfOpenMethod = method3;
    }

    public final Object a(String closer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(closer, "closer");
        Method method = this.getMethod;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.openMethod;
                AbstractC6492s.f(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object closeGuardInstance) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (closeGuardInstance != null) {
            try {
                Method method = this.warnIfOpenMethod;
                AbstractC6492s.f(method);
                method.invoke(closeGuardInstance, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}

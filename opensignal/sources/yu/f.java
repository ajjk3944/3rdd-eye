package yu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f26462f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f26463a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f26464b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f26465c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f26466d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f26467e;

    public f(Class cls) throws NoSuchMethodException, SecurityException {
        this.f26463a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        br.l.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f26464b = declaredMethod;
        this.f26465c = cls.getMethod("setHostname", String.class);
        this.f26466d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f26467e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // yu.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f26463a.isInstance(sSLSocket);
    }

    @Override // yu.m
    public final boolean b() {
        boolean z10 = xu.c.f25533e;
        return xu.c.f25533e;
    }

    @Override // yu.m
    public final String c(SSLSocket sSLSocket) {
        if (this.f26463a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f26466d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, tt.a.f22975a);
                }
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (!(cause instanceof NullPointerException) || !br.l.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e10);
                }
            }
        }
        return null;
    }

    @Override // yu.m
    public final void d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        br.l.e(list, "protocols");
        if (this.f26463a.isInstance(sSLSocket)) {
            try {
                this.f26464b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f26465c.invoke(sSLSocket, str);
                }
                Method method = this.f26467e;
                xu.n nVar = xu.n.f25563a;
                method.invoke(sSLSocket, io.sentry.hints.i.L(list));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}

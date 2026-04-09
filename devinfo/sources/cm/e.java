package cm;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class e implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final ed.f f2959f = new ed.f(8);

    /* renamed from: a, reason: collision with root package name */
    public final Class f2960a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2961b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f2962c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2963d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2964e;

    public e(Class cls) throws NoSuchMethodException, SecurityException {
        this.f2960a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        nk.k.d(declaredMethod, "getDeclaredMethod(...)");
        this.f2961b = declaredMethod;
        this.f2962c = cls.getMethod("setHostname", String.class);
        this.f2963d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f2964e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // cm.n
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        nk.k.e(list, "protocols");
        if (this.f2960a.isInstance(sSLSocket)) {
            try {
                this.f2961b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null && Build.VERSION.SDK_INT <= 23) {
                    this.f2962c.invoke(sSLSocket, str);
                }
                Method method = this.f2964e;
                bm.e eVar = bm.e.f2349a;
                method.invoke(sSLSocket, b7.h.c(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    @Override // cm.n
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        if (this.f2960a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f2963d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, vk.a.f36267a);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (!(cause instanceof NullPointerException) || !nk.k.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e10);
                }
            }
        }
        return null;
    }

    @Override // cm.n
    public final boolean isSupported() {
        boolean z3 = bm.c.f2346e;
        return bm.c.f2346e;
    }

    @Override // cm.n
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return this.f2960a.isInstance(sSLSocket);
    }
}

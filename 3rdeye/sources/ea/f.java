package ea;

import U9.y;
import da.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;
import y9.C5819a;

/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes3.dex */
public class f implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final e f37782f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class<? super SSLSocket> f37783a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f37784b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f37785c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f37786d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f37787e;

    public f(Class<? super SSLSocket> cls) throws NoSuchMethodException, SecurityException {
        this.f37783a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        l.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f37784b = declaredMethod;
        this.f37785c = cls.getMethod("setHostname", String.class);
        this.f37786d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f37787e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // ea.j
    public final boolean a() {
        boolean z10 = da.b.f37579e;
        return da.b.f37579e;
    }

    @Override // ea.j
    public final boolean b(SSLSocket sSLSocket) {
        return this.f37783a.isInstance(sSLSocket);
    }

    @Override // ea.j
    public final String c(SSLSocket sSLSocket) {
        if (!this.f37783a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f37786d.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, C5819a.f48359b);
            }
            return null;
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if ((cause instanceof NullPointerException) && l.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e10);
        }
    }

    @Override // ea.j
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        l.f(protocols, "protocols");
        if (this.f37783a.isInstance(sSLSocket)) {
            try {
                this.f37784b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f37785c.invoke(sSLSocket, str);
                }
                Method method = this.f37787e;
                da.h hVar = da.h.f37600a;
                method.invoke(sSLSocket, h.a.b(protocols));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}

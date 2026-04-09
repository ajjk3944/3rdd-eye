package com.yandex.mobile.ads.impl;

import N7.H7;
import com.yandex.mobile.ads.impl.lh1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public class qd implements z02 {

    /* renamed from: f, reason: collision with root package name */
    private static final pd f32141f = new pd();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f32142g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Class<? super SSLSocket> f32143a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f32144b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f32145c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f32146d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f32147e;

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static qd b(Class cls) {
            Class superclass = cls;
            while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(H7.o(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                }
            }
            return new qd(superclass);
        }

        public /* synthetic */ a(int i) {
            this();
        }

        public static pd a() {
            return qd.f32141f;
        }
    }

    public qd(Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.l.f(sslSocketClass, "sslSocketClass");
        this.f32143a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.l.e(declaredMethod, "getDeclaredMethod(...)");
        this.f32144b = declaredMethod;
        this.f32145c = sslSocketClass.getMethod("setHostname", String.class);
        this.f32146d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f32147e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.yandex.mobile.ads.impl.z02
    public final void a(SSLSocket sslSocket, String str, List<? extends gm1> protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        kotlin.jvm.internal.l.f(protocols, "protocols");
        if (this.f32143a.isInstance(sslSocket)) {
            try {
                this.f32144b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f32145c.invoke(sslSocket, str);
                }
                Method method = this.f32147e;
                int i = lh1.f30001c;
                method.invoke(sslSocket, lh1.a.b(protocols));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.z02
    public final String b(SSLSocket sslSocket) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        if (!this.f32143a.isInstance(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f32146d.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                Charset UTF_8 = StandardCharsets.UTF_8;
                kotlin.jvm.internal.l.e(UTF_8, "UTF_8");
                return new String(bArr, UTF_8);
            }
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (NullPointerException e10) {
            if (!kotlin.jvm.internal.l.b(e10.getMessage(), "ssl == null")) {
                throw e10;
            }
        } catch (InvocationTargetException e11) {
            throw new AssertionError(e11);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.z02
    public final boolean a(SSLSocket sslSocket) {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        return this.f32143a.isInstance(sslSocket);
    }

    @Override // com.yandex.mobile.ads.impl.z02
    public final boolean a() {
        return md.f30347f;
    }
}

package com.yandex.mobile.ads.impl;

import c9.C2092m;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class dq0 extends lh1 {

    /* renamed from: d, reason: collision with root package name */
    private final Method f26288d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f26289e;

    /* renamed from: f, reason: collision with root package name */
    private final Method f26290f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f26291g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f26292h;

    public static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f26293a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f26294b;

        /* renamed from: c, reason: collision with root package name */
        private String f26295c;

        public a(ArrayList protocols) {
            kotlin.jvm.internal.l.f(protocols, "protocols");
            this.f26293a = protocols;
        }

        public final String a() {
            return this.f26295c;
        }

        public final boolean b() {
            return this.f26294b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) throws Throwable {
            kotlin.jvm.internal.l.f(proxy, "proxy");
            kotlin.jvm.internal.l.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (kotlin.jvm.internal.l.b(name, "supports") && kotlin.jvm.internal.l.b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (kotlin.jvm.internal.l.b(name, "unsupported") && kotlin.jvm.internal.l.b(Void.TYPE, returnType)) {
                this.f26294b = true;
                return null;
            }
            if (kotlin.jvm.internal.l.b(name, "protocols") && objArr.length == 0) {
                return this.f26293a;
            }
            if ((kotlin.jvm.internal.l.b(name, "selectProtocol") || kotlin.jvm.internal.l.b(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj2 = list.get(i);
                            kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.f26293a.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f26295c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f26293a.get(0);
                    this.f26295c = str2;
                    return str2;
                }
            }
            if ((!kotlin.jvm.internal.l.b(name, "protocolSelected") && !kotlin.jvm.internal.l.b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            kotlin.jvm.internal.l.d(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f26295c = (String) obj3;
            return null;
        }
    }

    public static final class b {
        public static dq0 a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                kotlin.jvm.internal.l.c(property);
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                kotlin.jvm.internal.l.c(method);
                kotlin.jvm.internal.l.c(method2);
                kotlin.jvm.internal.l.c(method3);
                kotlin.jvm.internal.l.c(cls3);
                kotlin.jvm.internal.l.c(cls4);
                return new dq0(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public dq0(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        kotlin.jvm.internal.l.f(putMethod, "putMethod");
        kotlin.jvm.internal.l.f(getMethod, "getMethod");
        kotlin.jvm.internal.l.f(removeMethod, "removeMethod");
        kotlin.jvm.internal.l.f(clientProviderClass, "clientProviderClass");
        kotlin.jvm.internal.l.f(serverProviderClass, "serverProviderClass");
        this.f26288d = putMethod;
        this.f26289e = getMethod;
        this.f26290f = removeMethod;
        this.f26291g = clientProviderClass;
        this.f26292h = serverProviderClass;
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final void a(SSLSocket sslSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        try {
            this.f26290f.invoke(null, sslSocket);
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final String b(SSLSocket sslSocket) throws IllegalArgumentException {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f26289e.invoke(null, sslSocket));
            kotlin.jvm.internal.l.d(invocationHandler, "null cannot be cast to non-null type com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                lh1.a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final void a(SSLSocket sslSocket, String str, List<? extends gm1> protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        kotlin.jvm.internal.l.f(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((gm1) obj) != gm1.f27817d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gm1) it.next()).toString());
        }
        try {
            this.f26288d.invoke(null, sslSocket, Proxy.newProxyInstance(lh1.class.getClassLoader(), new Class[]{this.f26291g, this.f26292h}, new a(arrayList2)));
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }
}

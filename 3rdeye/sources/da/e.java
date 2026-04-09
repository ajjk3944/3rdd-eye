package da;

import U9.y;
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
import kotlin.jvm.internal.l;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
/* loaded from: classes3.dex */
public final class e extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Method f37589c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f37590d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f37591e;

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f37592f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f37593g;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f37594a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f37595b;

        /* renamed from: c, reason: collision with root package name */
        public String f37596c;

        public a(ArrayList arrayList) {
            this.f37594a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) throws Throwable {
            l.f(proxy, "proxy");
            l.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (l.b(name, "supports") && l.b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (l.b(name, "unsupported") && l.b(Void.TYPE, returnType)) {
                this.f37595b = true;
                return null;
            }
            boolean zB = l.b(name, "protocols");
            ArrayList arrayList = this.f37594a;
            if (zB && objArr.length == 0) {
                return arrayList;
            }
            if ((l.b(name, "selectProtocol") || l.b(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj2 = list.get(i);
                            l.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!arrayList.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f37596c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f37596c = str2;
                    return str2;
                }
            }
            if ((!l.b(name, "protocolSelected") && !l.b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            l.d(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f37596c = (String) obj3;
            return null;
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f37589c = method;
        this.f37590d = method2;
        this.f37591e = method3;
        this.f37592f = cls;
        this.f37593g = cls2;
    }

    @Override // da.h
    public final void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f37591e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // da.h
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        l.f(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((y) obj) != y.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((y) it.next()).toString());
        }
        try {
            this.f37589c.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f37592f, this.f37593g}, new a(arrayList2)));
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // da.h
    public final String f(SSLSocket sSLSocket) throws IllegalArgumentException {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f37590d.invoke(null, sSLSocket));
            l.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            boolean z10 = aVar.f37595b;
            if (!z10 && aVar.f37596c == null) {
                h.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f37596c;
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}

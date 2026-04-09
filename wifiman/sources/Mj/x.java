package Mj;

import Mj.C3307b;
import Mj.e;
import Mj.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f13497a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final Call.Factory f13498b;

    /* renamed from: c, reason: collision with root package name */
    final HttpUrl f13499c;

    /* renamed from: d, reason: collision with root package name */
    final List f13500d;

    /* renamed from: e, reason: collision with root package name */
    final int f13501e;

    /* renamed from: f, reason: collision with root package name */
    final List f13502f;

    /* renamed from: g, reason: collision with root package name */
    final int f13503g;

    /* renamed from: h, reason: collision with root package name */
    final Executor f13504h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f13505i;

    class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f13506a = new Object[0];

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f13507b;

        a(Class cls) {
            this.f13507b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f13506a;
            }
            t tVar = s.f13439b;
            return tVar.c(method) ? tVar.b(method, this.f13507b, obj, objArr) : x.this.c(this.f13507b, method).a(obj, objArr);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Call.Factory f13509a;

        /* renamed from: b, reason: collision with root package name */
        private HttpUrl f13510b;

        /* renamed from: c, reason: collision with root package name */
        private final List f13511c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private final List f13512d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private Executor f13513e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f13514f;

        public b a(e.a aVar) {
            List list = this.f13512d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(h.a aVar) {
            List list = this.f13511c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return d(HttpUrl.h(str));
        }

        public b d(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            if ("".equals(httpUrl.getPathSegments().get(r0.size() - 1))) {
                this.f13510b = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public x e() {
            if (this.f13510b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory okHttpClient = this.f13509a;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            Call.Factory factory = okHttpClient;
            Executor executor = this.f13513e;
            if (executor == null) {
                executor = s.f13438a;
            }
            Executor executor2 = executor;
            c cVar = s.f13440c;
            ArrayList arrayList = new ArrayList(this.f13512d);
            List listA = cVar.a(executor2);
            arrayList.addAll(listA);
            List listB = cVar.b();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList(this.f13511c.size() + 1 + size);
            arrayList2.add(new C3307b());
            arrayList2.addAll(this.f13511c);
            arrayList2.addAll(listB);
            return new x(factory, this.f13510b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listA.size(), executor2, this.f13514f);
        }

        public b f(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f13509a = factory;
            return this;
        }

        public b g(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return f(okHttpClient);
        }
    }

    x(Call.Factory factory, HttpUrl httpUrl, List list, int i10, List list2, int i11, Executor executor, boolean z10) {
        this.f13498b = factory;
        this.f13499c = httpUrl;
        this.f13500d = list;
        this.f13501e = i10;
        this.f13502f = list2;
        this.f13503g = i11;
        this.f13504h = executor;
        this.f13505i = z10;
    }

    private void j(Class cls) throws SecurityException {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f13505i) {
            t tVar = s.f13439b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!tVar.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    c(cls, method);
                }
            }
        }
    }

    public e a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public Object b(Class cls) throws SecurityException {
        j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    y c(Class cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f13497a.get(method);
            if (objPutIfAbsent instanceof y) {
                return (y) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f13497a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                y yVarB = y.b(this, cls, method);
                                this.f13497a.put(method, yVarB);
                                return yVarB;
                            } catch (Throwable th2) {
                                this.f13497a.remove(method);
                                throw th2;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f13497a.get(method);
                    if (obj2 != null) {
                        return (y) obj2;
                    }
                } finally {
                }
            }
        }
    }

    public e d(e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f13502f.indexOf(aVar) + 1;
        int size = this.f13502f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            e eVarA = ((e.a) this.f13502f.get(i10)).a(type, annotationArr, this);
            if (eVarA != null) {
                return eVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((e.a) this.f13502f.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f13502f.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((e.a) this.f13502f.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public h e(h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f13500d.indexOf(aVar) + 1;
        int size = this.f13500d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h hVarC = ((h.a) this.f13500d.get(i10)).c(type, annotationArr, annotationArr2, this);
            if (hVarC != null) {
                return hVarC;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((h.a) this.f13500d.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f13500d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((h.a) this.f13500d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public h f(h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f13500d.indexOf(aVar) + 1;
        int size = this.f13500d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h hVarD = ((h.a) this.f13500d.get(i10)).d(type, annotationArr, this);
            if (hVarD != null) {
                return hVarD;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((h.a) this.f13500d.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f13500d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((h.a) this.f13500d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public h g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public h h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public h i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f13500d.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVarE = ((h.a) this.f13500d.get(i10)).e(type, annotationArr, this);
            if (hVarE != null) {
                return hVarE;
            }
        }
        return C3307b.d.f13325a;
    }
}

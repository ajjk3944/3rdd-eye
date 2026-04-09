package com.bumptech.glide;

import Q2.o;
import W2.l;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import f.AbstractC5487d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    private static volatile b f34165k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile boolean f34166l;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f34167a;

    /* renamed from: b, reason: collision with root package name */
    private final F2.d f34168b;

    /* renamed from: c, reason: collision with root package name */
    private final G2.h f34169c;

    /* renamed from: d, reason: collision with root package name */
    private final d f34170d;

    /* renamed from: e, reason: collision with root package name */
    private final F2.b f34171e;

    /* renamed from: f, reason: collision with root package name */
    private final o f34172f;

    /* renamed from: g, reason: collision with root package name */
    private final Q2.c f34173g;

    /* renamed from: i, reason: collision with root package name */
    private final a f34175i;

    /* renamed from: h, reason: collision with root package name */
    private final List f34174h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private f f34176j = f.NORMAL;

    public interface a {
        com.bumptech.glide.request.f a();
    }

    b(Context context, com.bumptech.glide.load.engine.j jVar, G2.h hVar, F2.d dVar, F2.b bVar, o oVar, Q2.c cVar, int i10, a aVar, Map map, List list, List list2, R2.a aVar2, e eVar) {
        this.f34167a = jVar;
        this.f34168b = dVar;
        this.f34171e = bVar;
        this.f34169c = hVar;
        this.f34172f = oVar;
        this.f34173g = cVar;
        this.f34175i = aVar;
        this.f34170d = new d(context, bVar, h.d(this, list2, aVar2), new T2.b(), aVar, map, list, jVar, eVar, i10);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f34166l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f34166l = true;
        try {
            m(context, generatedAppGlideModule);
        } finally {
            f34166l = false;
        }
    }

    public static b c(Context context) {
        if (f34165k == null) {
            GeneratedAppGlideModule generatedAppGlideModuleD = d(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f34165k == null) {
                        a(context, generatedAppGlideModuleD);
                    }
                } finally {
                }
            }
        }
        return f34165k;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e10) {
            q(e10);
            return null;
        } catch (InstantiationException e11) {
            q(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            q(e12);
            return null;
        } catch (InvocationTargetException e13) {
            q(e13);
            return null;
        }
    }

    private static o l(Context context) {
        W2.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Context applicationContext = context.getApplicationContext();
        List listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listEmptyList = new R2.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            generatedAppGlideModule.d();
            Iterator it = listEmptyList.iterator();
            if (it.hasNext()) {
                AbstractC5487d.a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listEmptyList.iterator();
            if (it2.hasNext()) {
                AbstractC5487d.a(it2.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        cVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it3 = listEmptyList.iterator();
        if (it3.hasNext()) {
            AbstractC5487d.a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b bVarA = cVar.a(applicationContext, listEmptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(bVarA);
        f34165k = bVarA;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static j t(Context context) {
        return l(context).d(context);
    }

    public void b() {
        l.a();
        this.f34169c.b();
        this.f34168b.b();
        this.f34171e.b();
    }

    public F2.b e() {
        return this.f34171e;
    }

    public F2.d f() {
        return this.f34168b;
    }

    Q2.c g() {
        return this.f34173g;
    }

    public Context h() {
        return this.f34170d.getBaseContext();
    }

    d i() {
        return this.f34170d;
    }

    public Registry j() {
        return this.f34170d.h();
    }

    public o k() {
        return this.f34172f;
    }

    void o(j jVar) {
        synchronized (this.f34174h) {
            try {
                if (this.f34174h.contains(jVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f34174h.add(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        r(i10);
    }

    boolean p(T2.d dVar) {
        synchronized (this.f34174h) {
            try {
                Iterator it = this.f34174h.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).A(dVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r(int i10) {
        l.a();
        synchronized (this.f34174h) {
            try {
                Iterator it = this.f34174h.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f34169c.a(i10);
        this.f34168b.a(i10);
        this.f34171e.a(i10);
    }

    void s(j jVar) {
        synchronized (this.f34174h) {
            try {
                if (!this.f34174h.contains(jVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f34174h.remove(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

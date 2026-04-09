package S;

import C.S;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* compiled from: ExtensionVersion.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c f11834a;

    /* compiled from: ExtensionVersion.java */
    public static class a extends c {
        @Override // S.c
        public final e a() {
            return null;
        }
    }

    /* compiled from: ExtensionVersion.java */
    public static class b extends c {

        /* renamed from: c, reason: collision with root package name */
        public static ExtensionVersionImpl f11835c;

        /* renamed from: b, reason: collision with root package name */
        public final S.a f11836b;

        public b() {
            if (f11835c == null) {
                f11835c = new ExtensionVersionImpl();
            }
            ExtensionVersionImpl extensionVersionImpl = f11835c;
            S.b bVar = S.b.f11832b;
            S.a aVarF = e.f(extensionVersionImpl.checkApiVersion(bVar.f11833a.toString()));
            if (aVarF != null && bVar.f11833a.f11828e == aVarF.f11828e) {
                this.f11836b = aVarF;
            }
            S.a("ExtenderVersion", "Selected vendor runtime: " + this.f11836b);
        }

        @Override // S.c
        public final e a() {
            return this.f11836b;
        }
    }

    public static boolean b(S.a aVar) {
        c cVar;
        if (f11834a != null) {
            cVar = f11834a;
        } else {
            synchronized (c.class) {
                if (f11834a == null) {
                    try {
                        f11834a = new b();
                    } catch (NoClassDefFoundError unused) {
                        S.a("ExtenderVersion", "No versioning extender found. Falling back to default.");
                        f11834a = new a();
                    }
                }
            }
            cVar = f11834a;
        }
        e eVarA = cVar.a();
        int i = aVar.f11828e;
        return (eVarA.c() == i ? Integer.compare(eVarA.d(), aVar.f11829f) : Integer.compare(eVarA.c(), i)) >= 0;
    }

    public abstract e a();
}

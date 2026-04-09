package cv;

import java.io.FileNotFoundException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final s f6722a;

    static {
        s sVar;
        try {
            Class.forName("java.nio.file.Files");
            sVar = new t();
        } catch (ClassNotFoundException unused) {
            sVar = new s();
        }
        f6722a = sVar;
        String str = w.f6742d;
        String property = System.getProperty("java.io.tmpdir");
        br.l.d(property, "getProperty(...)");
        cg.e.q(property);
        ClassLoader classLoader = dv.f.class.getClassLoader();
        br.l.d(classLoader, "getClassLoader(...)");
        new dv.f(classLoader);
    }

    public abstract d0 a(w wVar);

    public abstract void b(w wVar, w wVar2);

    public abstract void c(w wVar);

    public abstract void d(w wVar);

    public final void e(w wVar) {
        br.l.e(wVar, "path");
        d(wVar);
    }

    public final boolean f(w wVar) {
        br.l.e(wVar, "path");
        return i(wVar) != null;
    }

    public abstract List g(w wVar);

    public final a3.e h(w wVar) throws FileNotFoundException {
        br.l.e(wVar, "path");
        a3.e eVarI = i(wVar);
        if (eVarI != null) {
            return eVarI;
        }
        throw new FileNotFoundException("no such file: " + wVar);
    }

    public abstract a3.e i(w wVar);

    public abstract r j(w wVar);

    public abstract d0 k(w wVar);

    public abstract f0 l(w wVar);
}

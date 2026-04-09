package j4;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import l4.AbstractC2649c;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public abstract class r extends g4.z {

    /* renamed from: a, reason: collision with root package name */
    public final C2587t f21448a;

    public r(C2587t c2587t) {
        this.f21448a = c2587t;
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        Object objD = d();
        Map map = this.f21448a.f21451a;
        try {
            c2762a.b();
            while (c2762a.o()) {
                C2585q c2585q = (C2585q) map.get(c2762a.v());
                if (c2585q == null) {
                    c2762a.H();
                } else {
                    f(objD, c2762a, c2585q);
                }
            }
            c2762a.k();
            return e(objD);
        } catch (IllegalAccessException e6) {
            R3.b bVar = AbstractC2649c.f21863a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (IllegalStateException e7) {
            throw new g4.p(e7);
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            c2764c.o();
            return;
        }
        c2764c.d();
        try {
            Iterator it = this.f21448a.f21452b.iterator();
            while (it.hasNext()) {
                ((C2585q) it.next()).a(c2764c, obj);
            }
            c2764c.k();
        } catch (IllegalAccessException e6) {
            R3.b bVar = AbstractC2649c.f21863a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, C2762a c2762a, C2585q c2585q);
}

package j4;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import o4.C2762a;
import o4.C2764c;

/* renamed from: j4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2571c extends g4.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21412a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21413b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21414c;

    public C2571c(C2581m c2581m, i4.p pVar) {
        this.f21413b = c2581m;
        this.f21414c = pVar;
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        switch (this.f21412a) {
            case 0:
                if (c2762a.B() == 9) {
                    c2762a.x();
                    return null;
                }
                Collection collection = (Collection) ((i4.p) this.f21414c).d();
                c2762a.a();
                while (c2762a.o()) {
                    collection.add(((C2581m) this.f21413b).f21431c.b(c2762a));
                }
                c2762a.h();
                return collection;
            default:
                Class cls = (Class) this.f21413b;
                Object objB = ((Q) this.f21414c).f21378c.b(c2762a);
                if (objB == null || cls.isInstance(objB)) {
                    return objB;
                }
                throw new g4.p("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + c2762a.n(true));
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        switch (this.f21412a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    c2764c.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C2581m) this.f21413b).c(c2764c, it.next());
                    }
                    c2764c.h();
                    break;
                } else {
                    c2764c.o();
                    break;
                }
            default:
                ((Q) this.f21414c).f21378c.c(c2764c, obj);
                break;
        }
    }

    public C2571c(Q q3, Class cls) {
        this.f21414c = q3;
        this.f21413b = cls;
    }
}

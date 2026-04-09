package F2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final a f5807a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map f5808b = new HashMap();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Object f5809a;

        /* renamed from: b, reason: collision with root package name */
        private List f5810b;

        /* renamed from: c, reason: collision with root package name */
        a f5811c;

        /* renamed from: d, reason: collision with root package name */
        a f5812d;

        a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.f5810b == null) {
                this.f5810b = new ArrayList();
            }
            this.f5810b.add(obj);
        }

        public Object b() {
            int iC = c();
            if (iC > 0) {
                return this.f5810b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f5810b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f5812d = this;
            this.f5811c = this;
            this.f5809a = obj;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f5807a;
        aVar.f5812d = aVar2;
        aVar.f5811c = aVar2.f5811c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f5807a;
        aVar.f5812d = aVar2.f5812d;
        aVar.f5811c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f5812d;
        aVar2.f5811c = aVar.f5811c;
        aVar.f5811c.f5812d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f5811c.f5812d = aVar;
        aVar.f5812d.f5811c = aVar;
    }

    public Object a(l lVar) {
        a aVar = (a) this.f5808b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            this.f5808b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(l lVar, Object obj) {
        a aVar = (a) this.f5808b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            c(aVar);
            this.f5808b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f5807a.f5812d; !aVar.equals(this.f5807a); aVar = aVar.f5812d) {
            Object objB = aVar.b();
            if (objB != null) {
                return objB;
            }
            e(aVar);
            this.f5808b.remove(aVar.f5809a);
            ((l) aVar.f5809a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f5807a.f5811c;
        boolean z10 = false;
        while (!aVar.equals(this.f5807a)) {
            sb2.append('{');
            sb2.append(aVar.f5809a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f5811c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}

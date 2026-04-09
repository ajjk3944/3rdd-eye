package xi;

import com.google.ar.core.ImageFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import mh.InterfaceC6835l;

/* renamed from: xi.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8535b {

    /* renamed from: xi.b$a */
    static class a extends AbstractC2348b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f66149a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f66150b;

        a(InterfaceC6835l interfaceC6835l, boolean[] zArr) {
            this.f66149a = interfaceC6835l;
            this.f66150b = zArr;
        }

        @Override // xi.AbstractC8535b.d
        public boolean c(Object obj) {
            if (((Boolean) this.f66149a.invoke(obj)).booleanValue()) {
                this.f66150b[0] = true;
            }
            return !this.f66150b[0];
        }

        @Override // xi.AbstractC8535b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(this.f66150b[0]);
        }
    }

    /* renamed from: xi.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC2348b implements d {
        @Override // xi.AbstractC8535b.d
        public void b(Object obj) {
        }
    }

    /* renamed from: xi.b$c */
    public interface c {
        Iterable a(Object obj);
    }

    /* renamed from: xi.b$d */
    public interface d {
        Object a();

        void b(Object obj);

        boolean c(Object obj);
    }

    /* renamed from: xi.b$e */
    public interface e {
        boolean a(Object obj);
    }

    /* renamed from: xi.b$f */
    public static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        private final Set f66151a;

        public f() {
            this(new HashSet());
        }

        private static /* synthetic */ void b(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // xi.AbstractC8535b.e
        public boolean a(Object obj) {
            return this.f66151a.add(obj);
        }

        public f(Set set) {
            if (set == null) {
                b(0);
            }
            this.f66151a = set;
        }
    }

    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(Collection collection, c cVar, d dVar) {
        if (collection == null) {
            a(4);
        }
        if (cVar == null) {
            a(5);
        }
        if (dVar == null) {
            a(6);
        }
        return c(collection, cVar, new f(), dVar);
    }

    public static Object c(Collection collection, c cVar, e eVar, d dVar) {
        if (collection == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        if (eVar == null) {
            a(2);
        }
        if (dVar == null) {
            a(3);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d(it.next(), cVar, eVar, dVar);
        }
        return dVar.a();
    }

    public static void d(Object obj, c cVar, e eVar, d dVar) {
        if (obj == null) {
            a(22);
        }
        if (cVar == null) {
            a(23);
        }
        if (eVar == null) {
            a(24);
        }
        if (dVar == null) {
            a(25);
        }
        if (eVar.a(obj) && dVar.c(obj)) {
            Iterator it = cVar.a(obj).iterator();
            while (it.hasNext()) {
                d(it.next(), cVar, eVar, dVar);
            }
            dVar.b(obj);
        }
    }

    public static Boolean e(Collection collection, c cVar, InterfaceC6835l interfaceC6835l) {
        if (collection == null) {
            a(7);
        }
        if (cVar == null) {
            a(8);
        }
        if (interfaceC6835l == null) {
            a(9);
        }
        return (Boolean) b(collection, cVar, new a(interfaceC6835l, new boolean[1]));
    }
}

package rt;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.o;
import mq.w;
import qr.q;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final i f21799a = new i();

    public static final void a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List d(ArrayList arrayList) {
        l.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return w.f16945a;
        }
        if (size == 1) {
            return e5.H(o.r0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static Object e(List list, a aVar, k kVar) {
        ng.c cVar = new ng.c(2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f(it.next(), aVar, cVar, kVar);
        }
        return kVar.i();
    }

    public static void f(Object obj, a aVar, ng.c cVar, k kVar) {
        if (obj != null) {
            if (cVar.f17548a.add(obj) && kVar.c(obj)) {
                Iterator it = aVar.d(obj).iterator();
                while (it.hasNext()) {
                    f(it.next(), aVar, cVar, kVar);
                }
                kVar.b(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
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
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
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
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
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
            case 22:
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

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean g(List list, a aVar, ar.k kVar) {
        return (Boolean) e(list, aVar, new q(kVar, new boolean[1], 1));
    }

    public static final boolean h(Throwable th2) {
        Class<?> superclass = th2.getClass();
        while (!l.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void j(Object obj) throws Throwable {
        if (obj instanceof j) {
            throw ((j) obj).f21798a;
        }
    }

    public abstract boolean c(Object obj);

    public abstract Object i();

    public void b(Object obj) {
    }
}

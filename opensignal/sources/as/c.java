package as;

import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f2202c;

    /* renamed from: a, reason: collision with root package name */
    public final v f2203a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2204b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a aVar : a.values()) {
            String javaTarget = aVar.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, aVar);
            }
        }
        f2202c = linkedHashMap;
    }

    public c(v vVar) {
        br.l.e(vVar, "javaTypeEnhancementState");
        this.f2203a = vVar;
        this.f2204b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object obj, boolean z10) {
        sr.b bVar = (sr.b) obj;
        br.l.e(bVar, "<this>");
        Map mapB = bVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapB.entrySet()) {
            mq.t.d0(arrayList, (!z10 || br.l.a((qs.g) entry.getKey(), a0.f2167b)) ? j((vs.g) entry.getValue()) : mq.w.f16945a);
        }
        return arrayList;
    }

    public static Object c(Object obj, qs.c cVar) {
        for (Object obj2 : e(obj)) {
            if (br.l.a(d(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public static qs.c d(Object obj) {
        sr.b bVar = (sr.b) obj;
        br.l.e(bVar, "<this>");
        return bVar.a();
    }

    public static Iterable e(Object obj) {
        sr.h annotations;
        sr.b bVar = (sr.b) obj;
        br.l.e(bVar, "<this>");
        rr.f fVarD = xs.d.d(bVar);
        return (fVarD == null || (annotations = fVarD.getAnnotations()) == null) ? mq.w.f16945a : annotations;
    }

    public static boolean f(Object obj, qs.c cVar) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (br.l.a(d(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List j(vs.g gVar) {
        if (!(gVar instanceof vs.b)) {
            return gVar instanceof vs.i ? e5.H(((vs.i) gVar).f23959c.c()) : mq.w.f16945a;
        }
        Iterable iterable = (Iterable) ((vs.b) gVar).f23957a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mq.t.d0(arrayList, j((vs.g) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final as.w b(as.w r12, sr.h r13) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: as.c.b(as.w, sr.h):as.w");
    }

    public final is.h g(Object obj, boolean z10) {
        is.g gVar;
        qs.c cVarD = d(obj);
        if (cVarD == null) {
            return null;
        }
        this.f2203a.getClass();
        f0 f0Var = (f0) u.E.a(cVarD);
        if (f0Var.isIgnore()) {
            return null;
        }
        if (b0.f2194g.contains(cVarD)) {
            gVar = is.g.NULLABLE;
        } else if (b0.j.contains(cVarD)) {
            gVar = is.g.NOT_NULL;
        } else {
            if (cVarD.equals(b0.f2188a) ? true : cVarD.equals(b0.f2191d)) {
                gVar = is.g.NULLABLE;
            } else {
                if (cVarD.equals(b0.f2189b) ? true : cVarD.equals(b0.f2192e)) {
                    gVar = is.g.FORCE_FLEXIBILITY;
                } else if (cVarD.equals(b0.f2195h)) {
                    String str = (String) mq.o.s0(a(obj, false));
                    if (str != null) {
                        switch (str.hashCode()) {
                            case 73135176:
                                if (!str.equals("MAYBE")) {
                                    return null;
                                }
                                gVar = is.g.NULLABLE;
                                break;
                            case 74175084:
                                if (!str.equals("NEVER")) {
                                    return null;
                                }
                                gVar = is.g.NULLABLE;
                                break;
                            case 433141802:
                                if (!str.equals("UNKNOWN")) {
                                    return null;
                                }
                                gVar = is.g.FORCE_FLEXIBILITY;
                                break;
                            case 1933739535:
                                if (!str.equals("ALWAYS")) {
                                    return null;
                                }
                                gVar = is.g.NOT_NULL;
                                break;
                            default:
                                return null;
                        }
                    } else {
                        gVar = is.g.NOT_NULL;
                    }
                } else if (cVarD.equals(b0.k)) {
                    gVar = is.g.NULLABLE;
                } else if (cVarD.equals(b0.f2197l) || cVarD.equals(b0.f2199n)) {
                    gVar = is.g.NOT_NULL;
                } else {
                    if (!cVarD.equals(b0.f2198m)) {
                        return null;
                    }
                    gVar = is.g.NULLABLE;
                }
            }
        }
        return new is.h(gVar, f0Var.isWarning() || z10);
    }

    public final f0 h(Object obj) {
        String str;
        v vVar = this.f2203a;
        f0 f0Var = (f0) vVar.f2254a.f2261c.get(d(obj));
        if (f0Var != null) {
            return f0Var;
        }
        Object objC = c(obj, b.f2184d);
        if (objC == null || (str = (String) mq.o.s0(a(objC, false))) == null) {
            return null;
        }
        f0 f0Var2 = vVar.f2254a.f2260b;
        if (f0Var2 != null) {
            return f0Var2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return f0.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return f0.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return f0.WARN;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object objI;
        br.l.e(obj, "annotation");
        if (!this.f2203a.f2254a.f2262d) {
            if (mq.o.k0(b.f2187g, d(obj)) || f(obj, b.f2182b)) {
                return obj;
            }
            if (f(obj, b.f2181a)) {
                rr.f fVarD = xs.d.d((sr.b) obj);
                br.l.b(fVarD);
                ConcurrentHashMap concurrentHashMap = this.f2204b;
                Object obj2 = concurrentHashMap.get(fVarD);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = e(obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                    if (objI != null) {
                        break;
                    }
                }
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(fVarD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}

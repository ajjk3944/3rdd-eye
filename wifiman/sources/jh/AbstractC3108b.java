package Jh;

import Rh.C3484l;
import Rh.EnumC3481i;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import mh.InterfaceC6835l;

/* renamed from: Jh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3108b {

    /* renamed from: c, reason: collision with root package name */
    private static final a f10180c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Map f10181d;

    /* renamed from: a, reason: collision with root package name */
    private final D f10182a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f10183b;

    /* renamed from: Jh.b$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC3109c enumC3109c : EnumC3109c.values()) {
            String javaTarget = enumC3109c.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, enumC3109c);
            }
        }
        f10181d = linkedHashMap;
    }

    public AbstractC3108b(D javaTypeEnhancementState) {
        AbstractC6492s.i(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f10182a = javaTypeEnhancementState;
        this.f10183b = new ConcurrentHashMap();
    }

    private final Set b(Set set) {
        return set.contains(EnumC3109c.TYPE_USE) ? d0.l(d0.k(AbstractC3682n.p1(EnumC3109c.values()), EnumC3109c.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    private final w e(Object obj) {
        C3484l c3484lI;
        w wVarU = u(obj);
        if (wVarU != null) {
            return wVarU;
        }
        Yg.s sVarW = w(obj);
        if (sVarW == null) {
            return null;
        }
        Object objA = sVarW.a();
        Set set = (Set) sVarW.c();
        O oT = t(obj);
        if (oT == null) {
            oT = s(objA);
        }
        if (oT.isIgnore() || (c3484lI = i(objA, C3107a.f10179a)) == null) {
            return null;
        }
        return new w(C3484l.b(c3484lI, null, oT.isWarning(), 1, null), set, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object extractNullability) {
        AbstractC6492s.i(extractNullability, "$this$extractNullability");
        return false;
    }

    private final C3484l i(Object obj, InterfaceC6835l interfaceC6835l) {
        C3484l c3484lQ;
        C3484l c3484lQ2 = q(obj, ((Boolean) interfaceC6835l.invoke(obj)).booleanValue());
        if (c3484lQ2 != null) {
            return c3484lQ2;
        }
        Object objV = v(obj);
        if (objV == null) {
            return null;
        }
        O oS = s(obj);
        if (oS.isIgnore() || (c3484lQ = q(objV, ((Boolean) interfaceC6835l.invoke(objV)).booleanValue())) == null) {
            return null;
        }
        return C3484l.b(c3484lQ, null, oS.isWarning(), 1, null);
    }

    private final Object j(Object obj, Zh.c cVar) {
        for (Object obj2 : m(obj)) {
            if (AbstractC6492s.d(k(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    private final boolean n(Object obj, Zh.c cVar) {
        Iterable iterableM = m(obj);
        if ((iterableM instanceof Collection) && ((Collection) iterableM).isEmpty()) {
            return false;
        }
        Iterator it = iterableM.iterator();
        while (it.hasNext()) {
            if (AbstractC6492s.d(k(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = Rh.EnumC3483k.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Rh.C3484l q(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            Zh.c r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            Jh.D r2 = r5.f10182a
            mh.l r2 = r2.c()
            java.lang.Object r2 = r2.invoke(r0)
            Jh.O r2 = (Jh.O) r2
            boolean r3 = r2.isIgnore()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = Jh.J.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            Rh.k r6 = Rh.EnumC3483k.NOT_NULL
            goto L8d
        L29:
            java.util.Set r3 = Jh.J.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            Rh.k r6 = Rh.EnumC3483k.NULLABLE
            goto L8d
        L36:
            java.util.Set r3 = Jh.J.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            Rh.k r6 = Rh.EnumC3483k.FORCE_FLEXIBILITY
            goto L8d
        L43:
            Zh.c r3 = Jh.J.c()
            boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = Zg.AbstractC3689v.r0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            Rh.k r6 = Rh.EnumC3483k.FORCE_FLEXIBILITY
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            Rh.k r6 = Rh.EnumC3483k.NULLABLE
            goto L8d
        L8b:
            Rh.k r6 = Rh.EnumC3483k.NOT_NULL
        L8d:
            Rh.l r0 = new Rh.l
            boolean r1 = r2.isWarning()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.AbstractC3108b.q(java.lang.Object, boolean):Rh.l");
    }

    private final O r(Object obj) {
        Zh.c cVarK = k(obj);
        return (cVarK == null || !x.b().containsKey(cVarK)) ? s(obj) : (O) this.f10182a.c().invoke(cVarK);
    }

    private final O s(Object obj) {
        O oT = t(obj);
        return oT != null ? oT : this.f10182a.d().c();
    }

    private final O t(Object obj) {
        Iterable iterableC;
        String str;
        O o10 = (O) this.f10182a.d().e().get(k(obj));
        if (o10 != null) {
            return o10;
        }
        Object objJ = j(obj, J.p());
        if (objJ == null || (iterableC = c(objJ, false)) == null || (str = (String) AbstractC3689v.r0(iterableC)) == null) {
            return null;
        }
        O oD = this.f10182a.d().d();
        if (oD != null) {
            return oD;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return O.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return O.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return O.WARN;
        }
        return null;
    }

    private final w u(Object obj) {
        w wVar;
        if (this.f10182a.b() || (wVar = (w) x.a().get(k(obj))) == null) {
            return null;
        }
        O oR = r(obj);
        if (oR == O.IGNORE) {
            oR = null;
        }
        if (oR == null) {
            return null;
        }
        return w.b(wVar, C3484l.b(wVar.d(), null, oR.isWarning(), 1, null), null, false, 6, null);
    }

    private final Yg.s w(Object obj) {
        Object objJ;
        Object next;
        if (this.f10182a.d().f() || (objJ = j(obj, J.g())) == null) {
            return null;
        }
        Iterator it = m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (v(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable iterableC = c(objJ, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = iterableC.iterator();
        while (it2.hasNext()) {
            EnumC3109c enumC3109c = (EnumC3109c) f10181d.get((String) it2.next());
            if (enumC3109c != null) {
                linkedHashSet.add(enumC3109c);
            }
        }
        return new Yg.s(next, b(linkedHashSet));
    }

    protected abstract Iterable c(Object obj, boolean z10);

    public final E d(E e10, Iterable annotations) {
        EnumMap enumMapB;
        AbstractC6492s.i(annotations, "annotations");
        if (this.f10182a.b()) {
            return e10;
        }
        ArrayList<w> arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            w wVarE = e(it.next());
            if (wVarE != null) {
                arrayList.add(wVarE);
            }
        }
        if (arrayList.isEmpty()) {
            return e10;
        }
        EnumMap enumMap = new EnumMap(EnumC3109c.class);
        for (w wVar : arrayList) {
            for (EnumC3109c enumC3109c : wVar.e()) {
                if (enumMap.containsKey(enumC3109c) && o()) {
                    w wVar2 = (w) enumMap.get(enumC3109c);
                    if (wVar2 != null) {
                        C3484l c3484lD = wVar2.d();
                        C3484l c3484lD2 = wVar.d();
                        if (!AbstractC6492s.d(c3484lD2, c3484lD) && (!c3484lD2.d() || c3484lD.d())) {
                            wVar2 = (c3484lD2.d() || !c3484lD.d()) ? null : wVar;
                        }
                        enumMap.put((EnumMap) enumC3109c, (EnumC3109c) wVar2);
                    }
                } else {
                    enumMap.put((EnumMap) enumC3109c, (EnumC3109c) wVar);
                }
            }
        }
        EnumMap enumMap2 = (e10 == null || (enumMapB = e10.b()) == null) ? new EnumMap(EnumC3109c.class) : new EnumMap(enumMapB);
        boolean z10 = false;
        for (Map.Entry entry : enumMap.entrySet()) {
            EnumC3109c enumC3109c2 = (EnumC3109c) entry.getKey();
            w wVar3 = (w) entry.getValue();
            if (wVar3 != null) {
                enumMap2.put((EnumMap) enumC3109c2, (EnumC3109c) wVar3);
                z10 = true;
            }
        }
        return !z10 ? e10 : new E(enumMap2);
    }

    public final EnumC3481i g(Iterable annotations) {
        EnumC3481i enumC3481i;
        AbstractC6492s.i(annotations, "annotations");
        Iterator it = annotations.iterator();
        EnumC3481i enumC3481i2 = null;
        while (it.hasNext()) {
            Zh.c cVarK = k(it.next());
            if (AbstractC3689v.f0(J.o(), cVarK)) {
                enumC3481i = EnumC3481i.READ_ONLY;
            } else if (AbstractC3689v.f0(J.l(), cVarK)) {
                enumC3481i = EnumC3481i.MUTABLE;
            } else {
                continue;
            }
            if (enumC3481i2 != null && enumC3481i2 != enumC3481i) {
                return null;
            }
            enumC3481i2 = enumC3481i;
        }
        return enumC3481i2;
    }

    public final C3484l h(Iterable annotations, InterfaceC6835l forceWarning) {
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(forceWarning, "forceWarning");
        Iterator it = annotations.iterator();
        C3484l c3484l = null;
        while (it.hasNext()) {
            C3484l c3484lI = i(it.next(), forceWarning);
            if (c3484l != null) {
                if (c3484lI != null && !AbstractC6492s.d(c3484lI, c3484l) && (!c3484lI.d() || c3484l.d())) {
                    if (c3484lI.d() || !c3484l.d()) {
                        return null;
                    }
                }
            }
            c3484l = c3484lI;
        }
        return c3484l;
    }

    protected abstract Zh.c k(Object obj);

    protected abstract Object l(Object obj);

    protected abstract Iterable m(Object obj);

    public abstract boolean o();

    public final boolean p(Object annotation) {
        AbstractC6492s.i(annotation, "annotation");
        Object objJ = j(annotation, o.a.f51817H);
        if (objJ == null) {
            return false;
        }
        Iterable iterableC = c(objJ, false);
        if ((iterableC instanceof Collection) && ((Collection) iterableC).isEmpty()) {
            return false;
        }
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            if (AbstractC6492s.d((String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final Object v(Object annotation) {
        Object objV;
        AbstractC6492s.i(annotation, "annotation");
        if (this.f10182a.d().f()) {
            return null;
        }
        if (AbstractC3689v.f0(J.a(), k(annotation)) || n(annotation, J.f())) {
            return annotation;
        }
        if (!n(annotation, J.h())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f10183b;
        Object objL = l(annotation);
        Object obj = concurrentHashMap.get(objL);
        if (obj != null) {
            return obj;
        }
        Iterator it = m(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                objV = null;
                break;
            }
            objV = v(it.next());
            if (objV != null) {
                break;
            }
        }
        if (objV == null) {
            return null;
        }
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(objL, objV);
        return objPutIfAbsent == null ? objV : objPutIfAbsent;
    }
}

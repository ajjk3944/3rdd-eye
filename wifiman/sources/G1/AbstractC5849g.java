package g1;

import h1.C5944a;
import h1.i;
import h1.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: g1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5849g {

    /* renamed from: k, reason: collision with root package name */
    public static final Integer f47485k = 0;

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC5845c f47486a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f47487b = true;

    /* renamed from: c, reason: collision with root package name */
    protected HashMap f47488c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    protected HashMap f47489d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    HashMap f47490e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final C5843a f47491f;

    /* renamed from: g, reason: collision with root package name */
    private int f47492g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f47493h;

    /* renamed from: i, reason: collision with root package name */
    ArrayList f47494i;

    /* renamed from: j, reason: collision with root package name */
    boolean f47495j;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 g1.g$a, still in use, count: 1, list:
  (r0v0 g1.g$a) from 0x0044: INVOKE 
  (wrap:java.util.Map<java.lang.String, g1.g$a>:0x0040: SGET  A[WRAPPED] g1.g.a.chainMap java.util.Map)
  ("spread")
  (r0v0 g1.g$a)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: g1.g$a */
    public static final class a {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;

        public static Map<String, a> chainMap = new HashMap();
        public static Map<String, Integer> valueMap = new HashMap();

        static {
            chainMap.put("packed", new a());
            chainMap.put("spread_inside", new a());
            chainMap.put("spread", new a());
            valueMap.put("packed", 2);
            valueMap.put("spread_inside", 1);
            valueMap.put("spread", 0);
        }

        private a() {
        }

        public static a getChainByString(String str) {
            if (chainMap.containsKey(str)) {
                return chainMap.get(str);
            }
            return null;
        }

        public static int getValueByString(String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: g1.g$b */
    public enum b {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    /* renamed from: g1.g$c */
    public enum c {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* renamed from: g1.g$d */
    public enum d {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 g1.g$e, still in use, count: 1, list:
  (r0v0 g1.g$e) from 0x0036: INVOKE 
  (wrap:java.util.Map<java.lang.String, g1.g$e>:0x0032: SGET  A[WRAPPED] g1.g.e.wrapMap java.util.Map)
  ("none")
  (r0v0 g1.g$e)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: g1.g$e */
    public static final class e {
        NONE,
        CHAIN,
        ALIGNED;

        public static Map<String, e> wrapMap = new HashMap();
        public static Map<String, Integer> valueMap = new HashMap();

        static {
            wrapMap.put("none", new e());
            wrapMap.put("chain", new e());
            wrapMap.put("aligned", new e());
            valueMap.put("none", 0);
            valueMap.put("chain", 3);
            valueMap.put("aligned", 2);
        }

        private e() {
        }

        public static e getChainByString(String str) {
            if (wrapMap.containsKey(str)) {
                return wrapMap.get(str);
            }
            return null;
        }

        public static int getValueByString(String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    public AbstractC5849g() {
        C5843a c5843a = new C5843a(this);
        this.f47491f = c5843a;
        this.f47492g = 0;
        this.f47493h = new ArrayList();
        this.f47494i = new ArrayList();
        this.f47495j = true;
        Integer num = f47485k;
        c5843a.b(num);
        this.f47488c.put(num, c5843a);
    }

    private String g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("__HELPER_KEY_");
        int i10 = this.f47492g;
        this.f47492g = i10 + 1;
        sb2.append(i10);
        sb2.append("__");
        return sb2.toString();
    }

    public j A() {
        return (j) n(null, d.VERTICAL_CHAIN);
    }

    public h1.h B(Object obj) {
        return l(obj, 1);
    }

    public AbstractC5849g C(C5846d c5846d) {
        return z(c5846d);
    }

    public void a(j1.f fVar) {
        C5847e c5847e;
        j1.j jVarU0;
        j1.j jVarU02;
        fVar.f1();
        this.f47491f.E().a(this, fVar, 0);
        this.f47491f.C().a(this, fVar, 1);
        for (Object obj : this.f47489d.keySet()) {
            j1.j jVarU03 = ((C5847e) this.f47489d.get(obj)).u0();
            if (jVarU03 != null) {
                InterfaceC5848f interfaceC5848fD = (InterfaceC5848f) this.f47488c.get(obj);
                if (interfaceC5848fD == null) {
                    interfaceC5848fD = d(obj);
                }
                interfaceC5848fD.d(jVarU03);
            }
        }
        for (Object obj2 : this.f47488c.keySet()) {
            InterfaceC5848f interfaceC5848f = (InterfaceC5848f) this.f47488c.get(obj2);
            if (interfaceC5848f != this.f47491f && (interfaceC5848f.c() instanceof C5847e) && (jVarU02 = ((C5847e) interfaceC5848f.c()).u0()) != null) {
                InterfaceC5848f interfaceC5848fD2 = (InterfaceC5848f) this.f47488c.get(obj2);
                if (interfaceC5848fD2 == null) {
                    interfaceC5848fD2 = d(obj2);
                }
                interfaceC5848fD2.d(jVarU02);
            }
        }
        Iterator it = this.f47488c.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC5848f interfaceC5848f2 = (InterfaceC5848f) this.f47488c.get(it.next());
            if (interfaceC5848f2 != this.f47491f) {
                j1.e eVarA = interfaceC5848f2.a();
                eVarA.q0(interfaceC5848f2.getKey().toString());
                eVarA.M0(null);
                if (interfaceC5848f2.c() instanceof h1.h) {
                    interfaceC5848f2.apply();
                }
                fVar.a1(eVarA);
            } else {
                interfaceC5848f2.d(fVar);
            }
        }
        Iterator it2 = this.f47489d.keySet().iterator();
        while (it2.hasNext()) {
            C5847e c5847e2 = (C5847e) this.f47489d.get(it2.next());
            if (c5847e2.u0() != null) {
                Iterator it3 = c5847e2.f47483o0.iterator();
                while (it3.hasNext()) {
                    c5847e2.u0().a1(((InterfaceC5848f) this.f47488c.get(it3.next())).a());
                }
                c5847e2.apply();
            } else {
                c5847e2.apply();
            }
        }
        Iterator it4 = this.f47488c.keySet().iterator();
        while (it4.hasNext()) {
            InterfaceC5848f interfaceC5848f3 = (InterfaceC5848f) this.f47488c.get(it4.next());
            if (interfaceC5848f3 != this.f47491f && (interfaceC5848f3.c() instanceof C5847e) && (jVarU0 = (c5847e = (C5847e) interfaceC5848f3.c()).u0()) != null) {
                Iterator it5 = c5847e.f47483o0.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    InterfaceC5848f interfaceC5848f4 = (InterfaceC5848f) this.f47488c.get(next);
                    if (interfaceC5848f4 != null) {
                        jVarU0.a1(interfaceC5848f4.a());
                    } else if (next instanceof InterfaceC5848f) {
                        jVarU0.a1(((InterfaceC5848f) next).a());
                    } else {
                        System.out.println("couldn't find reference for " + next);
                    }
                }
                interfaceC5848f3.apply();
            }
        }
        for (Object obj3 : this.f47488c.keySet()) {
            InterfaceC5848f interfaceC5848f5 = (InterfaceC5848f) this.f47488c.get(obj3);
            interfaceC5848f5.apply();
            j1.e eVarA2 = interfaceC5848f5.a();
            if (eVarA2 != null && obj3 != null) {
                eVarA2.f49920o = obj3.toString();
            }
        }
    }

    public h1.c b(Object obj, c cVar) {
        C5843a c5843aD = d(obj);
        if (c5843aD.c() == null || !(c5843aD.c() instanceof h1.c)) {
            h1.c cVar2 = new h1.c(this);
            cVar2.w0(cVar);
            c5843aD.X(cVar2);
        }
        return (h1.c) c5843aD.c();
    }

    public void c(Object obj) {
        this.f47493h.add(obj);
        this.f47495j = true;
    }

    public C5843a d(Object obj) {
        InterfaceC5848f interfaceC5848fF = (InterfaceC5848f) this.f47488c.get(obj);
        if (interfaceC5848fF == null) {
            interfaceC5848fF = f(obj);
            this.f47488c.put(obj, interfaceC5848fF);
            interfaceC5848fF.b(obj);
        }
        if (interfaceC5848fF instanceof C5843a) {
            return (C5843a) interfaceC5848fF;
        }
        return null;
    }

    public int e(Object obj) {
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public C5843a f(Object obj) {
        return new C5843a(this);
    }

    InterfaceC5845c h() {
        return this.f47486a;
    }

    public h1.f i(Object obj, boolean z10) {
        C5843a c5843aD = d(obj);
        if (c5843aD.c() == null || !(c5843aD.c() instanceof h1.f)) {
            c5843aD.X(z10 ? new h1.f(this, d.VERTICAL_FLOW) : new h1.f(this, d.HORIZONTAL_FLOW));
        }
        return (h1.f) c5843aD.c();
    }

    public h1.g j(Object obj, String str) {
        C5843a c5843aD = d(obj);
        if (c5843aD.c() == null || !(c5843aD.c() instanceof h1.g)) {
            d dVar = d.GRID;
            if (str.charAt(0) == 'r') {
                dVar = d.ROW;
            } else if (str.charAt(0) == 'c') {
                dVar = d.COLUMN;
            }
            c5843aD.X(new h1.g(this, dVar));
        }
        return (h1.g) c5843aD.c();
    }

    public ArrayList k(String str) {
        if (this.f47490e.containsKey(str)) {
            return (ArrayList) this.f47490e.get(str);
        }
        return null;
    }

    public h1.h l(Object obj, int i10) {
        C5843a c5843aD = d(obj);
        if (c5843aD.c() == null || !(c5843aD.c() instanceof h1.h)) {
            h1.h hVar = new h1.h(this);
            hVar.g(i10);
            hVar.b(obj);
            c5843aD.X(hVar);
        }
        return (h1.h) c5843aD.c();
    }

    public AbstractC5849g m(C5846d c5846d) {
        return w(c5846d);
    }

    public C5847e n(Object obj, d dVar) {
        C5847e iVar;
        if (obj == null) {
            obj = g();
        }
        C5847e fVar = (C5847e) this.f47489d.get(obj);
        if (fVar == null) {
            switch (dVar) {
                case HORIZONTAL_CHAIN:
                    iVar = new i(this);
                    fVar = iVar;
                    break;
                case VERTICAL_CHAIN:
                    iVar = new j(this);
                    fVar = iVar;
                    break;
                case ALIGN_HORIZONTALLY:
                    iVar = new C5944a(this);
                    fVar = iVar;
                    break;
                case ALIGN_VERTICALLY:
                    iVar = new h1.b(this);
                    fVar = iVar;
                    break;
                case BARRIER:
                    iVar = new h1.c(this);
                    fVar = iVar;
                    break;
                case LAYER:
                default:
                    fVar = new C5847e(this, dVar);
                    break;
                case HORIZONTAL_FLOW:
                case VERTICAL_FLOW:
                    fVar = new h1.f(this, dVar);
                    break;
                case GRID:
                case ROW:
                case COLUMN:
                    fVar = new h1.g(this, dVar);
                    break;
            }
            fVar.b(obj);
            this.f47489d.put(obj, fVar);
        }
        return fVar;
    }

    public i o() {
        return (i) n(null, d.HORIZONTAL_CHAIN);
    }

    public h1.h p(Object obj) {
        return l(obj, 0);
    }

    public boolean q(j1.e eVar) {
        if (this.f47495j) {
            this.f47494i.clear();
            Iterator it = this.f47493h.iterator();
            while (it.hasNext()) {
                j1.e eVarA = ((InterfaceC5848f) this.f47488c.get(it.next())).a();
                if (eVarA != null) {
                    this.f47494i.add(eVarA);
                }
            }
            this.f47495j = false;
        }
        return this.f47494i.contains(eVar);
    }

    public boolean r() {
        return !this.f47487b;
    }

    public void s(Object obj, Object obj2) {
        C5843a c5843aD = d(obj);
        if (c5843aD != null) {
            c5843aD.e0(obj2);
        }
    }

    InterfaceC5848f t(Object obj) {
        return (InterfaceC5848f) this.f47488c.get(obj);
    }

    public void u() {
        Iterator it = this.f47488c.keySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC5848f) this.f47488c.get(it.next())).a().k0();
        }
        this.f47488c.clear();
        this.f47488c.put(f47485k, this.f47491f);
        this.f47489d.clear();
        this.f47490e.clear();
        this.f47493h.clear();
        this.f47495j = true;
    }

    public void v(InterfaceC5845c interfaceC5845c) {
        this.f47486a = interfaceC5845c;
    }

    public AbstractC5849g w(C5846d c5846d) {
        this.f47491f.Y(c5846d);
        return this;
    }

    public void x(boolean z10) {
        this.f47487b = !z10;
    }

    public void y(String str, String str2) {
        ArrayList arrayList;
        C5843a c5843aD = d(str);
        if (c5843aD != null) {
            c5843aD.b0(str2);
            if (this.f47490e.containsKey(str2)) {
                arrayList = (ArrayList) this.f47490e.get(str2);
            } else {
                arrayList = new ArrayList();
                this.f47490e.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public AbstractC5849g z(C5846d c5846d) {
        this.f47491f.f0(c5846d);
        return this;
    }
}

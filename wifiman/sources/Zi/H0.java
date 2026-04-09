package Zi;

import Xi.n;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public class H0 implements Xi.f, InterfaceC3720n {

    /* renamed from: a, reason: collision with root package name */
    private final String f25554a;

    /* renamed from: b, reason: collision with root package name */
    private final M f25555b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25556c;

    /* renamed from: d, reason: collision with root package name */
    private int f25557d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f25558e;

    /* renamed from: f, reason: collision with root package name */
    private final List[] f25559f;

    /* renamed from: g, reason: collision with root package name */
    private List f25560g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f25561h;

    /* renamed from: i, reason: collision with root package name */
    private Map f25562i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f25563j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f25564k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f25565l;

    public H0(String serialName, M m10, int i10) {
        AbstractC6492s.i(serialName, "serialName");
        this.f25554a = serialName;
        this.f25555b = m10;
        this.f25556c = i10;
        this.f25557d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f25558e = strArr;
        int i12 = this.f25556c;
        this.f25559f = new List[i12];
        this.f25561h = new boolean[i12];
        this.f25562i = Zg.U.h();
        Yg.q qVar = Yg.q.PUBLICATION;
        this.f25563j = Yg.n.a(qVar, new InterfaceC6824a() { // from class: Zi.E0
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return H0.s(this.f25544a);
            }
        });
        this.f25564k = Yg.n.a(qVar, new InterfaceC6824a() { // from class: Zi.F0
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return H0.x(this.f25548a);
            }
        });
        this.f25565l = Yg.n.a(qVar, new InterfaceC6824a() { // from class: Zi.G0
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return Integer.valueOf(H0.o(this.f25551a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(H0 h02) {
        return I0.a(h02, h02.u());
    }

    public static /* synthetic */ void q(H0 h02, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        h02.p(str, z10);
    }

    private final Map r() {
        HashMap map = new HashMap();
        int length = this.f25558e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f25558e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vi.b[] s(H0 h02) {
        Vi.b[] bVarArrD;
        M m10 = h02.f25555b;
        return (m10 == null || (bVarArrD = m10.d()) == null) ? J0.f25571a : bVarArrD;
    }

    private final Vi.b[] t() {
        return (Vi.b[]) this.f25563j.getValue();
    }

    private final int v() {
        return ((Number) this.f25565l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence w(H0 h02, int i10) {
        return h02.f(i10) + ": " + h02.i(i10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f[] x(H0 h02) {
        ArrayList arrayList;
        Vi.b[] bVarArrB;
        M m10 = h02.f25555b;
        if (m10 == null || (bVarArrB = m10.b()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(bVarArrB.length);
            for (Vi.b bVar : bVarArrB) {
                arrayList.add(bVar.a());
            }
        }
        return B0.b(arrayList);
    }

    @Override // Xi.f
    public String a() {
        return this.f25554a;
    }

    @Override // Zi.InterfaceC3720n
    public Set b() {
        return this.f25562i.keySet();
    }

    @Override // Xi.f
    public int d(String name) {
        AbstractC6492s.i(name, "name");
        Integer num = (Integer) this.f25562i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // Xi.f
    public final int e() {
        return this.f25556c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H0) {
            Xi.f fVar = (Xi.f) obj;
            if (AbstractC6492s.d(a(), fVar.a()) && Arrays.equals(u(), ((H0) obj).u()) && e() == fVar.e()) {
                int iE = e();
                for (int i10 = 0; i10 < iE; i10++) {
                    if (AbstractC6492s.d(i(i10).a(), fVar.i(i10).a()) && AbstractC6492s.d(i(i10).h(), fVar.i(i10).h())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // Xi.f
    public String f(int i10) {
        return this.f25558e[i10];
    }

    @Override // Xi.f
    public List g(int i10) {
        List list = this.f25559f[i10];
        return list == null ? AbstractC3689v.l() : list;
    }

    @Override // Xi.f
    public List getAnnotations() {
        List list = this.f25560g;
        return list == null ? AbstractC3689v.l() : list;
    }

    @Override // Xi.f
    public Xi.m h() {
        return n.a.f24470a;
    }

    public int hashCode() {
        return v();
    }

    @Override // Xi.f
    public Xi.f i(int i10) {
        return t()[i10].a();
    }

    @Override // Xi.f
    public boolean j(int i10) {
        return this.f25561h[i10];
    }

    public final void p(String name, boolean z10) {
        AbstractC6492s.i(name, "name");
        String[] strArr = this.f25558e;
        int i10 = this.f25557d + 1;
        this.f25557d = i10;
        strArr[i10] = name;
        this.f25561h[i10] = z10;
        this.f25559f[i10] = null;
        if (i10 == this.f25556c - 1) {
            this.f25562i = r();
        }
    }

    public String toString() {
        return AbstractC3689v.z0(AbstractC7978m.s(0, this.f25556c), ", ", a() + '(', ")", 0, null, new InterfaceC6835l() { // from class: Zi.D0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return H0.w(this.f25537a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public final Xi.f[] u() {
        return (Xi.f[]) this.f25564k.getValue();
    }

    public /* synthetic */ H0(String str, M m10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : m10, i10);
    }
}

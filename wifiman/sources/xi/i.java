package Xi;

import Yg.z;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.N;
import Zg.U;
import Zi.B0;
import Zi.I0;
import Zi.InterfaceC3720n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class i implements f, InterfaceC3720n {

    /* renamed from: a, reason: collision with root package name */
    private final String f24450a;

    /* renamed from: b, reason: collision with root package name */
    private final m f24451b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24452c;

    /* renamed from: d, reason: collision with root package name */
    private final List f24453d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f24454e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f24455f;

    /* renamed from: g, reason: collision with root package name */
    private final f[] f24456g;

    /* renamed from: h, reason: collision with root package name */
    private final List[] f24457h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f24458i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f24459j;

    /* renamed from: k, reason: collision with root package name */
    private final f[] f24460k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f24461l;

    public i(String serialName, m kind, int i10, List typeParameters, a builder) {
        AbstractC6492s.i(serialName, "serialName");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(typeParameters, "typeParameters");
        AbstractC6492s.i(builder, "builder");
        this.f24450a = serialName;
        this.f24451b = kind;
        this.f24452c = i10;
        this.f24453d = builder.c();
        this.f24454e = AbstractC3689v.g1(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f24455f = strArr;
        this.f24456g = B0.b(builder.e());
        this.f24457h = (List[]) builder.d().toArray(new List[0]);
        this.f24458i = AbstractC3689v.c1(builder.g());
        Iterable<N> iterableQ1 = AbstractC3682n.q1(strArr);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(iterableQ1, 10));
        for (N n10 : iterableQ1) {
            arrayList.add(z.a(n10.d(), Integer.valueOf(n10.c())));
        }
        this.f24459j = U.r(arrayList);
        this.f24460k = B0.b(typeParameters);
        this.f24461l = Yg.n.b(new InterfaceC6824a() { // from class: Xi.g
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return Integer.valueOf(i.m(this.f24448a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(i iVar) {
        return I0.a(iVar, iVar.f24460k);
    }

    private final int n() {
        return ((Number) this.f24461l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o(i iVar, int i10) {
        return iVar.f(i10) + ": " + iVar.i(i10).a();
    }

    @Override // Xi.f
    public String a() {
        return this.f24450a;
    }

    @Override // Zi.InterfaceC3720n
    public Set b() {
        return this.f24454e;
    }

    @Override // Xi.f
    public int d(String name) {
        AbstractC6492s.i(name, "name");
        Integer num = (Integer) this.f24459j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // Xi.f
    public int e() {
        return this.f24452c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            f fVar = (f) obj;
            if (AbstractC6492s.d(a(), fVar.a()) && Arrays.equals(this.f24460k, ((i) obj).f24460k) && e() == fVar.e()) {
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
        return this.f24455f[i10];
    }

    @Override // Xi.f
    public List g(int i10) {
        return this.f24457h[i10];
    }

    @Override // Xi.f
    public List getAnnotations() {
        return this.f24453d;
    }

    @Override // Xi.f
    public m h() {
        return this.f24451b;
    }

    public int hashCode() {
        return n();
    }

    @Override // Xi.f
    public f i(int i10) {
        return this.f24456g[i10];
    }

    @Override // Xi.f
    public boolean j(int i10) {
        return this.f24458i[i10];
    }

    public String toString() {
        return AbstractC3689v.z0(AbstractC7978m.s(0, e()), ", ", a() + '(', ")", 0, null, new InterfaceC6835l() { // from class: Xi.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.o(this.f24449a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}

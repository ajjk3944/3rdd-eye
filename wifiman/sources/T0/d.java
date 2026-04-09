package T0;

import L0.C3174d;
import L0.D;
import L0.InterfaceC3188s;
import L0.U;
import M0.H;
import Q0.A;
import Q0.AbstractC3434k;
import Q0.U;
import Q0.v;
import Q0.w;
import T.z1;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;

/* loaded from: classes.dex */
public final class d implements InterfaceC3188s {

    /* renamed from: a, reason: collision with root package name */
    private final String f21300a;

    /* renamed from: b, reason: collision with root package name */
    private final U f21301b;

    /* renamed from: c, reason: collision with root package name */
    private final List f21302c;

    /* renamed from: d, reason: collision with root package name */
    private final List f21303d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3434k.b f21304e;

    /* renamed from: f, reason: collision with root package name */
    private final Y0.d f21305f;

    /* renamed from: g, reason: collision with root package name */
    private final g f21306g;

    /* renamed from: h, reason: collision with root package name */
    private final CharSequence f21307h;

    /* renamed from: i, reason: collision with root package name */
    private final H f21308i;

    /* renamed from: j, reason: collision with root package name */
    private s f21309j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f21310k;

    /* renamed from: l, reason: collision with root package name */
    private final int f21311l;

    static final class a extends AbstractC6494u implements mh.r {
        a() {
            super(4);
        }

        public final Typeface a(AbstractC3434k abstractC3434k, A a10, int i10, int i11) {
            z1 z1VarA = d.this.g().a(abstractC3434k, a10, i10, i11);
            if (z1VarA instanceof U.b) {
                Object value = z1VarA.getValue();
                AbstractC6492s.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            }
            s sVar = new s(z1VarA, d.this.f21309j);
            d.this.f21309j = sVar;
            return sVar.a();
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((AbstractC3434k) obj, (A) obj2, ((v) obj3).i(), ((w) obj4).m());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public d(String str, L0.U u10, List list, List list2, AbstractC3434k.b bVar, Y0.d dVar) {
        this.f21300a = str;
        this.f21301b = u10;
        this.f21302c = list;
        this.f21303d = list2;
        this.f21304e = bVar;
        this.f21305f = dVar;
        g gVar = new g(1, dVar.getDensity());
        this.f21306g = gVar;
        this.f21310k = !e.c(u10) ? false : ((Boolean) m.f21329a.a().getValue()).booleanValue();
        this.f21311l = e.d(u10.B(), u10.u());
        a aVar = new a();
        U0.d.e(gVar, u10.E());
        D dA = U0.d.a(gVar, u10.N(), aVar, dVar, !((Collection) list).isEmpty());
        if (dA != null) {
            int size = list.size() + 1;
            list = new ArrayList(size);
            int i10 = 0;
            while (i10 < size) {
                list.add(i10 == 0 ? new C3174d.c(dA, 0, this.f21300a.length()) : (C3174d.c) this.f21302c.get(i10 - 1));
                i10++;
            }
        }
        CharSequence charSequenceA = c.a(this.f21300a, this.f21306g.getTextSize(), this.f21301b, list, this.f21303d, this.f21305f, aVar, this.f21310k);
        this.f21307h = charSequenceA;
        this.f21308i = new H(charSequenceA, this.f21306g, this.f21311l);
    }

    @Override // L0.InterfaceC3188s
    public float a() {
        return this.f21308i.c();
    }

    @Override // L0.InterfaceC3188s
    public float b() {
        return this.f21308i.b();
    }

    @Override // L0.InterfaceC3188s
    public boolean c() {
        s sVar = this.f21309j;
        return (sVar != null ? sVar.b() : false) || (!this.f21310k && e.c(this.f21301b) && ((Boolean) m.f21329a.a().getValue()).booleanValue());
    }

    public final CharSequence f() {
        return this.f21307h;
    }

    public final AbstractC3434k.b g() {
        return this.f21304e;
    }

    public final H h() {
        return this.f21308i;
    }

    public final L0.U i() {
        return this.f21301b;
    }

    public final int j() {
        return this.f21311l;
    }

    public final g k() {
        return this.f21306g;
    }
}

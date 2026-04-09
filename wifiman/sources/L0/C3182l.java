package L0;

import L0.C3174d;
import Q0.AbstractC3434k;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import org.conscrypt.PSKKeyManager;

/* renamed from: L0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3182l implements InterfaceC3188s {

    /* renamed from: a, reason: collision with root package name */
    private final C3174d f11168a;

    /* renamed from: b, reason: collision with root package name */
    private final List f11169b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f11170c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f11171d;

    /* renamed from: e, reason: collision with root package name */
    private final List f11172e;

    /* renamed from: L0.l$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            Object obj;
            InterfaceC3188s interfaceC3188sB;
            List listF = C3182l.this.f();
            if (listF.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = listF.get(0);
                float fB = ((r) obj2).b().b();
                int iN = AbstractC3689v.n(listF);
                int i10 = 1;
                if (1 <= iN) {
                    while (true) {
                        Object obj3 = listF.get(i10);
                        float fB2 = ((r) obj3).b().b();
                        if (Float.compare(fB, fB2) < 0) {
                            obj2 = obj3;
                            fB = fB2;
                        }
                        if (i10 == iN) {
                            break;
                        }
                        i10++;
                    }
                }
                obj = obj2;
            }
            r rVar = (r) obj;
            return Float.valueOf((rVar == null || (interfaceC3188sB = rVar.b()) == null) ? 0.0f : interfaceC3188sB.b());
        }
    }

    /* renamed from: L0.l$b */
    static final class b extends AbstractC6494u implements InterfaceC6824a {
        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            Object obj;
            InterfaceC3188s interfaceC3188sB;
            List listF = C3182l.this.f();
            if (listF.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = listF.get(0);
                float fA = ((r) obj2).b().a();
                int iN = AbstractC3689v.n(listF);
                int i10 = 1;
                if (1 <= iN) {
                    while (true) {
                        Object obj3 = listF.get(i10);
                        float fA2 = ((r) obj3).b().a();
                        if (Float.compare(fA, fA2) < 0) {
                            obj2 = obj3;
                            fA = fA2;
                        }
                        if (i10 == iN) {
                            break;
                        }
                        i10++;
                    }
                }
                obj = obj2;
            }
            r rVar = (r) obj;
            return Float.valueOf((rVar == null || (interfaceC3188sB = rVar.b()) == null) ? 0.0f : interfaceC3188sB.a());
        }
    }

    public C3182l(C3174d c3174d, U u10, List list, Y0.d dVar, AbstractC3434k.b bVar) {
        this.f11168a = c3174d;
        this.f11169b = list;
        Yg.q qVar = Yg.q.NONE;
        this.f11170c = Yg.n.a(qVar, new b());
        this.f11171d = Yg.n.a(qVar, new a());
        C3191v c3191vM = u10.M();
        List listO = AbstractC3175e.o(c3174d, c3191vM);
        ArrayList arrayList = new ArrayList(listO.size());
        int size = listO.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3174d.c cVar = (C3174d.c) listO.get(i10);
            C3174d c3174dP = AbstractC3175e.p(c3174d, cVar.h(), cVar.f());
            arrayList.add(new r(AbstractC3189t.a(c3174dP.k(), u10.I(h((C3191v) cVar.g(), c3191vM)), c3174dP.g(), AbstractC3183m.b(g(), cVar.h(), cVar.f()), dVar, bVar), cVar.h(), cVar.f()));
        }
        this.f11172e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3191v h(C3191v c3191v, C3191v c3191v2) {
        return !W0.l.j(c3191v.i(), W0.l.f23537b.f()) ? c3191v : c3191v.a((509 & 1) != 0 ? c3191v.f11185a : 0, (509 & 2) != 0 ? c3191v.f11186b : c3191v2.i(), (509 & 4) != 0 ? c3191v.f11187c : 0L, (509 & 8) != 0 ? c3191v.f11188d : null, (509 & 16) != 0 ? c3191v.f11189e : null, (509 & 32) != 0 ? c3191v.f11190f : null, (509 & 64) != 0 ? c3191v.f11191g : 0, (509 & 128) != 0 ? c3191v.f11192h : 0, (509 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c3191v.f11193i : null);
    }

    @Override // L0.InterfaceC3188s
    public float a() {
        return ((Number) this.f11170c.getValue()).floatValue();
    }

    @Override // L0.InterfaceC3188s
    public float b() {
        return ((Number) this.f11171d.getValue()).floatValue();
    }

    @Override // L0.InterfaceC3188s
    public boolean c() {
        List list = this.f11172e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((r) list.get(i10)).b().c()) {
                return true;
            }
        }
        return false;
    }

    public final C3174d e() {
        return this.f11168a;
    }

    public final List f() {
        return this.f11172e;
    }

    public final List g() {
        return this.f11169b;
    }
}

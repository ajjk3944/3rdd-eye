package Nh;

import Bh.InterfaceC2495e;
import Bh.g0;
import Th.a;
import Zg.AbstractC3689v;
import Zh.b;
import gi.C5922d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import xi.AbstractC8536c;

/* loaded from: classes4.dex */
public final class D extends Dh.H {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ th.l[] f16428o = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(D.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(D.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: g, reason: collision with root package name */
    private final Qh.u f16429g;

    /* renamed from: h, reason: collision with root package name */
    private final Mh.k f16430h;

    /* renamed from: i, reason: collision with root package name */
    private final Yh.e f16431i;

    /* renamed from: j, reason: collision with root package name */
    private final oi.i f16432j;

    /* renamed from: k, reason: collision with root package name */
    private final C3379f f16433k;

    /* renamed from: l, reason: collision with root package name */
    private final oi.i f16434l;

    /* renamed from: m, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h f16435m;

    /* renamed from: n, reason: collision with root package name */
    private final oi.i f16436n;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16437a;

        static {
            int[] iArr = new int[a.EnumC0806a.values().length];
            try {
                iArr[a.EnumC0806a.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0806a.FILE_FACADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16437a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Mh.k outerContext, Qh.u jPackage) {
        super(outerContext.d(), jPackage.e());
        AbstractC6492s.i(outerContext, "outerContext");
        AbstractC6492s.i(jPackage, "jPackage");
        this.f16429g = jPackage;
        Mh.k kVarF = Mh.c.f(outerContext, this, null, 0, 6, null);
        this.f16430h = kVarF;
        this.f16431i = AbstractC8536c.a(outerContext.a().b().f().g());
        this.f16432j = kVarF.e().f(new A(this));
        this.f16433k = new C3379f(kVarF, jPackage, this);
        this.f16434l = kVarF.e().g(new B(this), AbstractC3689v.l());
        this.f16435m = kVarF.a().i().b() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b() : Mh.h.a(kVarF, jPackage);
        this.f16436n = kVarF.e().f(new C(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map M0(D d10) {
        Sh.D dO = d10.f16430h.a().o();
        String strB = d10.e().b();
        AbstractC6492s.h(strB, "asString(...)");
        List<String> listA = dO.a(strB);
        ArrayList arrayList = new ArrayList();
        for (String str : listA) {
            b.a aVar = Zh.b.f25401d;
            Zh.c cVarE = C5922d.d(str).e();
            AbstractC6492s.h(cVarE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            Sh.x xVarB = Sh.w.b(d10.f16430h.a().j(), aVar.c(cVarE), d10.f16431i);
            Yg.s sVarA = xVarB != null ? Yg.z.a(str, xVarB) : null;
            if (sVarA != null) {
                arrayList.add(sVarA);
            }
        }
        return Zg.U.r(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap R0(D d10) {
        HashMap map = new HashMap();
        for (Map.Entry entry : d10.O0().entrySet()) {
            String str = (String) entry.getKey();
            Sh.x xVar = (Sh.x) entry.getValue();
            C5922d c5922dD = C5922d.d(str);
            AbstractC6492s.h(c5922dD, "byInternalName(...)");
            Th.a aVarA = xVar.a();
            int i10 = a.f16437a[aVarA.c().ordinal()];
            if (i10 == 1) {
                String strE = aVarA.e();
                if (strE != null) {
                    map.put(c5922dD, C5922d.d(strE));
                }
            } else if (i10 == 2) {
                map.put(c5922dD, c5922dD);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List S0(D d10) {
        Collection collectionZ = d10.f16429g.z();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collectionZ, 10));
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((Qh.u) it.next()).e());
        }
        return arrayList;
    }

    public final InterfaceC2495e N0(Qh.g jClass) {
        AbstractC6492s.i(jClass, "jClass");
        return this.f16433k.i().k0(jClass);
    }

    public final Map O0() {
        return (Map) oi.m.a(this.f16432j, this, f16428o[0]);
    }

    @Override // Bh.M
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public C3379f r() {
        return this.f16433k;
    }

    public final List Q0() {
        return (List) this.f16434l.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
        return this.f16435m;
    }

    @Override // Dh.H, Dh.AbstractC2608n, Bh.InterfaceC2506p
    public g0 j() {
        return new Sh.y(this);
    }

    @Override // Dh.H, Dh.AbstractC2607m
    public String toString() {
        return "Lazy Java package fragment: " + e() + " of module " + this.f16430h.a().m();
    }
}

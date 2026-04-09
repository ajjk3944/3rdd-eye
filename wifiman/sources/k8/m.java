package k8;

import java.util.ArrayList;
import java.util.List;
import kg.InterfaceC6465b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: f, reason: collision with root package name */
    public static final a f51325f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f51326g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6839p f51327a;

    /* renamed from: b, reason: collision with root package name */
    private final Fg.a f51328b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.m f51329c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f51330d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f51331e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements InterfaceC6465b {
        b() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List list, String str) {
            AbstractC6492s.i(list, "list");
            AbstractC6492s.i(str, "<unused var>");
            InterfaceC6835l interfaceC6835lE = m.this.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Boolean) interfaceC6835lE.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public m(InterfaceC6839p filterFunction) {
        AbstractC6492s.i(filterFunction, "filterFunction");
        this.f51327a = filterFunction;
        Fg.a aVarK2 = Fg.a.k2("");
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f51328b = aVarK2;
        this.f51329c = new gg.m() { // from class: k8.l
            @Override // gg.m
            public final Dj.a a(gg.i iVar) {
                return m.d(this.f51324a, iVar);
            }
        };
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f51330d = iVarI2;
        this.f51331e = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(m mVar, Object obj) {
        InterfaceC6839p interfaceC6839p = mVar.f51327a;
        String str = (String) mVar.f51328b.l2();
        if (str == null) {
            str = "";
        }
        return ((Boolean) interfaceC6839p.invoke(obj, str)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dj.a d(m mVar, gg.i dataStream) {
        AbstractC6492s.i(dataStream, "dataStream");
        return gg.i.v(dataStream, mVar.f51328b, mVar.new b());
    }

    public final InterfaceC6835l e() {
        return new InterfaceC6835l() { // from class: k8.k
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m.c(this.f51323a, obj));
            }
        };
    }

    public final gg.i f() {
        return this.f51331e;
    }

    public final void g(String newQuery) {
        AbstractC6492s.i(newQuery, "newQuery");
        this.f51328b.h(newQuery);
    }
}

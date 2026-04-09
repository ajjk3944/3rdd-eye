package pi;

import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: pi.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7366n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f58147e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C7366n0 f58148a;

    /* renamed from: b, reason: collision with root package name */
    private final Bh.k0 f58149b;

    /* renamed from: c, reason: collision with root package name */
    private final List f58150c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f58151d;

    /* renamed from: pi.n0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7366n0 a(C7366n0 c7366n0, Bh.k0 typeAliasDescriptor, List arguments) {
            AbstractC6492s.i(typeAliasDescriptor, "typeAliasDescriptor");
            AbstractC6492s.i(arguments, "arguments");
            List parameters = typeAliasDescriptor.k().getParameters();
            AbstractC6492s.h(parameters, "getParameters(...)");
            List list = parameters;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Bh.l0) it.next()).a());
            }
            return new C7366n0(c7366n0, typeAliasDescriptor, arguments, Zg.U.r(AbstractC3689v.s1(arrayList, arguments)), null);
        }

        private a() {
        }
    }

    public /* synthetic */ C7366n0(C7366n0 c7366n0, Bh.k0 k0Var, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7366n0, k0Var, list, map);
    }

    public final List a() {
        return this.f58150c;
    }

    public final Bh.k0 b() {
        return this.f58149b;
    }

    public final B0 c(v0 constructor) {
        AbstractC6492s.i(constructor, "constructor");
        InterfaceC2498h interfaceC2498hC = constructor.c();
        if (interfaceC2498hC instanceof Bh.l0) {
            return (B0) this.f58151d.get(interfaceC2498hC);
        }
        return null;
    }

    public final boolean d(Bh.k0 descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        if (!AbstractC6492s.d(this.f58149b, descriptor)) {
            C7366n0 c7366n0 = this.f58148a;
            if (!(c7366n0 != null ? c7366n0.d(descriptor) : false)) {
                return false;
            }
        }
        return true;
    }

    private C7366n0(C7366n0 c7366n0, Bh.k0 k0Var, List list, Map map) {
        this.f58148a = c7366n0;
        this.f58149b = k0Var;
        this.f58150c = list;
        this.f58151d = map;
    }
}

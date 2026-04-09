package pi;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class w0 extends E0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f58185c = new a(null);

    public static final class a {

        /* renamed from: pi.w0$a$a, reason: collision with other inner class name */
        public static final class C2047a extends w0 {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f58186d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f58187e;

            C2047a(Map map, boolean z10) {
                this.f58186d = map;
                this.f58187e = z10;
            }

            @Override // pi.E0
            public boolean a() {
                return this.f58187e;
            }

            @Override // pi.E0
            public boolean f() {
                return this.f58186d.isEmpty();
            }

            @Override // pi.w0
            public B0 k(v0 key) {
                AbstractC6492s.i(key, "key");
                return (B0) this.f58186d.get(key);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ w0 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        public final E0 a(S kotlinType) {
            AbstractC6492s.i(kotlinType, "kotlinType");
            return b(kotlinType.N0(), kotlinType.L0());
        }

        public final E0 b(v0 typeConstructor, List arguments) {
            AbstractC6492s.i(typeConstructor, "typeConstructor");
            AbstractC6492s.i(arguments, "arguments");
            List parameters = typeConstructor.getParameters();
            AbstractC6492s.h(parameters, "getParameters(...)");
            Bh.l0 l0Var = (Bh.l0) AbstractC3689v.D0(parameters);
            if (l0Var == null || !l0Var.m0()) {
                return new M(parameters, arguments);
            }
            List parameters2 = typeConstructor.getParameters();
            AbstractC6492s.h(parameters2, "getParameters(...)");
            List list = parameters2;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Bh.l0) it.next()).k());
            }
            return e(this, Zg.U.r(AbstractC3689v.s1(arrayList, arguments)), false, 2, null);
        }

        public final w0 c(Map map) {
            AbstractC6492s.i(map, "map");
            return e(this, map, false, 2, null);
        }

        public final w0 d(Map map, boolean z10) {
            AbstractC6492s.i(map, "map");
            return new C2047a(map, z10);
        }

        private a() {
        }
    }

    public static final E0 i(v0 v0Var, List list) {
        return f58185c.b(v0Var, list);
    }

    public static final w0 j(Map map) {
        return f58185c.c(map);
    }

    @Override // pi.E0
    public B0 e(S key) {
        AbstractC6492s.i(key, "key");
        return k(key.N0());
    }

    public abstract B0 k(v0 v0Var);
}

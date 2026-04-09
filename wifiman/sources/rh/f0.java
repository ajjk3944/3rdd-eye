package Rh;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import gi.EnumC5923e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f19906a = new LinkedHashMap();

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f19907a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f19908b;

        /* renamed from: Rh.f0$a$a, reason: collision with other inner class name */
        public final class C0723a {

            /* renamed from: a, reason: collision with root package name */
            private final String f19909a;

            /* renamed from: b, reason: collision with root package name */
            private final String f19910b;

            /* renamed from: c, reason: collision with root package name */
            private final List f19911c;

            /* renamed from: d, reason: collision with root package name */
            private Yg.s f19912d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f19913e;

            public C0723a(a aVar, String functionName, String str) {
                AbstractC6492s.i(functionName, "functionName");
                this.f19913e = aVar;
                this.f19909a = functionName;
                this.f19910b = str;
                this.f19911c = new ArrayList();
                this.f19912d = Yg.z.a("V", null);
            }

            public final Yg.s a() {
                Sh.F f10 = Sh.F.f20704a;
                String strC = this.f19913e.c();
                String str = this.f19909a;
                List list = this.f19911c;
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Yg.s) it.next()).h());
                }
                String strL = f10.l(strC, f10.j(str, arrayList, (String) this.f19912d.h()));
                j0 j0Var = (j0) this.f19912d.j();
                List list2 = this.f19911c;
                ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((j0) ((Yg.s) it2.next()).j());
                }
                return Yg.z.a(strL, new Y(j0Var, arrayList2, this.f19910b));
            }

            public final void b(String type, C3480h... qualifiers) {
                j0 j0Var;
                AbstractC6492s.i(type, "type");
                AbstractC6492s.i(qualifiers, "qualifiers");
                List list = this.f19911c;
                if (qualifiers.length == 0) {
                    j0Var = null;
                } else {
                    Iterable<Zg.N> iterableQ1 = AbstractC3682n.q1(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(Zg.U.d(AbstractC3689v.w(iterableQ1, 10)), 16));
                    for (Zg.N n10 : iterableQ1) {
                        linkedHashMap.put(Integer.valueOf(n10.c()), (C3480h) n10.d());
                    }
                    j0Var = new j0(linkedHashMap);
                }
                list.add(Yg.z.a(type, j0Var));
            }

            public final void c(EnumC5923e type) {
                AbstractC6492s.i(type, "type");
                String desc = type.getDesc();
                AbstractC6492s.h(desc, "getDesc(...)");
                this.f19912d = Yg.z.a(desc, null);
            }

            public final void d(String type, C3480h... qualifiers) {
                AbstractC6492s.i(type, "type");
                AbstractC6492s.i(qualifiers, "qualifiers");
                Iterable<Zg.N> iterableQ1 = AbstractC3682n.q1(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(Zg.U.d(AbstractC3689v.w(iterableQ1, 10)), 16));
                for (Zg.N n10 : iterableQ1) {
                    linkedHashMap.put(Integer.valueOf(n10.c()), (C3480h) n10.d());
                }
                this.f19912d = Yg.z.a(type, new j0(linkedHashMap));
            }
        }

        public a(f0 f0Var, String className) {
            AbstractC6492s.i(className, "className");
            this.f19908b = f0Var;
            this.f19907a = className;
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            aVar.a(str, str2, interfaceC6835l);
        }

        public final void a(String name, String str, InterfaceC6835l block) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(block, "block");
            Map map = this.f19908b.f19906a;
            C0723a c0723a = new C0723a(this, name, str);
            block.invoke(c0723a);
            Yg.s sVarA = c0723a.a();
            map.put(sVarA.h(), sVarA.j());
        }

        public final String c() {
            return this.f19907a;
        }
    }

    public final Map b() {
        return this.f19906a;
    }
}

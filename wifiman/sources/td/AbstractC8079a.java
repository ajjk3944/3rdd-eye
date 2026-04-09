package td;

import Zg.AbstractC3689v;
import Zg.Q;
import com.ui.wifiman.model.speedtest.Speedtest;
import gg.C;
import gg.InterfaceC5910A;
import gg.i;
import gg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh.AbstractC7137b;
import sh.AbstractC7978m;

/* renamed from: td.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8079a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2177a f62079b = new C2177a(null);

    /* renamed from: td.a$a, reason: collision with other inner class name */
    public static final class C2177a {
        public /* synthetic */ C2177a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2177a() {
        }
    }

    /* renamed from: td.a$b */
    public static final class b implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinkedList f62080a;

        public b(LinkedList linkedList) {
            this.f62080a = linkedList;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = AbstractC7978m.s(0, 50).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int iD = ((Q) it).d();
                    if (this.f62080a.size() >= 1) {
                        jA = ((Speedtest.a) this.f62080a.get(AbstractC7137b.d((r3.size() / 50.0d) * iD))).a();
                    }
                    arrayList.add(Long.valueOf(jA));
                }
                Speedtest.a aVar = (Speedtest.a) AbstractC3689v.D0(this.f62080a);
                interfaceC5910A.onSuccess(new Speedtest.f.a.c(new Speedtest.a.C1416a(aVar != null ? aVar.a() : 0L, arrayList)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: td.a$c */
    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinkedList f62081a;

        c(LinkedList linkedList) {
            this.f62081a = linkedList;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Speedtest.a.b it) {
            AbstractC6492s.i(it, "it");
            this.f62081a.add(it);
        }
    }

    /* renamed from: td.a$d */
    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f62082a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest.f apply(Speedtest.a.b it) {
            AbstractC6492s.i(it, "it");
            return new Speedtest.f.c(it);
        }
    }

    /* renamed from: td.a$e */
    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f62083a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest.f apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            return new Speedtest.f.a.C1417a(it);
        }
    }

    protected final i b(i measurementStream) {
        AbstractC6492s.i(measurementStream, "measurementStream");
        LinkedList linkedList = new LinkedList();
        i iVarN0 = measurementStream.f0(new c(linkedList)).N0(d.f62082a);
        z zVarI = z.i(new b(linkedList));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        i iVarZ1 = iVarN0.M(zVarI).g1(e.f62083a).z1(new Speedtest.f.c(null));
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }
}

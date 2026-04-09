package Ag;

import Yg.s;
import Yg.y;
import Yg.z;
import gg.i;
import kg.InterfaceC6465b;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f753a = new c();

    static final class a implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f754a = new a();

        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s apply(Object obj, Object obj2) {
            return z.a(obj, obj2);
        }
    }

    static final class b implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f755a = new b();

        b() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y a(Object obj, Object obj2, Object obj3) {
            return new y(obj, obj2, obj3);
        }
    }

    private c() {
    }

    public final i a(i source1, i source2) {
        AbstractC6492s.i(source1, "source1");
        AbstractC6492s.i(source2, "source2");
        i iVarV = i.v(source1, source2, a.f754a);
        AbstractC6492s.h(iVarV, "Flowable.combineLatest(s…> { t1, t2 -> t1 to t2 })");
        return iVarV;
    }

    public final i b(i source1, i source2, i source3) {
        AbstractC6492s.i(source1, "source1");
        AbstractC6492s.i(source2, "source2");
        AbstractC6492s.i(source3, "source3");
        i iVarU = i.u(source1, source2, source3, b.f755a);
        AbstractC6492s.h(iVarU, "Flowable.combineLatest(s… -> Triple(t1, t2, t3) })");
        return iVarU;
    }
}

package b0;

import T.InterfaceC3540l;
import T.J0;
import T.L0;
import T.X0;
import Yg.J;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.V;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;
import mh.s;
import mh.t;

/* loaded from: classes.dex */
public final class b implements InterfaceC4038a {

    /* renamed from: a, reason: collision with root package name */
    private final int f32640a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32641b;

    /* renamed from: c, reason: collision with root package name */
    private Object f32642c;

    /* renamed from: d, reason: collision with root package name */
    private J0 f32643d;

    /* renamed from: e, reason: collision with root package name */
    private List f32644e;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f32646b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f32647c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, int i10) {
            super(2);
            this.f32646b = obj;
            this.f32647c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            b.this.b(this.f32646b, interfaceC3540l, L0.a(this.f32647c) | 1);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: b0.b$b, reason: collision with other inner class name */
    static final class C1137b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f32649b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f32650c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f32651d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1137b(Object obj, Object obj2, int i10) {
            super(2);
            this.f32649b = obj;
            this.f32650c = obj2;
            this.f32651d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            b.this.c(this.f32649b, this.f32650c, interfaceC3540l, L0.a(this.f32651d) | 1);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f32653b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f32654c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f32655d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f32656e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, Object obj2, Object obj3, int i10) {
            super(2);
            this.f32653b = obj;
            this.f32654c = obj2;
            this.f32655d = obj3;
            this.f32656e = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            b.this.e(this.f32653b, this.f32654c, this.f32655d, interfaceC3540l, L0.a(this.f32656e) | 1);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f32658b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f32659c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f32660d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f32661e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f32662f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
            super(2);
            this.f32658b = obj;
            this.f32659c = obj2;
            this.f32660d = obj3;
            this.f32661e = obj4;
            this.f32662f = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            b.this.f(this.f32658b, this.f32659c, this.f32660d, this.f32661e, interfaceC3540l, L0.a(this.f32662f) | 1);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public b(int i10, boolean z10, Object obj) {
        this.f32640a = i10;
        this.f32641b = z10;
        this.f32642c = obj;
    }

    private final void h(InterfaceC3540l interfaceC3540l) {
        J0 j0B;
        if (!this.f32641b || (j0B = interfaceC3540l.b()) == null) {
            return;
        }
        interfaceC3540l.V(j0B);
        if (b0.c.f(this.f32643d, j0B)) {
            this.f32643d = j0B;
            return;
        }
        List list = this.f32644e;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f32644e = arrayList;
            arrayList.add(j0B);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (b0.c.f((J0) list.get(i10), j0B)) {
                list.set(i10, j0B);
                return;
            }
        }
        list.add(j0B);
    }

    private final void i() {
        if (this.f32641b) {
            J0 j02 = this.f32643d;
            if (j02 != null) {
                j02.invalidate();
                this.f32643d = null;
            }
            List list = this.f32644e;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((J0) list.get(i10)).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // mh.t
    public /* bridge */ /* synthetic */ Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return f(obj, obj2, obj3, obj4, (InterfaceC3540l) obj5, ((Number) obj6).intValue());
    }

    @Override // mh.s
    public /* bridge */ /* synthetic */ Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e(obj, obj2, obj3, (InterfaceC3540l) obj4, ((Number) obj5).intValue());
    }

    public Object a(InterfaceC3540l interfaceC3540l, int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(this.f32640a);
        h(interfaceC3540lR);
        int iD = i10 | (interfaceC3540lR.T(this) ? b0.c.d(0) : b0.c.g(0));
        Object obj = this.f32642c;
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((InterfaceC6839p) V.f(obj, 2)).invoke(interfaceC3540lR, Integer.valueOf(iD));
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            AbstractC6492s.g(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            x0Z.a((InterfaceC6839p) V.f(this, 2));
        }
        return objInvoke;
    }

    public Object b(Object obj, InterfaceC3540l interfaceC3540l, int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(this.f32640a);
        h(interfaceC3540lR);
        int iD = interfaceC3540lR.T(this) ? b0.c.d(1) : b0.c.g(1);
        Object obj2 = this.f32642c;
        AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objS = ((q) V.f(obj2, 3)).s(obj, interfaceC3540lR, Integer.valueOf(iD | i10));
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(obj, i10));
        }
        return objS;
    }

    public Object c(Object obj, Object obj2, InterfaceC3540l interfaceC3540l, int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(this.f32640a);
        h(interfaceC3540lR);
        int iD = interfaceC3540lR.T(this) ? b0.c.d(2) : b0.c.g(2);
        Object obj3 = this.f32642c;
        AbstractC6492s.g(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objY = ((r) V.f(obj3, 4)).y(obj, obj2, interfaceC3540lR, Integer.valueOf(iD | i10));
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new C1137b(obj, obj2, i10));
        }
        return objY;
    }

    public Object e(Object obj, Object obj2, Object obj3, InterfaceC3540l interfaceC3540l, int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(this.f32640a);
        h(interfaceC3540lR);
        int iD = interfaceC3540lR.T(this) ? b0.c.d(3) : b0.c.g(3);
        Object obj4 = this.f32642c;
        AbstractC6492s.g(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objK = ((s) V.f(obj4, 5)).K(obj, obj2, obj3, interfaceC3540lR, Integer.valueOf(iD | i10));
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new c(obj, obj2, obj3, i10));
        }
        return objK;
    }

    public Object f(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC3540l interfaceC3540l, int i10) {
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(this.f32640a);
        h(interfaceC3540lR);
        int iD = interfaceC3540lR.T(this) ? b0.c.d(4) : b0.c.g(4);
        Object obj5 = this.f32642c;
        AbstractC6492s.g(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objF = ((t) V.f(obj5, 6)).F(obj, obj2, obj3, obj4, interfaceC3540lR, Integer.valueOf(iD | i10));
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new d(obj, obj2, obj3, obj4, i10));
        }
        return objF;
    }

    @Override // mh.InterfaceC6839p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((InterfaceC3540l) obj, ((Number) obj2).intValue());
    }

    public final void j(Object obj) {
        if (AbstractC6492s.d(this.f32642c, obj)) {
            return;
        }
        boolean z10 = this.f32642c == null;
        this.f32642c = obj;
        if (z10) {
            return;
        }
        i();
    }

    @Override // mh.q
    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
        return b(obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
    }

    @Override // mh.r
    public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
    }
}

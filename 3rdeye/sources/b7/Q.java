package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes.dex */
public abstract class Q extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f17481a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a7.j> f17482b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1667d f17483c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17484d;

    /* JADX WARN: Multi-variable type inference failed */
    public Q(p9.p<? super C4278a, ? super Double, C4278a> componentSetter) {
        kotlin.jvm.internal.l.f(componentSetter, "componentSetter");
        this.f17481a = (kotlin.jvm.internal.m) componentSetter;
        EnumC1667d enumC1667d = EnumC1667d.COLOR;
        this.f17482b = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.NUMBER, false));
        this.f17483c = enumC1667d;
        this.f17484d = true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.m, p9.p] */
    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        int i = ((C4278a) obj).f37526a;
        Object obj2 = list.get(1);
        kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlin.Double");
        Double d10 = (Double) obj2;
        try {
            return new C4278a(((C4278a) this.f17481a.invoke(new C4278a(i), d10)).f37526a);
        } catch (IllegalArgumentException unused) {
            C1666c.d(c(), C2092m.W(C4278a.a(i), d10), "Value out of range 0..1.", null);
            throw null;
        }
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17482b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17483c;
    }

    @Override // a7.g
    public final boolean f() {
        return this.f17484d;
    }
}

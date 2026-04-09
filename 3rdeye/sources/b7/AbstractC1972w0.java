package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1972w0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f18020a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f18021b;

    public AbstractC1972w0() {
        EnumC1667d enumC1667d = EnumC1667d.NUMBER;
        this.f18020a = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));
        this.f18021b = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Double");
        Double d10 = (Double) obj;
        Object objS = A9.I.s(list, d10, false);
        Number number = objS instanceof Number ? (Number) objS : null;
        return number != null ? Double.valueOf(number.doubleValue()) : d10;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f18020a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f18021b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}

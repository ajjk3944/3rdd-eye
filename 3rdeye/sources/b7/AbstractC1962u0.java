package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1962u0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17993a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f17994b;

    public AbstractC1962u0() {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        this.f17993a = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.DICT, false), new a7.j(enumC1667d, true));
        this.f17994b = EnumC1667d.COLOR;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object objS = A9.I.s(list, str, false);
        C4278a c4278aD = C1902i.d(objS instanceof String ? (String) objS : null);
        if (c4278aD != null) {
            return c4278aD;
        }
        C4278a c4278aD2 = C1902i.d(str);
        if (c4278aD2 != null) {
            return c4278aD2;
        }
        A9.I.C(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17993a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17994b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}

package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1952s0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17969a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f17970b;

    public AbstractC1952s0() {
        EnumC1667d enumC1667d = EnumC1667d.BOOLEAN;
        this.f17969a = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));
        this.f17970b = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
        Boolean bool = (Boolean) obj;
        Object objS = A9.I.s(list, bool, false);
        Boolean bool2 = objS instanceof Boolean ? (Boolean) objS : null;
        return bool2 == null ? bool : bool2;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17969a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17970b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}

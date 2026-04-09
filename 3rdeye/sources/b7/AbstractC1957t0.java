package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1957t0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17980a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f17981b;

    public AbstractC1957t0() {
        EnumC1667d enumC1667d = EnumC1667d.COLOR;
        this.f17980a = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));
        this.f17981b = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        int i = ((C4278a) obj).f37526a;
        Object objS = A9.I.s(list, new C4278a(i), false);
        C4278a c4278aD = C1902i.d(objS instanceof String ? (String) objS : null);
        return c4278aD == null ? new C4278a(i) : c4278aD;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17980a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17981b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}

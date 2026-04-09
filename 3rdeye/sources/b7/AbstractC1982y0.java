package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4280c;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1982y0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f18046a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f18047b;

    public AbstractC1982y0() {
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        this.f18046a = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.DICT, false), new a7.j(enumC1667d, true));
        this.f18047b = EnumC1667d.URL;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object objS = A9.I.s(list, str, false);
        String strE = C1902i.e(objS instanceof String ? (String) objS : null);
        if (strE != null) {
            return new C4280c(strE);
        }
        String strE2 = C1902i.e(str);
        if (strE2 != null) {
            return new C4280c(strE2);
        }
        A9.I.C(c(), "Unable to convert value to Url.", list);
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f18046a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f18047b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}

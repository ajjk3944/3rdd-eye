package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4280c;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1987z0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f18059a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f18060b;

    public AbstractC1987z0() {
        EnumC1667d enumC1667d = EnumC1667d.URL;
        this.f18059a = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));
        this.f18060b = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        String strE;
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Url");
        String str = ((C4280c) obj).f37533a;
        Object objS = A9.I.s(list, new C4280c(str), false);
        String str2 = objS instanceof String ? (String) objS : null;
        return (str2 == null || (strE = C1902i.e(str2)) == null) ? new C4280c(str) : new C4280c(strE);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f18059a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f18060b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}

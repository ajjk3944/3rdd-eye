package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1967v0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f18006a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f18007b;

    public AbstractC1967v0() {
        EnumC1667d enumC1667d = EnumC1667d.INTEGER;
        this.f18006a = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));
        this.f18007b = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.Long");
        Long l5 = (Long) obj;
        long jLongValue = l5.longValue();
        Object objS = A9.I.s(list, l5, false);
        if (objS instanceof Integer) {
            jLongValue = ((Number) objS).intValue();
        } else if (objS instanceof Long) {
            jLongValue = ((Number) objS).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f18006a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f18007b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}

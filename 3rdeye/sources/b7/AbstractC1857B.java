package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4280c;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1857B extends AbstractC1976x {

    /* renamed from: c, reason: collision with root package name */
    public final List<a7.j> f17212c;

    public AbstractC1857B() {
        super(EnumC1667d.URL);
        this.f17212c = C2092m.W(new a7.j(EnumC1667d.ARRAY, false), new a7.j(EnumC1667d.INTEGER, false), new a7.j(EnumC1667d.STRING, false));
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objC = C1902i.c(c(), list);
        String strE = C1902i.e(objC instanceof String ? (String) objC : null);
        if (strE != null) {
            return new C4280c(strE);
        }
        Object obj = list.get(2);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        String strE2 = C1902i.e((String) obj);
        if (strE2 != null) {
            return new C4280c(strE2);
        }
        C1902i.g(c(), "Unable to convert value to Url.", list);
        throw null;
    }

    @Override // b7.AbstractC1976x, a7.g
    public final List<a7.j> b() {
        return this.f17212c;
    }
}

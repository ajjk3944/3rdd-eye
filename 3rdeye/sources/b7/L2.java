package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import java.util.List;
import org.json.JSONException;

/* compiled from: StoredValueFunctions.kt */
/* loaded from: classes.dex */
public abstract class L2<T> extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17397a = E.u.G(new a7.j(EnumC1667d.STRING, false));

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        Object objD = ((C.e0) nVar.f13449b).d((String) obj);
        if (objD != null) {
            return objD;
        }
        C1666c.d(c(), list, "Missing value.", null);
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17397a;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}

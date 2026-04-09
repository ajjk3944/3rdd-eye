package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import d7.C4280c;
import java.util.List;
import org.json.JSONException;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1861F extends AbstractC1892g {
    public AbstractC1861F() {
        super(EnumC1667d.URL);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        String strE;
        Object objB = C1902i.b(c(), list, j());
        String str = objB instanceof String ? (String) objB : null;
        if (str != null && (strE = C1902i.e(str)) != null) {
            return new C4280c(strE);
        }
        C1902i.h(c(), list, this.f17781a, objB, j());
        throw null;
    }
}

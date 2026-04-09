package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1877d extends AbstractC1892g {
    public AbstractC1877d() {
        super(EnumC1667d.DICT);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object objB = C1902i.b(c(), list, j());
        JSONObject jSONObject = objB instanceof JSONObject ? (JSONObject) objB : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        C1902i.h(c(), list, this.f17781a, objB, j());
        throw null;
    }
}

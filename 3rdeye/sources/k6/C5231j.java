package k6;

import H6.C0675l;
import Z6.d;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionTypedDictSetValueHandler.kt */
/* renamed from: k6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5231j extends kotlin.jvm.internal.m implements p9.l<Z6.d, Z6.d> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0675l f43419g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f43420h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5231j(C0675l c0675l, Object obj, String str) {
        super(1);
        this.f43419g = c0675l;
        this.f43420h = obj;
        this.i = str;
    }

    @Override // p9.l
    public final Z6.d invoke(Z6.d dVar) throws JSONException {
        Z6.d variable = dVar;
        kotlin.jvm.internal.l.f(variable, "variable");
        boolean z10 = variable instanceof d.C0207d;
        C0675l c0675l = this.f43419g;
        if (!z10) {
            C5246y.d(c0675l, new IllegalArgumentException("dict_set_value action requires dict variable"));
            return variable;
        }
        Object objB = variable.b();
        JSONObject jSONObject = objB instanceof JSONObject ? (JSONObject) objB : null;
        if (jSONObject == null) {
            C5246y.d(c0675l, new IllegalArgumentException("Invalid variable value"));
            return variable;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.l.e(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject2.put(next, jSONObject.get(next));
        }
        String str = this.i;
        Object obj = this.f43420h;
        if (obj == null) {
            jSONObject2.remove(str);
            ((d.C0207d) variable).g(jSONObject2);
            return variable;
        }
        JSONObject jSONObjectPut = jSONObject2.put(str, obj);
        kotlin.jvm.internal.l.e(jSONObjectPut, "newDict.put(key, newValue)");
        ((d.C0207d) variable).g(jSONObjectPut);
        return variable;
    }
}

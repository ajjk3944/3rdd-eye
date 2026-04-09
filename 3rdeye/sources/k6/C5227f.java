package k6;

import H6.C0675l;
import Z6.d;
import org.json.JSONArray;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
/* renamed from: k6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5227f extends kotlin.jvm.internal.m implements p9.l<Z6.d, Z6.d> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0675l f43417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f43418h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5227f(C0675l c0675l, p9.l<? super JSONArray, ? extends JSONArray> lVar) {
        super(1);
        this.f43417g = c0675l;
        this.f43418h = (kotlin.jvm.internal.m) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.m, p9.l] */
    @Override // p9.l
    public final Z6.d invoke(Z6.d dVar) {
        Z6.d variable = dVar;
        kotlin.jvm.internal.l.f(variable, "variable");
        boolean z10 = variable instanceof d.a;
        C0675l c0675l = this.f43417g;
        if (!z10) {
            C5246y.d(c0675l.getView(), new IllegalArgumentException("Action requires array variable"));
            return variable;
        }
        Object objB = variable.b();
        JSONArray jSONArray = objB instanceof JSONArray ? (JSONArray) objB : null;
        if (jSONArray == null) {
            C5246y.d(c0675l.getView(), new IllegalArgumentException("Invalid variable value"));
            return variable;
        }
        JSONArray newValue = (JSONArray) this.f43418h.invoke(jSONArray);
        kotlin.jvm.internal.l.f(newValue, "newValue");
        ((d.a) variable).g(newValue);
        return variable;
    }
}

package nk;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class h0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Type f18395a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18396b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18397c;

    /* renamed from: d, reason: collision with root package name */
    public r f18398d;

    public h0(Type type, String str, Object obj) {
        this.f18395a = type;
        this.f18396b = str;
        this.f18397c = obj;
    }

    @Override // nk.r
    public final Object fromJson(w wVar) {
        r rVar = this.f18398d;
        if (rVar != null) {
            return rVar.fromJson(wVar);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // nk.r
    public final void toJson(c0 c0Var, Object obj) {
        r rVar = this.f18398d;
        if (rVar == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        rVar.toJson(c0Var, obj);
    }

    public final String toString() {
        r rVar = this.f18398d;
        return rVar != null ? rVar.toString() : super.toString();
    }
}

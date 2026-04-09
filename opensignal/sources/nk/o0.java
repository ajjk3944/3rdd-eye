package nk;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f18429a;

    /* renamed from: b, reason: collision with root package name */
    public final r f18430b;

    /* renamed from: c, reason: collision with root package name */
    public final r f18431c;

    /* renamed from: d, reason: collision with root package name */
    public final r f18432d;

    /* renamed from: e, reason: collision with root package name */
    public final r f18433e;

    /* renamed from: f, reason: collision with root package name */
    public final r f18434f;

    public o0(j0 j0Var) {
        this.f18429a = j0Var;
        this.f18430b = j0Var.a(List.class);
        this.f18431c = j0Var.a(Map.class);
        this.f18432d = j0Var.a(String.class);
        this.f18433e = j0Var.a(Double.class);
        this.f18434f = j0Var.a(Boolean.class);
    }

    @Override // nk.r
    public final Object fromJson(w wVar) {
        switch (m0.f18423a[wVar.f0().ordinal()]) {
            case 1:
                return this.f18430b.fromJson(wVar);
            case 2:
                return this.f18431c.fromJson(wVar);
            case 3:
                return this.f18432d.fromJson(wVar);
            case 4:
                return this.f18433e.fromJson(wVar);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return this.f18434f.fromJson(wVar);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                wVar.Y();
                return null;
            default:
                throw new IllegalStateException("Expected a value but was " + wVar.f0() + " at path " + wVar.q());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[PHI: r1
  0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x0015, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // nk.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void toJson(nk.c0 r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r5.f()
            r5.q()
            return
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = ok.f.f19537a
            r2 = 0
            nk.j0 r3 = r4.f18429a
            nk.r r0 = r3.b(r0, r1, r2)
            r0.toJson(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.o0.toJson(nk.c0, java.lang.Object):void");
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}

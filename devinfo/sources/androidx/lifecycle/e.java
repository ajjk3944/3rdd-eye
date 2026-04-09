package androidx.lifecycle;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1124a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1125b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f1124a = i4;
        this.f1125b = obj;
    }

    @Override // androidx.lifecycle.y
    public final void g(a0 a0Var, r rVar) {
        switch (this.f1124a) {
            case 0:
                new HashMap();
                m[] mVarArr = (m[]) this.f1125b;
                if (mVarArr.length > 0) {
                    m mVar = mVarArr[0];
                    throw null;
                }
                if (mVarArr.length <= 0) {
                    return;
                }
                m mVar2 = mVarArr[0];
                throw null;
            default:
                if (rVar == r.ON_CREATE) {
                    a0Var.j().b(this);
                    ((z0) this.f1125b).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + rVar).toString());
                }
        }
    }
}

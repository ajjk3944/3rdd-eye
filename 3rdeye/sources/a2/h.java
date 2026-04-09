package A2;

import P7.x;
import b9.C1992A;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17b;

    @Override // p9.l
    public final Object invoke(Object obj) throws Exception {
        switch (this.f17b) {
            case 0:
                E1.c cVarK0 = ((E1.a) obj).K0("DELETE FROM Model WHERE name is not null");
                try {
                    cVarK0.x();
                    cVarK0.close();
                    return null;
                } catch (Throwable th) {
                    cVarK0.close();
                    throw th;
                }
            default:
                x.b bVar = (x.b) obj;
                va.a.f47104a.a("On contest done. Code: " + bVar.f10833a + " Message: " + bVar.f10834b, new Object[0]);
                return C1992A.f18074a;
        }
    }
}

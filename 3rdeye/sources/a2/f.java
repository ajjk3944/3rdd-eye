package A2;

import b9.C1992A;
import g2.AbstractC4381e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14b;

    public /* synthetic */ f(int i) {
        this.f14b = i;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f14b) {
            case 0:
                E1.c cVarK0 = ((E1.a) obj).K0("SELECT COUNT(*) FROM Model");
                try {
                    Integer numValueOf = Integer.valueOf(cVarK0.x() ? (int) cVarK0.getLong(0) : 0);
                    cVarK0.close();
                    return numValueOf;
                } catch (Throwable th) {
                    cVarK0.close();
                    throw th;
                }
            case 1:
                kotlin.jvm.internal.l.f((e8.d) obj, "<unused var>");
                return C1992A.f18074a;
            default:
                ((AbstractC4381e) obj).a();
                return C1992A.f18074a;
        }
    }
}

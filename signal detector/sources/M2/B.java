package M2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class B extends s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0165e f2707g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(AbstractC0165e abstractC0165e, int i, Bundle bundle) {
        super(abstractC0165e, i, bundle);
        this.f2707g = abstractC0165e;
    }

    @Override // M2.s
    public final boolean a() {
        this.f2707g.f2741j.a(J2.b.f2043f);
        return true;
    }

    @Override // M2.s
    public final void b(J2.b bVar) {
        AbstractC0165e abstractC0165e = this.f2707g;
        abstractC0165e.getClass();
        abstractC0165e.f2741j.a(bVar);
        System.currentTimeMillis();
    }
}

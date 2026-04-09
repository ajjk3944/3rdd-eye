package s3;

import android.os.Bundle;
import r3.C7564b;

/* loaded from: classes.dex */
public final class c0 extends M {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC7888c f61242g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(AbstractC7888c abstractC7888c, int i10, Bundle bundle) {
        super(abstractC7888c, i10, bundle);
        this.f61242g = abstractC7888c;
    }

    @Override // s3.M
    protected final void f(C7564b c7564b) {
        if (this.f61242g.r() && AbstractC7888c.f0(this.f61242g)) {
            AbstractC7888c.b0(this.f61242g, 16);
        } else {
            this.f61242g.f61230p.c(c7564b);
            this.f61242g.J(c7564b);
        }
    }

    @Override // s3.M
    protected final boolean g() {
        this.f61242g.f61230p.c(C7564b.f60070e);
        return true;
    }
}

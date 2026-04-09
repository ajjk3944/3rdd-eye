package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yw1 extends pd2 {
    public final /* synthetic */ int g = 1;
    public final Object h;

    public yw1(wy0 wy0Var) {
        this.h = wy0Var;
    }

    @Override // defpackage.pd2, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        switch (this.g) {
            case 0:
                ((wy0) this.h).d();
                return this.f.cancel(z);
            default:
                return super.cancel(z);
        }
    }

    public void d() {
        a(this.h);
    }

    public yw1(Object obj) {
        this.h = obj;
    }
}

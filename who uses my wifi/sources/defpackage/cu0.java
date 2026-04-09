package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cu0 extends e50 implements dy {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu0(int i, Object obj) {
        super(1);
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.dy
    public final Object g(Object obj) {
        switch (this.g) {
            case 0:
                ((eu0) this.h).b();
                return z31.a;
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((yw0) this.h).e.F(new mu(th));
                }
                Object obj2 = yw0.i;
                yw0 yw0Var = (yw0) this.h;
                synchronized (obj2) {
                    yw0.h.remove(yw0Var.b().getAbsolutePath());
                }
                return z31.a;
        }
    }
}

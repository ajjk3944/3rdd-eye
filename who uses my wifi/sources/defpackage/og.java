package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class og implements oj {
    public static final og g = new og(0);
    public static final og h = new og(1);
    public final /* synthetic */ int f;

    public /* synthetic */ og(int i) {
        this.f = i;
    }

    @Override // defpackage.oj
    public final void e(Object obj) {
        switch (this.f) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    @Override // defpackage.oj
    public final hk getContext() {
        switch (this.f) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return ls.f;
        }
    }

    public String toString() {
        switch (this.f) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}

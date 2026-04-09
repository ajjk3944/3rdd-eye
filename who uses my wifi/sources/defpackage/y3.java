package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y3 extends ja {
    static {
        k80.d(y3.class);
    }

    @Override // defpackage.xp0
    public final void a() throws s20 {
        h();
        throw new s20("Context must be initialized by calling setContext");
    }

    @Override // defpackage.xp0
    public final boolean isEnabled() {
        return System.getProperty("java.vendor").contains("Android");
    }
}

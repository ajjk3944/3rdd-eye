package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class da4 implements ca4, z94 {
    public static final da4 b = new da4(null);
    public final Object a;

    public da4(Object obj) {
        this.a = obj;
    }

    public static da4 a(Object obj) {
        if (obj != null) {
            return new da4(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public static da4 b(Object obj) {
        return obj == null ? b : new da4(obj);
    }

    @Override // defpackage.ga4
    public final Object d() {
        return this.a;
    }
}

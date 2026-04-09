package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j8 extends i41 {
    public static volatile j8 E;
    public static final i8 F = new i8(0);
    public final wn D = new wn();

    public static j8 T() {
        if (E != null) {
            return E;
        }
        synchronized (j8.class) {
            try {
                if (E == null) {
                    E = new j8();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return E;
    }
}

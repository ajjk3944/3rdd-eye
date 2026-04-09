package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class dp0 {
    public static final ep0 a;

    static {
        ep0 ep0Var = null;
        try {
            ep0Var = (ep0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ep0Var == null) {
            ep0Var = new ep0();
        }
        a = ep0Var;
    }

    public static hf a(Class cls) {
        a.getClass();
        return new hf(cls);
    }
}

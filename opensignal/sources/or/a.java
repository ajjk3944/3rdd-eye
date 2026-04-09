package or;

import java.util.ServiceLoader;

/* loaded from: classes.dex */
public final class a extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f19662d = new a(0);

    @Override // ar.a
    public final Object c() {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(c.class, c.class.getClassLoader());
        br.l.d(serviceLoaderLoad, "implementations");
        c cVar = (c) mq.o.s0(serviceLoaderLoad);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}

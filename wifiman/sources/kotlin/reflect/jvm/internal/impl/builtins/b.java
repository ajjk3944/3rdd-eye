package kotlin.reflect.jvm.internal.impl.builtins;

import Bh.G;
import Bh.N;
import Zg.AbstractC3689v;
import java.util.ServiceLoader;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f51730a = a.f51731a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f51731a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Yg.m f51732b = Yg.n.a(Yg.q.PUBLICATION, kotlin.reflect.jvm.internal.impl.builtins.a.f51729a);

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(b.class, b.class.getClassLoader());
            AbstractC6492s.f(serviceLoaderLoad);
            b bVar = (b) AbstractC3689v.r0(serviceLoaderLoad);
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final b c() {
            return (b) f51732b.getValue();
        }
    }

    N a(oi.n nVar, G g10, Iterable iterable, Ch.c cVar, Ch.a aVar, boolean z10);
}

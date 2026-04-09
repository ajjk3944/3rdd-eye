package k1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f21799a = new LinkedHashMap();

    /* renamed from: k1.a$a, reason: collision with other inner class name */
    public static final class C0426a extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0426a f21800b = new C0426a();

        @Override // k1.a
        public Object a(b key) {
            p.e(key, "key");
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f21799a;
    }
}

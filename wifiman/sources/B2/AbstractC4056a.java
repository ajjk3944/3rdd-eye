package b2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4056a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f32793a = new LinkedHashMap();

    /* renamed from: b2.a$a, reason: collision with other inner class name */
    public static final class C1139a extends AbstractC4056a {

        /* renamed from: b, reason: collision with root package name */
        public static final C1139a f32794b = new C1139a();

        private C1139a() {
        }

        @Override // b2.AbstractC4056a
        public Object a(b key) {
            AbstractC6492s.i(key, "key");
            return null;
        }
    }

    /* renamed from: b2.a$b */
    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f32793a;
    }
}

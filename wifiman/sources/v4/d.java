package v4;

import A4.y;
import com.google.crypto.tink.config.internal.b;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.M;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o4.l;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final Class f63425a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f63426b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f63427c;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f63428a;

        /* renamed from: v4.d$a$a, reason: collision with other inner class name */
        public static final class C2247a {

            /* renamed from: a, reason: collision with root package name */
            public Object f63429a;

            /* renamed from: b, reason: collision with root package name */
            public l.b f63430b;

            public C2247a(Object obj, l.b bVar) {
                this.f63429a = obj;
                this.f63430b = bVar;
            }
        }

        public a(Class cls) {
            this.f63428a = cls;
        }

        public abstract M a(M m10);

        public final Class b() {
            return this.f63428a;
        }

        public Map c() {
            return Collections.emptyMap();
        }

        public abstract M d(AbstractC5081h abstractC5081h);

        public abstract void e(M m10);
    }

    protected d(Class cls, m... mVarArr) {
        this.f63425a = cls;
        HashMap map = new HashMap();
        for (m mVar : mVarArr) {
            if (map.containsKey(mVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + mVar.b().getCanonicalName());
            }
            map.put(mVar.b(), mVar);
        }
        if (mVarArr.length > 0) {
            this.f63427c = mVarArr[0].b();
        } else {
            this.f63427c = Void.class;
        }
        this.f63426b = Collections.unmodifiableMap(map);
    }

    public b.EnumC1214b a() {
        return b.EnumC1214b.ALGORITHM_NOT_FIPS;
    }

    public final Class b() {
        return this.f63427c;
    }

    public final Class c() {
        return this.f63425a;
    }

    public abstract String d();

    public final Object e(M m10, Class cls) {
        m mVar = (m) this.f63426b.get(cls);
        if (mVar != null) {
            return mVar.a(m10);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a f();

    public abstract y.c g();

    public abstract M h(AbstractC5081h abstractC5081h);

    public final Set i() {
        return this.f63426b.keySet();
    }

    public abstract void j(M m10);
}

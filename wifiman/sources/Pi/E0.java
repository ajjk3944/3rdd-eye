package pi;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class E0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f58056a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final E0 f58057b = new a();

    public static final class a extends E0 {
        a() {
        }

        @Override // pi.E0
        public /* bridge */ /* synthetic */ B0 e(S s10) {
            return (B0) i(s10);
        }

        @Override // pi.E0
        public boolean f() {
            return true;
        }

        public Void i(S key) {
            AbstractC6492s.i(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends E0 {
        c() {
        }

        @Override // pi.E0
        public boolean a() {
            return false;
        }

        @Override // pi.E0
        public boolean b() {
            return false;
        }

        @Override // pi.E0
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations) {
            AbstractC6492s.i(annotations, "annotations");
            return E0.this.d(annotations);
        }

        @Override // pi.E0
        public B0 e(S key) {
            AbstractC6492s.i(key, "key");
            return E0.this.e(key);
        }

        @Override // pi.E0
        public boolean f() {
            return E0.this.f();
        }

        @Override // pi.E0
        public S g(S topLevelType, N0 position) {
            AbstractC6492s.i(topLevelType, "topLevelType");
            AbstractC6492s.i(position, "position");
            return E0.this.g(topLevelType, position);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final G0 c() {
        G0 g0G = G0.g(this);
        AbstractC6492s.h(g0G, "create(...)");
        return g0G;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations) {
        AbstractC6492s.i(annotations, "annotations");
        return annotations;
    }

    public abstract B0 e(S s10);

    public boolean f() {
        return false;
    }

    public S g(S topLevelType, N0 position) {
        AbstractC6492s.i(topLevelType, "topLevelType");
        AbstractC6492s.i(position, "position");
        return topLevelType;
    }

    public final E0 h() {
        return new c();
    }
}

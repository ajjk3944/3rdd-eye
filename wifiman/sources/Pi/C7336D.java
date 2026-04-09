package pi;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: pi.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7336D extends E0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f58051e = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final E0 f58052c;

    /* renamed from: d, reason: collision with root package name */
    private final E0 f58053d;

    /* renamed from: pi.D$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E0 a(E0 first, E0 second) {
            AbstractC6492s.i(first, "first");
            AbstractC6492s.i(second, "second");
            return first.f() ? second : second.f() ? first : new C7336D(first, second, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C7336D(E0 e02, E0 e03, DefaultConstructorMarker defaultConstructorMarker) {
        this(e02, e03);
    }

    public static final E0 i(E0 e02, E0 e03) {
        return f58051e.a(e02, e03);
    }

    @Override // pi.E0
    public boolean a() {
        return this.f58052c.a() || this.f58053d.a();
    }

    @Override // pi.E0
    public boolean b() {
        return this.f58052c.b() || this.f58053d.b();
    }

    @Override // pi.E0
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations) {
        AbstractC6492s.i(annotations, "annotations");
        return this.f58053d.d(this.f58052c.d(annotations));
    }

    @Override // pi.E0
    public B0 e(S key) {
        AbstractC6492s.i(key, "key");
        B0 b0E = this.f58052c.e(key);
        return b0E == null ? this.f58053d.e(key) : b0E;
    }

    @Override // pi.E0
    public boolean f() {
        return false;
    }

    @Override // pi.E0
    public S g(S topLevelType, N0 position) {
        AbstractC6492s.i(topLevelType, "topLevelType");
        AbstractC6492s.i(position, "position");
        return this.f58053d.g(this.f58052c.g(topLevelType, position), position);
    }

    private C7336D(E0 e02, E0 e03) {
        this.f58052c = e02;
        this.f58053d = e03;
    }
}

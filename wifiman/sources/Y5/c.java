package Y5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class c {

    public static abstract class a extends c {

        /* renamed from: Y5.c$a$a, reason: collision with other inner class name */
        public static final class C0937a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0937a f24603a = new C0937a();

            private C0937a() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    public static abstract class b extends c {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f24604a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: Y5.c$b$b, reason: collision with other inner class name */
        public static final class C0938b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0938b f24605a = new C0938b();

            private C0938b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a() {
        return this instanceof a.C0937a;
    }

    public final boolean b() {
        return this instanceof b.a;
    }

    public final boolean c(boolean z10) {
        return ((this instanceof b.C0938b) && z10) || ((this instanceof b.a) && !z10);
    }

    public final boolean d() {
        return this instanceof b.C0938b;
    }

    public final boolean e() {
        return false;
    }

    private c() {
    }
}

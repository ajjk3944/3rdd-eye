package Z2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25087a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25088a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: Z2.c$c, reason: collision with other inner class name */
    public static final class C0962c extends c {

        /* renamed from: a, reason: collision with root package name */
        private final float f25089a;

        public C0962c(float f10) {
            super(null);
            this.f25089a = f10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0962c) && Float.compare(this.f25089a, ((C0962c) obj).f25089a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f25089a);
        }

        public String toString() {
            return "Loading(progress=" + this.f25089a + ')';
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}

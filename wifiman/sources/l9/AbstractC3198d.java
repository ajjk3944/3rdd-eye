package L9;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* renamed from: L9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3198d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11401a = 0;

    /* renamed from: L9.d$a */
    public static final class a extends AbstractC3198d {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11402b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final int f11403c = 0;

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -539857954;
        }

        public String toString() {
            return "Back";
        }
    }

    /* renamed from: L9.d$b */
    public static final class b extends AbstractC3198d {

        /* renamed from: b, reason: collision with root package name */
        public static final b f11404b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final int f11405c = 0;

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 445535713;
        }

        public String toString() {
            return "Close";
        }
    }

    /* renamed from: L9.d$c */
    public static abstract class c extends AbstractC3198d {

        /* renamed from: b, reason: collision with root package name */
        public static final int f11406b = 0;

        /* renamed from: L9.d$c$a */
        public static final class a extends c {

            /* renamed from: c, reason: collision with root package name */
            private final InterfaceC6839p f11407c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6839p content) {
                super(null);
                AbstractC6492s.i(content, "content");
                this.f11407c = content;
            }

            public final InterfaceC6839p a() {
                return this.f11407c;
            }
        }

        /* renamed from: L9.d$c$b */
        public static final class b extends c {

            /* renamed from: c, reason: collision with root package name */
            private final s9.d f11408c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f11409d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s9.d text, boolean z10) {
                super(null);
                AbstractC6492s.i(text, "text");
                this.f11408c = text;
                this.f11409d = z10;
            }

            public final boolean a() {
                return this.f11409d;
            }

            public final s9.d b() {
                return this.f11408c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC6492s.d(this.f11408c, bVar.f11408c) && this.f11409d == bVar.f11409d;
            }

            public int hashCode() {
                return (this.f11408c.hashCode() * 31) + Boolean.hashCode(this.f11409d);
            }

            public String toString() {
                return "Text(text=" + this.f11408c + ", enabled=" + this.f11409d + ")";
            }

            public /* synthetic */ b(s9.d dVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(dVar, (i10 & 2) != 0 ? true : z10);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC3198d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3198d() {
    }
}

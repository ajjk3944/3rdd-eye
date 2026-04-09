package z;

import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: z.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8690m {

    /* renamed from: a, reason: collision with root package name */
    public static final b f66926a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8690m f66927b = a.f66930e;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC8690m f66928c = e.f66933e;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC8690m f66929d = c.f66931e;

    /* renamed from: z.m$a */
    private static final class a extends AbstractC8690m {

        /* renamed from: e, reason: collision with root package name */
        public static final a f66930e = new a();

        private a() {
            super(null);
        }

        @Override // z.AbstractC8690m
        public int a(int i10, Y0.t tVar, androidx.compose.ui.layout.t tVar2, int i11) {
            return i10 / 2;
        }
    }

    /* renamed from: z.m$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC8690m a(c.b bVar) {
            return new d(bVar);
        }

        public final AbstractC8690m b(c.InterfaceC1752c interfaceC1752c) {
            return new f(interfaceC1752c);
        }

        private b() {
        }
    }

    /* renamed from: z.m$c */
    private static final class c extends AbstractC8690m {

        /* renamed from: e, reason: collision with root package name */
        public static final c f66931e = new c();

        private c() {
            super(null);
        }

        @Override // z.AbstractC8690m
        public int a(int i10, Y0.t tVar, androidx.compose.ui.layout.t tVar2, int i11) {
            if (tVar == Y0.t.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    /* renamed from: z.m$d */
    private static final class d extends AbstractC8690m {

        /* renamed from: e, reason: collision with root package name */
        private final c.b f66932e;

        public d(c.b bVar) {
            super(null);
            this.f66932e = bVar;
        }

        @Override // z.AbstractC8690m
        public int a(int i10, Y0.t tVar, androidx.compose.ui.layout.t tVar2, int i11) {
            return this.f66932e.a(0, i10, tVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC6492s.d(this.f66932e, ((d) obj).f66932e);
        }

        public int hashCode() {
            return this.f66932e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f66932e + ')';
        }
    }

    /* renamed from: z.m$e */
    private static final class e extends AbstractC8690m {

        /* renamed from: e, reason: collision with root package name */
        public static final e f66933e = new e();

        private e() {
            super(null);
        }

        @Override // z.AbstractC8690m
        public int a(int i10, Y0.t tVar, androidx.compose.ui.layout.t tVar2, int i11) {
            if (tVar == Y0.t.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    /* renamed from: z.m$f */
    private static final class f extends AbstractC8690m {

        /* renamed from: e, reason: collision with root package name */
        private final c.InterfaceC1752c f66934e;

        public f(c.InterfaceC1752c interfaceC1752c) {
            super(null);
            this.f66934e = interfaceC1752c;
        }

        @Override // z.AbstractC8690m
        public int a(int i10, Y0.t tVar, androidx.compose.ui.layout.t tVar2, int i11) {
            return this.f66934e.a(0, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && AbstractC6492s.d(this.f66934e, ((f) obj).f66934e);
        }

        public int hashCode() {
            return this.f66934e.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f66934e + ')';
        }
    }

    public /* synthetic */ AbstractC8690m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int i10, Y0.t tVar, androidx.compose.ui.layout.t tVar2, int i11);

    public Integer b(androidx.compose.ui.layout.t tVar) {
        return null;
    }

    public boolean c() {
        return false;
    }

    private AbstractC8690m() {
    }
}

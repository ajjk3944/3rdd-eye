package c;

import android.content.res.Resources;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: c.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4143L {

    /* renamed from: e, reason: collision with root package name */
    public static final a f33516e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f33517a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33518b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33519c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6835l f33520d;

    /* renamed from: c.L$a */
    public static final class a {

        /* renamed from: c.L$a$a, reason: collision with other inner class name */
        static final class C1167a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C1167a f33521a = new C1167a();

            C1167a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                AbstractC6492s.i(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        /* renamed from: c.L$a$b */
        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f33522a = new b();

            b() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                AbstractC6492s.i(resources, "<anonymous parameter 0>");
                return Boolean.TRUE;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C4143L b(a aVar, int i10, int i11, InterfaceC6835l interfaceC6835l, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                interfaceC6835l = C1167a.f33521a;
            }
            return aVar.a(i10, i11, interfaceC6835l);
        }

        public final C4143L a(int i10, int i11, InterfaceC6835l detectDarkMode) {
            AbstractC6492s.i(detectDarkMode, "detectDarkMode");
            return new C4143L(i10, i11, 0, detectDarkMode, null);
        }

        public final C4143L c(int i10) {
            return new C4143L(i10, i10, 2, b.f33522a, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C4143L(int i10, int i11, int i12, InterfaceC6835l interfaceC6835l, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, interfaceC6835l);
    }

    public final InterfaceC6835l a() {
        return this.f33520d;
    }

    public final int b() {
        return this.f33519c;
    }

    public final int c(boolean z10) {
        return z10 ? this.f33518b : this.f33517a;
    }

    public final int d(boolean z10) {
        if (this.f33519c == 0) {
            return 0;
        }
        return z10 ? this.f33518b : this.f33517a;
    }

    private C4143L(int i10, int i11, int i12, InterfaceC6835l interfaceC6835l) {
        this.f33517a = i10;
        this.f33518b = i11;
        this.f33519c = i12;
        this.f33520d = interfaceC6835l;
    }
}

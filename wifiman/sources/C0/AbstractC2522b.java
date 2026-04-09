package C0;

import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;

/* renamed from: C0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2522b {

    /* renamed from: a, reason: collision with root package name */
    private static final C2533m f2129a = new C2533m(a.f2131a);

    /* renamed from: b, reason: collision with root package name */
    private static final C2533m f2130b = new C2533m(C0078b.f2132a);

    /* renamed from: C0.b$a */
    /* synthetic */ class a extends C6490p implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2131a = new a();

        a() {
            super(2, AbstractC7137b.class, "min", "min(II)I", 1);
        }

        public final Integer a(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* renamed from: C0.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0078b extends C6490p implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0078b f2132a = new C0078b();

        C0078b() {
            super(2, AbstractC7137b.class, "max", "max(II)I", 1);
        }

        public final Integer a(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    public static final C2533m a() {
        return f2129a;
    }

    public static final C2533m b() {
        return f2130b;
    }

    public static final int c(AbstractC2521a abstractC2521a, int i10, int i11) {
        return ((Number) abstractC2521a.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }
}

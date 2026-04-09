package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4043E {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32678b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final C4043E f32679c = new C4043E("visible");

    /* renamed from: d, reason: collision with root package name */
    private static final C4043E f32680d = new C4043E("invisible");

    /* renamed from: e, reason: collision with root package name */
    private static final C4043E f32681e = new C4043E("gone");

    /* renamed from: a, reason: collision with root package name */
    private final String f32682a;

    /* renamed from: b1.E$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4043E a() {
            return C4043E.f32679c;
        }

        private a() {
        }
    }

    public C4043E(String str) {
        this.f32682a = str;
    }

    public final String b() {
        return this.f32682a;
    }
}

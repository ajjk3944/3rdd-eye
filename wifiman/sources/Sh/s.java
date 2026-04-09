package Sh;

import gi.EnumC5923e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20794a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final d f20795b = new d(EnumC5923e.BOOLEAN);

    /* renamed from: c, reason: collision with root package name */
    private static final d f20796c = new d(EnumC5923e.CHAR);

    /* renamed from: d, reason: collision with root package name */
    private static final d f20797d = new d(EnumC5923e.BYTE);

    /* renamed from: e, reason: collision with root package name */
    private static final d f20798e = new d(EnumC5923e.SHORT);

    /* renamed from: f, reason: collision with root package name */
    private static final d f20799f = new d(EnumC5923e.INT);

    /* renamed from: g, reason: collision with root package name */
    private static final d f20800g = new d(EnumC5923e.FLOAT);

    /* renamed from: h, reason: collision with root package name */
    private static final d f20801h = new d(EnumC5923e.LONG);

    /* renamed from: i, reason: collision with root package name */
    private static final d f20802i = new d(EnumC5923e.DOUBLE);

    public static final class a extends s {

        /* renamed from: j, reason: collision with root package name */
        private final s f20803j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s elementType) {
            super(null);
            AbstractC6492s.i(elementType, "elementType");
            this.f20803j = elementType;
        }

        public final s i() {
            return this.f20803j;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return s.f20795b;
        }

        public final d b() {
            return s.f20797d;
        }

        public final d c() {
            return s.f20796c;
        }

        public final d d() {
            return s.f20802i;
        }

        public final d e() {
            return s.f20800g;
        }

        public final d f() {
            return s.f20799f;
        }

        public final d g() {
            return s.f20801h;
        }

        public final d h() {
            return s.f20798e;
        }

        private b() {
        }
    }

    public static final class c extends s {

        /* renamed from: j, reason: collision with root package name */
        private final String f20804j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String internalName) {
            super(null);
            AbstractC6492s.i(internalName, "internalName");
            this.f20804j = internalName;
        }

        public final String i() {
            return this.f20804j;
        }
    }

    public static final class d extends s {

        /* renamed from: j, reason: collision with root package name */
        private final EnumC5923e f20805j;

        public d(EnumC5923e enumC5923e) {
            super(null);
            this.f20805j = enumC5923e;
        }

        public final EnumC5923e i() {
            return this.f20805j;
        }
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return u.f20806a.a(this);
    }

    private s() {
    }
}

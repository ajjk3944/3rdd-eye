package Yg;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class A implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24976b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final byte f24977a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ A(byte b10) {
        this.f24977a = b10;
    }

    public static final /* synthetic */ A a(byte b10) {
        return new A(b10);
    }

    public static byte b(byte b10) {
        return b10;
    }

    public static boolean c(byte b10, Object obj) {
        return (obj instanceof A) && b10 == ((A) obj).h();
    }

    public static int d(byte b10) {
        return Byte.hashCode(b10);
    }

    public static String g(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC6492s.k(h() & 255, ((A) obj).h() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f24977a, obj);
    }

    public final /* synthetic */ byte h() {
        return this.f24977a;
    }

    public int hashCode() {
        return d(this.f24977a);
    }

    public String toString() {
        return g(this.f24977a);
    }
}

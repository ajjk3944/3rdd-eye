package Yg;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class H implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24992b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final short f24993a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ H(short s10) {
        this.f24993a = s10;
    }

    public static final /* synthetic */ H a(short s10) {
        return new H(s10);
    }

    public static short b(short s10) {
        return s10;
    }

    public static boolean c(short s10, Object obj) {
        return (obj instanceof H) && s10 == ((H) obj).h();
    }

    public static int d(short s10) {
        return Short.hashCode(s10);
    }

    public static String g(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC6492s.k(h() & 65535, ((H) obj).h() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f24993a, obj);
    }

    public final /* synthetic */ short h() {
        return this.f24993a;
    }

    public int hashCode() {
        return d(this.f24993a);
    }

    public String toString() {
        return g(this.f24993a);
    }
}

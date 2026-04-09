package Yg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.Counter32;

/* loaded from: classes4.dex */
public final class C implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24981b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f24982a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C(int i10) {
        this.f24982a = i10;
    }

    public static final /* synthetic */ C a(int i10) {
        return new C(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof C) && i10 == ((C) obj).h();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return String.valueOf(i10 & Counter32.MAX_COUNTER32_VALUE);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return L.a(h(), ((C) obj).h());
    }

    public boolean equals(Object obj) {
        return c(this.f24982a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f24982a;
    }

    public int hashCode() {
        return d(this.f24982a);
    }

    public String toString() {
        return g(this.f24982a);
    }
}

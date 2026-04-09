package y0;

/* renamed from: y0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8571K {

    /* renamed from: a, reason: collision with root package name */
    private final int f66232a;

    private /* synthetic */ C8571K(int i10) {
        this.f66232a = i10;
    }

    public static final /* synthetic */ C8571K a(int i10) {
        return new C8571K(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof C8571K) && i10 == ((C8571K) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f66232a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f66232a;
    }

    public int hashCode() {
        return d(this.f66232a);
    }

    public String toString() {
        return e(this.f66232a);
    }
}

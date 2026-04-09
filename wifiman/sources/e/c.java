package E;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final b f3598a = new a();

    public static final class a implements b {
        a() {
        }

        @Override // E.b
        public float a(long j10, Y0.d dVar) {
            return 0.0f;
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final b a(float f10) {
        return new f(f10);
    }

    public static final b b(int i10) {
        return new e(i10);
    }

    public static final b c(float f10) {
        return new d(f10, null);
    }
}

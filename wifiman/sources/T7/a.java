package T7;

import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0782a f21447b = new C0782a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final a f21448c = new a(Build.VERSION.SDK_INT);

    /* renamed from: a, reason: collision with root package name */
    private final int f21449a;

    /* renamed from: T7.a$a, reason: collision with other inner class name */
    public static final class C0782a {
        public /* synthetic */ C0782a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f21448c;
        }

        private C0782a() {
        }
    }

    public a(int i10) {
        this.f21449a = i10;
    }

    public final boolean b(int i10) {
        return this.f21449a >= i10;
    }

    public final boolean c(int i10) {
        return this.f21449a < i10;
    }
}

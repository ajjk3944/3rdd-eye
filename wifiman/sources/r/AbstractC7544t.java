package r;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7544t {

    /* renamed from: a, reason: collision with root package name */
    public static final a f59860a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f59861b = b(5);

    /* renamed from: c, reason: collision with root package name */
    private static final int f59862c = b(4);

    /* renamed from: d, reason: collision with root package name */
    private static final int f59863d = b(0);

    /* renamed from: r.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return AbstractC7544t.f59863d;
        }

        private a() {
        }
    }

    public static int b(int i10) {
        return i10;
    }

    public static final boolean c(int i10, int i11) {
        return i10 == i11;
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "ArcMode(value=" + i10 + ')';
    }
}

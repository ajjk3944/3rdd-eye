package Wa;

import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0883a f23740b = new C0883a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final a f23741c = new a(Build.VERSION.SDK_INT);

    /* renamed from: a, reason: collision with root package name */
    private final int f23742a;

    /* renamed from: Wa.a$a, reason: collision with other inner class name */
    public static final class C0883a {
        public /* synthetic */ C0883a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f23741c;
        }

        private C0883a() {
        }
    }

    public a(int i10) {
        this.f23742a = i10;
    }

    public final boolean b(int i10) {
        return this.f23742a >= i10;
    }
}

package E0;

import kotlin.KotlinNothingValueException;

/* renamed from: E0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2627e implements androidx.compose.ui.focus.k {

    /* renamed from: a, reason: collision with root package name */
    public static final C2627e f3913a = new C2627e();

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f3914b;

    private C2627e() {
    }

    public final boolean a() {
        return f3914b != null;
    }

    public final void b() {
        f3914b = null;
    }

    @Override // androidx.compose.ui.focus.k
    public boolean o() {
        Boolean bool = f3914b;
        if (bool != null) {
            return bool.booleanValue();
        }
        B0.a.c("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.focus.k
    public void w(boolean z10) {
        f3914b = Boolean.valueOf(z10);
    }
}

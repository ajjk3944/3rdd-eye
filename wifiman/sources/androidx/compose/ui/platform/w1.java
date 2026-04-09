package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public interface w1 {
    long a();

    long b();

    long c();

    default float d() {
        return 2.0f;
    }

    default long e() {
        float f10 = 48;
        return Y0.i.b(Y0.h.j(f10), Y0.h.j(f10));
    }

    default float f() {
        return Float.MAX_VALUE;
    }

    float g();

    default float h() {
        return 16.0f;
    }
}

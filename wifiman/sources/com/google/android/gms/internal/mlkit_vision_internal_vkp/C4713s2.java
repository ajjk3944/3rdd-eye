package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4713s2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4702r2 f35724a;

    private C4713s2(EnumC4605i3 enumC4605i3, Object obj, EnumC4605i3 enumC4605i32, Object obj2) {
        this.f35724a = new C4702r2(enumC4605i3, obj, enumC4605i32, obj2);
    }

    static int b(C4702r2 c4702r2, Object obj, Object obj2) {
        return S1.a(c4702r2.f35719a, 1, obj) + S1.a(c4702r2.f35721c, 2, obj2);
    }

    public static C4713s2 d(EnumC4605i3 enumC4605i3, Object obj, EnumC4605i3 enumC4605i32, Object obj2) {
        return new C4713s2(enumC4605i3, obj, enumC4605i32, obj2);
    }

    static void e(I1 i12, C4702r2 c4702r2, Object obj, Object obj2) {
        S1.j(i12, c4702r2.f35719a, 1, obj);
        S1.j(i12, c4702r2.f35721c, 2, obj2);
    }

    public final int a(int i10, Object obj, Object obj2) {
        C4702r2 c4702r2 = this.f35724a;
        int iF = I1.f(i10 << 3);
        int iB = b(c4702r2, obj, obj2);
        return iF + I1.f(iB) + iB;
    }

    final C4702r2 c() {
        return this.f35724a;
    }
}

package ch;

import android.os.Build;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f3941a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3942b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3943c;

    public f() {
        int i10 = Build.VERSION.SDK_INT;
        this.f3941a = i10;
        this.f3942b = i10 >= 36 ? Integer.valueOf(e.a()) : null;
        this.f3943c = true;
    }

    public final boolean a() {
        return this.f3941a >= 23;
    }

    public final boolean b() {
        return this.f3941a >= 24;
    }

    public final boolean c() {
        return this.f3941a >= 26;
    }

    public final boolean d() {
        return this.f3941a >= 28;
    }

    public final boolean e() {
        return this.f3941a >= 29;
    }

    public final boolean f() {
        return this.f3941a >= 30;
    }

    public final boolean g() {
        return this.f3941a >= 31;
    }

    public final boolean h() {
        return this.f3941a >= 33;
    }

    public final boolean i() {
        return this.f3941a >= 34;
    }

    public final boolean j() {
        return this.f3941a >= 35;
    }
}

package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4837o5 {

    /* renamed from: a, reason: collision with root package name */
    public final C4940s5 f41344a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41345b = "[ComponentMigrationToV113]";

    public AbstractC4837o5(C4940s5 c4940s5) {
        this.f41344a = c4940s5;
    }

    public final C4940s5 a() {
        return this.f41344a;
    }

    public final String b() {
        return this.f41345b;
    }

    public abstract boolean b(int i);

    public abstract void c();

    public final void a(int i) {
        if (b(i)) {
            c();
        }
    }
}

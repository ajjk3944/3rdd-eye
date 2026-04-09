package o9;

import kotlin.text.p;

/* renamed from: o9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7111b {

    /* renamed from: a, reason: collision with root package name */
    public static final C7111b f55594a = new C7111b();

    /* renamed from: b, reason: collision with root package name */
    private static final p f55595b = new p("^[0-9]+$");

    /* renamed from: c, reason: collision with root package name */
    private static final p f55596c = new p("^[0-9a-zA-Z-]+$");

    /* renamed from: d, reason: collision with root package name */
    private static final p f55597d = new p("^v?(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:\\.(0|[1-9]\\d*))?(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");

    private C7111b() {
    }

    public final p a() {
        return f55597d;
    }

    public final p b() {
        return f55596c;
    }

    public final p c() {
        return f55595b;
    }
}

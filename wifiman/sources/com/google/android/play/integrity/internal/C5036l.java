package com.google.android.play.integrity.internal;

/* renamed from: com.google.android.play.integrity.internal.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5036l implements InterfaceC5035k {

    /* renamed from: b, reason: collision with root package name */
    private static final C5036l f38147b = new C5036l(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f38148a;

    private C5036l(Object obj) {
        this.f38148a = obj;
    }

    public static InterfaceC5035k b(Object obj) {
        if (obj != null) {
            return new C5036l(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.n
    public final Object a() {
        return this.f38148a;
    }
}

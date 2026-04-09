package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
public enum H {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: id, reason: collision with root package name */
    private final int f38727id;

    H(int i10) {
        this.f38727id = i10;
    }

    public static H determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f38727id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f38727id);
    }
}

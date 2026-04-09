package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class b70 extends RuntimeException {
    public b70(int i) {
        super(a(i));
    }

    private static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}

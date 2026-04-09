package com.mbridge.msdk.foundation.same;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f15052b;

    /* renamed from: a, reason: collision with root package name */
    private Boolean f15053a = null;

    private b() {
    }

    public static b b() {
        if (f15052b == null) {
            synchronized (b.class) {
                try {
                    if (f15052b == null) {
                        f15052b = new b();
                    }
                } finally {
                }
            }
        }
        return f15052b;
    }

    public Boolean a() {
        return this.f15053a;
    }
}

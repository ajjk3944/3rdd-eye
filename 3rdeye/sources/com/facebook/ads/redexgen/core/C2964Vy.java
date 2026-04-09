package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2964Vy {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C2964Vy> A02 = new ThreadLocal<>();
    public final C2947Vh A00 = new C2947Vh();

    public static C2947Vh A00() {
        return A02().A00;
    }

    public static C2947Vh A01(C2963Vx c2963Vx) {
        C2947Vh currentStackTraces = new C2947Vh(A00());
        currentStackTraces.add(c2963Vx);
        return currentStackTraces;
    }

    public static C2964Vy A02() {
        C2964Vy c2964Vy = A02.get();
        if (c2964Vy == null) {
            C2964Vy c2964Vy2 = new C2964Vy();
            A02.set(c2964Vy2);
            return c2964Vy2;
        }
        return c2964Vy;
    }

    public static void A03(AbstractRunnableC2959Vt abstractRunnableC2959Vt) {
        C2947Vh c2947VhA06 = abstractRunnableC2959Vt.A06();
        if (c2947VhA06 != null) {
            C2947Vh createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(c2947VhA06);
        }
    }

    public static void A04(AbstractRunnableC2959Vt abstractRunnableC2959Vt) {
        C2947Vh c2947VhA06 = abstractRunnableC2959Vt.A06();
        if (c2947VhA06 != null) {
            C2947Vh c2947Vh = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c2947Vh.removeAll(c2947VhA06);
        }
    }
}

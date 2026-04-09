package com.wireguard.android.backend;

/* loaded from: classes4.dex */
public interface c {

    public enum a {
        DOWN,
        TOGGLE,
        UP;

        public static a of(boolean z10) {
            return z10 ? UP : DOWN;
        }
    }

    void c(a aVar);

    String getName();
}

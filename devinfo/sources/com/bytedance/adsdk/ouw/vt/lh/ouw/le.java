package com.bytedance.adsdk.ouw.vt.lh.ouw;

import java.util.Deque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class le {
    public static char ouw(int i4, String str) {
        if (i4 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i4);
    }

    public static int vt(int i4, String str) {
        while (ouw(i4, str) == ' ') {
            i4++;
        }
        return i4;
    }

    public abstract int ouw(String str, int i4, Deque<com.bytedance.adsdk.ouw.vt.vt.ouw> deque, com.bytedance.adsdk.ouw.vt.lh.ouw ouwVar);
}

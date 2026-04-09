package com.bytedance.sdk.component.ra.lh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh {
    private ouw ouw;
    private vt vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.ra.lh.lh$lh, reason: collision with other inner class name */
    public static class C0058lh {
        private static final lh ouw = new lh(0);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ouw {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw(String str, String str2);
    }

    public /* synthetic */ lh(byte b10) {
        this();
    }

    public static void ouw(ouw ouwVar) {
        synchronized (lh.class) {
            C0058lh.ouw.ouw = ouwVar;
        }
    }

    private lh() {
        this.ouw = ouw.OFF;
        this.vt = new com.bytedance.sdk.component.ra.lh.vt();
    }

    public static void ouw(String str, String str2) {
        if (C0058lh.ouw.ouw.compareTo(ouw.ERROR) <= 0) {
            C0058lh.ouw.vt.ouw(str, str2);
        }
    }
}

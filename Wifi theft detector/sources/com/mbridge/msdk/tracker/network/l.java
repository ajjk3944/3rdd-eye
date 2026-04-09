package com.mbridge.msdk.tracker.network;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    private static volatile l f18308b;

    /* renamed from: a, reason: collision with root package name */
    private u f18309a;

    private l() {
    }

    public static l a() {
        if (f18308b == null) {
            synchronized (l.class) {
                try {
                    if (f18308b == null) {
                        f18308b = new l();
                    }
                } finally {
                }
            }
        }
        return f18308b;
    }

    public u b() {
        if (this.f18309a == null) {
            u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.f18309a = uVarA;
            uVarA.b();
        }
        return this.f18309a;
    }
}

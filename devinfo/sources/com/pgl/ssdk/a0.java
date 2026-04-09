package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final a3<a1> f21411a;

    /* renamed from: b, reason: collision with root package name */
    private a4 f21412b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a0 f21413a = new a0();
    }

    public static a0 a() {
        return b.f21413a;
    }

    public a4 b() {
        if (this.f21412b == null) {
            synchronized (a0.class) {
                try {
                    if (this.f21412b == null) {
                        this.f21412b = a("ssdk_net_handler");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f21412b;
    }

    public a4 c() {
        if (this.f21412b == null) {
            synchronized (a0.class) {
                try {
                    if (this.f21412b == null) {
                        this.f21412b = a("ssdk_handler");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f21412b;
    }

    private a0() {
        this.f21411a = a3.a(2);
    }

    public a4 a(String str) {
        return b(null, str);
    }

    private a1 a(a4.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a1(handlerThread, aVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public a4 b(a4.a aVar, String str) {
        a1 a1Var = (a1) this.f21411a.a();
        if (a1Var != null) {
            a1Var.a(aVar);
            a1Var.a(str);
            return a1Var;
        }
        return a(aVar, str);
    }
}

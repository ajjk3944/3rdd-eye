package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.b;

/* loaded from: classes3.dex */
public class v<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f18417a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f18418b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f18419c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18420d;

    public interface a {
        void a(b0 b0Var);
    }

    public interface b<T> {
        void a(T t10);
    }

    private v(T t10, b.a aVar) {
        this.f18420d = false;
        this.f18417a = t10;
        this.f18418b = aVar;
        this.f18419c = null;
    }

    public static <T> v<T> a(T t10, b.a aVar) {
        return new v<>(t10, aVar);
    }

    public static <T> v<T> a(b0 b0Var) {
        return new v<>(b0Var);
    }

    public boolean a() {
        return this.f18419c == null;
    }

    private v(b0 b0Var) {
        this.f18420d = false;
        this.f18417a = null;
        this.f18418b = null;
        this.f18419c = b0Var;
    }
}

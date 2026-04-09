package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public abstract class Ld extends AbstractC4717jf implements InterfaceC4930rl {
    public Ld(InterfaceC4481ab interfaceC4481ab, String str) {
        super(interfaceC4481ab, str);
    }

    public final String c(String str, String str2) {
        return this.f41115a.getString(f(str), str2);
    }

    public final InterfaceC4930rl d(String str, String str2) {
        return (InterfaceC4930rl) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.f41115a.a(f(str));
    }

    public abstract String f(String str);

    public InterfaceC4930rl g(String str) {
        return (InterfaceC4930rl) d(f(str));
    }

    public Ld(InterfaceC4481ab interfaceC4481ab) {
        this(interfaceC4481ab, null);
    }

    public final InterfaceC4930rl d(String str, int i) {
        return (InterfaceC4930rl) b(f(str), i);
    }

    public final int c(String str, int i) {
        return this.f41115a.getInt(f(str), i);
    }

    public final InterfaceC4930rl d(String str, long j4) {
        return (InterfaceC4930rl) b(f(str), j4);
    }

    public final InterfaceC4930rl d(String str, boolean z10) {
        return (InterfaceC4930rl) b(f(str), z10);
    }

    public final long c(String str, long j4) {
        return this.f41115a.getLong(f(str), j4);
    }

    public final boolean c(String str, boolean z10) {
        return this.f41115a.getBoolean(f(str), z10);
    }
}

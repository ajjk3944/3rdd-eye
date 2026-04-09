package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4651h0 {

    /* renamed from: a, reason: collision with root package name */
    public Yc f40981a;

    /* renamed from: b, reason: collision with root package name */
    public long f40982b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40983c;

    /* renamed from: d, reason: collision with root package name */
    public final C4853ol f40984d;

    public C4651h0(String str, long j4, C4853ol c4853ol) {
        this.f40982b = j4;
        try {
            this.f40981a = new Yc(str);
        } catch (Throwable unused) {
            this.f40981a = new Yc();
        }
        this.f40984d = c4853ol;
    }

    public final synchronized void a(Pair pair) {
        if (this.f40984d.b(this.f40981a, (String) pair.first, (String) pair.second)) {
            this.f40983c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f40981a.size() + ". Is changed " + this.f40983c + ". Current revision " + this.f40982b;
    }

    public final synchronized C4625g0 a() {
        try {
            if (this.f40983c) {
                this.f40982b++;
                this.f40983c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C4625g0(AbstractC5122zb.b(this.f40981a), this.f40982b);
    }
}

package Gf;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final long f7390a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f7391b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7392c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7393d;

    /* renamed from: e, reason: collision with root package name */
    private final List f7394e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7395f;

    /* renamed from: g, reason: collision with root package name */
    private final s9.d f7396g;

    public /* synthetic */ j(long j10, s9.d dVar, boolean z10, boolean z11, List list, List list2, s9.d dVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar, z10, z11, list, list2, dVar2);
    }

    public final List a() {
        return this.f7394e;
    }

    public final long b() {
        return this.f7390a;
    }

    public final boolean c() {
        return this.f7393d;
    }

    public final List d() {
        return this.f7395f;
    }

    public final boolean e() {
        return this.f7392c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return C6733v0.m(this.f7390a, jVar.f7390a) && AbstractC6492s.d(this.f7391b, jVar.f7391b) && this.f7392c == jVar.f7392c && this.f7393d == jVar.f7393d && AbstractC6492s.d(this.f7394e, jVar.f7394e) && AbstractC6492s.d(this.f7395f, jVar.f7395f) && AbstractC6492s.d(this.f7396g, jVar.f7396g);
    }

    public final s9.d f() {
        return this.f7396g;
    }

    public final s9.d g() {
        return this.f7391b;
    }

    public int hashCode() {
        return (((((((((((C6733v0.s(this.f7390a) * 31) + this.f7391b.hashCode()) * 31) + Boolean.hashCode(this.f7392c)) * 31) + Boolean.hashCode(this.f7393d)) * 31) + this.f7394e.hashCode()) * 31) + this.f7395f.hashCode()) * 31) + this.f7396g.hashCode();
    }

    public String toString() {
        return "Model(dotColor=" + C6733v0.t(this.f7390a) + ", ssid=" + this.f7391b + ", linked=" + this.f7392c + ", hiddenSSID=" + this.f7393d + ", channels=" + this.f7394e + ", labels=" + this.f7395f + ", signal=" + this.f7396g + ")";
    }

    private j(long j10, s9.d ssid, boolean z10, boolean z11, List channels, List labels, s9.d signal) {
        AbstractC6492s.i(ssid, "ssid");
        AbstractC6492s.i(channels, "channels");
        AbstractC6492s.i(labels, "labels");
        AbstractC6492s.i(signal, "signal");
        this.f7390a = j10;
        this.f7391b = ssid;
        this.f7392c = z10;
        this.f7393d = z11;
        this.f7394e = channels;
        this.f7395f = labels;
        this.f7396g = signal;
    }
}

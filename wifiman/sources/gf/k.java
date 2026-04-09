package Gf;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final long f7397a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f7398b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7399c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7400d;

    /* renamed from: e, reason: collision with root package name */
    private final List f7401e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7402f;

    /* renamed from: g, reason: collision with root package name */
    private final s9.d f7403g;

    /* renamed from: h, reason: collision with root package name */
    private final S8.c f7404h;

    public /* synthetic */ k(long j10, s9.d dVar, boolean z10, boolean z11, List list, List list2, s9.d dVar2, S8.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar, z10, z11, list, list2, dVar2, cVar);
    }

    public final List a() {
        return this.f7401e;
    }

    public final long b() {
        return this.f7397a;
    }

    public final List c() {
        return this.f7402f;
    }

    public final boolean d() {
        return this.f7399c;
    }

    public final s9.d e() {
        return this.f7403g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return C6733v0.m(this.f7397a, kVar.f7397a) && AbstractC6492s.d(this.f7398b, kVar.f7398b) && this.f7399c == kVar.f7399c && this.f7400d == kVar.f7400d && AbstractC6492s.d(this.f7401e, kVar.f7401e) && AbstractC6492s.d(this.f7402f, kVar.f7402f) && AbstractC6492s.d(this.f7403g, kVar.f7403g) && this.f7404h == kVar.f7404h;
    }

    public final s9.d f() {
        return this.f7398b;
    }

    public final boolean g() {
        return this.f7400d;
    }

    public int hashCode() {
        int iS = ((((((((((((C6733v0.s(this.f7397a) * 31) + this.f7398b.hashCode()) * 31) + Boolean.hashCode(this.f7399c)) * 31) + Boolean.hashCode(this.f7400d)) * 31) + this.f7401e.hashCode()) * 31) + this.f7402f.hashCode()) * 31) + this.f7403g.hashCode()) * 31;
        S8.c cVar = this.f7404h;
        return iS + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "Model(dotColor=" + C6733v0.t(this.f7397a) + ", ssid=" + this.f7398b + ", linked=" + this.f7399c + ", unknownSSID=" + this.f7400d + ", channels=" + this.f7401e + ", labels=" + this.f7402f + ", signal=" + this.f7403g + ", band=" + this.f7404h + ")";
    }

    private k(long j10, s9.d ssid, boolean z10, boolean z11, List channels, List labels, s9.d signal, S8.c cVar) {
        AbstractC6492s.i(ssid, "ssid");
        AbstractC6492s.i(channels, "channels");
        AbstractC6492s.i(labels, "labels");
        AbstractC6492s.i(signal, "signal");
        this.f7397a = j10;
        this.f7398b = ssid;
        this.f7399c = z10;
        this.f7400d = z11;
        this.f7401e = channels;
        this.f7402f = labels;
        this.f7403g = signal;
        this.f7404h = cVar;
    }
}

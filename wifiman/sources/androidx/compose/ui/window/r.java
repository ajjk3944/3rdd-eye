package androidx.compose.ui.window;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final int f29989a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29990b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29991c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29992d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f29993e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f29994f;

    public r(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f29989a = i10;
        this.f29990b = z10;
        this.f29991c = z11;
        this.f29992d = z12;
        this.f29993e = z13;
        this.f29994f = z14;
    }

    public final boolean a() {
        return this.f29991c;
    }

    public final boolean b() {
        return this.f29992d;
    }

    public final boolean c() {
        return this.f29993e;
    }

    public final int d() {
        return this.f29989a;
    }

    public final boolean e() {
        return this.f29990b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f29989a == rVar.f29989a && this.f29990b == rVar.f29990b && this.f29991c == rVar.f29991c && this.f29992d == rVar.f29992d && this.f29993e == rVar.f29993e && this.f29994f == rVar.f29994f;
    }

    public final boolean f() {
        return this.f29994f;
    }

    public int hashCode() {
        return (((((((((this.f29989a * 31) + Boolean.hashCode(this.f29990b)) * 31) + Boolean.hashCode(this.f29991c)) * 31) + Boolean.hashCode(this.f29992d)) * 31) + Boolean.hashCode(this.f29993e)) * 31) + Boolean.hashCode(this.f29994f);
    }

    public /* synthetic */ r(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13);
    }

    public r(boolean z10, boolean z11, boolean z12, boolean z13) {
        this(z10, z11, z12, s.Inherit, true, z13);
    }

    public /* synthetic */ r(boolean z10, boolean z11, boolean z12, s sVar, boolean z13, boolean z14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? s.Inherit : sVar, (i10 & 16) != 0 ? true : z13, (i10 & 32) == 0 ? z14 : true);
    }

    public r(boolean z10, boolean z11, boolean z12, s sVar, boolean z13, boolean z14) {
        this(z10, z11, z12, sVar, z13, z14, false);
    }

    public r(boolean z10, boolean z11, boolean z12, s sVar, boolean z13, boolean z14, boolean z15) {
        this(b.g(z10, sVar, z14), sVar == s.Inherit, z11, z12, z13, z15);
    }
}

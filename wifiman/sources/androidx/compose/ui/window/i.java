package androidx.compose.ui.window;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f29941a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29942b;

    /* renamed from: c, reason: collision with root package name */
    private final s f29943c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29944d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f29945e;

    public i(boolean z10, boolean z11, s sVar, boolean z12, boolean z13) {
        this.f29941a = z10;
        this.f29942b = z11;
        this.f29943c = sVar;
        this.f29944d = z12;
        this.f29945e = z13;
    }

    public final boolean a() {
        return this.f29945e;
    }

    public final boolean b() {
        return this.f29941a;
    }

    public final boolean c() {
        return this.f29942b;
    }

    public final s d() {
        return this.f29943c;
    }

    public final boolean e() {
        return this.f29944d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f29941a == iVar.f29941a && this.f29942b == iVar.f29942b && this.f29943c == iVar.f29943c && this.f29944d == iVar.f29944d && this.f29945e == iVar.f29945e;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f29941a) * 31) + Boolean.hashCode(this.f29942b)) * 31) + this.f29943c.hashCode()) * 31) + Boolean.hashCode(this.f29944d)) * 31) + Boolean.hashCode(this.f29945e);
    }

    public /* synthetic */ i(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public i(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, s.Inherit, z12, true);
    }
}

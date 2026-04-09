package jf;

/* renamed from: jf.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6320c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f50819a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f50820b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f50821c;

    public C6320c(boolean z10, boolean z11, boolean z12) {
        this.f50819a = z10;
        this.f50820b = z11;
        this.f50821c = z12;
    }

    public final boolean a() {
        return this.f50819a;
    }

    public final boolean b() {
        return this.f50820b;
    }

    public final boolean c() {
        return this.f50821c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6320c)) {
            return false;
        }
        C6320c c6320c = (C6320c) obj;
        return this.f50819a == c6320c.f50819a && this.f50820b == c6320c.f50820b && this.f50821c == c6320c.f50821c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f50819a) * 31) + Boolean.hashCode(this.f50820b)) * 31) + Boolean.hashCode(this.f50821c);
    }

    public String toString() {
        return "ActionsCard(doneVisible=" + this.f50819a + ", reportProblemVisible=" + this.f50820b + ", shareVisible=" + this.f50821c + ")";
    }
}

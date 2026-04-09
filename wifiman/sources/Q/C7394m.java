package q;

import kotlin.jvm.internal.AbstractC6492s;
import r.H;

/* renamed from: q.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7394m {

    /* renamed from: a, reason: collision with root package name */
    private final float f58312a;

    /* renamed from: b, reason: collision with root package name */
    private final H f58313b;

    public C7394m(float f10, H h10) {
        this.f58312a = f10;
        this.f58313b = h10;
    }

    public final float a() {
        return this.f58312a;
    }

    public final H b() {
        return this.f58313b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7394m)) {
            return false;
        }
        C7394m c7394m = (C7394m) obj;
        return Float.compare(this.f58312a, c7394m.f58312a) == 0 && AbstractC6492s.d(this.f58313b, c7394m.f58313b);
    }

    public int hashCode() {
        return (Float.hashCode(this.f58312a) * 31) + this.f58313b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f58312a + ", animationSpec=" + this.f58313b + ')';
    }
}

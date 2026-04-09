package q;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r.H;

/* renamed from: q.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7401t {

    /* renamed from: a, reason: collision with root package name */
    private final float f58321a;

    /* renamed from: b, reason: collision with root package name */
    private final long f58322b;

    /* renamed from: c, reason: collision with root package name */
    private final H f58323c;

    public /* synthetic */ C7401t(float f10, long j10, H h10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, j10, h10);
    }

    public final H a() {
        return this.f58323c;
    }

    public final float b() {
        return this.f58321a;
    }

    public final long c() {
        return this.f58322b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7401t)) {
            return false;
        }
        C7401t c7401t = (C7401t) obj;
        return Float.compare(this.f58321a, c7401t.f58321a) == 0 && androidx.compose.ui.graphics.f.e(this.f58322b, c7401t.f58322b) && AbstractC6492s.d(this.f58323c, c7401t.f58323c);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f58321a) * 31) + androidx.compose.ui.graphics.f.h(this.f58322b)) * 31) + this.f58323c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f58321a + ", transformOrigin=" + ((Object) androidx.compose.ui.graphics.f.i(this.f58322b)) + ", animationSpec=" + this.f58323c + ')';
    }

    private C7401t(float f10, long j10, H h10) {
        this.f58321a = f10;
        this.f58322b = j10;
        this.f58323c = h10;
    }
}

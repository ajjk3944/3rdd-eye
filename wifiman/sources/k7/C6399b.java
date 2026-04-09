package k7;

import android.graphics.PointF;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6399b {

    /* renamed from: a, reason: collision with root package name */
    private final String f51254a;

    /* renamed from: b, reason: collision with root package name */
    private final float f51255b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f51256c;

    public C6399b(String id2, float f10, PointF coordinates) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(coordinates, "coordinates");
        this.f51254a = id2;
        this.f51255b = f10;
        this.f51256c = coordinates;
    }

    public final float a() {
        return this.f51255b;
    }

    public final PointF b() {
        return this.f51256c;
    }

    public final String c() {
        return this.f51254a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6399b)) {
            return false;
        }
        C6399b c6399b = (C6399b) obj;
        return AbstractC6492s.d(this.f51254a, c6399b.f51254a) && Float.compare(this.f51255b, c6399b.f51255b) == 0 && AbstractC6492s.d(this.f51256c, c6399b.f51256c);
    }

    public int hashCode() {
        return (((this.f51254a.hashCode() * 31) + Float.hashCode(this.f51255b)) * 31) + this.f51256c.hashCode();
    }

    public String toString() {
        return "Result(id=" + this.f51254a + ", confidence=" + this.f51255b + ", coordinates=" + this.f51256c + ")";
    }
}

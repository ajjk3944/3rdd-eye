package r1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f21182a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21183b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21184c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21185d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21186e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21187f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21188g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21189h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f21190i;
    public final long j;
    public final long k;

    public l(long j, long j7, long j10, long j11, boolean z10, float f10, int i10, boolean z11, ArrayList arrayList, long j12, long j13) {
        this.f21182a = j;
        this.f21183b = j7;
        this.f21184c = j10;
        this.f21185d = j11;
        this.f21186e = z10;
        this.f21187f = f10;
        this.f21188g = i10;
        this.f21189h = z11;
        this.f21190i = arrayList;
        this.j = j12;
        this.k = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return i3.g.k(this.f21182a, lVar.f21182a) && this.f21183b == lVar.f21183b && f1.b.a(this.f21184c, lVar.f21184c) && f1.b.a(this.f21185d, lVar.f21185d) && this.f21186e == lVar.f21186e && Float.compare(this.f21187f, lVar.f21187f) == 0 && this.f21188g == lVar.f21188g && this.f21189h == lVar.f21189h && this.f21190i.equals(lVar.f21190i) && f1.b.a(this.j, lVar.j) && f1.b.a(this.k, lVar.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + h0.b.b((this.f21190i.hashCode() + w.g.b(c7.a.C(this.f21188g, w.g.a(w.g.b(h0.b.b(h0.b.b(h0.b.b(Long.hashCode(this.f21182a) * 31, 31, this.f21183b), 31, this.f21184c), 31, this.f21185d), this.f21186e, 31), this.f21187f, 31), 31), this.f21189h, 31)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) ("PointerId(value=" + this.f21182a + ')'));
        sb2.append(", uptime=");
        sb2.append(this.f21183b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) f1.b.f(this.f21184c));
        sb2.append(", position=");
        sb2.append((Object) f1.b.f(this.f21185d));
        sb2.append(", down=");
        sb2.append(this.f21186e);
        sb2.append(", pressure=");
        sb2.append(this.f21187f);
        sb2.append(", type=");
        int i10 = this.f21188g;
        sb2.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", activeHover=");
        sb2.append(this.f21189h);
        sb2.append(", historical=");
        sb2.append(this.f21190i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) f1.b.f(this.j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) f1.b.f(this.k));
        sb2.append(')');
        return sb2.toString();
    }
}

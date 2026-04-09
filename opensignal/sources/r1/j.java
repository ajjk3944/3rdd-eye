package r1;

import java.util.ArrayList;
import mq.w;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f21166a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21167b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21168c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21169d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21170e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21171f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21172g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21173h;

    /* renamed from: i, reason: collision with root package name */
    public final int f21174i;
    public final long j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final long f21175l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21176m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21177n = false;

    /* renamed from: o, reason: collision with root package name */
    public j f21178o;

    public j(long j, long j7, long j10, boolean z10, float f10, long j11, long j12, boolean z11, int i10, ArrayList arrayList, long j13, long j14) {
        this.f21166a = j;
        this.f21167b = j7;
        this.f21168c = j10;
        this.f21169d = z10;
        this.f21170e = f10;
        this.f21171f = j11;
        this.f21172g = j12;
        this.f21173h = z11;
        this.f21174i = i10;
        this.j = j13;
        this.f21175l = 0L;
        this.k = arrayList;
        this.f21175l = j14;
    }

    public final void a() {
        j jVar = this.f21178o;
        if (jVar == null) {
            this.f21176m = true;
            this.f21177n = true;
        } else if (jVar != null) {
            jVar.a();
        }
    }

    public final boolean b() {
        j jVar = this.f21178o;
        return jVar != null ? jVar.b() : this.f21176m || this.f21177n;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) ("PointerId(value=" + this.f21166a + ')'));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f21167b);
        sb2.append(", position=");
        sb2.append((Object) f1.b.f(this.f21168c));
        sb2.append(", pressed=");
        sb2.append(this.f21169d);
        sb2.append(", pressure=");
        sb2.append(this.f21170e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f21171f);
        sb2.append(", previousPosition=");
        sb2.append((Object) f1.b.f(this.f21172g));
        sb2.append(", previousPressed=");
        sb2.append(this.f21173h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        int i10 = this.f21174i;
        sb2.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", historical=");
        Object obj = this.k;
        if (obj == null) {
            obj = w.f16945a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) f1.b.f(this.j));
        sb2.append(')');
        return sb2.toString();
    }
}

package t9;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24477a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24478b;

    public /* synthetic */ l(Object obj, long j10, kotlin.jvm.internal.i iVar) {
        this(obj, j10);
    }

    public final Object a() {
        return this.f24477a;
    }

    public final long b() {
        return this.f24478b;
    }

    public final Object c() {
        return this.f24477a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p.a(this.f24477a, lVar.f24477a) && b.l(this.f24478b, lVar.f24478b);
    }

    public int hashCode() {
        Object obj = this.f24477a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + b.y(this.f24478b);
    }

    public String toString() {
        return "TimedValue(value=" + this.f24477a + ", duration=" + ((Object) b.J(this.f24478b)) + ')';
    }

    public l(Object obj, long j10) {
        this.f24477a = obj;
        this.f24478b = j10;
    }
}

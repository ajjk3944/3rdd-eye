package Li;

import dh.InterfaceC5380e;

/* loaded from: classes4.dex */
public final class G extends Mi.c {

    /* renamed from: a, reason: collision with root package name */
    public long f11854a = -1;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC5380e f11855b;

    @Override // Mi.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(E e10) {
        if (this.f11854a >= 0) {
            return false;
        }
        this.f11854a = e10.Z();
        return true;
    }

    @Override // Mi.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC5380e[] b(E e10) {
        long j10 = this.f11854a;
        this.f11854a = -1L;
        this.f11855b = null;
        return e10.Y(j10);
    }
}

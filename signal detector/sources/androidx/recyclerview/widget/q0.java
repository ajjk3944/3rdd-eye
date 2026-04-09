package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5589a;

    /* renamed from: b, reason: collision with root package name */
    public int f5590b;

    /* renamed from: c, reason: collision with root package name */
    public int f5591c;

    /* renamed from: d, reason: collision with root package name */
    public int f5592d;

    /* renamed from: e, reason: collision with root package name */
    public int f5593e;

    public final boolean a() {
        int i = this.f5589a;
        int i3 = 2;
        if ((i & 7) != 0) {
            int i6 = this.f5592d;
            int i7 = this.f5590b;
            if (((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i8 = this.f5592d;
            int i9 = this.f5591c;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i10 = this.f5593e;
            int i11 = this.f5590b;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i12 = this.f5593e;
            int i13 = this.f5591c;
            if (i12 > i13) {
                i3 = 1;
            } else if (i12 != i13) {
                i3 = 4;
            }
            if ((i & (i3 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}

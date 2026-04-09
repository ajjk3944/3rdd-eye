package ba;

/* compiled from: Settings.kt */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int f18260a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18261b = new int[10];

    public final int a() {
        if ((this.f18260a & 128) != 0) {
            return this.f18261b[7];
        }
        return 65535;
    }

    public final void b(t other) {
        kotlin.jvm.internal.l.f(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.f18260a) != 0) {
                c(i, other.f18261b[i]);
            }
        }
    }

    public final void c(int i, int i10) {
        if (i >= 0) {
            int[] iArr = this.f18261b;
            if (i >= iArr.length) {
                return;
            }
            this.f18260a = (1 << i) | this.f18260a;
            iArr[i] = i10;
        }
    }
}

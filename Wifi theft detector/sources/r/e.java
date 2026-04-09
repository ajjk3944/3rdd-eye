package r;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int[] f24110a;

    /* renamed from: b, reason: collision with root package name */
    public int f24111b;

    /* renamed from: c, reason: collision with root package name */
    public int f24112c;

    /* renamed from: d, reason: collision with root package name */
    public int f24113d;

    public e() {
        this(0, 1, null);
    }

    public final void a(int i10) {
        int[] iArr = this.f24110a;
        int i11 = this.f24112c;
        iArr[i11] = i10;
        int i12 = this.f24113d & (i11 + 1);
        this.f24112c = i12;
        if (i12 == this.f24111b) {
            c();
        }
    }

    public final void b() {
        this.f24112c = this.f24111b;
    }

    public final void c() {
        int[] iArr = this.f24110a;
        int length = iArr.length;
        int i10 = this.f24111b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        z8.m.e(iArr, iArr2, 0, i10, length);
        z8.m.e(this.f24110a, iArr2, i11, 0, this.f24111b);
        this.f24110a = iArr2;
        this.f24111b = 0;
        this.f24112c = length;
        this.f24113d = i12 - 1;
    }

    public final boolean d() {
        return this.f24111b == this.f24112c;
    }

    public final int e() {
        int i10 = this.f24111b;
        if (i10 == this.f24112c) {
            f fVar = f.f24114a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f24110a[i10];
        this.f24111b = (i10 + 1) & this.f24113d;
        return i11;
    }

    public e(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f24113d = i10 - 1;
        this.f24110a = new int[i10];
    }

    public /* synthetic */ e(int i10, int i11, kotlin.jvm.internal.i iVar) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}

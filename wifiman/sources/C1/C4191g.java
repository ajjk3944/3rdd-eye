package c1;

/* renamed from: c1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4191g implements InterfaceC4190f {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f33689a;

    /* renamed from: b, reason: collision with root package name */
    private int f33690b;

    C4191g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f33689a = new Object[i10];
    }

    @Override // c1.InterfaceC4190f
    public boolean a(Object obj) {
        int i10 = this.f33690b;
        Object[] objArr = this.f33689a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f33690b = i10 + 1;
        return true;
    }

    @Override // c1.InterfaceC4190f
    public Object b() {
        int i10 = this.f33690b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f33689a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f33690b = i10 - 1;
        return obj;
    }

    @Override // c1.InterfaceC4190f
    public void c(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f33690b;
            Object[] objArr2 = this.f33689a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f33690b = i12 + 1;
            }
        }
    }
}
